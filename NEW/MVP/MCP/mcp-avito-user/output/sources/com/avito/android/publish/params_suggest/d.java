package com.avito.android.publish.params_suggest;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiParamSuggest.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/params_suggest/d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f238185a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<String> f238186b;

    public d(@Y61.k String str, @Y61.l List<String> list) {
        this.f238185a = str;
        this.f238186b = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f238185a, dVar.f238185a) && L.f(this.f238186b, dVar.f238186b);
    }

    public final int hashCode() {
        int iHashCode = this.f238185a.hashCode() * 31;
        List<String> list = this.f238186b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiParamSuggest(id=");
        sb2.append(this.f238185a);
        sb2.append(", values=");
        return H.p(sb2, this.f238186b, ')');
    }
}
