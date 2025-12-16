package com.yandex.div.core.view2.errors;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ErrorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/errors/o;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f369092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369094c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f369095d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f369096e;

    public o() {
        this(false, 0, 0, null, null, 31, null);
    }

    public static o a(o oVar, boolean z12, int i12, int i13, String str, String str2, int i14) {
        if ((i14 & 1) != 0) {
            z12 = oVar.f369092a;
        }
        boolean z13 = z12;
        if ((i14 & 2) != 0) {
            i12 = oVar.f369093b;
        }
        int i15 = i12;
        if ((i14 & 4) != 0) {
            i13 = oVar.f369094c;
        }
        int i16 = i13;
        if ((i14 & 8) != 0) {
            str = oVar.f369095d;
        }
        String str3 = str;
        if ((i14 & 16) != 0) {
            str2 = oVar.f369096e;
        }
        oVar.getClass();
        return new o(i15, i16, str3, str2, z13);
    }

    @Y61.k
    public final String b() {
        int i12 = this.f369094c;
        int i13 = this.f369093b;
        if (i13 <= 0 || i12 <= 0) {
            return i12 > 0 ? String.valueOf(i12) : i13 > 0 ? String.valueOf(i13) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i13);
        sb2.append('/');
        sb2.append(i12);
        return sb2.toString();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f369092a == oVar.f369092a && this.f369093b == oVar.f369093b && this.f369094c == oVar.f369094c && L.f(this.f369095d, oVar.f369095d) && L.f(this.f369096e, oVar.f369096e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z12 = this.f369092a;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        return this.f369096e.hashCode() + H.d(androidx.appcompat.app.r.e(this.f369094c, androidx.appcompat.app.r.e(this.f369093b, r02 * 31, 31), 31), 31, this.f369095d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorViewModel(showDetails=");
        sb2.append(this.f369092a);
        sb2.append(", errorCount=");
        sb2.append(this.f369093b);
        sb2.append(", warningCount=");
        sb2.append(this.f369094c);
        sb2.append(", errorDetails=");
        sb2.append(this.f369095d);
        sb2.append(", warningDetails=");
        return C22026a.c(sb2, this.f369096e, ')');
    }

    public o(int i12, int i13, @Y61.k String str, @Y61.k String str2, boolean z12) {
        this.f369092a = z12;
        this.f369093b = i12;
        this.f369094c = i13;
        this.f369095d = str;
        this.f369096e = str2;
    }

    public /* synthetic */ o(boolean z12, int i12, int i13, String str, String str2, int i14, C42822w c42822w) {
        this((i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? "" : str2, (i14 & 1) != 0 ? false : z12);
    }
}
