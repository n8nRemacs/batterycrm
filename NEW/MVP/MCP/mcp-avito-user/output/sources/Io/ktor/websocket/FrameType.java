package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FrameType.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/FrameType;", "", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FrameType {
    f401419g("TEXT", false),
    f401420h("BINARY", false),
    f401421i("CLOSE", true),
    f401422j("PING", true),
    f401423k("PONG", true);


    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f401416d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f401417e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final FrameType[] f401418f;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401426c;

    /* compiled from: FrameType.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/websocket/FrameType$a;", "", "<init>", "()V", "", "Lio/ktor/websocket/FrameType;", "byOpcodeArray", "[Lio/ktor/websocket/FrameType;", "", "maxOpcode", "I", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        FrameType frameType;
        FrameType[] frameTypeArrValues = values();
        if (frameTypeArrValues.length == 0) {
            frameType = null;
        } else {
            frameType = frameTypeArrValues[0];
            int length = frameTypeArrValues.length - 1;
            if (length != 0) {
                int i12 = frameType.f401426c;
                kotlin.ranges.k it = new kotlin.ranges.l(1, length, 1).iterator();
                while (it.f406910d) {
                    FrameType frameType2 = frameTypeArrValues[it.a()];
                    int i13 = frameType2.f401426c;
                    if (i12 < i13) {
                        frameType = frameType2;
                        i12 = i13;
                    }
                }
            }
        }
        int i14 = frameType.f401426c;
        f401417e = i14;
        int i15 = i14 + 1;
        FrameType[] frameTypeArr = new FrameType[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            FrameType[] frameTypeArrValues2 = values();
            int length2 = frameTypeArrValues2.length;
            FrameType frameType3 = null;
            int i17 = 0;
            boolean z12 = false;
            while (true) {
                if (i17 >= length2) {
                    if (!z12) {
                        break;
                    }
                } else {
                    FrameType frameType4 = frameTypeArrValues2[i17];
                    if (frameType4.f401426c == i16) {
                        if (z12) {
                            break;
                        }
                        z12 = true;
                        frameType3 = frameType4;
                    }
                    i17++;
                }
            }
            frameType3 = null;
            frameTypeArr[i16] = frameType3;
        }
        f401418f = frameTypeArr;
    }

    FrameType(String str, boolean z12) {
        this.f401425b = z12;
        this.f401426c = i;
    }
}
