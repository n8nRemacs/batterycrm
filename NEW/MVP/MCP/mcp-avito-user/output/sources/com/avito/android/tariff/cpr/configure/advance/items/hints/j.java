package com.avito.android.tariff.cpr.configure.advance.items.hints;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureHintsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/hints/j;", "", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f295285a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f295286b;

    public j(@k AttributedText attributedText, @k Image image) {
        this.f295285a = attributedText;
        this.f295286b = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f295285a, jVar.f295285a) && L.f(this.f295286b, jVar.f295286b);
    }

    public final int hashCode() {
        return this.f295286b.hashCode() + (this.f295285a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hint(description=");
        sb2.append(this.f295285a);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f295286b, ')');
    }
}
