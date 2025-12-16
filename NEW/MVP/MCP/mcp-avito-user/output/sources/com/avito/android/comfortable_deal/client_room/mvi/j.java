package com.avito.android.comfortable_deal.client_room.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.huawei.hms.adapter.internal.AvailableCode;
import ep.InterfaceC40139a;
import fp.c;
import fp.e;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lfp/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements com.avito.android.arch.mvi.b<fp.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40139a f119907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.review.data_source.a f119908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ClientRoomArguments f119909c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.client_room.q f119910d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f119911e;

    /* compiled from: ClientRoomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lfp/e;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.mvi.ClientRoomBootstrap$produce$1", f = "ClientRoomBootstrap.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super fp.e>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119912q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f119913r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f119913r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super fp.e> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119912q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f119913r;
                j jVar = j.this;
                if (jVar.f119911e) {
                    return G0.f406611a;
                }
                jVar.f119911e = true;
                fp.c cVarA = jVar.f119910d.a(jVar.f119909c.f119869c);
                jVar.f119907a.d(cVarA instanceof c.b);
                e.a aVar = new e.a(cVarA, jVar.f119908b.a());
                this.f119912q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
    public j(@Y61.k InterfaceC40139a interfaceC40139a, @Y61.k com.avito.android.review.data_source.a aVar, @Y61.k ClientRoomArguments clientRoomArguments, @Y61.k com.avito.android.comfortable_deal.client_room.q qVar) {
        this.f119907a = interfaceC40139a;
        this.f119908b = aVar;
        this.f119909c = clientRoomArguments;
        this.f119910d = qVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<fp.e> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
