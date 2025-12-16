package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.suggest_institutes_bottom_sheet.mvi.a;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qA0.C47267a;
import rA0.C47519a;

/* compiled from: SuggestInstitutesActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.suggest_institutes_bottom_sheet.mvi.SuggestInstitutesActor$handleOnItemClicked$1", f = "SuggestInstitutesActor.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super m>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292047q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292048r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f292049s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.c f292050t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f292051u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar, a.c cVar, f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f292049s = sVar;
        this.f292050t = cVar;
        this.f292051u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f292049s, this.f292050t, this.f292051u, continuation);
        eVar.f292048r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super m> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292047q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f292048r;
            C47519a c47519a = this.f292049s.f292077a.get(this.f292050t.f292031a);
            this.f292051u.f292053b.c(new C47267a(c47519a.f429646b, c47519a.f429648d));
            m.a aVar = new m.a(c47519a);
            this.f292047q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
