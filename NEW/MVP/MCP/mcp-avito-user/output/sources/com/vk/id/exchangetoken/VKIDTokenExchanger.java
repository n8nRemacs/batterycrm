package com.vk.id.exchangetoken;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.AccessToken;
import com.vk.id.TokensHandler;
import com.vk.id.exchangetoken.VKIDExchangeTokenFail;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VKIDTokenExchanger.kt */
@P
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(¨\u0006)"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "pkceGenerator", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/state/StateGenerator;Lcom/vk/id/TokensHandler;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/store/InternalVKIDPrefsStore;Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;)V", "", "code", "codeVerifier", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;", "params", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenCallback;", "callback", "Lkotlin/G0;", "handleCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;Lcom/vk/id/exchangetoken/VKIDExchangeTokenCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v1Token", "exchange", "(Ljava/lang/String;Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;Lcom/vk/id/exchangetoken/VKIDExchangeTokenCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/state/StateGenerator;", "Lcom/vk/id/TokensHandler;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDTokenExchanger {

    @k
    private final VKIDApiService api;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final PkceGeneratorSHA256 pkceGenerator;

    @k
    private final InternalVKIDPrefsStore prefsStore;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final StateGenerator stateGenerator;

    @k
    private final TokensHandler tokensHandler;

    /* compiled from: VKIDTokenExchanger.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.exchangetoken.VKIDTokenExchanger", f = "VKIDTokenExchanger.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {34, 43, 62, 69}, m = "exchange", n = {"this", "v1Token", "params", "callback", "this", "params", "callback", VoiceInfo.STATE, "codeVerifier", "this", "params", "callback", "codeVerifier", "payload"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$5"})
    /* renamed from: com.vk.id.exchangetoken.VKIDTokenExchanger$exchange$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
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
            return VKIDTokenExchanger.this.exchange(null, null, null, this);
        }
    }

    /* compiled from: VKIDTokenExchanger.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.exchangetoken.VKIDTokenExchanger", f = "VKIDTokenExchanger.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {84, 85, 105}, m = "handleCode", n = {"this", "code", "codeVerifier", "callback", "this", "callback", VoiceInfo.STATE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    /* renamed from: com.vk.id.exchangetoken.VKIDTokenExchanger$handleCode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C378931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C378931(Continuation<? super C378931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return VKIDTokenExchanger.this.handleCode(null, null, null, null, this);
        }
    }

    public VKIDTokenExchanger(@k VKIDApiService vKIDApiService, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k ServiceCredentials serviceCredentials, @k StateGenerator stateGenerator, @k TokensHandler tokensHandler, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers, @k InternalVKIDPrefsStore internalVKIDPrefsStore, @k PkceGeneratorSHA256 pkceGeneratorSHA256) {
        this.api = vKIDApiService;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.stateGenerator = stateGenerator;
        this.tokensHandler = tokensHandler;
        this.dispatchers = vKIDCoroutinesDispatchers;
        this.prefsStore = internalVKIDPrefsStore;
        this.pkceGenerator = pkceGeneratorSHA256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleCode(java.lang.String r19, java.lang.String r20, com.vk.id.exchangetoken.VKIDExchangeTokenParams r21, com.vk.id.exchangetoken.VKIDExchangeTokenCallback r22, kotlin.coroutines.Continuation<? super kotlin.G0> r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.exchangetoken.VKIDTokenExchanger.handleCode(java.lang.String, java.lang.String, com.vk.id.exchangetoken.VKIDExchangeTokenParams, com.vk.id.exchangetoken.VKIDExchangeTokenCallback, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 handleCode$lambda$4$lambda$3(VKIDExchangeTokenCallback vKIDExchangeTokenCallback, Throwable th2) {
        vKIDExchangeTokenCallback.onFail(new VKIDExchangeTokenFail.FailedApiCall("Failed to fetch user data", th2));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object handleCode$lambda$4$onAuth(VKIDExchangeTokenCallback vKIDExchangeTokenCallback, AccessToken accessToken, Continuation continuation) {
        vKIDExchangeTokenCallback.onAuth(accessToken);
        return G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object exchange(@Y61.k java.lang.String r20, @Y61.k com.vk.id.exchangetoken.VKIDExchangeTokenParams r21, @Y61.k com.vk.id.exchangetoken.VKIDExchangeTokenCallback r22, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r23) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.exchangetoken.VKIDTokenExchanger.exchange(java.lang.String, com.vk.id.exchangetoken.VKIDExchangeTokenParams, com.vk.id.exchangetoken.VKIDExchangeTokenCallback, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
