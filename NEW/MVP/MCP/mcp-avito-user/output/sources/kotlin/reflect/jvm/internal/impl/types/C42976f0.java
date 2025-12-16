package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42976f0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f410202c;

    public C42976f0(ArrayList arrayList) {
        this.f410202c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s0
    @Y61.l
    public final x0 g(@Y61.k q0 q0Var) {
        if (this.f410202c.contains(q0Var)) {
            return G0.k((kotlin.reflect.jvm.internal.impl.descriptors.g0) q0Var.b());
        }
        return null;
    }
}
