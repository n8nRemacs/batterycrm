package com.vk.id.internal.di;

import Q11.b;
import Y41.a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.AuthOptionsCreator;
import com.vk.id.AuthResultHandler;
import com.vk.id.TokensHandler;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.stat.StatTracker;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.fetchuser.VKIDUserInfoFetcher;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.auth.AuthProvidersChooserDefault;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.TrustedProvidersCache;
import com.vk.id.internal.auth.device.DeviceIdPrefs;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.captcha.ForceError14Interceptor;
import com.vk.id.internal.captcha.HitmanChallengeInterceptor;
import com.vk.id.internal.concurrent.CoroutinesDispatchersProd;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.context.AndroidPackageManager;
import com.vk.id.internal.context.DefaultActivityStarter;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.ipc.VkSilentAuthInfoProvider;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.internal.user.UserDataFetcher;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.network.InternalVKIDApiContract;
import com.vk.id.network.InternalVKIDRealApi;
import com.vk.id.network.OkHttpClientProvider;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApi;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.refreshuser.VKIDUserRefresher;
import com.vk.id.storage.InternalVKIDEncryptedSharedPreferencesStorage;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.storage.InternalVKIDTokenStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import com.vk.id.tracking.tracer.TrackingDeps;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: VKIDDepsProd.kt */
@P
@s0
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010 R\u001a\u00105\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\bI\u0010\"R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010 R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010 R \u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010 \u001a\u0004\bP\u0010\"R \u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010 \u001a\u0004\bS\u0010\"R \u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010 \u001a\u0004\bV\u0010\"R\u001b\u0010[\u001a\u00020W8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bX\u0010 \u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010 \u001a\u0004\bc\u0010\"R \u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010 \u001a\u0004\bf\u0010\"R \u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010 \u001a\u0004\bi\u0010\"R \u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010 \u001a\u0004\bl\u0010\"R \u0010n\u001a\b\u0012\u0004\u0012\u00020m0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010 \u001a\u0004\bo\u0010\"R \u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010 \u001a\u0004\br\u0010\"R\u001b\u0010w\u001a\u00020s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bt\u0010 \u001a\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010 R\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020z0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010 R\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010 \u001a\u0004\b~\u0010\u007fR$\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010 \u001a\u0005\b\u0083\u0001\u0010\"R$\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010 \u001a\u0005\b\u0086\u0001\u0010\"R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010 R\u001d\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010 R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010 \u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010 \u001a\u0005\b\u0092\u0001\u0010\"R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/vk/id/internal/di/VKIDDepsProd;", "Lcom/vk/id/internal/di/VKIDDeps;", "Landroid/content/Context;", "appContext", "", "isFlutter", "", "captchaRedirectUri", "forceError14", "forceHitmanChallenge", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "<init>", "(Landroid/content/Context;ZLjava/lang/String;ZZLcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "Landroid/content/ComponentName;", "componentName", "Landroid/content/pm/ActivityInfo;", "getActivityInfo", "(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Z", "()Z", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit", "()Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "context", "getContext", "Lkotlin/C;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lkotlin/C;", "getServiceCredentials", "()Lkotlin/C;", "Lcom/vk/id/tracking/tracer/TrackingDeps;", "trackingDeps$delegate", "getTrackingDeps", "()Lcom/vk/id/tracking/tracer/TrackingDeps;", "trackingDeps", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter$delegate", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker$delegate", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "silentAuthServicesProvider", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "vkidPackageManager", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "getVkidPackageManager", "()Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "activityStarter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "getActivityStarter", "()Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "", "Lokhttp3/Interceptor;", "additionalInterceptors", "Ljava/util/List;", "Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "getApi", "Lcom/vk/id/internal/api/VKIDApiService;", "apiService", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "trustedProvidersCache", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "getVkSilentAuthInfoProvider", "Lcom/vk/id/internal/user/UserDataFetcher;", "userDataFetcher", "getUserDataFetcher", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "authProvidersChooser", "getAuthProvidersChooser", "Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator$delegate", "getAuthOptionsCreator", "()Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "authCallbacksHolder", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "getAuthCallbacksHolder", "()Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/AuthResultHandler;", "authResultHandler", "getAuthResultHandler", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "tokenRefresher", "getTokenRefresher", "Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "tokenExchanger", "getTokenExchanger", "Lcom/vk/id/refreshuser/VKIDUserRefresher;", "userRefresher", "getUserRefresher", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "getLoggerOut", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "encryptedSharedPreferencesStorage", "getEncryptedSharedPreferencesStorage", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage$delegate", "getTokenStorage", "()Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "userInfoFetcher", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator$delegate", "getStateGenerator", "()Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "getPrefsStore", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "deviceIdStorage", "getDeviceIdStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "pkceGenerator", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "groupSubscriptionApi$delegate", "getGroupSubscriptionApi", "()Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "groupSubscriptionApi", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "groupSubscriptionApiService", "getGroupSubscriptionApiService", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "getDispatchers", "()Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "getStatTracker", "()Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "statTracker", "getTrackingTracker", "trackingTracker", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class VKIDDepsProd implements VKIDDeps {

    @k
    private final InternalVKIDActivityStarter activityStarter;

    @k
    private final List<Interceptor> additionalInterceptors;

    @k
    private final InterfaceC42726C<InternalVKIDApiContract> api;

    @k
    private final InterfaceC42726C<VKIDApiService> apiService;

    @k
    private final Context appContext;

    @k
    private final AuthCallbacksHolder authCallbacksHolder;

    /* renamed from: authOptionsCreator$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C authOptionsCreator;

    @k
    private final InterfaceC42726C<AuthProvidersChooser> authProvidersChooser;

    @k
    private final InterfaceC42726C<AuthResultHandler> authResultHandler;

    @k
    private final Context context;

    /* renamed from: crashReporter$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C crashReporter;

    @k
    private final InterfaceC42726C<InternalVKIDDeviceIdProvider> deviceIdProvider;

    @k
    private final InterfaceC42726C<InternalVKIDDeviceIdProvider.DeviceIdStorage> deviceIdStorage;

    @k
    private final InterfaceC42726C<InternalVKIDPreferencesStorage> encryptedSharedPreferencesStorage;

    /* renamed from: groupSubscriptionApi$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C groupSubscriptionApi;

    @k
    private final InterfaceC42726C<InternalVKIDGroupSubscriptionApiContract> groupSubscriptionApiService;

    @l
    private final GroupSubscriptionLimit groupSubscriptionLimit;
    private final boolean isFlutter;

    @k
    private final InterfaceC42726C<VKIDLoggerOut> loggerOut;

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C okHttpClient;

    /* renamed from: performanceTracker$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C performanceTracker;

    @k
    private final InterfaceC42726C<PkceGeneratorSHA256> pkceGenerator;

    @k
    private final InterfaceC42726C<InternalVKIDPrefsStore> prefsStore;

    @k
    private final InterfaceC42726C<ServiceCredentials> serviceCredentials;

    @k
    private final InterfaceC42726C<SilentAuthServicesProvider> silentAuthServicesProvider;

    /* renamed from: stateGenerator$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C stateGenerator;

    @k
    private final InterfaceC42726C<VKIDTokenExchanger> tokenExchanger;

    @k
    private final InterfaceC42726C<VKIDTokenRefresher> tokenRefresher;

    /* renamed from: tokenStorage$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C tokenStorage;

    @k
    private final InterfaceC42726C<TokensHandler> tokensHandler;

    /* renamed from: trackingDeps$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C trackingDeps;

    @k
    private final InterfaceC42726C<TrustedProvidersCache> trustedProvidersCache;

    @k
    private final InterfaceC42726C<UserDataFetcher> userDataFetcher;

    @k
    private final InterfaceC42726C<VKIDUserInfoFetcher> userInfoFetcher;

    @k
    private final InterfaceC42726C<VKIDUserRefresher> userRefresher;

    @k
    private final InterfaceC42726C<SilentAuthInfoProvider> vkSilentAuthInfoProvider;

    @k
    private final InternalVKIDPackageManager vkidPackageManager;

    public VKIDDepsProd(@k Context context, boolean z12, @l String str, boolean z13, boolean z14, @l GroupSubscriptionLimit groupSubscriptionLimit) {
        final int i12 = 1;
        final int i13 = 2;
        final int i14 = 0;
        this.appContext = context;
        this.isFlutter = z12;
        this.groupSubscriptionLimit = groupSubscriptionLimit;
        this.context = getAppContext();
        final int i15 = 19;
        this.serviceCredentials = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i16 = 3;
        this.trackingDeps = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i17 = 12;
        this.crashReporter = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i18 = 13;
        this.performanceTracker = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i19 = 14;
        this.silentAuthServicesProvider = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.vkidPackageManager = new AndroidPackageManager(getAppContext().getPackageManager());
        this.activityStarter = new DefaultActivityStarter(getAppContext());
        this.additionalInterceptors = C42756l.B(new Interceptor[]{z14 ? new HitmanChallengeInterceptor() : null, z13 ? new ForceError14Interceptor(str) : null});
        final int i22 = 15;
        this.okHttpClient = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i23 = 16;
        this.api = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i24 = 17;
        this.apiService = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i25 = 18;
        this.trustedProvidersCache = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i26 = 20;
        this.vkSilentAuthInfoProvider = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i27 = 21;
        this.userDataFetcher = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i28 = 22;
        this.authProvidersChooser = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i29 = 23;
        this.authOptionsCreator = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.authCallbacksHolder = new AuthCallbacksHolder();
        final int i32 = 24;
        this.authResultHandler = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i33 = 25;
        this.tokenRefresher = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i34 = 26;
        this.tokenExchanger = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i35 = 27;
        this.userRefresher = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.loggerOut = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.encryptedSharedPreferencesStorage = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.tokenStorage = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i36 = 4;
        this.userInfoFetcher = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i37 = 5;
        this.tokensHandler = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i38 = 6;
        this.stateGenerator = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i39 = 7;
        this.prefsStore = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i42 = 8;
        this.deviceIdStorage = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i42) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i43 = 9;
        this.deviceIdProvider = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        this.pkceGenerator = C42727D.c(new b(i14));
        final int i44 = 10;
        this.groupSubscriptionApi = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
        final int i45 = 11;
        this.groupSubscriptionApiService = C42727D.c(new a(this) { // from class: Q11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKIDDepsProd f13421c;

            {
                this.f13421c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i45) {
                    case 0:
                        return VKIDDepsProd.loggerOut$lambda$19(this.f13421c);
                    case 1:
                        return VKIDDepsProd.encryptedSharedPreferencesStorage$lambda$20(this.f13421c);
                    case 2:
                        return VKIDDepsProd.tokenStorage_delegate$lambda$21(this.f13421c);
                    case 3:
                        return VKIDDepsProd.trackingDeps_delegate$lambda$1(this.f13421c);
                    case 4:
                        return VKIDDepsProd.userInfoFetcher$lambda$22(this.f13421c);
                    case 5:
                        return VKIDDepsProd.tokensHandler$lambda$23(this.f13421c);
                    case 6:
                        return VKIDDepsProd.stateGenerator_delegate$lambda$24(this.f13421c);
                    case 7:
                        return VKIDDepsProd.prefsStore$lambda$25(this.f13421c);
                    case 8:
                        return VKIDDepsProd.deviceIdStorage$lambda$26(this.f13421c);
                    case 9:
                        return VKIDDepsProd.deviceIdProvider$lambda$27(this.f13421c);
                    case 10:
                        return VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30(this.f13421c);
                    case 11:
                        return VKIDDepsProd.groupSubscriptionApiService$lambda$31(this.f13421c);
                    case 12:
                        return VKIDDepsProd.crashReporter_delegate$lambda$2(this.f13421c);
                    case 13:
                        return VKIDDepsProd.performanceTracker_delegate$lambda$3(this.f13421c);
                    case 14:
                        return VKIDDepsProd.silentAuthServicesProvider$lambda$4(this.f13421c);
                    case 15:
                        return VKIDDepsProd.okHttpClient_delegate$lambda$7(this.f13421c);
                    case 16:
                        return VKIDDepsProd.api$lambda$8(this.f13421c);
                    case 17:
                        return VKIDDepsProd.apiService$lambda$9(this.f13421c);
                    case 18:
                        return VKIDDepsProd.trustedProvidersCache$lambda$10(this.f13421c);
                    case 19:
                        return VKIDDepsProd.serviceCredentials$lambda$0(this.f13421c);
                    case 20:
                        return VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11(this.f13421c);
                    case 21:
                        return VKIDDepsProd.userDataFetcher$lambda$12(this.f13421c);
                    case 22:
                        return VKIDDepsProd.authProvidersChooser$lambda$13(this.f13421c);
                    case 23:
                        return VKIDDepsProd.authOptionsCreator_delegate$lambda$14(this.f13421c);
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return VKIDDepsProd.authResultHandler$lambda$15(this.f13421c);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return VKIDDepsProd.tokenRefresher$lambda$16(this.f13421c);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return VKIDDepsProd.tokenExchanger$lambda$17(this.f13421c);
                    default:
                        return VKIDDepsProd.userRefresher$lambda$18(this.f13421c);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDRealApi api$lambda$8(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDRealApi(vKIDDepsProd.getOkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDApiService apiService$lambda$9(VKIDDepsProd vKIDDepsProd) {
        return new VKIDApiService(vKIDDepsProd.getApi().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthOptionsCreator authOptionsCreator_delegate$lambda$14(VKIDDepsProd vKIDDepsProd) {
        return new AuthOptionsCreator(vKIDDepsProd.getAppContext(), vKIDDepsProd.pkceGenerator, vKIDDepsProd.getPrefsStore(), vKIDDepsProd.getServiceCredentials(), vKIDDepsProd.getStateGenerator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthProvidersChooserDefault authProvidersChooser$lambda$13(VKIDDepsProd vKIDDepsProd) {
        return new AuthProvidersChooserDefault(vKIDDepsProd.getVkidPackageManager(), new SilentAuthServicesProvider(vKIDDepsProd.getVkidPackageManager(), vKIDDepsProd.getAppContext().getPackageName(), vKIDDepsProd.trustedProvidersCache.getValue()), vKIDDepsProd.getActivityStarter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthResultHandler authResultHandler$lambda$15(VKIDDepsProd vKIDDepsProd) {
        return new AuthResultHandler(vKIDDepsProd.getDispatchers(), vKIDDepsProd.getAuthCallbacksHolder(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getPrefsStore().getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.apiService.getValue(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getLoggerOut().getValue(), vKIDDepsProd.getTokenStorage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrashReporter crashReporter_delegate$lambda$2(VKIDDepsProd vKIDDepsProd) {
        return vKIDDepsProd.getTrackingDeps().getCrashReporter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDDeviceIdProvider deviceIdProvider$lambda$27(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDDeviceIdProvider(vKIDDepsProd.getAppContext(), vKIDDepsProd.getDeviceIdStorage().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceIdPrefs deviceIdStorage$lambda$26(VKIDDepsProd vKIDDepsProd) {
        return new DeviceIdPrefs(vKIDDepsProd.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDEncryptedSharedPreferencesStorage encryptedSharedPreferencesStorage$lambda$20(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDEncryptedSharedPreferencesStorage(vKIDDepsProd.getAppContext());
    }

    @SuppressLint({"WrongConstant"})
    private final ActivityInfo getActivityInfo(ComponentName componentName) {
        if (Build.VERSION.SDK_INT < 33) {
            return getAppContext().getPackageManager().getActivityInfo(componentName, 129);
        }
        try {
            return getAppContext().getPackageManager().getActivityInfo(componentName, PackageManager.ComponentInfoFlags.of(129));
        } catch (Throwable unused) {
            return getAppContext().getPackageManager().getActivityInfo(componentName, 129);
        }
    }

    private final InternalVKIDGroupSubscriptionApi getGroupSubscriptionApi() {
        return (InternalVKIDGroupSubscriptionApi) this.groupSubscriptionApi.getValue();
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    private final StateGenerator getStateGenerator() {
        return (StateGenerator) this.stateGenerator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingDeps getTrackingDeps() {
        return (TrackingDeps) this.trackingDeps.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDGroupSubscriptionApiService groupSubscriptionApiService$lambda$31(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDGroupSubscriptionApiService(vKIDDepsProd.getGroupSubscriptionApi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDGroupSubscriptionApi groupSubscriptionApi_delegate$lambda$30(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDGroupSubscriptionApi(vKIDDepsProd.getOkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDLoggerOut loggerOut$lambda$19(VKIDDepsProd vKIDDepsProd) {
        return new VKIDLoggerOut(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient okHttpClient_delegate$lambda$7(VKIDDepsProd vKIDDepsProd) {
        return new OkHttpClientProvider(vKIDDepsProd.getAppContext()).provide(vKIDDepsProd.additionalInterceptors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceTracker performanceTracker_delegate$lambda$3(VKIDDepsProd vKIDDepsProd) {
        return vKIDDepsProd.getTrackingDeps().getPerformanceTracker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PkceGeneratorSHA256 pkceGenerator$lambda$28() {
        return new PkceGeneratorSHA256();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDPrefsStore prefsStore$lambda$25(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDPrefsStore(vKIDDepsProd.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServiceCredentials serviceCredentials$lambda$0(VKIDDepsProd vKIDDepsProd) {
        ActivityInfo activityInfo = vKIDDepsProd.getActivityInfo(new ComponentName(vKIDDepsProd.getAppContext(), (Class<?>) AuthActivity.class));
        return new ServiceCredentials(String.valueOf(VKIDDepsProdKt.getIntOrThrow(activityInfo.metaData, "VKIDClientID")), VKIDDepsProdKt.getStringOrThrow(activityInfo.metaData, "VKIDClientSecret"), m.l(VKIDDepsProdKt.getStringOrThrow(activityInfo.metaData, "VKIDRedirectScheme"), "://", VKIDDepsProdKt.getStringOrThrow(activityInfo.metaData, "VKIDRedirectHost"), "/blank.html"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SilentAuthServicesProvider silentAuthServicesProvider$lambda$4(VKIDDepsProd vKIDDepsProd) {
        return new SilentAuthServicesProvider(vKIDDepsProd.getVkidPackageManager(), vKIDDepsProd.getAppContext().getPackageName(), vKIDDepsProd.trustedProvidersCache.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateGenerator stateGenerator_delegate$lambda$24(VKIDDepsProd vKIDDepsProd) {
        return new StateGenerator(vKIDDepsProd.getPrefsStore().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDTokenExchanger tokenExchanger$lambda$17(VKIDDepsProd vKIDDepsProd) {
        return new VKIDTokenExchanger(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getStateGenerator(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getPrefsStore().getValue(), vKIDDepsProd.pkceGenerator.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDTokenRefresher tokenRefresher$lambda$16(VKIDDepsProd vKIDDepsProd) {
        return new VKIDTokenRefresher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getStateGenerator(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getPrefsStore().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDTokenStorage tokenStorage_delegate$lambda$21(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDTokenStorage(vKIDDepsProd.getEncryptedSharedPreferencesStorage().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokensHandler tokensHandler$lambda$23(VKIDDepsProd vKIDDepsProd) {
        return new TokensHandler(vKIDDepsProd.userInfoFetcher.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackingDeps trackingDeps_delegate$lambda$1(VKIDDepsProd vKIDDepsProd) {
        return new TrackingDeps(vKIDDepsProd.getAppContext(), vKIDDepsProd.getServiceCredentials().getValue().getClientID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedProvidersCache trustedProvidersCache$lambda$10(VKIDDepsProd vKIDDepsProd) {
        ServiceCredentials value = vKIDDepsProd.getServiceCredentials().getValue();
        return new TrustedProvidersCache(vKIDDepsProd.apiService, value.getClientID(), value.getClientSecret(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserDataFetcher userDataFetcher$lambda$12(VKIDDepsProd vKIDDepsProd) {
        return new UserDataFetcher(vKIDDepsProd.getDispatchers(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getVkSilentAuthInfoProvider().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDUserInfoFetcher userInfoFetcher$lambda$22(VKIDDepsProd vKIDDepsProd) {
        return new VKIDUserInfoFetcher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDUserRefresher userRefresher$lambda$18(VKIDDepsProd vKIDDepsProd) {
        return new VKIDUserRefresher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getTokenRefresher().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VkSilentAuthInfoProvider vkSilentAuthInfoProvider$lambda$11(VKIDDepsProd vKIDDepsProd) {
        return new VkSilentAuthInfoProvider(vKIDDepsProd.getAppContext(), vKIDDepsProd.silentAuthServicesProvider.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), 0L, 8, null);
    }

    @k
    public InternalVKIDActivityStarter getActivityStarter() {
        return this.activityStarter;
    }

    @k
    public InterfaceC42726C<InternalVKIDApiContract> getApi() {
        return this.api;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public Context getAppContext() {
        return this.appContext;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public AuthCallbacksHolder getAuthCallbacksHolder() {
        return this.authCallbacksHolder;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public AuthOptionsCreator getAuthOptionsCreator() {
        return (AuthOptionsCreator) this.authOptionsCreator.getValue();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<AuthProvidersChooser> getAuthProvidersChooser() {
        return this.authProvidersChooser;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<AuthResultHandler> getAuthResultHandler() {
        return this.authResultHandler;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public Context getContext() {
        return this.context;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public CrashReporter getCrashReporter() {
        return (CrashReporter) this.crashReporter.getValue();
    }

    @k
    public InterfaceC42726C<InternalVKIDDeviceIdProvider.DeviceIdStorage> getDeviceIdStorage() {
        return this.deviceIdStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public VKIDCoroutinesDispatchers getDispatchers() {
        return new CoroutinesDispatchersProd();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<InternalVKIDPreferencesStorage> getEncryptedSharedPreferencesStorage() {
        return this.encryptedSharedPreferencesStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<InternalVKIDGroupSubscriptionApiContract> getGroupSubscriptionApiService() {
        return this.groupSubscriptionApiService;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @l
    public GroupSubscriptionLimit getGroupSubscriptionLimit() {
        return this.groupSubscriptionLimit;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<VKIDLoggerOut> getLoggerOut() {
        return this.loggerOut;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public PerformanceTracker getPerformanceTracker() {
        return (PerformanceTracker) this.performanceTracker.getValue();
    }

    @k
    public InterfaceC42726C<InternalVKIDPrefsStore> getPrefsStore() {
        return this.prefsStore;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<ServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public VKIDAnalytics.Tracker getStatTracker() {
        ServiceCredentials value = getServiceCredentials().getValue();
        return new StatTracker(value.getClientID(), value.getClientSecret(), getApi(), getDispatchers().getIo(), getAppContext());
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<VKIDTokenExchanger> getTokenExchanger() {
        return this.tokenExchanger;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<VKIDTokenRefresher> getTokenRefresher() {
        return this.tokenRefresher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InternalVKIDTokenStorage getTokenStorage() {
        return (InternalVKIDTokenStorage) this.tokenStorage.getValue();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public VKIDAnalytics.Tracker getTrackingTracker() {
        return new VKIDAnalytics.Tracker() { // from class: com.vk.id.internal.di.VKIDDepsProd$trackingTracker$1
            @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
            public void trackEvent(String accessToken, String name, VKIDAnalytics.EventParam... params) {
                this.this$0.getTrackingDeps().getAnalyticsTracking().log(name + " " + C42756l.P(params, null, null, null, null, 63));
            }
        };
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<UserDataFetcher> getUserDataFetcher() {
        return this.userDataFetcher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<VKIDUserRefresher> getUserRefresher() {
        return this.userRefresher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @k
    public InterfaceC42726C<SilentAuthInfoProvider> getVkSilentAuthInfoProvider() {
        return this.vkSilentAuthInfoProvider;
    }

    @k
    public InternalVKIDPackageManager getVkidPackageManager() {
        return this.vkidPackageManager;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    /* renamed from: isFlutter, reason: from getter */
    public boolean getIsFlutter() {
        return this.isFlutter;
    }

    public /* synthetic */ VKIDDepsProd(Context context, boolean z12, String str, boolean z13, boolean z14, GroupSubscriptionLimit groupSubscriptionLimit, int i12, C42822w c42822w) {
        this(context, z12, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, groupSubscriptionLimit);
    }
}
