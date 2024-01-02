package io.typecraft.command;

import io.typecraft.command.algebra.Tuple2;
import lombok.Data;

import java.util.List;
import java.util.Optional;

public interface CommandTabResult<A> {
    @Data
    class Suggestions<A> implements CommandTabResult<A> {
        private final List<Tuple2<String, Optional<Command<A>>>> suggestions;
    }

    @Data
    class Present<A> implements CommandTabResult<A> {
        private final String[] arguments;
        private final A command;
    }
}
