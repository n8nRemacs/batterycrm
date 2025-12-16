package io.ktor.websocket;

import io.ktor.utils.io.core.C41640m;
import io.ktor.websocket.FrameType;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: Frame.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lio/ktor/websocket/i;", "", "a", "b", "c", "d", "e", "f", "Lio/ktor/websocket/i$a;", "Lio/ktor/websocket/i$b;", "Lio/ktor/websocket/i$d;", "Lio/ktor/websocket/i$e;", "Lio/ktor/websocket/i$f;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41723i {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final c f401555i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final byte[] f401556j = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f401557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FrameType f401558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final byte[] f401559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43268o0 f401560d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f401561e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f401562f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f401563g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f401564h;

    /* compiled from: Frame.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/i$a;", "Lio/ktor/websocket/i;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$a */
    public static final class a extends AbstractC41723i {
        public /* synthetic */ a(boolean z12, byte[] bArr, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
            this(z12, bArr, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15);
        }

        public a(boolean z12, @Y61.k byte[] bArr, boolean z13, boolean z14, boolean z15) {
            super(z12, FrameType.f401420h, bArr, C41725k.f401565b, z13, z14, z15, null);
        }
    }

    /* compiled from: Frame.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/i$b;", "Lio/ktor/websocket/i;", "<init>", "()V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$b */
    public static final class b extends AbstractC41723i {
        public b(@Y61.k byte[] bArr) {
            super(true, FrameType.f401421i, bArr, C41725k.f401565b, false, false, false, null);
        }

        public b() {
            this(AbstractC41723i.f401556j);
        }

        public b(@Y61.k CloseReason closeReason) {
            C41640m c41640m = new C41640m(null, 1, null);
            try {
                io.ktor.utils.io.core.I.a(c41640m, closeReason.f401388a);
                io.ktor.utils.io.core.S.d(c41640m, closeReason.f401389b);
                this(io.ktor.utils.io.core.S.b(c41640m.y()));
            } catch (Throwable th2) {
                c41640m.close();
                throw th2;
            }
        }
    }

    /* compiled from: Frame.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/i$c;", "", "<init>", "()V", "", "Empty", "[B", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$c */
    public static final class c {

        /* compiled from: Frame.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.websocket.i$c$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[FrameType.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    FrameType.a aVar = FrameType.f401416d;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    FrameType.a aVar2 = FrameType.f401416d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    FrameType.a aVar3 = FrameType.f401416d;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    FrameType.a aVar4 = FrameType.f401416d;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AbstractC41723i a(boolean z12, @Y61.k FrameType frameType, @Y61.k byte[] bArr, boolean z13, boolean z14, boolean z15) {
            AbstractC41723i fVar;
            int iOrdinal = frameType.ordinal();
            if (iOrdinal == 0) {
                fVar = new f(z12, bArr, z13, z14, z15);
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return new b(bArr);
                    }
                    if (iOrdinal == 3) {
                        return new d(bArr);
                    }
                    if (iOrdinal == 4) {
                        return new e(bArr, C41725k.f401565b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                fVar = new a(z12, bArr, z13, z14, z15);
            }
            return fVar;
        }

        public c() {
        }
    }

    /* compiled from: Frame.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/i$d;", "Lio/ktor/websocket/i;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$d */
    public static final class d extends AbstractC41723i {
        public d(@Y61.k byte[] bArr) {
            super(true, FrameType.f401422j, bArr, C41725k.f401565b, false, false, false, null);
        }
    }

    /* compiled from: Frame.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/i$f;", "Lio/ktor/websocket/i;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$f */
    public static final class f extends AbstractC41723i {
        public /* synthetic */ f(boolean z12, byte[] bArr, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
            this(z12, bArr, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15);
        }

        public f(boolean z12, @Y61.k byte[] bArr, boolean z13, boolean z14, boolean z15) {
            super(z12, FrameType.f401419g, bArr, C41725k.f401565b, z13, z14, z15, null);
        }
    }

    public AbstractC41723i(boolean z12, FrameType frameType, byte[] bArr, InterfaceC43268o0 interfaceC43268o0, boolean z13, boolean z14, boolean z15, C42822w c42822w) {
        this.f401557a = z12;
        this.f401558b = frameType;
        this.f401559c = bArr;
        this.f401560d = interfaceC43268o0;
        this.f401561e = z13;
        this.f401562f = z14;
        this.f401563g = z15;
        this.f401564h = ByteBuffer.wrap(bArr);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame ");
        sb2.append(this.f401558b);
        sb2.append(" (fin=");
        sb2.append(this.f401557a);
        sb2.append(", buffer len = ");
        return androidx.appcompat.app.r.t(sb2, this.f401559c.length, ')');
    }

    /* compiled from: Frame.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/i$e;", "Lio/ktor/websocket/i;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.i$e */
    public static final class e extends AbstractC41723i {
        public /* synthetic */ e(byte[] bArr, InterfaceC43268o0 interfaceC43268o0, int i12, C42822w c42822w) {
            this(bArr, (i12 & 2) != 0 ? C41725k.f401565b : interfaceC43268o0);
        }

        public e(@Y61.k byte[] bArr, @Y61.k InterfaceC43268o0 interfaceC43268o0) {
            super(true, FrameType.f401423k, bArr, interfaceC43268o0, false, false, false, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(ByteBuffer byteBuffer, InterfaceC43268o0 interfaceC43268o0, int i12, C42822w c42822w) {
            interfaceC43268o0 = (i12 & 2) != 0 ? C41725k.f401565b : interfaceC43268o0;
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            this(bArr, interfaceC43268o0);
        }
    }

    public /* synthetic */ AbstractC41723i(boolean z12, FrameType frameType, byte[] bArr, InterfaceC43268o0 interfaceC43268o0, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(z12, frameType, bArr, (i12 & 8) != 0 ? C41725k.f401565b : interfaceC43268o0, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? false : z14, (i12 & 64) != 0 ? false : z15, null);
    }
}
