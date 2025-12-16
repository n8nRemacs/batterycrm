package mp0;

import A50.b;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip.deep_linking.BbipDeepLink;
import com.avito.android.screens.bbip.ui.BbipFragment;
import kotlin.Metadata;

/* compiled from: BbipFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmp0/a;", "LA50/b;", "Lcom/avito/android/screens/bbip/deep_linking/BbipDeepLink;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44118a implements b<BbipDeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        BbipDeepLink bbipDeepLink = (BbipDeepLink) deepLink;
        BbipFragment.f260259H0.getClass();
        BbipFragment bbipFragment = new BbipFragment();
        Bundle bundle = new Bundle();
        bundle.putString("item_id", bbipDeepLink.f260208b);
        bundle.putString("checkout_context", bbipDeepLink.f260209c);
        bbipFragment.setArguments(bundle);
        return bbipFragment;
    }
}
