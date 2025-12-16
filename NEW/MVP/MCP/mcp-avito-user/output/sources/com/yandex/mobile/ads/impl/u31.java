package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;
import com.yandex.mobile.ads.common.AdError;

/* loaded from: classes8.dex */
public final class u31 implements AdError {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f390442a;

    public u31(@Y61.k String str) {
        this.f390442a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u31) && kotlin.jvm.internal.L.f(this.f390442a, ((u31) obj).f390442a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    @Y61.k
    public final String getDescription() {
        return this.f390442a;
    }

    public final int hashCode() {
        return this.f390442a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(Cif.a("SimpleAdError(errorDescription="), this.f390442a, ')');
    }
}
