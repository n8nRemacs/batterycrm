package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModifierBuilderResult.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/compose/n;", "", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.v f338090a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338091b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f338092c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f338093d;

    public n(@Y61.k androidx.compose.ui.v vVar, boolean z12, boolean z13, boolean z14) {
        this.f338090a = vVar;
        this.f338091b = z12;
        this.f338092c = z13;
        this.f338093d = z14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f338090a, nVar.f338090a) && this.f338091b == nVar.f338091b && this.f338092c == nVar.f338092c && this.f338093d == nVar.f338093d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f338093d) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f338090a.hashCode() * 31, 31, this.f338091b), 31, this.f338092c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifierBuilderResult(modifier=");
        sb2.append(this.f338090a);
        sb2.append(", isWrapHeight=");
        sb2.append(this.f338091b);
        sb2.append(", isWrapWidth=");
        sb2.append(this.f338092c);
        sb2.append(", parentUseIntrinsicSize=");
        return androidx.appcompat.app.r.x(sb2, this.f338093d, ')');
    }
}
