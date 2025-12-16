package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "event", "Landroidx/compose/ui/draganddrop/o;", "invoke", "(Landroidx/compose/ui/draganddrop/b;)Landroidx/compose/ui/draganddrop/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class j extends N implements Y41.l<b, o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f39019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f39020m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Y41.l<? super b, Boolean> lVar, o oVar) {
        super(1);
        this.f39019l = (N) lVar;
        this.f39020m = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final o invoke(b bVar) {
        if (((Boolean) this.f39019l.invoke(bVar)).booleanValue()) {
            return this.f39020m;
        }
        return null;
    }
}
