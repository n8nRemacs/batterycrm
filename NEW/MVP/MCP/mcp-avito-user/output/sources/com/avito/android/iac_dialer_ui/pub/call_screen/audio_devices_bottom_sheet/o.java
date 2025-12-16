package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetKt$Preview$1$1$2$1", f = "IacUIAudioDevicesBottomSheet.kt", i = {}, l = {184, 185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f167013q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C43108m f167014r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f167015s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C43108m c43108m, Y41.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f167014r = c43108m;
        this.f167015s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f167014r, this.f167015s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f167013q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r5)
            goto L3b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.C42729a0.b(r5)
            goto L30
        L1e:
            kotlin.C42729a0.b(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r4.f167013q = r3
            kotlinx.coroutines.channels.m r1 = r4.f167014r
            java.lang.Object r5 = r1.send(r5, r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            r4.f167013q = r2
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r5 = kotlinx.coroutines.C43131e0.b(r1, r4)
            if (r5 != r0) goto L3b
            return r0
        L3b:
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState r5 = com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.w.f167030a
            java.util.List r5 = r5.getAvailable()
            if (r5 != 0) goto L45
            kotlin.collections.z0 r5 = kotlin.collections.C42784z0.f406748b
        L45:
            java.lang.Object r5 = kotlin.collections.C42745f0.E(r5)
            Y41.l<com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState$Device, kotlin.G0> r0 = r4.f167015s
            r0.invoke(r5)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
