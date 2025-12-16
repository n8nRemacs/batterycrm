package com.avito.android.util;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: SearchContextWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/f5;", "", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.f5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C35792f5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f318872a;

    public C35792f5(@Y61.l String str) {
        this.f318872a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35792f5) && kotlin.jvm.internal.L.f(this.f318872a, ((C35792f5) obj).f318872a);
    }

    public final int hashCode() {
        String str = this.f318872a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("SearchContextWrapper(context="), this.f318872a, ')');
    }
}
