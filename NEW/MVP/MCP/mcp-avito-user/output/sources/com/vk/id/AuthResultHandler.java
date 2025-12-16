package com.vk.id;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.storage.InternalVKIDTokenStorage;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: AuthResultHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b&\u0010'J&\u0010+\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0080@¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/vk/id/AuthResultHandler;", "", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "callbacksHolder", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "<init>", "(Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/auth/AuthCallbacksHolder;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/store/InternalVKIDPrefsStore;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/TokensHandler;Lcom/vk/id/logout/VKIDLoggerOut;Lcom/vk/id/storage/InternalVKIDTokenStorage;)V", "Lcom/vk/id/internal/auth/AuthResult$Success;", "oauth", "Lkotlin/Function0;", "Lkotlin/G0;", "onFail", "handleOauth", "(Lcom/vk/id/internal/auth/AuthResult$Success;LY41/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/auth/AuthResult;", "Lcom/vk/id/VKIDAuthFail;", "toVKIDAuthFail", "(Lcom/vk/id/internal/auth/AuthResult;)Lcom/vk/id/VKIDAuthFail;", "Lcom/vk/id/AccessToken;", "token", "emitAuthSuccess", "(Lcom/vk/id/AccessToken;)V", "fail", "emitAuthFail", "(Lcom/vk/id/VKIDAuthFail;LY41/a;)V", "authResult", "handle$vkid_release", "(Lcom/vk/id/internal/auth/AuthResult;LY41/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handle", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/TokensHandler;", "Lcom/vk/id/logout/VKIDLoggerOut;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthResultHandler {

    @k
    private final VKIDApiService api;

    @k
    private final AuthCallbacksHolder callbacksHolder;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("AuthResultHandler");

    @k
    private final VKIDLoggerOut loggerOut;

    @k
    private final InternalVKIDPrefsStore prefsStore;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    @k
    private final TokensHandler tokensHandler;

    /* compiled from: AuthResultHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.AuthResultHandler", f = "AuthResultHandler.kt", i = {0, 0, 0, 1, 1, 2, 2, 2}, l = {57, 84, 97, 99}, m = "handleOauth", n = {"this", "oauth", "onFail", "this", "onFail", "this", "onFail", "callResult"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.vk.id.AuthResultHandler$handleOauth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return AuthResultHandler.this.handleOauth(null, null, this);
        }
    }

    /* compiled from: AuthResultHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.AuthResultHandler$handleOauth$2", f = "AuthResultHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.AuthResultHandler$handleOauth$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends String>>, Object> {
        final /* synthetic */ AuthResult.Success $oauth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuthResult.Success success, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$oauth = success;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return AuthResultHandler.this.new AnonymousClass2(this.$oauth, continuation);
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
            AuthResultHandler.this.deviceIdProvider.setDeviceId$vkid_release(this.$oauth.getDeviceId());
            Q q12 = new Q(AuthResultHandler.this.prefsStore.getState(), AuthResultHandler.this.prefsStore.getCodeVerifier$vkid_release());
            AuthResultHandler.this.prefsStore.clear();
            return q12;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Q<String, String>> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public AuthResultHandler(@k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers, @k AuthCallbacksHolder authCallbacksHolder, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k InternalVKIDPrefsStore internalVKIDPrefsStore, @k ServiceCredentials serviceCredentials, @k VKIDApiService vKIDApiService, @k TokensHandler tokensHandler, @k VKIDLoggerOut vKIDLoggerOut, @k InternalVKIDTokenStorage internalVKIDTokenStorage) {
        this.dispatchers = vKIDCoroutinesDispatchers;
        this.callbacksHolder = authCallbacksHolder;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.prefsStore = internalVKIDPrefsStore;
        this.serviceCredentials = serviceCredentials;
        this.api = vKIDApiService;
        this.tokensHandler = tokensHandler;
        this.loggerOut = vKIDLoggerOut;
        this.tokenStorage = internalVKIDTokenStorage;
    }

    private final void emitAuthFail(VKIDAuthFail fail, Y41.a<G0> onFail) {
        Iterator<T> it = this.callbacksHolder.getAll().iterator();
        while (it.hasNext()) {
            ((VKIDAuthCallback) it.next()).onFail(fail);
        }
        onFail.invoke();
        this.callbacksHolder.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitAuthSuccess(AccessToken token) {
        Iterator<T> it = this.callbacksHolder.getAll().iterator();
        while (it.hasNext()) {
            ((VKIDAuthCallback) it.next()).onAuth(token);
        }
        this.callbacksHolder.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleOauth(com.vk.id.internal.auth.AuthResult.Success r19, Y41.a<kotlin.G0> r20, kotlin.coroutines.Continuation<? super kotlin.G0> r21) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.AuthResultHandler.handleOauth(com.vk.id.internal.auth.AuthResult$Success, Y41.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 handleOauth$lambda$3$lambda$2(AuthResultHandler authResultHandler, Y41.a aVar, Throwable th2) {
        authResultHandler.emitAuthFail(new VKIDAuthFail.FailedApiCall("Failed to fetch user data", th2), aVar);
        return G0.f406611a;
    }

    private final VKIDAuthFail toVKIDAuthFail(AuthResult authResult) {
        if (authResult instanceof AuthResult.Canceled) {
            return new VKIDAuthFail.Canceled(((AuthResult.Canceled) authResult).getMessage());
        }
        if (authResult instanceof AuthResult.NoBrowserAvailable) {
            AuthResult.NoBrowserAvailable noBrowserAvailable = (AuthResult.NoBrowserAvailable) authResult;
            return new VKIDAuthFail.NoBrowserAvailable(noBrowserAvailable.getMessage(), noBrowserAvailable.getError());
        }
        if (authResult instanceof AuthResult.AuthActiviyResultFailed) {
            AuthResult.AuthActiviyResultFailed authActiviyResultFailed = (AuthResult.AuthActiviyResultFailed) authResult;
            return new VKIDAuthFail.FailedRedirectActivity(authActiviyResultFailed.getMessage(), authActiviyResultFailed.getError());
        }
        if (authResult instanceof AuthResult.Success) {
            throw new IllegalStateException("AuthResult is Success and cannot be converted to fail!");
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public final Object handle$vkid_release(@k AuthResult authResult, @k Y41.a<G0> aVar, @k Continuation<? super G0> continuation) {
        if (this.callbacksHolder.isEmpty()) {
            return G0.f406611a;
        }
        if (!(authResult instanceof AuthResult.Success)) {
            emitAuthFail(toVKIDAuthFail(authResult), aVar);
            this.prefsStore.clear();
            return G0.f406611a;
        }
        AuthResult.Success success = (AuthResult.Success) authResult;
        if (success.getOauth() != null) {
            Object objHandleOauth = handleOauth(success, aVar, continuation);
            return objHandleOauth == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleOauth : G0.f406611a;
        }
        emitAuthFail(new VKIDAuthFail.FailedOAuth("OAuth provider response does not have necessary OAuth data."), aVar);
        return G0.f406611a;
    }
}
