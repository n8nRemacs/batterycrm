package com.avito.android.bottom_navigation.ui.fragment.factory;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: TabFragmentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory;", "", "Data", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TabFragmentFactory {

    /* compiled from: TabFragmentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Data extends Parcelable {

        /* compiled from: TabFragmentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        @k
        NavigationScreenAction W4();

        @k
        NavigationTabSetItem d2();

        boolean e0();

        @l
        Integer t3();
    }

    @k
    TabBaseFragment a(@k Data data);

    @k
    TabContainerFragment b(@k NavigationTabSetItem navigationTabSetItem);

    @k
    TabBaseFragment c(@k NavigationTabSetItem navigationTabSetItem);
}
