package com.avito.android.sx_address.deeplink;

import Ju.AbstractC14250d;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.SxAddressListLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressListDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/B;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/SxAddressListLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B extends com.avito.android.deeplink_handler.handler.base.coroutines.a<SxAddressListLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f292763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50095c f292764h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f292765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f292766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C25719a f292767k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f292768b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f292769c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sx_address.deeplink.B$a$a, reason: collision with other inner class name */
        public static final class C8881a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f292770b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ B f292771c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressListDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "SxAddressListDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.deeplink.B$a$a$a, reason: collision with other inner class name */
            public static final class C8882a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f292772q;

                /* renamed from: r, reason: collision with root package name */
                public int f292773r;

                public C8882a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f292772q = obj;
                    this.f292773r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8881a.this.emit(null, this);
                }
            }

            public C8881a(InterfaceC43172j interfaceC43172j, B b12) {
                this.f292770b = interfaceC43172j;
                this.f292771c = b12;
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
                    boolean r0 = r6 instanceof com.avito.android.sx_address.deeplink.B.a.C8881a.C8882a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.sx_address.deeplink.B$a$a$a r0 = (com.avito.android.sx_address.deeplink.B.a.C8881a.C8882a) r0
                    int r1 = r0.f292773r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f292773r = r1
                    goto L18
                L13:
                    com.avito.android.sx_address.deeplink.B$a$a$a r0 = new com.avito.android.sx_address.deeplink.B$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f292772q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f292773r
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
                    com.avito.android.sx_address.deeplink.B r2 = r4.f292771c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f292773r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f292770b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.deeplink.B.a.C8881a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, B b12) {
            this.f292768b = interfaceC43160i;
            this.f292769c = b12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f292768b).collect(new C8881a(interfaceC43172j, this.f292769c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SxAddressListDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressListDeeplinkHandler", f = "SxAddressListDeeplinkHandler.kt", i = {0}, l = {30, 34}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public B f292775q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f292776r;

        /* renamed from: t, reason: collision with root package name */
        public int f292778t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f292776r = obj;
            this.f292778t |= BeduinInputModel.MIN_TEXT_VERSION;
            return B.this.n(this);
        }
    }

    /* compiled from: SxAddressListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressListDeeplinkHandler$onCreateSuspend$3", f = "SxAddressListDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<C47918a, Continuation<? super G0>, Object> {
        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return B.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            B.this.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public B(@Y61.k Context context, @Y61.k InterfaceC50095c interfaceC50095c, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k C25719a c25719a, @Y61.k R0 r02) {
        super(r02);
        this.f292763g = context;
        this.f292764h = interfaceC50095c;
        this.f292765i = interfaceC4053a;
        this.f292766j = bVar;
        this.f292767k = c25719a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        SxAddressListLink sxAddressListLink = (SxAddressListLink) deepLink;
        this.f292767k.a(sxAddressListLink, this, AuthSource.f92685T, new A(this, sxAddressListLink));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.sx_address.deeplink.B.b
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.sx_address.deeplink.B$b r0 = (com.avito.android.sx_address.deeplink.B.b) r0
            int r1 = r0.f292778t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292778t = r1
            goto L1a
        L13:
            com.avito.android.sx_address.deeplink.B$b r0 = new com.avito.android.sx_address.deeplink.B$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f292776r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f292778t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.C42729a0.b(r7)
            goto L6a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            com.avito.android.sx_address.deeplink.B r2 = r0.f292775q
            kotlin.C42729a0.b(r7)
            goto L49
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f292775q = r6
            r0.f292778t = r4
            kotlin.G0 r7 = kotlin.G0.f406611a
            if (r7 != r1) goto L48
            return r1
        L48:
            r2 = r6
        L49:
            com.avito.android.deeplink_handler.view.a$b r7 = r2.f292766j
            kotlinx.coroutines.flow.i r7 = fv.C40483b.a(r7)
            com.avito.android.sx_address.deeplink.B$a r4 = new com.avito.android.sx_address.deeplink.B$a
            r4.<init>(r7, r2)
            com.avito.android.sx_address.deeplink.B$c r7 = new com.avito.android.sx_address.deeplink.B$c
            r5 = 0
            r7.<init>(r5)
            kotlinx.coroutines.flow.r1 r2 = new kotlinx.coroutines.flow.r1
            r2.<init>(r7, r4)
            r0.f292775q = r5
            r0.f292778t = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.i(r2, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.deeplink.B.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
