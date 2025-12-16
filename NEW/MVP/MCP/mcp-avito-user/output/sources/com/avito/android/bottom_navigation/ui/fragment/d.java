package com.avito.android.bottom_navigation.ui.fragment;

import Zj.InterfaceC19568a;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.view.InterfaceC23487e;
import com.avito.android.R;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;

/* compiled from: TabContainerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/d;", "Lcom/avito/android/bottom_navigation/ui/fragment/i;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f107142a;

    /* compiled from: TabContainerDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NavigationScreenAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<NavigationScreenAction> creator = NavigationScreenAction.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<NavigationScreenAction> creator2 = NavigationScreenAction.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<NavigationScreenAction> creator3 = NavigationScreenAction.CREATOR;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d(@Y61.k Fragment fragment) {
        this.f107142a = fragment;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final boolean a(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        Fragment fragment = this.f107142a;
        boolean z12 = fragment.getChildFragmentManager().L() > 1;
        if (z12) {
            fragment.getChildFragmentManager().a0(0, fragment.getChildFragmentManager().K(0).getName());
            fragment.getChildFragmentManager().E();
        }
        InterfaceC23487e interfaceC23487e = (Fragment) C42745f0.G(fragment.getChildFragmentManager().P());
        if (!(interfaceC23487e instanceof l) || !((l) interfaceC23487e).b0(navigationTabSetItem)) {
            if (fragment.getChildFragmentManager().L() > 0) {
                fragment.getChildFragmentManager().Y();
            }
            return false;
        }
        if (z12 || !(interfaceC23487e instanceof g)) {
            return true;
        }
        ((g) interfaceC23487e).K3();
        return true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final void b(@Y61.k Fragment fragment, @Y61.l Integer num, boolean z12, @Y61.k NavigationScreenAction navigationScreenAction) {
        if (h(navigationScreenAction, fragment)) {
            Fragment fragment2 = this.f107142a;
            H hE2 = fragment2.getChildFragmentManager().e();
            if (num != null) {
                hE2.o(0, 0, R.anim.fade_in_tab_fragment, num.intValue());
            }
            String string = fragment.toString();
            hE2.n(R.id.fragment_container, fragment, string);
            hE2.f46457p = z12;
            hE2.c(string);
            hE2.e();
            if (navigationScreenAction == NavigationScreenAction.f107102d) {
                fragment2.getChildFragmentManager().E();
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final int c() {
        return this.f107142a.getChildFragmentManager().L();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    @Y61.l
    public final Fragment d() {
        return (Fragment) C42745f0.S(this.f107142a.getChildFragmentManager().P());
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final void e(@Y61.k NavigationScreenAction navigationScreenAction) {
        h(navigationScreenAction, null);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final boolean f(boolean z12, boolean z13) {
        Fragment fragment = this.f107142a;
        InterfaceC23487e interfaceC23487e = (Fragment) C42745f0.S(fragment.getChildFragmentManager().P());
        boolean zI02 = ((interfaceC23487e instanceof com.avito.android.ui.fragments.c) && z12) ? ((com.avito.android.ui.fragments.c) interfaceC23487e).i0() : false;
        if (z12 && (interfaceC23487e instanceof e) && ((e) interfaceC23487e).D3()) {
            return true;
        }
        if (fragment.getChildFragmentManager().L() > 1 || !z13) {
            fragment.getChildFragmentManager().Y();
        }
        if (zI02 || fragment.getChildFragmentManager().L() > 1) {
            return true;
        }
        fragment.getChildFragmentManager().L();
        return false;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    public final boolean g() {
        return this.f107142a.isAdded();
    }

    public final boolean h(NavigationScreenAction navigationScreenAction, Fragment fragment) {
        Fragment fragmentH;
        int iOrdinal = navigationScreenAction.ordinal();
        Fragment fragment2 = this.f107142a;
        if (iOrdinal != 1) {
            String str = null;
            if (iOrdinal == 2) {
                fragment2.getChildFragmentManager().b0(-1, 0, null);
            } else {
                if (iOrdinal != 3 || fragment == null) {
                    return true;
                }
                kotlin.reflect.d dVarB = m0.f406844a.b(fragment.getClass());
                int iL2 = fragment2.getChildFragmentManager().L() - 1;
                while (true) {
                    if (-1 >= iL2) {
                        break;
                    }
                    String name = fragment2.getChildFragmentManager().K(iL2).getName();
                    if (name != null && (fragmentH = fragment2.getChildFragmentManager().H(name)) != null) {
                        if (m0.f406844a.b(fragmentH.getClass()).equals(dVarB)) {
                            str = name;
                            break;
                        }
                    }
                    iL2--;
                }
                if (str != null) {
                    fragment2.getChildFragmentManager().a0(0, str);
                    return false;
                }
            }
        } else {
            fragment2.getChildFragmentManager().Y();
        }
        return true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.i
    @Y61.l
    public final NavigationState u0() {
        Object objS = C42745f0.S(this.f107142a.getChildFragmentManager().P());
        InterfaceC19568a interfaceC19568a = objS instanceof InterfaceC19568a ? (InterfaceC19568a) objS : null;
        if (interfaceC19568a != null) {
            return interfaceC19568a.u0();
        }
        return null;
    }
}
