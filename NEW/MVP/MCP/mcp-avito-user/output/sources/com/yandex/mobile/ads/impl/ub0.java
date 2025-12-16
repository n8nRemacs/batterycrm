package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes8.dex */
public final class ub0 implements fb<rd0>, rp<rd0> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final j30 f390510a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final vd0 f390511b;

    public ub0(@j.P j30 j30Var, @j.P vd0 vd0Var) {
        this.f390510a = j30Var;
        this.f390511b = vd0Var;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean a(@j.N rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        j30 j30Var = this.f390510a;
        List<b30> listA = rd0Var2.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        View viewA = a((bj1) j30Var);
        boolean z12 = (viewA == null || b30Var == null || !j30Var.a(viewA, b30Var)) ? false : true;
        vd0 vd0Var = this.f390511b;
        View viewA2 = a((bj1) vd0Var);
        return z12 || (viewA2 != null && vd0Var.a((vd0) viewA2, (View) rd0Var2));
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void b(@j.N rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        List<b30> listA = rd0Var2.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        ImageView imageView = (ImageView) a((bj1) this.f390510a);
        if (imageView != null && b30Var != null) {
            this.f390510a.b(imageView, b30Var);
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((bj1) this.f390511b);
        if (customizableMediaView != null) {
            this.f390511b.a(rd0Var2);
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void c(@j.N rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        List<b30> listA = rd0Var2.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        ImageView imageView = (ImageView) a((bj1) this.f390510a);
        if (imageView != null && b30Var != null) {
            this.f390510a.b(imageView, b30Var);
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((bj1) this.f390511b);
        if (customizableMediaView != null) {
            this.f390511b.b(customizableMediaView, rd0Var2);
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean d() {
        vd0 vd0Var = this.f390511b;
        boolean z12 = vd0Var != null && rj1.a(vd0Var.b(), 100);
        j30 j30Var = this.f390510a;
        return z12 || (j30Var != null && rj1.a(j30Var.b(), 100));
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void destroy() {
        vd0 vd0Var = this.f390511b;
        if (vd0Var != null) {
            vd0Var.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    @Override // com.yandex.mobile.ads.impl.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.vd0 r0 = r5.f390511b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            android.view.View r0 = r0.b()
            if (r0 == 0) goto L21
            boolean r3 = com.yandex.mobile.ads.impl.rj1.d(r0)
            if (r3 != 0) goto L21
            int r3 = r0.getHeight()
            int r0 = r0.getWidth()
            if (r0 < r2) goto L21
            if (r3 >= r2) goto L1f
            goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            com.yandex.mobile.ads.impl.j30 r3 = r5.f390510a
            if (r3 == 0) goto L41
            android.view.View r3 = r3.b()
            if (r3 == 0) goto L41
            boolean r4 = com.yandex.mobile.ads.impl.rj1.d(r3)
            if (r4 != 0) goto L41
            int r4 = r3.getHeight()
            int r3 = r3.getWidth()
            if (r3 < r2) goto L41
            if (r4 >= r2) goto L3f
            goto L41
        L3f:
            r3 = r2
            goto L42
        L41:
            r3 = r1
        L42:
            if (r0 != 0) goto L46
            if (r3 == 0) goto L47
        L46:
            r1 = r2
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ub0.e():boolean");
    }

    @j.P
    public final int f() {
        vd0 vd0Var = this.f390511b;
        return vd0Var != null ? vd0Var.c() : this.f390510a != null ? 4 : 0;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void a() {
        ImageView imageView = (ImageView) a((bj1) this.f390510a);
        if (imageView != null) {
            this.f390510a.a(imageView);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((bj1) this.f390511b);
        if (customizableMediaView != null) {
            this.f390511b.a((vd0) customizableMediaView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean b() {
        vd0 vd0Var = this.f390511b;
        boolean z12 = (vd0Var == null || vd0Var.b() == null) ? false : true;
        j30 j30Var = this.f390510a;
        return z12 || (j30Var != null && j30Var.b() != null);
    }

    @Override // com.yandex.mobile.ads.impl.fb
    @j.P
    public final hj1 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((bj1) this.f390511b);
        ImageView imageView = (ImageView) a((bj1) this.f390510a);
        if (customizableMediaView != null) {
            return new hj1(customizableMediaView);
        }
        if (imageView != null) {
            return new hj1(imageView);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void a(@j.N eb<rd0> ebVar, @j.N ej1 ej1Var) {
        rd0 rd0VarD = ebVar.d();
        j30 j30Var = this.f390510a;
        if (j30Var != null) {
            List<b30> listA = rd0VarD.a();
            j30Var.a(ebVar, ej1Var, (listA == null || listA.isEmpty()) ? null : listA.get(0));
        }
        vd0 vd0Var = this.f390511b;
        if (vd0Var != null) {
            vd0Var.a(ebVar, ej1Var, rd0VarD);
        }
    }

    @j.P
    private static View a(@j.P bj1 bj1Var) {
        if (bj1Var != null) {
            return bj1Var.b();
        }
        return null;
    }
}
