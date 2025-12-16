package com.avito.android.saved_searches.presentation.main.mvi;

import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainInternalAction;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SavedSearchMainActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.mvi.SavedSearchMainActor$getSearchSubscriptionForm$1", f = "SavedSearchMainActor.kt", i = {0, 1}, l = {250, 251, 256, 259, 266}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SavedSearchMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258628q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258629r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f258630s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f258631t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SavedSearchMainState f258632u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z12, g gVar, SavedSearchMainState savedSearchMainState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f258630s = z12;
        this.f258631t = gVar;
        this.f258632u = savedSearchMainState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f258630s, this.f258631t, this.f258632u, continuation);
        cVar.f258629r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SavedSearchMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.saved_searches.presentation.main.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
