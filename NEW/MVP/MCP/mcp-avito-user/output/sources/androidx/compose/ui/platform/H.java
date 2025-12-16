package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.C22323a;
import androidx.compose.ui.input.pointer.C22324b;
import androidx.compose.ui.input.pointer.InterfaceC22345x;
import j.InterfaceC42164u;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/H;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/x;", "icon", "Lkotlin/G0;", "a", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/x;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H f41122a = new H();

    @Y61.k
    @j.X
    public static PointerIcon b(@Y61.k Context context, @Y61.l InterfaceC22345x interfaceC22345x) {
        if (!(interfaceC22345x instanceof C22323a)) {
            return interfaceC22345x instanceof C22324b ? PointerIcon.getSystemIcon(context, ((C22324b) interfaceC22345x).f40201b) : PointerIcon.getSystemIcon(context, 1000);
        }
        ((C22323a) interfaceC22345x).getClass();
        return null;
    }

    @InterfaceC42164u
    @j.X
    public final void a(@Y61.k View view, @Y61.l InterfaceC22345x icon) {
        PointerIcon pointerIconB = b(view.getContext(), icon);
        if (kotlin.jvm.internal.L.f(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
