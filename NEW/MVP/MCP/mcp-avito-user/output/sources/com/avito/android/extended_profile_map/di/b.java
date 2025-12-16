package com.avito.android.extended_profile_map.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.di.B;
import com.avito.android.extended_profile_map.ExtendedProfileMapFragment;
import com.avito.android.extended_profile_map.di.f;
import cv.InterfaceC39417a;
import h31.d;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMapComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_map/di/b;", "", "a", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileMapComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/di/b$a;", "", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @l AvitoMapPoint avitoMapPoint, @h31.b @k Set set, @h31.b @k S0 s02, @h31.b @k Resources resources, @h31.b @k @f.c String str, @f.b @h31.b @l String str2, @h31.b @k C28478k c28478k, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k ExtendedProfileMapFragment extendedProfileMapFragment);
}
