package jB;

import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import iB.InterfaceC41263a;
import jB.InterfaceC42227a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"LjB/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "LjB/b$a;", "LjB/b$b;", "LjB/b$c;", "LjB/b$d;", "LjB/b$e;", "LjB/b$f;", "LjB/b$g;", "LjB/b$h;", "LjB/b$i;", "LjB/b$j;", "LjB/b$k;", "LjB/b$l;", "LjB/b$m;", "LjB/b$n;", "LjB/b$o;", "LjB/b$p;", "LjB/b$q;", "LjB/b$r;", "LjB/b$s;", "LjB/b$t;", "LjB/b$u;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42228b {

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$a;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$a */
    public static final /* data */ class a implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC41263a.C11369a<?> f405471a;

        public a(@Y61.k InterfaceC41263a.C11369a<?> c11369a) {
            this.f405471a = c11369a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f405471a, ((a) obj).f405471a);
        }

        public final int hashCode() {
            return this.f405471a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ApplyBottomSheetSelectorVariant(selector=" + this.f405471a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$b;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11551b implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f405472a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42227a.C11550a f405473b;

        public C11551b(@Y61.k Throwable th2, @Y61.k InterfaceC42227a.C11550a c11550a) {
            this.f405472a = th2;
            this.f405473b = c11550a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11551b)) {
                return false;
            }
            C11551b c11551b = (C11551b) obj;
            return L.f(this.f405472a, c11551b.f405472a) && this.f405473b.equals(c11551b.f405473b);
        }

        public final int hashCode() {
            return this.f405473b.hashCode() + (this.f405472a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ChangeVisibilityError(throwable=" + this.f405472a + ", retryAction=" + this.f405473b + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$c;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$c */
    public static final /* data */ class c implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405474a;

        public c(boolean z12) {
            this.f405474a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f405474a == ((c) obj).f405474a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405474a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ChangeVisibilitySuccess(isVisible="), this.f405474a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$d;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$d */
    public static final /* data */ class d implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405475a;

        public d(boolean z12) {
            this.f405475a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f405475a == ((d) obj).f405475a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405475a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("Close(success="), this.f405475a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$e;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$e */
    public static final /* data */ class e implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405476a;

        public e() {
            this(false, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f405476a == ((e) obj).f405476a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405476a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("CloseActionsBottomMenu(scrollToTop="), this.f405476a, ')');
        }

        public e(boolean z12) {
            this.f405476a = z12;
        }

        public /* synthetic */ e(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$f;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$f */
    public static final /* data */ class f implements InterfaceC42228b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "IncorrectValues(message=null)";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$g;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$g */
    public static final /* data */ class g implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f405477a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -744514056;
        }

        @Y61.k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$h;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$h */
    public static final /* data */ class h implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f405478a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1667997587;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$i;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$i */
    public static final /* data */ class i implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC41263a f405479a;

        public i(@Y61.k InterfaceC41263a interfaceC41263a) {
            this.f405479a = interfaceC41263a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f405479a, ((i) obj).f405479a);
        }

        public final int hashCode() {
            return this.f405479a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSettingsStateChanged(settings=" + this.f405479a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$j;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$j */
    public static final /* data */ class j implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetEditBlockArguments f405480a;

        public j(@Y61.k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
            this.f405480a = universalWidgetEditBlockArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f405480a, ((j) obj).f405480a);
        }

        public final int hashCode() {
            return this.f405480a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenBlockEditor(args=" + this.f405480a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$k;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$k */
    public static final /* data */ class k implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        public final int f405481a;

        public k(int i12) {
            this.f405481a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f405481a == ((k) obj).f405481a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f405481a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("RemoveBlock(index="), this.f405481a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$l;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$l */
    public static final /* data */ class l implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f405482a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42227a.k f405483b;

        public l(@Y61.k Throwable th2, @Y61.k InterfaceC42227a.k kVar) {
            this.f405482a = th2;
            this.f405483b = kVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f405482a, lVar.f405482a) && L.f(this.f405483b, lVar.f405483b);
        }

        public final int hashCode() {
            int iHashCode = this.f405482a.hashCode() * 31;
            this.f405483b.getClass();
            return 1619710521 + iHashCode;
        }

        @Y61.k
        public final String toString() {
            return "RemoveError(throwable=" + this.f405482a + ", retryAction=" + this.f405483b + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$m;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$m */
    public static final /* data */ class m implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f405484a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1777769482;
        }

        @Y61.k
        public final String toString() {
            return "RemoveSuccess";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$n;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$n */
    public static final /* data */ class n implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f405485a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42227a.m f405486b;

        public n(@Y61.k Throwable th2, @Y61.k InterfaceC42227a.m mVar) {
            this.f405485a = th2;
            this.f405486b = mVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f405485a, nVar.f405485a) && L.f(this.f405486b, nVar.f405486b);
        }

        public final int hashCode() {
            int iHashCode = this.f405485a.hashCode() * 31;
            this.f405486b.getClass();
            return 1529247270 + iHashCode;
        }

        @Y61.k
        public final String toString() {
            return "SavingError(throwable=" + this.f405485a + ", retryAction=" + this.f405486b + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$o;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$o */
    public static final /* data */ class o implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f405487a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 364271808;
        }

        @Y61.k
        public final String toString() {
            return "SavingSuccess";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$p;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$p */
    public static final /* data */ class p implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetSectionModel.ImageWithTextSection f405488a;

        public p(@Y61.k UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection) {
            this.f405488a = imageWithTextSection;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f405488a, ((p) obj).f405488a);
        }

        public final int hashCode() {
            return this.f405488a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SectionImagesUploaded(section=" + this.f405488a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$q;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$q */
    public static final /* data */ class q implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC41263a.C11369a<?> f405489a;

        public q(@Y61.k InterfaceC41263a.C11369a<?> c11369a) {
            this.f405489a = c11369a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f405489a, ((q) obj).f405489a);
        }

        public final int hashCode() {
            return this.f405489a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowBottomSheetSelectorDialog(selector=" + this.f405489a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$r;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$r */
    public static final /* data */ class r implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f405490a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -192224902;
        }

        @Y61.k
        public final String toString() {
            return "ShowCloseDialog";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$s;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$s */
    public static final /* data */ class s implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f405491a = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1002188669;
        }

        @Y61.k
        public final String toString() {
            return "ShowRemoveSectionDialog";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/b$t;", "LjB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$t */
    public static final /* data */ class t implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f405492a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 35603232;
        }

        @Y61.k
        public final String toString() {
            return "ShowVisibilityDialog";
        }
    }

    /* compiled from: UniversalWidgetEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/b$u;", "LjB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.b$u */
    public static final /* data */ class u implements InterfaceC42228b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetSectionModel.Block f405493a;

        /* renamed from: b, reason: collision with root package name */
        public final int f405494b;

        public u(@Y61.k UniversalWidgetSectionModel.Block block, int i12) {
            this.f405493a = block;
            this.f405494b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f405493a, uVar.f405493a) && this.f405494b == uVar.f405494b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f405494b) + (this.f405493a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateBlock(block=");
            sb2.append(this.f405493a);
            sb2.append(", index=");
            return androidx.appcompat.app.r.t(sb2, this.f405494b, ')');
        }
    }
}
