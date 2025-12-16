package com.avito.android.avl_entry_public;

import Y61.l;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: ShortVideosWitcherNetworkModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry_public/ShortVideosWitcherNetworkModel;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lqs0/a;", "_avito_avl-entry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ShortVideosWitcherNetworkModel extends SerpElement, AnalyticsElement, InterfaceC47435a {
    @l
    String getTitle();

    @l
    String getXHash();

    @l
    Boolean isNew();
}
