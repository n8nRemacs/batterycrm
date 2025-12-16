package com.google.common.util.concurrent;

@InterfaceC37531b0
@XY0.d
@aZ0.f
@XY0.c
/* loaded from: classes6.dex */
public interface Service {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f360541b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f360542c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f360543d;

        static {
            State state = new State("NEW", 0);
            f360541b = state;
            State state2 = new State("STARTING", 1);
            State state3 = new State("RUNNING", 2);
            State state4 = new State("STOPPING", 3);
            State state5 = new State("TERMINATED", 4);
            State state6 = new State("FAILED", 5);
            f360542c = state6;
            f360543d = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f360543d.clone();
        }
    }

    public static abstract class a {
    }
}
