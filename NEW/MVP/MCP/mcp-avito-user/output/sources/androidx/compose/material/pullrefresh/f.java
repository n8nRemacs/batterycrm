package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends N implements Y41.a<Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f33935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar) {
        super(0);
        this.f33935l = tVar;
    }

    @Override // Y41.a
    public final Float invoke() {
        t tVar = this.f33935l;
        return Float.valueOf(((Number) tVar.f33970c.getF42167b()).floatValue() / tVar.a() < 1.0f ? 0.3f : 1.0f);
    }
}
