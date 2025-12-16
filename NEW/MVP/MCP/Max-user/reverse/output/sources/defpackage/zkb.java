package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.Spannable;
import android.view.View;
import java.util.Arrays;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes.dex */
public final class zkb implements gu3, Provider, rn6, bs8, r0f, cff, nze, pi0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zkb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void k(Throwable th) {
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 3:
                gri.a("Recorder", "Encodings end successfully.");
                bhd bhdVar = (bhd) this.b;
                bhdVar.i(bhdVar.R, bhdVar.S);
                break;
            case 4:
                ((l42) this.b).resumeWith(obj);
                break;
            default:
                ((yrf) this.b).run();
                break;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                dlb dlbVar = (dlb) this.b;
                double d = dlbVar.i;
                r84 r84Var = dlbVar.f;
                double dAbs = Math.abs(dDoubleValue - d);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                pmd pmdVar = dlbVar.a;
                boolean z = dAbs > pmdVar.a;
                boolean z2 = jElapsedRealtime - dlbVar.j > ((long) pmdVar.c);
                if (!z && !z2) {
                    r84Var.invoke("not valuable network status diff: " + dAbs + ": " + dlbVar.i + " -> " + dDoubleValue);
                    break;
                } else {
                    dlbVar.j = jElapsedRealtime;
                    r84Var.invoke("submit p2p network status");
                    dlbVar.i = dDoubleValue;
                    dlbVar.e.invoke(Double.valueOf(dDoubleValue));
                    break;
                }
            default:
                ((UploadDraftMediaWorker) this.b).e((Throwable) obj);
                break;
        }
    }

    @Override // defpackage.bs8
    public void b() {
        ((l42) this.b).resumeWith(null);
    }

    @Override // defpackage.bs8
    public void c(py4 py4Var) {
        ((l42) this.b).e(new iqb(22, py4Var));
    }

    @Override // defpackage.pi0
    public int d() {
        return ((z9j) this.b).d;
    }

    @Override // defpackage.cff
    public void e(fff fffVar) {
        ((sgf) this.b).X.a(fffVar);
    }

    @Override // defpackage.pi0
    public Rect f() {
        z9j z9jVar = (z9j) this.b;
        if (z9jVar.o == null) {
            return null;
        }
        int i = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = z9jVar.o;
            if (i >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i++;
        }
    }

    @Override // defpackage.cff
    public void g(fff fffVar) {
        t09 t09Var = (t09) ((sgf) this.b).X.a.b.getValue();
        xfh.r(t09Var.o, new q09(fffVar.a));
        xfh.r(t09Var.o, p09.a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return ((cm6) ((usd) this.b).b).invoke();
    }

    @Override // defpackage.pi0
    public int getFormat() {
        return ((z9j) this.b).a;
    }

    @Override // defpackage.pi0
    public String h() {
        return ((z9j) this.b).b;
    }

    public void i(int i, boolean z) {
        y16 y16Var = (y16) this.b;
        if (z) {
            y16Var.a(i);
        } else {
            y16Var.getClass();
        }
    }

    public void j(EventItemsMap eventItemsMap) {
        int i = rdg.$EnumSwitchMapping$0[((mdg) ((cm6) ((vgd) this.b).b).invoke()).ordinal()];
        eventItemsMap.set("call_topology", i != 1 ? i != 2 ? "?" : "D" : "S");
    }

    @Override // defpackage.pi0
    public Point[] l() {
        return ((z9j) this.b).o;
    }

    public int m(int i) {
        int i2;
        i7f i7fVar;
        i7f[] i7fVarArr = (i7f[]) this.b;
        int length = i7fVarArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (i7fVar = i7fVarArr[(i2 = (i3 + length) >>> 1)]) != null) {
            int i4 = i7fVar.b;
            int i5 = i7fVar.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = i2 + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    @Override // defpackage.bs8
    public void onError(Throwable th) {
        ((l42) this.b).resumeWith(new ipd(th));
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 3:
                bhd bhdVar = (bhd) this.b;
                z5j.f("In-progress recording shouldn't be null", bhdVar.p != null);
                if (!bhdVar.p.v0) {
                    gri.a("Recorder", "Encodings end with error: " + th);
                    bhdVar.i(bhdVar.B == null ? 8 : 6, th);
                    break;
                }
                break;
        }
    }

    public zkb(Spannable spannable) {
        Object[] spans;
        this.a = 6;
        try {
            spans = spannable.getSpans(0, spannable.length(), yb5.class);
        } catch (Throwable unused) {
            spans = null;
        }
        yb5[] yb5VarArr = (yb5[]) (spans == null ? new yb5[0] : spans);
        this.b = new i7f[yb5VarArr.length];
        int length = yb5VarArr.length;
        for (int i = 0; i < length; i++) {
            ((i7f[]) this.b)[i] = new i7f(spannable.getSpanStart(yb5VarArr[i]), spannable.getSpanEnd(yb5VarArr[i]));
        }
        Arrays.sort((i7f[]) this.b);
    }

    public zkb(View view, int i, int i2) {
        this.a = 13;
        this.b = view;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        animatorSet.setStartDelay(1000);
        animatorSet.setTarget(view);
        ((AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i)).setTarget(view);
        animatorSet.addListener(new w52(3, view));
        View view2 = (View) this.b;
        view2.setPivotX(view2.getMeasuredWidth() * 1.0f);
        view2.setPivotY(1.0f * view2.getMeasuredHeight());
    }

    public zkb(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new ybj();
                break;
            default:
                this.b = new y16(0);
                break;
        }
    }
}
