package com.avito.beduin.v2.avito.component.text.state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoWebViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/B;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335311a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f335312b;

    public B(@Y61.k String str, @Y61.l String str2) {
        this.f335311a = str;
        this.f335312b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return L.f(this.f335311a, b12.f335311a) && L.f(this.f335312b, b12.f335312b);
    }

    public final int hashCode() {
        int iHashCode = this.f335311a.hashCode() * 31;
        String str = this.f335312b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorPlaceholder(title=");
        sb2.append(this.f335311a);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f335312b, ')');
    }

    public /* synthetic */ B(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
