package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/i;", "N", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22078i<N> {

    /* compiled from: Applier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.i$a */
    public static final class a {
    }

    default void a(@Y61.l Object obj, @Y61.k Y41.p pVar) {
        pVar.invoke(i(), obj);
    }

    default void c() {
        N nI2 = i();
        InterfaceC22198x interfaceC22198x = nI2 instanceof InterfaceC22198x ? (InterfaceC22198x) nI2 : null;
        if (interfaceC22198x != null) {
            interfaceC22198x.f();
        }
    }

    void clear();

    void d(int i12, N n12);

    void e(N n12);

    void f(int i12, int i13);

    void g(int i12, int i13, int i14);

    void h(int i12, N n12);

    N i();

    void j();

    default void b() {
    }
}
