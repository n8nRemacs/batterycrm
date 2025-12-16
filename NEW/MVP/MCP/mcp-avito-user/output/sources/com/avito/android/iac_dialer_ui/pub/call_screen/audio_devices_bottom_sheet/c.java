package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.bottom_sheet.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetKt$IacUIAudioDevicesBottomSheet$1", f = "IacUIAudioDevicesBottomSheet.kt", i = {}, l = {61, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f166979q;

    /* renamed from: r, reason: collision with root package name */
    public int f166980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43108m f166981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I f166982t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f166983u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C43108m c43108m, I i12, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f166981s = c43108m;
        this.f166982t = i12;
        this.f166983u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f166981s, this.f166982t, this.f166983u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:28:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f166980r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlinx.coroutines.channels.y r1 = r7.f166979q
            kotlin.C42729a0.b(r8)
            goto L7d
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlinx.coroutines.channels.y r1 = r7.f166979q
            kotlin.C42729a0.b(r8)
            goto L39
        L22:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.channels.m r8 = r7.f166981s
            kotlinx.coroutines.channels.y r8 = r8.iterator()
        L2b:
            r7.f166979q = r8
            r7.f166980r = r3
            java.lang.Object r1 = r8.a(r7)
            if (r1 != r0) goto L36
            return r0
        L36:
            r6 = r1
            r1 = r8
            r8 = r6
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r1.next()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            androidx.compose.runtime.y1<java.lang.Boolean> r4 = r7.f166983u
            if (r8 == 0) goto L57
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState r8 = com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.w.f167030a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r4.setValue(r8)
            goto L7d
        L57:
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState r8 = com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.w.f167030a
            java.lang.Object r8 = r4.getF42167b()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7d
            com.akita.compose.component.bottom_sheet.I r8 = r7.f166982t
            boolean r5 = r8.b()
            if (r5 == 0) goto L78
            r7.f166979q = r1
            r7.f166980r = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L7d
            return r0
        L78:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r4.setValue(r8)
        L7d:
            r8 = r1
            goto L2b
        L7f:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
