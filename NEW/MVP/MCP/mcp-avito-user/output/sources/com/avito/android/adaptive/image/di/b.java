package com.avito.android.adaptive.image.di;

import Y61.k;
import android.app.Application;
import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import kotlin.Metadata;
import u3.l;

/* compiled from: AdaptiveImagePickerDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/di/b;", "Lcom/avito/android/di/h;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b extends InterfaceC29971h {
    @k
    InterfaceC28373a a();

    @k
    Application k();

    @k
    l<AdaptiveImageLoadingAbTestGroup> nd();

    @k
    H y0();
}
