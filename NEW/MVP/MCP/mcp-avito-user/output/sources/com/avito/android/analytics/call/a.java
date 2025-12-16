package com.avito.android.analytics.call;

import Nc.InterfaceC14558a;
import Pc.C14766a;
import Y41.p;
import Y61.k;
import Y61.l;
import bc.InterfaceC25627a;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import okhttp3.internal.Util;
import zc.InterfaceC50545a;

/* compiled from: CallToSellerConfirmedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/call/a;", "Lbc/a;", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC25627a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f89694b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f89695c;

    /* compiled from: CallToSellerConfirmedEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.analytics.call.CallToSellerConfirmedEvent$methodCall$1", f = "CallToSellerConfirmedEvent.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.analytics.call.a$a, reason: collision with other inner class name */
    public static final class C2664a extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89696q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f89697r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f89698s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2664a(Object obj, a aVar, Continuation<? super C2664a> continuation) {
            super(2, continuation);
            this.f89697r = obj;
            this.f89698s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C2664a(this.f89697r, this.f89698s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((C2664a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89696q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14558a interfaceC14558a = (InterfaceC14558a) this.f89697r;
                a aVar = this.f89698s;
                long longOrDefault = Util.toLongOrDefault(aVar.f89694b, -1L);
                C14766a c14766a = new C14766a(aVar.f89695c, null);
                this.f89696q = 1;
                obj = interfaceC14558a.b(longOrDefault, c14766a, this);
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

    public a(@k String str, @l String str2) {
        this.f89694b = str;
        this.f89695c = str2;
    }

    @Override // bc.InterfaceC25627a
    @k
    public final z<?> b(@k Object obj) throws Exception {
        if (obj instanceof InterfaceC14558a) {
            return z.c0(C43259k.e(EmptyCoroutineContext.INSTANCE, new C2664a(obj, this, null)));
        }
        if (obj instanceof InterfaceC50545a) {
            return ((InterfaceC50545a) obj).b(this.f89694b, this.f89695c);
        }
        throw new Exception("Unreachable code");
    }
}
