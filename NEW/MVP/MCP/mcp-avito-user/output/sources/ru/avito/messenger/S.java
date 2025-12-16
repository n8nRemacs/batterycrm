package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lg91/I;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$sendTextMessage$forceAlternativeImpl$1$1", f = "MessengerClientFacade.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class S extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<g91.I>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f430697q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f430698r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f430699s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f430700t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f430701u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f430702v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f430703w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f430704x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(D d12, String str, Integer num, String str2, String str3, String str4, String str5, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f430698r = d12;
        this.f430699s = str;
        this.f430700t = num;
        this.f430701u = str2;
        this.f430702v = str3;
        this.f430703w = str4;
        this.f430704x = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new S(this.f430698r, this.f430699s, this.f430700t, this.f430701u, this.f430702v, this.f430703w, this.f430704x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<g91.I>> continuation) {
        return ((S) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f430697q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z81.a aVar = this.f430698r.f430604b.get();
            g91.H h12 = new g91.H(this.f430699s, this.f430700t != null ? Boxing.boxLong(r3.intValue()) : null, this.f430701u, this.f430702v, null, this.f430703w, this.f430704x);
            this.f430697q = 1;
            obj = aVar.d(h12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
