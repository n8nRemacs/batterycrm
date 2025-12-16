package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.format.InterfaceC43326c;
import kotlinx.datetime.format.InterfaceC43332f;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: LocalDateTimeFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/W;", "Lkotlinx/datetime/format/a;", "Lkotlinx/datetime/t;", "Lkotlinx/datetime/format/M;", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class W extends AbstractC43322a<kotlinx.datetime.t, M> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f412388b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43374f<A> f412389a;

    /* compiled from: LocalDateTimeFormat.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/W$a;", "Lkotlinx/datetime/format/b;", "Lkotlinx/datetime/format/A;", "Lkotlinx/datetime/format/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43324b<A, a>, InterfaceC43328d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43372d<A> f412390a;

        public a(@Y61.k C43372d<A> c43372d) {
            this.f412390a = c43372d;
        }

        @Override // kotlinx.datetime.format.InterfaceC43332f
        public final void b(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43351o0> oVar) {
            w(oVar);
        }

        @Override // kotlinx.datetime.format.C.d
        public final void d(int i12, int i13) {
            InterfaceC43332f.a.d(this, i12, i13);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void g(@Y61.k Y41.l<? super a, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        @Y61.k
        public final C43372d<A> h() {
            return this.f412390a;
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
            InterfaceC43326c.a.a(this, Padding.f412372c);
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

        @Override // kotlinx.datetime.format.InterfaceC43326c
        public final void v(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43338i> oVar) {
            w(oVar);
        }

        public final void w(@Y61.k kotlinx.datetime.internal.format.o<? super A> oVar) {
            this.f412390a.a(oVar);
        }
    }

    /* compiled from: LocalDateTimeFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/W$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(@Y61.k C43374f<? super A> c43374f) {
        super(null);
        this.f412389a = c43374f;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    @Y61.k
    public final C43374f<A> b() {
        return this.f412389a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final InterfaceC43377c c() {
        return C43323a0.f412397b;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final kotlinx.datetime.t d(InterfaceC43377c interfaceC43377c) {
        M m12 = (M) interfaceC43377c;
        return new kotlinx.datetime.t(m12.f412355a.d(), m12.f412356b.d());
    }
}
