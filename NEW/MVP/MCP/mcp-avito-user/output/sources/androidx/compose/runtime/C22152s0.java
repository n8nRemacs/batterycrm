package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22152s0 extends kotlin.jvm.internal.N implements Y41.p<A, Integer, kotlin.G0> {
    public C22152s0() {
        throw null;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        C22128n0 c22128n0 = C22187u0.f38775a;
        B bE2 = a12.E(-805415771);
        int i12 = iA2 & 1;
        if (bE2.p(i12, i12 != 0)) {
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
        }
        bE2.f();
        if (bE2.Z() == null) {
            return kotlin.G0.f406611a;
        }
        throw null;
    }
}
