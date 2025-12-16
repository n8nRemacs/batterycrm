package com.avito.android.virtual_deal_room.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import ev.AbstractC40161a;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ClientRoomDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/i;", "Lev/a;", "Lcom/avito/android/virtual_deal_room/deeplink/ClientRoomDeeplink;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends AbstractC40161a<ClientRoomDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f326452f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f326453g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LN0.a f326454h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.v2.page.o f326455i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f326456j;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f326457b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f326458c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room.deeplink.i$a$a, reason: collision with other inner class name */
        public static final class C10091a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f326459b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f326460c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.virtual_deal_room.deeplink.ClientRoomDeeplinkHandler$onCreate$$inlined$filter$1$2", f = "ClientRoomDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room.deeplink.i$a$a$a, reason: collision with other inner class name */
            public static final class C10092a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f326461q;

                /* renamed from: r, reason: collision with root package name */
                public int f326462r;

                public C10092a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f326461q = obj;
                    this.f326462r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10091a.this.emit(null, this);
                }
            }

            public C10091a(InterfaceC43172j interfaceC43172j, i iVar) {
                this.f326459b = interfaceC43172j;
                this.f326460c = iVar;
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
                    boolean r0 = r6 instanceof com.avito.android.virtual_deal_room.deeplink.i.a.C10091a.C10092a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.virtual_deal_room.deeplink.i$a$a$a r0 = (com.avito.android.virtual_deal_room.deeplink.i.a.C10091a.C10092a) r0
                    int r1 = r0.f326462r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f326462r = r1
                    goto L18
                L13:
                    com.avito.android.virtual_deal_room.deeplink.i$a$a$a r0 = new com.avito.android.virtual_deal_room.deeplink.i$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f326461q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f326462r
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
                    com.avito.android.virtual_deal_room.deeplink.i r2 = r4.f326460c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f326462r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f326459b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room.deeplink.i.a.C10091a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, i iVar) {
            this.f326457b = interfaceC43160i;
            this.f326458c = iVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f326457b).collect(new C10091a(interfaceC43172j, this.f326458c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ClientRoomDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(rv.C47918a r2, kotlin.coroutines.Continuation<? super kotlin.G0> r3) {
            /*
                r1 = this;
                rv.a r2 = (rv.C47918a) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r3 = r1.receiver
                com.avito.android.virtual_deal_room.deeplink.i r3 = (com.avito.android.virtual_deal_room.deeplink.i) r3
                r3.getClass()
                android.content.Intent r2 = r2.f437157c
                if (r2 == 0) goto L21
                com.avito.android.virtual_deal_room.client_room.ClientRoomActivity$a r0 = com.avito.android.virtual_deal_room.client_room.ClientRoomActivity.f326247m
                r0.getClass()
                java.lang.String r0 = "category_result"
                android.os.Parcelable r2 = r2.getParcelableExtra(r0)
                com.avito.android.virtual_deal_room.client_room.model.ClientRoomActivityResult r2 = (com.avito.android.virtual_deal_room.client_room.model.ClientRoomActivityResult) r2
                if (r2 == 0) goto L21
                boolean r2 = r2.f326338b
                goto L22
            L21:
                r2 = 0
            L22:
                com.avito.android.virtual_deal_room.deeplink.ClientRoomDeeplink$b r0 = new com.avito.android.virtual_deal_room.deeplink.ClientRoomDeeplink$b
                r0.<init>(r2)
                r3.j(r0)
                kotlin.G0 r2 = kotlin.G0.f406611a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room.deeplink.i.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k LN0.a aVar, @Y61.k com.avito.android.beduin.v2.page.o oVar, @Y61.k R0 r02) {
        this.f326452f = interfaceC4053a;
        this.f326453g = bVar;
        this.f326454h = aVar;
        this.f326455i = oVar;
        this.f326456j = U.a(r02.d().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ClientRoomDeeplink clientRoomDeeplink = (ClientRoomDeeplink) deepLink;
        String str2 = clientRoomDeeplink.f326436d;
        boolean zF2 = L.f(str2, "direct");
        a.InterfaceC4053a interfaceC4053a = this.f326452f;
        LN0.a aVar = this.f326454h;
        if (!zF2 && str2 != null) {
            interfaceC4053a.J(aVar.a(new ClientRoomArguments(clientRoomDeeplink.f326434b, clientRoomDeeplink.f326435c, clientRoomDeeplink.f326437e, null, 8, null)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
            return;
        }
        interfaceC4053a.R(this.f326455i.b(new BeduinV2PageDeepLink("/api/1/vdr/beduin/main-screen?fromPage=direct&updatePush=true", "VdrMainScreen", false, false, false, null, null, null, false, 480, null), null), com.avito.android.deeplink_handler.view.b.f134588l);
        interfaceC4053a.R(aVar.a(new ClientRoomArguments(clientRoomDeeplink.f326434b, clientRoomDeeplink.f326435c, clientRoomDeeplink.f326437e, null, 8, null)), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(2, this, i.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new a(C40483b.a(this.f326453g), this)), this.f326456j);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f326456j, null);
    }
}
