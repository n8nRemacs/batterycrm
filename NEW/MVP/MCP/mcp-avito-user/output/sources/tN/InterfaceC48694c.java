package tn;

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

/* compiled from: CartSnippetActionsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ltn/c;", "", "a", "b", "c", "Ltn/c$a;", "Ltn/c$b;", "Ltn/c$c;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC48694c {

    /* compiled from: CartSnippetActionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/c$a;", "Ltn/c;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.c$a */
    public static final /* data */ class a implements InterfaceC48694c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439422a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f439423b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f439424c;

        public a(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            bundle = (i12 & 4) != 0 ? null : bundle;
            this.f439422a = deepLink;
            this.f439423b = str;
            this.f439424c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f439422a, aVar.f439422a) && L.f(this.f439423b, aVar.f439423b) && L.f(this.f439424c, aVar.f439424c);
        }

        public final int hashCode() {
            int iHashCode = this.f439422a.hashCode() * 31;
            String str = this.f439423b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f439424c;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f439422a);
            sb2.append(", requestKey=");
            sb2.append(this.f439423b);
            sb2.append(", args=");
            return H.m(sb2, this.f439424c, ')');
        }
    }

    /* compiled from: CartSnippetActionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltn/c$b;", "Ltn/c;", "a", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.c$b */
    public static final /* data */ class b implements InterfaceC48694c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f439425a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f439426b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f439427c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f439428d;

        /* compiled from: CartSnippetActionsOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/c$b$a;", "", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: tn.c$b$a */
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

        public b(ApiError apiError, PrintableText printableText, a aVar, boolean z12, int i12, C42822w c42822w) {
            aVar = (i12 & 4) != 0 ? null : aVar;
            z12 = (i12 & 8) != 0 ? false : z12;
            this.f439425a = apiError;
            this.f439426b = printableText;
            this.f439427c = aVar;
            this.f439428d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f439425a, bVar.f439425a) && L.f(this.f439426b, bVar.f439426b) && L.f(this.f439427c, bVar.f439427c) && this.f439428d == bVar.f439428d;
        }

        public final int hashCode() {
            int iHashCode = this.f439426b.hashCode() + (this.f439425a.hashCode() * 31);
            a aVar = this.f439427c;
            if (aVar == null) {
                return Boolean.hashCode(this.f439428d) + (iHashCode * 961);
            }
            aVar.getClass();
            throw null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(cause=");
            sb2.append(this.f439425a);
            sb2.append(", message=");
            sb2.append(this.f439426b);
            sb2.append(", button=");
            sb2.append(this.f439427c);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f439428d, ')');
        }
    }

    /* compiled from: CartSnippetActionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/c$c;", "Ltn/c;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12679c implements InterfaceC48694c {

        /* renamed from: a, reason: collision with root package name */
        public final int f439429a;

        public C12679c(int i12) {
            this.f439429a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12679c) && this.f439429a == ((C12679c) obj).f439429a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439429a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f439429a, ')');
        }
    }
}
