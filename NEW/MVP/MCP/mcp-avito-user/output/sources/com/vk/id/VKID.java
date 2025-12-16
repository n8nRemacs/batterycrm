package com.vk.id;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import androidx.work.impl.F;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.exchangetoken.VKIDExchangeTokenCallback;
import com.vk.id.exchangetoken.VKIDExchangeTokenParams;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.internal.analytics.CustomAuthAnalytics;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthEventBridge;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.di.VKIDDeps;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.user.UserDataFetcher;
import com.vk.id.logger.InternalVKIDAndroidLogcatLogEngine;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.logger.LogEngine;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.logout.VKIDLogoutCallback;
import com.vk.id.logout.VKIDLogoutParams;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.refresh.VKIDRefreshTokenCallback;
import com.vk.id.refresh.VKIDRefreshTokenParams;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.refreshuser.VKIDGetUserCallback;
import com.vk.id.refreshuser.VKIDGetUserParams;
import com.vk.id.refreshuser.VKIDUserRefresher;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.storage.InternalVKIDTokenStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import com.yandex.metrica.plugins.PluginErrorDetails;
import j.k0;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.sync.d;

/* compiled from: VKID.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000fJ\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b \u0010!J\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"H\u0086@¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00100R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00100R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00100R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00100R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00100R\u001a\u0010I\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00100R \u0010P\u001a\u00020O8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bT\u0010U\u001a\u0004\bR\u0010SR \u0010W\u001a\u00020V8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010U\u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010`\u001a\u00020_8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010U\u001a\u0004\bb\u0010cR(\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010U\u001a\u0004\bi\u0010jR\"\u0010m\u001a\u0004\u0018\u00010l8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bm\u0010n\u0012\u0004\bq\u0010U\u001a\u0004\bo\u0010pR \u0010s\u001a\u00020r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bs\u0010t\u0012\u0004\bw\u0010U\u001a\u0004\bu\u0010vR\u001a\u0010{\u001a\u00020M8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010U\u001a\u0004\bx\u0010yR\u001a\u0010\u007f\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010U\u001a\u0004\b|\u0010}R\u0017\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/vk/id/VKID;", "", "Lcom/vk/id/internal/di/VKIDDeps;", "deps", "<init>", "(Lcom/vk/id/internal/di/VKIDDeps;)V", "Landroidx/lifecycle/P;", "lifecycleOwner", "Lcom/vk/id/auth/VKIDAuthCallback;", "callback", "Lcom/vk/id/auth/VKIDAuthParams;", "params", "Lkotlin/G0;", "authorize", "(Landroidx/lifecycle/P;Lcom/vk/id/auth/VKIDAuthCallback;Lcom/vk/id/auth/VKIDAuthParams;)V", "(Lcom/vk/id/auth/VKIDAuthCallback;Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/refresh/VKIDRefreshTokenCallback;", "Lcom/vk/id/refresh/VKIDRefreshTokenParams;", "refreshToken", "(Lcom/vk/id/refresh/VKIDRefreshTokenCallback;Lcom/vk/id/refresh/VKIDRefreshTokenParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "v1Token", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenCallback;", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;", "exchangeTokenToV2", "(Ljava/lang/String;Lcom/vk/id/exchangetoken/VKIDExchangeTokenCallback;Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/refreshuser/VKIDGetUserCallback;", "Lcom/vk/id/refreshuser/VKIDGetUserParams;", "getUserData", "(Lcom/vk/id/refreshuser/VKIDGetUserCallback;Lcom/vk/id/refreshuser/VKIDGetUserParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/logout/VKIDLogoutCallback;", "Lcom/vk/id/logout/VKIDLogoutParams;", "logout", "(Lcom/vk/id/logout/VKIDLogoutCallback;Lcom/vk/id/logout/VKIDLogoutParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Z;", "Lcom/vk/id/VKIDUser;", "fetchUserData-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserData", "Lkotlinx/coroutines/sync/a;", "requestMutex", "Lkotlinx/coroutines/sync/a;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "Lkotlin/C;", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "authProvidersChooser", "Lkotlin/C;", "Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator", "Lcom/vk/id/AuthOptionsCreator;", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "authCallbacksHolder", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/AuthResultHandler;", "authResultHandler", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "Lcom/vk/id/internal/user/UserDataFetcher;", "userDataFetcher", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "tokenRefresher", "Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "tokenExchanger", "Lcom/vk/id/refreshuser/VKIDUserRefresher;", "userRefresher", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker$vkid_release", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "groupSubscriptionApiServiceInternal", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "getTokenStorage", "()Lcom/vk/id/storage/InternalVKIDTokenStorage;", "getTokenStorage$annotations", "()V", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter$annotations", "Lkotlin/Function0;", "clientIdProvider", "LY41/a;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getContext$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/Locale;", "internalVKIDLocale", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalVKIDLocale", "()Ljava/util/concurrent/atomic/AtomicReference;", "getInternalVKIDLocale$annotations", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit", "()Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit$annotations", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "prefsStorage", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "getPrefsStorage", "()Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "getPrefsStorage$annotations", "getGroupSubscriptionApiService", "()Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "getGroupSubscriptionApiService$annotations", "groupSubscriptionApiService", "getClientId", "()Ljava/lang/String;", "getClientId$annotations", "clientId", "Lcom/vk/id/AccessToken;", "getAccessToken", "()Lcom/vk/id/AccessToken;", "accessToken", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKID {

    @l
    private static volatile VKID _instance;

    @k
    private final AuthCallbacksHolder authCallbacksHolder;

    @k
    private final AuthOptionsCreator authOptionsCreator;

    @k
    private final InterfaceC42726C<AuthProvidersChooser> authProvidersChooser;

    @k
    private final InterfaceC42726C<AuthResultHandler> authResultHandler;

    @k
    private final Y41.a<String> clientIdProvider;

    @k
    private final Context context;

    @k
    private final CrashReporter crashReporter;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final InterfaceC42726C<InternalVKIDGroupSubscriptionApiContract> groupSubscriptionApiServiceInternal;

    @l
    private final GroupSubscriptionLimit groupSubscriptionLimit;

    @k
    private final InterfaceC42726C<VKIDLoggerOut> loggerOut;

    @k
    private final PerformanceTracker performanceTracker;

    @k
    private final InternalVKIDPreferencesStorage prefsStorage;

    @k
    private final InterfaceC42726C<VKIDTokenExchanger> tokenExchanger;

    @k
    private final InterfaceC42726C<VKIDTokenRefresher> tokenRefresher;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    @k
    private final InterfaceC42726C<UserDataFetcher> userDataFetcher;

    @k
    private final InterfaceC42726C<VKIDUserRefresher> userRefresher;

    @k
    private final InterfaceC42726C<SilentAuthInfoProvider> vkSilentAuthInfoProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @k
    private static LogEngine logEngine = new InternalVKIDAndroidLogcatLogEngine();

    @k
    private final kotlinx.coroutines.sync.a requestMutex = new d();

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("VKID");

    @k
    private final AtomicReference<Locale> internalVKIDLocale = new AtomicReference<>(null);

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\rJC\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/vk/id/VKID$Companion;", "", "<init>", "()V", "Lcom/vk/id/VKID;", "vkid", "Lkotlin/G0;", "init", "(Lcom/vk/id/VKID;)V", "Landroid/content/Context;", "context", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "(Landroid/content/Context;Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "", "isFlutter", "", "captchaRedirectUri", "forceError14", "forceHitmanChallenge", "(Landroid/content/Context;ZLjava/lang/String;ZZLcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "getInstance", "()Lcom/vk/id/VKID;", "instance", "_instance", "Lcom/vk/id/VKID;", "Lcom/vk/id/analytics/LogcatTracker;", "analyticsDebugTracker", "Lcom/vk/id/analytics/LogcatTracker;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private final void init(VKID vkid) {
            synchronized (this) {
                if (VKID._instance != null) {
                    throw new IllegalStateException("You've already initialized VKID");
                }
                VKID._instance = vkid;
                G0 g02 = G0.f406611a;
            }
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, GroupSubscriptionLimit groupSubscriptionLimit, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                groupSubscriptionLimit = new GroupSubscriptionLimit(0, 0, 3, null);
            }
            companion.init(context, groupSubscriptionLimit);
        }

        @k
        public final VKID getInstance() {
            VKID vkid = VKID._instance;
            if (vkid == null) {
                synchronized (this) {
                    vkid = VKID._instance;
                }
                if (vkid == null) {
                    throw new IllegalStateException("VKID is not initialized");
                }
            }
            return vkid;
        }

        private Companion() {
        }

        @j
        public final void init(@k Context context, @l GroupSubscriptionLimit groupSubscriptionLimit) {
            init(context, false, null, false, false, groupSubscriptionLimit);
        }

        @InternalVKIDApi
        public final void init(@k Context context, boolean isFlutter, @l String captchaRedirectUri, boolean forceError14, boolean forceHitmanChallenge, @l GroupSubscriptionLimit groupSubscriptionLimit) {
            init(new VKID(new VKIDDepsProd(context, isFlutter, captchaRedirectUri, forceError14, forceHitmanChallenge, groupSubscriptionLimit)));
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$authorize$2", f = "VKID.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$authorize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDAuthCallback $callback;
        final /* synthetic */ VKIDAuthParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VKIDAuthCallback vKIDAuthCallback, VKIDAuthParams vKIDAuthParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = vKIDAuthCallback;
            this.$params = vKIDAuthParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKID.this.new AnonymousClass2(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKID vkid = VKID.this;
                VKIDAuthCallback vKIDAuthCallback = this.$callback;
                VKIDAuthParams vKIDAuthParams = this.$params;
                this.label = 1;
                if (vkid.authorize(vKIDAuthCallback, vKIDAuthParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$authorize$5", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$authorize$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((AnonymousClass5) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$authorize$6", f = "VKID.kt", i = {0}, l = {451, 482}, m = "invokeSuspend", n = {"actualParams"}, s = {"L$0"})
    /* renamed from: com.vk.id.VKID$authorize$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDAuthCallback $callback;
        final /* synthetic */ VKIDAuthParams $params;
        Object L$0;
        int label;
        final /* synthetic */ VKID this$0;

        /* compiled from: VKID.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.VKID$authorize$6$2", f = "VKID.kt", i = {}, l = {483}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.VKID$authorize$6$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            final /* synthetic */ VKIDAuthParams $actualParams;
            final /* synthetic */ StatParams $statParams;
            int label;
            final /* synthetic */ VKID this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VKID vkid, VKIDAuthParams vKIDAuthParams, StatParams statParams, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = vkid;
                this.$actualParams = vKIDAuthParams;
                this.$statParams = statParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$actualParams, this.$statParams, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    AuthProvidersChooser authProvidersChooser = (AuthProvidersChooser) this.this$0.authProvidersChooser.getValue();
                    VKIDAuthParams vKIDAuthParams = this.$actualParams;
                    this.label = 1;
                    obj = authProvidersChooser.chooseBest(vKIDAuthParams, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                ((VKIDAuthProvider) obj).auth(this.this$0.authOptionsCreator.create$vkid_release(this.$actualParams, this.$statParams));
                return G0.f406611a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(VKIDAuthParams vKIDAuthParams, VKID vkid, VKIDAuthCallback vKIDAuthCallback, Continuation<? super AnonymousClass6> continuation) {
            super(1, continuation);
            this.$params = vKIDAuthParams;
            this.this$0 = vkid;
            this.$callback = vKIDAuthCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final G0 invokeSuspend$lambda$0(VKIDAuthParams vKIDAuthParams, VKID vkid, VKIDAuthParams.Builder builder) {
            VKIDAuthParams.Locale locale$vkid_release = vKIDAuthParams.getLocale();
            if (locale$vkid_release == null) {
                locale$vkid_release = VKIDAuthParams.Locale.INSTANCE.fromLocale(vkid.getInternalVKIDLocale().get());
            }
            builder.setLocale(locale$vkid_release);
            return G0.f406611a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return new AnonymousClass6(this.$params, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VKIDAuthParams vKIDAuthParamsNewBuilder;
            StatParams statParams;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKIDAuthParams vKIDAuthParams = this.$params;
                vKIDAuthParamsNewBuilder = vKIDAuthParams.newBuilder(new a(0, vKIDAuthParams, this.this$0));
                kotlinx.coroutines.sync.a aVar = this.this$0.requestMutex;
                this.L$0 = vKIDAuthParamsNewBuilder;
                this.label = 1;
                if (aVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                vKIDAuthParamsNewBuilder = (VKIDAuthParams) this.L$0;
                C42729a0.b(obj);
            }
            final String str3 = "Authorize";
            this.this$0.getPerformanceTracker().startTracking("Authorize");
            this.this$0.authCallbacksHolder.add(this.$callback);
            final CoroutineContext coroutineContext = getF411447c();
            if (vKIDAuthParamsNewBuilder.getInternalUse()) {
                Map<String, String> extraParams$vkid_release = vKIDAuthParamsNewBuilder.getExtraParams$vkid_release();
                String str4 = "";
                if (extraParams$vkid_release == null || (str = extraParams$vkid_release.get("flow_source")) == null) {
                    str = "";
                }
                Map<String, String> extraParams$vkid_release2 = vKIDAuthParamsNewBuilder.getExtraParams$vkid_release();
                if (extraParams$vkid_release2 != null && (str2 = extraParams$vkid_release2.get("session_id")) != null) {
                    str4 = str2;
                }
                statParams = new StatParams(str, str4);
            } else {
                statParams = CustomAuthAnalytics.INSTANCE.customAuthStart$vkid_release(vKIDAuthParamsNewBuilder);
            }
            AuthEventBridge authEventBridge = AuthEventBridge.INSTANCE;
            final VKID vkid = this.this$0;
            final VKIDAuthParams vKIDAuthParams2 = vKIDAuthParamsNewBuilder;
            final StatParams statParams2 = statParams;
            authEventBridge.setListener$vkid_release(new AuthEventBridge.Listener() { // from class: com.vk.id.VKID.authorize.6.1
                @Override // com.vk.id.internal.auth.AuthEventBridge.Listener
                public void onAuthResult(AuthResult authResult) {
                    C43259k.d(U.a(coroutineContext.plus(Q0.a())), null, null, new VKID$authorize$6$1$onAuthResult$1(vkid, authResult, str3, vKIDAuthParams2, statParams2, null), 3);
                }
            });
            M io2 = this.this$0.dispatchers.getIo();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, vKIDAuthParamsNewBuilder, statParams, null);
            this.L$0 = null;
            this.label = 2;
            if (C43259k.g(io2, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((AnonymousClass6) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$exchangeTokenToV2$2", f = "VKID.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$exchangeTokenToV2$2, reason: invalid class name and case insensitive filesystem */
    final class C378812 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDExchangeTokenCallback $callback;
        final /* synthetic */ VKIDExchangeTokenParams $params;
        final /* synthetic */ String $v1Token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378812(String str, VKIDExchangeTokenCallback vKIDExchangeTokenCallback, VKIDExchangeTokenParams vKIDExchangeTokenParams, Continuation<? super C378812> continuation) {
            super(2, continuation);
            this.$v1Token = str;
            this.$callback = vKIDExchangeTokenCallback;
            this.$params = vKIDExchangeTokenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKID.this.new C378812(this.$v1Token, this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKID vkid = VKID.this;
                String str = this.$v1Token;
                VKIDExchangeTokenCallback vKIDExchangeTokenCallback = this.$callback;
                VKIDExchangeTokenParams vKIDExchangeTokenParams = this.$params;
                this.label = 1;
                if (vkid.exchangeTokenToV2(str, vKIDExchangeTokenCallback, vKIDExchangeTokenParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C378812) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$exchangeTokenToV2$5", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$exchangeTokenToV2$5, reason: invalid class name and case insensitive filesystem */
    public static final class C378825 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public C378825(Continuation<? super C378825> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new C378825(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((C378825) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$exchangeTokenToV2$6", f = "VKID.kt", i = {0, 1}, l = {695, 563}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.vk.id.VKID$exchangeTokenToV2$6, reason: invalid class name and case insensitive filesystem */
    public static final class C378836 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDExchangeTokenCallback $callback;
        final /* synthetic */ VKIDExchangeTokenParams $params;
        final /* synthetic */ String $v1Token;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378836(String str, VKIDExchangeTokenParams vKIDExchangeTokenParams, VKIDExchangeTokenCallback vKIDExchangeTokenCallback, Continuation<? super C378836> continuation) {
            super(1, continuation);
            this.$v1Token = str;
            this.$params = vKIDExchangeTokenParams;
            this.$callback = vKIDExchangeTokenCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return VKID.this.new C378836(this.$v1Token, this.$params, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            VKID vkid;
            String str;
            VKIDExchangeTokenParams vKIDExchangeTokenParams;
            VKIDExchangeTokenCallback vKIDExchangeTokenCallback;
            String str2;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    aVar = VKID.this.requestMutex;
                    vkid = VKID.this;
                    str = this.$v1Token;
                    VKIDExchangeTokenParams vKIDExchangeTokenParams2 = this.$params;
                    VKIDExchangeTokenCallback vKIDExchangeTokenCallback2 = this.$callback;
                    this.L$0 = aVar;
                    this.L$1 = vkid;
                    this.L$2 = str;
                    this.L$3 = vKIDExchangeTokenParams2;
                    this.L$4 = vKIDExchangeTokenCallback2;
                    this.label = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vKIDExchangeTokenParams = vKIDExchangeTokenParams2;
                    vKIDExchangeTokenCallback = vKIDExchangeTokenCallback2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                        try {
                            C42729a0.b(obj);
                            G0 g02 = G0.f406611a;
                            aVar2.d(null);
                            return G0.f406611a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.d(null);
                            throw th2;
                        }
                    }
                    VKIDExchangeTokenCallback vKIDExchangeTokenCallback3 = (VKIDExchangeTokenCallback) this.L$4;
                    VKIDExchangeTokenParams vKIDExchangeTokenParams3 = (VKIDExchangeTokenParams) this.L$3;
                    str = (String) this.L$2;
                    vkid = (VKID) this.L$1;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                    C42729a0.b(obj);
                    vKIDExchangeTokenCallback = vKIDExchangeTokenCallback3;
                    vKIDExchangeTokenParams = vKIDExchangeTokenParams3;
                    aVar = aVar3;
                }
                PerformanceTracker performanceTracker = vkid.getPerformanceTracker();
                VKID$exchangeTokenToV2$6$1$1 vKID$exchangeTokenToV2$6$1$1 = new VKID$exchangeTokenToV2$6$1$1(vkid, str2, vKIDExchangeTokenParams, vKIDExchangeTokenCallback, null);
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                if (performanceTracker.runTrackingSuspend("ExchangeTokenToV2", vKID$exchangeTokenToV2$6$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                G0 g022 = G0.f406611a;
                aVar2.d(null);
                return G0.f406611a;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.d(null);
                throw th2;
            }
            str2 = str;
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((C378836) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$getUserData$2", f = "VKID.kt", i = {}, l = {584}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$getUserData$2, reason: invalid class name and case insensitive filesystem */
    final class C378842 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDGetUserCallback $callback;
        final /* synthetic */ VKIDGetUserParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378842(VKIDGetUserCallback vKIDGetUserCallback, VKIDGetUserParams vKIDGetUserParams, Continuation<? super C378842> continuation) {
            super(2, continuation);
            this.$callback = vKIDGetUserCallback;
            this.$params = vKIDGetUserParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKID.this.new C378842(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKID vkid = VKID.this;
                VKIDGetUserCallback vKIDGetUserCallback = this.$callback;
                VKIDGetUserParams vKIDGetUserParams = this.$params;
                this.label = 1;
                if (vkid.getUserData(vKIDGetUserCallback, vKIDGetUserParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C378842) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$getUserData$5", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$getUserData$5, reason: invalid class name and case insensitive filesystem */
    public static final class C378855 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public C378855(Continuation<? super C378855> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new C378855(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((C378855) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$getUserData$6", f = "VKID.kt", i = {0, 1}, l = {695, 601}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.vk.id.VKID$getUserData$6, reason: invalid class name and case insensitive filesystem */
    public static final class C378866 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDGetUserCallback $callback;
        final /* synthetic */ VKIDGetUserParams $params;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378866(VKIDGetUserCallback vKIDGetUserCallback, VKIDGetUserParams vKIDGetUserParams, Continuation<? super C378866> continuation) {
            super(1, continuation);
            this.$callback = vKIDGetUserCallback;
            this.$params = vKIDGetUserParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return VKID.this.new C378866(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            VKID vkid;
            VKIDGetUserCallback vKIDGetUserCallback;
            VKIDGetUserParams vKIDGetUserParams;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    aVar = VKID.this.requestMutex;
                    vkid = VKID.this;
                    VKIDGetUserCallback vKIDGetUserCallback2 = this.$callback;
                    VKIDGetUserParams vKIDGetUserParams2 = this.$params;
                    this.L$0 = aVar;
                    this.L$1 = vkid;
                    this.L$2 = vKIDGetUserCallback2;
                    this.L$3 = vKIDGetUserParams2;
                    this.label = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vKIDGetUserCallback = vKIDGetUserCallback2;
                    vKIDGetUserParams = vKIDGetUserParams2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                        try {
                            C42729a0.b(obj);
                            G0 g02 = G0.f406611a;
                            aVar2.d(null);
                            return G0.f406611a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.d(null);
                            throw th2;
                        }
                    }
                    vKIDGetUserParams = (VKIDGetUserParams) this.L$3;
                    vKIDGetUserCallback = (VKIDGetUserCallback) this.L$2;
                    vkid = (VKID) this.L$1;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                    C42729a0.b(obj);
                    aVar = aVar3;
                }
                PerformanceTracker performanceTracker = vkid.getPerformanceTracker();
                VKID$getUserData$6$1$1 vKID$getUserData$6$1$1 = new VKID$getUserData$6$1$1(vkid, vKIDGetUserCallback, vKIDGetUserParams, null);
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (performanceTracker.runTrackingSuspend("GetUserData", vKID$getUserData$6$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                G0 g022 = G0.f406611a;
                aVar2.d(null);
                return G0.f406611a;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.d(null);
                throw th2;
            }
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((C378866) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$logout$2", f = "VKID.kt", i = {}, l = {622}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$logout$2, reason: invalid class name and case insensitive filesystem */
    final class C378872 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDLogoutCallback $callback;
        final /* synthetic */ VKIDLogoutParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378872(VKIDLogoutCallback vKIDLogoutCallback, VKIDLogoutParams vKIDLogoutParams, Continuation<? super C378872> continuation) {
            super(2, continuation);
            this.$callback = vKIDLogoutCallback;
            this.$params = vKIDLogoutParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKID.this.new C378872(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKID vkid = VKID.this;
                VKIDLogoutCallback vKIDLogoutCallback = this.$callback;
                VKIDLogoutParams vKIDLogoutParams = this.$params;
                this.label = 1;
                if (vkid.logout(vKIDLogoutCallback, vKIDLogoutParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C378872) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$logout$5", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$logout$5, reason: invalid class name and case insensitive filesystem */
    public static final class C378885 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public C378885(Continuation<? super C378885> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new C378885(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((C378885) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$logout$6", f = "VKID.kt", i = {0, 1}, l = {695, 639}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.vk.id.VKID$logout$6, reason: invalid class name and case insensitive filesystem */
    public static final class C378896 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDLogoutCallback $callback;
        final /* synthetic */ VKIDLogoutParams $params;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378896(VKIDLogoutCallback vKIDLogoutCallback, VKIDLogoutParams vKIDLogoutParams, Continuation<? super C378896> continuation) {
            super(1, continuation);
            this.$callback = vKIDLogoutCallback;
            this.$params = vKIDLogoutParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return VKID.this.new C378896(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            VKID vkid;
            VKIDLogoutCallback vKIDLogoutCallback;
            VKIDLogoutParams vKIDLogoutParams;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    aVar = VKID.this.requestMutex;
                    vkid = VKID.this;
                    VKIDLogoutCallback vKIDLogoutCallback2 = this.$callback;
                    VKIDLogoutParams vKIDLogoutParams2 = this.$params;
                    this.L$0 = aVar;
                    this.L$1 = vkid;
                    this.L$2 = vKIDLogoutCallback2;
                    this.L$3 = vKIDLogoutParams2;
                    this.label = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vKIDLogoutCallback = vKIDLogoutCallback2;
                    vKIDLogoutParams = vKIDLogoutParams2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                        try {
                            C42729a0.b(obj);
                            G0 g02 = G0.f406611a;
                            aVar2.d(null);
                            return G0.f406611a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.d(null);
                            throw th2;
                        }
                    }
                    vKIDLogoutParams = (VKIDLogoutParams) this.L$3;
                    vKIDLogoutCallback = (VKIDLogoutCallback) this.L$2;
                    vkid = (VKID) this.L$1;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                    C42729a0.b(obj);
                    aVar = aVar3;
                }
                PerformanceTracker performanceTracker = vkid.getPerformanceTracker();
                VKID$logout$6$1$1 vKID$logout$6$1$1 = new VKID$logout$6$1$1(vkid, vKIDLogoutCallback, vKIDLogoutParams, null);
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (performanceTracker.runTrackingSuspend("Logout", vKID$logout$6$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                G0 g022 = G0.f406611a;
                aVar2.d(null);
                return G0.f406611a;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.d(null);
                throw th2;
            }
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((C378896) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$refreshToken$2", f = "VKID.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$refreshToken$2, reason: invalid class name and case insensitive filesystem */
    final class C378902 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDRefreshTokenCallback $callback;
        final /* synthetic */ VKIDRefreshTokenParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378902(VKIDRefreshTokenCallback vKIDRefreshTokenCallback, VKIDRefreshTokenParams vKIDRefreshTokenParams, Continuation<? super C378902> continuation) {
            super(2, continuation);
            this.$callback = vKIDRefreshTokenCallback;
            this.$params = vKIDRefreshTokenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return VKID.this.new C378902(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                VKID vkid = VKID.this;
                VKIDRefreshTokenCallback vKIDRefreshTokenCallback = this.$callback;
                VKIDRefreshTokenParams vKIDRefreshTokenParams = this.$params;
                this.label = 1;
                if (vkid.refreshToken(vKIDRefreshTokenCallback, vKIDRefreshTokenParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C378902) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$refreshToken$5", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.VKID$refreshToken$5, reason: invalid class name and case insensitive filesystem */
    public static final class C378915 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public C378915(Continuation<? super C378915> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new C378915(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((C378915) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: VKID.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.VKID$refreshToken$6", f = "VKID.kt", i = {0, 1}, l = {695, 521}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.vk.id.VKID$refreshToken$6, reason: invalid class name and case insensitive filesystem */
    public static final class C378926 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ VKIDRefreshTokenCallback $callback;
        final /* synthetic */ VKIDRefreshTokenParams $params;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378926(VKIDRefreshTokenCallback vKIDRefreshTokenCallback, VKIDRefreshTokenParams vKIDRefreshTokenParams, Continuation<? super C378926> continuation) {
            super(1, continuation);
            this.$callback = vKIDRefreshTokenCallback;
            this.$params = vKIDRefreshTokenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return VKID.this.new C378926(this.$callback, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            VKID vkid;
            VKIDRefreshTokenCallback vKIDRefreshTokenCallback;
            VKIDRefreshTokenParams vKIDRefreshTokenParams;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    aVar = VKID.this.requestMutex;
                    vkid = VKID.this;
                    VKIDRefreshTokenCallback vKIDRefreshTokenCallback2 = this.$callback;
                    VKIDRefreshTokenParams vKIDRefreshTokenParams2 = this.$params;
                    this.L$0 = aVar;
                    this.L$1 = vkid;
                    this.L$2 = vKIDRefreshTokenCallback2;
                    this.L$3 = vKIDRefreshTokenParams2;
                    this.label = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vKIDRefreshTokenCallback = vKIDRefreshTokenCallback2;
                    vKIDRefreshTokenParams = vKIDRefreshTokenParams2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                        try {
                            C42729a0.b(obj);
                            G0 g02 = G0.f406611a;
                            aVar2.d(null);
                            return G0.f406611a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.d(null);
                            throw th2;
                        }
                    }
                    vKIDRefreshTokenParams = (VKIDRefreshTokenParams) this.L$3;
                    vKIDRefreshTokenCallback = (VKIDRefreshTokenCallback) this.L$2;
                    vkid = (VKID) this.L$1;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                    C42729a0.b(obj);
                    aVar = aVar3;
                }
                PerformanceTracker performanceTracker = vkid.getPerformanceTracker();
                VKID$refreshToken$6$1$1 vKID$refreshToken$6$1$1 = new VKID$refreshToken$6$1$1(vkid, vKIDRefreshTokenCallback, vKIDRefreshTokenParams, null);
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (performanceTracker.runTrackingSuspend("RefreshToken", vKID$refreshToken$6$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                G0 g022 = G0.f406611a;
                aVar2.d(null);
                return G0.f406611a;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.d(null);
                throw th2;
            }
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((C378926) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    @k0
    @InternalVKIDApi
    public VKID(@k VKIDDeps vKIDDeps) {
        this.authProvidersChooser = vKIDDeps.getAuthProvidersChooser();
        this.authOptionsCreator = vKIDDeps.getAuthOptionsCreator();
        this.authCallbacksHolder = vKIDDeps.getAuthCallbacksHolder();
        this.authResultHandler = vKIDDeps.getAuthResultHandler();
        this.dispatchers = vKIDDeps.getDispatchers();
        this.vkSilentAuthInfoProvider = vKIDDeps.getVkSilentAuthInfoProvider();
        this.userDataFetcher = vKIDDeps.getUserDataFetcher();
        this.tokenRefresher = vKIDDeps.getTokenRefresher();
        this.tokenExchanger = vKIDDeps.getTokenExchanger();
        this.userRefresher = vKIDDeps.getUserRefresher();
        this.loggerOut = vKIDDeps.getLoggerOut();
        this.tokenStorage = vKIDDeps.getTokenStorage();
        CrashReporter crashReporter = vKIDDeps.getCrashReporter();
        this.crashReporter = crashReporter;
        this.performanceTracker = vKIDDeps.getPerformanceTracker();
        this.groupSubscriptionApiServiceInternal = vKIDDeps.getGroupSubscriptionApiService();
        this.clientIdProvider = new F(vKIDDeps, 3);
        this.context = vKIDDeps.getContext();
        this.groupSubscriptionLimit = vKIDDeps.getGroupSubscriptionLimit();
        this.prefsStorage = vKIDDeps.getEncryptedSharedPreferencesStorage().getValue();
        crashReporter.runReportingCrashes(new P11.a(5), new b(1, vKIDDeps, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessToken _get_accessToken_$lambda$14(Throwable th2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessToken _get_accessToken_$lambda$15(VKID vkid) {
        return vkid.tokenStorage.getAccessToken$vkid_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(VKIDDeps vKIDDeps) {
        return vKIDDeps.getServiceCredentials().getValue().getClientID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 _init_$lambda$1(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 _init_$lambda$3(VKIDDeps vKIDDeps, VKID vkid) {
        String str;
        VKIDAnalytics.Companion companion = VKIDAnalytics.INSTANCE;
        companion.addTracker(vKIDDeps.getStatTracker());
        companion.addTracker(vKIDDeps.getTrackingTracker());
        vkid.logger.info(C43066x.F0("\n                    |VKID initialized\n                    |Version name: 2.5.1\n                    |CI build: " + BuildConfig.CI_BUILD_NUMBER + " \n                "));
        GroupSubscriptionLimit groupSubscriptionLimit = vKIDDeps.getGroupSubscriptionLimit();
        if (groupSubscriptionLimit != null) {
            str = groupSubscriptionLimit.getMaxSubscriptionsToShow() + ";" + groupSubscriptionLimit.getPeriodInDays();
        } else {
            str = null;
        }
        companion.trackEvent("vkid_sdk_init", new VKIDAnalytics.EventParam("wrapper_sdk_type", vKIDDeps.getIsFlutter() ? PluginErrorDetails.Platform.FLUTTER : "none", null, 4, null), new VKIDAnalytics.EventParam("limit_settings", str, null, 4, null));
        VKCaptcha.INSTANCE.init(vKIDDeps.getAppContext());
        return G0.f406611a;
    }

    public static /* synthetic */ Object logout$default(VKID vkid, VKIDLogoutCallback vKIDLogoutCallback, VKIDLogoutParams vKIDLogoutParams, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            vKIDLogoutParams = new VKIDLogoutParams.Builder().build();
        }
        return vkid.logout(vKIDLogoutCallback, vKIDLogoutParams, continuation);
    }

    public final void authorize(@k InterfaceC22983P lifecycleOwner, @k VKIDAuthCallback callback, @k VKIDAuthParams params) {
        C43259k.d(C22984Q.a(lifecycleOwner), null, null, new AnonymousClass2(callback, params, null), 3);
    }

    @l
    public final Object exchangeTokenToV2(@k String str, @k VKIDExchangeTokenCallback vKIDExchangeTokenCallback, @k VKIDExchangeTokenParams vKIDExchangeTokenParams, @k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new C378825(null), new C378836(str, vKIDExchangeTokenParams, vKIDExchangeTokenCallback, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /* renamed from: fetchUserData-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112fetchUserDataIoAF18A(@Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<com.vk.id.VKIDUser>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.vk.id.VKID$fetchUserData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.vk.id.VKID$fetchUserData$1 r0 = (com.vk.id.VKID$fetchUserData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vk.id.VKID$fetchUserData$1 r0 = new com.vk.id.VKID$fetchUserData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            com.vk.id.tracking.core.CrashReporter r7 = r6.crashReporter
            com.vk.id.VKID$fetchUserData$2 r2 = new com.vk.id.VKID$fetchUserData$2
            r4 = 0
            r2.<init>(r4)
            com.vk.id.VKID$fetchUserData$3 r5 = new com.vk.id.VKID$fetchUserData$3
            r5.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = r7.runReportingCrashesSuspend(r2, r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            kotlin.Z r7 = (kotlin.Z) r7
            java.lang.Object r7 = r7.f406625b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.VKID.m112fetchUserDataIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @l
    public final AccessToken getAccessToken() {
        return (AccessToken) this.crashReporter.runReportingCrashes(new P11.a(4), new F(this, 2));
    }

    @k
    public final String getClientId() {
        return this.clientIdProvider.invoke();
    }

    @k
    public final Context getContext() {
        return this.context;
    }

    @k
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @k
    public final InternalVKIDGroupSubscriptionApiContract getGroupSubscriptionApiService() {
        return this.groupSubscriptionApiServiceInternal.getValue();
    }

    @l
    public final GroupSubscriptionLimit getGroupSubscriptionLimit() {
        return this.groupSubscriptionLimit;
    }

    @k
    public final AtomicReference<Locale> getInternalVKIDLocale() {
        return this.internalVKIDLocale;
    }

    @k
    /* renamed from: getPerformanceTracker$vkid_release, reason: from getter */
    public final PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @k
    public final InternalVKIDPreferencesStorage getPrefsStorage() {
        return this.prefsStorage;
    }

    @k
    public final InternalVKIDTokenStorage getTokenStorage() {
        return this.tokenStorage;
    }

    @l
    public final Object getUserData(@k VKIDGetUserCallback vKIDGetUserCallback, @k VKIDGetUserParams vKIDGetUserParams, @k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new C378855(null), new C378866(vKIDGetUserCallback, vKIDGetUserParams, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }

    @l
    public final Object logout(@k VKIDLogoutCallback vKIDLogoutCallback, @k VKIDLogoutParams vKIDLogoutParams, @k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new C378885(null), new C378896(vKIDLogoutCallback, vKIDLogoutParams, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }

    @l
    public final Object refreshToken(@k VKIDRefreshTokenCallback vKIDRefreshTokenCallback, @k VKIDRefreshTokenParams vKIDRefreshTokenParams, @k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new C378915(null), new C378926(vKIDRefreshTokenCallback, vKIDRefreshTokenParams, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }

    @l
    public final Object authorize(@k VKIDAuthCallback vKIDAuthCallback, @k VKIDAuthParams vKIDAuthParams, @k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new AnonymousClass5(null), new AnonymousClass6(vKIDAuthParams, this, vKIDAuthCallback, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }
}
