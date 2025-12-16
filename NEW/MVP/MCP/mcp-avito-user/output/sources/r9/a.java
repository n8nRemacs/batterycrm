package R9;

import Y61.k;
import com.avito.android.delivery_combined_buttons_public.BuyButton;
import com.avito.android.delivery_combined_buttons_public.CartButton;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.delivery_combined_buttons_public.WidthStrategy;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CombinedButtons.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: CombinedButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: R9.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0942a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14110a;

        static {
            int[] iArr = new int[SafeDeal.Component.CombinedButtons.WidthStrategy.values().length];
            try {
                iArr[SafeDeal.Component.CombinedButtons.WidthStrategy.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14110a = iArr;
        }
    }

    @k
    public static final CombinedButtonsData a(@k SafeDeal.Component.CombinedButtons combinedButtons) {
        WidthStrategy widthStrategy;
        String id2 = combinedButtons.getId();
        int quantity = combinedButtons.getCartButton().getQuantity();
        int maxQuantity = combinedButtons.getCartButton().getMaxQuantity();
        Boolean isCartButtonOnLeft = combinedButtons.getIsCartButtonOnLeft();
        boolean zBooleanValue = isCartButtonOnLeft != null ? isCartButtonOnLeft.booleanValue() : false;
        SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy2 = combinedButtons.getWidthStrategy();
        int i12 = widthStrategy2 == null ? -1 : C0942a.f14110a[widthStrategy2.ordinal()];
        if (i12 == -1) {
            widthStrategy = null;
        } else {
            if (i12 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            widthStrategy = WidthStrategy.f134963b;
        }
        WidthStrategy widthStrategy3 = widthStrategy;
        Map<String, String> mapD = combinedButtons.getCartButton().d();
        SafeDeal.Component.CombinedButtons.BuyButton buyButton = combinedButtons.getBuyButton();
        BuyButton buyButton2 = new BuyButton(buyButton.getOnTapDeepLink(), buyButton.getStyle(), buyButton.getTheme(), buyButton.getTitle(), buyButton.getSubtitle(), buyButton.getIsLoading());
        SafeDeal.Component.CombinedButtons.CartButton.AddToCartButton addToCartButton = combinedButtons.getCartButton().getAddToCartButton();
        CartButton.AddToCartButton addToCartButton2 = new CartButton.AddToCartButton(addToCartButton.getStyle(), addToCartButton.getTheme(), addToCartButton.getTitle(), addToCartButton.getSubtitle(), addToCartButton.getIsLoading());
        SafeDeal.Component.CombinedButtons.CartButton.GoToCartButton goToCartButton = combinedButtons.getCartButton().getGoToCartButton();
        return new CombinedButtonsData(id2, quantity, maxQuantity, zBooleanValue, widthStrategy3, buyButton2, addToCartButton2, new CartButton.GoToCartButton(goToCartButton.getStyle(), goToCartButton.getTheme(), goToCartButton.getTitle(), goToCartButton.getSubtitle(), goToCartButton.getIsLoading(), goToCartButton.getOnTapDeepLink()), mapD);
    }
}
