package androidx.compose.ui.platform;

import android.view.View;
import j.InterfaceC42164u;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/E;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/draganddrop/q;", "transferData", "Landroidx/compose/ui/draganddrop/a;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Landroidx/compose/ui/draganddrop/q;Landroidx/compose/ui/draganddrop/a;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final E f41103a = new E();

    @InterfaceC42164u
    @j.X
    public final boolean a(@Y61.k View view, @Y61.k androidx.compose.ui.draganddrop.q transferData, @Y61.k androidx.compose.ui.draganddrop.a dragShadowBuilder) {
        return view.startDragAndDrop(transferData.f39021a, dragShadowBuilder, transferData.f39022b, transferData.f39023c);
    }
}
