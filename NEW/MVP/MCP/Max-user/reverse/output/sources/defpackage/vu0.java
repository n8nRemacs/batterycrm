package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException;

/* loaded from: classes.dex */
public final /* synthetic */ class vu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vu0(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int iIntValue;
        boolean z;
        switch (this.a) {
            case 0:
                xu0 xu0Var = (xu0) this.d;
                int i = this.b;
                int i2 = this.c;
                while (true) {
                    int i3 = xu0Var.j;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    l16 l16Var = xu0Var.i;
                    int i4 = xu0Var.e;
                    l16Var.getClass();
                    to7 to7VarH = n7j.h(0, i4);
                    ArrayList arrayList = new ArrayList(we3.q(to7VarH, 10));
                    Iterator it = to7VarH.iterator();
                    while (((so7) it).c) {
                        arrayList.add(Integer.valueOf(l16Var.d(((so7) it).nextInt() + i3)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (xu0Var.l.contains(Integer.valueOf(((Number) next).intValue()))) {
                            arrayList2.add(next);
                        }
                    }
                    Set setH0 = ue3.h0(arrayList2);
                    ArrayDeque arrayDeque = new ArrayDeque(gke.e(xu0Var.f.keySet(), setH0));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        if (xu0Var.f.get(Integer.valueOf(iIntValue2)) == null) {
                            int i5 = xu0Var.j;
                            if (i5 == -1 || setH0.contains(Integer.valueOf(i5))) {
                                Integer num = (Integer) arrayDeque.pollFirst();
                                int iIntValue3 = num != null ? num.intValue() : -1;
                                wu0 wu0Var = (wu0) xu0Var.f.get(Integer.valueOf(iIntValue3));
                                vc3 vc3VarW = wu0Var != null ? wu0Var.a.w() : null;
                                if (vc3VarW == null) {
                                    r2c r2cVar = xu0Var.a;
                                    r2cVar.getClass();
                                    vc3 vc3VarC = r2cVar.c(i, i2, Bitmap.Config.ARGB_8888);
                                    wu0Var = new wu0((qk4) vc3VarC);
                                    vc3VarW = vc3VarC.clone();
                                }
                                wu0Var.b = true;
                                try {
                                    xu0Var.f(iIntValue2, vc3VarW);
                                    vc3VarW.close();
                                    xu0Var.f.remove(Integer.valueOf(iIntValue3));
                                    wu0Var.b = false;
                                    xu0Var.f.put(Integer.valueOf(iIntValue2), wu0Var);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        r4j.a(vc3VarW, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        iIntValue = (int) (xu0Var.e * 0.5f);
                    } else {
                        int size = arrayList2.size();
                        iIntValue = ((Number) arrayList2.get(n7j.c((int) (size * 0.5f), 0, size - 1))).intValue();
                    }
                    xu0Var.g = iIntValue;
                    xu0Var.h = false;
                    return;
                    break;
                }
                break;
            case 1:
                mj6 mj6Var = (mj6) this.d;
                int i6 = this.b;
                int i7 = this.c;
                if (mj6Var.s0 && mj6Var.t0 && mj6Var.X != null) {
                    try {
                        mj6Var.X.changeCaptureFormat(i6, i7, 0);
                        return;
                    } catch (Throwable th3) {
                        mj6Var.c.reportException("FrameCapturerImpl", "", new ScreenShareException("Error change capture format", th3));
                        return;
                    }
                }
                return;
            case 2:
                ((f7a) ((h08) this.d).b).e.l(this.b, this.c);
                return;
            case 3:
                q2e q2eVar = (q2e) this.d;
                int i8 = this.b;
                int i9 = this.c;
                mj6 mj6Var2 = q2eVar.d;
                if (mj6Var2 != null) {
                    mj6Var2.a(i8, i9);
                    return;
                }
                return;
            case 4:
                ((s2f) ((v32) this.d).c).d.l(this.b, this.c);
                return;
            case 5:
                dsf dsfVar = (dsf) this.d;
                int i10 = this.b;
                int i11 = this.c;
                boolean z2 = true;
                if (dsfVar.i != i10) {
                    dsfVar.i = i10;
                    z = true;
                } else {
                    z = false;
                }
                if (dsfVar.h != i11) {
                    dsfVar.h = i11;
                } else {
                    z2 = z;
                }
                if (z2) {
                    dsfVar.f();
                    return;
                }
                return;
            case 6:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                return;
            case 7:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                return;
            default:
                TextureViewRenderer.updateFrameDimensionsAndReportEvents$lambda$8((TextureViewRenderer) this.d, this.b, this.c);
                return;
        }
    }
}
