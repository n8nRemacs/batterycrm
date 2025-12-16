package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ModifierBuilderParams.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f338088a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338089b;

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f338088a == mVar.f338088a && this.f338089b == mVar.f338089b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f338089b) + (Boolean.hashCode(this.f338088a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifierBuilderParams(ignoreWidth=");
        sb2.append(this.f338088a);
        sb2.append(", ignoreHeight=");
        return androidx.appcompat.app.r.x(sb2, this.f338089b, ')');
    }

    public m(boolean z12, boolean z13) {
        this.f338088a = z12;
        this.f338089b = z13;
    }

    public /* synthetic */ m(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
