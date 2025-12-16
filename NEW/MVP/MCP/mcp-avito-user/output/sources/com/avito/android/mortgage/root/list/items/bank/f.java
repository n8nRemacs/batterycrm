package com.avito.android.mortgage.root.list.items.bank;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BankItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/f;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f202355a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f202356b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f202357c;

    public f(@Y61.k String str, boolean z12, boolean z13) {
        this.f202355a = str;
        this.f202356b = z12;
        this.f202357c = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f202355a, fVar.f202355a) && this.f202356b == fVar.f202356b && this.f202357c == fVar.f202357c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202357c) + r.i(this.f202355a.hashCode() * 31, 31, this.f202356b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankItemSelectAction(title=");
        sb2.append(this.f202355a);
        sb2.append(", isEnabled=");
        sb2.append(this.f202356b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f202357c, ')');
    }

    public /* synthetic */ f(String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? false : z13);
    }
}
