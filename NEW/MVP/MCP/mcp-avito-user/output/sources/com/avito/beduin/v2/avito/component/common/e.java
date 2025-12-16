package com.avito.beduin.v2.avito.component.common;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ColorPatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/e;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334122a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334123b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334124c;

    public e(@Y61.k com.avito.beduin.v2.theme.f<r.b> fVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar2, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar3) {
        this.f334122a = fVar;
        this.f334123b = fVar2;
        this.f334124c = fVar3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f334122a, eVar.f334122a) && L.f(this.f334123b, eVar.f334123b) && L.f(this.f334124c, eVar.f334124c);
    }

    public final int hashCode() {
        return this.f334124c.hashCode() + C31685o.f(this.f334123b, this.f334122a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorPatch(default=");
        sb2.append(this.f334122a);
        sb2.append(", pressed=");
        sb2.append(this.f334123b);
        sb2.append(", disabled=");
        return C31685o.o(sb2, this.f334124c, ')');
    }
}
