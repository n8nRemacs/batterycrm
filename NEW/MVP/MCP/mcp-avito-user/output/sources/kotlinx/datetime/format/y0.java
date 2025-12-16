package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43373e;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: UtcOffsetFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/y0;", "Lkotlinx/datetime/format/a;", "Lkotlinx/datetime/D;", "Lkotlinx/datetime/format/O;", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y0 extends AbstractC43322a<kotlinx.datetime.D, O> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f412474b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43374f<x0> f412475a;

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/y0$a;", "Lkotlinx/datetime/format/b;", "Lkotlinx/datetime/format/x0;", "Lkotlinx/datetime/format/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43324b<x0, a>, InterfaceC43330e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43372d<x0> f412476a;

        public a(@Y61.k C43372d<x0> c43372d) {
            this.f412476a = c43372d;
        }

        @Override // kotlinx.datetime.format.C.e
        public final void a() {
            Padding padding = Padding.f412371b;
            w(new C43373e(new S0()));
        }

        @Override // kotlinx.datetime.format.C.e
        public final void c() {
            Padding padding = Padding.f412371b;
            w(new kotlinx.datetime.internal.format.A(new C43373e(new U0())));
        }

        @Override // kotlinx.datetime.format.C.e
        public final void e() {
            Padding padding = Padding.f412371b;
            w(new C43373e(new T0()));
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void g(@Y61.k Y41.l<? super a, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        @Y61.k
        public final C43372d<x0> h() {
            return this.f412476a;
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final InterfaceC43324b j() {
            return new a(new C43372d());
        }

        @Override // kotlinx.datetime.format.C
        public final void l(@Y61.k String str) {
            InterfaceC43324b.a.d(this, str);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void q(@Y61.k String str, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.b(this, str, lVar);
        }

        public final void w(@Y61.k kotlinx.datetime.internal.format.o<? super x0> oVar) {
            this.f412476a.a(oVar);
        }
    }

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/y0$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static y0 a(@Y61.k Y41.l lVar) {
            a aVar = new a(new C43372d());
            lVar.invoke(aVar);
            return new y0(InterfaceC43324b.a.c(aVar));
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@Y61.k C43374f<? super x0> c43374f) {
        super(null);
        this.f412475a = c43374f;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    @Y61.k
    public final C43374f<x0> b() {
        return this.f412475a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final InterfaceC43377c c() {
        return A0.f412320d;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final kotlinx.datetime.D d(InterfaceC43377c interfaceC43377c) {
        return ((O) interfaceC43377c).b();
    }
}
