package com.avito.android.universal_map.map_mvi.di;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.di.InterfaceC35295a;
import com.avito.android.universal_map.map.di.InterfaceC35296b;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35300f;
import com.avito.android.universal_map.map.di.InterfaceC35301g;
import com.avito.android.universal_map.map.di.InterfaceC35306l;
import com.avito.android.universal_map.map.di.InterfaceC35307m;
import com.avito.android.universal_map.map.di.InterfaceC35308n;
import com.avito.android.universal_map.map.di.InterfaceC35309o;
import com.avito.android.universal_map.map.di.InterfaceC35314u;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import cv.InterfaceC39417a;
import h31.d;
import java.util.List;
import java.util.Map;
import kj.InterfaceC42698a;
import kotlin.Metadata;

/* compiled from: UniversalMapMviComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/di/b;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: UniversalMapMviComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/di/b$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k Context context, @h31.b @k Resources resources, @InterfaceC35309o @h31.b @k String str, @InterfaceC35308n @h31.b @k String str2, @InterfaceC35300f @h31.b @l String str3, @h31.b @InterfaceC35299e @k Map map, @h31.b @k UniversalMapFragmentMvi universalMapFragmentMvi, @h31.b @k r rVar, @h31.b @k UniversalMapParams.TrackerSettings trackerSettings, @h31.b @l @InterfaceC35307m ParametrizedEvent parametrizedEvent, @h31.b @l @InterfaceC35306l List list, @h31.b @l @InterfaceC35295a String str4, @InterfaceC35296b @h31.b @l Long l12, @InterfaceC35301g @h31.b @k String str5, @h31.b @l UniversalMapParams.MapSettings mapSettings, @h31.b @k Y41.l lVar, @k InterfaceC39417a interfaceC39417a, @k InterfaceC42698a interfaceC42698a, @k InterfaceC35314u interfaceC35314u);
    }

    void a(@k UniversalMapFragmentMvi universalMapFragmentMvi);
}
