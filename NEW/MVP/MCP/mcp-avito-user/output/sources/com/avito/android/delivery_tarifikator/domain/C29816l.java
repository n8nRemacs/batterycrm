package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29814j;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import cw.C39420a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadTarifikatorUseCase.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/delivery_tarifikator/domain/j;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/delivery_tarifikator/domain/j;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.domain.LoadTarifikatorUseCaseImpl$invoke$2", f = "LoadTarifikatorUseCase.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.delivery_tarifikator.domain.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29816l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super InterfaceC29814j>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135297q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29817m f135298r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29816l(C29817m c29817m, Continuation<? super C29816l> continuation) {
        super(2, continuation);
        this.f135298r = c29817m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29816l(this.f135298r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super InterfaceC29814j> continuation) {
        return ((C29816l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC29814j.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135297q;
        C29817m c29817m = this.f135298r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC24182a interfaceC24182a = c29817m.f135299a;
            String str = c29817m.f135300b.f135220b;
            this.f135297q = 1;
            obj = interfaceC24182a.c(str, this);
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
        if (typedResult instanceof TypedResult.Success) {
            C39420a c39420a = (C39420a) ((TypedResult.Success) typedResult).getResult();
            try {
                c29817m.f135302d.a(c39420a);
                c29817m.f135303e.a(c39420a);
                c29817m.f135304f.a(new Ov.p(c39420a.getHeaderInfo(), c39420a.getFooterInfo(), c29817m.f135302d.d(), c39420a.getCreateCustomTariffUrl() != null, c29817m.f135306h.a(c39420a)));
                c29817m.f135305g.a(c39420a.getCreateCustomTariffUrl());
                return InterfaceC29814j.b.f135294a;
            } catch (Throwable th2) {
                V2.f318762a.a("DEFAULT_TAG", "Load Tarifikator failed", th2);
                c29817m.f135307i.b(th2);
                aVar = new InterfaceC29814j.a(th2);
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            V2.f318762a.a("DEFAULT_TAG", "Load Tarifikator failed", apiExceptionA);
            aVar = new InterfaceC29814j.a(apiExceptionA);
        }
        return aVar;
    }
}
