package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressDeleteLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.util.C35936s;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: SxAddressDeleteDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressDeleteDeeplinkHandler$doHandle$1", f = "SxAddressDeleteDeeplinkHandler.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sx_address.deeplink.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35173m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292844q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35175o f292845r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SxAddressDeleteLink f292846s;

    /* compiled from: SxAddressDeleteDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressDeleteDeeplinkHandler$doHandle$1$1", f = "SxAddressDeleteDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.sx_address.deeplink.m$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ JA0.a f292847q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C35175o f292848r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JA0.a aVar, C35175o c35175o, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f292847q = aVar;
            this.f292848r = c35175o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f292847q, this.f292848r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            JA0.a aVar = this.f292847q;
            String error = aVar.getError();
            C35175o c35175o = this.f292848r;
            if (error == null) {
                c35175o.j(new SxAddressDeleteResult.Success(aVar.getAddress(), aVar.getAddressCount()));
            } else {
                c35175o.j(new SxAddressDeleteResult.Failure(C35936s.a(new ApiError.Failure(aVar.getError()), null)));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35173m(C35175o c35175o, SxAddressDeleteLink sxAddressDeleteLink, Continuation<? super C35173m> continuation) {
        super(2, continuation);
        this.f292845r = c35175o;
        this.f292846s = sxAddressDeleteLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35173m(this.f292845r, this.f292846s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C35173m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292844q;
        C35175o c35175o = this.f292845r;
        if (i12 == 0) {
            C42729a0.b(obj);
            List listSingletonList = Collections.singletonList(Boxing.boxLong(this.f292846s.f67552b));
            this.f292844q = 1;
            obj = c35175o.f292850f.b(listSingletonList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B = c35175o.f292851g.b();
        a aVar = new a((JA0.a) obj, c35175o, null);
        this.f292844q = 2;
        if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
