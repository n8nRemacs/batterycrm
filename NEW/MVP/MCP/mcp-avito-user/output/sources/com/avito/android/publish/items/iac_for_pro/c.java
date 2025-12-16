package com.avito.android.publish.items.iac_for_pro;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacForProItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f236916a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f236917b;

    public c(@l Boolean bool, @l Boolean bool2) {
        this.f236916a = bool;
        this.f236917b = bool2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f236916a, cVar.f236916a) && L.f(this.f236917b, cVar.f236917b);
    }

    public final int hashCode() {
        Boolean bool = this.f236916a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f236917b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacForProItemPayload(deviceChecked=");
        sb2.append(this.f236916a);
        sb2.append(", hasTopMargin=");
        return C0.g(sb2, this.f236917b, ')');
    }
}
