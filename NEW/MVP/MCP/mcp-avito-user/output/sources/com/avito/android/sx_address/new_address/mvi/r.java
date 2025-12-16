package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.mvi.B;
import com.avito.android.sx_address.new_address.mvi.InterfaceC35192g;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxNewAddressMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressMviActor$handle$6", f = "SxNewAddressMviActor.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super B>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293825q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293826r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SxNewAddressMviState.DetailsContent f293827s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35192g.f f293828t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SxNewAddressMviState.DetailsContent detailsContent, InterfaceC35192g.f fVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f293827s = detailsContent;
        this.f293828t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f293827s, this.f293828t, continuation);
        rVar.f293826r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC35192g.f fVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293825q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293826r;
            SxNewAddressMviState.DetailsContent detailsContent = this.f293827s;
            Iterator it = detailsContent.f293725b.iterator();
            int i13 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                fVar = this.f293828t;
                if (!zHasNext) {
                    i13 = -1;
                    break;
                }
                DetailItem detailItem = (DetailItem) it.next();
                if (L.f(detailItem.f293606b, fVar.f293784a.f293606b)) {
                    if (L.f(detailItem.f293610f, fVar.f293784a.f293610f)) {
                        break;
                    }
                }
                i13++;
            }
            if (i13 == -1) {
                throw new IllegalStateException("Can't find Detail element");
            }
            ArrayList arrayList = new ArrayList((Collection) detailsContent.f293725b);
            arrayList.set(i13, fVar.f293784a);
            B.e eVar = new B.e(arrayList);
            this.f293825q = 1;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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
