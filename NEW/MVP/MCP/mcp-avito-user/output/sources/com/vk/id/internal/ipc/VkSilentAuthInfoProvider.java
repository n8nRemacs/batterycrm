package com.vk.id.internal.ipc;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.pm.Signature;
import android.os.IBinder;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.internal.auth.app.SilentAuthInfoUtils;
import com.vk.id.internal.auth.app.SilentAuthProviderData;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.silentauth.a;
import com.vk.silentauth.b;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VkSilentAuthInfoProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 <2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002=<B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0011\u001a\u00020\nH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "Lcom/vk/id/internal/ipc/IPCClientBaseProvider;", "Lcom/vk/silentauth/a;", "Landroid/content/Context;", "context", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "servicesProvider", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "", "defaultTimeout", "<init>", "(Landroid/content/Context;Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;J)V", "Lcom/vk/id/internal/auth/app/SilentAuthProviderData;", "component", "startTime", "timeout", "Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "getSpecificAppSilentAuthInfos", "(Lcom/vk/id/internal/auth/app/SilentAuthProviderData;JJ)Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "provider", "getInfosFromAidl", "(Lcom/vk/silentauth/a;Lcom/vk/id/internal/auth/app/SilentAuthProviderData;)Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "Lcom/vk/id/internal/ipc/ConnectionInfo;", "connectionInfo", "Landroid/os/IBinder;", "service", "Lkotlin/G0;", "setProvider", "(Lcom/vk/id/internal/ipc/ConnectionInfo;Landroid/os/IBinder;)V", "", "Lcom/vk/silentauth/SilentAuthInfo;", "getSilentAuthInfos", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "appId", "setAppId", "(I)V", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "J", "getDefaultTimeout", "()J", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "I", "", "apiVersion", "Ljava/lang/String;", "getIntentName", "()Ljava/lang/String;", "intentName", "Companion", "SilentAuthResult", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VkSilentAuthInfoProvider extends IPCClientBaseProvider<a> implements SilentAuthInfoProvider {

    @l
    private String apiVersion;

    @k
    private Context appContext;
    private int appId;
    private final long defaultTimeout;

    @k
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @k
    private final InternalVKIDLogger logger;

    @k
    private final SilentAuthServicesProvider servicesProvider;
    public static final int $stable = 8;

    /* compiled from: VkSilentAuthInfoProvider.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.internal.ipc.VkSilentAuthInfoProvider", f = "VkSilentAuthInfoProvider.kt", i = {0, 0, 0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "getSilentAuthInfos", n = {"this", "timeout", "startTime"}, s = {"L$0", "J$0", "J$1"})
    /* renamed from: com.vk.id.internal.ipc.VkSilentAuthInfoProvider$getSilentAuthInfos$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
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
            return VkSilentAuthInfoProvider.this.getSilentAuthInfos(0L, this);
        }
    }

    public /* synthetic */ VkSilentAuthInfoProvider(Context context, SilentAuthServicesProvider silentAuthServicesProvider, InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, long j12, int i12, C42822w c42822w) {
        this(context, silentAuthServicesProvider, internalVKIDDeviceIdProvider, (i12 & 8) != 0 ? TimeUnit.SECONDS.toMillis(30L) : j12);
    }

    private final SilentAuthResult getInfosFromAidl(a provider, SilentAuthProviderData component) {
        if (provider == null) {
            return new SilentAuthResult(new NullPointerException("Provider is null"));
        }
        Signature signature = getSignature();
        if (signature == null) {
            return new SilentAuthResult(new NullPointerException("Signature is null"));
        }
        try {
            List listU0 = provider.u0(this.appId, getAppContext().getPackageName(), SilentAuthInfoUtils.INSTANCE.calculateDigestBase64(signature), UUID.randomUUID().toString(), this.apiVersion, this.deviceIdProvider.getDeviceId$vkid_release());
            ArrayList arrayList = new ArrayList(C42745f0.q(listU0, 10));
            Iterator it = listU0.iterator();
            while (it.hasNext()) {
                arrayList.add(new b(SilentAuthInfo.a((SilentAuthInfo) it.next(), component.getComponentName().getPackageName(), null, 114687), component.getWeight()));
            }
            return new SilentAuthResult(arrayList);
        } catch (Exception e12) {
            return new SilentAuthResult(e12);
        }
    }

    private final SilentAuthResult getSpecificAppSilentAuthInfos(SilentAuthProviderData component, long startTime, long timeout) {
        return getInfosFromAidl(getProvider(component.getComponentName(), startTime, timeout), component);
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    @k
    public Context getAppContext() {
        return this.appContext;
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public long getDefaultTimeout() {
        return this.defaultTimeout;
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    @k
    public String getIntentName() {
        return "com.vk.silentauth.action.GET_INFO";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getSilentAuthInfos(long r13, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<com.vk.silentauth.SilentAuthInfo>> r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.ipc.VkSilentAuthInfoProvider.getSilentAuthInfos(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    public void setProvider(@l ConnectionInfo<a> connectionInfo, @l IBinder service) {
        if (connectionInfo != null) {
            connectionInfo.setProvider(a.b.e4(service));
        }
    }

    /* compiled from: VkSilentAuthInfoProvider.kt */
    @P
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\nB\u0015\b\u0016\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "", "", "Lcom/vk/silentauth/b;", "infoItems", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/util/List;Ljava/lang/Exception;)V", "(Ljava/util/List;)V", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInfoItems", "()Ljava/util/List;", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SilentAuthResult {

        @l
        private final Exception exception;

        @k
        private final List<b> infoItems;

        public SilentAuthResult(@k Exception exc) {
            this(C42784z0.f406748b, exc);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SilentAuthResult)) {
                return false;
            }
            SilentAuthResult silentAuthResult = (SilentAuthResult) other;
            return L.f(this.infoItems, silentAuthResult.infoItems) && L.f(this.exception, silentAuthResult.exception);
        }

        @l
        public final Exception getException() {
            return this.exception;
        }

        @k
        public final List<b> getInfoItems() {
            return this.infoItems;
        }

        public int hashCode() {
            int iHashCode = this.infoItems.hashCode() * 31;
            Exception exc = this.exception;
            return iHashCode + (exc == null ? 0 : exc.hashCode());
        }

        @k
        public String toString() {
            return "SilentAuthResult(infoItems=" + this.infoItems + ", exception=" + this.exception + ")";
        }

        public SilentAuthResult(@k List<b> list, @l Exception exc) {
            this.infoItems = list;
            this.exception = exc;
        }

        public SilentAuthResult(@k List<b> list) {
            this(list, null);
        }
    }

    public VkSilentAuthInfoProvider(@k Context context, @k SilentAuthServicesProvider silentAuthServicesProvider, @k InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, long j12) {
        this.servicesProvider = silentAuthServicesProvider;
        this.deviceIdProvider = internalVKIDDeviceIdProvider;
        this.defaultTimeout = j12;
        this.logger = InternalVKIDLog.INSTANCE.createLoggerForTag("VkSilentAuthInfoProvider");
        this.appContext = context.getApplicationContext();
        this.apiVersion = "5.219";
    }
}
