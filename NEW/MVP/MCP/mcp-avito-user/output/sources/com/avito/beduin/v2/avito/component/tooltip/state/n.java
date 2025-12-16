package com.avito.beduin.v2.avito.component.tooltip.state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTooltipStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/n;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f335452a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335453b;

    public n(@Y61.l String str, @Y61.k String str2) {
        this.f335452a = str;
        this.f335453b = str2;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF335453b() {
        return this.f335453b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF335452a() {
        return this.f335452a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f335452a, nVar.f335452a) && L.f(this.f335453b, nVar.f335453b);
    }

    public final int hashCode() {
        String str = this.f335452a;
        return this.f335453b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTooltipStylePatch(themeName=");
        sb2.append(this.f335452a);
        sb2.append(", styleName=");
        return C22026a.c(sb2, this.f335453b, ')');
    }
}
