package pq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.SelectorItem;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import rp.C47701d;

/* compiled from: SubmittingSelectState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpq/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47129c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f428790h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428791b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<SelectorItem> f428792c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<C47701d> f428793d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f428794e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f428795f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f428796g;

    /* compiled from: SubmittingSelectState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47129c(@k String str, @k List<SelectorItem> list, @k List<C47701d> list2, boolean z12, @k String str2, @l DeepLink deepLink) {
        this.f428791b = str;
        this.f428792c = list;
        this.f428793d = list2;
        this.f428794e = z12;
        this.f428795f = str2;
        this.f428796g = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47129c)) {
            return false;
        }
        C47129c c47129c = (C47129c) obj;
        return L.f(this.f428791b, c47129c.f428791b) && L.f(this.f428792c, c47129c.f428792c) && L.f(this.f428793d, c47129c.f428793d) && this.f428794e == c47129c.f428794e && L.f(this.f428795f, c47129c.f428795f) && L.f(this.f428796g, c47129c.f428796g);
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(H.e(H.e(this.f428791b.hashCode() * 31, 31, this.f428792c), 31, this.f428793d), 31, this.f428794e), 31, this.f428795f);
        DeepLink deepLink = this.f428796g;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmittingSelectState(title=");
        sb2.append(this.f428791b);
        sb2.append(", radioItems=");
        sb2.append(this.f428792c);
        sb2.append(", detailsItems=");
        sb2.append(this.f428793d);
        sb2.append(", proceedButtonIsVisible=");
        sb2.append(this.f428794e);
        sb2.append(", proceedButtonText=");
        sb2.append(this.f428795f);
        sb2.append(", nextDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428796g, ')');
    }
}
