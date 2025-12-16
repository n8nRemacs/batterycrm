package com.avito.android.lib.beduin_v2.beduin_item.stateless;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.engine.component.B;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: BeduinItemBlueprintFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/d;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/c;", "<init>", "()V", "_design-modules_beduin-v2_beduin-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.lib.beduin_v2.beduin_item.stateless.c
    @k
    public final g a(@k String str, @k InterfaceC42726C interfaceC42726C, @k ScreenPerformanceTracker screenPerformanceTracker, @k aU0.b bVar, @k B b12) {
        return new g(str, interfaceC42726C, screenPerformanceTracker, bVar, b12);
    }
}
