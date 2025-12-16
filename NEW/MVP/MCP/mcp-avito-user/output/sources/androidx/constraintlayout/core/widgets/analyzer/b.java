package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f43486a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final a f43487b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f43488c;

    /* compiled from: BasicMeasure.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f43489a;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f43490b;

        /* renamed from: c, reason: collision with root package name */
        public int f43491c;

        /* renamed from: d, reason: collision with root package name */
        public int f43492d;

        /* renamed from: e, reason: collision with root package name */
        public int f43493e;

        /* renamed from: f, reason: collision with root package name */
        public int f43494f;

        /* renamed from: g, reason: collision with root package name */
        public int f43495g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f43496h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f43497i;

        /* renamed from: j, reason: collision with root package name */
        public int f43498j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC1703b {
        void a(ConstraintWidget constraintWidget, a aVar);

        void b();
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f43488c = dVar;
    }

    public final boolean a(int i12, ConstraintWidget constraintWidget, InterfaceC1703b interfaceC1703b) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f43423U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f43487b;
        aVar.f43489a = dimensionBehaviour;
        aVar.f43490b = dimensionBehaviourArr[1];
        aVar.f43491c = constraintWidget.u();
        aVar.f43492d = constraintWidget.o();
        aVar.f43497i = false;
        aVar.f43498j = i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f43489a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43477d;
        boolean z12 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z13 = aVar.f43490b == dimensionBehaviour3;
        boolean z14 = z12 && constraintWidget.f43427Y > 0.0f;
        boolean z15 = z13 && constraintWidget.f43427Y > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43475b;
        int[] iArr = constraintWidget.f43467t;
        if (z14 && iArr[0] == 4) {
            aVar.f43489a = dimensionBehaviour4;
        }
        if (z15 && iArr[1] == 4) {
            aVar.f43490b = dimensionBehaviour4;
        }
        interfaceC1703b.a(constraintWidget, aVar);
        constraintWidget.S(aVar.f43493e);
        constraintWidget.P(aVar.f43494f);
        constraintWidget.f43407E = aVar.f43496h;
        constraintWidget.M(aVar.f43495g);
        aVar.f43498j = 0;
        return aVar.f43497i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i12, int i13, int i14) {
        int i15 = dVar.f43436d0;
        int i16 = dVar.f43438e0;
        dVar.f43436d0 = 0;
        dVar.f43438e0 = 0;
        dVar.S(i13);
        dVar.P(i14);
        if (i15 < 0) {
            dVar.f43436d0 = 0;
        } else {
            dVar.f43436d0 = i15;
        }
        if (i16 < 0) {
            dVar.f43438e0 = 0;
        } else {
            dVar.f43438e0 = i16;
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.f43488c;
        dVar2.f43594x0 = i12;
        dVar2.V();
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.f43486a;
        arrayList.clear();
        int size = dVar.f43661u0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = dVar.f43661u0.get(i12);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f43423U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43477d;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.f43593w0.f43502b = true;
    }
}
