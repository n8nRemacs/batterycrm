package com.avito.android.lib.design.gradient;

import Y61.k;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ManualLinearGradientDrawableFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/gradient/d;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f179267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f179268c;

    public d(int i12, float[] fArr, int[] iArr) {
        this.f179266a = i12;
        this.f179267b = iArr;
        this.f179268c = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @k
    public final Shader resize(int i12, int i13) {
        Q<PointF, PointF> qA2 = c.a(this.f179266a, i12, i13);
        PointF pointF = qA2.f406619b;
        PointF pointF2 = qA2.f406620c;
        return new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.f179267b, this.f179268c, Shader.TileMode.CLAMP);
    }
}
