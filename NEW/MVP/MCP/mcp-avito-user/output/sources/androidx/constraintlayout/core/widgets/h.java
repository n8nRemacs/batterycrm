package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class h extends ConstraintWidget implements g {

    /* renamed from: u0, reason: collision with root package name */
    public ConstraintWidget[] f43647u0 = new ConstraintWidget[4];

    /* renamed from: v0, reason: collision with root package name */
    public int f43648v0 = 0;

    public final void V(int i12, o oVar, ArrayList arrayList) {
        for (int i13 = 0; i13 < this.f43648v0; i13++) {
            ConstraintWidget constraintWidget = this.f43647u0[i13];
            ArrayList<ConstraintWidget> arrayList2 = oVar.f43540a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i14 = 0; i14 < this.f43648v0; i14++) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.f43647u0[i14], i12, arrayList, oVar);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public final void a() {
        this.f43648v0 = 0;
        Arrays.fill(this.f43647u0, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public final void c(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i12 = this.f43648v0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f43647u0;
        if (i12 > constraintWidgetArr.length) {
            this.f43647u0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f43647u0;
        int i13 = this.f43648v0;
        constraintWidgetArr2[i13] = constraintWidget;
        this.f43648v0 = i13 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        h hVar = (h) constraintWidget;
        this.f43648v0 = 0;
        int i12 = hVar.f43648v0;
        for (int i13 = 0; i13 < i12; i13++) {
            c(map.get(hVar.f43647u0[i13]));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public void b() {
    }
}
