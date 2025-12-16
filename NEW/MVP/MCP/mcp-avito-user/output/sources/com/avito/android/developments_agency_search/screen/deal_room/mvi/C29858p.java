package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
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

/* compiled from: DealRoomBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/p;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29858p implements com.avito.android.arch.mvi.b<DealRoomInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f137714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f137715b;

    /* compiled from: DealRoomBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomBootstrap$produce$1", f = "DealRoomBootstrap.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.p$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137716q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137717r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C29858p.this.new a(continuation);
            aVar.f137717r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137716q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137717r;
                C29858p c29858p = C29858p.this;
                if (c29858p.f137715b) {
                    return G0.f406611a;
                }
                c29858p.f137715b = true;
                InterfaceC43160i<DealRoomInternalAction> interfaceC43160iB = c29858p.f137714a.b(true);
                this.f137716q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
    public C29858p(@Y61.k u uVar) {
        this.f137714a = uVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DealRoomInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
