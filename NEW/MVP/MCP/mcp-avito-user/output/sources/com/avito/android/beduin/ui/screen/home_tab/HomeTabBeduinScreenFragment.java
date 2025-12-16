package com.avito.android.beduin.ui.screen.home_tab;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.ui.screen.BeduinScreenRootFragment;
import com.avito.android.bottom_navigation.ui.fragment.e;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35968w3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: HomeTabBeduinScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/beduin/ui/screen/a;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HomeTabBeduinScreenFragment extends TabBaseFragment implements InterfaceC28477j.a, com.avito.android.beduin.ui.screen.a, e {

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C35968w3 f104401t0;

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f104400v0 = {m0.f406844a.e(new Y(HomeTabBeduinScreenFragment.class, "openParams", "getOpenParams()Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenParams;", 0))};

    /* renamed from: u0, reason: collision with root package name */
    @k
    public static final a f104399u0 = new a(null);

    /* compiled from: HomeTabBeduinScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenFragment$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public HomeTabBeduinScreenFragment() {
        super(R.layout.home_tab_beduin_screen_fragment);
        this.f104401t0 = new C35968w3(this);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        return com.avito.android.ui.fragments.e.a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        n<Object>[] nVarArr = f104400v0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f104401t0;
        this.f304614n0 = new NavigationState(((HomeTabBeduinScreenParams) c35968w3.getValue(this, nVar)).f104408c, null, 2, null);
        if (bundle == null) {
            H hE2 = getChildFragmentManager().e();
            BeduinScreenRootFragment.a aVar = BeduinScreenRootFragment.f104071v0;
            HomeTabBeduinScreenParams homeTabBeduinScreenParams = (HomeTabBeduinScreenParams) c35968w3.getValue(this, nVarArr[0]);
            aVar.getClass();
            BeduinScreenRootFragment beduinScreenRootFragment = new BeduinScreenRootFragment();
            beduinScreenRootFragment.f104079t0.setValue(beduinScreenRootFragment, BeduinScreenRootFragment.f104072w0[1], homeTabBeduinScreenParams.f104407b);
            hE2.j(R.id.fragment_container, beduinScreenRootFragment, null, 1);
            hE2.e();
        }
    }
}
