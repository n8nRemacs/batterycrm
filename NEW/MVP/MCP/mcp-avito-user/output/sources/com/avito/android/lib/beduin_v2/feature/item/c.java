package com.avito.android.lib.beduin_v2.feature.item;

import Y61.k;
import android.widget.FrameLayout;
import cU0.InterfaceC27108f;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.engine.component.z;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: BeduinItemFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/item/c;", "Lcom/avito/android/lib/beduin_v2/feature/item/b;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.b
    @k
    public final f a(@k ZS.b bVar, @k FrameLayout frameLayout, @k InterfaceC27108f interfaceC27108f, @k ScreenPerformanceTracker screenPerformanceTracker, @k z zVar, boolean z12) {
        return new f(bVar, frameLayout, interfaceC27108f, screenPerformanceTracker, zVar, z12);
    }
}
