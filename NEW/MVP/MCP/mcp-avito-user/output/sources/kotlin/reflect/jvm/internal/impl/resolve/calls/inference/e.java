package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import Y61.k;
import Y61.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.C42998x;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes8.dex */
public final class e extends C42998x {
    @Override // kotlin.reflect.jvm.internal.impl.types.C42998x, kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.C42998x, kotlin.reflect.jvm.internal.impl.types.A0
    @l
    public final x0 d(@k O o12) {
        x0 x0VarD = this.f410268b.d(o12);
        if (x0VarD == null) {
            return null;
        }
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        return d.a(x0VarD, interfaceC42853fB instanceof g0 ? (g0) interfaceC42853fB : null);
    }
}
