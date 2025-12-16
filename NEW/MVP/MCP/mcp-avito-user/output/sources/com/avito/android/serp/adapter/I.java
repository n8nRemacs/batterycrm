package com.avito.android.serp.adapter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SerpItemSizeAdjuster.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/I;", "Lcom/avito/android/serp/adapter/V0;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class I implements V0 {
    @Override // com.avito.android.serp.adapter.V0
    @Y61.k
    public final List a(int i12, @Y61.k List list) {
        int i13;
        int i14;
        String str;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (Object obj : list) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                C42745f0.H0();
                throw null;
            }
            int iB2 = b((l1) obj) + i16;
            if (iB2 >= i12 || i15 == list.size() - 1) {
                List<O0> listSubList = list.subList(i17, i18);
                List<O0> list2 = listSubList;
                boolean z12 = list2 instanceof Collection;
                if (z12 && list2.isEmpty()) {
                    i13 = 0;
                } else {
                    Iterator it = list2.iterator();
                    i13 = 0;
                    while (it.hasNext()) {
                        if ((((O0) it.next()) instanceof InterfaceC34687b) && (i13 = i13 + 1) < 0) {
                            C42745f0.G0();
                            throw null;
                        }
                    }
                }
                if (i13 == 1 && listSubList.size() == 1) {
                    for (O0 o02 : listSubList) {
                        if (o02 instanceof InterfaceC34687b) {
                            ((InterfaceC34687b) o02).setFullSize(true);
                        }
                    }
                } else {
                    if (z12 && list2.isEmpty()) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (O0 o03 : list2) {
                            if ((o03 instanceof AdvertItem) && (str = ((AdvertItem) o03).f268466v) != null && str.length() != 0 && (i14 = i14 + 1) < 0) {
                                C42745f0.G0();
                                throw null;
                            }
                        }
                    }
                    if (i14 > 0) {
                        for (O0 o04 : list2) {
                            if (o04 instanceof InterfaceC34687b) {
                                ((InterfaceC34687b) o04).setFullSize(true);
                            }
                        }
                    }
                }
                i16 = 0;
                i17 = i18;
            } else {
                i16 = iB2;
            }
            i15 = i18;
        }
        return list;
    }

    public abstract int b(@Y61.k l1 l1Var);
}
