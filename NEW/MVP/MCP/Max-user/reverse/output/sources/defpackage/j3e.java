package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
public final class j3e extends i3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3e(View view, int i) {
        super(13, view);
        this.c = i;
    }

    @Override // defpackage.i3
    public final void k0(Rect rect, Rect rect2) {
        switch (this.c) {
            case 0:
                Log.w("ContextMenu.ScrollHelper", "AdapterView scroll is not yet supported!");
                break;
            case 1:
                Log.w("ContextMenu.ScrollHelper", "HorizontalScrollView scroll is not yet supported!");
                break;
            case 2:
                Log.w("ContextMenu.ScrollHelper", "NestedScrollView scroll is not yet supported!");
                break;
            default:
                Log.w("ContextMenu.ScrollHelper", "ScrollView scroll is not yet supported!");
                break;
        }
    }
}
