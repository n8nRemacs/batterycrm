package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$6", f = "RatingDetailsActor.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class D extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247196q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247197r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247198s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247199t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247200u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247198s = c34175a;
        this.f247199t = bVar;
        this.f247200u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        com.avito.android.rating.details.mvi.entity.b bVar = this.f247199t;
        D d12 = new D(this.f247198s, this.f247200u, bVar, continuation);
        d12.f247197r = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((D) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        SearchParametersEntry.SearchParametersBlock.InlineBoolFilter inlineBoolFilter;
        List<RatingAspectsEntry.Aspect> options;
        Long selectedOption;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247196q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247197r;
            String str = ((a.l) this.f247200u).f247398a;
            int i13 = C34175a.f247271j;
            C34175a c34175a = this.f247198s;
            c34175a.getClass();
            com.avito.android.rating.details.mvi.entity.b bVar = this.f247199t;
            List<SearchParametersEntry.SearchParametersBlock> list = bVar.f247425h;
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof SearchParametersEntry.SearchParametersBlock.InlineBoolFilter) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((SearchParametersEntry.SearchParametersBlock.InlineBoolFilter) next).getParamName(), str)) {
                        break;
                    }
                }
                inlineBoolFilter = (SearchParametersEntry.SearchParametersBlock.InlineBoolFilter) next;
            } else {
                inlineBoolFilter = null;
            }
            if (inlineBoolFilter == null) {
                return G0.f406611a;
            }
            Boolean selected = inlineBoolFilter.getSelected();
            if (selected == null) {
                return G0.f406611a;
            }
            boolean z12 = !selected.booleanValue();
            String paramName = inlineBoolFilter.getParamName();
            String strValueOf = String.valueOf(z12);
            RatingAspectsEntry ratingAspectsEntry = bVar.f247424g;
            String paramName2 = ratingAspectsEntry != null ? ratingAspectsEntry.getParamName() : null;
            String string = (ratingAspectsEntry == null || (selectedOption = ratingAspectsEntry.getSelectedOption()) == null) ? null : selectedOption.toString();
            String analyticsParamName = inlineBoolFilter.getAnalyticsParamName();
            if (ratingAspectsEntry != null && (options = ratingAspectsEntry.getOptions()) != null) {
                List<RatingAspectsEntry.Aspect> list2 = options;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boxing.boxLong(((RatingAspectsEntry.Aspect) it2.next()).getValue()));
                }
            }
            InterfaceC43160i interfaceC43160iG = c34175a.f247272a.g((13311 & 1) != 0 ? null : bVar.f247425h, (13311 & 2) != 0 ? null : paramName, (13311 & 4) != 0 ? null : strValueOf, (13311 & 8) != 0 ? null : paramName2, (13311 & 16) != 0 ? null : string, (13311 & 32) != 0 ? null : null, (13311 & 64) != 0 ? null : analyticsParamName, (13311 & 128) != 0 ? false : true, (13311 & 256) != 0 ? false : false, (13311 & 512) != 0 ? null : arrayList, bVar.f247426i, false, (13311 & 4096) != 0 ? null : this.f247200u, (13311 & 8192) != 0 ? false : false);
            this.f247196q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
