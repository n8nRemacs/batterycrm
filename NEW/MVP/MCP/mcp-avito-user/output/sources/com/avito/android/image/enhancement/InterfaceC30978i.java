package com.avito.android.image.enhancement;

import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/i;", "", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.image.enhancement.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC30978i {
    @Y61.k
    I0 B0();

    @Y61.k
    U C0(@Y61.k HashMap map);

    void D0(@Y61.k LinkedHashSet linkedHashSet);

    void E0();

    void F0(@Y61.k ArrayList arrayList);

    @Y61.k
    I0 G0();

    boolean H0(boolean z12);

    void I0(@Y61.k ImagesEnhancementSlotConfig imagesEnhancementSlotConfig);

    @Y61.k
    C42026y J0(@Y61.k String str, boolean z12);

    void K();

    boolean K0(@Y61.k List<Long> list);

    @Y61.k
    I0 getError();

    @Y61.k
    I0 getState();

    @Y61.k
    I0 w();
}
