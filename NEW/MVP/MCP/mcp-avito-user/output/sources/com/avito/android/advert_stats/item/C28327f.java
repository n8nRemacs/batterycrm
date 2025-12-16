package com.avito.android.advert_stats.item;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: BarItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/f;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28327f extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C28328g f86749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f86750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f86751c;

    public C28327f(C28328g c28328g, float f12, boolean z12) {
        this.f86749a = c28328g;
        this.f86750b = f12;
        this.f86751c = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @Y61.k
    public final Shader resize(int i12, int i13) {
        kotlin.Q q12;
        float f12 = this.f86750b;
        Float fValueOf = Float.valueOf(0.0f);
        C28328g c28328g = this.f86749a;
        if (f12 == 1.0f) {
            int i14 = C28328g.f86752o;
            c28328g.getClass();
            q12 = new kotlin.Q(fValueOf, fValueOf);
        } else {
            float f13 = i13;
            float f14 = f12 * f13;
            q12 = new kotlin.Q(Float.valueOf(Math.max(f14 - c28328g.f86764m, 0.0f)), Float.valueOf(Math.min(f14 + c28328g.f86765n, f13)));
        }
        float fFloatValue = ((Number) q12.f406619b).floatValue();
        float fFloatValue2 = ((Number) q12.f406620c).floatValue();
        boolean z12 = this.f86751c;
        return new LinearGradient(0.0f, fFloatValue, 0.0f, fFloatValue2, C35835l0.d(z12 ? c28328g.f86760i : c28328g.f86761j, c28328g.f86753b.getContext()), C35835l0.d(z12 ? c28328g.f86762k : c28328g.f86763l, c28328g.f86753b.getContext()), Shader.TileMode.CLAMP);
    }
}
