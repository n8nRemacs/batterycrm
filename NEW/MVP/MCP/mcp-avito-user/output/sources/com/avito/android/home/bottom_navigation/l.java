package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.InterfaceC28891m;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.home.C30769d;
import kotlin.Metadata;

/* compiled from: BottomNavigationFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/home/d;", "counters", "Lkotlin/G0;", "accept", "(Lcom/avito/android/home/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28885g f162357b;

    public l(C28885g c28885g) {
        this.f162357b = c28885g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C30769d c30769d = (C30769d) obj;
        int i12 = c30769d.f162376b + c30769d.f162377c + c30769d.f162378d + c30769d.f162379e;
        NavigationTab navigationTab = NavigationTab.f106972h;
        InterfaceC28891m interfaceC28891m = this.f162357b.f107006b;
        interfaceC28891m.o(navigationTab, c30769d.f162375a);
        interfaceC28891m.o(NavigationTab.f106974j, i12);
    }
}
