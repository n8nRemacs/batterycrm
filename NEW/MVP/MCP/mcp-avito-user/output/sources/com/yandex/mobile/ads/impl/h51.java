package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class h51 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ld f385909a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final of f385910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final i51 f385911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final b30 f385912d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final Bitmap f385913e;

    public h51(@Y61.k ld ldVar, @Y61.k of ofVar, @Y61.k i51 i51Var, @Y61.k b30 b30Var, @Y61.k Bitmap bitmap) {
        this.f385909a = ldVar;
        this.f385910b = ofVar;
        this.f385911c = i51Var;
        this.f385912d = b30Var;
        this.f385913e = bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h51 h51Var, RectF rectF, ImageView imageView) {
        c51 c51VarB;
        if (rectF.height() == 0.0f) {
            return;
        }
        ld ldVar = h51Var.f385909a;
        b30 b30Var = h51Var.f385912d;
        ldVar.getClass();
        if (!ld.a(b30Var)) {
            c51 c51VarA = h51Var.f385910b.a(rectF, h51Var.f385912d);
            if (c51VarA != null) {
                h51Var.f385911c.a(imageView, h51Var.f385913e, c51VarA);
                return;
            }
            return;
        }
        ld ldVar2 = h51Var.f385909a;
        b30 b30Var2 = h51Var.f385912d;
        ldVar2.getClass();
        String strA = ld.a(rectF, b30Var2);
        k51 k51VarC = h51Var.f385912d.c();
        if (k51VarC == null || (c51VarB = k51VarC.b()) == null) {
            return;
        }
        if (strA != null) {
            h51Var.f385911c.a(imageView, h51Var.f385913e, c51VarB, strA);
        } else {
            h51Var.f385911c.a(imageView, h51Var.f385913e, c51VarB);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        boolean z12 = (i14 - i12 == i18 - i16 && i15 - i13 == i19 - i17) ? false : true;
        boolean z13 = (i15 == i13 || i12 == i14) ? false : true;
        if (z12 && z13) {
            imageView.post(new H0(this, new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight()), imageView, 3));
        }
    }
}
