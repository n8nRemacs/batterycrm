package com.avito.android.beduin_shared.model.utils;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import lj.d;

/* compiled from: ComponentFormTransformers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {
    public static final void a(@Y61.k lj.e eVar, @Y61.k String str, @Y61.k BeduinModelTransform... beduinModelTransformArr) {
        eVar.h(new d.e(Collections.singletonMap(str, C42756l.g0(beduinModelTransformArr))));
    }

    public static final void b(@Y61.k lj.e eVar, @Y61.k String str, @Y61.k List<? extends BeduinModel> list) {
        eVar.h(new d.k(list, str));
    }
}
