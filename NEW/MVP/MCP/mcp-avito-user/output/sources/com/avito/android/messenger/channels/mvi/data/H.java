package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.remote.model.messenger.Channel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\t\u0010\t\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class H<T1, T2, R> implements l41.c {
    /* JADX WARN: Type inference failed for: r6v4, types: [R, java.util.ArrayList, java.util.Collection] */
    @Override // l41.c
    @Y61.k
    public final R apply(@Y61.k T1 t12, @Y61.k T2 t22) {
        List list = (List) t12;
        List list2 = (List) t22;
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list2) {
            linkedHashMap.put(((com.avito.android.persistence.messenger.P0) obj).f215278b, obj);
        }
        List<Channel> list3 = list;
        ?? r62 = (R) new ArrayList(C42745f0.q(list3, 10));
        for (Channel channel : list3) {
            r62.add(new kotlin.Q(channel, linkedHashMap.get(channel.getChannelId())));
        }
        return r62;
    }
}
