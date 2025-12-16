package E10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorViewState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/d;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f3695a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CalculatorTabType f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3697c;

    public d(@k PrintableText printableText, @k CalculatorTabType calculatorTabType, boolean z12) {
        this.f3695a = printableText;
        this.f3696b = calculatorTabType;
        this.f3697c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3695a, dVar.f3695a) && this.f3696b == dVar.f3696b && this.f3697c == dVar.f3697c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3697c) + ((this.f3696b.hashCode() + (this.f3695a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculatorTab(title=");
        sb2.append(this.f3695a);
        sb2.append(", tabType=");
        sb2.append(this.f3696b);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f3697c, ')');
    }
}
