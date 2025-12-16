package kp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/i;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43483i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f413225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413226b;

    public C43483i(@k String str, boolean z12) {
        this.f413225a = str;
        this.f413226b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43483i)) {
            return false;
        }
        C43483i c43483i = (C43483i) obj;
        return L.f(this.f413225a, c43483i.f413225a) && this.f413226b == c43483i.f413226b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f413226b) + (this.f413225a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageArchivingDialogState(targetApplicationId=");
        sb2.append(this.f413225a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f413226b, ')');
    }
}
