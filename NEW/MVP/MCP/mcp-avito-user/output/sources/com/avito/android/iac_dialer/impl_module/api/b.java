package com.avito.android.iac_dialer.impl_module.api;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import gK.C40592a;
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
import kotlin.jvm.internal.N;

/* compiled from: IacDialerFinalLinkInteractorApiImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/api/b;", "Lcom/avito/android/iac_dialer/impl_module/api/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<e> f165730a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f165731b;

    /* compiled from: IacDialerFinalLinkInteractorApiImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "m", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f165732l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacApiTracker", str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialerFinalLinkInteractorApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "m", "", "e", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer.impl_module.api.b$b, reason: collision with other inner class name */
    public static final class C4912b extends N implements p<String, Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4912b f165733l = new C4912b();

        public C4912b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Throwable th2) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacApiTracker", str, th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialerFinalLinkInteractorApiImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LgK/a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.api.IacDialerFinalLinkInteractorApiImpl$enrichCallFinishScreen$2", f = "IacDialerFinalLinkInteractorApiImpl.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements l<Continuation<? super TypedResult<C40592a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165734q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f165736s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f165737t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, long j12, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f165736s = str;
            this.f165737t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new c(this.f165736s, this.f165737t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<C40592a>> continuation) {
            return ((c) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165734q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = b.this.f165730a.get();
                this.f165734q = 1;
                obj = eVar.a(this.f165736s, this.f165737t, this);
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
        this.f165730a = eVar;
        this.f165731b = aVar;
        aVar.b(a.f165732l, C4912b.f165733l);
    }

    @Override // com.avito.android.iac_dialer.impl_module.api.a
    @Y61.l
    public final Object a(@k String str, long j12, @k Continuation<? super TypedResult<C40592a>> continuation) {
        return this.f165731b.c("enrichCallFinishScreen", new String[0], new c(str, j12, null), (ContinuationImpl) continuation);
    }
}
