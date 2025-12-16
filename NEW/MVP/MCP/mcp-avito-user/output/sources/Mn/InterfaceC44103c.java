package mn;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lj.d;
import ln.C43800a;

/* compiled from: CartSimilarItemsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmn/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lmn/c$a;", "Lmn/c$b;", "Lmn/c$c;", "Lmn/c$d;", "Lmn/c$e;", "Lmn/c$f;", "Lmn/c$g;", "Lmn/c$h;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44103c {

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$a;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$a */
    public static final /* data */ class a implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.e f414689a;

        public a(@k d.e eVar) {
            this.f414689a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f414689a.equals(((a) obj).f414689a);
        }

        public final int hashCode() {
            return this.f414689a.f414160a.hashCode();
        }

        @k
        public final String toString() {
            return "ApplyBeduinTransforms(componentsFormTransform=" + this.f414689a + ')';
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/c$b;", "Lmn/c;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$b */
    public static final class b implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414690a = new b();
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$c;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11840c implements InterfaceC44103c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11840c)) {
                return false;
            }
            ((C11840c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleBeduinActions(actions=null)";
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$e;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$e */
    public static final /* data */ class e implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414694a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f414695b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f414696c;

        public e(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            bundle = (i12 & 4) != 0 ? null : bundle;
            this.f414694a = deepLink;
            this.f414695b = str;
            this.f414696c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f414694a, eVar.f414694a) && L.f(this.f414695b, eVar.f414695b) && L.f(this.f414696c, eVar.f414696c);
        }

        public final int hashCode() {
            int iHashCode = this.f414694a.hashCode() * 31;
            String str = this.f414695b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f414696c;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f414694a);
            sb2.append(", requestKey=");
            sb2.append(this.f414695b);
            sb2.append(", args=");
            return H.m(sb2, this.f414696c, ')');
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmn/c$f;", "Lmn/c;", "a", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$f */
    public static final /* data */ class f implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f414697a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f414698b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f414699c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f414700d;

        /* compiled from: CartSimilarItemsOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$f$a;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: mn.c$f$a */
        public static final /* data */ class a {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Action(text=null, onClick=null)";
            }
        }

        public f(ApiError apiError, PrintableText printableText, a aVar, boolean z12, int i12, C42822w c42822w) {
            aVar = (i12 & 4) != 0 ? null : aVar;
            z12 = (i12 & 8) != 0 ? false : z12;
            this.f414697a = apiError;
            this.f414698b = printableText;
            this.f414699c = aVar;
            this.f414700d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f414697a, fVar.f414697a) && L.f(this.f414698b, fVar.f414698b) && L.f(this.f414699c, fVar.f414699c) && this.f414700d == fVar.f414700d;
        }

        public final int hashCode() {
            int iHashCode = this.f414698b.hashCode() + (this.f414697a.hashCode() * 31);
            a aVar = this.f414699c;
            if (aVar == null) {
                return Boolean.hashCode(this.f414700d) + (iHashCode * 961);
            }
            aVar.getClass();
            throw null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(cause=");
            sb2.append(this.f414697a);
            sb2.append(", message=");
            sb2.append(this.f414698b);
            sb2.append(", button=");
            sb2.append(this.f414699c);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f414700d, ')');
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$g;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$g */
    public static final /* data */ class g implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f414701a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f414702b;

        public g(@k PrintableText printableText, @k Throwable th2) {
            this.f414701a = th2;
            this.f414702b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f414701a, gVar.f414701a) && L.f(this.f414702b, gVar.f414702b);
        }

        public final int hashCode() {
            return this.f414702b.hashCode() + (this.f414701a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPageLoadingError(cause=");
            sb2.append(this.f414701a);
            sb2.append(", message=");
            return AK.c.m(sb2, this.f414702b, ')');
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$h;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$h */
    public static final /* data */ class h implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        public final int f414703a;

        public h(int i12) {
            this.f414703a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f414703a == ((h) obj).f414703a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f414703a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f414703a, ')');
        }
    }

    /* compiled from: CartSimilarItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/c$d;", "Lmn/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.c$d */
    public static final /* data */ class d implements InterfaceC44103c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414691a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f414692b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C43800a f414693c;

        public d(@k String str, @l String str2, @l C43800a c43800a) {
            this.f414691a = str;
            this.f414692b = str2;
            this.f414693c = c43800a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f414691a, dVar.f414691a) && L.f(this.f414692b, dVar.f414692b) && L.f(this.f414693c, dVar.f414693c);
        }

        public final int hashCode() {
            int iHashCode = this.f414691a.hashCode() * 31;
            String str = this.f414692b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C43800a c43800a = this.f414693c;
            return iHashCode2 + (c43800a != null ? c43800a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f414691a + ", context=" + this.f414692b + ", args=" + this.f414693c + ')';
        }

        public /* synthetic */ d(String str, String str2, C43800a c43800a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : c43800a);
        }
    }
}
