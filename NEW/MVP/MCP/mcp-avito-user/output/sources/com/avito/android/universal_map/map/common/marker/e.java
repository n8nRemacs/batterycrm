package com.avito.android.universal_map.map.common.marker;

import com.avito.android.universal_map.map.common.marker.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClusterRadiusCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/e;", "Lcom/avito/android/universal_map/map/common/marker/d;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f304972a;

    /* renamed from: b, reason: collision with root package name */
    public final float f304973b;

    /* renamed from: c, reason: collision with root package name */
    public final float f304974c;

    /* renamed from: d, reason: collision with root package name */
    public final float f304975d;

    /* renamed from: e, reason: collision with root package name */
    public final float f304976e;

    public e(float f12, float f13, float f14, float f15, float f16, int i12, C42822w c42822w) {
        f14 = (i12 & 4) != 0 ? 300.0f : f14;
        f15 = (i12 & 8) != 0 ? 1.0f : f15;
        f16 = (i12 & 16) != 0 ? 20.0f : f16;
        this.f304972a = f12;
        this.f304973b = f13;
        this.f304974c = f14;
        this.f304975d = f15;
        this.f304976e = f16;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    @Y61.l
    public final Float a(int i12, double d12, float f12) {
        return d.a.a(this, i12, d12, f12);
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    /* renamed from: b, reason: from getter */
    public final float getF304976e() {
        return this.f304976e;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    /* renamed from: c, reason: from getter */
    public final float getF304972a() {
        return this.f304972a;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    /* renamed from: d, reason: from getter */
    public final float getF304973b() {
        return this.f304973b;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float e(float f12) {
        return d.a.b(this, f12);
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    /* renamed from: f, reason: from getter */
    public final float getF304974c() {
        return this.f304974c;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    /* renamed from: g, reason: from getter */
    public final float getF304975d() {
        return this.f304975d;
    }
}
