package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/b0;", "T", "Landroidx/compose/runtime/X1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22032b0<T> extends X1<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22037c0<T> f38177b;

    /* compiled from: CompositionLocal.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.b0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f38178l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final T invoke() {
            G.d("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public C22032b0(@Y61.k Y41.l<? super P, ? extends T> lVar) {
        super(a.f38178l, null);
        this.f38177b = new C22037c0<>(lVar);
    }

    @Override // androidx.compose.runtime.O
    public final T3 a() {
        return this.f38177b;
    }

    @Override // androidx.compose.runtime.X1
    @Y61.k
    public final Y1<T> b(T t12) {
        return new Y1<>(this, t12, t12 == null, null, null, true);
    }
}
