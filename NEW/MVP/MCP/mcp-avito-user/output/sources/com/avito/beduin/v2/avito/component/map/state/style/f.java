package com.avito.beduin.v2.avito.component.map.state.style;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CircleLocationStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/f;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334734a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334735b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334736c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334737d;

    public f(@Y61.k com.avito.beduin.v2.theme.f<r.b> fVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar3, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar4) {
        this.f334734a = fVar;
        this.f334735b = fVar2;
        this.f334736c = fVar3;
        this.f334737d = fVar4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f334734a, fVar.f334734a) && L.f(this.f334735b, fVar.f334735b) && L.f(this.f334736c, fVar.f334736c) && L.f(this.f334737d, fVar.f334737d);
    }

    public final int hashCode() {
        return this.f334737d.hashCode() + C31685o.f(this.f334736c, C31685o.f(this.f334735b, this.f334734a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CircleLocationStyle(strokeColor=");
        sb2.append(this.f334734a);
        sb2.append(", fillColor=");
        sb2.append(this.f334735b);
        sb2.append(", strokeWidth=");
        sb2.append(this.f334736c);
        sb2.append(", radius=");
        return C31685o.o(sb2, this.f334737d, ')');
    }
}
