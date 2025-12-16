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
@DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.mvi.SavedSearchMainActor$confirmSubscription$1", f = "SavedSearchMainActor.kt", i = {0, 1, 2, 3, 3, 4, 6, 6}, l = {83, 88, 99, 115, 116, 117, 120, 122}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "$this$flow", "throwable"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SavedSearchMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f258618q;

    /* renamed from: r, reason: collision with root package name */
    public int f258619r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258620s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SavedSearchMainState f258621t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f258622u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, SavedSearchMainState savedSearchMainState, Continuation continuation) {
        super(2, continuation);
        this.f258621t = savedSearchMainState;
        this.f258622u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f258622u, this.f258621t, continuation);
        aVar.f258620s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SavedSearchMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x047a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04d8 A[PHI: r1
  0x04d8: PHI (r1v90 kotlinx.coroutines.flow.j) = (r1v86 kotlinx.coroutines.flow.j), (r1v91 kotlinx.coroutines.flow.j) binds: [B:354:0x04c2, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0534 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.saved_searches.presentation.main.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
