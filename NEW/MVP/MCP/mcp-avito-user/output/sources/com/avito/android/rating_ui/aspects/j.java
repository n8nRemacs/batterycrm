package com.avito.android.rating_ui.aspects;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RatingAspectsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/j;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f249887a;

    public j(@k ArrayList arrayList) {
        this.f249887a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f249887a.equals(((j) obj).f249887a);
    }

    public final int hashCode() {
        return this.f249887a.hashCode();
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("RatingAspectsState(data="), this.f249887a, ')');
    }
}
