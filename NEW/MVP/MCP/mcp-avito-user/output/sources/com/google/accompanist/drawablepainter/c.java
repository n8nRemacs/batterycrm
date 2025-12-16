package com.google.accompanist.drawablepainter;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.n;
import l0.o;

/* compiled from: DrawablePainter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"drawablepainter_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f342877a = C42727D.b(LazyThreadSafetyMode.f406616d, a.f342878l);

    /* compiled from: DrawablePainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f342878l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return o.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        n.f413402b.getClass();
        return n.f413403c;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.painter.e b(@Y61.l android.graphics.drawable.Drawable r3, @Y61.l androidx.compose.runtime.A r4) {
        /*
            r0 = 1756822313(0x68b6fb29, float:6.9128303E24)
            r4.I(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.I(r0)
            boolean r0 = r4.B(r3)
            java.lang.Object r1 = r4.t()
            if (r0 != 0) goto L1f
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L48
        L1f:
            if (r3 != 0) goto L25
            com.google.accompanist.drawablepainter.d r3 = com.google.accompanist.drawablepainter.d.f342879g
            r1 = r3
            goto L45
        L25:
            boolean r0 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L3b
            androidx.compose.ui.graphics.painter.d r0 = new androidx.compose.ui.graphics.painter.d
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r3 = r3.getColor()
            long r1 = androidx.compose.ui.graphics.V.b(r3)
            r3 = 0
            r0.<init>(r1, r3)
        L39:
            r1 = r0
            goto L45
        L3b:
            com.google.accompanist.drawablepainter.a r0 = new com.google.accompanist.drawablepainter.a
            android.graphics.drawable.Drawable r3 = r3.mutate()
            r0.<init>(r3)
            goto L39
        L45:
            r4.H(r1)
        L48:
            r4.O()
            androidx.compose.ui.graphics.painter.e r1 = (androidx.compose.ui.graphics.painter.e) r1
            r4.O()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.drawablepainter.c.b(android.graphics.drawable.Drawable, androidx.compose.runtime.A):androidx.compose.ui.graphics.painter.e");
    }
}
