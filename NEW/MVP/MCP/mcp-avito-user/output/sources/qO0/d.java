package QO0;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.wallet.page.history.mvi.PaymentHistoryFragment;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PaymentHistoryPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQO0/d;", "Landroidx/fragment/app/F;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends F {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<f> f13710j;

    public d(@k FragmentManager fragmentManager, @k List<f> list) {
        super(fragmentManager, 0);
        this.f13710j = list;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f13710j.size();
    }

    @Override // androidx.viewpager.widget.a
    @k
    public final CharSequence e(int i12) {
        return this.f13710j.get(i12).f13712c;
    }

    @Override // androidx.fragment.app.F
    @k
    public final Fragment o(int i12) {
        String str = this.f13710j.get(i12).f13711b;
        PaymentHistoryFragment.f327987q0.getClass();
        PaymentHistoryFragment paymentHistoryFragment = new PaymentHistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("history_id", str);
        paymentHistoryFragment.setArguments(bundle);
        return paymentHistoryFragment;
    }
}
