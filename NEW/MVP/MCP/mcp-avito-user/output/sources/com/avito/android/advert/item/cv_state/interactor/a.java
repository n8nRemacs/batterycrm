package com.avito.android.advert.item.cv_state.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import Zf.InterfaceC19551a;
import com.avito.android.remote.cv_state.CvState;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import fg.C40414a;
import fg.C40415b;
import fg.C40416c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.I0;

/* compiled from: AdvertCvStateInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/remote/cv_state/CvState;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.cv_state.interactor.AdvertCvStateInteractor$sendCvStatus$1", f = "AdvertCvStateInteractor.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY, 34}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class a extends SuspendLambda implements p<I0<? super CvState>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.advert.item.cv_state.mapper.a f75075q;

    /* renamed from: r, reason: collision with root package name */
    public int f75076r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f75077s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f75078t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f75079u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CvStateType f75080v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, CvStateType cvStateType, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f75078t = bVar;
        this.f75079u = str;
        this.f75080v = cvStateType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f75078t, this.f75079u, this.f75080v, continuation);
        aVar.f75077s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super CvState> i02, Continuation<? super G0> continuation) {
        return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws ApiException {
        Object objA;
        I0 i02;
        com.avito.android.advert.item.cv_state.mapper.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f75076r;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f75077s;
            b bVar = this.f75078t;
            com.avito.android.advert.item.cv_state.mapper.a aVar2 = bVar.f75082b;
            InterfaceC19551a interfaceC19551a = bVar.f75081a.get();
            Long lBoxLong = Boxing.boxLong(Long.parseLong(this.f75079u));
            Long lBoxLong2 = Boxing.boxLong(Long.parseLong(this.f75080v.getId()));
            this.f75077s = i03;
            this.f75075q = aVar2;
            this.f75076r = 1;
            objA = interfaceC19551a.a(lBoxLong, lBoxLong2, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
            aVar = aVar2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            aVar = this.f75075q;
            I0 i04 = (I0) this.f75077s;
            C42729a0.b(obj);
            i02 = i04;
            objA = obj;
        }
        Object success = (TypedResult) objA;
        aVar.getClass();
        if (success instanceof TypedResult.Success) {
            C40416c c40416c = (C40416c) ((TypedResult.Success) success).getResult();
            String title = c40416c.getTitle();
            String subtitle = c40416c.getSubtitle();
            C40414a currentState = c40416c.getCurrentState();
            CvStateType cvStateType = currentState != null ? new CvStateType(String.valueOf(currentState.getId()), currentState.getSlug(), String.valueOf(currentState.getUpdatedAt()), currentState.getTitle(), currentState.getSubtitleOnChange()) : null;
            List<C40415b> listB = c40416c.b();
            ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
            for (C40415b c40415b : listB) {
                arrayList.add(new CvStateType(String.valueOf(c40415b.getId()), c40415b.getSlug(), null, c40415b.getTitle(), null));
            }
            success = new TypedResult.Success(new CvState(title, subtitle, cvStateType, arrayList));
        } else if (!(success instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(success instanceof TypedResult.Success)) {
            if (!(success instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) success;
            throw C35936s.a(error.getError(), error.getCause());
        }
        CvState cvState = (CvState) ((TypedResult.Success) success).getResult();
        this.f75077s = null;
        this.f75075q = null;
        this.f75076r = 2;
        if (i02.send(cvState, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
