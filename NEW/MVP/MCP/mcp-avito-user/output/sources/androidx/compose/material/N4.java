package androidx.compose.material;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material/N4;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public float f32974a;

    /* renamed from: b, reason: collision with root package name */
    public float f32975b;

    /* renamed from: c, reason: collision with root package name */
    public float f32976c;

    /* renamed from: d, reason: collision with root package name */
    public float f32977d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C20268c<androidx.compose.ui.unit.h, C20318t> f32978e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.interaction.j f32979f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.interaction.j f32980g;

    public N4(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f32974a = f12;
        this.f32975b = f13;
        this.f32976c = f14;
        this.f32977d = f15;
        this.f32978e = new C20268c<>(androidx.compose.ui.unit.h.a(f12), androidx.compose.animation.core.J1.f26077c, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l androidx.compose.foundation.interaction.j r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.t> r0 = r5.f32978e
            boolean r1 = r7 instanceof androidx.compose.material.L4
            if (r1 == 0) goto L15
            r1 = r7
            androidx.compose.material.L4 r1 = (androidx.compose.material.L4) r1
            int r2 = r1.f32870u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f32870u = r2
            goto L1a
        L15:
            androidx.compose.material.L4 r1 = new androidx.compose.material.L4
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f32868s
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f32870u
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            androidx.compose.foundation.interaction.j r6 = r1.f32867r
            java.lang.Object r0 = r1.f32866q
            androidx.compose.material.N4 r0 = (androidx.compose.material.N4) r0
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r7 = move-exception
            goto L82
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.C42729a0.b(r7)
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.o.b
            if (r7 == 0) goto L45
            float r7 = r5.f32975b
            goto L55
        L45:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.g.a
            if (r7 == 0) goto L4c
            float r7 = r5.f32976c
            goto L55
        L4c:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.d.a
            if (r7 == 0) goto L53
            float r7 = r5.f32977d
            goto L55
        L53:
            float r7 = r5.f32974a
        L55:
            r5.f32980g = r6
            androidx.compose.runtime.y1 r3 = r0.f26227f     // Catch: java.lang.Throwable -> L7a
            androidx.compose.runtime.i3 r3 = (androidx.compose.runtime.C22082i3) r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.getF42167b()     // Catch: java.lang.Throwable -> L7a
            androidx.compose.ui.unit.h r3 = (androidx.compose.ui.unit.h) r3     // Catch: java.lang.Throwable -> L7a
            float r3 = r3.f42852b     // Catch: java.lang.Throwable -> L7a
            boolean r3 = androidx.compose.ui.unit.h.b(r3, r7)     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L7c
            androidx.compose.foundation.interaction.j r3 = r5.f32979f     // Catch: java.lang.Throwable -> L7a
            r1.f32866q = r5     // Catch: java.lang.Throwable -> L7a
            r1.f32867r = r6     // Catch: java.lang.Throwable -> L7a
            r1.f32870u = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = androidx.compose.material.C21115b4.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L7a
            if (r7 != r2) goto L7c
            return r2
        L78:
            r0 = r5
            goto L82
        L7a:
            r7 = move-exception
            goto L78
        L7c:
            r0 = r5
        L7d:
            r0.f32979f = r6
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L82:
            r0.f32979f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.N4.a(androidx.compose.foundation.interaction.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material.M4
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.M4 r0 = (androidx.compose.material.M4) r0
            int r1 = r0.f32896t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32896t = r1
            goto L18
        L13:
            androidx.compose.material.M4 r0 = new androidx.compose.material.M4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32894r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32896t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f32893q
            androidx.compose.material.N4 r0 = (androidx.compose.material.N4) r0
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L77
        L2d:
            r6 = move-exception
            goto L7e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.C42729a0.b(r6)
            androidx.compose.foundation.interaction.j r6 = r5.f32980g
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.o.b
            if (r2 == 0) goto L43
            float r6 = r5.f32975b
            goto L53
        L43:
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.g.a
            if (r2 == 0) goto L4a
            float r6 = r5.f32976c
            goto L53
        L4a:
            boolean r6 = r6 instanceof androidx.compose.foundation.interaction.d.a
            if (r6 == 0) goto L51
            float r6 = r5.f32977d
            goto L53
        L51:
            float r6 = r5.f32974a
        L53:
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.t> r2 = r5.f32978e
            androidx.compose.runtime.y1 r4 = r2.f26227f
            androidx.compose.runtime.i3 r4 = (androidx.compose.runtime.C22082i3) r4
            java.lang.Object r4 = r4.getF42167b()
            androidx.compose.ui.unit.h r4 = (androidx.compose.ui.unit.h) r4
            float r4 = r4.f42852b
            boolean r4 = androidx.compose.ui.unit.h.b(r4, r6)
            if (r4 != 0) goto L83
            androidx.compose.ui.unit.h r6 = androidx.compose.ui.unit.h.a(r6)     // Catch: java.lang.Throwable -> L7c
            r0.f32893q = r5     // Catch: java.lang.Throwable -> L7c
            r0.f32896t = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r6 = r2.h(r6, r0)     // Catch: java.lang.Throwable -> L7c
            if (r6 != r1) goto L76
            return r1
        L76:
            r0 = r5
        L77:
            androidx.compose.foundation.interaction.j r6 = r0.f32980g
            r0.f32979f = r6
            goto L83
        L7c:
            r6 = move-exception
            r0 = r5
        L7e:
            androidx.compose.foundation.interaction.j r1 = r0.f32980g
            r0.f32979f = r1
            throw r6
        L83:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.N4.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
