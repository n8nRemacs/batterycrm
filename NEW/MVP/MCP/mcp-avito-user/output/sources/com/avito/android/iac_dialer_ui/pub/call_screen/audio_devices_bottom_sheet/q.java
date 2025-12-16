package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetKt$Preview$1$1$3$1", f = "IacUIAudioDevicesBottomSheet.kt", i = {}, l = {199, 200, 201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f167019q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C43108m f167020r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f167020r = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f167020r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f167019q
            kotlinx.coroutines.channels.m r2 = r6.f167020r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r7)
            goto L50
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.C42729a0.b(r7)
            goto L42
        L23:
            kotlin.C42729a0.b(r7)
            goto L37
        L27:
            kotlin.C42729a0.b(r7)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r6.f167019q = r5
            java.lang.Object r7 = r2.send(r7, r6)
            if (r7 != r0) goto L37
            return r0
        L37:
            r6.f167019q = r4
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r4, r6)
            if (r7 != r0) goto L42
            return r0
        L42:
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r6.f167019q = r3
            java.lang.Object r7 = r2.send(r7, r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
