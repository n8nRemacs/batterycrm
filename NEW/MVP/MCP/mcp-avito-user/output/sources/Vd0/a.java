package VD0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationRegionAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LVD0/a;", "", "a", "b", "c", "d", "e", "f", "LVD0/a$a;", "LVD0/a$b;", "LVD0/a$c;", "LVD0/a$d;", "LVD0/a$e;", "LVD0/a$f;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVD0/a$a;", "LVD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VD0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1166a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1166a f17007a = new C1166a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1166a);
        }

        public final int hashCode() {
            return 920906060;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVD0/a$b;", "LVD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17008a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1569344843;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/a$c;", "LVD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17009a;

        public c(@k DeepLink deepLink) {
            this.f17009a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17009a, ((c) obj).f17009a);
        }

        public final int hashCode() {
            return this.f17009a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deeplink="), this.f17009a, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/a$d;", "LVD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final com.avito.android.deeplink_handler.handler.bundle.a f17010a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17011b;

        public d(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f17010a = aVar;
            this.f17011b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17010a, dVar.f17010a) && this.f17011b == dVar.f17011b;
        }

        public final int hashCode() {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = this.f17010a;
            return Boolean.hashCode(this.f17011b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnDeepLinkLoadingChanged(bundle=");
            sb2.append(this.f17010a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f17011b, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/a$e;", "LVD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bundle f17012a;

        public e(@k Bundle bundle) {
            this.f17012a = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f17012a, ((e) obj).f17012a);
        }

        public final int hashCode() {
            return this.f17012a.hashCode();
        }

        @k
        public final String toString() {
            return H.m(new StringBuilder("OnNextButtonClicked(args="), this.f17012a, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVD0/a$f;", "LVD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17013a;

        public f(@k String str) {
            this.f17013a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f17013a, ((f) obj).f17013a);
        }

        public final int hashCode() {
            return this.f17013a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnRegionChecked(regionId="), this.f17013a, ')');
        }
    }
}
