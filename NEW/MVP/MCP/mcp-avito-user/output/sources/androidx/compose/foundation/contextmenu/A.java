package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f26993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f26994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f26995n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f26996o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f26997p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f26998q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(n nVar, Y41.a aVar, androidx.compose.ui.v vVar, g gVar, Y41.l lVar, int i12) {
        super(2);
        this.f26993l = nVar;
        this.f26994m = aVar;
        this.f26995n = vVar;
        this.f26996o = gVar;
        this.f26997p = (N) lVar;
        this.f26998q = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f26998q | 1);
        ?? r42 = this.f26997p;
        Y41.a<G0> aVar = this.f26994m;
        androidx.compose.ui.v vVar = this.f26995n;
        B.d(this.f26993l, aVar, vVar, this.f26996o, r42, a12, iA2);
        return G0.f406611a;
    }
}
