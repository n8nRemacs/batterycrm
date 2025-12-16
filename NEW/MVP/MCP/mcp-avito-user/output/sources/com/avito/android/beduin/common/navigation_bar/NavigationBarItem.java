package com.avito.android.beduin.common.navigation_bar;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;

/* compiled from: NavigationBarItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface NavigationBarItem extends Parcelable {

    /* compiled from: NavigationBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    BeduinModel toBeduinModel(@l UniversalColor universalColor);
}
