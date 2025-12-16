package com.avito.android.rating_ui.aspects;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.rating_ui.aspects.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAspectsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/d;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a.C7491a> f249871a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f249872b;

    public d(@k List<a.C7491a> list, boolean z12) {
        this.f249871a = list;
        this.f249872b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f249871a, dVar.f249871a) && this.f249872b == dVar.f249872b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249872b) + (this.f249871a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsItemPayload(aspects=");
        sb2.append(this.f249871a);
        sb2.append(", disabled=");
        return r.x(sb2, this.f249872b, ')');
    }
}
