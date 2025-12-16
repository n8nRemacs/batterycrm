package j60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.passport.profile_list_item.PassportListItem;
import com.avito.android.passport.profile_list_item.PassportListProfileItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfilesListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j60.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C42206c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f405436h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C42206c f405437i = new C42206c(false, false, false, false, null, null, 63, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f405438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f405439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f405440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f405441e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<PassportListItem> f405442f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<PassportListProfileItem> f405443g;

    /* compiled from: PassportProfilesListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj60/c$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42206c() {
        this(false, false, false, false, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42206c)) {
            return false;
        }
        C42206c c42206c = (C42206c) obj;
        return this.f405438b == c42206c.f405438b && this.f405439c == c42206c.f405439c && this.f405440d == c42206c.f405440d && this.f405441e == c42206c.f405441e && L.f(this.f405442f, c42206c.f405442f) && L.f(this.f405443g, c42206c.f405443g);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(Boolean.hashCode(this.f405438b) * 31, 31, this.f405439c), 31, this.f405440d), 31, this.f405441e);
        List<PassportListItem> list = this.f405442f;
        return this.f405443g.hashCode() + ((i12 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportProfilesListState(loaderVisible=");
        sb2.append(this.f405438b);
        sb2.append(", errorVisible=");
        sb2.append(this.f405439c);
        sb2.append(", searchVisible=");
        sb2.append(this.f405440d);
        sb2.append(", dialogForceExpanded=");
        sb2.append(this.f405441e);
        sb2.append(", visibleProfilesList=");
        sb2.append(this.f405442f);
        sb2.append(", fullProfilesList=");
        return H.p(sb2, this.f405443g, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42206c(boolean z12, boolean z13, boolean z14, boolean z15, @l List<? extends PassportListItem> list, @k List<PassportListProfileItem> list2) {
        this.f405438b = z12;
        this.f405439c = z13;
        this.f405440d = z14;
        this.f405441e = z15;
        this.f405442f = list;
        this.f405443g = list2;
    }

    public C42206c(boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) == 0 ? z15 : false, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? C42784z0.f406748b : list2);
    }
}
