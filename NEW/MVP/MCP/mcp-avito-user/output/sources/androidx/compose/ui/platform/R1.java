package androidx.compose.ui.platform;

import androidx.compose.runtime.J3;
import kotlin.Metadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J3 f41258a = androidx.compose.runtime.S.d(a.f41259l);

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/J0;", "invoke", "()Landroidx/compose/ui/platform/J0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<J0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41259l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ J0 invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k androidx.compose.ui.platform.P1 r4, @Y61.k Y41.p r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.S1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.S1 r0 = (androidx.compose.ui.platform.S1) r0
            int r1 = r0.f41271r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41271r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.S1 r0 = new androidx.compose.ui.platform.S1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41270q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41271r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.C42729a0.b(r6)
            goto L57
        L31:
            kotlin.C42729a0.b(r6)
            androidx.compose.ui.v$d r6 = r4.getF42880b()
            boolean r6 = r6.f42893o
            if (r6 == 0) goto L5d
            androidx.compose.ui.node.J0 r6 = androidx.compose.ui.node.C22421l.h(r4)
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.C22421l.g(r4)
            androidx.compose.runtime.U r4 = r4.f40611E
            androidx.compose.runtime.J3 r2 = androidx.compose.ui.platform.R1.f41258a
            java.lang.Object r4 = r4.a(r2)
            androidx.compose.ui.platform.J0 r4 = (androidx.compose.ui.platform.J0) r4
            r0.f41271r = r3
            java.lang.Object r4 = b(r6, r4, r5, r0)
            if (r4 != r1) goto L57
            return r1
        L57:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L5d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.R1.a(androidx.compose.ui.platform.P1, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.ui.node.J0 r5, androidx.compose.ui.platform.J0 r6, Y41.p r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.T1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.T1 r0 = (androidx.compose.ui.platform.T1) r0
            int r1 = r0.f41276r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41276r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.T1 r0 = new androidx.compose.ui.platform.T1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41275q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41276r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.C42729a0.b(r8)
            goto L55
        L34:
            kotlin.C42729a0.b(r8)
            goto L46
        L38:
            kotlin.C42729a0.b(r8)
            if (r6 != 0) goto L4c
            r0.f41276r = r4
            java.lang.Object r5 = r5.d(r7, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4c:
            r0.f41276r = r3
            java.lang.Object r5 = r6.a(r5, r7, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.R1.b(androidx.compose.ui.node.J0, androidx.compose.ui.platform.J0, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
