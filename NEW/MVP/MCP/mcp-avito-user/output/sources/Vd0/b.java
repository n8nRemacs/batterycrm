package VD0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationRegionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVD0/b;", "", "a", "b", "c", "LVD0/b$a;", "LVD0/b$b;", "LVD0/b$c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TariffLfPublicationRegionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVD0/b$a;", "LVD0/b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17014a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1351833479;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffLfPublicationRegionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/b$b;", "LVD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VD0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1167b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17015a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f17016b;

        public C1167b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f17015a = deepLink;
            this.f17016b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1167b)) {
                return false;
            }
            C1167b c1167b = (C1167b) obj;
            return L.f(this.f17015a, c1167b.f17015a) && L.f(this.f17016b, c1167b.f17016b);
        }

        public final int hashCode() {
            int iHashCode = this.f17015a.hashCode() * 31;
            Bundle bundle = this.f17016b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f17015a);
            sb2.append(", args=");
            return H.m(sb2, this.f17016b, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/b$c;", "LVD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17017a;

        public c(boolean z12) {
            this.f17017a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17017a == ((c) obj).f17017a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17017a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSimpleDeeplinkLoading(isLoading="), this.f17017a, ')');
        }
    }
}
