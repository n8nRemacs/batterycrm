package com.avito.android.universal_map.map.common.marker;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClusterRadiusCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/d;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: ClusterRadiusCalculator.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Y61.l
        public static Float a(@Y61.k d dVar, int i12, double d12, float f12) {
            float fPow = (float) Math.pow(dVar.e(f12), dVar.getF304972a());
            Float fValueOf = Float.valueOf(fPow);
            if (fPow == 0.0f) {
                fValueOf = null;
            }
            float fCos = (i12 * ((float) ((Math.cos((d12 * 3.141592653589793d) / 180) * 156543.03392d) / Math.pow(2.0d, f12)))) / (fValueOf != null ? fValueOf.floatValue() : 1.0E-4f);
            if (fCos > dVar.getF304974c()) {
                return Float.valueOf(fCos);
            }
            return null;
        }

        public static float b(@Y61.k d dVar, float f12) {
            float f13 = 1;
            return f13 / (((float) Math.exp((f12 - ((dVar.getF304976e() + dVar.getF304975d()) / 2)) * dVar.getF304973b())) + f13);
        }
    }

    @Y61.l
    Float a(int i12, double d12, float f12);

    /* renamed from: b */
    float getF304976e();

    /* renamed from: c */
    float getF304972a();

    /* renamed from: d */
    float getF304973b();

    float e(float f12);

    /* renamed from: f */
    float getF304974c();

    /* renamed from: g */
    float getF304975d();
}
