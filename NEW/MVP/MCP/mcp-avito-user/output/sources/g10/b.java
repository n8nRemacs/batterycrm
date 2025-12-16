package G10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.mortgage_calculator.internal.items.offers.OfferPreviewRenderType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorOffersViewState.kt */
@F3
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LG10/b;", "", "a", "b", "c", "d", "LG10/b$a;", "LG10/b$b;", "LG10/b$c;", "LG10/b$d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: CalculatorOffersViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG10/b$a;", "LG10/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f6183a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f6184b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f6185c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final OfferPreviewRenderType f6186d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final G10.c f6187e;

        public a(@l AttributedText attributedText, @l String str, @k ArrayList arrayList, @k OfferPreviewRenderType offerPreviewRenderType, @l G10.c cVar) {
            this.f6183a = attributedText;
            this.f6184b = str;
            this.f6185c = arrayList;
            this.f6186d = offerPreviewRenderType;
            this.f6187e = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f6183a, aVar.f6183a) && L.f(this.f6184b, aVar.f6184b) && this.f6185c.equals(aVar.f6185c) && this.f6186d == aVar.f6186d && this.f6187e.equals(aVar.f6187e);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f6183a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            String str = this.f6184b;
            return this.f6187e.hashCode() + ((this.f6186d.hashCode() + e.g(this.f6185c, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            return "Content(title=" + this.f6183a + ", banksImageUrl=" + this.f6184b + ", offers=" + this.f6185c + ", renderType=" + this.f6186d + ", offerDescriptionDialog=" + this.f6187e + ')';
        }
    }

    /* compiled from: CalculatorOffersViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG10/b$b;", "LG10/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0326b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6188a;

        public C0326b(boolean z12) {
            this.f6188a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0326b) && this.f6188a == ((C0326b) obj).f6188a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6188a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ContentReloading(isManyOffers="), this.f6188a, ')');
        }
    }

    /* compiled from: CalculatorOffersViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG10/b$c;", "LG10/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6189a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 378422357;
        }

        @k
        public final String toString() {
            return "Failure";
        }
    }

    /* compiled from: CalculatorOffersViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG10/b$d;", "LG10/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6190a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1801647111;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
