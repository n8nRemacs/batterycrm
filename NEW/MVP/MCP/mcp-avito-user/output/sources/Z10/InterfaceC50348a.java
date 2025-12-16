package z10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.CalculatorField;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferDescription.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lz10/a;", "", "a", "b", "c", "Lz10/a$a;", "Lz10/a$b;", "Lz10/a$c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC50348a {

    /* compiled from: OfferDescription.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/a$a;", "Lz10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12940a implements InterfaceC50348a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443756a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f443757b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CalculatorField f443758c;

        /* renamed from: d, reason: collision with root package name */
        public final long f443759d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f443760e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f443761f;

        public C12940a(@k String str, @l String str2, @k CalculatorField calculatorField, long j12, @l String str3, @l String str4) {
            this.f443756a = str;
            this.f443757b = str2;
            this.f443758c = calculatorField;
            this.f443759d = j12;
            this.f443760e = str3;
            this.f443761f = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12940a)) {
                return false;
            }
            C12940a c12940a = (C12940a) obj;
            return L.f(this.f443756a, c12940a.f443756a) && L.f(this.f443757b, c12940a.f443757b) && this.f443758c == c12940a.f443758c && this.f443759d == c12940a.f443759d && L.f(this.f443760e, c12940a.f443760e) && L.f(this.f443761f, c12940a.f443761f);
        }

        @Override // z10.InterfaceC50348a
        @l
        /* renamed from: getHint, reason: from getter */
        public final String getF443765b() {
            return this.f443757b;
        }

        @Override // z10.InterfaceC50348a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF443764a() {
            return this.f443756a;
        }

        public final int hashCode() {
            int iHashCode = this.f443756a.hashCode() * 31;
            String str = this.f443757b;
            int iG2 = r.g((this.f443758c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f443759d);
            String str2 = this.f443760e;
            int iHashCode2 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f443761f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalculationFieldUpdateAction(title=");
            sb2.append(this.f443756a);
            sb2.append(", hint=");
            sb2.append(this.f443757b);
            sb2.append(", field=");
            sb2.append(this.f443758c);
            sb2.append(", value=");
            sb2.append(this.f443759d);
            sb2.append(", criticalCase=");
            sb2.append(this.f443760e);
            sb2.append(", buttonName=");
            return C22026a.c(sb2, this.f443761f, ')');
        }
    }

    /* compiled from: OfferDescription.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/a$b;", "Lz10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.a$b */
    public static final /* data */ class b implements InterfaceC50348a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443762a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f443763b;

        public b(@k String str, @l String str2) {
            this.f443762a = str;
            this.f443763b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f443762a, bVar.f443762a) && L.f(this.f443763b, bVar.f443763b);
        }

        @Override // z10.InterfaceC50348a
        @l
        /* renamed from: getHint, reason: from getter */
        public final String getF443765b() {
            return this.f443763b;
        }

        @Override // z10.InterfaceC50348a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF443764a() {
            return this.f443762a;
        }

        public final int hashCode() {
            int iHashCode = this.f443762a.hashCode() * 31;
            String str = this.f443763b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalculationUpdateAction(title=");
            sb2.append(this.f443762a);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f443763b, ')');
        }
    }

    /* compiled from: OfferDescription.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/a$c;", "Lz10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.a$c */
    public static final /* data */ class c implements InterfaceC50348a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443764a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f443765b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f443766c;

        public c(@k String str, @l String str2, @k DeepLink deepLink) {
            this.f443764a = str;
            this.f443765b = str2;
            this.f443766c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443764a, cVar.f443764a) && L.f(this.f443765b, cVar.f443765b) && L.f(this.f443766c, cVar.f443766c);
        }

        @Override // z10.InterfaceC50348a
        @l
        /* renamed from: getHint, reason: from getter */
        public final String getF443765b() {
            return this.f443765b;
        }

        @Override // z10.InterfaceC50348a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF443764a() {
            return this.f443764a;
        }

        public final int hashCode() {
            int iHashCode = this.f443764a.hashCode() * 31;
            String str = this.f443765b;
            return this.f443766c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigationAction(title=");
            sb2.append(this.f443764a);
            sb2.append(", hint=");
            sb2.append(this.f443765b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f443766c, ')');
        }
    }

    @l
    /* renamed from: getHint */
    String getF443765b();

    @k
    /* renamed from: getTitle */
    String getF443764a();
}
