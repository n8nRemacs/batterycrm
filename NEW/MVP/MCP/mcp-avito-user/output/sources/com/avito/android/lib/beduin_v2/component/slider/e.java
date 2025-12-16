package com.avito.android.lib.beduin_v2.component.slider;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SliderComposeState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/slider/e;", "", "_design-modules_beduin-v2_renderer_component_slider"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f175912a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final kotlin.ranges.f<Float> f175913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f175914c;

    /* renamed from: d, reason: collision with root package name */
    public final int f175915d;

    public e(float f12, @k kotlin.ranges.f<Float> fVar, boolean z12, int i12) {
        this.f175912a = f12;
        this.f175913b = fVar;
        this.f175914c = z12;
        this.f175915d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f175912a, eVar.f175912a) == 0 && L.f(this.f175913b, eVar.f175913b) && this.f175914c == eVar.f175914c && this.f175915d == eVar.f175915d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175915d) + r.i((this.f175913b.hashCode() + (Float.hashCode(this.f175912a) * 31)) * 31, 31, this.f175914c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderComposeState(value=");
        sb2.append(this.f175912a);
        sb2.append(", valuesRange=");
        sb2.append(this.f175913b);
        sb2.append(", enabled=");
        sb2.append(this.f175914c);
        sb2.append(", step=");
        return r.t(sb2, this.f175915d, ')');
    }
}
