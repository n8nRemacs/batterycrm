package com.avito.android.rating_ui.aspects.view.button;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAspectsButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/b;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f249914a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f249915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f249916c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f249917d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f249918e;

    public b() {
        this(null, null, false, false, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f249914a, bVar.f249914a) && L.f(this.f249915b, bVar.f249915b) && this.f249916c == bVar.f249916c && this.f249917d == bVar.f249917d && L.f(this.f249918e, bVar.f249918e);
    }

    public final int hashCode() {
        int iHashCode = this.f249914a.hashCode() * 31;
        String str = this.f249915b;
        int i12 = r.i(r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f249916c), 31, this.f249917d);
        Y41.a<G0> aVar = this.f249918e;
        return i12 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsButtonState(text=");
        sb2.append((Object) this.f249914a);
        sb2.append(", subtitle=");
        sb2.append(this.f249915b);
        sb2.append(", enabled=");
        sb2.append(this.f249916c);
        sb2.append(", isClickable=");
        sb2.append(this.f249917d);
        sb2.append(", onClick=");
        return r.v(sb2, this.f249918e, ')');
    }

    public b(CharSequence charSequence, String str, boolean z12, boolean z13, Y41.a aVar, int i12, C42822w c42822w) {
        charSequence = (i12 & 1) != 0 ? "" : charSequence;
        str = (i12 & 2) != 0 ? null : str;
        z12 = (i12 & 4) != 0 ? true : z12;
        z13 = (i12 & 8) != 0 ? true : z13;
        aVar = (i12 & 16) != 0 ? null : aVar;
        this.f249914a = charSequence;
        this.f249915b = str;
        this.f249916c = z12;
        this.f249917d = z13;
        this.f249918e = aVar;
    }
}
