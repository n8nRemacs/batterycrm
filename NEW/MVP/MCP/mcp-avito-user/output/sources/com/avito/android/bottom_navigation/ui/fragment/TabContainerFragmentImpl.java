package com.avito.android.bottom_navigation.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabContainerFragmentImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerFragmentImpl;", "Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabContainerFragmentImpl extends TabContainerFragment implements InterfaceC28477j.a {

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final Object f107108f0 = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* compiled from: TabContainerFragmentImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/d;", "invoke", "()Lcom/avito/android/bottom_navigation/ui/fragment/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return new d(TabContainerFragmentImpl.this);
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final void b5(@Y61.k Fragment fragment, @Y61.l Integer num, @Y61.k NavigationScreenAction navigationScreenAction) {
        j5().b(fragment, num, false, navigationScreenAction);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean d5(boolean z12, boolean z13) {
        return j5().f(z12, z13);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    @Y61.l
    public final Fragment e5() {
        return j5().d();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final void f5(@Y61.k NavigationScreenAction navigationScreenAction) {
        j5().e(navigationScreenAction);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean g5() {
        return j5().g();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final int h5() {
        return j5().c();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean i5(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return j5().a(navigationTabSetItem);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final i j5() {
        return (i) this.f107108f0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.tab_fragment, viewGroup, false);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    @Y61.l
    public final NavigationState u0() {
        return j5().u0();
    }
}
