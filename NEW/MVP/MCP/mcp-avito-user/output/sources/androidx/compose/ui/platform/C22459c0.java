package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/c0;", "Landroidx/compose/ui/platform/V1;", "Lkotlinx/coroutines/T;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22459c0 implements V1, kotlinx.coroutines.T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f41418b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.Y f41419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f41420d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f41421e = new AtomicReference(null);

    public C22459c0(@Y61.k View view, @Y61.k androidx.compose.ui.text.input.Y y12, @Y61.k kotlinx.coroutines.T t12) {
        this.f41418b = view;
        this.f41419c = y12;
        this.f41420d = t12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.U1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k androidx.compose.ui.platform.O1 r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.Y
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.Y r0 = (androidx.compose.ui.platform.Y) r0
            int r1 = r0.f41333s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41333s = r1
            goto L18
        L13:
            androidx.compose.ui.platform.Y r0 = new androidx.compose.ui.platform.Y
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f41331q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41333s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.C42729a0.b(r7)
            goto L4a
        L31:
            kotlin.C42729a0.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f41421e
            androidx.compose.ui.platform.a0 r2 = new androidx.compose.ui.platform.a0
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.b0 r6 = new androidx.compose.ui.platform.b0
            r4 = 0
            r6.<init>(r5, r4)
            r0.f41333s = r3
            java.lang.Object r6 = androidx.compose.ui.B.b(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C22459c0.b(androidx.compose.ui.platform.O1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF400145h() {
        return this.f41420d.getF400145h();
    }

    @Override // androidx.compose.ui.platform.U1
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF41418b() {
        return this.f41418b;
    }
}
