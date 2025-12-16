package com.avito.android.service_order_map.serviceordermap.link;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_order_map.deeplink.ServiceOrderMapDeeplink;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivity;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivityArgs;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceOrderMapDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/link/a;", "Lev/a;", "Lcom/avito/android/service_order_map/deeplink/ServiceOrderMapDeeplink;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServiceOrderMapDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Application f278701f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f278702g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f278703h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f278704i;

    /* compiled from: ServiceOrderMapDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.link.ServiceOrderMapDeeplinkHandler$onCreate$1", f = "ServiceOrderMapDeeplinkHandler.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_order_map.serviceordermap.link.a$a, reason: collision with other inner class name */
    public static final class C8287a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278705q;

        /* compiled from: ServiceOrderMapDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_order_map.serviceordermap.link.a$a$a, reason: collision with other inner class name */
        public static final class C8288a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f278707b;

            public C8288a(a aVar) {
                this.f278707b = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                C47918a c47918a = (C47918a) obj;
                a aVar = this.f278707b;
                int i12 = c47918a.f437156b;
                if (i12 == -1) {
                    Intent intent = c47918a.f437157c;
                    aVar.j(new ServiceOrderMapDeeplink.c.b(intent != null ? intent.getStringExtra("address_key") : null, String.valueOf(intent != null ? Double.valueOf(intent.getDoubleExtra("lat_key", 0.0d)) : null), String.valueOf(intent != null ? Double.valueOf(intent.getDoubleExtra("lng_key", 0.0d)) : null)));
                } else if (i12 == 0) {
                    aVar.j(ServiceOrderMapDeeplink.c.a.f278589b);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_order_map.serviceordermap.link.a$a$b */
        public static final class b implements InterfaceC43160i<C47918a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f278708b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f278709c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.service_order_map.serviceordermap.link.a$a$b$a, reason: collision with other inner class name */
            public static final class C8289a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f278710b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f278711c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.link.ServiceOrderMapDeeplinkHandler$onCreate$1$invokeSuspend$$inlined$filter$1$2", f = "ServiceOrderMapDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.service_order_map.serviceordermap.link.a$a$b$a$a, reason: collision with other inner class name */
                public static final class C8290a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f278712q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f278713r;

                    public C8290a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f278712q = obj;
                        this.f278713r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C8289a.this.emit(null, this);
                    }
                }

                public C8289a(InterfaceC43172j interfaceC43172j, a aVar) {
                    this.f278710b = interfaceC43172j;
                    this.f278711c = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.service_order_map.serviceordermap.link.a.C8287a.b.C8289a.C8290a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.service_order_map.serviceordermap.link.a$a$b$a$a r0 = (com.avito.android.service_order_map.serviceordermap.link.a.C8287a.b.C8289a.C8290a) r0
                        int r1 = r0.f278713r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f278713r = r1
                        goto L18
                    L13:
                        com.avito.android.service_order_map.serviceordermap.link.a$a$b$a$a r0 = new com.avito.android.service_order_map.serviceordermap.link.a$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f278712q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f278713r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        rv.a r6 = (rv.C47918a) r6
                        int r6 = r6.f437155a
                        com.avito.android.service_order_map.serviceordermap.link.a r2 = r4.f278711c
                        int r2 = sv.C48421d.a(r2)
                        if (r6 != r2) goto L4c
                        r0.f278713r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f278710b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_map.serviceordermap.link.a.C8287a.b.C8289a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i, a aVar) {
                this.f278708b = interfaceC43160i;
                this.f278709c = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
                Object objCollect = ((AbstractC43168f) this.f278708b).collect(new C8289a(interfaceC43172j, this.f278709c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public C8287a(Continuation<? super C8287a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C8287a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C8287a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278705q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = a.this;
                b bVar = new b(C40483b.a(aVar.f278703h), aVar);
                C8288a c8288a = new C8288a(aVar);
                this.f278705q = 1;
                if (bVar.collect(c8288a, this) == coroutine_suspended) {
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

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractCoroutineContextElement implements N {
        @Override // kotlinx.coroutines.N
        public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            V2.f318762a.f(th2);
        }
    }

    @Inject
    public a(@k Application application, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k R0 r02) {
        this.f278701f = application;
        this.f278702g = interfaceC4053a;
        this.f278703h = bVar;
        this.f278704i = U.a(r02.b().plus(t1.b()).plus(new b(N.f410714t2)));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceOrderMapDeeplink serviceOrderMapDeeplink = (ServiceOrderMapDeeplink) deepLink;
        ServiceOrderMapActivity.a aVar = ServiceOrderMapActivity.f278595s;
        String str2 = serviceOrderMapDeeplink.f278585b;
        ServiceOrderMapActivityArgs serviceOrderMapActivityArgs = new ServiceOrderMapActivityArgs(serviceOrderMapDeeplink.f278587d, serviceOrderMapDeeplink.f278588e, str2, serviceOrderMapDeeplink.f278586c);
        aVar.getClass();
        Intent intent = new Intent(this.f278701f, (Class<?>) ServiceOrderMapActivity.class);
        intent.putExtra("args_extra_key", serviceOrderMapActivityArgs);
        this.f278702g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43259k.d(this.f278704i, null, null, new C8287a(null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f278704i, null);
    }
}
