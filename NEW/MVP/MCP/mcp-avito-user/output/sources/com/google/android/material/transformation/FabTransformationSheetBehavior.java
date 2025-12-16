package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import j.InterfaceC42153i;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.WeakHashMap;
import lY0.i;
import lY0.k;

@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    @P
    public HashMap f357737i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @N
    public final FabTransformationBehavior.b C(Context context, boolean z12) {
        int i12 = z12 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f357731a = i.b(i12, context);
        bVar.f357732b = new k();
        return bVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC42153i
    public final void v(@N View view, @N View view2, boolean z12, boolean z13) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z12) {
                this.f357737i = new HashMap(childCount);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = coordinatorLayout.getChildAt(i12);
                boolean z14 = (childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f44447a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z14) {
                    if (z12) {
                        this.f357737i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f357737i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f357737i.get(childAt)).intValue();
                            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z12) {
                this.f357737i = null;
            }
        }
        super.v(view, view2, z12, z13);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
