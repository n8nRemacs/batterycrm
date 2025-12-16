package com.avito.beduin.v2.avito.component.rich_text.state;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RichTextSegmentStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/m;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334944b;

    public m(@Y61.l com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar) {
        this.f334943a = lVar;
        this.f334944b = fVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f334943a, mVar.f334943a) && L.f(this.f334944b, mVar.f334944b);
    }

    public final int hashCode() {
        com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar = this.f334943a;
        return this.f334944b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RichStrikethroughTextSegmentStyle(textStyle=");
        sb2.append(this.f334943a);
        sb2.append(", strikethroughColor=");
        return C31685o.o(sb2, this.f334944b, ')');
    }
}
