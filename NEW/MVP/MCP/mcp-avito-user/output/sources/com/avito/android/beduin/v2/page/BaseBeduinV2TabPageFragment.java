package com.avito.android.beduin.v2.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: BaseBeduinV2TabPageFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/v2/page/BaseBeduinV2TabPageFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/beduin/v2/page/i;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "Lcom/avito/android/ui/status_bar/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseBeduinV2TabPageFragment extends TabBaseFragment implements i, com.avito.android.bottom_navigation.ui.fragment.e, com.avito.android.ui.status_bar.a, InterfaceC28477j.a {
    public BaseBeduinV2TabPageFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        D5().g(this);
        return true;
    }

    @Y61.k
    public abstract p D5();

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        D5().getClass();
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void k5(@Y61.k View view) {
        D5().f(this, view);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D5().e(this, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        D5().getClass();
        return layoutInflater.inflate(R.layout.fragment_empty, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        D5().c(bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        D5().d(requireArguments(), getChildFragmentManager());
    }

    @Override // com.avito.android.beduin.v2.page.i
    public final void w1() {
        D5().h(this);
    }
}
