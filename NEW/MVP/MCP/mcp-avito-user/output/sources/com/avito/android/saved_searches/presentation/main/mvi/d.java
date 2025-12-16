package com.avito.android.saved_searches.presentation.main.mvi;

import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainInternalAction;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SavedSearchMainActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.mvi.SavedSearchMainActor$handleScreenResumed$1", f = "SavedSearchMainActor.kt", i = {0}, l = {199, 202}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SavedSearchMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258633q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258634r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f258635s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SavedSearchMainState f258636t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, SavedSearchMainState savedSearchMainState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f258635s = gVar;
        this.f258636t = savedSearchMainState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f258635s, this.f258636t, continuation);
        dVar.f258634r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SavedSearchMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        SavedSearchData.Settings settings;
        SavedSearchData.Settings.Email email;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f258633q;
        g gVar = this.f258635s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f258634r;
            SavedSearchMainInternalAction.UpdateNotificationsEnabled updateNotificationsEnabled = new SavedSearchMainInternalAction.UpdateNotificationsEnabled(gVar.f258683c.b());
            this.f258634r = interfaceC43172j;
            this.f258633q = 1;
            if (interfaceC43172j.emit(updateNotificationsEnabled, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f258634r;
            C42729a0.b(obj);
        }
        SavedSearchMainState savedSearchMainState = this.f258636t;
        SavedSearchData savedSearchData = savedSearchMainState.f258662b;
        if ((savedSearchData == null || (settings = savedSearchData.getSettings()) == null || (email = settings.getEmail()) == null) ? false : L.f(email.getIsConfirmed(), Boxing.boxBoolean(false))) {
            gVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new c(false, gVar, savedSearchMainState, null));
            this.f258634r = null;
            this.f258633q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
