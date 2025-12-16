package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: SearchBar.android.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/P;", "Landroidx/compose/foundation/layout/T1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class P implements androidx.compose.foundation.layout.T1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3<Float> f35276a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.I3<androidx.compose.ui.unit.h> f35277b;

    public P(@Y61.k androidx.compose.runtime.I3<Float> i32, @Y61.k androidx.compose.runtime.I3<androidx.compose.ui.unit.h> i33) {
        this.f35276a = i32;
        this.f35277b = i33;
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float a(@Y61.k LayoutDirection layoutDirection) {
        float f12 = 0;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return f12;
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: b */
    public final float getF28514d() {
        float fFloatValue = this.f35276a.getF42167b().floatValue() * C21498ce.f36165e;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return fFloatValue;
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float c(@Y61.k LayoutDirection layoutDirection) {
        float f12 = 0;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return f12;
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: d */
    public final float getF28512b() {
        return this.f35276a.getF42167b().floatValue() * this.f35277b.getF42167b().f42852b;
    }
}
