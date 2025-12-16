package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.C33091m0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelRepo.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* synthetic */ class D implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        G0 g02;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C33091m0 c33091m0 : (List) obj) {
            List list = (List) linkedHashMap.get(c33091m0.f215515b);
            if (list != null) {
                list.add(c33091m0);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                linkedHashMap.put(c33091m0.f215515b, C42745f0.e0(c33091m0));
            }
        }
        return linkedHashMap;
    }
}
