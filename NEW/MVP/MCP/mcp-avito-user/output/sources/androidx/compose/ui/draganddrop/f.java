package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: DragAndDropNode.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/e;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class f extends N implements Y41.l<e, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f39012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f39013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f39014n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, e eVar, l0.a aVar) {
        super(1);
        this.f39012l = bVar;
        this.f39013m = eVar;
        this.f39014n = aVar;
    }

    @Override // Y41.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(e eVar) {
        e eVar2 = eVar;
        if (!eVar2.f42893o) {
            return TraversableNode.Companion.TraverseDescendantsAction.f40696c;
        }
        if (eVar2.f39005t != null) {
            C47949a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        Y41.l<b, o> lVar = eVar2.f39002q;
        o oVarInvoke = lVar != null ? lVar.invoke(this.f39012l) : null;
        eVar2.f39005t = oVarInvoke;
        boolean z12 = oVarInvoke != null;
        if (z12) {
            e eVar3 = this.f39013m;
            eVar3.getClass();
            C22421l.h(eVar3).getDragAndDropManager().c(eVar2);
        }
        l0.a aVar = this.f39014n;
        aVar.f406838b = aVar.f406838b || z12;
        return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
    }
}
