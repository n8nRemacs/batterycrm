package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQH/a;", "it", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "invoke", "(LQH/a;)Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class X extends kotlin.jvm.internal.N implements Y41.l<QH.a, ExtendedProfileWidgetItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150061l = extendedProfileInternalAction;
    }

    @Override // Y41.l
    public final ExtendedProfileWidgetItem invoke(QH.a aVar) {
        ExtendedProfileInternalAction.JobCarouselScrollPositionChanged jobCarouselScrollPositionChanged = (ExtendedProfileInternalAction.JobCarouselScrollPositionChanged) this.f150061l;
        JobCompanyCarouselItem jobCompanyCarouselItem = jobCarouselScrollPositionChanged.f150165b;
        return new JobCompanyCarouselItem(jobCompanyCarouselItem.f154485b, jobCompanyCarouselItem.f154486c, jobCompanyCarouselItem.f154487d, jobCompanyCarouselItem.f154488e, jobCarouselScrollPositionChanged.f150166c);
    }
}
