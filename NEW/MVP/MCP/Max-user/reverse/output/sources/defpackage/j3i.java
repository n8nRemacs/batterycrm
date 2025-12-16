package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j3i extends fhh {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3i b;

    public /* synthetic */ j3i(l3i l3iVar, int i) {
        this.a = i;
        this.b = l3iVar;
    }

    @Override // defpackage.ehh
    public final void c() {
        View view;
        int i = this.a;
        l3i l3iVar = this.b;
        switch (i) {
            case 0:
                if (l3iVar.o && (view = l3iVar.g) != null) {
                    view.setTranslationY(0.0f);
                    l3iVar.d.setTranslationY(0.0f);
                }
                l3iVar.d.setVisibility(8);
                l3iVar.d.setTransitioning(false);
                l3iVar.s = null;
                h79 h79Var = l3iVar.k;
                if (h79Var != null) {
                    h79Var.C(l3iVar.j);
                    l3iVar.j = null;
                    l3iVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = l3iVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = hfh.a;
                    teh.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                l3iVar.s = null;
                l3iVar.d.requestLayout();
                break;
        }
    }
}
