package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandRequest.class)
@JsonDeserialize(as = ImmutableApplicationCommandRequest.class)
public interface ApplicationCommandRequest {

    static ImmutableApplicationCommandRequest.Builder builder() {
        return ImmutableApplicationCommandRequest.builder();
    }

    /**
     * 3-32 character command name
     */
    String name();

    /**
     * 1-100 character description
     */
    String description();

    /**
     * the parameters for the command
     */
    Possible<List<ApplicationCommandOptionData>> options();
}
