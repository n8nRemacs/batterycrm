package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f39097l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i12) {
        super(1);
        this.f39097l = i12;
    }

    @Override // Y41.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.C1(this.f39097l));
    }
}
