package Uo0;

import android.text.SpannableString;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sbc.confirm.CreateDiscountDispatchTariffSuccessArgs;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogData;
import com.avito.android.sbc.create.mvi.util.FieldsWithValidation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"LUo0/g;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "LUo0/g$a;", "LUo0/g$b;", "LUo0/g$c;", "LUo0/g$d;", "LUo0/g$e;", "LUo0/g$f;", "LUo0/g$g;", "LUo0/g$h;", "LUo0/g$i;", "LUo0/g$j;", "LUo0/g$k;", "LUo0/g$l;", "LUo0/g$m;", "LUo0/g$n;", "LUo0/g$o;", "LUo0/g$p;", "LUo0/g$q;", "LUo0/g$r;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$a;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16665a;

        public a(boolean z12) {
            this.f16665a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16665a == ((a) obj).f16665a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16665a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("CloseScreenEvent(closeIconClicked="), this.f16665a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/g$b;", "LUo0/g;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f16666a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -92352713;
        }

        @Y61.k
        public final String toString() {
            return "FinishVasFlowEvent";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/g$c;", "LUo0/g;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f16667a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -498492191;
        }

        @Y61.k
        public final String toString() {
            return "NavigateBackInVasFlowEvent";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$d;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16668a;

        public d(@Y61.k CharSequence charSequence) {
            this.f16668a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return L.f(this.f16668a, ((d) obj).f16668a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16668a.hashCode() * 31) + 1364728064;
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchExplainedDialogEvent(text=" + ((Object) this.f16668a) + ", title=Как работает авторассылка)";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$e;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16669a;

        public e(@Y61.k String str) {
            this.f16669a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16669a, ((e) obj).f16669a);
        }

        public final int hashCode() {
            return this.f16669a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchRequiredToastEvent(text=" + ((Object) this.f16669a) + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$f;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16670a;

        public f(@Y61.k CharSequence charSequence) {
            this.f16670a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return L.f(this.f16670a, ((f) obj).f16670a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16670a.hashCode() * 31) + 22754529;
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchSummaryExplainedDialogEvent(text=" + ((Object) this.f16670a) + ", title=Как считается итоговая сумма)";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$g;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.g$g, reason: collision with other inner class name */
    public static final /* data */ class C1151g implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16671a;

        public C1151g(@Y61.k DeepLink deepLink) {
            this.f16671a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1151g) && L.f(this.f16671a, ((C1151g) obj).f16671a);
        }

        public final int hashCode() {
            return this.f16671a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplinkEvent(deeplink="), this.f16671a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$h;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldsWithValidation f16672a;

        public h(@Y61.k FieldsWithValidation fieldsWithValidation) {
            this.f16672a = fieldsWithValidation;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f16672a == ((h) obj).f16672a;
        }

        public final int hashCode() {
            return this.f16672a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScrollToFieldEvent(field=" + this.f16672a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$i;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SpannableString f16673a;

        public i(@Y61.k SpannableString spannableString) {
            this.f16673a = spannableString;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f16673a.equals(((i) obj).f16673a);
        }

        public final int hashCode() {
            return this.f16673a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowAudienceCountDialogEvent(message=" + ((Object) this.f16673a) + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$j;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sbc.create.mvi.util.b f16674a;

        public j(@Y61.k com.avito.android.sbc.create.mvi.util.b bVar) {
            this.f16674a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f16674a, ((j) obj).f16674a);
        }

        public final int hashCode() {
            return this.f16674a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowDateSelectionDialogEvent(params=" + this.f16674a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$k;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DiscountAlternativesDialogData f16675a;

        public k(@Y61.k DiscountAlternativesDialogData discountAlternativesDialogData) {
            this.f16675a = discountAlternativesDialogData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f16675a, ((k) obj).f16675a);
        }

        public final int hashCode() {
            return this.f16675a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowDiscountAlternativesDialogEvent(discountAlternativesDialogData=" + this.f16675a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$l;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16676a;

        public l(@Y61.k String str) {
            this.f16676a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f16676a, ((l) obj).f16676a);
        }

        public final int hashCode() {
            return this.f16676a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorMessageEvent(errorMessage="), this.f16676a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/g$m;", "LUo0/g;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f16677a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 882594417;
        }

        @Y61.k
        public final String toString() {
            return "ShowFastChipsOnboardingEvent";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/g$n;", "LUo0/g;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f16678a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -507419652;
        }

        @Y61.k
        public final String toString() {
            return "ShowHardcodedHowItWorksDialogEvent";
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$o;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16679a;

        public o(@Y61.k CharSequence charSequence) {
            this.f16679a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f16679a, ((o) obj).f16679a);
        }

        public final int hashCode() {
            return this.f16679a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.r(new StringBuilder("ShowHowItWorksDialogEvent(howItWorksString="), this.f16679a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$p;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16680a;

        public p(@Y61.k String str) {
            this.f16680a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f16680a, ((p) obj).f16680a);
        }

        public final int hashCode() {
            return this.f16680a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowOfferEvent(offerLink="), this.f16680a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$q;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CreateDiscountDispatchTariffSuccessArgs f16681a;

        public q(@Y61.k CreateDiscountDispatchTariffSuccessArgs createDiscountDispatchTariffSuccessArgs) {
            this.f16681a = createDiscountDispatchTariffSuccessArgs;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f16681a, ((q) obj).f16681a);
        }

        public final int hashCode() {
            return this.f16681a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowTariffSuccessDialogEvent(args=" + this.f16681a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/g$r;", "LUo0/g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16682a;

        public r(@Y61.k String str) {
            this.f16682a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f16682a, ((r) obj).f16682a);
        }

        public final int hashCode() {
            return this.f16682a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SuccessVasPaymentEvent(enteredAudienceCountStr="), this.f16682a, ')');
        }
    }
}
