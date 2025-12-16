package ZC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PeriodTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZC0/a;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.android.lib.deprecated_design.tab.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19972b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f19973c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f19974d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19975e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19976f;

    public a(@k String str, @l String str2, @l CharSequence charSequence, boolean z12, int i12) {
        this.f19972b = str;
        this.f19973c = str2;
        this.f19974d = charSequence;
        this.f19975e = z12;
        this.f19976f = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f19972b, aVar.f19972b) && L.f(this.f19973c, aVar.f19973c) && L.f(this.f19974d, aVar.f19974d) && this.f19975e == aVar.f19975e && this.f19976f == aVar.f19976f;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF19973c() {
        return this.f19973c;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF19972b() {
        return this.f19972b;
    }

    public final int hashCode() {
        int iHashCode = this.f19972b.hashCode() * 31;
        String str = this.f19973c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f19974d;
        return Integer.hashCode(this.f19976f) + r.i((iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.f19975e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodTab(title=");
        sb2.append(this.f19972b);
        sb2.append(", label=");
        sb2.append(this.f19973c);
        sb2.append(", periodTitle=");
        sb2.append((Object) this.f19974d);
        sb2.append(", hasRedBadge=");
        sb2.append(this.f19975e);
        sb2.append(", index=");
        return r.t(sb2, this.f19976f, ')');
    }

    public /* synthetic */ a(String str, String str2, CharSequence charSequence, boolean z12, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? null : str2, charSequence, (i13 & 8) != 0 ? false : z12, i12);
    }
}
