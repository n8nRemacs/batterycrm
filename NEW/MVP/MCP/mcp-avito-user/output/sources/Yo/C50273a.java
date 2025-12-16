package yo;

import android.os.Bundle;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.checkout.data.CheckoutPromoCodeState;
import com.avito.android.checkout.ui.items.promocode.CheckoutPromoCodeItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutDiffUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyo/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50273a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getId() == aVar4.getId() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Bundle bundle;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof CheckoutPromoCodeItem) && (aVar4 instanceof CheckoutPromoCodeItem)) {
            bundle = new Bundle();
            CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCodeItem) aVar3;
            CheckoutPromoCodeItem checkoutPromoCodeItem2 = (CheckoutPromoCodeItem) aVar4;
            AttributedText attributedText = checkoutPromoCodeItem.f118439b;
            AttributedText attributedText2 = checkoutPromoCodeItem2.f118439b;
            if (!L.f(attributedText, attributedText2)) {
                bundle.putParcelable("payload_checkout_promocode_title", attributedText2);
            }
            String str = checkoutPromoCodeItem.f118440c;
            String str2 = checkoutPromoCodeItem2.f118440c;
            if (!L.f(str, str2)) {
                bundle.putString("payload_checkout_promocode_placeholder", str2);
            }
            String str3 = checkoutPromoCodeItem.f118441d;
            String str4 = checkoutPromoCodeItem2.f118441d;
            if (!L.f(str3, str4)) {
                bundle.putString("payload_checkout_promocode_value", str4);
            }
            CheckoutPromoCodeState checkoutPromoCodeState = checkoutPromoCodeItem.f118442e;
            CheckoutPromoCodeState checkoutPromoCodeState2 = checkoutPromoCodeItem2.f118442e;
            if (checkoutPromoCodeState != checkoutPromoCodeState2) {
                bundle.putParcelable("payload_checkout_promocode_state", checkoutPromoCodeState2);
            }
            String str5 = checkoutPromoCodeItem.f118443f;
            String str6 = checkoutPromoCodeItem2.f118443f;
            if (!L.f(str5, str6)) {
                bundle.putString("payload_checkout_promocode_message", str6);
            }
            CheckoutPromoCodeItem.Button button = checkoutPromoCodeItem.f118444g;
            CheckoutPromoCodeItem.Button button2 = checkoutPromoCodeItem2.f118444g;
            if (!button.equals(button2)) {
                bundle.putParcelable("payload_checkout_promocode_button", button2);
            }
            boolean z12 = checkoutPromoCodeItem.f118446i;
            boolean z13 = checkoutPromoCodeItem2.f118446i;
            if (z12 != z13) {
                bundle.putBoolean("payload_checkout_promocode_is_loading", z13);
            }
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
