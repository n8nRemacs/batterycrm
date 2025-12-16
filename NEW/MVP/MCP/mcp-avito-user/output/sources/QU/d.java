package QU;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccordionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQU/d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13731a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f13732b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13733c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13734d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13735e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final View f13736f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f13737g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final View f13738h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13739i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f13740j;

    public d() {
        throw null;
    }

    public d(String str, Integer num, boolean z12, boolean z13, boolean z14, View view, String str2, View view2, boolean z15, Y41.a aVar, int i12, C42822w c42822w) {
        num = (i12 & 2) != 0 ? 0 : num;
        z12 = (i12 & 4) != 0 ? false : z12;
        z13 = (i12 & 8) != 0 ? false : z13;
        z14 = (i12 & 16) != 0 ? false : z14;
        view = (i12 & 32) != 0 ? null : view;
        str2 = (i12 & 64) != 0 ? null : str2;
        view2 = (i12 & 128) != 0 ? null : view2;
        z15 = (i12 & 256) != 0 ? true : z15;
        aVar = (i12 & 512) != 0 ? null : aVar;
        this.f13731a = str;
        this.f13732b = num;
        this.f13733c = z12;
        this.f13734d = z13;
        this.f13735e = z14;
        this.f13736f = view;
        this.f13737g = str2;
        this.f13738h = view2;
        this.f13739i = z15;
        this.f13740j = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f13731a, dVar.f13731a) && L.f(this.f13732b, dVar.f13732b) && this.f13733c == dVar.f13733c && this.f13734d == dVar.f13734d && this.f13735e == dVar.f13735e && L.f(this.f13736f, dVar.f13736f) && L.f(this.f13737g, dVar.f13737g) && L.f(this.f13738h, dVar.f13738h) && this.f13739i == dVar.f13739i && L.f(this.f13740j, dVar.f13740j);
    }

    public final int hashCode() {
        int iHashCode = this.f13731a.hashCode() * 31;
        Integer num = this.f13732b;
        int i12 = r.i(r.i(r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f13733c), 31, this.f13734d), 31, this.f13735e);
        View view = this.f13736f;
        int iHashCode2 = (i12 + (view == null ? 0 : view.hashCode())) * 31;
        String str = this.f13737g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        View view2 = this.f13738h;
        int i13 = r.i((iHashCode3 + (view2 == null ? 0 : view2.hashCode())) * 31, 31, this.f13739i);
        Y41.a<G0> aVar = this.f13740j;
        return i13 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccordionState(title=");
        sb2.append(this.f13731a);
        sb2.append(", titleTextIcon=");
        sb2.append(this.f13732b);
        sb2.append(", isArrowAlignedEnd=");
        sb2.append(this.f13733c);
        sb2.append(", isExpanded=");
        sb2.append(this.f13734d);
        sb2.append(", isLoading=");
        sb2.append(this.f13735e);
        sb2.append(", customContent=");
        sb2.append(this.f13736f);
        sb2.append(", contentText=");
        sb2.append(this.f13737g);
        sb2.append(", titleAccessoryView=");
        sb2.append(this.f13738h);
        sb2.append(", showAnimation=");
        sb2.append(this.f13739i);
        sb2.append(", onClick=");
        return r.v(sb2, this.f13740j, ')');
    }
}
