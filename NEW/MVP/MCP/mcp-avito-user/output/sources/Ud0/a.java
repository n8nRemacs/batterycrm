package UD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationLevelAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LUD0/a;", "", "a", "b", "c", "d", "e", "f", "LUD0/a$a;", "LUD0/a$b;", "LUD0/a$c;", "LUD0/a$d;", "LUD0/a$e;", "LUD0/a$f;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUD0/a$a;", "LUD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UD0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1108a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1108a f16267a = new C1108a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1108a);
        }

        public final int hashCode() {
            return -1313529139;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/a$b;", "LUD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16268a;

        public b(@k DeepLink deepLink) {
            this.f16268a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16268a, ((b) obj).f16268a);
        }

        public final int hashCode() {
            return this.f16268a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f16268a, ')');
        }
    }

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/a$c;", "LUD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16269a;

        public c(boolean z12) {
            this.f16269a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16269a == ((c) obj).f16269a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16269a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("DeepLinkLoading(isLoading="), this.f16269a, ')');
        }
    }

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/a$d;", "LUD0/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f16270a;

        public d(long j12) {
            this.f16270a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f16270a == ((d) obj).f16270a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f16270a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("LevelClick(levelId="), this.f16270a, ')');
        }
    }

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUD0/a$e;", "LUD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f16271a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1313167143;
        }

        @k
        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: TariffLfPublicationLevelAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUD0/a$f;", "LUD0/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f16272a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2049785470;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }
}
