package com.avito.android.job.cv_packages.item;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PackagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/item/h;", "LTV0/d;", "Lcom/avito/android/job/cv_packages/item/e;", "Lcom/avito/android/job/cv_packages/item/d;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements TV0.d<e, d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f174411b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@k l<? super DeepLink, G0> lVar) {
        this.f174411b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        d dVar = (d) aVar;
        eVar2.b40(dVar.f174401c);
        eVar2.c(new g(dVar, this));
    }
}
