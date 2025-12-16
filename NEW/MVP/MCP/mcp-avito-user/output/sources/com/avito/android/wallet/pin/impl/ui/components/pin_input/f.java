package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y41.l;
import Y61.k;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20302n0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.F;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.adjust.sdk.Constants;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPinInputAnimationState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/pin_input/f;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f328998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C20268c<Float, C20318t> f328999b = C20274e.a(0.0f);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f329000c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f329001d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C20268c<Float, C20318t> f329002e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final I3 f329003f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C20302n0 f329004g;

    /* compiled from: WalletPinInputAnimationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            f fVar = f.this;
            return Integer.valueOf(kotlin.math.b.b(fVar.f329002e.f().floatValue() * fVar.f328998a) - 1);
        }
    }

    /* compiled from: WalletPinInputAnimationState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<C20302n0.b<Float>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f329006l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C20302n0.b<Float> bVar) {
            C20302n0.b<Float> bVar2 = bVar;
            F f12 = Q.f26123c;
            bVar2.f26394a = Constants.MINIMAL_ERROR_STATUS_CODE;
            for (int i12 = 1; i12 < 5; i12++) {
                bVar2.a((bVar2.f26394a / 5) * i12, Float.valueOf(5.0f * ((float) Math.pow(-1.0f, i12)))).f26367b = f12;
            }
            bVar2.a(bVar2.f26394a, Float.valueOf(0.0f)).f26367b = f12;
            return G0.f406611a;
        }
    }

    public f(int i12) {
        this.f328998a = i12;
        Boolean bool = Boolean.FALSE;
        this.f329000c = C22126m3.g(bool);
        this.f329001d = C22126m3.g(bool);
        this.f329002e = C20274e.a(0.0f);
        this.f329003f = C22126m3.d(new a());
        this.f329004g = C20310q.b(b.f329006l);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.android.wallet.pin.impl.ui.components.pin_input.d
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.wallet.pin.impl.ui.components.pin_input.d r0 = (com.avito.android.wallet.pin.impl.ui.components.pin_input.d) r0
            int r1 = r0.f328993t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f328993t = r1
            goto L18
        L13:
            com.avito.android.wallet.pin.impl.ui.components.pin_input.d r0 = new com.avito.android.wallet.pin.impl.ui.components.pin_input.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f328991r
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f328993t
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L36
            if (r1 != r9) goto L2e
            com.avito.android.wallet.pin.impl.ui.components.pin_input.f r0 = r0.f328990q
            kotlin.C42729a0.b(r11)
            goto L73
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            com.avito.android.wallet.pin.impl.ui.components.pin_input.f r1 = r0.f328990q
            kotlin.C42729a0.b(r11)
            goto L65
        L3c:
            kotlin.C42729a0.b(r11)
            androidx.compose.runtime.y1<java.lang.Boolean> r11 = r10.f329000c
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            androidx.compose.runtime.i3 r11 = (androidx.compose.runtime.C22082i3) r11
            r11.setValue(r1)
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            r0.f328990q = r10
            r0.f328993t = r2
            r5 = 0
            r7 = 12
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r10.f328999b
            androidx.compose.animation.core.n0 r3 = r10.f329004g
            r4 = 0
            r2 = r11
            r6 = r0
            java.lang.Object r11 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r8) goto L64
            return r8
        L64:
            r1 = r10
        L65:
            r0.f328990q = r1
            r0.f328993t = r9
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r2, r0)
            if (r11 != r8) goto L72
            return r8
        L72:
            r0 = r1
        L73:
            androidx.compose.runtime.y1<java.lang.Boolean> r11 = r0.f329000c
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            androidx.compose.runtime.i3 r11 = (androidx.compose.runtime.C22082i3) r11
            r11.setValue(r0)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.ui.components.pin_input.f.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object b(@k SuspendLambda suspendLambda) {
        Object objC = C20268c.c(this.f329002e, Boxing.boxFloat(1.0f), C20310q.a(new G1(this.f328998a * 160, 320, Q.f26123c), null, 0L, 6), null, null, suspendLambda, 12);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.wallet.pin.impl.ui.components.pin_input.e
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.wallet.pin.impl.ui.components.pin_input.e r0 = (com.avito.android.wallet.pin.impl.ui.components.pin_input.e) r0
            int r1 = r0.f328997t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f328997t = r1
            goto L18
        L13:
            com.avito.android.wallet.pin.impl.ui.components.pin_input.e r0 = new com.avito.android.wallet.pin.impl.ui.components.pin_input.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f328995r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f328997t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.wallet.pin.impl.ui.components.pin_input.f r0 = r0.f328994q
            kotlin.C42729a0.b(r7)
            goto L44
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.C42729a0.b(r7)
            r0.f328994q = r6
            r0.f328997t = r3
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            androidx.compose.runtime.y1<java.lang.Boolean> r7 = r0.f329001d
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            androidx.compose.runtime.i3 r7 = (androidx.compose.runtime.C22082i3) r7
            r7.setValue(r0)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.ui.components.pin_input.f.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object d(@k ContinuationImpl continuationImpl) {
        Object objH = this.f329002e.h(Boxing.boxFloat(0.0f), continuationImpl);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : G0.f406611a;
    }
}
