package com.my.target;

import android.content.Context;
import android.widget.FrameLayout;
import com.my.target.C37805p0;
import com.my.target.InterfaceC37817w;
import com.my.target.t1;
import e11.C39861d1;
import e11.C39878j0;

/* loaded from: classes7.dex */
public class C extends FrameLayout implements InterfaceC37817w, C37805p0.a, t1.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final t1 f364352b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C37805p0 f364353c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39861d1 f364354d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public InterfaceC37817w.a f364355e;

    public C(@j.N Context context) {
        super(context);
        t1 t1Var = new t1(context, null);
        this.f364352b = t1Var;
        C37805p0 c37805p0 = new C37805p0(0, false);
        c37805p0.f365068G = this;
        t1Var.setLayoutManager(c37805p0);
        this.f364353c = c37805p0;
        C39861d1 c39861d1 = new C39861d1();
        this.f364354d = c39861d1;
        c39861d1.b(t1Var);
        t1Var.setHasFixedSize(true);
        t1Var.setMoveStopListener(this);
        addView(t1Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a() {
        int[] iArr;
        if (this.f364355e != null) {
            C37805p0 c37805p0 = this.f364353c;
            int iK1 = c37805p0.K1();
            int iM1 = c37805p0.M1();
            if (iK1 < 0 || iM1 < 0) {
                return;
            }
            if (C37803o0.a(c37805p0.Z(iK1)) < 50.0d) {
                iK1++;
            }
            if (C37803o0.a(c37805p0.Z(iM1)) < 50.0d) {
                iM1--;
            }
            if (iK1 > iM1) {
                return;
            }
            if (iK1 == iM1) {
                iArr = new int[]{iK1};
            } else {
                int i12 = (iM1 - iK1) + 1;
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = iK1;
                    iK1++;
                }
                iArr = iArr2;
            }
            this.f364355e.a(iArr);
        }
    }

    @Override // com.my.target.t1.a
    public final void b() {
        a();
    }

    public void setAdapter(@j.N C39878j0 c39878j0) {
        this.f364352b.setAdapter(c39878j0);
    }

    @Override // com.my.target.InterfaceC37817w
    public void setListener(@j.N InterfaceC37817w.a aVar) {
        this.f364355e = aVar;
    }
}
