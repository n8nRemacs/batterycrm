package com.avito.konveyor.viewtype;

import TV0.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StorableViewTypeCalculatorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/viewtype/a;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f338568a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<TV0.b<?, ?>> f338569b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Class<d<?, ?>> f338570c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f338571d;

    public a() {
        throw null;
    }

    public a(@k TV0.b<?, ?> bVar) {
        int i12 = bVar.b().f15692a;
        Class cls = bVar.getClass();
        Class cls2 = bVar.a().getClass();
        String strC = bVar.getF175463a();
        this.f338568a = i12;
        this.f338569b = cls;
        this.f338570c = cls2;
        this.f338571d = strC;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f338568a == aVar.f338568a && L.f(this.f338569b, aVar.f338569b) && L.f(this.f338570c, aVar.f338570c) && L.f(this.f338571d, aVar.f338571d);
    }

    public final int hashCode() {
        return this.f338571d.hashCode() + ((this.f338570c.hashCode() + ((this.f338569b.hashCode() + (Integer.hashCode(this.f338568a) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlueprintInfo(layoutId=");
        sb2.append(this.f338568a);
        sb2.append(", blueprint=");
        sb2.append(this.f338569b);
        sb2.append(", presenter=");
        sb2.append(this.f338570c);
        sb2.append(", additionalViewType=");
        return C22026a.c(sb2, this.f338571d, ')');
    }
}
