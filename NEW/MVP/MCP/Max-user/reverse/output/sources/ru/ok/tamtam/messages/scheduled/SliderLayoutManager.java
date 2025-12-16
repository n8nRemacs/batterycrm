package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.b1d;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.did;
import defpackage.gf4;
import defpackage.iid;
import defpackage.n4f;
import defpackage.n7j;
import defpackage.nca;
import defpackage.o07;
import defpackage.q1g;
import defpackage.so7;
import defpackage.uog;
import defpackage.vvc;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/messages/scheduled/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "n4f", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SliderLayoutManager extends LinearLayoutManager {
    public final n4f E;
    public RecyclerView F;
    public final int G;
    public final float H;
    public final float I;
    public final int J;
    public final gf4 K;

    public SliderLayoutManager(Context context, n4f n4fVar) throws Resources.NotFoundException {
        this.E = n4fVar;
        this.G = context.getResources().getInteger(b1d.picker_min_distance);
        int i = vvc.picker_scale_factor;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.H = typedValue.getFloat();
        int i2 = vvc.picker_min_scale_factor;
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(i2, typedValue2, true);
        this.I = typedValue2.getFloat();
        this.J = context.getResources().getDimensionPixelSize(vvc.date_picker_selection_rect_offset) * 2;
        this.K = new gf4(0);
        p1(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int A0(int i, did didVar, iid iidVar) {
        if (this.p != 1) {
            return 0;
        }
        int iA0 = super.A0(i, didVar, iidVar);
        if (iA0 != 0) {
            u1();
        }
        return iA0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y(RecyclerView recyclerView) {
        this.F = recyclerView;
        this.K.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void l0(did didVar, iid iidVar) {
        super.l0(didVar, iidVar);
        u1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(int i) {
        int iS;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && i == 0) {
            int height = recyclerView.getHeight();
            int height2 = recyclerView.getHeight() / 2;
            Iterator it = n7j.h(0, recyclerView.getChildCount()).iterator();
            int i2 = -1;
            while (((so7) it).c) {
                int iNextInt = ((so7) it).nextInt();
                View childAt = recyclerView.getChildAt(iNextInt);
                int iAbs = Math.abs((((a.A(childAt) - a.G(childAt)) / 2) + a.G(childAt)) - height2);
                if (iNextInt != recyclerView.getChildCount() - 1) {
                    if (iAbs < height) {
                        iS = RecyclerView.S(childAt);
                        i2 = iS;
                        height = iAbs;
                    }
                } else if (iAbs <= height) {
                    iS = RecyclerView.S(childAt);
                    i2 = iS;
                    height = iAbs;
                }
            }
            n4f n4fVar = this.E;
            if (n4fVar != null) {
                n4fVar.b(i2);
            }
        }
    }

    public final void u1() {
        q1g q1gVarD;
        RecyclerView recyclerView = this.F;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = recyclerView.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        float f = (this.J * 1.05f) / 2.0f;
        float f2 = this.o / 2;
        float f3 = f2 - f;
        float f4 = f + f2;
        HashSet hashSet = new HashSet();
        Iterator it = n7j.h(0, x()).iterator();
        while (((so7) it).c) {
            View viewW = w(((so7) it).nextInt());
            AppCompatTextView appCompatTextView = viewW instanceof AppCompatTextView ? (AppCompatTextView) viewW : null;
            if (appCompatTextView != null) {
                float height = (appCompatTextView.getHeight() / 2.0f) + appCompatTextView.getY();
                if (!hashSet.contains(appCompatTextView.getText()) && appCompatTextView.getTop() >= f3 && appCompatTextView.getBottom() <= f4) {
                    hashSet.add(appCompatTextView.getText());
                    uog.i(appCompatTextView, o07.CLOCK_TICK);
                }
                boolean z = Math.abs(height - f2) <= ((float) this.G);
                float fSqrt = z ? 1.0f : 1 - (((float) Math.sqrt(r9 / this.o)) * this.H);
                float f5 = this.I;
                if (fSqrt < f5) {
                    fSqrt = f5;
                }
                appCompatTextView.setScaleX(fSqrt);
                appCompatTextView.setScaleY(fSqrt);
                appCompatTextView.setTextColor(z ? q1gVarD.F : q1gVarD.M);
            }
        }
    }
}
