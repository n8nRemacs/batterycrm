package shark;

import java.io.IOException;
import kotlin.Metadata;
import okio.C44802l;
import okio.InterfaceC44804n;

/* compiled from: ByteArraySourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/r1;", "Lshark/u1;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48336r1 implements InterfaceC48348u1 {

    /* compiled from: ByteArraySourceProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/r1$a", "Lshark/d3;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.r1$a */
    public static final class a implements d3 {

        /* renamed from: b, reason: collision with root package name */
        public boolean f438692b;

        public a() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f438692b = true;
        }

        @Override // shark.d3
        public final long i4(long j12, @Y61.k C44802l c44802l, long j13) throws IOException {
            if (this.f438692b) {
                throw new IOException("Source closed");
            }
            C48336r1.this.getClass();
            throw null;
        }
    }

    @Override // shark.f3
    @Y61.k
    public final d3 a() {
        return new a();
    }

    @Override // shark.o3
    @Y61.k
    public final InterfaceC44804n b() {
        new C44802l().m268write((byte[]) null);
        throw null;
    }
}
