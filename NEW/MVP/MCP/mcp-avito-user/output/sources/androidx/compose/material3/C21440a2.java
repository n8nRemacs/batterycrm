package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Button.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/a2;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21440a2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f36011a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36012b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36013c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36014d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36015e;

    public C21440a2(float f12, float f13, float f14, float f15, float f16, C42822w c42822w) {
        this.f36011a = f12;
        this.f36012b = f13;
        this.f36013c = f14;
        this.f36014d = f15;
        this.f36015e = f16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21440a2)) {
            return false;
        }
        C21440a2 c21440a2 = (C21440a2) obj;
        return androidx.compose.ui.unit.h.b(this.f36011a, c21440a2.f36011a) && androidx.compose.ui.unit.h.b(this.f36012b, c21440a2.f36012b) && androidx.compose.ui.unit.h.b(this.f36013c, c21440a2.f36013c) && androidx.compose.ui.unit.h.b(this.f36014d, c21440a2.f36014d) && androidx.compose.ui.unit.h.b(this.f36015e, c21440a2.f36015e);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f36015e) + androidx.appcompat.app.r.d(this.f36014d, androidx.appcompat.app.r.d(this.f36013c, androidx.appcompat.app.r.d(this.f36012b, Float.hashCode(this.f36011a) * 31, 31), 31), 31);
    }
}
