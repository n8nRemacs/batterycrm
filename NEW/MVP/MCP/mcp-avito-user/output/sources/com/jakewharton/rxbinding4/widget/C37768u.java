package com.jakewharton.rxbinding4.widget;

import android.widget.RatingBar;
import kotlin.Metadata;

/* compiled from: RatingBarRatingChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/u;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37768u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingBar f364245a;

    /* renamed from: b, reason: collision with root package name */
    public final float f364246b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f364247c;

    public C37768u(@Y61.k RatingBar ratingBar, float f12, boolean z12) {
        this.f364245a = ratingBar;
        this.f364246b = f12;
        this.f364247c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37768u)) {
            return false;
        }
        C37768u c37768u = (C37768u) obj;
        return kotlin.jvm.internal.L.f(this.f364245a, c37768u.f364245a) && Float.compare(this.f364246b, c37768u.f364246b) == 0 && this.f364247c == c37768u.f364247c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        RatingBar ratingBar = this.f364245a;
        int iD2 = androidx.appcompat.app.r.d(this.f364246b, (ratingBar != null ? ratingBar.hashCode() : 0) * 31, 31);
        boolean z12 = this.f364247c;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iD2 + i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingBarChangeEvent(view=");
        sb2.append(this.f364245a);
        sb2.append(", rating=");
        sb2.append(this.f364246b);
        sb2.append(", fromUser=");
        return androidx.appcompat.app.r.s(")", sb2, this.f364247c);
    }
}
