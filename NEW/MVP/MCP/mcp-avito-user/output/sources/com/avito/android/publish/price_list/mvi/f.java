package com.avito.android.publish.price_list.mvi;

import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ve0.AbstractC49316a;

/* compiled from: SelectPriceListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowContent;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowContent;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListActor$transformToInternalAction$1$showContentInternalActionFlow$1", f = "SelectPriceListActor.kt", i = {0}, l = {190, 192}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements Y41.p<SelectPriceListInternalAction.ShowContent, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238861q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f238862r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<SelectPriceListInternalAction> f238863s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC49316a f238864t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f238865u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, AbstractC49316a abstractC49316a, h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f238863s = interfaceC43172j;
        this.f238864t = abstractC49316a;
        this.f238865u = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f238863s, this.f238864t, this.f238865u, continuation);
        fVar.f238862r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(SelectPriceListInternalAction.ShowContent showContent, Continuation<? super G0> continuation) {
        return ((f) create(showContent, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        SelectPriceListInternalAction.ShowContent showContent;
        String f117611e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238861q;
        InterfaceC43172j<SelectPriceListInternalAction> interfaceC43172j = this.f238863s;
        if (i12 == 0) {
            C42729a0.b(obj);
            showContent = (SelectPriceListInternalAction.ShowContent) this.f238862r;
            String str = ((AbstractC49316a.c) this.f238864t).f440915a;
            if (str == null) {
                str = "";
            }
            SelectPriceListInternalAction.ShowErrorMessage showErrorMessage = new SelectPriceListInternalAction.ShowErrorMessage(str);
            this.f238862r = showContent;
            this.f238861q = 1;
            if (interfaceC43172j.emit(showErrorMessage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            showContent = (SelectPriceListInternalAction.ShowContent) this.f238862r;
            C42729a0.b(obj);
        }
        com.avito.android.publish.price_list.domain.use_case.e eVar = this.f238865u.f238880j;
        List<com.avito.conveyor_item.a> list = showContent.f238810e;
        eVar.getClass();
        Iterator<com.avito.conveyor_item.a> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            com.avito.conveyor_item.a next = it.next();
            if ((next instanceof com.avito.android.items.e) && (f117611e = ((com.avito.android.items.e) next).getF117611e()) != null && !C43066x.K(f117611e)) {
                break;
            }
            i13++;
        }
        Integer numValueOf = i13 != -1 ? Integer.valueOf(i13) : null;
        if (numValueOf != null) {
            SelectPriceListInternalAction.ScrollToFirstItemError scrollToFirstItemError = new SelectPriceListInternalAction.ScrollToFirstItemError(numValueOf.intValue());
            this.f238862r = null;
            this.f238861q = 2;
            if (interfaceC43172j.emit(scrollToFirstItemError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
