package com.avito.konveyor.viewtype;

import Y61.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StorableViewTypeCalculatorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/viewtype/b;", "Lcom/avito/konveyor/viewtype/c;", "<init>", "()V", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f338572a = new LinkedHashMap();

    public final int a(@k TV0.b<?, ?> bVar) {
        a aVar = new a(bVar);
        LinkedHashMap linkedHashMap = this.f338572a;
        Object objValueOf = linkedHashMap.get(aVar);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(aVar, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }
}
