package Uo0;

import android.text.SpannableString;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sbc.confirm.CreateDiscountDispatchTariffSuccessArgs;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogData;
import com.avito.android.sbc.create.mvi.util.FieldsWithValidation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"LUo0/f;", "LUo0/d;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "LUo0/f$a;", "LUo0/f$b;", "LUo0/f$c;", "LUo0/f$d;", "LUo0/f$e;", "LUo0/f$f;", "LUo0/f$g;", "LUo0/f$h;", "LUo0/f$i;", "LUo0/f$j;", "LUo0/f$k;", "LUo0/f$l;", "LUo0/f$m;", "LUo0/f$n;", "LUo0/f$o;", "LUo0/f$p;", "LUo0/f$q;", "LUo0/f$r;", "LUo0/f$s;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f extends Uo0.d {

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$a;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16646a;

        public a(boolean z12) {
            this.f16646a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16646a == ((a) obj).f16646a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16646a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("CloseScreenInternalAction(closeIconClicked="), this.f16646a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/f$b;", "LUo0/f;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f16647a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 453056226;
        }

        @Y61.k
        public final String toString() {
            return "FinishVasFlowInternalAction";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/f$c;", "LUo0/f;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f16648a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1989428104;
        }

        @Y61.k
        public final String toString() {
            return "NavigateBackInVasFlowInternalAction";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$d;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16649a;

        public d(@Y61.k CharSequence charSequence) {
            this.f16649a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return L.f(this.f16649a, ((d) obj).f16649a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16649a.hashCode() * 31) + 1364728064;
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchExplainedDialogInternalAction(text=" + ((Object) this.f16649a) + ", title=Как работает авторассылка)";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$e;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16650a;

        public e(@Y61.k String str) {
            this.f16650a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16650a, ((e) obj).f16650a);
        }

        public final int hashCode() {
            return this.f16650a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchRequiredToastInternalAction(text=" + ((Object) this.f16650a) + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$f;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uo0.f$f, reason: collision with other inner class name */
    public static final /* data */ class C1150f implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16651a;

        public C1150f(@Y61.k CharSequence charSequence) {
            this.f16651a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1150f) {
                return L.f(this.f16651a, ((C1150f) obj).f16651a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16651a.hashCode() * 31) + 22754529;
        }

        @Y61.k
        public final String toString() {
            return "OpenAutoDispatchSummaryExplainedDialogInternalAction(text=" + ((Object) this.f16651a) + ", title=Как считается итоговая сумма)";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$g;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16652a;

        public g(@Y61.k DeepLink deepLink) {
            this.f16652a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f16652a, ((g) obj).f16652a);
        }

        public final int hashCode() {
            return this.f16652a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplinkInternalAction(deeplink="), this.f16652a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$h;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CreateDiscountDispatchState f16653a;

        public h(@Y61.k CreateDiscountDispatchState createDiscountDispatchState) {
            this.f16653a = createDiscountDispatchState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f16653a, ((h) obj).f16653a);
        }

        public final int hashCode() {
            return this.f16653a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RenderNewUiStateInternalAction(state=" + this.f16653a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$i;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldsWithValidation f16654a;

        public i(@Y61.k FieldsWithValidation fieldsWithValidation) {
            this.f16654a = fieldsWithValidation;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f16654a == ((i) obj).f16654a;
        }

        public final int hashCode() {
            return this.f16654a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScrollToField(field=" + this.f16654a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$j;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SpannableString f16655a;

        public j(@Y61.k SpannableString spannableString) {
            this.f16655a = spannableString;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f16655a.equals(((j) obj).f16655a);
        }

        public final int hashCode() {
            return this.f16655a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowAudienceCountDialogInternalAction(message=" + ((Object) this.f16655a) + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$k;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sbc.create.mvi.util.b f16656a;

        public k(@Y61.k com.avito.android.sbc.create.mvi.util.b bVar) {
            this.f16656a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f16656a, ((k) obj).f16656a);
        }

        public final int hashCode() {
            return this.f16656a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowDateSelectionDialogInternalAction(params=" + this.f16656a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$l;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DiscountAlternativesDialogData f16657a;

        public l(@Y61.k DiscountAlternativesDialogData discountAlternativesDialogData) {
            this.f16657a = discountAlternativesDialogData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f16657a, ((l) obj).f16657a);
        }

        public final int hashCode() {
            return this.f16657a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowDiscountAlternativesDialogInternalAction(discountAlternativesDialogData=" + this.f16657a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$m;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16658a;

        public m(@Y61.k String str) {
            this.f16658a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f16658a, ((m) obj).f16658a);
        }

        public final int hashCode() {
            return this.f16658a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorMessageInternalAction(errorMessage="), this.f16658a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/f$n;", "LUo0/f;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f16659a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -135424536;
        }

        @Y61.k
        public final String toString() {
            return "ShowFastChipsOnboardingInternalAction";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUo0/f$o;", "LUo0/f;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f16660a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 2049472445;
        }

        @Y61.k
        public final String toString() {
            return "ShowHardcodedHowItWorksDialogInternalAction";
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$p;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f16661a;

        public p(@Y61.k CharSequence charSequence) {
            this.f16661a = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f16661a, ((p) obj).f16661a);
        }

        public final int hashCode() {
            return this.f16661a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.r(new StringBuilder("ShowHowItWorksDialogInternalAction(howItWorksString="), this.f16661a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$q;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16662a;

        public q(@Y61.k String str) {
            this.f16662a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f16662a, ((q) obj).f16662a);
        }

        public final int hashCode() {
            return this.f16662a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowOfferInternalAction(link="), this.f16662a, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$r;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CreateDiscountDispatchTariffSuccessArgs f16663a;

        public r(@Y61.k CreateDiscountDispatchTariffSuccessArgs createDiscountDispatchTariffSuccessArgs) {
            this.f16663a = createDiscountDispatchTariffSuccessArgs;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f16663a, ((r) obj).f16663a);
        }

        public final int hashCode() {
            return this.f16663a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowTariffSuccessDialogInternalAction(args=" + this.f16663a + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/f$s;", "LUo0/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16664a;

        public s(@Y61.k String str) {
            this.f16664a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f16664a, ((s) obj).f16664a);
        }

        public final int hashCode() {
            return this.f16664a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SuccessVasPaymentInternalAction(enteredAudienceCountStr="), this.f16664a, ')');
        }
    }
}
