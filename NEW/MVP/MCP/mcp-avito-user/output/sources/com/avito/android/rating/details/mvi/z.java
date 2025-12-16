package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
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
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$2", f = "RatingDetailsActor.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class z extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247514q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247517t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34175a f247518u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247516s = bVar;
        this.f247517t = aVar;
        this.f247518u = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        z zVar = new z(this.f247518u, this.f247517t, this.f247516s, continuation);
        zVar.f247515r = obj;
        return zVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((z) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247514q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247515r;
            com.avito.android.rating.details.mvi.entity.b bVar = this.f247516s;
            RatingAspectsEntry ratingAspectsEntry = bVar.f247424g;
            if (ratingAspectsEntry == null) {
                return G0.f406611a;
            }
            a.C34180b c34180b = (a.C34180b) this.f247517t;
            Long lBoxLong = Boxing.boxLong(c34180b.f247385a);
            lBoxLong.getClass();
            Long selectedOption = bVar.f247424g.getSelectedOption();
            long j12 = c34180b.f247385a;
            if (selectedOption != null && selectedOption.longValue() == j12) {
                lBoxLong = null;
            }
            com.avito.android.rating.details.interactor.e eVar = this.f247518u.f247272a;
            String paramName = ratingAspectsEntry.getParamName();
            String string = lBoxLong != null ? lBoxLong.toString() : null;
            String analyticsParamName = ratingAspectsEntry.getAnalyticsParamName();
            long j13 = c34180b.f247385a;
            List<RatingAspectsEntry.Aspect> options = ratingAspectsEntry.getOptions();
            ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxLong(((RatingAspectsEntry.Aspect) it.next()).getValue()));
            }
            InterfaceC43160i interfaceC43160iG = eVar.g((13311 & 1) != 0 ? null : bVar.f247425h, (13311 & 2) != 0 ? null : null, (13311 & 4) != 0 ? null : null, (13311 & 8) != 0 ? null : paramName, (13311 & 16) != 0 ? null : string, (13311 & 32) != 0 ? null : Boxing.boxLong(j13), (13311 & 64) != 0 ? null : analyticsParamName, (13311 & 128) != 0 ? false : false, (13311 & 256) != 0 ? false : true, (13311 & 512) != 0 ? null : arrayList, bVar.f247426i, false, (13311 & 4096) != 0 ? null : this.f247517t, (13311 & 8192) != 0 ? false : false);
            this.f247514q = 1;
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
