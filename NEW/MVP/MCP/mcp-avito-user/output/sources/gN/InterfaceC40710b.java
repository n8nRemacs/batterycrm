package gn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tn.d;
import vn.C49355b;

/* compiled from: CartSheetAfterAddingAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lgn/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lgn/b$a;", "Lgn/b$b;", "Lgn/b$c;", "Lgn/b$d;", "Lgn/b$e;", "Lgn/b$f;", "Lgn/b$g;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40710b {

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn/b$a;", "Lgn/b;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$a */
    public static final /* data */ class a implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396792a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -370047907;
        }

        @k
        public final String toString() {
            return "OpenCart";
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn/b$b;", "Lgn/b;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11227b implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11227b f396793a = new C11227b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11227b);
        }

        public final int hashCode() {
            return 340671964;
        }

        @k
        public final String toString() {
            return "RefreshDiscountOnDelivery";
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/b$c;", "Lgn/b;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$c */
    public static final /* data */ class c implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        public final int f396794a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f396795b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f396796c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f396797d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Image f396798e;

        /* renamed from: f, reason: collision with root package name */
        public final long f396799f;

        public c(int i12, @k String str, @k String str2, @l String str3, @l Image image, long j12) {
            this.f396794a = i12;
            this.f396795b = str;
            this.f396796c = str2;
            this.f396797d = str3;
            this.f396798e = image;
            this.f396799f = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f396794a == cVar.f396794a && L.f(this.f396795b, cVar.f396795b) && L.f(this.f396796c, cVar.f396796c) && L.f(this.f396797d, cVar.f396797d) && L.f(this.f396798e, cVar.f396798e) && this.f396799f == cVar.f396799f;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(Integer.hashCode(this.f396794a) * 31, 31, this.f396795b), 31, this.f396796c);
            String str = this.f396797d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.f396798e;
            return Long.hashCode(this.f396799f) + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SnippetClicked(index=");
            sb2.append(this.f396794a);
            sb2.append(", itemId=");
            sb2.append(this.f396795b);
            sb2.append(", title=");
            sb2.append(this.f396796c);
            sb2.append(", price=");
            sb2.append(this.f396797d);
            sb2.append(", image=");
            sb2.append(this.f396798e);
            sb2.append(", clickTime=");
            return r.u(sb2, this.f396799f, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/b$d;", "Lgn/b;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$d */
    public static final /* data */ class d implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        public final int f396800a;

        public d(int i12) {
            this.f396800a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f396800a == ((d) obj).f396800a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f396800a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f396800a, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/b$e;", "Lgn/b;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$e */
    public static final /* data */ class e implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C49355b f396801a;

        public e(@l C49355b c49355b) {
            this.f396801a = c49355b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396801a, ((e) obj).f396801a);
        }

        public final int hashCode() {
            C49355b c49355b = this.f396801a;
            if (c49355b == null) {
                return 0;
            }
            return c49355b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateDiscountOnDelivery(discountOnDelivery=" + this.f396801a + ')';
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/b$f;", "Lgn/b;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$f */
    public static final /* data */ class f implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396802a;

        public f(@k String str) {
            this.f396802a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f396802a, ((f) obj).f396802a);
        }

        public final int hashCode() {
            return this.f396802a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateScreenTitle(title="), this.f396802a, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/b$g;", "Lgn/b;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.b$g */
    public static final /* data */ class g implements InterfaceC40710b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.b f396803a;

        public g(@k d.b bVar) {
            this.f396803a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f396803a, ((g) obj).f396803a);
        }

        public final int hashCode() {
            return this.f396803a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateStocks(stocks=" + this.f396803a + ')';
        }
    }
}
