package FC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LFC0/a;", "", "a", "b", "c", "d", "e", "f", "LFC0/a$a;", "LFC0/a$b;", "LFC0/a$c;", "LFC0/a$d;", "LFC0/a$e;", "LFC0/a$f;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC0/a$a;", "LFC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FC0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0282a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4618a;

        public C0282a(@k DeepLink deepLink) {
            this.f4618a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0282a) && L.f(this.f4618a, ((C0282a) obj).f4618a);
        }

        public final int hashCode() {
            return this.f4618a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BusinessToolClick(deeplink="), this.f4618a, ')');
        }
    }

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC0/a$b;", "LFC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f4619a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1589454435;
        }

        @k
        public final String toString() {
            return "ButtonAction";
        }
    }

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC0/a$c;", "LFC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4620a;

        public c(@k DeepLink deepLink) {
            this.f4620a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4620a, ((c) obj).f4620a);
        }

        public final int hashCode() {
            return this.f4620a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f4620a, ')');
        }
    }

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC0/a$d;", "LFC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h f4621a;

        public d(@k h hVar) {
            this.f4621a = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4621a, ((d) obj).f4621a);
        }

        public final int hashCode() {
            return this.f4621a.hashCode();
        }

        @k
        public final String toString() {
            return "LevelClick(level=" + this.f4621a + ')';
        }
    }

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC0/a$e;", "LFC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4622a;

        public e(boolean z12) {
            this.f4622a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f4622a == ((e) obj).f4622a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4622a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChanged(isLoading="), this.f4622a, ')');
        }
    }

    /* compiled from: TariffCptLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC0/a$f;", "LFC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f4623a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2099575904;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }
}
