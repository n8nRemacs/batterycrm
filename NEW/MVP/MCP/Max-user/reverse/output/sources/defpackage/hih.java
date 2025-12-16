package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class hih implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ dy a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public hih(dy dyVar, View view, View view2) {
        this.a = dyVar;
        this.b = view;
        this.c = view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[PHI: r3
  0x005f: PHI (r3v8 android.view.View) = (r3v7 android.view.View), (r3v13 android.view.View) binds: [B:16:0x0039, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            r9 = this;
            dy r0 = r9.a
            java.lang.Object r1 = r0.X
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r0.b
            java.lang.Object r3 = r0.Y
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L30
            int r7 = r3.getId()
            if (r7 != r2) goto L2a
            boolean r7 = r3.isAttachedToWindow()
            if (r7 == 0) goto L2a
            int r7 = r3.getVisibility()
            if (r7 != 0) goto L2a
            goto L2b
        L2a:
            r3 = r5
        L2b:
            if (r3 != 0) goto L2e
            goto L30
        L2e:
            r7 = r6
            goto L39
        L30:
            java.lang.Object r3 = r0.Y
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r3.clear()
            r7 = r4
            r3 = r5
        L39:
            if (r3 != 0) goto L5f
            android.view.View r3 = r9.b
            if (r3 == 0) goto L45
            android.view.View r3 = r3.findViewById(r2)
            if (r3 != 0) goto L4f
        L45:
            android.view.View r3 = r9.c
            android.view.View r3 = r3.getRootView()
            android.view.View r3 = r3.findViewById(r2)
        L4f:
            if (r3 == 0) goto L60
            java.lang.Class r2 = r3.getClass()
            java.lang.Object r8 = r0.d
            java.lang.Class r8 = (java.lang.Class) r8
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L60
        L5f:
            r5 = r3
        L60:
            if (r5 == 0) goto L9a
            if (r7 == 0) goto L7c
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r5)
            r0.Y = r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L7c
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L7c
            r2.requestDisallowInterceptTouchEvent(r4)
        L7c:
            r0.c = r4
            java.lang.Object r0 = r0.o
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            defpackage.shh.d(r0, r5)
            java.util.Iterator r1 = r1.iterator()
        L89:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r1.next()
            eih r2 = (defpackage.eih) r2
            r2.c(r0, r5)
            goto L89
        L99:
            return r4
        L9a:
            boolean r2 = r0.c
            if (r2 == 0) goto Lb4
            r0.c = r6
            java.util.Iterator r0 = r1.iterator()
        La4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = r0.next()
            eih r1 = (defpackage.eih) r1
            r1.a()
            goto La4
        Lb4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hih.onPreDraw():boolean");
    }
}
