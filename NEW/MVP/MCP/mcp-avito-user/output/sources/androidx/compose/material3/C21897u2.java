package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Card.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/u2;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21897u2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f37393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37394b;

    /* renamed from: c, reason: collision with root package name */
    public final float f37395c;

    /* renamed from: d, reason: collision with root package name */
    public final float f37396d;

    /* renamed from: e, reason: collision with root package name */
    public final float f37397e;

    /* renamed from: f, reason: collision with root package name */
    public final float f37398f;

    public C21897u2(float f12, float f13, float f14, float f15, float f16, float f17, C42822w c42822w) {
        this.f37393a = f12;
        this.f37394b = f13;
        this.f37395c = f14;
        this.f37396d = f15;
        this.f37397e = f16;
        this.f37398f = f17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21897u2)) {
            return false;
        }
        C21897u2 c21897u2 = (C21897u2) obj;
        return androidx.compose.ui.unit.h.b(this.f37393a, c21897u2.f37393a) && androidx.compose.ui.unit.h.b(this.f37394b, c21897u2.f37394b) && androidx.compose.ui.unit.h.b(this.f37395c, c21897u2.f37395c) && androidx.compose.ui.unit.h.b(this.f37396d, c21897u2.f37396d) && androidx.compose.ui.unit.h.b(this.f37398f, c21897u2.f37398f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f37398f) + androidx.appcompat.app.r.d(this.f37396d, androidx.appcompat.app.r.d(this.f37395c, androidx.appcompat.app.r.d(this.f37394b, Float.hashCode(this.f37393a) * 31, 31), 31), 31);
    }
}
