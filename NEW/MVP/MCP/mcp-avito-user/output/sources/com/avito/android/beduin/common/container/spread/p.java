package com.avito.android.beduin.common.container.spread;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: UsedWidth.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/p;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f103215a;

    public p(int i12) {
        this.f103215a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f103215a == ((p) obj).f103215a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103215a);
    }

    @Y61.k
    public final String toString() {
        return r.t(new StringBuilder("UsedWidth(value="), this.f103215a, ')');
    }
}
