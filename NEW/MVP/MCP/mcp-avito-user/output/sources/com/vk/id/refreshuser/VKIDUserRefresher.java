package com.vk.id.refreshuser;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.AccessToken;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.api.dto.VKIDUserInfoPayload;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: VKIDUserRefresher.kt */
@P
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/vk/id/refreshuser/VKIDUserRefresher;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "refresher", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/refresh/VKIDTokenRefresher;)V", "Lcom/vk/id/refreshuser/VKIDGetUserCallback;", "callback", "Lcom/vk/id/refreshuser/VKIDGetUserParams;", "params", "Lkotlin/G0;", "refresh", "(Lcom/vk/id/refreshuser/VKIDGetUserCallback;Lcom/vk/id/refreshuser/VKIDGetUserParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDUserRefresher {

    @k
    private final VKIDApiService api;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final VKIDTokenRefresher refresher;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    /* compiled from: VKIDUserRefresher.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.refreshuser.VKIDUserRefresher", f = "VKIDUserRefresher.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2}, l = {34, 41, 49}, m = "refresh", n = {"this", "callback", "params", "clientId", "this", "callback", "params", "this", "callback"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.vk.id.refreshuser.VKIDUserRefresher$refresh$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return VKIDUserRefresher.this.refresh(null, null, this);
        }
    }

    /* compiled from: VKIDUserRefresher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.refreshuser.VKIDUserRefresher$refresh$3", f = "VKIDUserRefresher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.refreshuser.VKIDUserRefresher$refresh$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends String>>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKIDUserRefresher.this.new AnonymousClass3(continuation);
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
            AccessToken accessToken$vkid_release = VKIDUserRefresher.this.tokenStorage.getAccessToken$vkid_release();
            return new Q(accessToken$vkid_release != null ? accessToken$vkid_release.getToken() : null, VKIDUserRefresher.this.deviceIdProvider.getDeviceId$vkid_release());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Q<String, String>> continuation) {
            return ((AnonymousClass3) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKIDUserRefresher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lcom/vk/id/internal/api/dto/VKIDUserInfoPayload;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.refreshuser.VKIDUserRefresher$refresh$5", f = "VKIDUserRefresher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.refreshuser.VKIDUserRefresher$refresh$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements p<T, Continuation<? super Z<? extends VKIDUserInfoPayload>>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $clientId;
        final /* synthetic */ String $deviceId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, String str3, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$clientId = str2;
            this.$deviceId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKIDUserRefresher.this.new AnonymousClass5(this.$accessToken, this.$clientId, this.$deviceId, continuation);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Z<? extends VKIDUserInfoPayload>> continuation) {
            return invoke2(t12, (Continuation<? super Z<VKIDUserInfoPayload>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return Z.a(VKIDUserRefresher.this.api.getUserInfo(this.$accessToken, this.$clientId, this.$deviceId).mo119executed1pmJ48());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Z<VKIDUserInfoPayload>> continuation) {
            return ((AnonymousClass5) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public VKIDUserRefresher(@k VKIDApiService vKIDApiService, @k InternalVKIDTokenStorage internalVKIDTokenStorage, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k ServiceCredentials serviceCredentials, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers, @k VKIDTokenRefresher vKIDTokenRefresher) {
        this.api = vKIDApiService;
        this.tokenStorage = internalVKIDTokenStorage;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.dispatchers = vKIDCoroutinesDispatchers;
        this.refresher = vKIDTokenRefresher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(@Y61.k com.vk.id.refreshuser.VKIDGetUserCallback r28, @Y61.k com.vk.id.refreshuser.VKIDGetUserParams r29, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r30) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.refreshuser.VKIDUserRefresher.refresh(com.vk.id.refreshuser.VKIDGetUserCallback, com.vk.id.refreshuser.VKIDGetUserParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
