package com.avito.android.lib.design.tab_bar;

import Y61.k;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.lib.design.badge.Badge;
import kotlin.Metadata;

/* compiled from: ITabBarItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    AppCompatImageView getIcon();

    @k
    Badge getNotification();

    @k
    b getTabBarItem();

    void setTabBarItem(@k b bVar);
}
