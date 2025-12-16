package ts;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoGeoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lts/b;", "", "a", "b", "c", "Lts/b$a;", "Lts/b$b;", "Lts/b$c;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ts.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC48708b {

    /* compiled from: CpxPromoGeoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/b$a;", "Lts/b;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.b$a */
    public static final /* data */ class a implements InterfaceC48708b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f439487a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2026736566;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CpxPromoGeoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/b$b;", "Lts/b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12685b implements InterfaceC48708b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439488a;

        public C12685b(@k DeepLink deepLink) {
            this.f439488a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12685b) && L.f(this.f439488a, ((C12685b) obj).f439488a);
        }

        public final int hashCode() {
            return this.f439488a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f439488a, ')');
        }
    }

    /* compiled from: CpxPromoGeoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/b$c;", "Lts/b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.b$c */
    public static final /* data */ class c implements InterfaceC48708b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439489a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f439490b;

        public c(@k String str, boolean z12) {
            this.f439489a = str;
            this.f439490b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f439489a.equals(cVar.f439489a) && this.f439490b == cVar.f439490b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439490b) + (this.f439489a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(message=");
            sb2.append(this.f439489a);
            sb2.append(", isError=");
            return r.x(sb2, this.f439490b, ')');
        }
    }
}
