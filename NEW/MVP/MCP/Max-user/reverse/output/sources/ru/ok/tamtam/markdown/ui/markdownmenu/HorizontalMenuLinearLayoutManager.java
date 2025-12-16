package ru.ok.tamtam.markdown.ui.markdownmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.kti;
import defpackage.xhd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/markdown/ui/markdownmenu/HorizontalMenuLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "markdown-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalMenuLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean f() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean g() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(xhd xhdVar) {
        return xhdVar != null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final xhd t() {
        xhd xhdVarT = super.t();
        u1(xhdVarT);
        return xhdVarT;
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd u(Context context, AttributeSet attributeSet) {
        xhd xhdVar = new xhd(context, attributeSet);
        u1(xhdVar);
        return xhdVar;
    }

    public final void u1(xhd xhdVar) {
        ((ViewGroup.MarginLayoutParams) xhdVar).width = kti.c(((this.n - L()) - K()) / H());
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd v(ViewGroup.LayoutParams layoutParams) {
        xhd xhdVarV = super.v(layoutParams);
        u1(xhdVarV);
        return xhdVarV;
    }
}
