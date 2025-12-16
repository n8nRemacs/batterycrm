package com.vk.id.logout;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.AccessToken;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.logout.VKIDLogoutParams;
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

/* compiled from: VKIDLoggerOut.kt */
@P
@s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/vk/id/logout/VKIDLoggerOut;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "Lcom/vk/id/logout/VKIDLogoutCallback;", "callback", "", "accessToken", "", "clearTokenStorage", "Lcom/vk/id/logout/VKIDLogoutParams;", "params", "Lkotlin/G0;", "logout", "(Lcom/vk/id/logout/VKIDLogoutCallback;Ljava/lang/String;ZLcom/vk/id/logout/VKIDLogoutParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDLoggerOut {

    @k
    private final VKIDApiService api;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    /* compiled from: VKIDLoggerOut.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.logout.VKIDLoggerOut", f = "VKIDLoggerOut.kt", i = {0, 0, 0, 1, 2, 2, 2, 3, 3, 3, 4}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 32, 37, 45, 51}, m = "logout", n = {"this", "callback", "clearTokenStorage", "callback", "this", "callback", "clearTokenStorage", "this", "callback", "clearTokenStorage", "callback"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0"})
    /* renamed from: com.vk.id.logout.VKIDLoggerOut$logout$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
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
            return VKIDLoggerOut.this.logout(null, null, false, null, this);
        }
    }

    /* compiled from: VKIDLoggerOut.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.logout.VKIDLoggerOut$logout$3", f = "VKIDLoggerOut.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.logout.VKIDLoggerOut$logout$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends String>>, Object> {
        final /* synthetic */ String $accessToken;
        int label;
        final /* synthetic */ VKIDLoggerOut this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, VKIDLoggerOut vKIDLoggerOut, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.this$0 = vKIDLoggerOut;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$accessToken, this.this$0, continuation);
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
            String token = this.$accessToken;
            if (token == null) {
                AccessToken accessToken$vkid_release = this.this$0.tokenStorage.getAccessToken$vkid_release();
                token = accessToken$vkid_release != null ? accessToken$vkid_release.getToken() : null;
            }
            return new Q(token, this.this$0.deviceIdProvider.getDeviceId$vkid_release());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Q<String, String>> continuation) {
            return ((AnonymousClass3) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKIDLoggerOut.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.logout.VKIDLoggerOut$logout$5", f = "VKIDLoggerOut.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.logout.VKIDLoggerOut$logout$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements p<T, Continuation<? super Z<? extends G0>>, Object> {
        final /* synthetic */ String $clientId;
        final /* synthetic */ String $deviceId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, String str3, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$clientId = str2;
            this.$deviceId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKIDLoggerOut.this.new AnonymousClass5(this.$token, this.$clientId, this.$deviceId, continuation);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Z<? extends G0>> continuation) {
            return invoke2(t12, (Continuation<? super Z<G0>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return Z.a(VKIDLoggerOut.this.api.logout(this.$token, this.$clientId, this.$deviceId).mo119executed1pmJ48());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Z<G0>> continuation) {
            return ((AnonymousClass5) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public VKIDLoggerOut(@k VKIDApiService vKIDApiService, @k InternalVKIDTokenStorage internalVKIDTokenStorage, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k ServiceCredentials serviceCredentials, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers) {
        this.api = vKIDApiService;
        this.tokenStorage = internalVKIDTokenStorage;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.dispatchers = vKIDCoroutinesDispatchers;
    }

    public static /* synthetic */ Object logout$default(VKIDLoggerOut vKIDLoggerOut, VKIDLogoutCallback vKIDLogoutCallback, String str, boolean z12, VKIDLogoutParams vKIDLogoutParams, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            vKIDLogoutParams = new VKIDLogoutParams.Builder().build();
        }
        return vKIDLoggerOut.logout(vKIDLogoutCallback, str2, z13, vKIDLogoutParams, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logout(@Y61.k com.vk.id.logout.VKIDLogoutCallback r20, @Y61.l java.lang.String r21, boolean r22, @Y61.k com.vk.id.logout.VKIDLogoutParams r23, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.logout.VKIDLoggerOut.logout(com.vk.id.logout.VKIDLogoutCallback, java.lang.String, boolean, com.vk.id.logout.VKIDLogoutParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
