package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.format.InterfaceC43332f;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: LocalTimeFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/b0;", "Lkotlinx/datetime/format/a;", "Lkotlinx/datetime/w;", "Lkotlinx/datetime/format/N;", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43325b0 extends AbstractC43322a<kotlinx.datetime.w, N> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f412399b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43374f<InterfaceC43351o0> f412400a;

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/b0$a;", "Lkotlinx/datetime/format/b;", "Lkotlinx/datetime/format/o0;", "Lkotlinx/datetime/format/f;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.b0$a */
    public static final class a implements InterfaceC43324b<InterfaceC43351o0, a>, InterfaceC43332f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43372d<InterfaceC43351o0> f412401a;

        public a(@Y61.k C43372d<InterfaceC43351o0> c43372d) {
            this.f412401a = c43372d;
        }

        @Override // kotlinx.datetime.format.InterfaceC43332f
        public final void b(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43351o0> oVar) {
            this.f412401a.a(oVar);
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
        public final C43372d<InterfaceC43351o0> h() {
            return this.f412401a;
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final InterfaceC43324b j() {
            return new a(new C43372d());
        }

        @Override // kotlinx.datetime.format.C
        public final void l(@Y61.k String str) {
            InterfaceC43324b.a.d(this, str);
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
    }

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/b0$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.b0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43325b0(@Y61.k C43374f<? super InterfaceC43351o0> c43374f) {
        super(null);
        this.f412400a = c43374f;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    @Y61.k
    public final C43374f<InterfaceC43351o0> b() {
        return this.f412400a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final InterfaceC43377c c() {
        return C43335g0.f412407b;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final kotlinx.datetime.w d(InterfaceC43377c interfaceC43377c) {
        return ((N) interfaceC43377c).d();
    }
}
