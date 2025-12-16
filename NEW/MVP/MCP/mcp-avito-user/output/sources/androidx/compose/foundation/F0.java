package androidx.compose.foundation;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "node", "Landroidx/compose/ui/node/TraversableNode;", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F0 extends kotlin.jvm.internal.N implements Y41.l<TraversableNode, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f26700l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(l0.a aVar) {
        super(1);
        this.f26700l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(TraversableNode traversableNode) {
        TraversableNode traversableNode2 = traversableNode;
        l0.a aVar = this.f26700l;
        boolean z12 = aVar.f406838b || ((androidx.compose.foundation.gestures.H1) traversableNode2).f27266q;
        aVar.f406838b = z12;
        return Boolean.valueOf(!z12);
    }
}
