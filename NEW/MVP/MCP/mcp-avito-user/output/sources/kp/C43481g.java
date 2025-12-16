package kp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import java.util.ArrayList;
import java.util.List;
import jp.C42410b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkp/g;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43481g extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f413207l = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PagingState f413208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f413209c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C43477c f413210d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C43476b f413211e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C43483i f413212f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<ClientCardData> f413213g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<C42410b> f413214h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<R2.b> f413215i;

    /* renamed from: j, reason: collision with root package name */
    public final int f413216j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43482h f413217k;

    /* compiled from: ClientsState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/g$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43481g(@k PagingState pagingState, int i12, @l C43477c c43477c, @l C43476b c43476b, @l C43483i c43483i, @l List<ClientCardData> list, @k List<C42410b> list2, @k List<R2.b> list3, int i13, @k C43482h c43482h) {
        this.f413208b = pagingState;
        this.f413209c = i12;
        this.f413210d = c43477c;
        this.f413211e = c43476b;
        this.f413212f = c43483i;
        this.f413213g = list;
        this.f413214h = list2;
        this.f413215i = list3;
        this.f413216j = i13;
        this.f413217k = c43482h;
    }

    public static C43481g a(C43481g c43481g, PagingState pagingState, int i12, C43477c c43477c, C43476b c43476b, C43483i c43483i, List list, ArrayList arrayList, List list2, int i13, C43482h c43482h, int i14) {
        PagingState pagingState2 = (i14 & 1) != 0 ? c43481g.f413208b : pagingState;
        int i15 = (i14 & 2) != 0 ? c43481g.f413209c : i12;
        C43477c c43477c2 = (i14 & 4) != 0 ? c43481g.f413210d : c43477c;
        C43476b c43476b2 = (i14 & 8) != 0 ? c43481g.f413211e : c43476b;
        C43483i c43483i2 = (i14 & 16) != 0 ? c43481g.f413212f : c43483i;
        List list3 = (i14 & 32) != 0 ? c43481g.f413213g : list;
        List<C42410b> list4 = (i14 & 64) != 0 ? c43481g.f413214h : arrayList;
        List list5 = (i14 & 128) != 0 ? c43481g.f413215i : list2;
        int i16 = (i14 & 256) != 0 ? c43481g.f413216j : i13;
        C43482h c43482h2 = (i14 & 512) != 0 ? c43481g.f413217k : c43482h;
        c43481g.getClass();
        return new C43481g(pagingState2, i15, c43477c2, c43476b2, c43483i2, list3, list4, list5, i16, c43482h2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final RequestType c() {
        return (RequestType) RequestType.f120272f.get(this.f413216j);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43481g)) {
            return false;
        }
        C43481g c43481g = (C43481g) obj;
        return this.f413208b == c43481g.f413208b && this.f413209c == c43481g.f413209c && L.f(this.f413210d, c43481g.f413210d) && L.f(this.f413211e, c43481g.f413211e) && L.f(this.f413212f, c43481g.f413212f) && L.f(this.f413213g, c43481g.f413213g) && L.f(this.f413214h, c43481g.f413214h) && L.f(this.f413215i, c43481g.f413215i) && this.f413216j == c43481g.f413216j && L.f(this.f413217k, c43481g.f413217k);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f413209c, this.f413208b.hashCode() * 31, 31);
        C43477c c43477c = this.f413210d;
        int iHashCode = (iE2 + (c43477c == null ? 0 : c43477c.hashCode())) * 31;
        C43476b c43476b = this.f413211e;
        int iHashCode2 = (iHashCode + (c43476b == null ? 0 : c43476b.hashCode())) * 31;
        C43483i c43483i = this.f413212f;
        int iHashCode3 = (iHashCode2 + (c43483i == null ? 0 : c43483i.hashCode())) * 31;
        List<ClientCardData> list = this.f413213g;
        return this.f413217k.hashCode() + r.e(this.f413216j, H.e(H.e((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f413214h), 31, this.f413215i), 31);
    }

    @k
    public final String toString() {
        return "ClientsState(pagingState=" + this.f413208b + ", page=" + this.f413209c + ", clientsFilterState=" + this.f413210d + ", clientsBottomButtonState=" + this.f413211e + ", mortgageArchivingDialogState=" + this.f413212f + ", clients=" + this.f413213g + ", chips=" + this.f413214h + ", tabs=" + this.f413215i + ", selectedTab=" + this.f413216j + ", clientsViewState=" + this.f413217k + ')';
    }
}
