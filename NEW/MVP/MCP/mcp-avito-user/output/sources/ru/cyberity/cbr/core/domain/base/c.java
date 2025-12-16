package ru.cyberity.cbr.core.domain.base;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import ru.cyberity.cbr.core.domain.model.a;

/* compiled from: BaseUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0086\u0001\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000221\u0010\n\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"L", "R", "Lru/cyberity/cbr/core/domain/model/a;", "Lkotlin/Function2;", "Lkotlin/S;", "name", "value", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "onError", "onSuccess", "a", "(Lru/cyberity/cbr/core/domain/model/a;LY41/p;LY41/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {
    @l
    public static final <L, R> Object a(@k ru.cyberity.cbr.core.domain.model.a<? extends L, ? extends R> aVar, @k p<? super L, ? super Continuation<? super G0>, ? extends Object> pVar, @k p<? super R, ? super Continuation<? super G0>, ? extends Object> pVar2, @k Continuation<? super G0> continuation) {
        if (aVar.b()) {
            Object objInvoke = pVar2.invoke((Object) ((a.b) aVar).d(), continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }
        if (!aVar.a()) {
            return G0.f406611a;
        }
        Object objInvoke2 = pVar.invoke((Object) ((a.C12482a) aVar).d(), continuation);
        return objInvoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke2 : G0.f406611a;
    }
}
