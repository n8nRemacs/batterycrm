package g60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessListItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectBusinessVrfState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f396298m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final c f396299n = new c(null, null, false, null, null, null, null, null, false, false, false, 2047, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396300b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f396301c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f396302d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f396303e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f396304f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<PassportSelectBusinessListItem> f396305g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<K50.a> f396306h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f396307i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f396308j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f396309k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f396310l;

    /* compiled from: SelectBusinessVrfState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/c$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, false, null, null, null, null, null, false, false, false, 2047, null);
    }

    public static c a(c cVar, List list, Integer num, boolean z12, int i12) {
        String str = cVar.f396300b;
        AttributedText attributedText = cVar.f396301c;
        boolean z13 = cVar.f396302d;
        String str2 = cVar.f396303e;
        String str3 = cVar.f396304f;
        List list2 = (i12 & 32) != 0 ? cVar.f396305g : list;
        List<K50.a> list3 = cVar.f396306h;
        Integer num2 = (i12 & 128) != 0 ? cVar.f396307i : num;
        boolean z14 = (i12 & 256) != 0 ? cVar.f396308j : z12;
        boolean z15 = (i12 & 512) != 0 ? cVar.f396309k : false;
        boolean z16 = cVar.f396310l;
        cVar.getClass();
        return new c(str, attributedText, z13, str2, str3, list2, list3, num2, z14, z15, z16);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f396300b, cVar.f396300b) && L.f(this.f396301c, cVar.f396301c) && this.f396302d == cVar.f396302d && L.f(this.f396303e, cVar.f396303e) && L.f(this.f396304f, cVar.f396304f) && L.f(this.f396305g, cVar.f396305g) && L.f(this.f396306h, cVar.f396306h) && L.f(this.f396307i, cVar.f396307i) && this.f396308j == cVar.f396308j && this.f396309k == cVar.f396309k && this.f396310l == cVar.f396310l;
    }

    public final int hashCode() {
        int iE2 = H.e(H.e(H.d(H.d(r.i(com.avito.android.actions_sheet.a.b(this.f396300b.hashCode() * 31, 31, this.f396301c), 31, this.f396302d), 31, this.f396303e), 31, this.f396304f), 31, this.f396305g), 31, this.f396306h);
        Integer num = this.f396307i;
        return Boolean.hashCode(this.f396310l) + r.i(r.i((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f396308j), 31, this.f396309k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectBusinessVrfState(title=");
        sb2.append(this.f396300b);
        sb2.append(", description=");
        sb2.append(this.f396301c);
        sb2.append(", showSearch=");
        sb2.append(this.f396302d);
        sb2.append(", cancelActionTitle=");
        sb2.append(this.f396303e);
        sb2.append(", confirmActionTitle=");
        sb2.append(this.f396304f);
        sb2.append(", visibleBusinessVrfList=");
        sb2.append(this.f396305g);
        sb2.append(", fullBusinessVrfList=");
        sb2.append(this.f396306h);
        sb2.append(", currentUserIdFrom=");
        sb2.append(this.f396307i);
        sb2.append(", noChoiceErrorVisible=");
        sb2.append(this.f396308j);
        sb2.append(", isLoading=");
        sb2.append(this.f396309k);
        sb2.append(", isLoadingError=");
        return r.x(sb2, this.f396310l, ')');
    }

    public c(String str, AttributedText attributedText, boolean z12, String str2, String str3, List list, List list2, Integer num, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? "" : str2, (i12 & 16) == 0 ? str3 : "", (i12 & 32) != 0 ? C42784z0.f406748b : list, (i12 & 64) != 0 ? C42784z0.f406748b : list2, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? false : z14, (i12 & 1024) == 0 ? z15 : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k AttributedText attributedText, boolean z12, @k String str2, @k String str3, @k List<? extends PassportSelectBusinessListItem> list, @k List<K50.a> list2, @l Integer num, boolean z13, boolean z14, boolean z15) {
        this.f396300b = str;
        this.f396301c = attributedText;
        this.f396302d = z12;
        this.f396303e = str2;
        this.f396304f = str3;
        this.f396305g = list;
        this.f396306h = list2;
        this.f396307i = num;
        this.f396308j = z13;
        this.f396309k = z14;
        this.f396310l = z15;
    }
}
