package com.avito.android.str_calendar.seller.calandar_parameters;

import com.avito.android.remote.model.category_parameters.PriceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SellerCalendarParametersElementConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "it", "", "invoke", "(Lcom/avito/conveyor_item/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<com.avito.conveyor_item.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PriceParameter f287461l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PriceParameter priceParameter) {
        super(1);
        this.f287461l = priceParameter;
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.conveyor_item.a aVar) {
        return Boolean.valueOf(L.f(aVar.getF272486b(), this.f287461l.getId()));
    }
}
