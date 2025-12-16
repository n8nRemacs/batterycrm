package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f27069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f27070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f27072o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f27073p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(n nVar, Y41.a aVar, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f27069l = nVar;
        this.f27070m = aVar;
        this.f27071n = vVar;
        this.f27072o = (N) lVar;
        this.f27073p = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f27073p | 1);
        ?? r32 = this.f27072o;
        B.c(this.f27069l, this.f27070m, this.f27071n, r32, a12, iA2);
        return G0.f406611a;
    }
}
