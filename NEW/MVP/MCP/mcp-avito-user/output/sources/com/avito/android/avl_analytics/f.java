package com.avito.android.avl_analytics;

import Y61.k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.C42837c;
import kotlin.ranges.l;

/* compiled from: AvlXHashGenerator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_analytics/f;", "", "<init>", "()V", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f98445a = new f();

    @k
    public static String a() {
        ArrayList arrayListH0 = C42745f0.h0(new C42837c('0', '9'), C42745f0.f0(new C42837c('A', 'Z'), new C42837c('a', 'z')));
        l lVar = new l(1, 15, 1);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
        kotlin.ranges.k it = lVar.iterator();
        while (it.f406910d) {
            it.a();
            Character ch2 = (Character) C42745f0.j0(arrayListH0, kotlin.random.f.f406882b);
            ch2.getClass();
            arrayList.add(ch2);
        }
        return C42745f0.O(arrayList, "", null, null, null, 62);
    }
}
