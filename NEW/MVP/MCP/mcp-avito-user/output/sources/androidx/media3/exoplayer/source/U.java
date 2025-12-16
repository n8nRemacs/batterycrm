package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;

/* compiled from: SinglePeriodTimeline.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class U extends androidx.media3.common.P {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f49660o = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final long f49661g;

    /* renamed from: h, reason: collision with root package name */
    public final long f49662h;

    /* renamed from: i, reason: collision with root package name */
    public final long f49663i;

    /* renamed from: j, reason: collision with root package name */
    public final long f49664j;

    /* renamed from: k, reason: collision with root package name */
    public final long f49665k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f49666l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final androidx.media3.common.z f49667m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final z.g f49668n;

    static {
        z.c cVar = new z.c();
        cVar.f47988a = "SinglePeriodTimeline";
        cVar.f47989b = Uri.EMPTY;
        cVar.a();
    }

    public U(long j12, boolean z12, boolean z13, androidx.media3.common.z zVar) {
        z.g gVar = z13 ? zVar.f47980d : null;
        this.f49661g = -9223372036854775807L;
        this.f49662h = -9223372036854775807L;
        this.f49663i = -9223372036854775807L;
        this.f49664j = j12;
        this.f49665k = j12;
        this.f49666l = z12;
        zVar.getClass();
        this.f49667m = zVar;
        this.f49668n = gVar;
    }

    @Override // androidx.media3.common.P
    public final int g(Object obj) {
        return f49660o.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.P
    public final P.b n(int i12, P.b bVar, boolean z12) {
        C23110a.c(i12, 1);
        Object obj = z12 ? f49660o : null;
        bVar.getClass();
        bVar.p(null, obj, 0, this.f49664j, 0L, C23089c.f47615g, false);
        return bVar;
    }

    @Override // androidx.media3.common.P
    public final int p() {
        return 1;
    }

    @Override // androidx.media3.common.P
    public final Object t(int i12) {
        C23110a.c(i12, 1);
        return f49660o;
    }

    @Override // androidx.media3.common.P
    public final P.d u(int i12, P.d dVar, long j12) {
        C23110a.c(i12, 1);
        dVar.b(P.d.f47399s, this.f49667m, null, this.f49661g, this.f49662h, this.f49663i, this.f49666l, false, this.f49668n, 0L, this.f49665k, 0, 0, 0L);
        return dVar;
    }

    @Override // androidx.media3.common.P
    public final int w() {
        return 1;
    }
}
