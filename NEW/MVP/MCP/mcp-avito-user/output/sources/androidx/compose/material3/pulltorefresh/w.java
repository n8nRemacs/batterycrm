package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.C22040c3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class w extends N implements Y41.p<Float, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f37112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar) {
        super(2);
        this.f37112l = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(Float f12, Float f13) {
        float fFloatValue = f12.floatValue();
        f13.floatValue();
        int i12 = v.f37108d;
        ((C22040c3) this.f37112l.f37110b).S6(fFloatValue);
        return G0.f406611a;
    }
}
