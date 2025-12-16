package com.avito.android.bottom_navigation;

import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;

/* compiled from: BottomNavigationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/m;", "Lcom/avito/android/bottom_navigation/z;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28891m extends z {

    /* compiled from: BottomNavigationView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.m$a */
    public static final class a {
    }

    void e(@Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i12, @Y61.l Integer num, @Y61.l Integer num2);

    void k(@Y61.k NavigationTabSetItem navigationTabSetItem);

    void l(@Y61.k Xj.c cVar);

    void o(@Y61.k NavigationTab navigationTab, int i12);

    void onDestroyView();

    void r(@Y61.k J j12);

    void setVisible(boolean z12);
}
