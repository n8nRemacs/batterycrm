package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class vo8 extends vhd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ vo8(f8a f8aVar, f8a f8aVar2, f8a f8aVar3, int i) {
        this.a = i;
        this.b = f8aVar;
        this.c = f8aVar2;
        this.d = f8aVar3;
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        phd adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.l(i));
        }
        return null;
    }

    @Override // defpackage.vhd
    public void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                f8a f8aVar = (f8a) this.b;
                mid midVarT = recyclerView.T(view);
                if (midVarT != null && (i = midVarT.X) != 0) {
                    int i3 = 536870911 & i;
                    rect.left = f8aVar.c(i3);
                    rect.right = f8aVar.c(i3);
                    if ((1073741824 & i) == 0) {
                        if (midVarT.g() != 0 && (Integer.MIN_VALUE & i) == 0) {
                            rect.top = ((f8a) this.c).c(i3);
                        }
                        if (midVarT.g() != iidVar.b() - 1 && (536870912 & i) == 0) {
                            rect.bottom = ((f8a) this.d).c(i3);
                            break;
                        }
                    }
                }
                break;
            case 1:
                f8a f8aVar2 = (f8a) this.b;
                mid midVarT2 = recyclerView.T(view);
                if (midVarT2 != null && (i2 = midVarT2.X) != 0) {
                    int i4 = 268435455 & i2;
                    rect.left = f8aVar2.c(i4);
                    rect.right = f8aVar2.c(i4);
                    if ((1073741824 & i2) == 0) {
                        if (midVarT2.g() != 0 && (Integer.MIN_VALUE & i2) == 0) {
                            rect.top = ((f8a) this.c).c(i4);
                        }
                        if (midVarT2.g() != iidVar.b() - 1 && (536870912 & i2) == 0) {
                            rect.bottom = ((f8a) this.d).c(i4);
                            break;
                        }
                    }
                }
                break;
            default:
                super.f(rect, view, recyclerView, iidVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    @Override // defpackage.vhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.graphics.Canvas r12, androidx.recyclerview.widget.RecyclerView r13, defpackage.iid r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo8.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, iid):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vo8(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new ls0(1, vw4.d().getDisplayMetrics().density * 16.0f);
                this.c = new u74(vw4.d().getDisplayMetrics().density * 16.0f);
                this.d = new ls0(0, vw4.d().getDisplayMetrics().density * 16.0f);
                break;
            default:
                float f = 12;
                float f2 = 8;
                float f3 = 8;
                this(agi.d(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), 1024, kti.d(vw4.d().getDisplayMetrics().density * f), 512, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)), agi.d(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), 1024, kti.d(vw4.d().getDisplayMetrics().density * f2), 512, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)), agi.d(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), 512, kti.d(vw4.d().getDisplayMetrics().density * f3), 1024, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(3 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)), 0);
                break;
        }
    }
}
