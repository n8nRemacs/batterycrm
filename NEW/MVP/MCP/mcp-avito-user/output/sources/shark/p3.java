package shark;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import okio.C44802l;
import okio.InterfaceC44804n;

/* compiled from: ThrowingCancelableFileSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/p3;", "Lshark/u1;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class p3 implements InterfaceC48348u1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f438670a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f438671b;

    /* compiled from: ThrowingCancelableFileSourceProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/p3$a", "Lshark/d3;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a implements d3 {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FileChannel f438673c;

        public a(FileChannel fileChannel) {
            this.f438673c = fileChannel;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f438673c.close();
            } catch (Throwable th2) {
                j3.f438639b.getClass();
                leakcanary.u uVar = j3.f438638a;
                if (uVar != null) {
                    uVar.b("Failed to close file, ignoring", th2);
                }
            }
        }

        @Override // shark.d3
        public final long i4(long j12, @Y61.k C44802l c44802l, long j13) {
            p3.this.f438671b.run();
            return this.f438673c.transferTo(j12, j13, c44802l);
        }
    }

    /* compiled from: ThrowingCancelableFileSourceProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/p3$b", "Lokio/e0;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class b implements okio.e0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ okio.e0 f438674b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ okio.e0 f438676d;

        public b(okio.e0 e0Var) {
            this.f438676d = e0Var;
            this.f438674b = e0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f438674b.close();
        }

        @Override // okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) {
            p3.this.f438671b.run();
            return this.f438676d.read(c44802l, j12);
        }

        @Override // okio.e0
        /* renamed from: timeout */
        public final okio.i0 getF420025c() {
            return this.f438674b.getF420025c();
        }
    }

    public p3(@Y61.k File file, @Y61.k Runnable runnable) {
        this.f438670a = file;
        this.f438671b = runnable;
    }

    @Override // shark.f3
    @Y61.k
    public final d3 a() {
        return new a(new FileInputStream(this.f438670a).getChannel());
    }

    @Override // shark.o3
    @Y61.k
    public final InterfaceC44804n b() {
        return new okio.Y(new b(okio.M.g(new FileInputStream(this.f438670a))));
    }
}
