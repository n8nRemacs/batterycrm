package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.format.InterfaceC43326c;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: LocalDateFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/datetime/format/P;", "Lkotlinx/datetime/format/a;", "Lkotlinx/datetime/q;", "Lkotlinx/datetime/format/L;", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class P extends AbstractC43322a<kotlinx.datetime.q, L> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f412368b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43374f<InterfaceC43338i> f412369a;

    /* compiled from: LocalDateFormat.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/P$a;", "Lkotlinx/datetime/format/b;", "Lkotlinx/datetime/format/i;", "Lkotlinx/datetime/format/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43324b<InterfaceC43338i, a>, InterfaceC43326c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43372d<InterfaceC43338i> f412370a;

        public a(@Y61.k C43372d<InterfaceC43338i> c43372d) {
            this.f412370a = c43372d;
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void g(@Y61.k Y41.l<? super a, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC43324b
        @Y61.k
        public final C43372d<InterfaceC43338i> h() {
            return this.f412370a;
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

        @Override // kotlinx.datetime.format.InterfaceC43324b
        public final void q(@Y61.k String str, @Y61.k Y41.l<? super a, kotlin.G0> lVar) {
            InterfaceC43324b.a.b(this, str, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC43326c
        public final void v(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43338i> oVar) {
            this.f412370a.a(oVar);
        }
    }

    /* compiled from: LocalDateFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/P$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(@Y61.k C43374f<? super InterfaceC43338i> c43374f) {
        super(null);
        this.f412369a = c43374f;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    @Y61.k
    public final C43374f<InterfaceC43338i> b() {
        return this.f412369a;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final InterfaceC43377c c() {
        return S.f412379c;
    }

    @Override // kotlinx.datetime.format.AbstractC43322a
    public final kotlinx.datetime.q d(InterfaceC43377c interfaceC43377c) {
        return ((L) interfaceC43377c).d();
    }
}
