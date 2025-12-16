package fA;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileOneTimeEvent.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LfA/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LfA/c$a;", "LfA/c$b;", "LfA/c$c;", "LfA/c$d;", "LfA/c$e;", "LfA/c$f;", "LfA/c$g;", "LfA/c$h;", "LfA/c$i;", "LfA/c$j;", "LfA/c$k;", "LfA/c$l;", "LfA/c$m;", "LfA/c$n;", "LfA/c$o;", "LfA/c$p;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fA.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40270c {

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/c$a;", "LfA/c;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$a */
    public static final class a implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f395744a = new a();
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$b;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$b */
    public static final /* data */ class b implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f395745a;

        public b(@Y61.k ArrayList arrayList) {
            this.f395745a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f395745a.equals(((b) obj).f395745a);
        }

        public final int hashCode() {
            return this.f395745a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("NotifyItemsChanged(itemIds="), this.f395745a, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$c;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11132c implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f395746a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395747b;

        public C11132c(@Y61.k List<Image> list, int i12) {
            this.f395746a = list;
            this.f395747b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11132c)) {
                return false;
            }
            C11132c c11132c = (C11132c) obj;
            return L.f(this.f395746a, c11132c.f395746a) && this.f395747b == c11132c.f395747b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395747b) + (this.f395746a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f395746a);
            sb2.append(", position=");
            return r.t(sb2, this.f395747b, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$d;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$d */
    public static final /* data */ class d implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395748a;

        public d(@Y61.k DeepLink deepLink) {
            this.f395748a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f395748a, ((d) obj).f395748a);
        }

        public final int hashCode() {
            return this.f395748a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenInProfileTab(deepLink="), this.f395748a, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$e;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$e */
    public static final /* data */ class e implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineFilterNavigationItem f395749a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f395750b;

        public e(@Y61.k InlineFilterNavigationItem inlineFilterNavigationItem, @Y61.k SearchParams searchParams) {
            this.f395749a = inlineFilterNavigationItem;
            this.f395750b = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f395749a, eVar.f395749a) && L.f(this.f395750b, eVar.f395750b);
        }

        public final int hashCode() {
            return this.f395750b.hashCode() + (this.f395749a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(item=");
            sb2.append(this.f395749a);
            sb2.append(", searchParams=");
            return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f395750b, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$f;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$f */
    public static final /* data */ class f implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395751a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f395752b;

        public f(@Y61.k SearchParams searchParams, @Y61.k String str) {
            this.f395751a = str;
            this.f395752b = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f395751a, fVar.f395751a) && L.f(this.f395752b, fVar.f395752b);
        }

        public final int hashCode() {
            return this.f395752b.hashCode() + (this.f395751a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilterWithId(filterId=");
            sb2.append(this.f395751a);
            sb2.append(", searchParams=");
            return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f395752b, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/c$g;", "LfA/c;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$g */
    public static final class g implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f395753a = new g();
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$h;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$h */
    public static final /* data */ class h implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f395754a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f395755b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final FilterAnalyticsData f395756c;

        public h(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.k FilterAnalyticsData filterAnalyticsData) {
            this.f395754a = searchParams;
            this.f395755b = str;
            this.f395756c = filterAnalyticsData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f395754a, hVar.f395754a) && L.f(this.f395755b, hVar.f395755b) && L.f(this.f395756c, hVar.f395756c);
        }

        public final int hashCode() {
            int iHashCode = this.f395754a.hashCode() * 31;
            String str = this.f395755b;
            return this.f395756c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OpenSearchFilters(searchParams=" + this.f395754a + ", infoModelForm=" + this.f395755b + ", analyticsParams=" + this.f395756c + ')';
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$i;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$i */
    public static final /* data */ class i implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395757a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f395758b;

        public i(@Y61.k String str, @Y61.k String str2) {
            this.f395757a = str;
            this.f395758b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f395757a, iVar.f395757a) && L.f(this.f395758b, iVar.f395758b);
        }

        public final int hashCode() {
            return this.f395758b.hashCode() + (this.f395757a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Share(title=");
            sb2.append(this.f395757a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f395758b, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$j;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$j */
    public static final /* data */ class j implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f395759a;

        public j(@Y61.k Throwable th2) {
            this.f395759a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                return L.f(this.f395759a, ((j) obj).f395759a) && L.f(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f395759a.hashCode() * 31;
        }

        @Y61.k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f395759a + ", buttonAction=null)";
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/c$l;", "LfA/c;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$l */
    public static final class l implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f395763a = new l();
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$m;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$m */
    public static final /* data */ class m implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395764a;

        public m(@Y61.k String str) {
            this.f395764a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f395764a, ((m) obj).f395764a);
        }

        public final int hashCode() {
            return this.f395764a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowScreenByJson(beduinJson="), this.f395764a, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/c$n;", "LfA/c;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$n */
    public static final /* data */ class n implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f395765a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1992506816;
        }

        @Y61.k
        public final String toString() {
            return "UpdateExtendedProfileLazyColumnComponent";
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$o;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$o */
    public static final /* data */ class o implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<QH.a> f395766a;

        /* JADX WARN: Multi-variable type inference failed */
        public o(@Y61.k List<? extends QH.a> list) {
            this.f395766a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f395766a, ((o) obj).f395766a);
        }

        public final int hashCode() {
            return this.f395766a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("UpdateFloatingContactBar(items="), this.f395766a, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$p;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$p */
    public static final /* data */ class p implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395767a;

        public p(boolean z12) {
            this.f395767a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f395767a == ((p) obj).f395767a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395767a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("UpdateShareMenuVisibility(isVisible="), this.f395767a, ')');
        }
    }

    /* compiled from: ExtendedProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/c$k;", "LfA/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.c$k */
    public static final /* data */ class k implements InterfaceC40270c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f395760a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ToastBarPosition f395761b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f395762c;

        public k(@Y61.k com.avito.android.component.toast.f fVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k PrintableText printableText) {
            this.f395760a = printableText;
            this.f395761b = toastBarPosition;
            this.f395762c = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f395760a, kVar.f395760a) && this.f395761b == kVar.f395761b && L.f(this.f395762c, kVar.f395762c);
        }

        public final int hashCode() {
            return this.f395762c.hashCode() + ((this.f395761b.hashCode() + (this.f395760a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowCustomToastBar(message=" + this.f395760a + ", position=" + this.f395761b + ", type=" + this.f395762c + ')';
        }

        public /* synthetic */ k(PrintableText printableText, ToastBarPosition toastBarPosition, com.avito.android.component.toast.f fVar, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? f.a.f125253a : fVar, (i12 & 2) != 0 ? ToastBarPosition.f181046d : toastBarPosition, printableText);
        }
    }
}
