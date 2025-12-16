package com.avito.android.publish.slots.address_from_profile.publish_item;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;

/* compiled from: AddressListPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.publish_item.AddressListPresenterImpl$setup$4", f = "AddressListPresenter.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242898q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f242899r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.publish_item.a f242900s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f242901t;

    /* compiled from: AddressListPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/k;", "clickedItem", "Lkotlin/G0;", "emit", "(Lcom/avito/android/publish/slots/address_from_profile/publish_item/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f242902b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.publish_item.a f242903c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f242904d;

        public a(i iVar, com.avito.android.publish.slots.address_from_profile.publish_item.a aVar, r rVar) {
            this.f242902b = iVar;
            this.f242903c = aVar;
            this.f242904d = rVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            List<k> list;
            k kVar = (k) obj;
            i iVar = this.f242902b;
            o oVar = iVar.f242912h;
            List<k> list2 = oVar.f242936a;
            List<k> list3 = null;
            if (list2 != null) {
                Q qA2 = o.a(oVar.f242940e, kVar, list2);
                oVar.f242940e = ((Number) qA2.f406619b).intValue();
                list = (List) qA2.f406620c;
            } else {
                list = null;
            }
            oVar.f242936a = list;
            List<k> listB = oVar.b();
            if (listB != null) {
                Q qA3 = o.a(oVar.f242939d, kVar, listB);
                oVar.f242939d = ((Number) qA3.f406619b).intValue();
                list3 = (List) qA3.f406620c;
            }
            oVar.f242937b = list3;
            iVar.f242913i.K5(kVar);
            List<k> listB2 = iVar.f242912h.b();
            com.avito.android.publish.slots.address_from_profile.publish_item.a aVar = this.f242903c;
            if (listB2 != null) {
                aVar.V40(listB2);
            }
            aVar.wK(this.f242904d.f242952i, false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, com.avito.android.publish.slots.address_from_profile.publish_item.a aVar, r rVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f242899r = iVar;
        this.f242900s = aVar;
        this.f242901t = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f242899r, this.f242900s, this.f242901t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242898q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i iVar = this.f242899r;
            d2<k> d2Var = iVar.f242906b;
            a aVar = new a(iVar, this.f242900s, this.f242901t);
            this.f242898q = 1;
            if (d2Var.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
