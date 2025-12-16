package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class m extends ConstraintWidget {

    /* renamed from: u0, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f43661u0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void G() {
        this.f43661u0.clear();
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void J(androidx.constraintlayout.core.c cVar) {
        super.J(cVar);
        int size = this.f43661u0.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f43661u0.get(i12).J(cVar);
        }
    }

    public void V() {
        ArrayList<ConstraintWidget> arrayList = this.f43661u0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = this.f43661u0.get(i12);
            if (constraintWidget instanceof m) {
                ((m) constraintWidget).V();
            }
        }
    }
}
