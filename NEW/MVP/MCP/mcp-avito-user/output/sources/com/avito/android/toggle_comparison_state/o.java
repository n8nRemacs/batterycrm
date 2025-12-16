package com.avito.android.toggle_comparison_state;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/o;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f301622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f301623b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f301624c;

    public o(@Y61.k a aVar, @Y61.k ArrayList arrayList, @Y61.k String str) {
        this.f301622a = aVar;
        this.f301623b = arrayList;
        this.f301624c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f301622a.equals(oVar.f301622a) && this.f301623b.equals(oVar.f301623b) && L.f(this.f301624c, oVar.f301624c);
    }

    public final int hashCode() {
        return this.f301624c.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f301623b, this.f301622a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Comparison(alert=");
        sb2.append(this.f301622a);
        sb2.append(", items=");
        sb2.append(this.f301623b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f301624c, ')');
    }
}
