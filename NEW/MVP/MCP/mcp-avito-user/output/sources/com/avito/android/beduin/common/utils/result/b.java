package com.avito.android.beduin.common.utils.result;

import Y61.k;
import com.avito.android.beduin.common.container.horizontal_slider.l;
import com.avito.android.beduin.common.utils.C28814j;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BeduinContainerWithRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/result/b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BeduinContainerWithRecyclerHeightManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@k b bVar, @k l lVar, @k ArrayList arrayList, int i12) {
            D6.l(false, lVar.getRecycler(), new d(new WeakReference(lVar), bVar, arrayList, i12));
        }
    }

    @k
    BeduinModel S();

    @k
    /* renamed from: g */
    C28814j getF103104k();
}
