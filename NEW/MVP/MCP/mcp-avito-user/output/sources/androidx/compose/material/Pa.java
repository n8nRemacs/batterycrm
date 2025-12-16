package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Tab.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Pa extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f33063l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33064m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33065n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pa(C22096n c22096n, Y41.p pVar, int i12) {
        super(2);
        this.f33063l = c22096n;
        this.f33064m = pVar;
        this.f33065n = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33065n | 1);
        Sa.a(this.f33063l, this.f33064m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
