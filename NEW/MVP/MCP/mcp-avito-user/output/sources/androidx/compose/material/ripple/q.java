package androidx.compose.material.ripple;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RippleAnimation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final float f34128a;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f34128a = 10;
    }

    public static final float a(@Y61.k androidx.compose.ui.unit.d dVar, boolean z12, long j12) {
        float fE2 = l0.g.e(l0.h.a(l0.n.e(j12), l0.n.c(j12))) / 2.0f;
        return z12 ? fE2 + dVar.M0(f34128a) : fE2;
    }
}
