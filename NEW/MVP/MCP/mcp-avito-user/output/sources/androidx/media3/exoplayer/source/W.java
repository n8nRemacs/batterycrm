package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C23108t;
import androidx.media3.common.z;
import androidx.media3.datasource.j;
import androidx.media3.datasource.o;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: SingleSampleMediaSource.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class W extends AbstractC23150a {

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.datasource.o f49690i;

    /* renamed from: j, reason: collision with root package name */
    public final j.a f49691j;

    /* renamed from: k, reason: collision with root package name */
    public final C23108t f49692k;

    /* renamed from: l, reason: collision with root package name */
    public final long f49693l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49694m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f49695n;

    /* renamed from: o, reason: collision with root package name */
    public final U f49696o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.media3.common.z f49697p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public androidx.media3.datasource.B f49698q;

    /* compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j.a f49699a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.l f49700b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49701c;

        public b(j.a aVar) {
            aVar.getClass();
            this.f49699a = aVar;
            this.f49700b = new androidx.media3.exoplayer.upstream.k();
            this.f49701c = true;
        }
    }

    public W(String str, z.k kVar, j.a aVar, long j12, androidx.media3.exoplayer.upstream.l lVar, boolean z12, Object obj, a aVar2) {
        this.f49691j = aVar;
        this.f49693l = j12;
        this.f49694m = lVar;
        this.f49695n = z12;
        z.c cVar = new z.c();
        cVar.f47989b = Uri.EMPTY;
        String string = kVar.f48096b.toString();
        string.getClass();
        cVar.f47988a = string;
        cVar.f47995h = AbstractC37401r1.v(AbstractC37401r1.E(kVar));
        cVar.f47997j = obj;
        androidx.media3.common.z zVarA = cVar.a();
        this.f49697p = zVarA;
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = (String) com.google.common.base.D.a(kVar.f48097c, "text/x-unknown");
        bVar.f47779c = kVar.f48098d;
        bVar.f47780d = kVar.f48099e;
        bVar.f47781e = kVar.f48100f;
        bVar.f47778b = kVar.f48101g;
        String str2 = kVar.f48102h;
        bVar.f47777a = str2 != null ? str2 : str;
        this.f49692k = bVar.a();
        o.b bVar2 = new o.b();
        bVar2.f48255a = kVar.f48096b;
        bVar2.f48263i = 1;
        this.f49690i = bVar2.a();
        this.f49696o = new U(j12, true, false, zVarA);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        androidx.media3.datasource.B b12 = this.f49698q;
        D.a aVar = new D.a(this.f49714d.f49485c, 0, bVar);
        return new V(this.f49690i, this.f49691j, b12, this.f49692k, this.f49693l, this.f49694m, aVar, this.f49695n);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return this.f49697p;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        ((V) interfaceC23174z).f49677j.d(null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        this.f49698q = b12;
        z(this.f49696o);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
