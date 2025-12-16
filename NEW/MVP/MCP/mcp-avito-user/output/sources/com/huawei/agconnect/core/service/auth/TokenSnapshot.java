package com.huawei.agconnect.core.service.auth;

/* loaded from: classes7.dex */
public interface TokenSnapshot {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f363167b = {new State("SIGNED_IN", 0), new State("TOKEN_UPDATED", 1), new State("TOKEN_INVALID", 2), new State("SIGNED_OUT", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        State EF5;

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f363167b.clone();
        }
    }
}
