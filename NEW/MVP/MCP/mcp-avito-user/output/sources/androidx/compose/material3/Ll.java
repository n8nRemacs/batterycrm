package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Ll extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f35089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Lifecycle.Event, kotlin.G0> f35090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f35091n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ll(Lifecycle lifecycle, Y41.l lVar, Y41.a aVar, int i12) {
        super(2);
        this.f35089l = lifecycle;
        this.f35090m = lVar;
        this.f35091n = aVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Ol.a(this.f35089l, this.f35090m, this.f35091n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
