package oC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLandingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoC0/b;", "", "a", "b", "c", "LoC0/b$a;", "LoC0/b$b;", "LoC0/b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44624b {

    /* compiled from: TariffCptConfigureLandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoC0/b$a;", "LoC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.b$a */
    public static final /* data */ class a implements InterfaceC44624b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f419593a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 122321217;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffCptConfigureLandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/b$b;", "LoC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12177b implements InterfaceC44624b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419594a;

        public C12177b(@k DeepLink deepLink) {
            this.f419594a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12177b) && L.f(this.f419594a, ((C12177b) obj).f419594a);
        }

        public final int hashCode() {
            return this.f419594a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f419594a, ')');
        }
    }

    /* compiled from: TariffCptConfigureLandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/b$c;", "LoC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.b$c */
    public static final /* data */ class c implements InterfaceC44624b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419595a;

        public c(@k DeepLink deepLink) {
            this.f419595a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f419595a, ((c) obj).f419595a);
        }

        public final int hashCode() {
            return this.f419595a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(deeplink="), this.f419595a, ')');
        }
    }
}
