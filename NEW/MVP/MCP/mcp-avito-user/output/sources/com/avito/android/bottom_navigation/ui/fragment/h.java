package com.avito.android.bottom_navigation.ui.fragment;

import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: ShouldRetainCurrentTab.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/h;", "", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h {

    /* renamed from: O1, reason: collision with root package name */
    @Y61.k
    public static final a f107155O1 = a.f107156a;

    /* compiled from: ShouldRetainCurrentTab.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/h$a;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f107156a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Set<NavigationTabSetItem> f107157b = C42756l.l0(new NavigationTabSetItem[]{NavigationTab.f106970f, NavigationTab.f106971g, NavigationTab.f106975k, GlobalNavigationTab.f106937f, GlobalNavigationTab.f106938g});
    }

    @Y61.k
    TabFragmentFactory.Data a(@Y61.k NavigationTabSetItem navigationTabSetItem);
}
