package coil.disk;

import Y41.l;
import Y61.k;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import okio.AbstractC44814y;
import okio.C44802l;
import okio.c0;

/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/e;", "Lokio/y;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends AbstractC44814y {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<IOException, G0> f58355f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f58356g;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k c0 c0Var, @k l<? super IOException, G0> lVar) {
        super(c0Var);
        this.f58355f = lVar;
    }

    @Override // okio.AbstractC44814y, okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e12) {
            this.f58356g = true;
            this.f58355f.invoke(e12);
        }
    }

    @Override // okio.AbstractC44814y, okio.c0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e12) {
            this.f58356g = true;
            this.f58355f.invoke(e12);
        }
    }

    @Override // okio.AbstractC44814y, okio.c0
    public final void write(@k C44802l c44802l, long j12) {
        if (this.f58356g) {
            c44802l.skip(j12);
            return;
        }
        try {
            super.write(c44802l, j12);
        } catch (IOException e12) {
            this.f58356g = true;
            ((d) this.f58355f).invoke(e12);
        }
    }
}
