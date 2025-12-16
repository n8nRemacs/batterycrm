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
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$5", f = "RatingDetailsActor.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class C extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247191q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247192r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247194t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247195u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247193s = c34175a;
        this.f247194t = bVar;
        this.f247195u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        com.avito.android.rating.details.mvi.entity.b bVar = this.f247194t;
        C c12 = new C(this.f247193s, this.f247195u, bVar, continuation);
        c12.f247192r = obj;
        return c12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        List<RatingAspectsEntry.Aspect> options;
        Long selectedOption;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247191q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247192r;
            C34175a c34175a = this.f247193s;
            com.avito.android.rating.details.mvi.entity.b bVar = this.f247194t;
            SearchParametersEntry.SearchParametersBlock.Sort sortC = C34175a.c(c34175a, bVar);
            if (sortC == null) {
                return G0.f406611a;
            }
            String selectedOption2 = sortC.getSelectedOption();
            a.C c12 = (a.C) this.f247195u;
            if (kotlin.jvm.internal.L.f(selectedOption2, c12.f247382a)) {
                return G0.f406611a;
            }
            String paramName = sortC.getParamName();
            String str = c12.f247382a;
            RatingAspectsEntry ratingAspectsEntry = bVar.f247424g;
            String paramName2 = ratingAspectsEntry != null ? ratingAspectsEntry.getParamName() : null;
            String string = (ratingAspectsEntry == null || (selectedOption = ratingAspectsEntry.getSelectedOption()) == null) ? null : selectedOption.toString();
            String analyticsParamName = sortC.getAnalyticsParamName();
            if (ratingAspectsEntry == null || (options = ratingAspectsEntry.getOptions()) == null) {
                arrayList = null;
            } else {
                List<RatingAspectsEntry.Aspect> list = options;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boxing.boxLong(((RatingAspectsEntry.Aspect) it.next()).getValue()));
                }
                arrayList = arrayList2;
            }
            InterfaceC43160i interfaceC43160iG = c34175a.f247272a.g((13311 & 1) != 0 ? null : bVar.f247425h, (13311 & 2) != 0 ? null : paramName, (13311 & 4) != 0 ? null : str, (13311 & 8) != 0 ? null : paramName2, (13311 & 16) != 0 ? null : string, (13311 & 32) != 0 ? null : null, (13311 & 64) != 0 ? null : analyticsParamName, (13311 & 128) != 0 ? false : false, (13311 & 256) != 0 ? false : false, (13311 & 512) != 0 ? null : arrayList, bVar.f247426i, false, (13311 & 4096) != 0 ? null : this.f247195u, (13311 & 8192) != 0 ? false : false);
            this.f247191q = 1;
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
