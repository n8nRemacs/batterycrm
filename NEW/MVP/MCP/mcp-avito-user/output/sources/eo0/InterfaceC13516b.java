package Eo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.saved_searches.model.SavedSearchData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LEo0/b;", "", "a", "b", "c", "d", "e", "f", "g", "LEo0/b$a;", "LEo0/b$b;", "LEo0/b$c;", "LEo0/b$d;", "LEo0/b$e;", "LEo0/b$f;", "LEo0/b$g;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13516b {

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/b$a;", "LEo0/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$a */
    public static final /* data */ class a implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4257a;

        public a(@k DeepLink deepLink) {
            this.f4257a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f4257a, ((a) obj).f4257a);
        }

        public final int hashCode() {
            return this.f4257a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f4257a, ')');
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/b$b;", "LEo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0256b implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0256b f4258a = new C0256b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0256b);
        }

        public final int hashCode() {
            return -1868697078;
        }

        @k
        public final String toString() {
            return "RouteBack";
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/b$c;", "LEo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$c */
    public static final /* data */ class c implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f4259a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1251796258;
        }

        @k
        public final String toString() {
            return "ShowEmailChooser";
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/b$d;", "LEo0/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$d */
    public static final /* data */ class d implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f4260a;

        public d(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f4260a = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4260a, ((d) obj).f4260a);
        }

        public final int hashCode() {
            return this.f4260a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowEmailSettings(details=" + this.f4260a + ')';
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/b$e;", "LEo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$e */
    public static final /* data */ class e implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f4261a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -384632291;
        }

        @k
        public final String toString() {
            return "ShowNotificationSettingsScreen";
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/b$f;", "LEo0/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$f */
    public static final /* data */ class f implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f4262a;

        public f(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f4262a = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f4262a, ((f) obj).f4262a);
        }

        public final int hashCode() {
            return this.f4262a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowPushSettings(details=" + this.f4262a + ')';
        }
    }

    /* compiled from: SavedSearchMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/b$g;", "LEo0/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.b$g */
    public static final /* data */ class g implements InterfaceC13516b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f4263a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f4264b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4265c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ToastBarPosition f4266d;

        public g(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition) {
            this.f4263a = printableText;
            this.f4264b = fVar;
            this.f4265c = i12;
            this.f4266d = toastBarPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f4263a, gVar.f4263a) && L.f(this.f4264b, gVar.f4264b) && this.f4265c == gVar.f4265c && this.f4266d == gVar.f4266d;
        }

        public final int hashCode() {
            return this.f4266d.hashCode() + r.e(this.f4265c, (this.f4264b.hashCode() + (this.f4263a.hashCode() * 31)) * 31, 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f4263a + ", type=" + this.f4264b + ", duration=" + this.f4265c + ", position=" + this.f4266d + ')';
        }

        public /* synthetic */ g(PrintableText printableText, com.avito.android.component.toast.f fVar, int i12, ToastBarPosition toastBarPosition, int i13, C42822w c42822w) {
            this(printableText, (i13 & 2) != 0 ? f.a.f125253a : fVar, (i13 & 4) != 0 ? 2750 : i12, (i13 & 8) != 0 ? ToastBarPosition.f181047e : toastBarPosition);
        }
    }
}
