package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.layout.B;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidViewHolder.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f42955a = new a();

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/c$a", "Landroidx/compose/ui/input/nestedscroll/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {
    }

    public static final void a(View view, LayoutNode layoutNode) {
        long jE2 = B.e(layoutNode.f40615I.f40875b);
        int iRound = Math.round(Float.intBitsToFloat((int) (jE2 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE2 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    public static final int b(int i12) {
        if (i12 == 0) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            return androidx.compose.ui.input.nestedscroll.i.f40106c;
        }
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        return androidx.compose.ui.input.nestedscroll.i.f40107d;
    }
}
