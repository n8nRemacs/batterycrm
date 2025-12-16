package com.avito.android.advertising.loaders.beduin.wrapper;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommercialWrapperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/wrapper/d;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f88181a;

    public d(@k String str) {
        this.f88181a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f88181a, ((d) obj).f88181a);
    }

    public final int hashCode() {
        return this.f88181a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CommercialWrapperState(id="), this.f88181a, ')');
    }
}
