package com.avito.android.universal_map.map.di;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.UniversalMapFragment;
import cv.InterfaceC39417a;
import h31.d;
import java.util.List;
import java.util.Map;
import kj.InterfaceC42698a;
import kotlin.Metadata;

/* compiled from: UniversalMapComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/di/t;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.universal_map.map.di.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35313t {

    /* compiled from: UniversalMapComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/di/t$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.di.t$a */
    public interface a {
        @Y61.k
        InterfaceC35313t a(@h31.b @Y61.k Context context, @h31.b @Y61.k Resources resources, @InterfaceC35309o @h31.b @Y61.k String str, @InterfaceC35308n @h31.b @Y61.k String str2, @InterfaceC35300f @h31.b @Y61.l String str3, @h31.b @InterfaceC35299e @Y61.k Map map, @h31.b @Y61.k UniversalMapFragment universalMapFragment, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @Y61.k UniversalMapParams.TrackerSettings trackerSettings, @h31.b @Y61.l @InterfaceC35307m ParametrizedEvent parametrizedEvent, @h31.b @Y61.l @InterfaceC35306l List list, @h31.b @Y61.l @InterfaceC35295a String str4, @InterfaceC35296b @h31.b @Y61.l Long l12, @InterfaceC35301g @h31.b @Y61.k String str5, @h31.b @Y61.l UniversalMapParams.MapSettings mapSettings, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k InterfaceC42698a interfaceC42698a, @Y61.k InterfaceC35314u interfaceC35314u);
    }

    void a(@Y61.k UniversalMapFragment universalMapFragment);
}
