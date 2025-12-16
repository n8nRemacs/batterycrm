package okio;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PeekSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/T;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class T implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44804n f420036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44802l f420037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Z f420038d;

    /* renamed from: e, reason: collision with root package name */
    public int f420039e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f420040f;

    /* renamed from: g, reason: collision with root package name */
    public long f420041g;

    public T(@Y61.k InterfaceC44804n interfaceC44804n) {
        this.f420036b = interfaceC44804n;
        C44802l f420047c = interfaceC44804n.getF420047c();
        this.f420037c = f420047c;
        Z z12 = f420047c.f420124b;
        this.f420038d = z12;
        this.f420039e = z12 != null ? z12.f420051b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f420040f = true;
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        Z z12;
        Z z13;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        if (this.f420040f) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        Z z14 = this.f420038d;
        C44802l c44802l2 = this.f420037c;
        if (z14 != null && (z14 != (z13 = c44802l2.f420124b) || this.f420039e != z13.f420051b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j12 == 0) {
            return 0L;
        }
        if (!this.f420036b.request(this.f420041g + 1)) {
            return -1L;
        }
        if (this.f420038d == null && (z12 = c44802l2.f420124b) != null) {
            this.f420038d = z12;
            this.f420039e = z12.f420051b;
        }
        long jMin = Math.min(j12, c44802l2.f420125c - this.f420041g);
        this.f420037c.k(this.f420041g, c44802l, jMin);
        this.f420041g += jMin;
        return jMin;
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420025c() {
        return this.f420036b.getF420025c();
    }
}
