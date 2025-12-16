package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import dt.InterfaceC39801a;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CvListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/logics/b;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<com.avito.android.crm_paid_cvs.features.cv_list.entity.a, CvListInternalAction, CvListState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39801a f130542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39801a f130543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39801a f130544c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f130545d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.toggle_comparison_state.l f130546e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f130547f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f130548g;

    @Inject
    public b(@Y61.k @Named("CV_INTERACTOR") InterfaceC39801a interfaceC39801a, @Y61.k @Named("FAVORITES_INTERACTOR") InterfaceC39801a interfaceC39801a2, @Y61.k @Named("SEARCHES_INTERACTOR") InterfaceC39801a interfaceC39801a3, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.toggle_comparison_state.l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f130542a = interfaceC39801a;
        this.f130543b = interfaceC39801a2;
        this.f130544c = interfaceC39801a3;
        this.f130545d = hVar;
        this.f130546e = lVar;
        this.f130547f = interfaceC28373a;
        this.f130548g = e12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CvListInternalAction> b(com.avito.android.crm_paid_cvs.features.cv_list.entity.a aVar, CvListState cvListState) {
        return C43175k.G(new a(cvListState, this, aVar, null));
    }
}
