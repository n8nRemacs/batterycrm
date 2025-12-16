package com.avito.android.replace_main.toggle;

import Bm0.C13163a;
import Bm0.C13164b;
import Bm0.C13165c;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.replace_main.generated.api.api_v_1__replace_main_toggle.OkRespDataSuccessToggle;
import com.avito.android.replace_main.toggle.d;
import com.avito.android.replace_main.toggle.s;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import zm0.InterfaceC50590a;

/* compiled from: ReplaceMainToggleInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/replace_main/toggle/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.replace_main.toggle.ReplaceMainToggleInteractorImpl$loadReplaceMainToggle$result$1", f = "ReplaceMainToggleInteractorImpl.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f254650q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f254651r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f254651r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f254651r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<d>> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        d dVar;
        BottomNavigationSpace bottomNavigationSpace;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f254650q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC50590a interfaceC50590a = this.f254651r.f254654c.get();
            this.f254650q = 1;
            obj = interfaceC50590a.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        OkRespDataSuccessToggle toggle = ((C13163a) ((TypedResult.Success) typedResult).getResult()).getToggle();
        if (toggle != null) {
            int i13 = s.a.f254656a[toggle.getMain().ordinal()];
            if (i13 == 1) {
                bottomNavigationSpace = BottomNavigationSpace.f107065b;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bottomNavigationSpace = BottomNavigationSpace.f107066c;
            }
            BottomNavigationSpace bottomNavigationSpace2 = bottomNavigationSpace;
            String title = toggle.getTitle();
            String subtitle = toggle.getSubtitle();
            String clearShowId = toggle.getClearShowId();
            C13164b toast = toggle.getToast();
            C13165c avito = toast.getAvito();
            d.c cVar = new d.c(avito.getText(), new d.b(avito.getButton().getText()));
            C13165c business360 = toast.getBusiness360();
            dVar = new d(bottomNavigationSpace2, title, subtitle, clearShowId, new d.a(cVar, new d.c(business360.getText(), new d.b(business360.getButton().getText()))), false);
        } else {
            dVar = null;
        }
        return new TypedResult.Success(dVar);
    }
}
