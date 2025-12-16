package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.messenger.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000b\u0010\u000b\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class I<T1, T2, T3, R> implements l41.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C31714w f187175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f187176b;

    public I(C31714w c31714w, List list) {
        this.f187175a = c31714w;
        this.f187176b = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R, java.util.ArrayList] */
    @Override // l41.h
    @Y61.k
    public final R a(@Y61.k T1 t12, @Y61.k T2 t22, @Y61.k T3 t32) {
        Channel channelA;
        Map map = (Map) t32;
        Map map2 = (Map) t22;
        Map map3 = (Map) t12;
        List<com.avito.android.persistence.messenger.Y> list = this.f187176b;
        ?? r12 = (R) new ArrayList();
        for (com.avito.android.persistence.messenger.Y y12 : list) {
            List<c3> list2 = (List) map3.get(y12.f215352b);
            if (list2 != null) {
                InterfaceC31697e interfaceC31697e = this.f187175a.f187260f;
                String str = y12.f215352b;
                List list3 = (List) map2.get(str);
                channelA = interfaceC31697e.a(y12, list2, list3 != null ? list3 : C42784z0.f406748b, (O1) map.get(str));
            } else {
                channelA = null;
            }
            if (channelA != null) {
                r12.add(channelA);
            }
        }
        return r12;
    }
}
