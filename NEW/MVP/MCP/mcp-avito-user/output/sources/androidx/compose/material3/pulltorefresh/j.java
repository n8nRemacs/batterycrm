package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j extends N implements Y41.a<Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f37100l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y41.a<Float> aVar) {
        super(0);
        this.f37100l = aVar;
    }

    @Override // Y41.a
    public final Float invoke() {
        return Float.valueOf(this.f37100l.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
    }
}
