package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class n6c extends cqi {
    public int a;
    public final /* synthetic */ o6c b;

    public n6c(o6c o6cVar) {
        this.b = o6cVar;
    }

    @Override // defpackage.cqi
    public final int d(View view, int i) {
        int iE;
        Integer numValueOf;
        int iA;
        o6c o6cVar = this.b;
        Integer numValueOf2 = null;
        if (o6cVar.getStackFromBottom()) {
            i6c callback = o6cVar.getCallback();
            if (callback != null) {
                iE = callback.a();
                numValueOf = Integer.valueOf(iE);
            }
            numValueOf = null;
        } else {
            i6c callback2 = o6cVar.getCallback();
            if (callback2 != null) {
                iE = callback2.e();
                numValueOf = Integer.valueOf(iE);
            }
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        boolean stackFromBottom = o6cVar.getStackFromBottom();
        i6c callback3 = o6cVar.getCallback();
        if (stackFromBottom) {
            if (callback3 != null) {
                iA = callback3.e();
                numValueOf2 = Integer.valueOf(iA);
            }
        } else if (callback3 != null) {
            iA = callback3.a();
            numValueOf2 = Integer.valueOf(iA);
        }
        return n7j.c(i, iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    @Override // defpackage.cqi
    public final int f(int i) {
        Object ipdVar;
        View viewF;
        o6c o6cVar = this.b;
        try {
            i6c callback = o6cVar.getCallback();
            ipdVar = (callback == null || (viewF = callback.f()) == null) ? null : Integer.valueOf(o6cVar.indexOfChild(viewF));
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e("PopupLayout", "getOrderedChildIndex fail, issue ONEME-9645", thA);
        }
        Integer num = (Integer) (ipdVar instanceof ipd ? null : ipdVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.cqi
    public final int h(View view) {
        return view.getHeight();
    }

    @Override // defpackage.cqi
    public final void k(View view, int i, int i2) {
        float f;
        int i3;
        o6c o6cVar = this.b;
        o6cVar.getHalfExpandedViewHelper().a(i2);
        i6c callback = o6cVar.getCallback();
        if (callback == null) {
            return;
        }
        if (o6cVar.s0.a == 2 && o6cVar.getScrollState() == m6c.a) {
            int iE = callback.e();
            if (o6cVar.getStackFromBottom()) {
                int i4 = this.a;
                f = i2 - i4;
                i3 = iE - i4;
            } else {
                int i5 = this.a;
                f = i5 - i2;
                i3 = i5 - iE;
            }
            o6cVar.setBackgroundAlpha(1 - Math.abs(f / i3));
            if (o6cVar.getStackFromBottom() && i2 >= iE) {
                callback.h();
            }
            if (!o6cVar.getStackFromBottom() && i2 <= iE) {
                callback.h();
            }
        }
        callback.m(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // defpackage.cqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6c.l(android.view.View, float, float):void");
    }

    @Override // defpackage.cqi
    public final boolean n(View view, int i) {
        o6c o6cVar = this.b;
        i6c callback = o6cVar.getCallback();
        return view == (callback != null ? callback.f() : null) && o6cVar.d;
    }
}
