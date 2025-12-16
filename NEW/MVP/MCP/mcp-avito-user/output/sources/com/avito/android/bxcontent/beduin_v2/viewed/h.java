package com.avito.android.bxcontent.beduin_v2.viewed;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxViewedTagState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/viewed/h;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f109550a;

    public h(@k String str) {
        this.f109550a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f109550a, ((h) obj).f109550a);
    }

    public final int hashCode() {
        return this.f109550a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("BxViewedTagState(itemId="), this.f109550a, ')');
    }
}
