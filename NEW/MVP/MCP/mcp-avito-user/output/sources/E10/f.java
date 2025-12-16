package E10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorViewState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/f;", "Lcom/akita/compose/component/chips/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3706b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CalculatorTabType f3707c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3708d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3709e;

    public f(String str, CalculatorTabType calculatorTabType, boolean z12, boolean z13, int i12, C42822w c42822w) {
        z13 = (i12 & 8) != 0 ? true : z13;
        this.f3706b = str;
        this.f3707c = calculatorTabType;
        this.f3708d = z12;
        this.f3709e = z13;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f3706b, fVar.f3706b) && this.f3707c == fVar.f3707c && this.f3708d == fVar.f3708d && this.f3709e == fVar.f3709e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF3706b() {
        return this.f3706b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3709e) + r.i((this.f3707c.hashCode() + (this.f3706b.hashCode() * 31)) * 31, 31, this.f3708d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isActive */
    public final boolean getF99070e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF3709e() {
        return this.f3709e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF3708d() {
        return this.f3708d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculatorViewTab(title=");
        sb2.append(this.f3706b);
        sb2.append(", tabType=");
        sb2.append(this.f3707c);
        sb2.append(", isSelected=");
        sb2.append(this.f3708d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f3709e, ')');
    }
}
