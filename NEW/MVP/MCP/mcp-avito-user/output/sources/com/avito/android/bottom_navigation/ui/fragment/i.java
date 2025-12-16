package com.avito.android.bottom_navigation.ui.fragment;

import androidx.fragment.app.Fragment;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import kotlin.Metadata;

/* compiled from: TabContainerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/i;", "", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface i {
    boolean a(@Y61.k NavigationTabSetItem navigationTabSetItem);

    void b(@Y61.k Fragment fragment, @Y61.l Integer num, boolean z12, @Y61.k NavigationScreenAction navigationScreenAction);

    int c();

    @Y61.l
    Fragment d();

    void e(@Y61.k NavigationScreenAction navigationScreenAction);

    boolean f(boolean z12, boolean z13);

    boolean g();

    @Y61.l
    NavigationState u0();
}
