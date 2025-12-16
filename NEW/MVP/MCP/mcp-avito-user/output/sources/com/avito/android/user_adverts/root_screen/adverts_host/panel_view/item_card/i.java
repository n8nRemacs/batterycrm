package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;

/* compiled from: PanelCardItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/i;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f313729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f313730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f313731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f313732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f313733e;

    public i(float f12, float[] fArr, Matrix matrix, float f13, int[] iArr) {
        this.f313729a = f12;
        this.f313730b = fArr;
        this.f313731c = matrix;
        this.f313732d = f13;
        this.f313733e = iArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @Y61.k
    public final Shader resize(int i12, int i13) {
        float f12 = i12;
        float f13 = i13;
        float f14 = this.f313729a;
        float fAbs = Math.abs(((float) Math.cos(f14)) * f12);
        float fAbs2 = Math.abs(((float) Math.sin(f14)) * f13);
        float[] fArr = this.f313730b;
        float f15 = fAbs * fArr[0];
        float f16 = fAbs * fArr[1];
        Matrix matrix = this.f313731c;
        matrix.reset();
        matrix.postRotate(this.f313732d, f12 / 2.0f, f13 / 2.0f);
        LinearGradient linearGradient = new LinearGradient(f15, 0.0f, f16, fAbs2, this.f313733e, (float[]) null, Shader.TileMode.CLAMP);
        linearGradient.setLocalMatrix(matrix);
        return linearGradient;
    }
}
