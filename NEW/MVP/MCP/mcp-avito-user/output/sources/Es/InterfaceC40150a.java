package es;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Les/a;", "", "a", "b", "c", "Les/a$a;", "Les/a$b;", "Les/a$c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: es.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40150a {

    /* compiled from: CpxPromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Les/a$a;", "Les/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: es.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11108a implements InterfaceC40150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11108a f395402a = new C11108a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11108a);
        }

        public final int hashCode() {
            return 815084770;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Les/a$b;", "Les/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: es.a$b */
    public static final /* data */ class b implements InterfaceC40150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395403a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CpxPromoPriceInputContent f395404b;

        public b(@k DeepLink deepLink, @l CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            this.f395403a = deepLink;
            this.f395404b = cpxPromoPriceInputContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f395403a, bVar.f395403a) && L.f(this.f395404b, bVar.f395404b);
        }

        public final int hashCode() {
            int iHashCode = this.f395403a.hashCode() * 31;
            CpxPromoPriceInputContent cpxPromoPriceInputContent = this.f395404b;
            return iHashCode + (cpxPromoPriceInputContent == null ? 0 : cpxPromoPriceInputContent.hashCode());
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f395403a + ", inputSheetContent=" + this.f395404b + ')';
        }
    }

    /* compiled from: CpxPromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Les/a$c;", "Les/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: es.a$c */
    public static final /* data */ class c implements InterfaceC40150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f395405a;

        public c(@k ApiError apiError) {
            this.f395405a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395405a, ((c) obj).f395405a);
        }

        public final int hashCode() {
            return this.f395405a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowErrorToast(error="), this.f395405a, ')');
        }
    }
}
