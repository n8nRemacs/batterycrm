package com.akita.compose.component.tooltip;

import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.modifier.f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TooltipBox.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/tooltip/g;", "", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f63490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TooltipToAnchorPosition f63491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TooltipTailPosition f63492c;

    static {
        f.a aVar = com.akita.compose.foundation.modifier.f.f63621c;
    }

    public g(@Y61.k w wVar, @Y61.k TooltipToAnchorPosition tooltipToAnchorPosition, @Y61.k TooltipTailPosition tooltipTailPosition) {
        this.f63490a = wVar;
        this.f63491b = tooltipToAnchorPosition;
        this.f63492c = tooltipTailPosition;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f63490a, gVar.f63490a) && this.f63491b == gVar.f63491b && this.f63492c == gVar.f63492c;
    }

    public final int hashCode() {
        return this.f63492c.hashCode() + ((this.f63491b.hashCode() + (this.f63490a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "TooltipInfo(style=" + this.f63490a + ", tooltipToAnchorPosition=" + this.f63491b + ", tailPosition=" + this.f63492c + ')';
    }
}
