package com.avito.android.timestamp_storage.domain;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import vE0.AbstractC49202b;

/* compiled from: TimestampStorageImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorageImpl$remove$2", f = "TimestampStorageImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301500q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f301501r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC49202b.AbstractC12751b f301502s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC49202b.AbstractC12751b abstractC12751b, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f301501r = jVar;
        this.f301502s = abstractC12751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f301501r, this.f301502s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301500q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f301501r;
            com.avito.android.timestamp_storage.data.dao.a aVar = jVar.f301503a;
            AbstractC49202b.AbstractC12751b abstractC12751b = this.f301502s;
            String str = abstractC12751b.f440546a;
            String strA = jVar.f301505c.a(abstractC12751b);
            this.f301500q = 1;
            if (aVar.f(str, strA, this) == coroutine_suspended) {
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
