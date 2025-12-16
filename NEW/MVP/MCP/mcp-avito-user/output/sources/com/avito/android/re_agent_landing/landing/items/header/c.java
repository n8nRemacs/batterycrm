package com.avito.android.re_agent_landing.landing.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250761b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250762c;

    public c(String str, String str2, int i12, C42822w c42822w) {
        this.f250761b = (i12 & 1) != 0 ? "header_item" : str;
        this.f250762c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f250761b, cVar.f250761b) && L.f(this.f250762c, cVar.f250762c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF248579b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248579b() {
        return this.f250761b;
    }

    public final int hashCode() {
        return this.f250762c.hashCode() + (this.f250761b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f250761b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f250762c, ')');
    }
}
