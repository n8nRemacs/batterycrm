package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Y1;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y1<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final X1 f38165a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38166b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22116k3<T> f38167c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22204y1<T> f38168d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38169e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final T f38170f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38171g = true;

    /* JADX WARN: Multi-variable type inference failed */
    public Y1(@Y61.k X1 x12, @Y61.l Object obj, boolean z12, @Y61.l InterfaceC22116k3 interfaceC22116k3, @Y61.l InterfaceC22204y1 interfaceC22204y1, boolean z13) {
        this.f38165a = x12;
        this.f38166b = z12;
        this.f38167c = interfaceC22116k3;
        this.f38168d = interfaceC22204y1;
        this.f38169e = z13;
        this.f38170f = obj;
    }

    public final T a() {
        if (this.f38166b) {
            return null;
        }
        InterfaceC22204y1<T> interfaceC22204y1 = this.f38168d;
        if (interfaceC22204y1 != null) {
            return interfaceC22204y1.getF42167b();
        }
        T t12 = this.f38170f;
        if (t12 != null) {
            return t12;
        }
        G.d("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
