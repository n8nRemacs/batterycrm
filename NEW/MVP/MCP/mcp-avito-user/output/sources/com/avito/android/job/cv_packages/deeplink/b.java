package com.avito.android.job.cv_packages.deeplink;

import android.content.Intent;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import kotlin.Metadata;
import rv.C47918a;

/* compiled from: CvPackagesLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f174346b;

    public b(c cVar) {
        this.f174346b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C47918a c47918a = (C47918a) obj;
        int i12 = c47918a.f437156b;
        c cVar = this.f174346b;
        if (i12 != -1) {
            cVar.j(CvPackagesLink.b.a.f174423b);
        } else {
            Intent intent = c47918a.f437157c;
            cVar.j(new CvPackagesLink.b.C5141b(intent != null ? intent.getBooleanExtra("extra_single_cv_flag", false) : false));
        }
    }
}
