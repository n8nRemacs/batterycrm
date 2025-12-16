package com.avito.android.iac_calls_history.impl_module.api;

import XJ.a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.api.remote.GetCallHistoryRequest;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CallsHistoryApiImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/b;", "Lcom/avito/android/iac_calls_history/impl_module/api/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class b implements com.avito.android.iac_calls_history.impl_module.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<e> f164682a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f164683b;

    /* compiled from: CallsHistoryApiImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest$a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.api.CallsHistoryApiImpl$getCallsHistory$2", f = "CallsHistoryApiImpl.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements l<Continuation<? super TypedResult<GetCallHistoryRequest.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164684q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164686s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f164687t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f164686s = str;
            this.f164687t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new a(this.f164686s, this.f164687t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<GetCallHistoryRequest.a>> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164684q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = b.this.f164682a.get();
                this.f164684q = 1;
                obj = eVar.c(20, this.f164686s, this.f164687t, this);
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

    /* compiled from: CallsHistoryApiImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LXJ/a$a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.api.CallsHistoryApiImpl$getMissedCounter$2", f = "CallsHistoryApiImpl.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_calls_history.impl_module.api.b$b, reason: collision with other inner class name */
    public static final class C4818b extends SuspendLambda implements l<Continuation<? super TypedResult<a.C1328a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164688q;

        public C4818b(Continuation<? super C4818b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new C4818b(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<a.C1328a>> continuation) {
            return ((C4818b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164688q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = b.this.f164682a.get();
                this.f164688q = 1;
                obj = eVar.a(this);
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

    /* compiled from: CallsHistoryApiImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.api.CallsHistoryApiImpl$resetMissedCounter$2", f = "CallsHistoryApiImpl.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements l<Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164690q;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<Object>> continuation) {
            return ((c) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164690q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = b.this.f164682a.get();
                this.f164690q = 1;
                obj = eVar.b(this);
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

    @Inject
    public b(@k h31.e<e> eVar, @k com.avito.android.iac_api_utils.util_module.a aVar) {
        this.f164682a = eVar;
        this.f164683b = aVar;
    }

    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @Y61.l
    public final Object a(@k Continuation<? super TypedResult<a.C1328a>> continuation) {
        return this.f164683b.c("getMissedCounter", new String[0], new C4818b(null), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @Y61.l
    public final Object b(@k Continuation<? super TypedResult<Object>> continuation) {
        return this.f164683b.c("resetMissedCounter", new String[0], new c(null), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @Y61.l
    public final Object c(int i12, @Y61.l String str, @k String str2, @k Continuation<? super TypedResult<GetCallHistoryRequest.a>> continuation) {
        return this.f164683b.c("getCallsHistory", new String[0], new a(str, str2, null), (ContinuationImpl) continuation);
    }
}
