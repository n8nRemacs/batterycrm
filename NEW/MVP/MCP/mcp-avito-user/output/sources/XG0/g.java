package xG0;

import Y61.k;
import androidx.core.os.C22777e;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.universal_transaction.navigation.TransactionFragmentData;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final Class<?> a() {
        return TransactionFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final TabBaseFragment b(@k TabFragmentFactory.Data data) {
        TransactionFragmentData transactionFragmentData = (TransactionFragmentData) data;
        TransactionFragment.f306549K0.getClass();
        TransactionFragment transactionFragment = new TransactionFragment();
        transactionFragment.setArguments(C22777e.b(new Q("key_order_id", transactionFragmentData.f306468b), new Q("key_scenario", transactionFragmentData.f306470d), new Q("key_namespace", transactionFragmentData.f306469c), new Q("key_extra", transactionFragmentData.f306471e), new Q("key_event_params", transactionFragmentData.f306472f)));
        return transactionFragment;
    }
}
