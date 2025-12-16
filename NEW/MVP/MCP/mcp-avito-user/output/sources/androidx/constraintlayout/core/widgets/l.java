package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class l extends h {

    /* renamed from: w0, reason: collision with root package name */
    public int f43657w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f43658x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f43659y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f43660z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f43650A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f43651B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f43652C0 = false;

    /* renamed from: D0, reason: collision with root package name */
    public int f43653D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    public int f43654E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public final b.a f43655F0 = new b.a();

    /* renamed from: G0, reason: collision with root package name */
    public b.InterfaceC1703b f43656G0 = null;

    public final void X(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i12, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i13) {
        b.InterfaceC1703b interfaceC1703b;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC1703b = this.f43656G0;
            if (interfaceC1703b != null || (constraintWidget2 = this.f43424V) == null) {
                break;
            } else {
                this.f43656G0 = ((d) constraintWidget2).f43595y0;
            }
        }
        b.a aVar = this.f43655F0;
        aVar.f43489a = dimensionBehaviour;
        aVar.f43490b = dimensionBehaviour2;
        aVar.f43491c = i12;
        aVar.f43492d = i13;
        interfaceC1703b.a(constraintWidget, aVar);
        constraintWidget.S(aVar.f43493e);
        constraintWidget.P(aVar.f43494f);
        constraintWidget.f43407E = aVar.f43496h;
        constraintWidget.M(aVar.f43495g);
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.g
    public final void b() {
        for (int i12 = 0; i12 < this.f43648v0; i12++) {
            ConstraintWidget constraintWidget = this.f43647u0[i12];
            if (constraintWidget != null) {
                constraintWidget.f43409G = true;
            }
        }
    }

    public void W(int i12, int i13, int i14, int i15) {
    }
}
