package androidx.compose.ui.input.nestedscroll;

import Y41.l;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: NestedScrollNode.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/ui/node/TraversableNode;", "it", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends N implements l<Object, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<Object> f40104l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l0.h<Object> hVar) {
        super(1);
        this.f40104l = hVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.k] */
    @Override // Y41.l
    public final Boolean invoke(Object obj) {
        boolean z12;
        ?? r22 = (TraversableNode) obj;
        if (r22.getF42880b().f42893o) {
            this.f40104l.f406842b = r22;
            z12 = false;
        } else {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
