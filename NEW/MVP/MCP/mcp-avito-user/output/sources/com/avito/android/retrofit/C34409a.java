package com.avito.android.retrofit;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: ApiErrorsRelay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/a;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C34409a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApiError f255120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f255121b;

    public C34409a(@Y61.k ApiError apiError, @Y61.k String str) {
        this.f255120a = apiError;
        this.f255121b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34409a)) {
            return false;
        }
        C34409a c34409a = (C34409a) obj;
        return kotlin.jvm.internal.L.f(this.f255120a, c34409a.f255120a) && kotlin.jvm.internal.L.f(this.f255121b, c34409a.f255121b);
    }

    public final int hashCode() {
        return this.f255121b.hashCode() + (this.f255120a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiErrorWithPath(error=");
        sb2.append(this.f255120a);
        sb2.append(", requestPath=");
        return C22026a.c(sb2, this.f255121b, ')');
    }
}
