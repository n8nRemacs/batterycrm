package com.avito.beduin.v2.render.android_view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/g;", "Lcom/avito/beduin/v2/render/android_view/I;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36337g implements I {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.component.I f337992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N f337993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public K f337994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36249i f337995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f337996f;

    /* compiled from: BeduinView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/render/android_view/g$a", "Lcom/avito/beduin/v2/engine/component/H;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.render.android_view.g$a */
    public static final class a implements com.avito.beduin.v2.engine.component.H {
        public a() {
        }

        @Override // com.avito.beduin.v2.engine.component.H
        public final void a(@Y61.k InterfaceC36249i interfaceC36249i) {
            C36337g.this.c(interfaceC36249i.getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36337g(Y41.l<Object, G0> lVar, InterfaceC36249i interfaceC36249i, View view) {
        this.f337995e = interfaceC36249i;
        this.f337996f = view;
        this.f337993c = (N) lVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.I
    public final void a() {
        this.f337993c = null;
        K k12 = this.f337994d;
        if (k12 != null) {
            k12.a();
        }
        this.f337994d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.beduin.v2.engine.component.InterfaceC36247g
            r1 = 0
            if (r0 == 0) goto L8
            com.avito.beduin.v2.engine.component.g r10 = (com.avito.beduin.v2.engine.component.InterfaceC36247g) r10
            goto L9
        L8:
            r10 = r1
        L9:
            if (r10 == 0) goto L10
            Y41.a r0 = r10.b()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L26
            if (r10 == 0) goto L1a
            Y41.a r0 = r10.d()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L1e
            goto L26
        L1e:
            com.avito.beduin.v2.render.android_view.K r10 = r9.f337994d
            if (r10 == 0) goto L7b
            r10.a()
            goto L7b
        L26:
            com.avito.beduin.v2.render.android_view.K r0 = r9.f337994d
            if (r0 == 0) goto L5e
            if (r10 == 0) goto L31
            Y41.a r2 = r10.b()
            goto L32
        L31:
            r2 = r1
        L32:
            if (r10 == 0) goto L38
            Y41.a r1 = r10.d()
        L38:
            android.view.View r10 = r0.f337927a
            android.view.View r3 = r9.f337996f
            boolean r10 = kotlin.jvm.internal.L.f(r10, r3)
            if (r10 == 0) goto L52
            Y41.a<kotlin.G0> r10 = r0.f337928b
            boolean r10 = kotlin.jvm.internal.L.f(r10, r2)
            if (r10 == 0) goto L52
            Y41.a<kotlin.G0> r10 = r0.f337929c
            boolean r10 = kotlin.jvm.internal.L.f(r10, r1)
            if (r10 != 0) goto L7a
        L52:
            r0.a()
            com.avito.beduin.v2.render.android_view.K r10 = new com.avito.beduin.v2.render.android_view.K
            boolean r0 = r0.f337930d
            r10.<init>(r3, r2, r1, r0)
            r1 = r10
            goto L7b
        L5e:
            com.avito.beduin.v2.render.android_view.K r0 = new com.avito.beduin.v2.render.android_view.K
            if (r10 == 0) goto L68
            Y41.a r2 = r10.b()
            r4 = r2
            goto L69
        L68:
            r4 = r1
        L69:
            if (r10 == 0) goto L6f
            Y41.a r1 = r10.d()
        L6f:
            r5 = r1
            android.view.View r3 = r9.f337996f
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L7a:
            r1 = r0
        L7b:
            r9.f337994d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.render.android_view.C36337g.b(java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void c(Object obj) {
        try {
            RU0.b bVar = RU0.b.f14467a;
            InterfaceC36249i interfaceC36249i = this.f337995e;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (RU0.b.f14469c <= 0) {
                RU0.b.f14468b.f(RU0.b.f14470d + ":Component", "Bind: " + interfaceC36249i.getF336566c());
            }
            b(obj);
            ?? r22 = this.f337993c;
            if (r22 != 0) {
                r22.invoke(obj);
            }
        } catch (ClassCastException e12) {
            RU0.b bVar2 = RU0.b.f14467a;
            LogLevel[] logLevelArr2 = LogLevel.f337864b;
            bVar2.getClass();
            if (2 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":BeduinView");
                String message = e12.getMessage();
                cVar.b(strS, message != null ? message : "");
            }
        } catch (NullPointerException e13) {
            RU0.b bVar3 = RU0.b.f14467a;
            LogLevel[] logLevelArr3 = LogLevel.f337864b;
            bVar3.getClass();
            if (2 >= RU0.b.f14469c) {
                RU0.c cVar2 = RU0.b.f14468b;
                String strS2 = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":BeduinView");
                String message2 = e13.getMessage();
                cVar2.b(strS2, message2 != null ? message2 : "");
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        J0 j0O;
        Window window;
        com.avito.beduin.v2.engine.component.I i12 = this.f337992b;
        if (i12 != null) {
            i12.a();
        }
        a aVar = new a();
        InterfaceC36249i interfaceC36249i = this.f337995e;
        this.f337992b = interfaceC36249i.n(aVar);
        c(interfaceC36249i.getState());
        K k12 = this.f337994d;
        if (k12 == null || k12.f337933g) {
            return;
        }
        k12.f337933g = true;
        View view2 = k12.f337927a;
        WindowManager windowManager = (WindowManager) view2.getContext().getSystemService("window");
        int i13 = Build.VERSION.SDK_INT;
        Rect rect = k12.f337934h;
        if (i13 >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Rect bounds = currentWindowMetrics.getBounds();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            rect.set(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, bounds.width() - insetsIgnoringVisibility.right, bounds.height() - insetsIgnoringVisibility.bottom);
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            Context context = view2.getContext();
            C22771k c22771kF = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            if (decorView != null && (j0O = C22823h0.o(decorView)) != null) {
                c22771kF = j0O.f(131);
            }
            rect.set(c22771kF != null ? c22771kF.f44775a : 0, c22771kF != null ? c22771kF.f44776b : 0, point.x, point.y);
        }
        view2.post(new J(k12, 0));
        if (view2.getViewTreeObserver().isAlive()) {
            view2.getViewTreeObserver().addOnScrollChangedListener(k12.f337932f);
        }
        view2.addOnLayoutChangeListener(k12.f337931e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        com.avito.beduin.v2.engine.component.I i12 = this.f337992b;
        if (i12 != null) {
            i12.a();
        }
        this.f337992b = null;
        K k12 = this.f337994d;
        if (k12 != null) {
            k12.a();
            k12.b(false);
        }
    }
}
