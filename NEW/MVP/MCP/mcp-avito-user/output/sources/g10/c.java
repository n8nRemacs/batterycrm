package G10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import z10.C50349b;

/* compiled from: OffersDescriptionDialogState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG10/c;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<C50349b> f6191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f6193c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6194d;

    public c(int i12, @k String str, boolean z12, @k List list) {
        this.f6191a = list;
        this.f6192b = i12;
        this.f6193c = str;
        this.f6194d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, ArrayList arrayList, int i12, boolean z12, int i13) {
        List list = arrayList;
        if ((i13 & 1) != 0) {
            list = cVar.f6191a;
        }
        if ((i13 & 2) != 0) {
            i12 = cVar.f6192b;
        }
        if ((i13 & 8) != 0) {
            z12 = cVar.f6194d;
        }
        return new c(i12, cVar.f6193c, z12, list);
    }

    @k
    public final C50349b b() {
        return this.f6191a.get(this.f6192b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6191a, cVar.f6191a) && this.f6192b == cVar.f6192b && L.f(this.f6193c, cVar.f6193c) && this.f6194d == cVar.f6194d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6194d) + H.d(r.e(this.f6192b, this.f6191a.hashCode() * 31, 31), 31, this.f6193c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffersDescriptionDialogState(offers=");
        sb2.append(this.f6191a);
        sb2.append(", selectedOfferIdx=");
        sb2.append(this.f6192b);
        sb2.append(", title=");
        sb2.append(this.f6193c);
        sb2.append(", isDialogShown=");
        return r.x(sb2, this.f6194d, ')');
    }

    public /* synthetic */ c(List list, int i12, String str, boolean z12, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 8) != 0 ? false : z12, list);
    }
}
