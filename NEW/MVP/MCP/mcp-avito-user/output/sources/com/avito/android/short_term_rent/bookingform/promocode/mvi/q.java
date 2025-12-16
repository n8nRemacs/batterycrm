package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.deeplink.PromoCode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoCodeReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "promoCode", "Lcom/avito/android/short_term_rent/deeplink/PromoCode;", "invoke", "(Lcom/avito/android/short_term_rent/deeplink/PromoCode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<PromoCode, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f282182l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(PromoCode promoCode) {
        return Boolean.valueOf(promoCode.getIsSelected());
    }
}
