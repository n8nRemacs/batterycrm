package androidx.compose.material;

import androidx.compose.ui.unit.h;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Swipeable.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/I4;", "Landroidx/compose/material/qc;", "Landroidx/compose/ui/unit/h;", "offset", "<init>", "(FLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@InterfaceC21154e4
/* loaded from: classes.dex */
public final /* data */ class I4 implements qc {

    /* renamed from: a, reason: collision with root package name */
    public final float f32759a;

    public I4(float f12, C42822w c42822w) {
        this.f32759a = f12;
    }

    @Override // androidx.compose.material.qc
    public final float a(@Y61.k androidx.compose.ui.unit.d dVar, float f12, float f13) {
        return (Math.signum(f13 - f12) * dVar.M0(this.f32759a)) + f12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I4) && androidx.compose.ui.unit.h.b(this.f32759a, ((I4) obj).f32759a);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f32759a);
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.h(')', this.f32759a, new StringBuilder("FixedThreshold(offset="));
    }
}
