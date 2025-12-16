package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f43545a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintWidget f43546b;

    /* renamed from: c, reason: collision with root package name */
    public m f43547c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f43548d;

    /* renamed from: e, reason: collision with root package name */
    public final g f43549e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f43550f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43551g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f43552h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f43553i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public b f43554j = b.f43556b;

    /* compiled from: WidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43555a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f43555a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43555a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43555a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43555a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43555a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetRun.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f43556b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f43557c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f43558d;

        static {
            b bVar = new b("NONE", 0);
            f43556b = bVar;
            b bVar2 = new b("START", 1);
            b bVar3 = new b("END", 2);
            b bVar4 = new b("CENTER", 3);
            f43557c = bVar4;
            f43558d = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f43558d.clone();
        }
    }

    public p(ConstraintWidget constraintWidget) {
        this.f43546b = constraintWidget;
    }

    public static void b(f fVar, f fVar2, int i12) {
        fVar.f43520l.add(fVar2);
        fVar.f43514f = i12;
        fVar2.f43519k.add(fVar);
    }

    public static f h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f43387d;
        int iOrdinal = constraintAnchor2.f43388e.ordinal();
        if (iOrdinal == 1) {
            return constraintWidget.f43435d.f43552h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.f43437e.f43552h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.f43435d.f43553i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.f43437e.f43553i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.f43437e.f43536k;
    }

    public static f i(ConstraintAnchor constraintAnchor, int i12) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f43387d;
        p pVar = i12 == 0 ? constraintWidget.f43435d : constraintWidget.f43437e;
        int iOrdinal = constraintAnchor2.f43388e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return pVar.f43552h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return pVar.f43553i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i12, g gVar) {
        fVar.f43520l.add(fVar2);
        fVar.f43520l.add(this.f43549e);
        fVar.f43516h = i12;
        fVar.f43517i = gVar;
        fVar2.f43519k.add(fVar);
        gVar.f43519k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i12, int i13) {
        int iMax;
        if (i13 == 0) {
            ConstraintWidget constraintWidget = this.f43546b;
            int i14 = constraintWidget.f43470v;
            iMax = Math.max(constraintWidget.f43469u, i12);
            if (i14 > 0) {
                iMax = Math.min(i14, i12);
            }
            if (iMax == i12) {
                return i12;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f43546b;
            int i15 = constraintWidget2.f43473y;
            iMax = Math.max(constraintWidget2.f43472x, i12);
            if (i15 > 0) {
                iMax = Math.min(i15, i12);
            }
            if (iMax == i12) {
                return i12;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f43549e.f43518j) {
            return r0.f43515g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.p.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }
}
