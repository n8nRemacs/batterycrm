package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/A;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f111798a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f111799b;

    public A(@Y61.k String str, @Y61.l String str2) {
        this.f111798a = str;
        this.f111799b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a12 = (A) obj;
        return L.f(this.f111798a, a12.f111798a) && L.f(this.f111799b, a12.f111799b);
    }

    public final int hashCode() {
        int iHashCode = this.f111798a.hashCode() * 31;
        String str = this.f111799b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SerpMapSelectDatesButtonState(title=");
        sb2.append(this.f111798a);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f111799b, ')');
    }
}
