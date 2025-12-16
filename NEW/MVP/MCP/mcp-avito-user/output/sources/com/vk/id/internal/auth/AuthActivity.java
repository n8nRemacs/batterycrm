package com.vk.id.internal.auth;

import Y61.l;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.browser.customtabs.f;
import androidx.browser.customtabs.h;
import androidx.browser.customtabs.k;
import androidx.browser.customtabs.n;
import androidx.compose.runtime.internal.P;
import androidx.core.app.C22746d;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.vk.id.VKID;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.web.ContextUtils;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: AuthActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u00011\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ*\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\rR\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/vk/id/internal/auth/AuthActivity;", "Landroid/app/Activity;", "<init>", "()V", "Lkotlin/G0;", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onPause", "outState", "onSaveInstanceState", "finish", "processIntent", "data", "onOauthResult", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/vk/id/internal/auth/AuthResult;", "parseOAuthResult", "(Landroid/net/Uri;)Lcom/vk/id/internal/auth/AuthResult;", "handlePayload", "", "isIntentWithAuthRequest", "(Landroid/content/Intent;)Z", "isIntentWithAuthResult", "handleStartAuth", "launchAuth", "authWasStarted", "Z", "isWaitingForAuthResult", "authIntent", "Landroid/content/Intent;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "shouldReportCustomTabsPerformance", "Landroidx/browser/customtabs/k;", "customTabsServiceConnection", "Landroidx/browser/customtabs/k;", "Landroidx/browser/customtabs/n;", "customTabsSession", "Landroidx/browser/customtabs/n;", "com/vk/id/internal/auth/AuthActivity$callback$1", "callback", "Lcom/vk/id/internal/auth/AuthActivity$callback$1;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthActivity extends Activity {

    @l
    private Intent authIntent;
    private boolean authWasStarted;

    @l
    private k customTabsServiceConnection;

    @l
    private n customTabsSession;
    private boolean isWaitingForAuthResult;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Y61.k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("AuthActivity");
    private boolean shouldReportCustomTabsPerformance = true;

    @Y61.k
    private final AuthActivity$callback$1 callback = new AuthActivity$callback$1(this);

    /* compiled from: AuthActivity.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "authIntent", "Lkotlin/G0;", "startForAuth$vkid_release", "(Landroid/content/Context;Landroid/content/Intent;)V", "startForAuth", "Landroid/net/Uri;", "responseUri", "createRedirectUriHandlingIntent$vkid_release", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "createRedirectUriHandlingIntent", "", "PERFORMANCE_KEY_CUSTOM_TABS", "Ljava/lang/String;", "KEY_AUTH_INTENT", "KEY_START_AUTH", "KEY_WAITING_FOR_AUTH_RESULT", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final Intent createRedirectUriHandlingIntent$vkid_release(@Y61.k Context context, @Y61.k Uri responseUri) {
            Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
            intent.setData(responseUri);
            intent.addFlags(0);
            return intent;
        }

        public final void startForAuth$vkid_release(@Y61.k Context context, @Y61.k Intent authIntent) {
            Intent intentPutExtra = new Intent(context, (Class<?>) AuthActivity.class).putExtra("KEY_AUTH_INTENT", authIntent).putExtra("KEY_START_AUTH", true);
            ContextUtils.INSTANCE.addNewTaskFlag(intentPutExtra, context);
            intentPutExtra.addFlags(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
            context.startActivity(intentPutExtra);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 finish$lambda$12(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 finish$lambda$13(AuthActivity authActivity) {
        authActivity.setResult(-1);
        authActivity.overridePendingTransition(0, 0);
        return G0.f406611a;
    }

    private final AuthResult handlePayload(Uri uri) {
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter(VoiceInfo.STATE);
        String queryParameter3 = uri.getQueryParameter("device_id");
        AuthResult.OAuth oAuth = null;
        if (queryParameter3 == null) {
            return new AuthResult.AuthActiviyResultFailed("No device id", null);
        }
        if (queryParameter != null && queryParameter2 != null) {
            oAuth = new AuthResult.OAuth(queryParameter, queryParameter2);
        }
        return new AuthResult.Success(oAuth, queryParameter3);
    }

    private final boolean handleStartAuth(Intent intent) {
        this.authIntent = Build.VERSION.SDK_INT >= 33 ? (Intent) intent.getParcelableExtra("KEY_AUTH_INTENT", Intent.class) : (Intent) intent.getParcelableExtra("KEY_AUTH_INTENT");
        try {
            String strA = f.a(this);
            if (strA == null || !L.f(this.authIntent.getPackage(), strA)) {
                launchAuth(this.authIntent);
            } else {
                VKID.INSTANCE.getInstance().getPerformanceTracker().startTracking("CustomTabsAuth");
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                this.customTabsServiceConnection = anonymousClass1;
                anonymousClass1.setApplicationContext(getApplicationContext());
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent2.setPackage(strA);
                }
                bindService(intent2, anonymousClass1, 33);
            }
            return true;
        } catch (ActivityNotFoundException e12) {
            this.logger.error("Can't start auth", e12);
            return false;
        }
    }

    private final boolean isIntentWithAuthRequest(Intent intent) {
        return intent != null && intent.getBooleanExtra("KEY_START_AUTH", false);
    }

    private final boolean isIntentWithAuthResult(Intent intent) {
        Uri data;
        return ((intent == null || (data = intent.getData()) == null) ? null : data.getScheme()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAuth(Intent intent) {
        startActivity(intent, C22746d.a(this).c());
    }

    public static /* synthetic */ G0 m(Bundle bundle, AuthActivity authActivity) {
        return onCreate$lambda$3(authActivity, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onCreate$lambda$2(Throwable th2) {
        return G0.f406611a;
    }

    private static final G0 onCreate$lambda$3(AuthActivity authActivity, Bundle bundle) {
        authActivity.shouldReportCustomTabsPerformance = true;
        Intent intent = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("KEY_AUTH_INTENT", Intent.class);
            }
        } else if (bundle != null) {
            intent = (Intent) bundle.getParcelable("KEY_AUTH_INTENT");
        }
        authActivity.authIntent = intent;
        authActivity.isWaitingForAuthResult = bundle != null ? bundle.getBoolean("KEY_WAITING_FOR_AUTH_RESULT", false) : false;
        authActivity.processIntent(authActivity.getIntent());
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onNewIntent$lambda$4(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onNewIntent$lambda$5(AuthActivity authActivity, Intent intent) {
        authActivity.processIntent(intent);
        return G0.f406611a;
    }

    private final void onOauthResult(Intent data) {
        if (data == null) {
            return;
        }
        AuthEventBridge.INSTANCE.onAuthResult$vkid_release(parseOAuthResult(data.getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onPause$lambda$8(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onPause$lambda$9(AuthActivity authActivity) {
        authActivity.authWasStarted = false;
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onResume$lambda$6(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onResume$lambda$7(AuthActivity authActivity) {
        if (authActivity.isWaitingForAuthResult && !authActivity.authWasStarted) {
            AuthEventBridge.INSTANCE.onAuthResult$vkid_release(new AuthResult.Canceled("User returns to auth activity without auth"));
            authActivity.finish();
        }
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onSaveInstanceState$lambda$10(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onSaveInstanceState$lambda$11(Bundle bundle, AuthActivity authActivity) {
        bundle.putBoolean("KEY_WAITING_FOR_AUTH_RESULT", authActivity.isWaitingForAuthResult);
        bundle.putParcelable("KEY_AUTH_INTENT", authActivity.authIntent);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onStop$lambda$0(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onStop$lambda$1(AuthActivity authActivity) {
        k kVar = authActivity.customTabsServiceConnection;
        if (kVar == null) {
            return G0.f406611a;
        }
        authActivity.unbindService(kVar);
        authActivity.customTabsServiceConnection = null;
        return G0.f406611a;
    }

    private final AuthResult parseOAuthResult(Uri uri) {
        if (uri == null) {
            return new AuthResult.AuthActiviyResultFailed("AuthActivity opened with null uri", null);
        }
        try {
            return handlePayload(uri);
        } catch (UnsupportedOperationException e12) {
            return new AuthResult.AuthActiviyResultFailed(r.n(uri, "AuthActivity opened with invalid url: "), e12);
        }
    }

    private final void processIntent(Intent intent) {
        if (this.isWaitingForAuthResult || !isIntentWithAuthRequest(intent)) {
            if (isIntentWithAuthResult(intent)) {
                onOauthResult(intent);
                finish();
                this.isWaitingForAuthResult = false;
                return;
            }
            return;
        }
        if (!handleStartAuth(intent)) {
            finish();
        } else {
            this.isWaitingForAuthResult = true;
            this.authWasStarted = true;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(14), new a(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(@l Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(17), new c(this, savedInstanceState));
    }

    @Override // android.app.Activity
    public void onNewIntent(@l Intent intent) {
        super.onNewIntent(intent);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(15), new b(0, this, intent));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(20), new a(this, 3));
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(16), new a(this, 1));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@Y61.k Bundle outState) {
        super.onSaveInstanceState(outState);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(18), new c(outState, this));
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(19), new a(this, 2));
    }

    /* compiled from: AuthActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/vk/id/internal/auth/AuthActivity$handleStartAuth$1", "Landroidx/browser/customtabs/k;", "Landroid/content/ComponentName;", "name", "Landroidx/browser/customtabs/f;", "client", "Lkotlin/G0;", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Landroidx/browser/customtabs/f;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.vk.id.internal.auth.AuthActivity$handleStartAuth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final G0 onCustomTabsServiceConnected$lambda$0(Throwable th2) {
            return G0.f406611a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final G0 onCustomTabsServiceConnected$lambda$2(AuthActivity authActivity, f fVar) {
            authActivity.customTabsSession = fVar.b(authActivity.callback);
            try {
                fVar.f22862a.B2(0L);
            } catch (RemoteException unused) {
            }
            h.i iVar = new h.i(authActivity.customTabsSession);
            iVar.b(true);
            iVar.f22870e = 1;
            Intent intent = iVar.f22866a;
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            h hVarA = iVar.a();
            Uri data = authActivity.authIntent.getData();
            Intent intent2 = hVarA.f22864a;
            intent2.setData(data);
            authActivity.launchAuth(intent2);
            return G0.f406611a;
        }

        @Override // androidx.browser.customtabs.k
        public void onCustomTabsServiceConnected(ComponentName name, f client) {
            VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(21), new b(1, AuthActivity.this, client));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
        }
    }
}
