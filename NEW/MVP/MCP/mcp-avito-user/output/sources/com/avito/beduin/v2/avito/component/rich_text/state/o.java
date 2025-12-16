package com.avito.beduin.v2.avito.component.rich_text.state;

import com.avito.beduin.v2.engine.component.InterfaceC36248h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RichTextSegmentStyle.kt */
@InterfaceC36248h
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334946a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334947b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334948c;

    public o(@Y61.l com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, boolean z12, boolean z13) {
        this.f334946a = lVar;
        this.f334947b = z12;
        this.f334948c = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f334946a, oVar.f334946a) && this.f334947b == oVar.f334947b && this.f334948c == oVar.f334948c;
    }

    public final int hashCode() {
        com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar = this.f334946a;
        return Boolean.hashCode(this.f334948c) + androidx.appcompat.app.r.i((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f334947b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RichTextSegmentStyle(textStyle=");
        sb2.append(this.f334946a);
        sb2.append(", underline=");
        sb2.append(this.f334947b);
        sb2.append(", strikethrough=");
        return androidx.appcompat.app.r.x(sb2, this.f334948c, ')');
    }
}
