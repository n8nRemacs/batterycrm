package rp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmittingSelectModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/h;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430219a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C47698a> f430220b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f430221c;

    public h(@k String str, @k ArrayList arrayList, @k List list) {
        this.f430219a = str;
        this.f430220b = list;
        this.f430221c = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f430219a, hVar.f430219a) && L.f(this.f430220b, hVar.f430220b) && this.f430221c.equals(hVar.f430221c);
    }

    public final int hashCode() {
        return this.f430221c.hashCode() + H.e(this.f430219a.hashCode() * 31, 31, this.f430220b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmittingSelectBody(title=");
        sb2.append(this.f430219a);
        sb2.append(", selectItems=");
        sb2.append(this.f430220b);
        sb2.append(", itemDetails=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f430221c, ')');
    }
}
