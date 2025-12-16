package com.avito.android.messenger.channels.mvi.data;

import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41988t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelRepo.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Y;", "channelEntities", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/messenger/Channel;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.data.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31717z<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.android.persistence.messenger.Y) it.next()).f215352b);
        }
        if (arrayList.size() <= 500) {
            throw null;
        }
        ArrayList arrayListR0 = C42745f0.R0(arrayList, 500, 500);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR0, 10));
        Iterator<T> it2 = arrayListR0.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        C41988t c41988tM = io.reactivex.rxjava3.core.z.m(arrayList2, F.f187174b);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        B0 b0D0 = c41988tM.D(oVar).d0(new G());
        if (arrayList.size() <= 500) {
            throw null;
        }
        ArrayList arrayListR02 = C42745f0.R0(arrayList, 500, 500);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListR02, 10));
        Iterator<T> it3 = arrayListR02.iterator();
        if (!it3.hasNext()) {
            return io.reactivex.rxjava3.core.z.k(b0D0, io.reactivex.rxjava3.core.z.m(arrayList3, C.f187173b).D(oVar).d0(new D()), new C31716y(list));
        }
        throw null;
    }
}
