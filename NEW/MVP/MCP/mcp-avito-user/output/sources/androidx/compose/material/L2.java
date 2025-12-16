package androidx.compose.material;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingActionButton.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material/L2;", "Landroidx/compose/material/K4;", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class L2 implements K4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32851a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32852b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32853c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32854d;

    public L2(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f32851a = f12;
        this.f32852b = f13;
        this.f32853c = f14;
        this.f32854d = f15;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    @Override // androidx.compose.material.K4
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.animation.core.r a(@Y61.k androidx.compose.foundation.interaction.m r17, @Y61.l androidx.compose.runtime.A r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = -478475335(0xffffffffe37b0bb9, float:-4.6309775E21)
            r2.C(r3)
            r3 = r19 & 14
            r3 = r3 ^ 6
            r4 = 0
            r5 = 1
            r6 = 4
            if (r3 <= r6) goto L1b
            boolean r7 = r2.B(r1)
            if (r7 != 0) goto L1f
        L1b:
            r7 = r19 & 6
            if (r7 != r6) goto L21
        L1f:
            r7 = r5
            goto L22
        L21:
            r7 = r4
        L22:
            java.lang.Object r8 = r18.t()
            androidx.compose.runtime.A$a r9 = androidx.compose.runtime.A.f37866a
            if (r7 != 0) goto L31
            r9.getClass()
            androidx.compose.runtime.A$a$a r7 = androidx.compose.runtime.A.a.f37868b
            if (r8 != r7) goto L43
        L31:
            androidx.compose.material.N4 r8 = new androidx.compose.material.N4
            float r12 = r0.f32852b
            float r13 = r0.f32853c
            float r11 = r0.f32851a
            float r14 = r0.f32854d
            r15 = 0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r2.H(r8)
        L43:
            androidx.compose.material.N4 r8 = (androidx.compose.material.N4) r8
            boolean r7 = r2.u(r8)
            r10 = r19 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r11 = 32
            if (r10 <= r11) goto L57
            boolean r10 = r2.B(r0)
            if (r10 != 0) goto L5b
        L57:
            r10 = r19 & 48
            if (r10 != r11) goto L5d
        L5b:
            r10 = r5
            goto L5e
        L5d:
            r10 = r4
        L5e:
            r7 = r7 | r10
            java.lang.Object r10 = r18.t()
            r11 = 0
            if (r7 != 0) goto L6d
            r9.getClass()
            androidx.compose.runtime.A$a$a r7 = androidx.compose.runtime.A.a.f37868b
            if (r10 != r7) goto L75
        L6d:
            androidx.compose.material.I2 r10 = new androidx.compose.material.I2
            r10.<init>(r8, r0, r11)
            r2.H(r10)
        L75:
            Y41.p r10 = (Y41.p) r10
            androidx.compose.runtime.C22187u0.d(r10, r2, r0)
            if (r3 <= r6) goto L82
            boolean r3 = r2.B(r1)
            if (r3 != 0) goto L86
        L82:
            r3 = r19 & 6
            if (r3 != r6) goto L87
        L86:
            r4 = r5
        L87:
            boolean r3 = r2.u(r8)
            r3 = r3 | r4
            java.lang.Object r4 = r18.t()
            if (r3 != 0) goto L99
            r9.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto La1
        L99:
            androidx.compose.material.K2 r4 = new androidx.compose.material.K2
            r4.<init>(r1, r8, r11)
            r2.H(r4)
        La1:
            Y41.p r4 = (Y41.p) r4
            androidx.compose.runtime.C22187u0.d(r4, r2, r1)
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.t> r1 = r8.f32978e
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r1 = r1.f26225d
            r18.h()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.L2.a(androidx.compose.foundation.interaction.m, androidx.compose.runtime.A, int):androidx.compose.animation.core.r");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l22 = (L2) obj;
        if (androidx.compose.ui.unit.h.b(this.f32851a, l22.f32851a) && androidx.compose.ui.unit.h.b(this.f32852b, l22.f32852b) && androidx.compose.ui.unit.h.b(this.f32853c, l22.f32853c)) {
            return androidx.compose.ui.unit.h.b(this.f32854d, l22.f32854d);
        }
        return false;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f32854d) + androidx.appcompat.app.r.d(this.f32853c, androidx.appcompat.app.r.d(this.f32852b, Float.hashCode(this.f32851a) * 31, 31), 31);
    }
}
