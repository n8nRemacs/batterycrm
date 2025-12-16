package com.avito.android.publish.price_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.price_list.PriceListGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectPriceListBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.arch.mvi.b<SelectPriceListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.c f238895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.o f238896b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.a f238897c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<String> f238898d;

    /* compiled from: SelectPriceListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListBootstrap$produce$1", f = "SelectPriceListBootstrap.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectPriceListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f238899q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f238900r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f238900r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f238899q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f238900r;
                j jVar = j.this;
                Set<String> set = jVar.f238898d;
                com.avito.android.publish.price_list.domain.c cVar = jVar.f238895a;
                String f238535d = cVar.getF238535d();
                com.avito.android.publish.price_list.domain.a aVar = jVar.f238897c;
                CategoryPublishStep categoryPublishStepRe = aVar.f238528a.re(aVar.f238529b);
                CategoryPublishStep.PriceList priceList = categoryPublishStepRe instanceof CategoryPublishStep.PriceList ? (CategoryPublishStep.PriceList) categoryPublishStepRe : null;
                SelectPriceListInternalAction.InitUiState initUiState = new SelectPriceListInternalAction.InitUiState(f238535d, priceList != null ? priceList.getSubtitle() : null, set, cVar.getF238537f());
                this.f238899q = 1;
                if (interfaceC43172j.emit(initUiState, this) == coroutine_suspended) {
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
    public j(@Y61.k com.avito.android.publish.price_list.domain.c cVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.o oVar, @Y61.k com.avito.android.publish.price_list.domain.a aVar) {
        Set<String> setP0;
        this.f238895a = cVar;
        this.f238896b = oVar;
        this.f238897c = aVar;
        List<PriceListGroup> groups = cVar.getGroups();
        if (groups != null) {
            List<PriceListGroup> list = groups;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PriceListGroup) it.next()).getTitle());
            }
            setP0 = C42745f0.P0(arrayList);
        } else {
            setP0 = null;
        }
        this.f238898d = setP0 == null ? B0.f406639b : setP0;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectPriceListInternalAction> a() {
        return new C43137a0(new a(null), this.f238896b.a(this.f238898d));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
