package com.avito.beduin.v2.avito.component.button.state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonIcon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/state/x;", "Lcom/avito/beduin/v2/avito/component/button/state/v;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x extends v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333994a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f333995b;

    public x(@Y61.k String str, @Y61.l String str2) {
        super(null);
        this.f333994a = str;
        this.f333995b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f333994a, xVar.f333994a) && L.f(this.f333995b, xVar.f333995b);
    }

    public final int hashCode() {
        int iHashCode = this.f333994a.hashCode() * 31;
        String str = this.f333995b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonLocalIcon(name=");
        sb2.append(this.f333994a);
        sb2.append(", themeName=");
        return C22026a.c(sb2, this.f333995b, ')');
    }
}
