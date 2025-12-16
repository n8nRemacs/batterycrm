package com.avito.android.messenger.map.search.di;

import Y61.k;
import Y61.l;
import com.avito.android.messenger.map.search.GeoSearchFragment;
import com.avito.android.messenger.map.search.q;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: GeoSearchFragmentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/di/b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: GeoSearchFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/di/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k GeoSearchFragment geoSearchFragment, @h31.b @k @Named("channel_id") String str, @h31.b @l @Named("center_point") GeoPoint geoPoint, @h31.b @l @Named("item_location") GeoPoint geoPoint2, @h31.b @k @Named("error_indicator_message") String str2, @h31.b @k @Named("error_indicator_action_name") String str3, @h31.b @k q.a aVar, @k c cVar);
    }

    void a(@k GeoSearchFragment geoSearchFragment);
}
