package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.util.O2;
import gm.C40705b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleBlocksResolver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl$loadImages$2", f = "CampaignsSaleBlocksResolver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class C extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f114063q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List<C40705b> f114064r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114065s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f114066t;

    /* compiled from: CampaignsSaleBlocksResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl$loadImages$2$2$1", f = "CampaignsSaleBlocksResolver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super InterfaceC43160i<? extends CampaignsSaleInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ D f114067q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C40705b f114068r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D d12, C40705b c40705b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f114067q = d12;
            this.f114068r = c40705b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f114067q, this.f114068r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super InterfaceC43160i<? extends CampaignsSaleInternalAction>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.campaigns_sale.network.a aVar = this.f114067q.f114069a;
            C40705b c40705b = this.f114068r;
            return aVar.c(c40705b.f396773b, C42745f0.E0(c40705b.f396777f, 20));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d12, ArrayList arrayList, List list, Continuation continuation) {
        super(2, continuation);
        this.f114064r = list;
        this.f114065s = arrayList;
        this.f114066t = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C c12 = new C(this.f114066t, this.f114065s, this.f114064r, continuation);
        c12.f114063q = obj;
        return c12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f114063q;
        List<C40705b> list = this.f114064r;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            C40705b c40705b = (C40705b) obj2;
            if (c40705b.f396778g == null && O2.a(c40705b.f396777f)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C40705b c40705b2 = (C40705b) it.next();
            if (c40705b2.f396777f != null) {
                this.f114065s.add(C43259k.b(t12, null, new a(this.f114066t, c40705b2, null), 3));
            }
        }
        return G0.f406611a;
    }
}
