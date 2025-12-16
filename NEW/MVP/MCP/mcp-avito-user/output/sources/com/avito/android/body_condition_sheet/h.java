package com.avito.android.body_condition_sheet;

import Nj.InterfaceC14580a;
import com.avito.android.body_condition_sheet.BodyConditionSheetActivity;
import com.avito.android.deep_linking.links.BodyConditionSide;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BodyConditionSheetActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/BodyConditionSide;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/BodyConditionSide;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.body_condition_sheet.BodyConditionSheetActivity$observeViewsClicks$3", f = "BodyConditionSheetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<BodyConditionSide, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f106878q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BodyConditionSheetActivity f106879r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BodyConditionSheetActivity bodyConditionSheetActivity, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f106879r = bodyConditionSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f106879r, continuation);
        hVar.f106878q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(BodyConditionSide bodyConditionSide, Continuation<? super G0> continuation) {
        return ((h) create(bodyConditionSide, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        BodyConditionSide bodyConditionSide = (BodyConditionSide) this.f106878q;
        BodyConditionSheetActivity.a aVar = BodyConditionSheetActivity.f106832w;
        this.f106879r.a2().accept(new InterfaceC14580a.e(bodyConditionSide));
        return G0.f406611a;
    }
}
