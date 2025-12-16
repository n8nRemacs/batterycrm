package com.akita.compose.component.description_list;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionList.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/description_list/a;", "", "description-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f61449a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f61450b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f61451c;

    public a(@Y61.k String str, @Y61.k p pVar, @Y61.k Y41.a<G0> aVar) {
        this.f61449a = str;
        this.f61450b = pVar;
        this.f61451c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f61449a, aVar.f61449a) && L.f(this.f61450b, aVar.f61450b) && L.f(this.f61451c, aVar.f61451c);
    }

    public final int hashCode() {
        return this.f61451c.hashCode() + s.b(this.f61450b, this.f61449a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionListIconData(textIcon=");
        sb2.append(this.f61449a);
        sb2.append(", tint=");
        sb2.append(this.f61450b);
        sb2.append(", onIconClick=");
        return r.v(sb2, this.f61451c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, p pVar, Y41.a aVar, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            p.f63635e.getClass();
            pVar = p.f63636f;
        }
        this(str, pVar, aVar);
    }
}
