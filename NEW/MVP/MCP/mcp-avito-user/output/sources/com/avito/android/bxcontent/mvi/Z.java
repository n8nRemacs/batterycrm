package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.serp.adapter.LayoutType;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getLocation$5", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class Z extends SuspendLambda implements Y41.p<BxContentInternalAction, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111504q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f111505r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PresentationType f111506s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f111507t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SerpSpaceType f111508u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SearchParams f111509v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f111510w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LayoutType f111511x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f111512y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(F f12, PresentationType presentationType, String str, SerpSpaceType serpSpaceType, SearchParams searchParams, String str2, LayoutType layoutType, String str3, Continuation<? super Z> continuation) {
        super(2, continuation);
        this.f111505r = f12;
        this.f111506s = presentationType;
        this.f111507t = str;
        this.f111508u = serpSpaceType;
        this.f111509v = searchParams;
        this.f111510w = str2;
        this.f111511x = layoutType;
        this.f111512y = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Z z12 = new Z(this.f111505r, this.f111506s, this.f111507t, this.f111508u, this.f111509v, this.f111510w, this.f111511x, this.f111512y, continuation);
        z12.f111504q = obj;
        return z12;
    }

    @Override // Y41.p
    public final Object invoke(BxContentInternalAction bxContentInternalAction, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((Z) create(bxContentInternalAction, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        BxContentInternalAction bxContentInternalAction = (BxContentInternalAction) this.f111504q;
        if (!(bxContentInternalAction instanceof BxContentInternalAction.LocationLoaded)) {
            return bxContentInternalAction instanceof BxContentInternalAction.LocationLoading ? true : bxContentInternalAction instanceof BxContentInternalAction.Error ? new C43210w(bxContentInternalAction) : C43175k.w();
        }
        C43210w c43210w = new C43210w(bxContentInternalAction);
        BxContentInternalAction.LocationLoaded locationLoaded = (BxContentInternalAction.LocationLoaded) bxContentInternalAction;
        return C43175k.N(c43210w, this.f111505r.e(new C.c(locationLoaded.f111910b.getId(), Boxing.boxBoolean(locationLoaded.f111910b.getForcedByUser()), null, null, this.f111506s, this.f111507t, this.f111508u, 12, null), new C.b(null, 0, 0, locationLoaded.f111910b, null, false, this.f111509v, this.f111506s, this.f111507t, this.f111510w, this.f111511x, this.f111512y, null, null, null, null, null, null, null, null, 786487, null)));
    }
}
