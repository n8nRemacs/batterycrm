package kp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import java.util.List;
import jp.C42410b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/h;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43482h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<C42410b> f413218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<R2.b> f413219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f413220c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C43477c f413221d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C43476b f413222e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C43483i f413223f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC43479e f413224g;

    public C43482h(@k List<C42410b> list, @k List<R2.b> list2, int i12, @l C43477c c43477c, @l C43476b c43476b, @l C43483i c43483i, @k InterfaceC43479e interfaceC43479e) {
        this.f413218a = list;
        this.f413219b = list2;
        this.f413220c = i12;
        this.f413221d = c43477c;
        this.f413222e = c43476b;
        this.f413223f = c43483i;
        this.f413224g = interfaceC43479e;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43482h)) {
            return false;
        }
        C43482h c43482h = (C43482h) obj;
        return L.f(this.f413218a, c43482h.f413218a) && L.f(this.f413219b, c43482h.f413219b) && this.f413220c == c43482h.f413220c && L.f(this.f413221d, c43482h.f413221d) && L.f(this.f413222e, c43482h.f413222e) && L.f(this.f413223f, c43482h.f413223f) && L.f(this.f413224g, c43482h.f413224g);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f413220c, H.e(this.f413218a.hashCode() * 31, 31, this.f413219b), 31);
        C43477c c43477c = this.f413221d;
        int iHashCode = (iE2 + (c43477c == null ? 0 : c43477c.hashCode())) * 31;
        C43476b c43476b = this.f413222e;
        int iHashCode2 = (iHashCode + (c43476b == null ? 0 : c43476b.hashCode())) * 31;
        C43483i c43483i = this.f413223f;
        return this.f413224g.hashCode() + ((iHashCode2 + (c43483i != null ? c43483i.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ClientsViewState(chips=" + this.f413218a + ", tabs=" + this.f413219b + ", selectedTab=" + this.f413220c + ", clientsFilterState=" + this.f413221d + ", clientsBottomButtonState=" + this.f413222e + ", mortgageArchivingDialogState=" + this.f413223f + ", listState=" + this.f413224g + ')';
    }
}
