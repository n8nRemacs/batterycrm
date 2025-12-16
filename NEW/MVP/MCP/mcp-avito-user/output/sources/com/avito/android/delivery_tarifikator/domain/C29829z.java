package com.avito.android.delivery_tarifikator.domain;

import Ov.l;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29827x;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import dw.C39809a;
import dw.C39810b;
import dw.C39811c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SaveSettingsUseCase.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/delivery_tarifikator/domain/x;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/delivery_tarifikator/domain/x;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.domain.SaveSettingsUseCaseImpl$invoke$2", f = "SaveSettingsUseCase.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.delivery_tarifikator.domain.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29829z extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super InterfaceC29827x>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135350q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f135351r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<Ov.g> f135352s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29829z(A a12, List<Ov.g> list, Continuation<? super C29829z> continuation) {
        super(2, continuation);
        this.f135351r = a12;
        this.f135352s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29829z(this.f135351r, this.f135352s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super InterfaceC29827x> continuation) {
        return ((C29829z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135350q;
        if (i12 == 0) {
            C42729a0.b(obj);
            A a12 = this.f135351r;
            String str = a12.f135230b.f135220b;
            List<Ov.g> list = this.f135352s;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Ov.g gVar : list) {
                long j12 = gVar.f12684a.f12680a;
                Ov.l lVar = gVar.f12685b;
                l.b bVar = lVar instanceof l.b ? (l.b) lVar : null;
                Long lValueOf = bVar != null ? Long.valueOf(bVar.f12697a) : null;
                boolean z12 = lVar instanceof l.c;
                String str2 = z12 ? ((l.c) lVar).f12698a : null;
                arrayList.add(new C39811c(lValueOf, j12, gVar.f12688e, gVar.f12687d, z12 ? gVar.f12686c : null, str2 == null ? null : str2));
            }
            C39810b c39810b = new C39810b(str, arrayList);
            this.f135350q = 1;
            objA = a12.f135229a.a(c39810b, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        if (typedResult instanceof TypedResult.Success) {
            return new InterfaceC29827x.b(((C39809a) ((TypedResult.Success) typedResult).getResult()).getMessage());
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return new InterfaceC29827x.a(C35936s.a(error.getError(), error.getCause()));
    }
}
