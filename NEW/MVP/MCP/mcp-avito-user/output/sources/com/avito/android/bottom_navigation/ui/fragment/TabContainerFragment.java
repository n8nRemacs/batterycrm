package com.avito.android.bottom_navigation.ui.fragment;

import androidx.fragment.app.Fragment;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import kotlin.Metadata;

/* compiled from: TabContainerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TabContainerFragment extends Fragment {
    public abstract void b5(@Y61.k Fragment fragment, @Y61.l Integer num, @Y61.k NavigationScreenAction navigationScreenAction);

    public abstract boolean d5(boolean z12, boolean z13);

    @Y61.l
    public abstract Fragment e5();

    public abstract void f5(@Y61.k NavigationScreenAction navigationScreenAction);

    public abstract boolean g5();

    public abstract int h5();

    public abstract boolean i5(@Y61.k NavigationTabSetItem navigationTabSetItem);

    @Y61.l
    public abstract NavigationState u0();
}
