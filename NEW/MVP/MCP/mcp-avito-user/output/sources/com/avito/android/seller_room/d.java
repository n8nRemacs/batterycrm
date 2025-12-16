package com.avito.android.seller_room;

import Y41.p;
import Y61.k;
import Y61.l;
import Yq0.InterfaceC18319a;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
import com.avito.android.seller_room.ui.SellerRoomOpenParams;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SellerRoomInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/d;", "", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f268108a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC18319a f268109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<Gson> f268110c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SellerRoomOpenParams f268111d;

    /* compiled from: SellerRoomInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_room.SellerRoomInteractor$load$1", f = "SellerRoomInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268112q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f268113r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f268113r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
                int r1 = r7.f268112q
                com.avito.android.seller_room.d r2 = com.avito.android.seller_room.d.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto La0
            L24:
                java.lang.Object r1 = r7.f268113r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L2c:
                java.lang.Object r1 = r7.f268113r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f268113r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$StartLoading r1 = new com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$StartLoading
                r1.<init>()
                r7.f268113r = r8
                r7.f268112q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                Yq0.a r8 = r2.f268109b
                com.avito.android.seller_room.ui.SellerRoomOpenParams r6 = r2.f268111d
                java.lang.String r6 = r6.f268237b
                r7.f268113r = r1
                r7.f268112q = r5
                java.lang.Object r8 = r8.a(r6, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                r6 = 0
                if (r5 == 0) goto L7a
                com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$Error r2 = new com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                r2.<init>(r8)
                r7.f268113r = r6
                r7.f268112q = r4
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La0
                return r0
            L7a:
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto La0
                h31.e<com.google.gson.Gson> r2 = r2.f268110c
                java.lang.Object r2 = r2.get()
                com.google.gson.Gson r2 = (com.google.gson.Gson) r2
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                java.lang.String r8 = r2.l(r8)
                com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$ContentLoaded r2 = new com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction$ContentLoaded
                r2.<init>(r8)
                r7.f268113r = r6
                r7.f268112q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La0
                return r0
            La0:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_room.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@k R0 r02, @k InterfaceC18319a interfaceC18319a, @k h31.e<Gson> eVar, @k SellerRoomOpenParams sellerRoomOpenParams) {
        this.f268108a = r02;
        this.f268109b = interfaceC18319a;
        this.f268110c = eVar;
        this.f268111d = sellerRoomOpenParams;
    }

    @k
    public final InterfaceC43160i<SellerRoomInternalAction> a() {
        return C43175k.I(this.f268108a.a(), C43175k.G(new a(null)));
    }
}
