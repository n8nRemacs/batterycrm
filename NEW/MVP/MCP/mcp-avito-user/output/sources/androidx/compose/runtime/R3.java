package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/R3;", "T", "", "composer", "Landroidx/compose/runtime/A;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f38103a;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/G0;", "it", "invoke", "(Ljava/lang/Object;Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Object, kotlin.G0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f38104l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<Object, kotlin.G0> lVar) {
            super(2);
            this.f38104l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final kotlin.G0 invoke(Object obj, kotlin.G0 g02) {
            this.f38104l.invoke(obj);
            return kotlin.G0.f406611a;
        }
    }

    public static final void a(@Y61.k Y41.l lVar, A a12) {
        if (a12.getF37887P()) {
            a12.a(kotlin.G0.f406611a, new a(lVar));
        }
    }

    public static final void b(@Y61.k Y41.p pVar, A a12, Object obj) {
        if (a12.getF37887P() || !kotlin.jvm.internal.L.f(a12.t(), obj)) {
            a12.H(obj);
            a12.a(obj, pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof R3) {
            return kotlin.jvm.internal.L.f(this.f38103a, ((R3) obj).f38103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38103a.hashCode();
    }

    public final String toString() {
        return "Updater(composer=" + this.f38103a + ')';
    }
}
