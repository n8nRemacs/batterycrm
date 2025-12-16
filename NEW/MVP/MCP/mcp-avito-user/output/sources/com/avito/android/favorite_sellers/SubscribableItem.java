package com.avito.android.favorite_sellers;

import android.os.Parcelable;
import com.avito.android.InterfaceC32897n0;
import kotlin.Metadata;

/* compiled from: SubscribableItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/SubscribableItem;", "Lcom/avito/android/n0;", "Landroid/os/Parcelable;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SubscribableItem extends InterfaceC32897n0, Parcelable {

    /* compiled from: SubscribableItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void V0(boolean z12);

    @Override // com.avito.android.InterfaceC32897n0
    @Y61.l
    Boolean isNotificationsActivated();

    void setNotificationsActivated(@Y61.l Boolean bool);

    void setSubscribed(boolean z12);

    void u3(boolean z12);
}
