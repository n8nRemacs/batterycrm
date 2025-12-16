package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: LocalDateTimeFormat.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/format/M;", "Lkotlinx/datetime/format/A;", "Lkotlinx/datetime/format/i;", "Lkotlinx/datetime/format/o0;", "Lkotlinx/datetime/internal/format/parser/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M implements A, InterfaceC43338i, InterfaceC43351o0, InterfaceC43377c<M> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f412355a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f412356b;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void A(@Y61.l Integer num) {
        this.f412356b.f412361d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void B(@Y61.l Integer num) {
        this.f412356b.f412358a = num;
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43377c
    public final M a() {
        return new M(this.f412355a.a(), this.f412356b.a());
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: b */
    public final Integer getF412353d() {
        return this.f412355a.f412353d;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void c(@Y61.l Integer num) {
        this.f412356b.f412362e = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void f(@Y61.l Integer num) {
        this.f412355a.f412353d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void g(@Y61.l AmPmMarker amPmMarker) {
        this.f412356b.f412360c = amPmMarker;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: getYear */
    public final Integer getF412350a() {
        return this.f412355a.f412350a;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void h(@Y61.l I51.c cVar) {
        this.f412356b.h(cVar);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: j */
    public final Integer getF412362e() {
        return this.f412356b.f412362e;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void k(@Y61.l Integer num) {
        this.f412355a.f412351b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: l */
    public final Integer getF412361d() {
        return this.f412356b.f412361d;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    public final I51.c m() {
        return this.f412356b.m();
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void n(@Y61.l Integer num) {
        this.f412355a.f412350a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: o */
    public final Integer getF412352c() {
        return this.f412355a.f412352c;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: p */
    public final Integer getF412359b() {
        return this.f412356b.f412359b;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: s */
    public final AmPmMarker getF412360c() {
        return this.f412356b.f412360c;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void t(@Y61.l Integer num) {
        this.f412356b.f412359b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    public final void u(@Y61.l Integer num) {
        this.f412355a.f412352c = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43338i
    @Y61.l
    /* renamed from: v */
    public final Integer getF412351b() {
        return this.f412355a.f412351b;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: w */
    public final Integer getF412358a() {
        return this.f412356b.f412358a;
    }

    public M(@Y61.k L l12, @Y61.k N n12) {
        this.f412355a = l12;
        this.f412356b = n12;
    }

    public /* synthetic */ M(L l12, N n12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new L(null, null, null, null, 15, null) : l12, (i12 & 2) != 0 ? new N(null, null, null, null, null, null, 63, null) : n12);
    }
}
