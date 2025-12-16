package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.jdc;
import defpackage.og9;
import defpackage.uf9;
import defpackage.vf9;
import defpackage.zf9;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements uf9, og9, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public vf9 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        jdc jdcVarX = jdc.x(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(jdcVarX.t(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(jdcVarX.t(1));
        }
        jdcVarX.B();
    }

    @Override // defpackage.uf9
    public final boolean a(zf9 zf9Var) {
        return this.a.q(zf9Var, null, 0);
    }

    @Override // defpackage.og9
    public final void b(vf9 vf9Var) {
        this.a = vf9Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((zf9) getAdapter().getItem(i));
    }
}
