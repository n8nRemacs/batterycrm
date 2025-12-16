package androidx.compose.ui.draganddrop;

import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/e;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h extends N implements Y41.l<e, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f39015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f39016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AndroidDragAndDropManager.b f39017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f39018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j12, A a12, AndroidDragAndDropManager.b bVar, Y41.a aVar) {
        super(1);
        this.f39015l = j12;
        this.f39016m = a12;
        this.f39017n = bVar;
        this.f39018o = aVar;
    }

    @Override // Y41.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(e eVar) {
        e eVar2 = eVar;
        if (!eVar2.f42893o) {
            return TraversableNode.Companion.TraverseDescendantsAction.f40696c;
        }
        Y41.p<? super n, ? super l0.g, G0> pVar = eVar2.f39001p;
        if (pVar == null) {
            return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
        }
        l0.g.f413384b.getClass();
        long j12 = l0.g.f413386d;
        long j13 = this.f39015l;
        boolean zD2 = l0.g.d(j13, j12);
        AndroidDragAndDropManager.b bVar = this.f39017n;
        if (zD2) {
            pVar.invoke(bVar, l0.g.a(j12));
        } else {
            long jG1 = C22421l.g(eVar2).f40615I.f40875b.G1(this.f39016m, j13, true);
            if (!l0.o.c(v.c(eVar2.f39006u)).a(jG1)) {
                return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
            }
            pVar.invoke(bVar, l0.g.a(jG1));
        }
        return ((Boolean) ((AndroidDragAndDropManager.a) this.f39018o).invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.f40697d : TraversableNode.Companion.TraverseDescendantsAction.f40695b;
    }
}
