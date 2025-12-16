package MD0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationCountAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LMD0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LMD0/a$a;", "LMD0/a$b;", "LMD0/a$c;", "LMD0/a$d;", "LMD0/a$e;", "LMD0/a$f;", "LMD0/a$g;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMD0/a$a;", "LMD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MD0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0663a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0663a f10457a = new C0663a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0663a);
        }

        public final int hashCode() {
            return 1708328268;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/a$b;", "LMD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f10458a;

        public b(long j12) {
            this.f10458a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f10458a == ((b) obj).f10458a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f10458a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnCountChecked(countId="), this.f10458a, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMD0/a$c;", "LMD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f10459a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -770847051;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/a$d;", "LMD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10460a;

        public d(@k DeepLink deepLink) {
            this.f10460a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10460a, ((d) obj).f10460a);
        }

        public final int hashCode() {
            return this.f10460a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deeplink="), this.f10460a, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/a$e;", "LMD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final com.avito.android.deeplink_handler.handler.bundle.a f10461a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10462b;

        public e(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f10461a = aVar;
            this.f10462b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f10461a, eVar.f10461a) && this.f10462b == eVar.f10462b;
        }

        public final int hashCode() {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = this.f10461a;
            return Boolean.hashCode(this.f10462b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnDeepLinkLoadingChanged(bundle=");
            sb2.append(this.f10461a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f10462b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/a$f;", "LMD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bundle f10463a;

        public f(@k Bundle bundle) {
            this.f10463a = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f10463a, ((f) obj).f10463a);
        }

        public final int hashCode() {
            return this.f10463a.hashCode();
        }

        @k
        public final String toString() {
            return H.m(new StringBuilder("OnNextButtonClicked(args="), this.f10463a, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/a$g;", "LMD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f10464a;

        public g(long j12) {
            this.f10464a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f10464a == ((g) obj).f10464a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f10464a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnToastRetryButtonClicked(countId="), this.f10464a, ')');
        }
    }
}
