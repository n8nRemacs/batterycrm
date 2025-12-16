package io.ktor.websocket;

import io.ktor.websocket.FrameType;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FrameParser.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/websocket/FrameParser;", "", "<init>", "()V", "State", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrameParser {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<State> f401399a = new AtomicReference<>(State.f401410b);

    /* renamed from: b, reason: collision with root package name */
    public boolean f401400b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f401401c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f401402d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f401403e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f401404f;

    /* renamed from: g, reason: collision with root package name */
    public int f401405g;

    /* renamed from: h, reason: collision with root package name */
    public int f401406h;

    /* renamed from: i, reason: collision with root package name */
    public int f401407i;

    /* renamed from: j, reason: collision with root package name */
    public long f401408j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Integer f401409k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FrameParser.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", "", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f401410b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f401411c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f401412d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f401413e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f401414f;

        static {
            State state = new State("HEADER0", 0);
            f401410b = state;
            State state2 = new State("LENGTH", 1);
            f401411c = state2;
            State state3 = new State("MASK_KEY", 2);
            f401412d = state3;
            State state4 = new State("BODY", 3);
            f401413e = state4;
            f401414f = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f401414f.clone();
        }
    }

    /* compiled from: FrameParser.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Y61.k
    public final FrameType a() {
        FrameType.a aVar = FrameType.f401416d;
        int i12 = this.f401405g;
        aVar.getClass();
        FrameType frameType = (i12 < 0 || i12 > FrameType.f401417e) ? null : FrameType.f401418f[i12];
        if (frameType != null) {
            return frameType;
        }
        throw new IllegalStateException(androidx.appcompat.app.r.m(this.f401405g, new StringBuilder("Unsupported opcode ")));
    }
}
