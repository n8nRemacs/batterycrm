package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes8.dex */
final class d extends N implements Y41.l<x0, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f409490l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(1);
        this.f409490l = cVar;
    }

    @Override // Y41.l
    public final CharSequence invoke(x0 x0Var) {
        x0 x0Var2 = x0Var;
        if (x0Var2.c()) {
            return "*";
        }
        String strY = this.f409490l.Y(x0Var2.getType());
        if (x0Var2.a() == Variance.f410069d) {
            return strY;
        }
        return x0Var2.a() + ' ' + strY;
    }
}
