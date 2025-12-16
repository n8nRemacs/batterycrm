package com.avito.android.comfortable_deal.clients;

import com.avito.android.R;
import com.avito.android.comfortable_deal.clients.ClientsFragment;
import com.avito.android.comfortable_deal.deal.DealFragment;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kp.InterfaceC43480f;

/* compiled from: ClientsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.ClientsFragment$HandleEvents$1", f = "ClientsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.comfortable_deal.clients.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29425a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f120168q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f120169r;

    /* compiled from: ClientsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkp/f;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkp/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.ClientsFragment$HandleEvents$1$1", f = "ClientsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.clients.a$a, reason: collision with other inner class name */
    public static final class C3527a extends SuspendLambda implements Y41.p<InterfaceC43480f, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f120170q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ClientsFragment f120171r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3527a(ClientsFragment clientsFragment, Continuation<? super C3527a> continuation) {
            super(2, continuation);
            this.f120171r = clientsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3527a c3527a = new C3527a(this.f120171r, continuation);
            c3527a.f120170q = obj;
            return c3527a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43480f interfaceC43480f, Continuation<? super G0> continuation) {
            return ((C3527a) create(interfaceC43480f, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC43480f interfaceC43480f = (InterfaceC43480f) this.f120170q;
            boolean z12 = interfaceC43480f instanceof InterfaceC43480f.b;
            ClientsFragment clientsFragment = this.f120171r;
            if (z12) {
                DealFragment.a aVar = DealFragment.f120940y0;
                DealArguments.DealIdArguments dealIdArguments = new DealArguments.DealIdArguments(((InterfaceC43480f.b) interfaceC43480f).f413206a);
                aVar.getClass();
                DealFragment dealFragmentA = DealFragment.a.a(dealIdArguments);
                androidx.fragment.app.H hE2 = clientsFragment.getParentFragmentManager().e();
                hE2.n(R.id.fragment_container, dealFragmentA, null);
                hE2.c("DealFragment");
                hE2.e();
            } else if (interfaceC43480f instanceof InterfaceC43480f.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = clientsFragment.f120097r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC43480f.a) interfaceC43480f).f413205a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29425a(ClientsFragment clientsFragment, Continuation<? super C29425a> continuation) {
        super(2, continuation);
        this.f120169r = clientsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29425a c29425a = new C29425a(this.f120169r, continuation);
        c29425a.f120168q = obj;
        return c29425a;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C29425a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f120168q;
        ClientsFragment.a aVar = ClientsFragment.f120092u0;
        ClientsFragment clientsFragment = this.f120169r;
        C43175k.K(new C43197r1(new C3527a(clientsFragment, null), clientsFragment.r5().getEvents()), t12);
        return G0.f406611a;
    }
}
