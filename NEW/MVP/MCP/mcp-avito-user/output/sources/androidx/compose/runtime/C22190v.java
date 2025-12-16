package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22190v {
    @InterfaceC22029a2
    @InterfaceC22132o
    @X41.i
    @Y61.k
    public static final InterfaceC22034b2 a(@Y61.l A a12) {
        C22039c2 c22039c2R = a12.r();
        if (c22039c2R == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        a12.g(c22039c2R);
        return c22039c2R;
    }

    @kotlin.X
    public static final void b() {
        throw new IllegalStateException("Invalid applier");
    }
}
