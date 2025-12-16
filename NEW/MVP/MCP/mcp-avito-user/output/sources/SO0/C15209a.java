package So0;

import A50.b;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import com.avito.android.sbc.deeplink.DiscountDispatchVasDeepLink;
import kotlin.Metadata;

/* compiled from: DiscountDispatchFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LSo0/a;", "LA50/b;", "Lcom/avito/android/sbc/deeplink/DiscountDispatchVasDeepLink;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: So0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15209a implements b<DiscountDispatchVasDeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        DiscountDispatchVasDeepLink discountDispatchVasDeepLink = (DiscountDispatchVasDeepLink) deepLink;
        CreateDiscountDispatchFragment.f259243G0.getClass();
        CreateDiscountDispatchFragment createDiscountDispatchFragment = new CreateDiscountDispatchFragment();
        Bundle bundle = new Bundle();
        boolean z12 = discountDispatchVasDeepLink.f259946d;
        String str = discountDispatchVasDeepLink.f259947e;
        bundle.putParcelable("key_discount_dispatch_arg", new CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs(discountDispatchVasDeepLink.f259948f, discountDispatchVasDeepLink.f259944b, discountDispatchVasDeepLink.f259945c, str, discountDispatchVasDeepLink.f259949g, z12));
        createDiscountDispatchFragment.setArguments(bundle);
        return createDiscountDispatchFragment;
    }
}
