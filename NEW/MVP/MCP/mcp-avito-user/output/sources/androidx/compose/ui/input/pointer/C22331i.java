package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "it", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/input/pointer/h;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.input.pointer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22331i extends kotlin.jvm.internal.N implements Y41.l<AbstractC22330h, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<AbstractC22330h> f40255l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22331i(l0.h<AbstractC22330h> hVar) {
        super(1);
        this.f40255l = hVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.input.pointer.h] */
    @Override // Y41.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(AbstractC22330h abstractC22330h) {
        AbstractC22330h abstractC22330h2 = abstractC22330h;
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.f40695b;
        if (!abstractC22330h2.f40253s) {
            return traverseDescendantsAction;
        }
        this.f40255l.f406842b = abstractC22330h2;
        return abstractC22330h2.f40252r ? TraversableNode.Companion.TraverseDescendantsAction.f40696c : traverseDescendantsAction;
    }
}
