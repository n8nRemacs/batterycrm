package com.avito.android.comfortable_deal.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendPhoneInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/domain/g;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f122020a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122021b;

    public g(@k String str, boolean z12) {
        this.f122020a = str;
        this.f122021b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f122020a, gVar.f122020a) && this.f122021b == gVar.f122021b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122021b) + (this.f122020a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendPhoneResult(msg=");
        sb2.append(this.f122020a);
        sb2.append(", isError=");
        return r.x(sb2, this.f122021b, ')');
    }
}
