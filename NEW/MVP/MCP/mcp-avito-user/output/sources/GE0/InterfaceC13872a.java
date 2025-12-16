package Ge0;

import Ee0.C13479a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ObjectFillFormAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LGe0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LGe0/a$a;", "LGe0/a$b;", "LGe0/a$c;", "LGe0/a$d;", "LGe0/a$e;", "LGe0/a$f;", "LGe0/a$g;", "LGe0/a$h;", "LGe0/a$i;", "LGe0/a$j;", "LGe0/a$k;", "LGe0/a$l;", "LGe0/a$m;", "LGe0/a$n;", "LGe0/a$o;", "LGe0/a$p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ge0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13872a {

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$a;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0359a implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C13479a f6630a;

        public C0359a(@Y61.k C13479a c13479a) {
            this.f6630a = c13479a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0359a) && L.f(this.f6630a, ((C0359a) obj).f6630a);
        }

        public final int hashCode() {
            return this.f6630a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ApplyNavigationButtonAction(data=" + this.f6630a + ')';
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$b;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$b */
    public static final /* data */ class b implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6631a;

        public b(boolean z12) {
            this.f6631a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f6631a == ((b) obj).f6631a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6631a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("AuthResult(isSuccess="), this.f6631a, ')');
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$c;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$c */
    public static final /* data */ class c implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6632a;

        public c() {
            this(false, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f6632a == ((c) obj).f6632a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6632a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("BackButtonClicked(isImmediatelyBack="), this.f6632a, ')');
        }

        public c(boolean z12) {
            this.f6632a = z12;
        }

        public /* synthetic */ c(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$d;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$d */
    public static final /* data */ class d implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final k.b f6633a;

        public d(@Y61.l k.b bVar) {
            this.f6633a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6633a, ((d) obj).f6633a);
        }

        public final int hashCode() {
            return this.f6633a == null ? 0 : 178725418;
        }

        @Y61.k
        public final String toString() {
            return "ConditionalButtonChange(state=" + this.f6633a + ')';
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$e;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$e */
    public static final /* data */ class e implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6634a;

        public e(@Y61.k DeepLink deepLink) {
            this.f6634a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f6634a, ((e) obj).f6634a);
        }

        public final int hashCode() {
            return this.f6634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deepLink="), this.f6634a, ')');
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGe0/a$f;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$f */
    public static final /* data */ class f implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f6635a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1231190525;
        }

        @Y61.k
        public final String toString() {
            return "DeleteButtonClicked";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGe0/a$g;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$g */
    public static final /* data */ class g implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f6636a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1851329330;
        }

        @Y61.k
        public final String toString() {
            return "DeleteObjectConfirmed";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGe0/a$h;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$h */
    public static final /* data */ class h implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f6637a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1067651952;
        }

        @Y61.k
        public final String toString() {
            return "ErrorActionClicked";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$i;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$i */
    public static final /* data */ class i implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BubbleInfo f6638a;

        public i(@Y61.k BubbleInfo bubbleInfo) {
            this.f6638a = bubbleInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f6638a, ((i) obj).f6638a);
        }

        public final int hashCode() {
            return this.f6638a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ImvBubbleClicked(bubble=" + this.f6638a + ')';
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$j;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$j */
    public static final /* data */ class j implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6639a;

        public j(boolean z12) {
            this.f6639a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f6639a == ((j) obj).f6639a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6639a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("LoadingInterrupted(isProgress="), this.f6639a, ')');
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGe0/a$k;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$k */
    public static final /* data */ class k implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f6640a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 486444789;
        }

        @Y61.k
        public final String toString() {
            return "MainButtonClicked";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$l;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$l */
    public static final /* data */ class l implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C13479a f6641a;

        public l(@Y61.k C13479a c13479a) {
            this.f6641a = c13479a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f6641a, ((l) obj).f6641a);
        }

        public final int hashCode() {
            return this.f6641a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NavigationButtonClicked(data=" + this.f6641a + ')';
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$m;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$m */
    public static final /* data */ class m implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6642a;

        public m(boolean z12) {
            this.f6642a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f6642a == ((m) obj).f6642a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6642a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PriceListInputFocusChanged(hasFocus="), this.f6642a, ')');
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGe0/a$n;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$n */
    public static final /* data */ class n implements InterfaceC13872a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f6643a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1775898330;
        }

        @Y61.k
        public final String toString() {
            return "RetryClicked";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$p;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$p */
    public static final /* data */ class p implements InterfaceC13872a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            ((p) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @Y61.k
        public final String toString() {
            return "ToolTipButtonClicked(position=0)";
        }
    }

    /* compiled from: ObjectFillFormAction.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LGe0/a$o;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/Action;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LGe0/a$o$a;", "LGe0/a$o$b;", "LGe0/a$o$c;", "LGe0/a$o$d;", "LGe0/a$o$f;", "LGe0/a$o$g;", "LGe0/a$o$h;", "LGe0/a$o$i;", "LGe0/a$o$j;", "LGe0/a$o$k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ge0.a$o */
    public interface o extends InterfaceC13872a {

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$b;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$b */
        public static final /* data */ class b implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.conveyor_item.a f6649a;

            public b(@Y61.k com.avito.conveyor_item.a aVar) {
                this.f6649a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f6649a, ((b) obj).f6649a);
            }

            public final int hashCode() {
                return this.f6649a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ElementClicked(item=" + this.f6649a + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$d;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$d */
        public static final /* data */ class d implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final e f6653a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f6653a, ((d) obj).f6653a);
            }

            public final int hashCode() {
                e eVar = this.f6653a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ScreenItemUpdated(payload=" + this.f6653a + ')';
            }

            public d(@Y61.l e eVar) {
                this.f6653a = eVar;
            }

            public /* synthetic */ d(e eVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : eVar);
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGe0/a$o$e;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$e */
        public static final /* data */ class e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f6654a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f6655b;

            /* compiled from: ObjectFillFormAction.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGe0/a$o$e$a;", "", "<init>", "()V", "", "PRICE_TYPE", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: Ge0.a$o$e$a, reason: collision with other inner class name */
            public static final class C0361a {
                public /* synthetic */ C0361a(C42822w c42822w) {
                    this();
                }

                public C0361a() {
                }
            }

            static {
                new C0361a(null);
            }

            public e(@Y61.k String str, @Y61.k String str2) {
                this.f6654a = str;
                this.f6655b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f6654a, eVar.f6654a) && L.f(this.f6655b, eVar.f6655b);
            }

            public final int hashCode() {
                return ((this.f6655b.hashCode() + (this.f6654a.hashCode() * 31)) * 31) + 106934601;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScreenItemUpdatedPayload(updatedParamId=");
                sb2.append(this.f6654a);
                sb2.append(", value=");
                return AK.c.s(sb2, this.f6655b, ", type=price)");
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$g;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$g */
        public static final /* data */ class g implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final c.a f6659a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ParameterElement.C29377e f6660b;

            public g(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
                this.f6659a = aVar;
                this.f6660b = c29377e;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f6659a, gVar.f6659a) && L.f(this.f6660b, gVar.f6660b);
            }

            public final int hashCode() {
                return this.f6660b.hashCode() + (this.f6659a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "ShowDatePickerDialogClicked(dateSelectInfo=" + this.f6659a + ", dateTime=" + this.f6660b + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$h;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$h */
        public static final /* data */ class h implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final c.a f6661a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ParameterElement.C29377e f6662b;

            public h(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
                this.f6661a = aVar;
                this.f6662b = c29377e;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return L.f(this.f6661a, hVar.f6661a) && L.f(this.f6662b, hVar.f6662b);
            }

            public final int hashCode() {
                return this.f6662b.hashCode() + (this.f6661a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "ShowDateTimeRangeDialogClicked(dateSelectInfo=" + this.f6661a + ", dateTime=" + this.f6662b + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$i;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$i */
        public static final /* data */ class i implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final SuggestInstituteArguments f6663a;

            public i(@Y61.k SuggestInstituteArguments suggestInstituteArguments) {
                this.f6663a = suggestInstituteArguments;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && L.f(this.f6663a, ((i) obj).f6663a);
            }

            public final int hashCode() {
                return this.f6663a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowSuggestInstitutesDialogClicked(args=" + this.f6663a + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$j;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$j */
        public static final /* data */ class j implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final SelectedSuggestInstitute f6664a;

            public j(@Y61.k SelectedSuggestInstitute selectedSuggestInstitute) {
                this.f6664a = selectedSuggestInstitute;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && L.f(this.f6664a, ((j) obj).f6664a);
            }

            public final int hashCode() {
                return this.f6664a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SuggestInstituteSelected(suggestInstitute=" + this.f6664a + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$k;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$k */
        public static final /* data */ class k implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Ij.b f6665a;

            public k(@Y61.k Ij.b bVar) {
                this.f6665a = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && L.f(this.f6665a, ((k) obj).f6665a);
            }

            public final int hashCode() {
                return this.f6665a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ValueSelected(selectInfo=" + this.f6665a + ')';
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$c;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$c */
        public static final /* data */ class c implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.items.d f6650a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f6651b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f6652c;

            public c(@Y61.k com.avito.android.items.d dVar, @Y61.k String str, boolean z12) {
                this.f6650a = dVar;
                this.f6651b = str;
                this.f6652c = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f6650a, cVar.f6650a) && L.f(this.f6651b, cVar.f6651b) && this.f6652c == cVar.f6652c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f6652c) + H.d(this.f6650a.hashCode() * 31, 31, this.f6651b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ElementValueChanged(element=");
                sb2.append(this.f6650a);
                sb2.append(", newValue=");
                sb2.append(this.f6651b);
                sb2.append(", updateElement=");
                return r.x(sb2, this.f6652c, ')');
            }

            public /* synthetic */ c(com.avito.android.items.d dVar, String str, boolean z12, int i12, C42822w c42822w) {
                this(dVar, str, (i12 & 4) != 0 ? true : z12);
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$f;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$f */
        public static final /* data */ class f implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f6656a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<ParcelableEntity<String>> f6657b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f6658c;

            /* JADX WARN: Multi-variable type inference failed */
            public f(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l String str2) {
                this.f6656a = str;
                this.f6657b = list;
                this.f6658c = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f6656a, fVar.f6656a) && L.f(this.f6657b, fVar.f6657b) && L.f(this.f6658c, fVar.f6658c);
            }

            public final int hashCode() {
                int iE2 = H.e(this.f6656a.hashCode() * 31, 31, this.f6657b);
                String str = this.f6658c;
                return iE2 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Selected(requestId=");
                sb2.append(this.f6656a);
                sb2.append(", selectedItems=");
                sb2.append(this.f6657b);
                sb2.append(", sectionTitle=");
                return C22026a.c(sb2, this.f6658c, ')');
            }

            public /* synthetic */ f(String str, List list, String str2, int i12, C42822w c42822w) {
                this(str, list, (i12 & 4) != 0 ? null : str2);
            }
        }

        /* compiled from: ObjectFillFormAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGe0/a$o$a;", "LGe0/a$o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ge0.a$o$a, reason: collision with other inner class name */
        public static final /* data */ class C0360a implements o {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ParameterElement.C29376d f6644a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ParameterElement.C29377e f6645b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Long f6646c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f6647d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f6648e;

            public C0360a(@Y61.k ParameterElement.C29376d c29376d, @Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12, boolean z12, boolean z13) {
                this.f6644a = c29376d;
                this.f6645b = c29377e;
                this.f6646c = l12;
                this.f6647d = z12;
                this.f6648e = z13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0360a)) {
                    return false;
                }
                C0360a c0360a = (C0360a) obj;
                return L.f(this.f6644a, c0360a.f6644a) && L.f(this.f6645b, c0360a.f6645b) && L.f(this.f6646c, c0360a.f6646c) && this.f6647d == c0360a.f6647d && this.f6648e == c0360a.f6648e;
            }

            public final int hashCode() {
                int iHashCode = (this.f6645b.hashCode() + (this.f6644a.hashCode() * 31)) * 31;
                Long l12 = this.f6646c;
                return Boolean.hashCode(this.f6648e) + r.i((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f6647d);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DateIntervalValueChanged(element=");
                sb2.append(this.f6644a);
                sb2.append(", dateTime=");
                sb2.append(this.f6645b);
                sb2.append(", timestamp=");
                sb2.append(this.f6646c);
                sb2.append(", presentTime=");
                sb2.append(this.f6647d);
                sb2.append(", updateDateTime=");
                return r.x(sb2, this.f6648e, ')');
            }

            public /* synthetic */ C0360a(ParameterElement.C29376d c29376d, ParameterElement.C29377e c29377e, Long l12, boolean z12, boolean z13, int i12, C42822w c42822w) {
                this(c29376d, c29377e, l12, z12, (i12 & 16) != 0 ? true : z13);
            }
        }
    }
}
