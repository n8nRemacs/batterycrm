package androidx.compose.ui.graphics.vector;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class X extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f39820l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map<String, S> f39821m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(T t12, Map map) {
        super(2);
        this.f39820l = t12;
        this.f39821m = map;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            e0.a(this.f39820l, this.f39821m, a13, 0);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
