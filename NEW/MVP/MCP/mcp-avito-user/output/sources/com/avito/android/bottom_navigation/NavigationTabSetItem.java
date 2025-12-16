package com.avito.android.bottom_navigation;

import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NavigationTabSetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface NavigationTabSetItem extends Parcelable {
    boolean e0();

    int getIcon();

    @Y61.k
    String getName();

    int getTitle();

    int s4();
}
