package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlinx.datetime.format.C;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.format.InterfaceC43326c;
import kotlinx.datetime.format.InterfaceC43332f;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43373e;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: DateTimeComponents.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/format/y;", "Lkotlinx/datetime/format/a;", "Lkotlinx/datetime/format/k;", "Lkotlinx/datetime/format/x;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43367y extends AbstractC43322a<C43342k, C43366x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43374f<C43366x> f412472a;

    /* compiled from: DateTimeComponents.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/y$a;", "Lkotlinx/datetime/format/b;", "Lkotlinx/datetime/format/x;", "Lkotlinx/datetime/format/d;", "Lkotlinx/datetime/format/e;", "Lkotlinx/datetime/format/C$c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.y$a */
    public static final class a implements InterfaceC43324b<C43366x, a>, InterfaceC43328d, InterfaceC43330e, C.c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43372d<C43366x> f412473a;

        public a(@Y61.k C43372d<C43366x> c43372d) {
            this.f412473a = c43372d;
        }

        @Override // kotlinx.datetime.format.C.e
        public final void a() {
            Padding padding = Padding.f412371b;
            x(new C43373e(new S0()));
        }

        @Override // kotlinx.datetime.format.InterfaceC43332f
        public final void b(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43351o0> oVar) {
            w(oVar);
        }

        @Override // kotlinx.datetime.format.C.e
        public final void c() {
            Padding padding = Padding.f412371b;
            x(new kotlinx.datetime.internal.format.A(new C43373e(new U0())));
        }

        @Override // kotlinx.datetime.format.C.d
        public final void d(int i12, int i13) {
            InterfaceC43332f.a.d(this, i12, i13);
        }

        @Override // kotlinx.datetime.format.C.e
        public final void e() {
            Padding padding = Padding.f412371b;
            x(new C43373e(new T0()));
        }

        @Override // kotlinx.datetime.format.C.a
        public final void f(@Y61.k C43343k0 c43343k0) {
            w(new C43373e(new C43341j0(c43343k0)));
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void g(@Y61.k Y41.l<? super a, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        @Y61.k
        public final C43372d<C43366x> h() {
            return this.f412473a;
        }

        @Override // kotlinx.datetime.format.C.a
        public final void i() {
            Padding padding = Padding.f412371b;
            InterfaceC43326c.a.b(this);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final InterfaceC43324b j() {
            return new a(new C43372d());
        }

        @Override // kotlinx.datetime.format.C.a
        public final void k(@Y61.k Padding padding) {
            InterfaceC43326c.a.a(this, padding);
        }

        @Override // kotlinx.datetime.format.C
        public final void l(@Y61.k String str) {
            InterfaceC43324b.a.d(this, str);
        }

        @Override // kotlinx.datetime.format.C.a
        public final void m() {
            Padding padding = Padding.f412371b;
            InterfaceC43326c.a.c(this);
        }

        @Override // kotlinx.datetime.format.C.d
        public final void n() {
            Padding padding = Padding.f412371b;
            InterfaceC43332f.a.b(this);
        }

        @Override // kotlinx.datetime.format.C.d
        public final void o() {
            Padding padding = Padding.f412371b;
            InterfaceC43332f.a.c(this);
        }

        @Override // kotlinx.datetime.format.C.d
        public final void p() {
            Padding padding = Padding.f412371b;
            InterfaceC43332f.a.a(this);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void q(@Y61.k String str, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.b(this, str, lVar);
        }

        @Override // kotlinx.datetime.format.C.a
        public final void r(@Y61.k B<kotlinx.datetime.q> b12) {
            if (b12 instanceof P) {
                v(((P) b12).f412369a);
            }
        }

        @Override // kotlinx.datetime.format.C.d
        public final void s(@Y61.k C43325b0 c43325b0) {
            if (c43325b0 != null) {
                b(c43325b0.f412400a);
            }
        }

        @Override // kotlinx.datetime.format.C.e
        public final void t(@Y61.k y0 y0Var) {
            if (y0Var != null) {
                x(y0Var.f412475a);
            }
        }

        @Override // kotlinx.datetime.format.C.a
        public final void u(@Y61.k H h12) {
            w(new C43373e(new G(h12)));
        }

        @Override // kotlinx.datetime.format.InterfaceC43326c
        public final void v(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43338i> oVar) {
            w(oVar);
        }

        public final void w(@Y61.k kotlinx.datetime.internal.format.o<? super A> oVar) {
            this.f412473a.a(oVar);
        }

        public final void x(@Y61.k kotlinx.datetime.internal.format.o<? super x0> oVar) {
            this.f412473a.a(oVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43367y(@Y61.k C43374f<? super C43366x> c43374f) {
        super(null);
        this.f412472a = c43374f;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    @Y61.k
    public final C43374f<C43366x> b() {
        return this.f412472a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final InterfaceC43377c c() {
        return C43368z.f412477a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final C43342k d(InterfaceC43377c interfaceC43377c) {
        return new C43342k((C43366x) interfaceC43377c);
    }
}
