package G10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorOffersState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LG10/a;", "", "a", "b", "d", "e", "LG10/a$a;", "LG10/a$b;", "LG10/a$d;", "LG10/a$e;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CalculatorOffersState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG10/a$b;", "LG10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6180a;

        public b(boolean z12) {
            this.f6180a = z12;
        }

        @Override // G10.a
        @l
        public final C0325a a() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f6180a == ((b) obj).f6180a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6180a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ContentReloading(isManyOffers="), this.f6180a, ')');
        }
    }

    /* compiled from: CalculatorOffersState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: CalculatorOffersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG10/a$d;", "LG10/a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6181a = new d();

        @Override // G10.a
        @l
        public final C0325a a() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 617814394;
        }

        @k
        public final String toString() {
            return "Failure";
        }
    }

    /* compiled from: CalculatorOffersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG10/a$e;", "LG10/a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f6182a = new e();

        @Override // G10.a
        @l
        public final C0325a a() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2041039148;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    @l
    C0325a a();

    /* compiled from: CalculatorOffersState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG10/a$a;", "LG10/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0325a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f6176a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f6177b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f6178c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G10.c f6179d;

        public C0325a(@k AttributedText attributedText, @l String str, @k ArrayList arrayList, @k G10.c cVar) {
            this.f6176a = attributedText;
            this.f6177b = str;
            this.f6178c = arrayList;
            this.f6179d = cVar;
        }

        public static C0325a b(C0325a c0325a, G10.c cVar) {
            return new C0325a(c0325a.f6176a, c0325a.f6177b, c0325a.f6178c, cVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0325a)) {
                return false;
            }
            C0325a c0325a = (C0325a) obj;
            return L.f(this.f6176a, c0325a.f6176a) && L.f(this.f6177b, c0325a.f6177b) && this.f6178c.equals(c0325a.f6178c) && this.f6179d.equals(c0325a.f6179d);
        }

        public final int hashCode() {
            int iHashCode = this.f6176a.hashCode() * 31;
            String str = this.f6177b;
            return this.f6179d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f6178c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @k
        public final String toString() {
            return "Content(title=" + this.f6176a + ", banksImageUrl=" + this.f6177b + ", offers=" + this.f6178c + ", offerDescriptionDialog=" + this.f6179d + ')';
        }

        @Override // G10.a
        @l
        public final C0325a a() {
            return this;
        }
    }
}
