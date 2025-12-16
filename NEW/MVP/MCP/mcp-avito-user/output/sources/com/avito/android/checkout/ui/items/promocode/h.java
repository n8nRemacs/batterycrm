package com.avito.android.checkout.ui.items.promocode;

import Y41.l;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.checkout.data.CheckoutPromoCodeState;
import com.avito.android.checkout.di.s;
import com.avito.android.checkout.di.t;
import com.avito.android.checkout.ui.items.promocode.CheckoutPromoCodeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckoutPromoCodeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/promocode/h;", "Lcom/avito/android/checkout/ui/items/promocode/c;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<String, G0> f118464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p<DeepLink, String, G0> f118465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f118466d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f118467e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@t @Y61.k l<? super String, G0> lVar, @s @Y61.k p<? super DeepLink, ? super String, G0> pVar) {
        this.f118464b = lVar;
        this.f118465c = pVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (CheckoutPromoCodeItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCodeItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        if (!(obj instanceof Bundle)) {
            obj = null;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            k(jVar, checkoutPromoCodeItem);
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        AttributedText attributedText = (AttributedText) (i13 >= 33 ? (Parcelable) bundle.getParcelable("payload_checkout_promocode_title", AttributedText.class) : bundle.getParcelable("payload_checkout_promocode_title"));
        if (attributedText != null) {
            jVar.Y50(attributedText, new g(this, jVar));
        }
        String string = bundle.getString("payload_checkout_promocode_placeholder");
        if (string != null) {
            jVar.setHint(string);
        }
        if (bundle.containsKey("payload_checkout_promocode_value")) {
            String string2 = bundle.getString("payload_checkout_promocode_value");
            this.f118466d = string2;
            jVar.OL(string2, new e(this));
            String str = this.f118466d;
            jVar.pq(!(str == null || str.length() == 0));
        }
        CheckoutPromoCodeState checkoutPromoCodeState = (CheckoutPromoCodeState) (i13 >= 33 ? (Parcelable) bundle.getParcelable("payload_checkout_promocode_state", CheckoutPromoCodeState.class) : bundle.getParcelable("payload_checkout_promocode_state"));
        if (checkoutPromoCodeState != null) {
            jVar.Gp(checkoutPromoCodeState != CheckoutPromoCodeState.f118139c);
            jVar.j4(checkoutPromoCodeState == CheckoutPromoCodeState.f118140d);
        }
        if (bundle.containsKey("payload_checkout_promocode_message")) {
            jVar.wm(bundle.getString("payload_checkout_promocode_message"));
        }
        CheckoutPromoCodeItem.Button button = (CheckoutPromoCodeItem.Button) (i13 >= 33 ? (Parcelable) bundle.getParcelable("payload_checkout_promocode_button", CheckoutPromoCodeItem.Button.class) : bundle.getParcelable("payload_checkout_promocode_button"));
        if (button != null) {
            if (checkoutPromoCodeState == null) {
                checkoutPromoCodeState = checkoutPromoCodeItem.f118442e;
            }
            jVar.BD(button, new f(checkoutPromoCodeState, button, this));
        }
        Boolean boolValueOf = bundle.containsKey("payload_checkout_promocode_is_loading") ? Boolean.valueOf(bundle.getBoolean("payload_checkout_promocode_is_loading")) : null;
        if (boolValueOf != null) {
            jVar.e6(boolValueOf.booleanValue());
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k CheckoutPromoCodeItem checkoutPromoCodeItem) {
        String str = checkoutPromoCodeItem.f118441d;
        this.f118466d = str;
        this.f118467e = str != null;
        jVar.S9(checkoutPromoCodeItem.f118445h);
        jVar.Y50(checkoutPromoCodeItem.f118439b, new g(this, jVar));
        jVar.setHint(checkoutPromoCodeItem.f118440c);
        jVar.OL(this.f118466d, new d(this));
        CheckoutPromoCodeState checkoutPromoCodeState = CheckoutPromoCodeState.f118139c;
        CheckoutPromoCodeState checkoutPromoCodeState2 = checkoutPromoCodeItem.f118442e;
        jVar.Gp(checkoutPromoCodeState2 != checkoutPromoCodeState);
        jVar.j4(checkoutPromoCodeState2 == CheckoutPromoCodeState.f118140d);
        jVar.wm(checkoutPromoCodeItem.f118443f);
        CheckoutPromoCodeItem.Button button = checkoutPromoCodeItem.f118444g;
        jVar.BD(button, new f(checkoutPromoCodeState2, button, this));
        jVar.e6(checkoutPromoCodeItem.f118446i);
        String str2 = this.f118466d;
        jVar.pq(!(str2 == null || str2.length() == 0));
        jVar.c50(this.f118467e);
    }
}
