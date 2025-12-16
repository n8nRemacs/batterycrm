package dO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.installments_block.entity.InstallmentsLoanTerms;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/e;", "Lcom/akita/compose/component/chips/b;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f393848b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InstallmentsLoanTerms.Term.Badge f393849c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f393850d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f393851e;

    public e(@k String str, @l InstallmentsLoanTerms.Term.Badge badge, @k String str2, boolean z12) {
        this.f393848b = str;
        this.f393849c = badge;
        this.f393850d = str2;
        this.f393851e = z12;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f393848b, eVar.f393848b) && L.f(this.f393849c, eVar.f393849c) && L.f(this.f393850d, eVar.f393850d) && this.f393851e == eVar.f393851e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF60867b() {
        return this.f393850d;
    }

    public final int hashCode() {
        int iHashCode = this.f393848b.hashCode() * 31;
        InstallmentsLoanTerms.Term.Badge badge = this.f393849c;
        return Boolean.hashCode(this.f393851e) + H.d((iHashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.f393850d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    public final boolean isActive() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled */
    public final boolean getF60869d() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF60868c() {
        return this.f393851e;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlockStateTermChip(planId=");
        sb2.append(this.f393848b);
        sb2.append(", badge=");
        sb2.append(this.f393849c);
        sb2.append(", title=");
        sb2.append(this.f393850d);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f393851e, ')');
    }
}
