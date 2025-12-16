package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C22066f2;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VectorPainter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f39822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map<String, S> f39823m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(T t12, Map map, int i12) {
        super(2);
        this.f39822l = t12;
        this.f39823m = map;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Map<String, S> map = this.f39823m;
        e0.a(this.f39822l, map, a12, iA2);
        return G0.f406611a;
    }
}
