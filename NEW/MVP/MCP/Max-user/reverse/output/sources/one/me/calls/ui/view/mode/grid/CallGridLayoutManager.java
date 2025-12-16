package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.bj;
import defpackage.f91;
import defpackage.jy6;
import defpackage.t9f;
import defpackage.xhd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "f91", "bj", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallGridLayoutManager extends GridLayoutManager {
    public final Context M;
    public final int N;
    public final bj O;
    public f91 P;

    public CallGridLayoutManager(Context context, int i, bj bjVar) {
        super(2);
        this.M = context;
        this.N = i;
        this.O = bjVar;
        this.P = new t9f(5, this);
    }

    public final void D1(jy6 jy6Var) {
        int iF = this.P.f();
        bj bjVar = this.O;
        ((ViewGroup.MarginLayoutParams) jy6Var).height = ((iF - (bjVar.b() * this.N)) + 1) / bjVar.b();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final boolean h(xhd xhdVar) {
        xhd xhdVarT = t();
        return (xhdVar instanceof jy6) && ((ViewGroup.MarginLayoutParams) xhdVarT).width == ((ViewGroup.MarginLayoutParams) xhdVar).width && ((ViewGroup.MarginLayoutParams) xhdVarT).height == ((ViewGroup.MarginLayoutParams) xhdVar).height;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final xhd t() {
        xhd xhdVarT = super.t();
        D1((jy6) xhdVarT);
        return xhdVarT;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final xhd u(Context context, AttributeSet attributeSet) {
        xhd xhdVarU = super.u(context, attributeSet);
        D1((jy6) xhdVarU);
        return xhdVarU;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final xhd v(ViewGroup.LayoutParams layoutParams) {
        xhd xhdVarV = super.v(layoutParams);
        D1((jy6) xhdVarV);
        return xhdVarV;
    }
}
