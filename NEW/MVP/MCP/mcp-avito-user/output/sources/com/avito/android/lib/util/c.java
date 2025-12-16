package com.avito.android.lib.util;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangeAttempt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/util/c;", "T", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f181331a;

    /* renamed from: b, reason: collision with root package name */
    public final T f181332b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181333c;

    public c(T t12, T t13) {
        this.f181331a = t12;
        this.f181332b = t13;
        this.f181333c = L.f(t12, t13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f181331a, cVar.f181331a) && L.f(this.f181332b, cVar.f181332b);
    }

    public final int hashCode() {
        T t12 = this.f181331a;
        int iHashCode = (t12 == null ? 0 : t12.hashCode()) * 31;
        T t13 = this.f181332b;
        return iHashCode + (t13 != null ? t13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeAttempt(new=");
        sb2.append(this.f181331a);
        sb2.append(", old=");
        return H.n(sb2, this.f181332b, ')');
    }
}
