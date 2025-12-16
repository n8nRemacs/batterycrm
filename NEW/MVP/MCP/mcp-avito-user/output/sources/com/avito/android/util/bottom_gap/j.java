package com.avito.android.util.bottom_gap;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BottomGapProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/bottom_gap/j;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f318843a;

    public j(int i12) {
        this.f318843a = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f318843a == ((j) obj).f318843a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f318843a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("Dp(value="), this.f318843a, ')');
    }
}
