package Oe0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestCategoryAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LOe0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LOe0/a$a;", "LOe0/a$b;", "LOe0/a$c;", "LOe0/a$d;", "LOe0/a$e;", "LOe0/a$f;", "LOe0/a$g;", "LOe0/a$h;", "LOe0/a$i;", "LOe0/a$j;", "LOe0/a$k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oe0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14678a {

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$a;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0797a implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0797a f12444a = new C0797a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0797a);
        }

        public final int hashCode() {
            return -479773751;
        }

        @Y61.k
        public final String toString() {
            return "AppbarActionClick";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$b;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$b */
    public static final /* data */ class b implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f12445a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1320355192;
        }

        @Y61.k
        public final String toString() {
            return "AppbarBackClick";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$c;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$c */
    public static final /* data */ class c implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f12446a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1869952618;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/a$d;", "LOe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$d */
    public static final /* data */ class d implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Navigation f12447a;

        public d(@Y61.k Navigation navigation2) {
            this.f12447a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12447a, ((d) obj).f12447a);
        }

        public final int hashCode() {
            return this.f12447a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CategoryListItemClick(navigation=" + this.f12447a + ')';
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/a$e;", "LOe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$e */
    public static final /* data */ class e implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final WizardParameter f12448a;

        public e(@Y61.k WizardParameter wizardParameter) {
            this.f12448a = wizardParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return L.f(this.f12448a, ((e) obj).f12448a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f12448a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnCategorySelected(selectedCategory=" + this.f12448a + ", fromWizard=true)";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$f;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$f */
    public static final /* data */ class f implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f12449a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 673932782;
        }

        @Y61.k
        public final String toString() {
            return "OnLeavePublish";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$g;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$g */
    public static final /* data */ class g implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f12450a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1727896404;
        }

        @Y61.k
        public final String toString() {
            return "OnLeaveWizard";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/a$h;", "LOe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$h */
    public static final /* data */ class h implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ru.avito.component.toolbar.d f12451a;

        public h(@Y61.k ru.avito.component.toolbar.d dVar) {
            this.f12451a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f12451a, ((h) obj).f12451a);
        }

        public final int hashCode() {
            return this.f12451a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnboardingReceived(data=" + this.f12451a + ')';
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$i;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$i */
    public static final /* data */ class i implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f12452a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1667058306;
        }

        @Y61.k
        public final String toString() {
            return "PublishButtonClick";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$j;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$j */
    public static final /* data */ class j implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f12453a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -583852042;
        }

        @Y61.k
        public final String toString() {
            return "RepeatClick";
        }
    }

    /* compiled from: SuggestCategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/a$k;", "LOe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.a$k */
    public static final /* data */ class k implements InterfaceC14678a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f12454a = new k();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -873675730;
        }

        @Y61.k
        public final String toString() {
            return "ReturnToScreen";
        }
    }
}
