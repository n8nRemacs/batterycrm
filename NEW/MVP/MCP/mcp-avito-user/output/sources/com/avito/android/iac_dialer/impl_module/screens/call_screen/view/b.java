package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet.IacUIWaitBottomSheetType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.InterfaceC43172j;
import xK.InterfaceC49853c;

/* compiled from: IacCallScreenViewFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.screens.call_screen.view.IacCallScreenViewFactoryImpl$createIacCallScreenView$1", f = "IacCallScreenViewFactory.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166296q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f166297r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f166298s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43108m f166299t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43108m f166300u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C43108m f166301v;

    /* compiled from: IacCallScreenViewFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxK/c;", "event", "Lkotlin/G0;", "emit", "(LxK/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f166302b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C43108m f166303c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C43108m f166304d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C43108m f166305e;

        public a(String str, C43108m c43108m, C43108m c43108m2, C43108m c43108m3) {
            this.f166302b = str;
            this.f166303c = c43108m;
            this.f166304d = c43108m2;
            this.f166305e = c43108m3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC49853c interfaceC49853c = (InterfaceC49853c) obj;
            boolean z12 = interfaceC49853c instanceof InterfaceC49853c.a.C12865a;
            C43108m c43108m = this.f166303c;
            String str = this.f166302b;
            if (z12) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "activeFallbackVisibilityEvents.send: " + interfaceC49853c, null);
                Object objSend = c43108m.send(Boxing.boxBoolean(true), continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
            }
            if (interfaceC49853c instanceof InterfaceC49853c.a.b) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "activeFallbackVisibilityEvents.send: " + interfaceC49853c, null);
                Object objSend2 = c43108m.send(Boxing.boxBoolean(false), continuation);
                return objSend2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend2 : G0.f406611a;
            }
            if (!(interfaceC49853c instanceof InterfaceC49853c.b)) {
                if (interfaceC49853c instanceof InterfaceC49853c.C12866c) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "audioDevicesBottomSheetVisibilityEvents.send: " + interfaceC49853c, null);
                    Object objSend3 = this.f166304d.send(Boxing.boxBoolean(true), continuation);
                    return objSend3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend3 : G0.f406611a;
                }
                if (!(interfaceC49853c instanceof InterfaceC49853c.d) && !(interfaceC49853c instanceof InterfaceC49853c.e) && !(interfaceC49853c instanceof InterfaceC49853c.f) && !(interfaceC49853c instanceof InterfaceC49853c.g)) {
                    boolean z13 = interfaceC49853c instanceof InterfaceC49853c.h.a;
                    C43108m c43108m2 = this.f166305e;
                    if (z13) {
                        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "waitBottomSheetEvents.send: " + interfaceC49853c, null);
                        Object objSend4 = c43108m2.send(null, continuation);
                        return objSend4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend4 : G0.f406611a;
                    }
                    if (interfaceC49853c instanceof InterfaceC49853c.h.b) {
                        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "waitBottomSheetEvents.send: " + interfaceC49853c, null);
                        Object objSend5 = c43108m2.send(IacUIWaitBottomSheetType.f167398b, continuation);
                        return objSend5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend5 : G0.f406611a;
                    }
                    if (interfaceC49853c instanceof InterfaceC49853c.h.C12867c) {
                        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "waitBottomSheetEvents.send: " + interfaceC49853c, null);
                        Object objSend6 = c43108m2.send(IacUIWaitBottomSheetType.f167400d, continuation);
                        return objSend6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend6 : G0.f406611a;
                    }
                    if (interfaceC49853c instanceof InterfaceC49853c.h.d) {
                        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "waitBottomSheetEvents.send: " + interfaceC49853c, null);
                        Object objSend7 = c43108m2.send(IacUIWaitBottomSheetType.f167399c, continuation);
                        return objSend7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend7 : G0.f406611a;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, String str, C43108m c43108m, C43108m c43108m2, C43108m c43108m3, Continuation continuation) {
        super(2, continuation);
        this.f166297r = wVar;
        this.f166298s = str;
        this.f166299t = c43108m;
        this.f166300u = c43108m2;
        this.f166301v = c43108m3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43108m c43108m = this.f166300u;
        C43108m c43108m2 = this.f166301v;
        return new b(this.f166297r, this.f166298s, this.f166299t, c43108m, c43108m2, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166296q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.c events = this.f166297r.f166349b.getEvents();
            C43108m c43108m = this.f166300u;
            C43108m c43108m2 = this.f166301v;
            a aVar = new a(this.f166298s, this.f166299t, c43108m, c43108m2);
            this.f166296q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
