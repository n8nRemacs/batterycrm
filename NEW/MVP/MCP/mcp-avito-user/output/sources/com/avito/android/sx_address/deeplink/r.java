package com.avito.android.sx_address.deeplink;

import Ju.InterfaceC14249c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddressEditLink;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.sx_address.SxAddressCancel;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import rv.C47918a;
import sv.C48421d;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressEditDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/r;", "Lev/a;", "Lcom/avito/android/SxAddressEditLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r extends AbstractC40161a<SxAddressEditLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f292856f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f292857g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50095c f292858h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final R0 f292859i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f292860j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N0 f292861k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C43238h f292862l;

    /* compiled from: SxAddressEditDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressEditDeeplinkHandler$onCreate$1", f = "SxAddressEditDeeplinkHandler.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292863q;

        /* compiled from: SxAddressEditDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sx_address.deeplink.r$a$a, reason: collision with other inner class name */
        public static final class C8887a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f292865b;

            public C8887a(r rVar) {
                this.f292865b = rVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Intent intent = ((C47918a) obj).f437157c;
                InterfaceC50095c.f442964a.getClass();
                InterfaceC14249c.b bVar = intent != null ? (SxAddressEditResult) intent.getParcelableExtra("result.sx_address.edit") : null;
                if (bVar == null) {
                    bVar = SxAddressCancel.f292528b;
                }
                this.f292865b.j(bVar);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<C47918a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f292866b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f292867c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sx_address.deeplink.r$a$b$a, reason: collision with other inner class name */
            public static final class C8888a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f292868b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r f292869c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressEditDeeplinkHandler$onCreate$1$invokeSuspend$$inlined$filter$1$2", f = "SxAddressEditDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.sx_address.deeplink.r$a$b$a$a, reason: collision with other inner class name */
                public static final class C8889a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f292870q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f292871r;

                    public C8889a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f292870q = obj;
                        this.f292871r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C8888a.this.emit(null, this);
                    }
                }

                public C8888a(InterfaceC43172j interfaceC43172j, r rVar) {
                    this.f292868b = interfaceC43172j;
                    this.f292869c = rVar;
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
                        boolean r0 = r6 instanceof com.avito.android.sx_address.deeplink.r.a.b.C8888a.C8889a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.sx_address.deeplink.r$a$b$a$a r0 = (com.avito.android.sx_address.deeplink.r.a.b.C8888a.C8889a) r0
                        int r1 = r0.f292871r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f292871r = r1
                        goto L18
                    L13:
                        com.avito.android.sx_address.deeplink.r$a$b$a$a r0 = new com.avito.android.sx_address.deeplink.r$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f292870q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f292871r
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
                        com.avito.android.sx_address.deeplink.r r2 = r4.f292869c
                        int r2 = sv.C48421d.a(r2)
                        if (r6 != r2) goto L4c
                        r0.f292871r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f292868b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.deeplink.r.a.b.C8888a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i, r rVar) {
                this.f292866b = interfaceC43160i;
                this.f292867c = rVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = ((AbstractC43168f) this.f292866b).collect(new C8888a(interfaceC43172j, this.f292867c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return r.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f292863q;
            if (i12 == 0) {
                C42729a0.b(obj);
                r rVar = r.this;
                b bVar = new b(C40483b.a(rVar.f292860j), rVar);
                C8887a c8887a = new C8887a(rVar);
                this.f292863q = 1;
                if (bVar.collect(c8887a, this) == coroutine_suspended) {
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

    @Inject
    public r(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k R0 r02, @Y61.k InterfaceC50095c interfaceC50095c) {
        this.f292856f = context;
        this.f292857g = interfaceC4053a;
        this.f292858h = interfaceC50095c;
        this.f292859i = r02;
        this.f292860j = bVar;
        this.f292862l = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SxAddressEditLink sxAddressEditLink = (SxAddressEditLink) deepLink;
        this.f292857g.J(this.f292858h.f(this.f292856f, sxAddressEditLink.f67554b, sxAddressEditLink.f67555c, sxAddressEditLink.f67556d, sxAddressEditLink.f67557e, sxAddressEditLink.f67558f), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        N0 n02 = this.f292861k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f292861k = C43259k.d(this.f292862l, null, null, new a(null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        N0 n02 = this.f292861k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        U.b(this.f292862l, null);
    }
}
