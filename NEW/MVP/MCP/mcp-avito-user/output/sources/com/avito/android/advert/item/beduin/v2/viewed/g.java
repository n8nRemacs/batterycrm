package com.avito.android.advert.item.beduin.v2.viewed;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ViewedTagState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/viewed/g;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f73384a;

    public g(@k String str) {
        this.f73384a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && L.f(this.f73384a, ((g) obj).f73384a);
    }

    public final int hashCode() {
        return this.f73384a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ViewedTagState(itemId="), this.f73384a, ')');
    }
}
