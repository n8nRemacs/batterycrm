package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di;

import C11.b;
import Y61.k;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import cU.q;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i;
import com.avito.android.lib.beduin_v2.feature.di.C0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileBeduinLocalComponents.kt */
@C11.b
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c;", "Lcom/avito/android/lib/beduin_v2/feature/di/C0;", "LcU/q;", "a", "b", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* loaded from: classes13.dex */
public interface c extends C0, q {

    /* compiled from: ExtendedProfileBeduinLocalComponents.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c$a;", "", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@h31.b @k Y41.a<com.avito.konveyor.a> aVar, @h31.b @k com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f fVar, @h31.b @k C23424o.f<TV0.a> fVar2, @h31.b @k Y41.a<? extends GridLayoutManager> aVar2, @h31.b @k ScreenPerformanceTracker screenPerformanceTracker);
    }

    /* compiled from: ExtendedProfileBeduinLocalComponents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c$b;", "Lcom/avito/android/di/h;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        a Jf();
    }

    @k
    i g();
}
