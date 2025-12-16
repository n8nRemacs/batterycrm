package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Bw.InterfaceC13195c;
import Qw.InterfaceC14939a;
import android.content.ContentResolver;
import android.net.Uri;
import ax.C24189a;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.UploadDealDocumentResponse;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import cx.C39430a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sw.InterfaceC48423a;

/* compiled from: DealRoomInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/v;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/u;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48423a f137728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f137729b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f137730c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Ow.d f137731d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f137732e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13195c f137733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DealRoomArguments f137734g;

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$deleteDealDocument$1", f = "DealRoomInteractor.kt", i = {0, 1, 1}, l = {282, 288, 290, 298}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C24189a f137735q;

        /* renamed from: r, reason: collision with root package name */
        public int f137736r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f137737s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f137739u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f137740v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f137741w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f137739u = str;
            this.f137740v = str2;
            this.f137741w = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = v.this.new a(this.f137739u, this.f137740v, this.f137741w, continuation);
            aVar.f137737s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f137736r
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L36
                if (r1 == r6) goto L2e
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                kotlin.C42729a0.b(r11)
                goto Lbb
            L24:
                ax.a r1 = r10.f137735q
                java.lang.Object r3 = r10.f137737s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r11)
                goto L77
            L2e:
                java.lang.Object r1 = r10.f137737s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L51
            L36:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f137737s
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.developments_agency_search.screen.deal_room.mvi.v r1 = com.avito.android.developments_agency_search.screen.deal_room.mvi.v.this
                Qw.a r1 = r1.f137729b
                r10.f137737s = r11
                r10.f137736r = r6
                java.lang.String r8 = r10.f137739u
                java.lang.Object r1 = r1.j(r7, r8, r10)
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r9 = r1
                r1 = r11
                r11 = r9
            L51:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r8 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r8 == 0) goto L91
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                ax.a r11 = (ax.C24189a) r11
                com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$g r3 = new com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$g
                java.lang.String r6 = r10.f137740v
                java.lang.String r8 = r10.f137741w
                r3.<init>(r6, r8)
                r10.f137737s = r1
                r10.f137735q = r11
                r10.f137736r = r5
                java.lang.Object r3 = r1.emit(r3, r10)
                if (r3 != r0) goto L75
                return r0
            L75:
                r3 = r1
                r1 = r11
            L77:
                com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$o r11 = new com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$o
                java.lang.String r1 = r1.getMessage()
                com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.f(r1)
                r11.<init>(r1, r2)
                r10.f137737s = r7
                r10.f137735q = r7
                r10.f137736r = r4
                java.lang.Object r11 = r3.emit(r11, r10)
                if (r11 != r0) goto Lbb
                return r0
            L91:
                boolean r4 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lbe
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r4 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.C35936s.a(r4, r11)
                com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$o r11 = new com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$o
                r4 = 2131953254(0x7f130666, float:1.9542974E38)
                java.io.Serializable[] r2 = new java.io.Serializable[r2]
                com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.c(r4, r2)
                r11.<init>(r2, r6)
                r10.f137737s = r7
                r10.f137736r = r3
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto Lbb
                return r0
            Lbb:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Lbe:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.mvi.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$getToDealStatus$1", f = "DealRoomInteractor.kt", i = {0}, l = {312, 317, 319}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137742q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137743r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f137745t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f137745t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = v.this.new b(this.f137745t, continuation);
            bVar.f137743r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137742q;
            v vVar = v.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f137743r;
                InterfaceC14939a interfaceC14939a = vVar.f137729b;
                this.f137743r = interfaceC43172j;
                this.f137742q = 1;
                obj = interfaceC14939a.k(this.f137745t, null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f137743r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                InterfaceC43160i<DealRoomInternalAction> interfaceC43160iB = vVar.b(false);
                this.f137743r = null;
                this.f137742q = 2;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                DealRoomInternalAction.o oVar = new DealRoomInternalAction.o(com.avito.android.printable_text.b.c(R.string.das_deal_room_booking_stage_error_on_getting_to_deal_toast, new Serializable[0]), true);
                this.f137743r = null;
                this.f137742q = 3;
                if (interfaceC43172j.emit(oVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$loadScreenInfo$1", f = "DealRoomInteractor.kt", i = {0, 1, 2, 3, 3}, l = {84, 86, 88, 96, 99, 103}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$0", "L$2"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public v f137746q;

        /* renamed from: r, reason: collision with root package name */
        public GetDealRoomInfoResponse f137747r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f137748s;

        /* renamed from: t, reason: collision with root package name */
        public int f137749t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f137750u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f137752w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f137752w = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = v.this.new c(this.f137752w, continuation);
            cVar.f137750u = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.mvi.v.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$sendDealForVerification$1", f = "DealRoomInteractor.kt", i = {0}, l = {333, 338, 340}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137753q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137754r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f137756t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f137756t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = v.this.new d(this.f137756t, continuation);
            dVar.f137754r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137753q;
            v vVar = v.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f137754r;
                InterfaceC14939a interfaceC14939a = vVar.f137729b;
                this.f137754r = interfaceC43172j;
                this.f137753q = 1;
                obj = interfaceC14939a.g(this.f137756t, null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f137754r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                InterfaceC43160i<DealRoomInternalAction> interfaceC43160iB = vVar.b(false);
                this.f137754r = null;
                this.f137753q = 2;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                DealRoomInternalAction.o oVar = new DealRoomInternalAction.o(com.avito.android.printable_text.b.c(R.string.das_deal_room_deal_stage_error_on_send_for_verification_toast, new Serializable[0]), true);
                this.f137754r = null;
                this.f137753q = 3;
                if (interfaceC43172j.emit(oVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$updateClientInfo$1", f = "DealRoomInteractor.kt", i = {0, 1, 2, 2, 3, 6}, l = {167, 169, 179, 182, 183, 187, 191, 192}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public com.avito.android.developments_agency_search.screen.deal_room.edit_client.e f137757q;

        /* renamed from: r, reason: collision with root package name */
        public C39430a f137758r;

        /* renamed from: s, reason: collision with root package name */
        public int f137759s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f137760t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.developments_agency_search.screen.deal_room.edit_client.e f137762v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f137762v = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = v.this.new e(this.f137762v, continuation);
            eVar.f137760t = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0115 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.mvi.v.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$updateDealNote$1", f = "DealRoomInteractor.kt", i = {1, 2, 3, 4, 6}, l = {137, 141, 143, 149, 150, 151, 159, 160}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f137763q;

        /* renamed from: r, reason: collision with root package name */
        public String f137764r;

        /* renamed from: s, reason: collision with root package name */
        public int f137765s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f137766t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f137767u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f137768v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ v f137769w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f137770x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v vVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f137767u = str;
            this.f137768v = str2;
            this.f137769w = vVar;
            this.f137770x = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f137769w, this.f137767u, this.f137768v, this.f137770x, continuation);
            fVar.f137766t = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0106 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.mvi.v.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealRoomInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$uploadDealDocument$1", f = "DealRoomInteractor.kt", i = {1, 1, 2, 3, 3, 5}, l = {206, 220, 226, 244, 250, 260, 266}, m = "invokeSuspend", n = {"$this$flow", "fileName", "$this$flow", "$this$flow", "response", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$0", "L$5", "L$0"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ String f137771A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f137772B;

        /* renamed from: q, reason: collision with root package name */
        public Object f137773q;

        /* renamed from: r, reason: collision with root package name */
        public String f137774r;

        /* renamed from: s, reason: collision with root package name */
        public String f137775s;

        /* renamed from: t, reason: collision with root package name */
        public Uri f137776t;

        /* renamed from: u, reason: collision with root package name */
        public UploadDealDocumentResponse f137777u;

        /* renamed from: v, reason: collision with root package name */
        public int f137778v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f137779w;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Uri f137781y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f137782z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri, String str, String str2, String str3, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f137781y = uri;
            this.f137782z = str;
            this.f137771A = str2;
            this.f137772B = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = v.this.new g(this.f137781y, this.f137782z, this.f137771A, this.f137772B, continuation);
            gVar.f137779w = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0161 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x020b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 554
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_room.mvi.v.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public v(@Y61.k InterfaceC48423a interfaceC48423a, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k R0 r02, @Y61.k Ow.d dVar, @Y61.k ContentResolver contentResolver, @Y61.k InterfaceC13195c interfaceC13195c, @Y61.k DealRoomArguments dealRoomArguments) {
        this.f137728a = interfaceC48423a;
        this.f137729b = interfaceC14939a;
        this.f137730c = r02;
        this.f137731d = dVar;
        this.f137732e = contentResolver;
        this.f137733f = interfaceC13195c;
        this.f137734g = dealRoomArguments;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> a(@Y61.k com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new e(eVar, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> b(boolean z12) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new c(z12, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> c(@Y61.k String str) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new d(str, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i d(@Y61.k Uri uri, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new g(uri, str, str3, str2, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new a(str, str2, str3, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> f(@Y61.k String str) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new b(str, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.u
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> g(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return C43175k.I(this.f137730c.a(), C43175k.G(new f(this, str2, str3, str, null)));
    }
}
