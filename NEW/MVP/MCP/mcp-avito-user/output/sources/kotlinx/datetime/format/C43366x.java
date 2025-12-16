package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: DateTimeComponents.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/x;", "Lkotlinx/datetime/format/i;", "Lkotlinx/datetime/format/o0;", "Lkotlinx/datetime/format/x0;", "Lkotlinx/datetime/format/A;", "Lkotlinx/datetime/internal/format/parser/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43366x implements InterfaceC43338i, InterfaceC43351o0, x0, A, InterfaceC43377c<C43366x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f412468a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f412469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final O f412470c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f412471d;

    public C43366x() {
        this(null, null, null, null, 15, null);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void A(@Y61.l Integer num) {
        this.f412469b.f412361d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void B(@Y61.l Integer num) {
        this.f412469b.f412358a = num;
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43377c
    public final C43366x a() {
        L lA2 = this.f412468a.a();
        N nA2 = this.f412469b.a();
        O o12 = this.f412470c;
        return new C43366x(lA2, nA2, new O(o12.f412365b, o12.f412366c, o12.f412367d, o12.f412364a), this.f412471d);
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: b */
    public final Integer getF412353d() {
        return this.f412468a.f412353d;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void c(@Y61.l Integer num) {
        this.f412469b.f412362e = num;
    }

    @Override // kotlinx.datetime.format.x0
    public final void d(@Y61.l Integer num) {
        this.f412470c.f412365b = num;
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: e */
    public final Integer getF412367d() {
        return this.f412470c.f412367d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43366x) {
            C43366x c43366x = (C43366x) obj;
            if (kotlin.jvm.internal.L.f(c43366x.f412468a, this.f412468a) && kotlin.jvm.internal.L.f(c43366x.f412469b, this.f412469b) && kotlin.jvm.internal.L.f(c43366x.f412470c, this.f412470c) && kotlin.jvm.internal.L.f(c43366x.f412471d, this.f412471d)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void f(@Y61.l Integer num) {
        this.f412468a.f412353d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void g(@Y61.l AmPmMarker amPmMarker) {
        this.f412469b.f412360c = amPmMarker;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: getYear */
    public final Integer getF412350a() {
        return this.f412468a.f412350a;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void h(@Y61.l I51.c cVar) {
        this.f412469b.h(cVar);
    }

    public final int hashCode() {
        int iHashCode = (this.f412468a.hashCode() ^ this.f412469b.hashCode()) ^ this.f412470c.hashCode();
        String str = this.f412471d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: i */
    public final Boolean getF412364a() {
        return this.f412470c.f412364a;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: j */
    public final Integer getF412362e() {
        return this.f412469b.f412362e;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void k(@Y61.l Integer num) {
        this.f412468a.f412351b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: l */
    public final Integer getF412361d() {
        return this.f412469b.f412361d;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    public final I51.c m() {
        return this.f412469b.m();
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void n(@Y61.l Integer num) {
        this.f412468a.f412350a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: o */
    public final Integer getF412352c() {
        return this.f412468a.f412352c;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: p */
    public final Integer getF412359b() {
        return this.f412469b.f412359b;
    }

    @Override // kotlinx.datetime.format.x0
    public final void q(@Y61.l Boolean bool) {
        this.f412470c.f412364a = bool;
    }

    @Override // kotlinx.datetime.format.x0
    public final void r(@Y61.l Integer num) {
        this.f412470c.f412366c = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: s */
    public final AmPmMarker getF412360c() {
        return this.f412469b.f412360c;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void t(@Y61.l Integer num) {
        this.f412469b.f412359b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void u(@Y61.l Integer num) {
        this.f412468a.f412352c = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: v */
    public final Integer getF412351b() {
        return this.f412468a.f412351b;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: w */
    public final Integer getF412358a() {
        return this.f412469b.f412358a;
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: x */
    public final Integer getF412365b() {
        return this.f412470c.f412365b;
    }

    @Override // kotlinx.datetime.format.x0
    @Y61.l
    /* renamed from: y */
    public final Integer getF412366c() {
        return this.f412470c.f412366c;
    }

    @Override // kotlinx.datetime.format.x0
    public final void z(@Y61.l Integer num) {
        this.f412470c.f412367d = num;
    }

    public C43366x(@Y61.k L l12, @Y61.k N n12, @Y61.k O o12, @Y61.l String str) {
        this.f412468a = l12;
        this.f412469b = n12;
        this.f412470c = o12;
        this.f412471d = str;
    }

    public /* synthetic */ C43366x(L l12, N n12, O o12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new L(null, null, null, null, 15, null) : l12, (i12 & 2) != 0 ? new N(null, null, null, null, null, null, 63, null) : n12, (i12 & 4) != 0 ? new O(null, null, null, null, 15, null) : o12, (i12 & 8) != 0 ? null : str);
    }
}
