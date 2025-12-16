package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: FocusFinderCompat.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "t", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22476g1 extends kotlin.jvm.internal.N implements Y41.l<View, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(View view) {
        View view2 = view;
        C22480h1 c22480h1 = new C22480h1(view2.getNextFocusForwardId());
        View view3 = null;
        View view4 = null;
        while (true) {
            View viewA = C22484i1.a(view2, c22480h1, view4);
            if (viewA != null) {
                view3 = viewA;
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            View view5 = (View) parent;
            view4 = view2;
            view2 = view5;
        }
        return Boolean.valueOf(view3 == null);
    }
}
