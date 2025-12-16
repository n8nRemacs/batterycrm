package com.yandex.div.evaluable;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FunctionArgument.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/h;", "", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final EvaluableType f369947a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f369948b;

    public h(@k EvaluableType evaluableType, boolean z12) {
        this.f369947a = evaluableType;
        this.f369948b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f369947a == hVar.f369947a && this.f369948b == hVar.f369948b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f369947a.hashCode() * 31;
        boolean z12 = this.f369948b;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode + i12;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FunctionArgument(type=");
        sb2.append(this.f369947a);
        sb2.append(", isVariadic=");
        return r.x(sb2, this.f369948b, ')');
    }

    public /* synthetic */ h(EvaluableType evaluableType, boolean z12, int i12, C42822w c42822w) {
        this(evaluableType, (i12 & 2) != 0 ? false : z12);
    }
}
