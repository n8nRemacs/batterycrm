package F10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import y10.C50037b;

/* compiled from: CalculatorBasisState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LF10/a;", "", "a", "b", "LF10/a$a;", "LF10/a$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CalculatorBasisState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF10/a$a;", "LF10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0271a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f4474a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C50037b f4475b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C50037b f4476c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4477d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final CalculatorTabType f4478e = CalculatorTabType.f204621f;

        public C0271a(@k PrintableText printableText, @k C50037b c50037b, @k C50037b c50037b2, boolean z12) {
            this.f4474a = printableText;
            this.f4475b = c50037b;
            this.f4476c = c50037b2;
            this.f4477d = z12;
        }

        public static C0271a c(C0271a c0271a, C50037b c50037b, C50037b c50037b2, boolean z12, int i12) {
            PrintableText printableText = c0271a.f4474a;
            if ((i12 & 2) != 0) {
                c50037b = c0271a.f4475b;
            }
            if ((i12 & 4) != 0) {
                c50037b2 = c0271a.f4476c;
            }
            if ((i12 & 8) != 0) {
                z12 = c0271a.f4477d;
            }
            c0271a.getClass();
            return new C0271a(printableText, c50037b, c50037b2, z12);
        }

        @Override // F10.a
        @k
        /* renamed from: a, reason: from getter */
        public final CalculatorTabType getF4484f() {
            return this.f4478e;
        }

        @Override // F10.a
        @k
        /* renamed from: b, reason: from getter */
        public final C50037b getF4482d() {
            return this.f4476c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0271a)) {
                return false;
            }
            C0271a c0271a = (C0271a) obj;
            return L.f(this.f4474a, c0271a.f4474a) && L.f(this.f4475b, c0271a.f4475b) && L.f(this.f4476c, c0271a.f4476c) && this.f4477d == c0271a.f4477d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4477d) + ((this.f4476c.hashCode() + ((this.f4475b.hashCode() + (this.f4474a.hashCode() * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MonthlyPayment(tabTitle=");
            sb2.append(this.f4474a);
            sb2.append(", payment=");
            sb2.append(this.f4475b);
            sb2.append(", downPayment=");
            sb2.append(this.f4476c);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f4477d, ')');
        }
    }

    /* compiled from: CalculatorBasisState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF10/a$b;", "LF10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f4479a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C50037b f4480b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C50037b f4481c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C50037b f4482d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f4483e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final CalculatorTabType f4484f = CalculatorTabType.f204620e;

        public b(@k PrintableText printableText, @k C50037b c50037b, @l C50037b c50037b2, @k C50037b c50037b3, boolean z12) {
            this.f4479a = printableText;
            this.f4480b = c50037b;
            this.f4481c = c50037b2;
            this.f4482d = c50037b3;
            this.f4483e = z12;
        }

        public static b c(b bVar, C50037b c50037b, C50037b c50037b2, C50037b c50037b3, boolean z12, int i12) {
            PrintableText printableText = bVar.f4479a;
            if ((i12 & 2) != 0) {
                c50037b = bVar.f4480b;
            }
            C50037b c50037b4 = c50037b;
            if ((i12 & 4) != 0) {
                c50037b2 = bVar.f4481c;
            }
            C50037b c50037b5 = c50037b2;
            if ((i12 & 8) != 0) {
                c50037b3 = bVar.f4482d;
            }
            C50037b c50037b6 = c50037b3;
            if ((i12 & 16) != 0) {
                z12 = bVar.f4483e;
            }
            bVar.getClass();
            return new b(printableText, c50037b4, c50037b5, c50037b6, z12);
        }

        @Override // F10.a
        @k
        /* renamed from: a, reason: from getter */
        public final CalculatorTabType getF4484f() {
            return this.f4484f;
        }

        @Override // F10.a
        @k
        /* renamed from: b, reason: from getter */
        public final C50037b getF4482d() {
            return this.f4482d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f4479a, bVar.f4479a) && L.f(this.f4480b, bVar.f4480b) && L.f(this.f4481c, bVar.f4481c) && L.f(this.f4482d, bVar.f4482d) && this.f4483e == bVar.f4483e;
        }

        public final int hashCode() {
            int iHashCode = (this.f4480b.hashCode() + (this.f4479a.hashCode() * 31)) * 31;
            C50037b c50037b = this.f4481c;
            return Boolean.hashCode(this.f4483e) + ((this.f4482d.hashCode() + ((iHashCode + (c50037b == null ? 0 : c50037b.hashCode())) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PropertyCost(tabTitle=");
            sb2.append(this.f4479a);
            sb2.append(", propertyCost=");
            sb2.append(this.f4480b);
            sb2.append(", landCost=");
            sb2.append(this.f4481c);
            sb2.append(", downPayment=");
            sb2.append(this.f4482d);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f4483e, ')');
        }
    }

    @k
    /* renamed from: a */
    CalculatorTabType getF4484f();

    @k
    /* renamed from: b */
    C50037b getF4482d();
}
