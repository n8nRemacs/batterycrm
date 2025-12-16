package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes.dex */
public final class z18 {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ z18(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public static final void e(mzg mzgVar, String str, int i) {
        VectorPath vectorPathFindPath = mzgVar.findPath(str);
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setFillColor(i);
            mzgVar.invalidatePath();
        }
    }

    public static final void f(mzg mzgVar, String str, int i) {
        VectorPath vectorPathFindPath = mzgVar.findPath(str);
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setStrokeColor(i);
            mzgVar.invalidatePath();
        }
    }

    public final int a() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.b.m;
        }
    }

    public final int c(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() + this.b.o;
            default:
                return view.getLeft() - this.b.o;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
