package com.avito.android.favorites.compose.search;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteSearchViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/compose/search/f;", "", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f156881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156882b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f156883c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f156884d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f156885e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f156886f;

    public f() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static f a(f fVar, String str, String str2, boolean z12, String str3, String str4, String str5, int i12) {
        if ((i12 & 1) != 0) {
            str = fVar.f156881a;
        }
        String str6 = str;
        if ((i12 & 2) != 0) {
            str2 = fVar.f156882b;
        }
        String str7 = str2;
        if ((i12 & 4) != 0) {
            z12 = fVar.f156883c;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            str3 = fVar.f156884d;
        }
        String str8 = str3;
        if ((i12 & 16) != 0) {
            str4 = fVar.f156885e;
        }
        String str9 = str4;
        if ((i12 & 32) != 0) {
            str5 = fVar.f156886f;
        }
        fVar.getClass();
        return new f(str6, str7, str8, z13, str9, str5);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f156881a, fVar.f156881a) && L.f(this.f156882b, fVar.f156882b) && this.f156883c == fVar.f156883c && L.f(this.f156884d, fVar.f156884d) && L.f(this.f156885e, fVar.f156885e) && L.f(this.f156886f, fVar.f156886f);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(H.d(this.f156881a.hashCode() * 31, 31, this.f156882b), 31, this.f156883c);
        String str = this.f156884d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156885e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156886f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteSearchViewState(text=");
        sb2.append(this.f156881a);
        sb2.append(", placeholder=");
        sb2.append(this.f156882b);
        sb2.append(", focused=");
        sb2.append(this.f156883c);
        sb2.append(", emptyTitle=");
        sb2.append(this.f156884d);
        sb2.append(", emptySubtitle=");
        sb2.append(this.f156885e);
        sb2.append(", emptyButtonTitle=");
        return C22026a.c(sb2, this.f156886f, ')');
    }

    public f(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5) {
        this.f156881a = str;
        this.f156882b = str2;
        this.f156883c = z12;
        this.f156884d = str3;
        this.f156885e = str4;
        this.f156886f = str5;
    }

    public /* synthetic */ f(String str, String str2, boolean z12, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 8) != 0 ? null : str3, (i12 & 4) != 0 ? false : z12, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5);
    }
}
