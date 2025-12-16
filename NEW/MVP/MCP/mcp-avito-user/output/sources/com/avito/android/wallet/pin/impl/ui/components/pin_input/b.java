package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y61.k;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletPinInput.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/pin_input/b;", "", "<init>", "()V", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f328983b = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C20268c<Float, C20318t> f328984a = C20274e.a(0.875f);

    /* compiled from: WalletPinInput.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/pin_input/b$a;", "", "<init>", "()V", "", "INITIAL_SCALE", "F", "TARGET_SCALE", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(float r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.avito.android.wallet.pin.impl.ui.components.pin_input.c
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.wallet.pin.impl.ui.components.pin_input.c r0 = (com.avito.android.wallet.pin.impl.ui.components.pin_input.c) r0
            int r1 = r0.f328989u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f328989u = r1
            goto L18
        L13:
            com.avito.android.wallet.pin.impl.ui.components.pin_input.c r0 = new com.avito.android.wallet.pin.impl.ui.components.pin_input.c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f328987s
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f328989u
            r9 = 1063256064(0x3f600000, float:0.875)
            r10 = 3
            r2 = 2
            r3 = 1
            r11 = 0
            if (r1 == 0) goto L51
            if (r1 == r3) goto L46
            if (r1 == r2) goto L3b
            if (r1 != r10) goto L33
            kotlin.C42729a0.b(r14)
            goto La3
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            androidx.compose.animation.core.R0 r13 = r0.f328986r
            java.lang.Object r1 = r0.f328985q
            com.avito.android.wallet.pin.impl.ui.components.pin_input.b r1 = (com.avito.android.wallet.pin.impl.ui.components.pin_input.b) r1
            kotlin.C42729a0.b(r14)
            r3 = r13
            goto L8b
        L46:
            androidx.compose.animation.core.R0 r13 = r0.f328986r
            java.lang.Object r1 = r0.f328985q
            com.avito.android.wallet.pin.impl.ui.components.pin_input.b r1 = (com.avito.android.wallet.pin.impl.ui.components.pin_input.b) r1
            kotlin.C42729a0.b(r14)
            r14 = r1
            goto L6d
        L51:
            kotlin.C42729a0.b(r14)
            r14 = 5
            androidx.compose.animation.core.R0 r13 = androidx.compose.animation.core.C20310q.d(r13, r14, r11)
            java.lang.Float r14 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)
            r0.f328985q = r12
            r0.f328986r = r13
            r0.f328989u = r3
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r12.f328984a
            java.lang.Object r14 = r1.h(r14, r0)
            if (r14 != r8) goto L6c
            return r8
        L6c:
            r14 = r12
        L6d:
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r14.f328984a
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r3)
            r0.f328985q = r14
            r0.f328986r = r13
            r0.f328989u = r2
            r5 = 0
            r7 = 12
            r4 = 0
            r2 = r3
            r3 = r13
            r6 = r0
            java.lang.Object r1 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r8) goto L89
            return r8
        L89:
            r3 = r13
            r1 = r14
        L8b:
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r1.f328984a
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)
            r0.f328985q = r11
            r0.f328986r = r11
            r0.f328989u = r10
            r5 = 0
            r7 = 12
            r4 = 0
            r6 = r0
            java.lang.Object r13 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r8) goto La3
            return r8
        La3:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.ui.components.pin_input.b.a(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
