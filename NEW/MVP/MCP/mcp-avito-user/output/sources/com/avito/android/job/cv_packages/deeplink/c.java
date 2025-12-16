package com.avito.android.job.cv_packages.deeplink;

import Y61.k;
import android.os.Bundle;
import bQ.InterfaceC25544a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import sv.C48421d;

/* compiled from: CvPackagesLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/deeplink/c;", "Lev/a;", "Lcom/avito/android/job/cv_packages/links/CvPackagesLink;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40161a<CvPackagesLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f174347f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f174348g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC25544a f174349h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f174350i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public c(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC25544a interfaceC25544a) {
        this.f174347f = bVar;
        this.f174348g = interfaceC4053a;
        this.f174349h = interfaceC25544a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CvPackagesLink cvPackagesLink = (CvPackagesLink) deepLink;
        this.f174350i.b(this.f174347f.Q().N(new a(this)).t0(new b(this)));
        this.f174348g.J(this.f174349h.a(cvPackagesLink.f174421b, cvPackagesLink.f174422c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f174350i.e();
    }
}
