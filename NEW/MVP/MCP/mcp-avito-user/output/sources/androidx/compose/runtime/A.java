package androidx.compose.runtime;

import androidx.compose.runtime.B;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/A;", "", "a", "Landroidx/compose/runtime/B;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f37866a = a.f37867a;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/A$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f37867a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C1651a f37868b = new C1651a();

        /* compiled from: Composer.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/A$a$a", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.A$a$a, reason: collision with other inner class name */
        public static final class C1651a {
            public final String toString() {
                return "Empty";
            }
        }
    }

    @InterfaceC22194w
    void A();

    @InterfaceC22194w
    boolean B(@Y61.l Object obj);

    @InterfaceC22194w
    void C(int i12);

    /* renamed from: D */
    boolean getF37887P();

    @InterfaceC22194w
    @Y61.k
    B E(int i12);

    @Y61.k
    InterfaceC22078i<?> F();

    @Y61.k
    @Y61.o
    CoroutineContext G();

    @InterfaceC22194w
    void H(@Y61.l Object obj);

    @InterfaceC22194w
    void I(int i12);

    @Y61.k
    androidx.compose.runtime.tooling.a J();

    @InterfaceC22194w
    void K(int i12, @Y61.l Object obj);

    @InterfaceC22194w
    void L();

    /* renamed from: M */
    int getF37888Q();

    @InterfaceC22194w
    void N();

    @InterfaceC22194w
    void O();

    @InterfaceC22194w
    <V, T> void a(V v12, @Y61.k Y41.p<? super T, ? super V, kotlin.G0> pVar);

    @InterfaceC22194w
    <T> void b(@Y61.k Y41.a<? extends T> aVar);

    boolean c();

    @InterfaceC22194w
    void d();

    @InterfaceC22194w
    void e(@Y61.l Object obj);

    @InterfaceC22194w
    void f();

    @K0
    void g(@Y61.k InterfaceC22034b2 interfaceC22034b2);

    @InterfaceC22194w
    void h();

    @K0
    @Y61.k
    B.b i();

    @InterfaceC22194w
    default boolean j(boolean z12) {
        return j(z12);
    }

    @InterfaceC22194w
    default boolean k(float f12) {
        return k(f12);
    }

    @InterfaceC22194w
    void l();

    @InterfaceC22194w
    default boolean m(int i12) {
        return m(i12);
    }

    @InterfaceC22194w
    default boolean n(long j12) {
        return n(j12);
    }

    @K0
    <T> T o(@Y61.k O<T> o12);

    @K0
    boolean p(int i12, boolean z12);

    void q();

    @Y61.l
    C22039c2 r();

    @InterfaceC22194w
    void s();

    @InterfaceC22194w
    @Y61.l
    Object t();

    @InterfaceC22194w
    default boolean u(@Y61.l Object obj) {
        return B(obj);
    }

    @InterfaceC22194w
    void v(boolean z12);

    @K0
    void w(@Y61.k Y41.a<kotlin.G0> aVar);

    @K0
    void x(@Y61.l Object obj);

    @Y61.k
    O1 y();

    @InterfaceC22194w
    void z();
}
