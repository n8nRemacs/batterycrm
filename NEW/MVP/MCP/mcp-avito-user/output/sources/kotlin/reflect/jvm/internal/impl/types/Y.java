package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: KotlinType.kt */
/* loaded from: classes8.dex */
public abstract class Y extends J0 implements u51.i, u51.k {
    public Y() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public abstract Y L0(boolean z12);

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract Y N0(@Y61.k n0 n0Var);

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            C43066x.k(sb2, "[", kotlin.reflect.jvm.internal.impl.renderer.b.f409471d.y(it.next(), null), "] ");
        }
        sb2.append(H0());
        if (!F0().isEmpty()) {
            C42745f0.N(F0(), sb2, ", ", "<", ">", null, 112);
        }
        if (I0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
