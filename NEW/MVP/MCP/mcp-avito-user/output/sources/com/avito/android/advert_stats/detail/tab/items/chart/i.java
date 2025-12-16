package com.avito.android.advert_stats.detail.tab.items.chart;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: StatsBarItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/i;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f86307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f86308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f86309c;

    public i(j jVar, float f12, boolean z12) {
        this.f86307a = jVar;
        this.f86308b = f12;
        this.f86309c = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @Y61.k
    public final Shader resize(int i12, int i13) {
        Q q12;
        float f12 = this.f86308b;
        Float fValueOf = Float.valueOf(0.0f);
        j jVar = this.f86307a;
        if (f12 == 1.0f) {
            int i14 = j.f86310p;
            jVar.getClass();
            q12 = new Q(fValueOf, fValueOf);
        } else {
            float f13 = i13;
            float f14 = f12 * f13;
            q12 = new Q(Float.valueOf(Math.max(f14 - jVar.f86323n, 0.0f)), Float.valueOf(Math.min(f14 + jVar.f86324o, f13)));
        }
        float fFloatValue = ((Number) q12.f406619b).floatValue();
        float fFloatValue2 = ((Number) q12.f406620c).floatValue();
        boolean z12 = this.f86309c;
        return new LinearGradient(0.0f, fFloatValue, 0.0f, fFloatValue2, C35835l0.d(z12 ? jVar.f86319j : jVar.f86320k, jVar.f86311b.getContext()), C35835l0.d(z12 ? jVar.f86321l : jVar.f86322m, jVar.f86311b.getContext()), Shader.TileMode.CLAMP);
    }
}
