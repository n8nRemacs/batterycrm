package com.avito.android.toggle_comparison_state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/p;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f301625a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f301626b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f301627c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f301628d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f301629e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f301630f;

    public p(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, boolean z12, boolean z13) {
        this.f301625a = str;
        this.f301626b = str2;
        this.f301627c = str3;
        this.f301628d = z12;
        this.f301629e = z13;
        this.f301630f = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f301625a, pVar.f301625a) && L.f(this.f301626b, pVar.f301626b) && L.f(this.f301627c, pVar.f301627c) && this.f301628d == pVar.f301628d && this.f301629e == pVar.f301629e && L.f(this.f301630f, pVar.f301630f);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f301625a.hashCode() * 31, 31, this.f301626b);
        String str = this.f301627c;
        return this.f301630f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f301628d), 31, this.f301629e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonData(itemId=");
        sb2.append(this.f301625a);
        sb2.append(", categoryId=");
        sb2.append(this.f301626b);
        sb2.append(", searchContext=");
        sb2.append(this.f301627c);
        sb2.append(", isAdded=");
        sb2.append(this.f301628d);
        sb2.append(", forceAdd=");
        sb2.append(this.f301629e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f301630f, ')');
    }

    public /* synthetic */ p(String str, String str2, String str3, boolean z12, boolean z13, String str4, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, str4, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
    }
}
