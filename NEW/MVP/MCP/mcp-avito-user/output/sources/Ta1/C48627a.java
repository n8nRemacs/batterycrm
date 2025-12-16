package ta1;

import Y41.l;
import android.graphics.Bitmap;
import kotlin.jvm.internal.N;

/* renamed from: ta1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48627a extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48629c f439275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f439276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48627a(C48629c c48629c, Bitmap bitmap) {
        super(1);
        this.f439275l = c48629c;
        this.f439276m = bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = kotlin.collections.C42745f0.G(r9)
            TZ0.a r9 = (TZ0.a) r9
            android.graphics.Bitmap r0 = r8.f439276m
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            ta1.c r2 = r8.f439275l
            r2.getClass()
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L69
            android.util.SparseArray r9 = r9.f15713j
            java.lang.Object r9 = r9.get(r4)
            TZ0.b r9 = (TZ0.b) r9
            if (r9 != 0) goto L26
            goto L69
        L26:
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            java.util.ArrayList r9 = r9.f15715b
            java.lang.Object r6 = r9.get(r3)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r6 = r6.x
            java.lang.Object r7 = r9.get(r3)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            float r7 = r7.y
            r5.moveTo(r6, r7)
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r9.next()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r7 = r6.x
            float r6 = r6.y
            r5.lineTo(r7, r6)
            goto L44
        L58:
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            r5.computeBounds(r9, r4)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r9.roundOut(r5)
            goto L6a
        L69:
            r5 = 0
        L6a:
            if (r5 != 0) goto L6d
            goto L87
        L6d:
            r9 = 5
            int r9 = H91.c.a(r9)
            int r6 = r5.left
            int r6 = r6 - r9
            if (r6 < 0) goto L87
            int r6 = r5.top
            int r6 = r6 - r9
            if (r6 < 0) goto L87
            int r6 = r5.right
            int r6 = r6 + r9
            if (r6 > r1) goto L87
            int r1 = r5.bottom
            int r1 = r1 + r9
            if (r1 > r0) goto L87
            goto L88
        L87:
            r4 = r3
        L88:
            java.lang.Boolean r9 = r2.f439284g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r9 = kotlin.jvm.internal.L.f(r9, r0)
            if (r9 != 0) goto L9d
            ta1.d r9 = r2.f439279b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r9.invoke(r0)
        L9d:
            r2.f439283f = r3
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            r2.f439284g = r9
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ta1.C48627a.invoke(java.lang.Object):java.lang.Object");
    }
}
