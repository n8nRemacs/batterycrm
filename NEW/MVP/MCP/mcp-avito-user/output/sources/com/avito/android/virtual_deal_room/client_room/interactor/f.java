package com.avito.android.virtual_deal_room.client_room.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/interactor/f;", "Lcom/avito/android/virtual_deal_room/client_room/interactor/e;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IN0.a f326293a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f326294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.virtual_deal_room.client_room.interactor.a f326295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ClientRoomArguments f326296d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f326297e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f326298f;

    /* compiled from: ClientRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.interactor.ClientRoomInteractorImpl$handleEditResult$1", f = "ClientRoomInteractor.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ClientRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326299q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326300r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ClientEditDeeplink.b f326301s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f326302t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ f f326303u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClientEditDeeplink.b bVar, String str, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326301s = bVar;
            this.f326302t = str;
            this.f326303u = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f326301s, this.f326302t, this.f326303u, continuation);
            aVar.f326300r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ClientRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326299q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f326300r;
                ClientEditDeeplink.b bVar = this.f326301s;
                if (bVar instanceof ClientEditDeeplink.b.C10089b) {
                    ClientEditDeeplink.b.C10089b c10089b = (ClientEditDeeplink.b.C10089b) bVar;
                    if (L.f(c10089b.f326428b, this.f326302t)) {
                        String str = c10089b.f326429c;
                        String str2 = c10089b.f326430d;
                        String str3 = c10089b.f326431e;
                        f fVar = this.f326303u;
                        String strC = f.c(fVar, str, str2, str3);
                        String str4 = c10089b.f326429c;
                        String str5 = c10089b.f326430d;
                        String str6 = c10089b.f326431e;
                        if (C43066x.K(str6)) {
                            str6 = null;
                        }
                        String str7 = str6;
                        ClientRoomInternalAction.ClientEdited clientEdited = new ClientRoomInternalAction.ClientEdited(strC, str4, str5, str7, fVar.f326297e.a(c10089b.f326432f), c10089b.f326433g);
                        this.f326299q = 1;
                        if (interfaceC43172j.emit(clientEdited, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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
    public f(@k IN0.a aVar, @k R0 r02, @k com.avito.android.virtual_deal_room.client_room.interactor.a aVar2, @k ClientRoomArguments clientRoomArguments, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f326293a = aVar;
        this.f326294b = r02;
        this.f326295c = aVar2;
        this.f326296d = clientRoomArguments;
        this.f326297e = interfaceC35945t1;
    }

    public static final String c(f fVar, String str, String str2, String str3) {
        fVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !C43066x.K(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        if (str2 != null && !C43066x.K(str2)) {
            sb2.append(str2);
            sb2.append(" ");
        }
        if (str3 != null && !C43066x.K(str3)) {
            sb2.append(str3);
            sb2.append(" ");
        }
        return C43066x.A0(sb2).toString();
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.e
    @k
    public final InterfaceC43160i a(boolean z12, @l DN0.b bVar) {
        return C43175k.G(new g(this, z12, bVar, null));
    }

    @Override // com.avito.android.virtual_deal_room.client_room.interactor.e
    @k
    public final InterfaceC43160i<ClientRoomInternalAction> b(@k ClientEditDeeplink.b bVar, @l String str) {
        return C43175k.G(new a(bVar, str, this, null));
    }
}
