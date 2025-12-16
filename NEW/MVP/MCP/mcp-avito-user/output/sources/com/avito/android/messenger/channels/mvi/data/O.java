package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.C33091m0;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ChannelEntityConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/O;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f187184a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f187185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f187186c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f187187d;

    public O(@Y61.k ArrayList arrayList, @Y61.k LinkedHashSet linkedHashSet, @Y61.k LinkedHashSet linkedHashSet2, @Y61.k ArrayList arrayList2) {
        this.f187184a = arrayList;
        this.f187185b = linkedHashSet;
        this.f187186c = linkedHashSet2;
        this.f187187d = arrayList2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsDbEntities(\n            |   channelEntities=(");
        ArrayList arrayList = this.f187184a;
        sb2.append(arrayList.size());
        sb2.append(')');
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.avito.android.persistence.messenger.Y) it.next()).f215352b);
        }
        sb2.append(arrayList2);
        sb2.append(", \n            |   userEntities=(");
        LinkedHashSet linkedHashSet = this.f187185b;
        sb2.append(linkedHashSet.size());
        sb2.append(')');
        ArrayList arrayList3 = new ArrayList(C42745f0.q(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((c3) it2.next()).f215421b);
        }
        sb2.append(arrayList3);
        sb2.append(", \n            |   channelTags=(");
        LinkedHashSet linkedHashSet2 = this.f187186c;
        sb2.append(linkedHashSet2.size());
        sb2.append(')');
        ArrayList arrayList4 = new ArrayList(C42745f0.q(linkedHashSet2, 10));
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C33091m0) it3.next()).f215516c);
        }
        sb2.append(arrayList4);
        sb2.append(", \n            |   lastMessages=(");
        ArrayList arrayList5 = this.f187187d;
        sb2.append(arrayList5.size());
        sb2.append(')');
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((O1) it4.next()).f215240c);
        }
        sb2.append(arrayList6);
        sb2.append("\n            |)");
        return C43066x.F0(sb2.toString());
    }
}
