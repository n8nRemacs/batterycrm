package com.vk.id.fetchuser;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VKIDUserInfoFetcher.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJP\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "", "accessToken", "Lkotlin/Function2;", "Lcom/vk/id/VKIDUser;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "onSuccess", "Lkotlin/Function1;", "", "onFailedApiCall", "fetch", "(Ljava/lang/String;LY41/p;LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDUserInfoFetcher {

    @k
    private final VKIDApiService api;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final ServiceCredentials serviceCredentials;

    /* compiled from: VKIDUserInfoFetcher.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.fetchuser.VKIDUserInfoFetcher", f = "VKIDUserInfoFetcher.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, 35}, m = "fetch", n = {"this", "accessToken", "onSuccess", "onFailedApiCall", "clientId", "onSuccess", "onFailedApiCall"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    /* renamed from: com.vk.id.fetchuser.VKIDUserInfoFetcher$fetch$1, reason: invalid class name */
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
            return VKIDUserInfoFetcher.this.fetch(null, null, null, this);
        }
    }

    public VKIDUserInfoFetcher(@k VKIDApiService vKIDApiService, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, @k ServiceCredentials serviceCredentials, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers) {
        this.api = vKIDApiService;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.dispatchers = vKIDCoroutinesDispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(@Y61.k java.lang.String r21, @Y61.k Y41.p<? super com.vk.id.VKIDUser, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r22, @Y61.k Y41.l<? super java.lang.Throwable, kotlin.G0> r23, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r24) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.fetchuser.VKIDUserInfoFetcher.fetch(java.lang.String, Y41.p, Y41.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
