package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReadWriteBufferState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/internal/j;", "", "a", "b", "c", "d", "e", "f", "g", "Lio/ktor/utils/io/internal/j$a;", "Lio/ktor/utils/io/internal/j$b;", "Lio/ktor/utils/io/internal/j$c;", "Lio/ktor/utils/io/internal/j$d;", "Lio/ktor/utils/io/internal/j$e;", "Lio/ktor/utils/io/internal/j$f;", "Lio/ktor/utils/io/internal/j$g;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final ByteBuffer f401039a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final l f401040b;

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/internal/j$a;", "Lio/ktor/utils/io/internal/j;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f401041c = new a();

        public a() {
            super(k.f401053a, k.f401054b, null);
        }

        @Y61.k
        public final String toString() {
            return "IDLE(empty)";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/j$b;", "Lio/ktor/utils/io/internal/j;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final c f401042c;

        public b(@Y61.k c cVar) {
            super(cVar.f401039a, cVar.f401040b, null);
            this.f401042c = cVar;
        }

        @Override // io.ktor.utils.io.internal.j
        public final boolean a() {
            return true;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j d() {
            return this.f401042c.f401046f;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j e() {
            return this.f401042c.f401047g;
        }

        @Y61.k
        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/j$c;", "Lio/ktor/utils/io/internal/j;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ByteBuffer f401043c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ByteBuffer f401044d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final b f401045e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final d f401046f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final g f401047g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final e f401048h;

        public /* synthetic */ c(ByteBuffer byteBuffer, int i12, int i13, C42822w c42822w) {
            this(byteBuffer, (i13 & 2) != 0 ? 8 : i12);
        }

        @Override // io.ktor.utils.io.internal.j
        public final boolean a() {
            throw new IllegalStateException("Not available for initial state");
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final ByteBuffer getF401044d() {
            return this.f401044d;
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final ByteBuffer getF401043c() {
            return this.f401043c;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j d() {
            return this.f401046f;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j e() {
            return this.f401047g;
        }

        @Y61.k
        public final String toString() {
            return "Initial";
        }

        public c(@Y61.k ByteBuffer byteBuffer, int i12) {
            super(byteBuffer, new l(byteBuffer.capacity() - i12), null);
            if (byteBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (byteBuffer.limit() != byteBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.f401043c = byteBuffer.duplicate();
            this.f401044d = byteBuffer.duplicate();
            this.f401045e = new b(this);
            this.f401046f = new d(this);
            this.f401047g = new g(this);
            this.f401048h = new e(this);
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/j$d;", "Lio/ktor/utils/io/internal/j;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final c f401049c;

        public d(@Y61.k c cVar) {
            super(cVar.f401039a, cVar.f401040b, null);
            this.f401049c = cVar;
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: b */
        public final ByteBuffer getF401044d() {
            return this.f401049c.f401044d;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j e() {
            return this.f401049c.f401048h;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j f() {
            return this.f401049c.f401045e;
        }

        @Y61.k
        public final String toString() {
            return "Reading";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/j$e;", "Lio/ktor/utils/io/internal/j;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final c f401050c;

        public e(@Y61.k c cVar) {
            super(cVar.f401039a, cVar.f401040b, null);
            this.f401050c = cVar;
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: b */
        public final ByteBuffer getF401044d() {
            return this.f401050c.f401044d;
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: c */
        public final ByteBuffer getF401043c() {
            return this.f401050c.f401043c;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j f() {
            return this.f401050c.f401047g;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j g() {
            return this.f401050c.f401046f;
        }

        @Y61.k
        public final String toString() {
            return "Reading+Writing";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/internal/j$f;", "Lio/ktor/utils/io/internal/j;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final f f401051c = new f();

        public f() {
            super(k.f401053a, k.f401054b, null);
        }

        @Y61.k
        public final String toString() {
            return "Terminated";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/j$g;", "Lio/ktor/utils/io/internal/j;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends j {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final c f401052c;

        public g(@Y61.k c cVar) {
            super(cVar.f401039a, cVar.f401040b, null);
            this.f401052c = cVar;
        }

        @Override // io.ktor.utils.io.internal.j
        @Y61.k
        /* renamed from: c */
        public final ByteBuffer getF401043c() {
            return this.f401052c.f401043c;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j d() {
            return this.f401052c.f401048h;
        }

        @Override // io.ktor.utils.io.internal.j
        public final j g() {
            return this.f401052c.f401045e;
        }

        @Y61.k
        public final String toString() {
            return "Writing";
        }
    }

    public j(ByteBuffer byteBuffer, l lVar, C42822w c42822w) {
        this.f401039a = byteBuffer;
        this.f401040b = lVar;
    }

    public boolean a() {
        return this instanceof a;
    }

    @Y61.k
    /* renamed from: b */
    public ByteBuffer getF401044d() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    @Y61.k
    /* renamed from: c */
    public ByteBuffer getF401043c() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    @Y61.k
    public j d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    @Y61.k
    public j e() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    @Y61.k
    public j f() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    @Y61.k
    public j g() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
