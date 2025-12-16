package com.avito.beduin.v2.avito.component.rich_text.state;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/z;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/q;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/w;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z implements q, w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334976a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334977b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final o f334978c;

    public z(@Y61.k String str, @Y61.k String str2, @Y61.l o oVar) {
        this.f334976a = str;
        this.f334977b = str2;
        this.f334978c = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f334976a, zVar.f334976a) && L.f(this.f334977b, zVar.f334977b) && L.f(this.f334978c, zVar.f334978c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f334976a.hashCode() * 31, 31, this.f334977b);
        o oVar = this.f334978c;
        return iD2 + (oVar == null ? 0 : oVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "WebLink(text=" + this.f334976a + ", link=" + this.f334977b + ", style=" + this.f334978c + ')';
    }
}
