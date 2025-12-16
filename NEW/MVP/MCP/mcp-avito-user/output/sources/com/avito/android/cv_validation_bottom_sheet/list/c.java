package com.avito.android.cv_validation_bottom_sheet.list;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CvItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/list/c;", "LTV0/d;", "Lcom/avito/android/cv_validation_bottom_sheet/list/e;", "Lcom/avito/android/cv_validation_bottom_sheet/list/CvItem;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.d<e, CvItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<CvItem, G0> f131863b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super CvItem, G0> lVar) {
        this.f131863b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        CvItem cvItem = (CvItem) aVar;
        eVar2.b(cvItem.f131856c);
        eVar2.n(cvItem.f131858e);
        eVar2.z1(cvItem.f131857d);
        eVar2.x10(cvItem, this.f131863b);
    }
}
