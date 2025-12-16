package org.koin.core.definition;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import t71.InterfaceC48513b;

/* compiled from: KoinDefinition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/definition/e;", "R", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48513b
/* loaded from: classes7.dex */
public final /* data */ class e<R> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final t71.c f421455a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final org.koin.core.instance.e<R> f421456b;

    public e(@k t71.c cVar, @k org.koin.core.instance.e<R> eVar) {
        this.f421455a = cVar;
        this.f421456b = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f421455a, eVar.f421455a) && L.f(this.f421456b, eVar.f421456b);
    }

    public final int hashCode() {
        return this.f421456b.f421460a.hashCode() + (this.f421455a.f439151b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "KoinDefinition(module=" + this.f421455a + ", factory=" + this.f421456b + ')';
    }
}
