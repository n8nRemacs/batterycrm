package eb;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_stats.detail.tab.StatsDialogType;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsItemTabOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Leb/b;", "", "a", "b", "c", "Leb/b$a;", "Leb/b$b;", "Leb/b$c;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eb.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC40079b {

    /* compiled from: StatsItemTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/b$a;", "Leb/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.b$a */
    public static final /* data */ class a implements InterfaceC40079b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f395242a;

        public a(@l DeepLink deepLink) {
            this.f395242a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395242a, ((a) obj).f395242a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f395242a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f395242a, ')');
        }
    }

    /* compiled from: StatsItemTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/b$b;", "Leb/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11091b implements InterfaceC40079b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StatsDialogType f395243a;

        public C11091b(@k StatsDialogType statsDialogType) {
            this.f395243a = statsDialogType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11091b) && L.f(this.f395243a, ((C11091b) obj).f395243a);
        }

        public final int hashCode() {
            return this.f395243a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDialog(dialogType=" + this.f395243a + ')';
        }
    }

    /* compiled from: StatsItemTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/b$c;", "Leb/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.b$c */
    public static final /* data */ class c implements InterfaceC40079b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f395244a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f395245b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395246c;

        public c(@k String str, int i12, @l Long l12) {
            this.f395244a = l12;
            this.f395245b = str;
            this.f395246c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f395244a, cVar.f395244a) && L.f(this.f395245b, cVar.f395245b) && this.f395246c == cVar.f395246c;
        }

        public final int hashCode() {
            Long l12 = this.f395244a;
            return Integer.hashCode(this.f395246c) + H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f395245b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedPeriod(dateFrom=");
            sb2.append(this.f395244a);
            sb2.append(", tabId=");
            sb2.append(this.f395245b);
            sb2.append(", itemIndex=");
            return r.t(sb2, this.f395246c, ')');
        }
    }
}
