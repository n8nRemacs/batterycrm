package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import com.avito.android.gig_snippet.a;
import javax.inject.Provider;
import pH.C46956d;

/* compiled from: GigApplyFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159725a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f159726b;

    /* renamed from: c, reason: collision with root package name */
    public final d f159727c;

    /* renamed from: d, reason: collision with root package name */
    public final i f159728d;

    /* renamed from: e, reason: collision with root package name */
    public final k f159729e;

    public g(dagger.internal.l lVar, Provider provider, d dVar, i iVar, k kVar) {
        this.f159725a = lVar;
        this.f159726b = provider;
        this.f159727c = dVar;
        this.f159728d = iVar;
        this.f159729e = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        GigApplyOpenParams gigApplyOpenParams = (GigApplyOpenParams) this.f159725a.f393949a;
        com.avito.android.gig_snippet.a aVar = this.f159726b.get();
        c cVar = (c) this.f159727c.get();
        h hVar = (h) this.f159728d.get();
        j jVar = (j) this.f159729e.get();
        String str = gigApplyOpenParams.f159866k;
        String str2 = gigApplyOpenParams.f159868m;
        String str3 = gigApplyOpenParams.f159863h;
        return new f("GigApplyScreen", new C46956d(false, gigApplyOpenParams.f159858c, gigApplyOpenParams.f159859d, gigApplyOpenParams.f159860e, gigApplyOpenParams.f159861f, gigApplyOpenParams.f159862g, gigApplyOpenParams.f159864i, gigApplyOpenParams.f159865j, a.C4709a.a(aVar, str, str3, str2, 8), gigApplyOpenParams.f159867l, gigApplyOpenParams.f159868m, gigApplyOpenParams.f159869n, aVar.d(gigApplyOpenParams.f159866k), aVar.d(str3), false, false, 32769, null), new e(cVar, hVar, jVar));
    }
}
