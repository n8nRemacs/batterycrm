package ks;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lks/a;", "", "a", "b", "c", "Lks/a$a;", "Lks/a$b;", "Lks/a$c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ks.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43492a {

    /* compiled from: CpxPromoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lks/a$a;", "Lks/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ks.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11761a implements InterfaceC43492a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11761a f413252a = new C11761a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11761a);
        }

        public final int hashCode() {
            return 1964714010;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lks/a$b;", "Lks/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ks.a$b */
    public static final /* data */ class b implements InterfaceC43492a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f413253a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CpxPromoPriceInputContent f413254b;

        public b(@k DeepLink deepLink, @l CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            this.f413253a = deepLink;
            this.f413254b = cpxPromoPriceInputContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f413253a, bVar.f413253a) && L.f(this.f413254b, bVar.f413254b);
        }

        public final int hashCode() {
            int iHashCode = this.f413253a.hashCode() * 31;
            CpxPromoPriceInputContent cpxPromoPriceInputContent = this.f413254b;
            return iHashCode + (cpxPromoPriceInputContent == null ? 0 : cpxPromoPriceInputContent.hashCode());
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f413253a + ", inputSheetContent=" + this.f413254b + ')';
        }
    }

    /* compiled from: CpxPromoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lks/a$c;", "Lks/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ks.a$c */
    public static final /* data */ class c implements InterfaceC43492a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f413255a;

        public c(@k ApiError apiError) {
            this.f413255a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f413255a, ((c) obj).f413255a);
        }

        public final int hashCode() {
            return this.f413255a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowErrorToast(error="), this.f413255a, ')');
        }
    }
}
