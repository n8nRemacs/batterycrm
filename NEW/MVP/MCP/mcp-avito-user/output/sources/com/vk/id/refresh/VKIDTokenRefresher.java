package com.vk.id.refresh;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.TokensHandler;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.refresh.VKIDRefreshTokenFail;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: VKIDTokenRefresher.kt */
@P
@s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006%"}, d2 = {"Lcom/vk/id/refresh/VKIDTokenRefresher;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/state/StateGenerator;Lcom/vk/id/TokensHandler;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/store/InternalVKIDPrefsStore;)V", "Lcom/vk/id/refresh/VKIDRefreshTokenCallback;", "callback", "Lkotlin/G0;", "emitUnauthorizedFail", "(Lcom/vk/id/refresh/VKIDRefreshTokenCallback;)V", "Lcom/vk/id/refresh/VKIDRefreshTokenParams;", "params", "refresh", "(Lcom/vk/id/refresh/VKIDRefreshTokenCallback;Lcom/vk/id/refresh/VKIDRefreshTokenParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/state/StateGenerator;", "Lcom/vk/id/TokensHandler;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDTokenRefresher {

    @k
    private final VKIDApiService api;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final InternalVKIDPrefsStore prefsStore;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final StateGenerator stateGenerator;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    @k
    private final TokensHandler tokensHandler;

    /* compiled from: VKIDTokenRefresher.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.refresh.VKIDTokenRefresher", f = "VKIDTokenRefresher.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, l = {32, 35, 39, 53}, m = "refresh", n = {"this", "callback", "params", "clientId", "this", "callback", "params", "clientId", "refreshToken", "this", "callback", "params", "refreshTokenState", "this", "callback", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    /* renamed from: com.vk.id.refresh.VKIDTokenRefresher$refresh$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return VKIDTokenRefresher.this.refresh(null, null, this);
        }
    }

    /* compiled from: VKIDTokenRefresher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.refresh.VKIDTokenRefresher$refresh$3", f = "VKIDTokenRefresher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.refresh.VKIDTokenRefresher$refresh$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends String>>, Object> {
        final /* synthetic */ VKIDRefreshTokenParams $params;
        int label;
        final /* synthetic */ VKIDTokenRefresher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VKIDRefreshTokenParams vKIDRefreshTokenParams, VKIDTokenRefresher vKIDTokenRefresher, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$params = vKIDRefreshTokenParams;
            this.this$0 = vKIDTokenRefresher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$params, this.this$0, continuation);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Q<? extends String, ? extends String>> continuation) {
            return invoke2(t12, (Continuation<? super Q<String, String>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            String state = this.$params.getState();
            if (state == null) {
                state = this.this$0.stateGenerator.regenerateState();
            }
            return new Q(state, this.this$0.deviceIdProvider.getDeviceId$vkid_release());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Q<String, String>> continuation) {
            return ((AnonymousClass3) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public VKIDTokenRefresher(@k VKIDApiService vKIDApiService, @k InternalVKIDTokenStorage internalVKIDTokenStorage, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k ServiceCredentials serviceCredentials, @k StateGenerator stateGenerator, @k TokensHandler tokensHandler, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers, @k InternalVKIDPrefsStore internalVKIDPrefsStore) {
        this.api = vKIDApiService;
        this.tokenStorage = internalVKIDTokenStorage;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.stateGenerator = stateGenerator;
        this.tokensHandler = tokensHandler;
        this.dispatchers = vKIDCoroutinesDispatchers;
        this.prefsStore = internalVKIDPrefsStore;
    }

    private final void emitUnauthorizedFail(VKIDRefreshTokenCallback callback) {
        callback.onFail(new VKIDRefreshTokenFail.NotAuthenticated("You must login before refreshing token"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 refresh$lambda$2$lambda$1(VKIDTokenRefresher vKIDTokenRefresher, VKIDRefreshTokenCallback vKIDRefreshTokenCallback, Throwable th2) {
        vKIDTokenRefresher.prefsStore.clear();
        vKIDRefreshTokenCallback.onFail(new VKIDRefreshTokenFail.FailedApiCall(G.f("Failed to fetch user data due to: ", th2.getMessage()), th2));
        return G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(@Y61.k com.vk.id.refresh.VKIDRefreshTokenCallback r19, @Y61.k com.vk.id.refresh.VKIDRefreshTokenParams r20, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.refresh.VKIDTokenRefresher.refresh(com.vk.id.refresh.VKIDRefreshTokenCallback, com.vk.id.refresh.VKIDRefreshTokenParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
