package TI0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.authorization.AuthSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.root_screen.adverts_host.TabItem;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShortcutsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LTI0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UI0.c f15553b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AuthSource f15554c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UI0.a f15555d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UI0.a f15556e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<a> f15557f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15558g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f15559h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15560i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f15561j;

    /* compiled from: ShortcutsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTI0/c$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15562a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f15563b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertsShortcuts.Shortcut f15564c;

        public a(@k String str, @k String str2, @k UserAdvertsShortcuts.Shortcut shortcut) {
            this.f15562a = str;
            this.f15563b = str2;
            this.f15564c = shortcut;
        }

        public static a a(a aVar, String str, UserAdvertsShortcuts.Shortcut shortcut, int i12) {
            if ((i12 & 2) != 0) {
                str = aVar.f15563b;
            }
            if ((i12 & 4) != 0) {
                shortcut = aVar.f15564c;
            }
            return new a(aVar.f15562a, str, shortcut);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f15562a, aVar.f15562a) && L.f(this.f15563b, aVar.f15563b) && L.f(this.f15564c, aVar.f15564c);
        }

        public final int hashCode() {
            return this.f15564c.hashCode() + H.d(this.f15562a.hashCode() * 31, 31, this.f15563b);
        }

        @k
        public final String toString() {
            return "Shortcut(idempotencyKey=" + this.f15562a + ", refreshKey=" + this.f15563b + ", domainShortcut=" + this.f15564c + ')';
        }
    }

    /* compiled from: ShortcutsState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LTI0/c$b;", "", "a", "b", "c", "d", "e", "LTI0/c$b$a;", "LTI0/c$b$b;", "LTI0/c$b$c;", "LTI0/c$b$d;", "LTI0/c$b$e;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTI0/c$b$a;", "LTI0/c$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f15565a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f15566b;

            /* renamed from: c, reason: collision with root package name */
            public final int f15567c;

            /* renamed from: d, reason: collision with root package name */
            public final int f15568d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<TabItem> f15569e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final UV0.c<TabItem> f15570f;

            public a() {
                this(false, false, 0, 0, null, 31, null);
            }

            public static a a(a aVar, boolean z12) {
                boolean z13 = aVar.f15566b;
                int i12 = aVar.f15567c;
                int i13 = aVar.f15568d;
                List<TabItem> list = aVar.f15569e;
                aVar.getClass();
                return new a(z12, z13, i12, i13, list);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f15565a == aVar.f15565a && this.f15566b == aVar.f15566b && this.f15567c == aVar.f15567c && this.f15568d == aVar.f15568d && L.f(this.f15569e, aVar.f15569e);
            }

            public final int hashCode() {
                return this.f15569e.hashCode() + r.e(this.f15568d, r.e(this.f15567c, r.i(Boolean.hashCode(this.f15565a) * 31, 31, this.f15566b), 31), 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(isRefreshing=");
                sb2.append(this.f15565a);
                sb2.append(", withOnboarding=");
                sb2.append(this.f15566b);
                sb2.append(", tabsIndexAfterChange=");
                sb2.append(this.f15567c);
                sb2.append(", tabsCompositionKey=");
                sb2.append(this.f15568d);
                sb2.append(", tabs=");
                return H.p(sb2, this.f15569e, ')');
            }

            public a(boolean z12, boolean z13, int i12, int i13, @k List<TabItem> list) {
                this.f15565a = z12;
                this.f15566b = z13;
                this.f15567c = i12;
                this.f15568d = i13;
                this.f15569e = list;
                this.f15570f = new UV0.c<>(list);
            }

            public a(boolean z12, boolean z13, int i12, int i13, List list, int i14, C42822w c42822w) {
                this((i14 & 1) != 0 ? false : z12, (i14 & 2) == 0 ? z13 : false, (i14 & 4) != 0 ? -1 : i12, (i14 & 8) != 0 ? -1 : i13, (i14 & 16) != 0 ? C42784z0.f406748b : list);
            }
        }

        /* compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTI0/c$b$b;", "LTI0/c$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: TI0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1059b implements b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f15571a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f15572b;

            public C1059b(@l ApiError apiError, @l Throwable th2) {
                this.f15571a = apiError;
                this.f15572b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1059b)) {
                    return false;
                }
                C1059b c1059b = (C1059b) obj;
                return L.f(this.f15571a, c1059b.f15571a) && L.f(this.f15572b, c1059b.f15572b);
            }

            public final int hashCode() {
                ApiError apiError = this.f15571a;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f15572b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f15571a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f15572b, ')');
            }
        }

        /* compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTI0/c$b$c;", "LTI0/c$b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: TI0.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C1060c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1060c f15573a = new C1060c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1060c);
            }

            public final int hashCode() {
                return 433808067;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTI0/c$b$d;", "LTI0/c$b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f15574a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1239354607;
            }

            @k
            public final String toString() {
                return "None";
            }
        }

        /* compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTI0/c$b$e;", "LTI0/c$b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final e f15575a = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 889107405;
            }

            @k
            public final String toString() {
                return "Unauthorized";
            }
        }
    }

    public c() {
        this(null, null, null, null, null, 0, null, false, null, 511, null);
    }

    public static c a(c cVar, UI0.c cVar2, UI0.a aVar, UI0.a aVar2, ArrayList arrayList, int i12, String str, boolean z12, b bVar, int i13) {
        UI0.c cVar3 = (i13 & 1) != 0 ? cVar.f15553b : cVar2;
        AuthSource authSource = cVar.f15554c;
        UI0.a aVar3 = (i13 & 4) != 0 ? cVar.f15555d : aVar;
        UI0.a aVar4 = (i13 & 8) != 0 ? cVar.f15556e : aVar2;
        List<a> list = (i13 & 16) != 0 ? cVar.f15557f : arrayList;
        int i14 = (i13 & 32) != 0 ? cVar.f15558g : i12;
        String str2 = (i13 & 64) != 0 ? cVar.f15559h : str;
        boolean z13 = (i13 & 128) != 0 ? cVar.f15560i : z12;
        b bVar2 = (i13 & 256) != 0 ? cVar.f15561j : bVar;
        cVar.getClass();
        return new c(cVar3, authSource, aVar3, aVar4, list, i14, str2, z13, bVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15553b, cVar.f15553b) && this.f15554c == cVar.f15554c && L.f(this.f15555d, cVar.f15555d) && L.f(this.f15556e, cVar.f15556e) && L.f(this.f15557f, cVar.f15557f) && this.f15558g == cVar.f15558g && L.f(this.f15559h, cVar.f15559h) && this.f15560i == cVar.f15560i && L.f(this.f15561j, cVar.f15561j);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f15558g, H.e((this.f15556e.hashCode() + ((this.f15555d.hashCode() + ((this.f15554c.hashCode() + (this.f15553b.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f15557f), 31);
        String str = this.f15559h;
        return this.f15561j.hashCode() + r.i((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15560i);
    }

    @k
    public final String toString() {
        return "ShortcutsState(userInfo=" + this.f15553b + ", authSrc=" + this.f15554c + ", currentShortcut=" + this.f15555d + ", refreshingShortcut=" + this.f15556e + ", shortcuts=" + this.f15557f + ", shortcutsKey=" + this.f15558g + ", pendingMsg=" + this.f15559h + ", isUpdateToastBarShowing=" + this.f15560i + ", viewState=" + this.f15561j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(UI0.c cVar, AuthSource authSource, UI0.a aVar, UI0.a aVar2, List list, int i12, String str, boolean z12, b bVar, int i13, C42822w c42822w) {
        UI0.a aVar3;
        UI0.a aVar4;
        UI0.c cVar2 = (i13 & 1) != 0 ? new UI0.c(false, false, 3, null) : cVar;
        AuthSource authSource2 = (i13 & 2) != 0 ? AuthSource.f92698e : authSource;
        if ((i13 & 4) != 0) {
            UI0.a.f16328d.getClass();
            aVar3 = UI0.a.f16329e;
        } else {
            aVar3 = aVar;
        }
        if ((i13 & 8) != 0) {
            UI0.a.f16328d.getClass();
            aVar4 = UI0.a.f16329e;
        } else {
            aVar4 = aVar2;
        }
        this(cVar2, authSource2, aVar3, aVar4, (i13 & 16) != 0 ? C42784z0.f406748b : list, (i13 & 32) != 0 ? -1 : i12, (i13 & 64) == 0 ? str : null, (i13 & 128) == 0 ? z12 : false, (i13 & 256) != 0 ? b.d.f15574a : bVar);
    }

    public c(@k UI0.c cVar, @k AuthSource authSource, @k UI0.a aVar, @k UI0.a aVar2, @k List<a> list, int i12, @l String str, boolean z12, @k b bVar) {
        this.f15553b = cVar;
        this.f15554c = authSource;
        this.f15555d = aVar;
        this.f15556e = aVar2;
        this.f15557f = list;
        this.f15558g = i12;
        this.f15559h = str;
        this.f15560i = z12;
        this.f15561j = bVar;
    }
}
