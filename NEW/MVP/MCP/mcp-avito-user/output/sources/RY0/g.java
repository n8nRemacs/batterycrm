package Ry0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/g;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14777b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f14778c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f14779d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f14780e;

    public g(@l Integer num, @k String str, @k String str2, @k ArrayList arrayList, boolean z12) {
        this.f14776a = str;
        this.f14777b = z12;
        this.f14778c = str2;
        this.f14779d = arrayList;
        this.f14780e = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f14776a, gVar.f14776a) && this.f14777b == gVar.f14777b && L.f(this.f14778c, gVar.f14778c) && this.f14779d.equals(gVar.f14779d) && L.f(this.f14780e, gVar.f14780e);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f14779d, H.d(r.i(this.f14776a.hashCode() * 31, 31, this.f14777b), 31, this.f14778c), 31);
        Integer num = this.f14780e;
        return iG2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCancellationParametersInfo(title=");
        sb2.append(this.f14776a);
        sb2.append(", hasFreeCancellation=");
        sb2.append(this.f14777b);
        sb2.append(", subtitle=");
        sb2.append(this.f14778c);
        sb2.append(", freeCancellationPeriodValues=");
        sb2.append(this.f14779d);
        sb2.append(", freeCancellationSelectedPeriodID=");
        return s.j(sb2, this.f14780e, ')');
    }
}
