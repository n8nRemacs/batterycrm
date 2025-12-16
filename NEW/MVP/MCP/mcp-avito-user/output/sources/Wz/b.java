package WZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConsultationCallTimesItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWZ/b;", "Lcom/akita/compose/component/chips/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17944b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17945c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17946d;

    public b(@k String str, @k String str2, boolean z12) {
        this.f17944b = str;
        this.f17945c = str2;
        this.f17946d = z12;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f17944b, bVar.f17944b) && L.f(this.f17945c, bVar.f17945c) && this.f17946d == bVar.f17946d;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF16286b() {
        return this.f17944b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17946d) + H.d(this.f17944b.hashCode() * 31, 31, this.f17945c);
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
    public final boolean getF16287c() {
        return this.f17946d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationCallTimesItem(title=");
        sb2.append(this.f17944b);
        sb2.append(", value=");
        sb2.append(this.f17945c);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f17946d, ')');
    }
}
