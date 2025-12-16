package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$3", f = "SxAddressListActor.kt", i = {0, 2, 3, 4, 4}, l = {86, 89, 93, 94, 96, 98, 108}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ScreenData f293350q;

    /* renamed from: r, reason: collision with root package name */
    public int f293351r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f293352s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.n f293353t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f293354u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ListState f293355v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a.n nVar, x xVar, ListState listState, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f293353t = nVar;
        this.f293354u = xVar;
        this.f293355v = listState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f293353t, this.f293354u, this.f293355v, continuation);
        qVar.f293352s = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.list.mvi.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
