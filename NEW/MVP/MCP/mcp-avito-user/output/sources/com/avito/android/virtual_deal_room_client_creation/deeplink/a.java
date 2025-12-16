package com.avito.android.virtual_deal_room_client_creation.deeplink;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import com.avito.android.virtual_deal_room_client_creation.clients.model.ClientsArguments;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CreateClientDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<CreateClientDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f326898g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f326899h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final YN0.a f326900i;

    /* compiled from: CreateClientDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.deeplink.CreateClientDeeplinkHandler", f = "CreateClientDeeplinkHandler.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.deeplink.a$a, reason: collision with other inner class name */
    public static final class C10114a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f326901q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326902r;

        /* renamed from: t, reason: collision with root package name */
        public int f326904t;

        public C10114a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f326902r = obj;
            this.f326904t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.n(this);
        }
    }

    /* compiled from: CreateClientDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(rv.C47918a r3, kotlin.coroutines.Continuation<? super kotlin.G0> r4) {
            /*
                r2 = this;
                rv.a r3 = (rv.C47918a) r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r4 = r2.receiver
                com.avito.android.virtual_deal_room_client_creation.deeplink.a r4 = (com.avito.android.virtual_deal_room_client_creation.deeplink.a) r4
                r4.getClass()
                android.content.Intent r3 = r3.f437157c
                if (r3 == 0) goto L31
                android.os.Bundle r3 = r3.getExtras()
                if (r3 == 0) goto L31
                com.avito.android.virtual_deal_room_client_creation.ClientCreationActivity$a r0 = com.avito.android.virtual_deal_room_client_creation.ClientCreationActivity.f326478m
                r0.getClass()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 < r1) goto L27
                java.lang.Object r3 = Ad.l.v(r3)
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                goto L2d
            L27:
                java.lang.String r0 = "arguments"
                android.os.Parcelable r3 = r3.getParcelable(r0)
            L2d:
                com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink$Result r3 = (com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink.Result) r3
                if (r3 != 0) goto L33
            L31:
                com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink$Result$Dismissed r3 = com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink.Result.Dismissed.f326442b
            L33:
                r4.j(r3)
                kotlin.G0 r3 = kotlin.G0.f406611a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.deeplink.a.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CreateClientDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lrv/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.deeplink.CreateClientDeeplinkHandler$onCreateSuspend$3", f = "CreateClientDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super C47918a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f326905q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super C47918a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f326905q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f326905q);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k YN0.a aVar, @k R0 r02) {
        super(r02);
        this.f326898g = bVar;
        this.f326899h = interfaceC4053a;
        this.f326900i = aVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f326899h.J(this.f326900i.a(new ClientsArguments()), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.android.virtual_deal_room_client_creation.deeplink.a.C10114a
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.virtual_deal_room_client_creation.deeplink.a$a r0 = (com.avito.android.virtual_deal_room_client_creation.deeplink.a.C10114a) r0
            int r1 = r0.f326904t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326904t = r1
            goto L1a
        L13:
            com.avito.android.virtual_deal_room_client_creation.deeplink.a$a r0 = new com.avito.android.virtual_deal_room_client_creation.deeplink.a$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
            r0.<init>(r10)
        L1a:
            java.lang.Object r10 = r0.f326902r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f326904t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.virtual_deal_room_client_creation.deeplink.a r0 = r0.f326901q
            kotlin.C42729a0.b(r10)
            goto L42
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.C42729a0.b(r10)
            r0.f326901q = r9
            r0.f326904t = r3
            kotlin.G0 r10 = kotlin.G0.f406611a
            if (r10 != r1) goto L41
            return r1
        L41:
            r0 = r9
        L42:
            com.avito.android.deeplink_handler.view.a$b r10 = r0.f326898g
            kotlinx.coroutines.flow.i r10 = fv.C40483b.a(r10)
            com.avito.android.virtual_deal_room_client_creation.deeplink.a$b r1 = new com.avito.android.virtual_deal_room_client_creation.deeplink.a$b
            java.lang.String r7 = "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<com.avito.android.virtual_deal_room_client_creation.deeplink.a> r5 = com.avito.android.virtual_deal_room_client_creation.deeplink.a.class
            java.lang.String r6 = "handleResult"
            r2 = r1
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.r1 r2 = new kotlinx.coroutines.flow.r1
            r2.<init>(r1, r10)
            com.avito.android.virtual_deal_room_client_creation.deeplink.a$c r10 = new com.avito.android.virtual_deal_room_client_creation.deeplink.a$c
            r1 = 3
            r3 = 0
            r10.<init>(r1, r3)
            kotlinx.coroutines.flow.f0 r1 = new kotlinx.coroutines.flow.f0
            r1.<init>(r2, r10)
            kotlinx.coroutines.internal.h r10 = r0.f134492f
            kotlinx.coroutines.flow.C43175k.K(r1, r10)
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.deeplink.a.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
