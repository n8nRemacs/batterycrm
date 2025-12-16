package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.s;

/* compiled from: JobCompanyCarouselPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154498l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobCompanyCarouselItem f154499m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, JobCompanyCarouselItem jobCompanyCarouselItem) {
        super(1);
        this.f154498l = eVar;
        this.f154499m = jobCompanyCarouselItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        e eVar = this.f154498l;
        eVar.f154500b.invoke(new s(this.f154499m, iIntValue));
        return G0.f406611a;
    }
}
