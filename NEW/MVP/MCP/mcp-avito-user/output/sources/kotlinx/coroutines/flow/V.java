package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes8.dex */
final /* synthetic */ class V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Object, Object> f411277a = b.f411280l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<Object, Object, Boolean> f411278b = a.f411279l;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "old", "", "new", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Object, Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f411279l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.L.f(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC43160i<T> a(InterfaceC43160i<? extends T> interfaceC43160i, Y41.l<? super T, ? extends Object> lVar, Y41.p<Object, Object, Boolean> pVar) {
        if (interfaceC43160i instanceof C43154g) {
            C43154g c43154g = (C43154g) interfaceC43160i;
            if (c43154g.f411395c == lVar && c43154g.f411396d == pVar) {
                return interfaceC43160i;
            }
        }
        return new C43154g(interfaceC43160i, lVar, pVar);
    }

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f411280l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        @Y61.l
        public final Object invoke(@Y61.l Object obj) {
            return obj;
        }
    }
}
