package qC0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LqC0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LqC0/a$a;", "LqC0/a$b;", "LqC0/a$c;", "LqC0/a$d;", "LqC0/a$e;", "LqC0/a$f;", "LqC0/a$g;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47279a {

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/a$a;", "LqC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12313a implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12313a f429104a = new C12313a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12313a);
        }

        public final int hashCode() {
            return -1018767405;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/a$c;", "LqC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$c */
    public static final /* data */ class c implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f429107a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1394962345;
        }

        @k
        public final String toString() {
            return "OnHelp";
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC0/a$d;", "LqC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$d */
    public static final /* data */ class d implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429108a;

        /* renamed from: b, reason: collision with root package name */
        public final long f429109b;

        public d(boolean z12, long j12) {
            this.f429108a = z12;
            this.f429109b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f429108a == dVar.f429108a && this.f429109b == dVar.f429109b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f429109b) + (Boolean.hashCode(this.f429108a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnLevelButtonLoading(isLoading=");
            sb2.append(this.f429108a);
            sb2.append(", levelCardId=");
            return r.u(sb2, this.f429109b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/a$e;", "LqC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$e */
    public static final /* data */ class e implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f429110a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1395141467;
        }

        @k
        public final String toString() {
            return "OnNext";
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC0/a$f;", "LqC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$f */
    public static final /* data */ class f implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429111a;

        public f(boolean z12) {
            this.f429111a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f429111a == ((f) obj).f429111a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f429111a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnNextButtonLoading(isLoading="), this.f429111a, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/a$g;", "LqC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$g */
    public static final /* data */ class g implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f429112a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 815310849;
        }

        @k
        public final String toString() {
            return "OnReload";
        }
    }

    /* compiled from: TariffCptConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC0/a$b;", "LqC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.a$b */
    public static final /* data */ class b implements InterfaceC47279a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429105a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f429106b;

        public b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f429105a = deepLink;
            this.f429106b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f429105a, bVar.f429105a) && L.f(this.f429106b, bVar.f429106b);
        }

        public final int hashCode() {
            int iHashCode = this.f429105a.hashCode() * 31;
            Bundle bundle = this.f429106b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnDeepLinkClicked(deeplink=");
            sb2.append(this.f429105a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f429106b, ')');
        }

        public /* synthetic */ b(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }
}
