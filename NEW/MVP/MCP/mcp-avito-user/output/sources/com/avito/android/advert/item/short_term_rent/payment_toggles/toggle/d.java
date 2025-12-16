package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import Y41.l;
import com.avito.android.advert.item.short_term_rent.payment_toggles.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsTravelPaymentTogglePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f80123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsTravelPaymentToggleItem f80124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem, e eVar) {
        super(1);
        this.f80123l = eVar;
        this.f80124m = advertDetailsTravelPaymentToggleItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        e eVar = this.f80123l;
        eVar.f80125b.a(new b.C2366b(this.f80124m.f80109b, zBooleanValue));
        return G0.f406611a;
    }
}
