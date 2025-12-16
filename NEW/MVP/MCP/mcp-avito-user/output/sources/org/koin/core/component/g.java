package org.koin.core.component;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import w71.C49465d;

/* compiled from: KoinScopeComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g {
    @k
    public static final <T> String a(@k T t12) {
        return A71.b.a(m0.f406844a.b(t12.getClass())) + '@' + t12.hashCode();
    }

    @k
    public static final <T> C49465d b(@k T t12) {
        return new C49465d(m0.f406844a.b(t12.getClass()));
    }
}
