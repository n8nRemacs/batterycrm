package oC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLandingAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LoC0/a;", "", "a", "b", "c", "d", "e", "LoC0/a$a;", "LoC0/a$b;", "LoC0/a$c;", "LoC0/a$d;", "LoC0/a$e;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44623a {

    /* compiled from: TariffCptConfigureLandingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoC0/a$a;", "LoC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12176a implements InterfaceC44623a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12176a f419588a = new C12176a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12176a);
        }

        public final int hashCode() {
            return -1332557552;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: TariffCptConfigureLandingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/a$b;", "LoC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.a$b */
    public static final /* data */ class b implements InterfaceC44623a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419589a;

        public b(@k DeepLink deepLink) {
            this.f419589a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f419589a, ((b) obj).f419589a);
        }

        public final int hashCode() {
            return this.f419589a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClicked(deeplink="), this.f419589a, ')');
        }
    }

    /* compiled from: TariffCptConfigureLandingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoC0/a$c;", "LoC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.a$c */
    public static final /* data */ class c implements InterfaceC44623a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f419590a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1992526658;
        }

        @k
        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: TariffCptConfigureLandingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoC0/a$d;", "LoC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.a$d */
    public static final /* data */ class d implements InterfaceC44623a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f419591a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1635093955;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: TariffCptConfigureLandingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/a$e;", "LoC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.a$e */
    public static final /* data */ class e implements InterfaceC44623a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419592a;

        public e(boolean z12) {
            this.f419592a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f419592a == ((e) obj).f419592a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419592a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowButtonProgress(isShow="), this.f419592a, ')');
        }
    }
}
