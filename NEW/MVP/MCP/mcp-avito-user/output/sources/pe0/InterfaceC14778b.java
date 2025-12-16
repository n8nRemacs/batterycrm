package Pe0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WizardInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LPe0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LPe0/b$a;", "LPe0/b$b;", "LPe0/b$c;", "LPe0/b$d;", "LPe0/b$e;", "LPe0/b$f;", "LPe0/b$g;", "LPe0/b$h;", "LPe0/b$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pe0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14778b {

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$a;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$a */
    public static final /* data */ class a implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f13195a;

        public a(@k ArrayList arrayList) {
            this.f13195a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13195a.equals(((a) obj).f13195a);
        }

        public final int hashCode() {
            return this.f13195a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Content(items="), this.f13195a, ')');
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$b;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$b, reason: collision with other inner class name */
    public static final class C0854b implements InterfaceC14778b {
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/b$c;", "LPe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$c */
    public static final /* data */ class c implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f13196a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 978681803;
        }

        @k
        public final String toString() {
            return "Leave";
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/b$d;", "LPe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$d */
    public static final /* data */ class d implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13197a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -703763772;
        }

        @k
        public final String toString() {
            return "LeavePublish";
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$e;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$e */
    public static final /* data */ class e implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13198a;

        public e(@k DeepLink deepLink) {
            this.f13198a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13198a, ((e) obj).f13198a);
        }

        public final int hashCode() {
            return this.f13198a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f13198a, ')');
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$f;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$f */
    public static final /* data */ class f implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WizardParameter f13199a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13200b;

        public f(@k WizardParameter wizardParameter, boolean z12) {
            this.f13199a = wizardParameter;
            this.f13200b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f13199a, fVar.f13199a) && this.f13200b == fVar.f13200b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13200b) + (this.f13199a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectCategory(parameter=");
            sb2.append(this.f13199a);
            sb2.append(", isAutoSelected=");
            return r.x(sb2, this.f13200b, ')');
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPe0/b$g;", "LPe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$g */
    public static final /* data */ class g implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f13201a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 988537887;
        }

        @k
        public final String toString() {
            return "ShowError";
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$h;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$h */
    public static final /* data */ class h implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Navigation f13202a;

        public h(@l Navigation navigation2) {
            this.f13202a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f13202a, ((h) obj).f13202a);
        }

        public final int hashCode() {
            Navigation navigation2 = this.f13202a;
            if (navigation2 == null) {
                return 0;
            }
            return navigation2.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCurrentNavigation(navigation=" + this.f13202a + ')';
        }
    }

    /* compiled from: WizardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPe0/b$i;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pe0.b$i */
    public static final /* data */ class i implements InterfaceC14778b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WizardParameter f13203a;

        public i(@k WizardParameter wizardParameter) {
            this.f13203a = wizardParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f13203a, ((i) obj).f13203a);
        }

        public final int hashCode() {
            return this.f13203a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCurrentParameter(parameter=" + this.f13203a + ')';
        }
    }
}
