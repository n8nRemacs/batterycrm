package androidx.compose.ui.relocation;

import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.unit.v;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.j;
import l0.o;

/* compiled from: BringIntoViewModifierNode.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/j;", "invoke", "()Ll0/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b extends N implements Y41.a<j> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f41670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC22443w0 f41671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Y41.a aVar, AbstractC22443w0 abstractC22443w0) {
        super(0);
        this.f41670l = (N) aVar;
        this.f41671m = abstractC22443w0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final j invoke() {
        j jVar;
        ?? r02 = this.f41670l;
        if (r02 != 0 && (jVar = (j) r02.invoke()) != null) {
            return jVar;
        }
        AbstractC22443w0 abstractC22443w0 = this.f41671m;
        if (!abstractC22443w0.j1().f42893o) {
            abstractC22443w0 = null;
        }
        if (abstractC22443w0 != null) {
            return o.c(v.c(abstractC22443w0.f40347d));
        }
        return null;
    }
}
