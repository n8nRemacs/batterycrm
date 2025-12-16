package Hf;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.autoteka.items.error.choosingTypePurchase.ChoosingTypePurchaseErrorItem;
import com.avito.android.autoteka.items.skeleton.choosingTypePurchase.ChoosingTypePurchaseSkeletonItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.autotekateaser.AutotekaAnalytic;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"LHf/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "LHf/c$a;", "LHf/c$b;", "LHf/c$d;", "LHf/c$e;", "LHf/c$f;", "LHf/c$g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0431c f7585d = new C0431c(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final e f7586e = new e(new ChoosingTypePurchaseSkeletonItem(null, 1, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.conveyor_item.a f7587b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f7588c;

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$a;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.BuyAgainState f7589f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f7590g;

        public a(@k ChoosingTypePurchaseState.BuyAgainState buyAgainState, @k AutotekaAnalytic autotekaAnalytic) {
            super(buyAgainState, com.avito.android.printable_text.b.f(""), null);
            this.f7589f = buyAgainState;
            this.f7590g = autotekaAnalytic;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f7589f, aVar.f7589f) && L.f(this.f7590g, aVar.f7590g);
        }

        public final int hashCode() {
            return this.f7590g.hashCode() + (this.f7589f.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "BuyAgainState(buyAgainState=" + this.f7589f + ", autotekaAnalytic=" + this.f7590g + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$b;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.ChoosingProductState f7591f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f7592g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f7593h;

        public b(@k ChoosingTypePurchaseState.ChoosingProductState choosingProductState, @k String str, @k AutotekaAnalytic autotekaAnalytic) {
            super(choosingProductState, com.avito.android.printable_text.b.f(str), null);
            this.f7591f = choosingProductState;
            this.f7592g = str;
            this.f7593h = autotekaAnalytic;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f7591f, bVar.f7591f) && L.f(this.f7592g, bVar.f7592g) && L.f(this.f7593h, bVar.f7593h);
        }

        public final int hashCode() {
            return this.f7593h.hashCode() + H.d(this.f7591f.hashCode() * 31, 31, this.f7592g);
        }

        @k
        public final String toString() {
            return "ChoosingProductState(choosingProductState=" + this.f7591f + ", text=" + this.f7592g + ", autotekaAnalytic=" + this.f7593h + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/c$c;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.c$c, reason: collision with other inner class name */
    public static final class C0431c {
        public /* synthetic */ C0431c(C42822w c42822w) {
            this();
        }

        public C0431c() {
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$d;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseErrorItem f7594f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final ApiError f7595g;

        public d(@k ChoosingTypePurchaseErrorItem choosingTypePurchaseErrorItem, @k ApiError apiError) {
            super(choosingTypePurchaseErrorItem, choosingTypePurchaseErrorItem.f96756c, null);
            this.f7594f = choosingTypePurchaseErrorItem;
            this.f7595g = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f7594f, dVar.f7594f) && L.f(this.f7595g, dVar.f7595g);
        }

        public final int hashCode() {
            return this.f7595g.hashCode() + (this.f7594f.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorItem=");
            sb2.append(this.f7594f);
            sb2.append(", apiError=");
            return AK.c.n(sb2, this.f7595g, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$e;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseSkeletonItem f7596f;

        public e(@k ChoosingTypePurchaseSkeletonItem choosingTypePurchaseSkeletonItem) {
            super(choosingTypePurchaseSkeletonItem, com.avito.android.printable_text.b.f(""), null);
            this.f7596f = choosingTypePurchaseSkeletonItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f7596f, ((e) obj).f7596f);
        }

        public final int hashCode() {
            return this.f7596f.f97005b.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingItem=" + this.f7596f + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$f;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.PurchaseViaPackageState f7597f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f7598g;

        public f(@k ChoosingTypePurchaseState.PurchaseViaPackageState purchaseViaPackageState, @k AutotekaAnalytic autotekaAnalytic) {
            super(purchaseViaPackageState, com.avito.android.printable_text.b.f(""), null);
            this.f7597f = purchaseViaPackageState;
            this.f7598g = autotekaAnalytic;
        }

        public static f a(f fVar, ChoosingTypePurchaseState.PurchaseViaPackageState purchaseViaPackageState) {
            AutotekaAnalytic autotekaAnalytic = fVar.f7598g;
            fVar.getClass();
            return new f(purchaseViaPackageState, autotekaAnalytic);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f7597f, fVar.f7597f) && L.f(this.f7598g, fVar.f7598g);
        }

        public final int hashCode() {
            return this.f7598g.hashCode() + (this.f7597f.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PurchaseViaPackageState(purchaseViaPackageState=" + this.f7597f + ", autotekaAnalytic=" + this.f7598g + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/c$g;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.PurchaseViaStandaloneState f7599f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f7600g;

        public g(@k ChoosingTypePurchaseState.PurchaseViaStandaloneState purchaseViaStandaloneState, @k AutotekaAnalytic autotekaAnalytic) {
            super(purchaseViaStandaloneState, com.avito.android.printable_text.b.f(""), null);
            this.f7599f = purchaseViaStandaloneState;
            this.f7600g = autotekaAnalytic;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f7599f, gVar.f7599f) && L.f(this.f7600g, gVar.f7600g);
        }

        public final int hashCode() {
            return this.f7600g.hashCode() + (this.f7599f.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PurchaseViaStandaloneState(purchaseViaStandaloneState=" + this.f7599f + ", autotekaAnalytic=" + this.f7600g + ')';
        }
    }

    public c(com.avito.conveyor_item.a aVar, PrintableText printableText, C42822w c42822w) {
        this.f7587b = aVar;
        this.f7588c = printableText;
    }
}
