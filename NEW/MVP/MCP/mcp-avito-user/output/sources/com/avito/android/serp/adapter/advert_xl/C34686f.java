package com.avito.android.serp.adapter.advert_xl;

import Er0.C13523a;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertXlItemExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.advert_xl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34686f {
    @Y61.l
    public static final List<com.avito.android.image_loader.k> a(@Y61.l AdvertXlItem advertXlItem) {
        List listA = (advertXlItem != null ? advertXlItem.f268781e : null) != null ? C13523a.a(advertXlItem.f268781e) : advertXlItem != null ? advertXlItem.f268779d : null;
        if (!O2.a(listA)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (listA != null) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(com.avito.android.image_loader.b.a((DimmedImage) it.next()));
            }
        }
        return C42745f0.M0(arrayList);
    }
}
