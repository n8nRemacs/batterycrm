package MD0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationCountOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMD0/b;", "", "a", "b", "c", "d", "LMD0/b$a;", "LMD0/b$b;", "LMD0/b$c;", "LMD0/b$d;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TariffLfPublicationCountOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMD0/b$a;", "LMD0/b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10465a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -948779911;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffLfPublicationCountOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/b$b;", "LMD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MD0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0664b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10466a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f10467b;

        public C0664b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f10466a = deepLink;
            this.f10467b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0664b)) {
                return false;
            }
            C0664b c0664b = (C0664b) obj;
            return L.f(this.f10466a, c0664b.f10466a) && L.f(this.f10467b, c0664b.f10467b);
        }

        public final int hashCode() {
            int iHashCode = this.f10466a.hashCode() * 31;
            Bundle bundle = this.f10467b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f10466a);
            sb2.append(", args=");
            return H.m(sb2, this.f10467b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/b$c;", "LMD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f10468a;

        /* renamed from: b, reason: collision with root package name */
        public final long f10469b;

        public c(long j12, @k PrintableText printableText) {
            this.f10468a = printableText;
            this.f10469b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f10468a, cVar.f10468a) && this.f10469b == cVar.f10469b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f10469b) + (this.f10468a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(message=");
            sb2.append(this.f10468a);
            sb2.append(", countId=");
            return r.u(sb2, this.f10469b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMD0/b$d;", "LMD0/b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10470a;

        public d(boolean z12) {
            this.f10470a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f10470a == ((d) obj).f10470a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10470a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSimpleDeeplinkLoading(isLoading="), this.f10470a, ')');
        }
    }
}
