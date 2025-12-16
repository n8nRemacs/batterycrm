package androidx.compose.ui.platform;

import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final ViewGroup.LayoutParams f41378a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    @Y61.k
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.H a(@Y61.k androidx.compose.ui.platform.AbstractC22450a r10, @Y61.k androidx.compose.runtime.I r11, @Y61.k androidx.compose.runtime.internal.C22096n r12) {
        /*
            androidx.compose.ui.platform.l1 r0 = androidx.compose.ui.platform.C22496l1.f41488a
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.C22496l1.f41489b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L52
            r0 = 6
            kotlinx.coroutines.channels.m r0 = kotlinx.coroutines.channels.A.a(r2, r3, r3, r0)
            androidx.compose.ui.platform.g0$c r2 = androidx.compose.ui.platform.C22475g0.f41448m
            r2.getClass()
            kotlin.C<kotlin.coroutines.CoroutineContext> r2 = androidx.compose.ui.platform.C22475g0.f41449n
            java.lang.Object r2 = r2.getValue()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlinx.coroutines.internal.h r2 = kotlinx.coroutines.U.a(r2)
            androidx.compose.ui.platform.j1 r4 = new androidx.compose.ui.platform.j1
            r4.<init>(r0, r3)
            r5 = 3
            kotlinx.coroutines.C43259k.d(r2, r3, r3, r4, r5)
            androidx.compose.runtime.snapshots.l$a r2 = androidx.compose.runtime.snapshots.AbstractC22167l.f38720e
            androidx.compose.ui.platform.k1 r4 = new androidx.compose.ui.platform.k1
            r4.<init>(r0)
            r2.getClass()
            java.lang.Object r0 = androidx.compose.runtime.snapshots.C22176v.f38750c
            monitor-enter(r0)
            java.lang.Object r2 = androidx.compose.runtime.snapshots.C22176v.f38756i     // Catch: java.lang.Throwable -> L4f
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r2 = kotlin.collections.C42745f0.i0(r4, r2)     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.snapshots.C22176v.f38756i = r2     // Catch: java.lang.Throwable -> L4f
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            Y41.l<androidx.compose.runtime.snapshots.t, kotlin.G0> r0 = androidx.compose.runtime.snapshots.C22176v.f38748a
            androidx.compose.runtime.snapshots.C22176v.e(r0)
            goto L52
        L4f:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L52:
            int r0 = r10.getChildCount()
            if (r0 <= 0) goto L65
            android.view.View r0 = r10.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L63
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L69
        L63:
            r0 = r3
            goto L69
        L65:
            r10.removeAllViews()
            goto L63
        L69:
            if (r0 != 0) goto L81
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r10.getContext()
            kotlin.coroutines.CoroutineContext r2 = r11.getF38130w()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = androidx.compose.ui.platform.a3.f41378a
            r10.addView(r1, r2)
        L81:
            Y41.l<androidx.compose.ui.platform.y1, kotlin.G0> r10 = androidx.compose.ui.platform.C22535v1.f41625a
            android.view.View r10 = r0.getView()
            r1 = 2131373600(0x7f0a2e20, float:1.8367296E38)
            java.lang.Object r10 = r10.getTag(r1)
            boolean r2 = r10 instanceof androidx.compose.ui.platform.Y2
            if (r2 == 0) goto L95
            r3 = r10
            androidx.compose.ui.platform.Y2 r3 = (androidx.compose.ui.platform.Y2) r3
        L95:
            if (r3 != 0) goto Lb8
            androidx.compose.ui.platform.Y2 r3 = new androidx.compose.ui.platform.Y2
            androidx.compose.ui.node.b1 r6 = new androidx.compose.ui.node.b1
            androidx.compose.ui.node.LayoutNode r10 = r0.getRoot()
            r6.<init>(r10)
            java.lang.Object r10 = androidx.compose.runtime.N.f38052a
            androidx.compose.runtime.M r10 = new androidx.compose.runtime.M
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r3.<init>(r0, r10)
            android.view.View r10 = r0.getView()
            r10.setTag(r1, r3)
        Lb8:
            r3.z7(r12)
            kotlin.coroutines.CoroutineContext r10 = r0.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r12 = r11.getF38130w()
            boolean r10 = kotlin.jvm.internal.L.f(r10, r12)
            if (r10 != 0) goto Ld0
            kotlin.coroutines.CoroutineContext r10 = r11.getF38130w()
            r0.setCoroutineContext(r10)
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a3.a(androidx.compose.ui.platform.a, androidx.compose.runtime.I, androidx.compose.runtime.internal.n):androidx.compose.runtime.H");
    }
}
