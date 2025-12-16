package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qz1 implements tz1 {
    public final /* synthetic */ sz1 a;

    public qz1(sz1 sz1Var) {
        this.a = sz1Var;
    }

    @Override // defpackage.tz1
    public final ha8 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((tz1) it.next()).a(totalCaptureResult));
        }
        s98 s98VarC = wsf.c(arrayList);
        lz1 lz1Var = new lz1(2);
        return wsf.l(s98VarC, new usd(19, lz1Var), ayi.a());
    }

    @Override // defpackage.tz1
    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((tz1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tz1
    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((tz1) it.next()).c();
        }
    }
}
