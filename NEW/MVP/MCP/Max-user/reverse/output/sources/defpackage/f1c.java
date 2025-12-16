package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class f1c implements v1c {
    public float X;
    public float Y;
    public ValueAnimator Z;
    public final View a;
    public final kce b;
    public final lc1 c;
    public int d;
    public int o;
    public u1c s0 = u1c.e;

    public f1c(View view, kce kceVar, lc1 lc1Var) {
        this.a = view;
        this.b = kceVar;
        this.c = lc1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010 A[PHI: r3
  0x0010: PHI (r3v6 float) = (r3v0 float), (r3v1 float) binds: [B:3:0x000e, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            kce r0 = r6.b
            android.graphics.PointF r0 = r0.t()
            float r1 = r0.x
            u1c r2 = r6.s0
            float r3 = r2.a
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L12
        L10:
            r1 = r3
            goto L19
        L12:
            float r3 = r2.b
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L19
            goto L10
        L19:
            float r3 = r0.y
            float r4 = r2.c
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L23
            r3 = r4
            goto L2a
        L23:
            float r2 = r2.d
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2a
            r3 = r2
        L2a:
            android.animation.ValueAnimator r2 = r6.Z
            if (r2 == 0) goto L31
            r2.end()
        L31:
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x004e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r4 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r4)
            e1c r4 = new e1c
            r4.<init>()
            r2.addUpdateListener(r4)
            r6.Z = r2
            r2.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1c.a():void");
    }

    @Override // defpackage.v1c
    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        kce kceVar = this.b;
        if (action == 0) {
            PointF pointFT = kceVar.t();
            this.d = (int) pointFT.x;
            this.o = (int) pointFT.y;
            this.X = motionEvent.getRawX();
            this.Y = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout()) {
                return false;
            }
        } else {
            if (action2 == 2) {
                float rawX = motionEvent.getRawX() - this.X;
                float f = this.d + rawX;
                float rawY = this.o + (motionEvent.getRawY() - this.Y);
                kceVar.H(f, rawY);
                PointF pointF = ((mc1) this.c).b;
                pointF.x = f;
                pointF.y = rawY;
                return true;
            }
            if (action2 == 3) {
                a();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.v1c
    public final void c(float f, float f2) {
        this.b.H(f, f2);
        PointF pointF = ((mc1) this.c).b;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.v1c
    public final void t(float f, float f2, int i, int i2, j1c j1cVar) {
        this.s0 = am3.b(this.a.getContext(), f, f2, i, i2, j1cVar);
    }
}
