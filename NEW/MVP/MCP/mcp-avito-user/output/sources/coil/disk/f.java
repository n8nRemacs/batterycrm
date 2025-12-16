package coil.disk;

import Y61.k;
import Y61.l;
import coil.disk.a;
import coil.disk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okio.AbstractC44811v;
import okio.C44805o;
import okio.I;
import okio.S;

/* compiled from: RealDiskCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/disk/f;", "Lcoil/disk/a;", "a", "b", "c", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements coil.disk.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final I f58357a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final coil.disk.b f58358b;

    /* compiled from: RealDiskCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcoil/disk/f$a;", "", "<init>", "()V", "", "ENTRY_DATA", "I", "ENTRY_METADATA", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealDiskCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/f$b;", "Lcoil/disk/a$b;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.C2071b f58359a;

        public b(@k b.C2071b c2071b) {
            this.f58359a = c2071b;
        }

        @Override // coil.disk.a.b
        public final a.c a() {
            b.d dVarC;
            b.C2071b c2071b = this.f58359a;
            coil.disk.b bVar = coil.disk.b.this;
            synchronized (bVar) {
                c2071b.a(true);
                dVarC = bVar.c(c2071b.f58337a.f58341a);
            }
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // coil.disk.a.b
        public final void abort() {
            this.f58359a.a(false);
        }

        @Override // coil.disk.a.b
        @k
        public final S getData() {
            return this.f58359a.b(1);
        }

        @Override // coil.disk.a.b
        @k
        public final S getMetadata() {
            return this.f58359a.b(0);
        }
    }

    /* compiled from: RealDiskCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/f$c;", "Lcoil/disk/a$c;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.d f58360b;

        public c(@k b.d dVar) {
            this.f58360b = dVar;
        }

        @Override // coil.disk.a.c
        public final a.b L5() {
            b.C2071b c2071bB;
            b.d dVar = this.f58360b;
            coil.disk.b bVar = coil.disk.b.this;
            synchronized (bVar) {
                dVar.close();
                c2071bB = bVar.b(dVar.f58350b.f58341a);
            }
            if (c2071bB != null) {
                return new b(c2071bB);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f58360b.close();
        }

        @Override // coil.disk.a.c
        @k
        public final S getData() {
            b.d dVar = this.f58360b;
            if (dVar.f58351c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return dVar.f58350b.f58343c.get(1);
        }

        @Override // coil.disk.a.c
        @k
        public final S getMetadata() {
            b.d dVar = this.f58360b;
            if (dVar.f58351c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return dVar.f58350b.f58343c.get(0);
        }
    }

    static {
        new a(null);
    }

    public f(long j12, @k kotlinx.coroutines.scheduling.b bVar, @k I i12, @k S s5) {
        this.f58357a = i12;
        this.f58358b = new coil.disk.b(j12, bVar, i12, s5);
    }

    @Override // coil.disk.a
    @k
    public final AbstractC44811v a() {
        return this.f58357a;
    }

    @Override // coil.disk.a
    @l
    public final a.b b(@k String str) {
        C44805o.f420139e.getClass();
        b.C2071b c2071bB = this.f58358b.b(C44805o.a.c(str).c("SHA-256").e());
        if (c2071bB != null) {
            return new b(c2071bB);
        }
        return null;
    }

    @Override // coil.disk.a
    @l
    public final a.c c(@k String str) {
        C44805o.f420139e.getClass();
        b.d dVarC = this.f58358b.c(C44805o.a.c(str).c("SHA-256").e());
        if (dVarC != null) {
            return new c(dVarC);
        }
        return null;
    }
}
