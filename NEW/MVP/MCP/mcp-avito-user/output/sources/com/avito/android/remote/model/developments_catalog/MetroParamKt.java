package com.avito.android.remote.model.developments_catalog;

import Y61.k;
import com.avito.android.remote.model.GeoReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import q50.InterfaceC47203a;

/* compiled from: MetroParam.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toGeoReference", "Lcom/avito/android/remote/model/GeoReference;", "Lcom/avito/android/remote/model/developments_catalog/MetroParam;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class MetroParamKt {
    @k
    public static final GeoReference toGeoReference(@k MetroParam metroParam) {
        ArrayList arrayList;
        List<MetroLine> lines = metroParam.getLines();
        if (lines != null) {
            List<MetroLine> list = lines;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C43066x.a0(((MetroLine) it.next()).getColor(), "0x", "#", true));
            }
        } else {
            arrayList = null;
        }
        return new GeoReference(arrayList, metroParam.getName(), metroParam.getDistance(), metroParam.getDistanceInTime(), null, 16, null);
    }
}
