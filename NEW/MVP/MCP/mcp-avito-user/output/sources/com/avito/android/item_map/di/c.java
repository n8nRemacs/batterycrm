package com.avito.android.item_map.di;

import C11.b;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.S0;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.important_addresses.ItemCoordinates;
import com.avito.android.item_map.ItemMapFragment;
import com.avito.android.item_map.di.d;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: ItemMapComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/di/c;", "", "a", "b", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: ItemMapComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/di/c$a;", "", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@Y61.k cv.d dVar, @h31.b @Y61.k r rVar, @h31.b @Y61.k ItemMapState itemMapState, @h31.b @Y61.k ItemMapFragment itemMapFragment, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k ItemMapFragment itemMapFragment2, @d.a @h31.b @Y61.l Kundle kundle, @h31.b @Y61.l TreeClickStreamParent treeClickStreamParent, @h31.b @Y61.l @d.c Kundle kundle2, @com.avito.android.deal_confirmation.di.b @h31.b @Y61.l Kundle kundle3, @h31.b @Y61.k Resources resources, @h31.b @Y61.k S0 s02, @h31.b @Y61.l ItemCoordinates itemCoordinates, @h31.b @Y61.k JM.a aVar);
    }

    /* compiled from: ItemMapComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_map/di/c$b;", "Lcom/avito/android/di/h;", "Lcom/avito/android/advertising/di/d;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h, InterfaceC28344d {
        @Y61.k
        a M8();
    }

    void a(@Y61.k ItemMapFragment itemMapFragment);
}
