package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.L;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: BringIntoViewResponder.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/j;", "invoke", "()Ll0/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class k extends N implements Y41.a<l0.j> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f30093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC22443w0 f30094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l0.j> f30095n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC22443w0 abstractC22443w0, Y41.a aVar) {
        super(0);
        this.f30093l = lVar;
        this.f30094m = abstractC22443w0;
        this.f30095n = aVar;
    }

    @Override // Y41.a
    public final l0.j invoke() {
        AbstractC22443w0 abstractC22443w0 = this.f30094m;
        Y41.a<l0.j> aVar = this.f30095n;
        l lVar = this.f30093l;
        l0.j jVarK2 = l.k2(lVar, abstractC22443w0, aVar);
        if (jVarK2 == null) {
            return null;
        }
        L l12 = lVar.f30096p;
        long j12 = l12.f27321x;
        u.f42871b.getClass();
        if (u.c(j12, 0L)) {
            androidx.compose.foundation.internal.e.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        long jP2 = l12.p2(l12.f27321x, jVarK2) ^ (-9223372034707292160L);
        g.a aVar2 = l0.g.f413384b;
        return jVarK2.n(jP2);
    }
}
