package WZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationCallDaysItem.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWZ/a;", "Lcom/akita/compose/component/chips/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17940b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17941c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<b> f17942d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17943e;

    public a(@k String str, @k String str2, @k List<b> list, boolean z12) {
        this.f17940b = str;
        this.f17941c = str2;
        this.f17942d = list;
        this.f17943e = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(a aVar, ArrayList arrayList, boolean z12, int i12) {
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = aVar.f17942d;
        }
        if ((i12 & 8) != 0) {
            z12 = aVar.f17943e;
        }
        return new a(aVar.f17940b, aVar.f17941c, list, z12);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: c */
    public final Integer getF60871f() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: d */
    public final Integer getF60870e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f17940b, aVar.f17940b) && L.f(this.f17941c, aVar.f17941c) && L.f(this.f17942d, aVar.f17942d) && this.f17943e == aVar.f17943e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF206739d() {
        return this.f17940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17943e) + H.e(H.d(this.f17940b.hashCode() * 31, 31, this.f17941c), 31, this.f17942d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isActive */
    public final boolean getF99070e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled */
    public final boolean getF442841e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF206738c() {
        return this.f17943e;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationCallDaysItem(title=");
        sb2.append(this.f17940b);
        sb2.append(", value=");
        sb2.append(this.f17941c);
        sb2.append(", times=");
        sb2.append(this.f17942d);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f17943e, ')');
    }
}
