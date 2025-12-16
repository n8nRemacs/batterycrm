package com.avito.android.advert_collection_list.actions;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CollectionAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/actions/a;", "", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f82003a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82005c;

    public a(@k String str, @k String str2, @k String str3) {
        this.f82003a = str;
        this.f82004b = str2;
        this.f82005c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f82003a, aVar.f82003a) && L.f(this.f82004b, aVar.f82004b) && L.f(this.f82005c, aVar.f82005c);
    }

    public final int hashCode() {
        return this.f82005c.hashCode() + H.d(this.f82003a.hashCode() * 31, 31, this.f82004b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionAction(id=");
        sb2.append(this.f82003a);
        sb2.append(", title=");
        sb2.append(this.f82004b);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.f82005c, ')');
    }
}
