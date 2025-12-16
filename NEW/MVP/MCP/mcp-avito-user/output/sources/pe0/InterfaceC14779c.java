package Pe0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WizardOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LPe0/c;", "", "a", "b", "c", "d", "e", "f", "LPe0/c$a;", "LPe0/c$b;", "LPe0/c$c;", "LPe0/c$d;", "LPe0/c$e;", "LPe0/c$f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pe0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14779c {

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/c$a;", "LPe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$a */
    public static final class a implements InterfaceC14779c {
    }

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/c$b;", "LPe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$b */
    public static final /* data */ class b implements InterfaceC14779c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13204a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2056158527;
        }

        @k
        public final String toString() {
            return "Leave";
        }
    }

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/c$c;", "LPe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0855c implements InterfaceC14779c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0855c f13205a = new C0855c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0855c);
        }

        public final int hashCode() {
            return 37102288;
        }

        @k
        public final String toString() {
            return "LeavePublish";
        }
    }

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/c$d;", "LPe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$d */
    public static final /* data */ class d implements InterfaceC14779c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13206a;

        public d(@k DeepLink deepLink) {
            this.f13206a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13206a, ((d) obj).f13206a);
        }

        public final int hashCode() {
            return this.f13206a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f13206a, ')');
        }
    }

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/c$e;", "LPe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$e */
    public static final /* data */ class e implements InterfaceC14779c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WizardParameter f13207a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13208b;

        public e(@k WizardParameter wizardParameter, boolean z12) {
            this.f13207a = wizardParameter;
            this.f13208b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f13207a, eVar.f13207a) && this.f13208b == eVar.f13208b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13208b) + (this.f13207a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectCategory(parameter=");
            sb2.append(this.f13207a);
            sb2.append(", isAutoSelected=");
            return r.x(sb2, this.f13208b, ')');
        }
    }

    /* compiled from: WizardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/c$f;", "LPe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.c$f */
    public static final /* data */ class f implements InterfaceC14779c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Navigation f13209a;

        public f(@l Navigation navigation2) {
            this.f13209a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f13209a, ((f) obj).f13209a);
        }

        public final int hashCode() {
            Navigation navigation2 = this.f13209a;
            if (navigation2 == null) {
                return 0;
            }
            return navigation2.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCurrentNavigation(navigation=" + this.f13209a + ')';
        }
    }
}
