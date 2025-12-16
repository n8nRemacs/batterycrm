package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class nq8 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq8(MaterialCalendar materialCalendar, int i, int i2) {
        super(i, false);
        this.F = materialCalendar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        s52 s52Var = new s52(recyclerView.getContext(), 3);
        s52Var.a = i;
        K0(s52Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(iid iidVar, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.p1.getWidth();
            iArr[1] = materialCalendar.p1.getWidth();
        } else {
            iArr[0] = materialCalendar.p1.getHeight();
            iArr[1] = materialCalendar.p1.getHeight();
        }
    }
}
