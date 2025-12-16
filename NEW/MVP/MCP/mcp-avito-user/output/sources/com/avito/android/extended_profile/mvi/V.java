package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQH/a;", "it", "", "invoke", "(LQH/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class V extends kotlin.jvm.internal.N implements Y41.l<QH.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150059l = extendedProfileInternalAction;
    }

    @Override // Y41.l
    public final Boolean invoke(QH.a aVar) {
        QH.a aVar2 = aVar;
        return Boolean.valueOf((aVar2 instanceof JobCompanyCarouselItem) && kotlin.jvm.internal.L.f(((JobCompanyCarouselItem) aVar2).getF145250b(), ((ExtendedProfileInternalAction.JobCarouselScrollPositionChanged) this.f150059l).f150165b.f154485b));
    }
}
