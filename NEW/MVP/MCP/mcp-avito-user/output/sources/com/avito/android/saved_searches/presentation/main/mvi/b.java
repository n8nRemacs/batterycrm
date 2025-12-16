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
@DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.mvi.SavedSearchMainActor$deleteSubscription$1", f = "SavedSearchMainActor.kt", i = {0, 1, 2, 2, 3, 5, 5}, l = {221, 226, 229, 230, 231, 234, 236}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "$this$flow", "throwable"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SavedSearchMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f258623q;

    /* renamed from: r, reason: collision with root package name */
    public int f258624r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258625s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SavedSearchMainState f258626t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f258627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, SavedSearchMainState savedSearchMainState, Continuation continuation) {
        super(2, continuation);
        this.f258626t = savedSearchMainState;
        this.f258627u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f258627u, this.f258626t, continuation);
        bVar.f258625s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SavedSearchMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.saved_searches.presentation.main.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
