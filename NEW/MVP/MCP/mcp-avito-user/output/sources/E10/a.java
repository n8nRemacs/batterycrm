package E10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import y10.C50036a;
import y10.C50037b;

/* compiled from: CalculatorViewState.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LE10/a;", "", "a", "b", "LE10/a$a;", "LE10/a$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CalculatorViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/a$a;", "LE10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0210a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C50037b f3668a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C50037b f3669b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C50036a f3670c;

        public C0210a(@k C50037b c50037b, @k C50037b c50037b2, @k C50036a c50036a) {
            this.f3668a = c50037b;
            this.f3669b = c50037b2;
            this.f3670c = c50036a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0210a)) {
                return false;
            }
            C0210a c0210a = (C0210a) obj;
            return L.f(this.f3668a, c0210a.f3668a) && L.f(this.f3669b, c0210a.f3669b) && L.f(this.f3670c, c0210a.f3670c);
        }

        public final int hashCode() {
            return this.f3670c.hashCode() + ((this.f3669b.hashCode() + (this.f3668a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "MonthlyPaymentTab(payment=" + this.f3668a + ", downPayment=" + this.f3669b + ", creditTerm=" + this.f3670c + ')';
        }
    }

    /* compiled from: CalculatorViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/a$b;", "LE10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C50037b f3671a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C50037b f3672b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C50037b f3673c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C50036a f3674d;

        public b(@k C50037b c50037b, @l C50037b c50037b2, @k C50037b c50037b3, @k C50036a c50036a) {
            this.f3671a = c50037b;
            this.f3672b = c50037b2;
            this.f3673c = c50037b3;
            this.f3674d = c50036a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f3671a, bVar.f3671a) && L.f(this.f3672b, bVar.f3672b) && L.f(this.f3673c, bVar.f3673c) && L.f(this.f3674d, bVar.f3674d);
        }

        public final int hashCode() {
            int iHashCode = this.f3671a.hashCode() * 31;
            C50037b c50037b = this.f3672b;
            return this.f3674d.hashCode() + ((this.f3673c.hashCode() + ((iHashCode + (c50037b == null ? 0 : c50037b.hashCode())) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "PropertyCostTab(propertyCost=" + this.f3671a + ", landCost=" + this.f3672b + ", downPayment=" + this.f3673c + ", creditTerm=" + this.f3674d + ')';
        }
    }
}
