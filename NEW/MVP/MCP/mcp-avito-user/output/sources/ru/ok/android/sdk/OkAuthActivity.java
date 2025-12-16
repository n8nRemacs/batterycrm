package ru.ok.android.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.avito.android.R;
import java.io.Serializable;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.ok.android.sdk.util.OkAuthType;

/* compiled from: OkAuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/android/sdk/OkAuthActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class OkAuthActivity extends Activity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f436655i = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f436656b;

    /* renamed from: c, reason: collision with root package name */
    public String f436657c;

    /* renamed from: d, reason: collision with root package name */
    public String f436658d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f436659e;

    /* renamed from: f, reason: collision with root package name */
    public OkAuthType f436660f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436661g;

    /* renamed from: h, reason: collision with root package name */
    public WebView f436662h;

    /* compiled from: OkAuthActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/OkAuthActivity$a;", "Lru/ok/android/sdk/q;", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    public final class a extends q {
        public a(@Y61.k OkAuthActivity okAuthActivity) {
            super(okAuthActivity);
        }

        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        public final void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
            super.onReceivedError(webView, i12, str, str2);
            String strA = a(i12);
            int i13 = OkAuthActivity.f436655i;
            OkAuthActivity.this.e(strA);
        }

        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        public final void onReceivedSslError(@Y61.k WebView webView, @Y61.k SslErrorHandler sslErrorHandler, @Y61.k SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String strB = b(sslError);
            int i12 = OkAuthActivity.f436655i;
            OkAuthActivity.this.e(strB);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean shouldOverrideUrlLoading(@Y61.k android.webkit.WebView r17, @Y61.k java.lang.String r18) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.sdk.OkAuthActivity.a.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* compiled from: OkAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) throws PackageManager.NameNotFoundException {
            int i13 = OkAuthActivity.f436655i;
            OkAuthActivity.this.a();
        }
    }

    /* compiled from: OkAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f436666c;

        public c(String str) {
            this.f436666c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            int i13 = OkAuthActivity.f436655i;
            String str = this.f436666c;
            OkAuthActivity okAuthActivity = OkAuthActivity.this;
            okAuthActivity.getClass();
            Intent intent = new Intent();
            intent.putExtra("error", str);
            okAuthActivity.setResult(3, intent);
            okAuthActivity.finish();
        }
    }

    public final void a() throws PackageManager.NameNotFoundException {
        String str;
        String str2 = this.f436656b;
        if (str2 == null || C43066x.K(str2) || (str = this.f436657c) == null || C43066x.K(str)) {
            c(getString(R.string.no_application_data));
            return;
        }
        OkAuthType okAuthType = this.f436660f;
        OkAuthType okAuthType2 = OkAuthType.f436706b;
        OkAuthType okAuthType3 = OkAuthType.f436708d;
        if (okAuthType == okAuthType2 || okAuthType == okAuthType3) {
            Intent intent = new Intent();
            intent.setClassName("ru.ok.android", "ru.ok.android.external.LoginExternal");
            ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity == null) {
                f.f436689i.getClass();
                if (f.f436688h == null) {
                    new f(this, null, null, 6, null);
                }
            }
            if (resolveInfoResolveActivity != null) {
                try {
                    PackageInfo packageInfo = getPackageManager().getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64);
                    if (packageInfo != null && packageInfo.versionCode >= 120) {
                        for (Signature signature : packageInfo.signatures) {
                            if (L.f(signature.toCharsString(), "3082025b308201c4a00302010202044f6760f9300d06092a864886f70d01010505003071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f763020170d3132303331393136333831375a180f32303636313232313136333831375a3071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f7630819f300d06092a864886f70d010101050003818d003081890281810080bea15bf578b898805dfd26346b2fbb662889cd6aba3f8e53b5b27c43a984eeec9a5d21f6f11667d987b77653f4a9651e20b94ff10594f76a93a6a36e6a42f4d851847cf1da8d61825ce020b7020cd1bc2eb435b0d416908be9393516ca1976ff736733c1d48ff17cd57f21ad49e05fc99384273efc5546e4e53c5e9f391c430203010001300d06092a864886f70d0101050500038181007d884df69a9748eabbdcfe55f07360433b23606d3b9d4bca03109c3ffb80fccb7809dfcbfd5a466347f1daf036fbbf1521754c2d1d999f9cbc66b884561e8201459aa414677e411e66360c3840ca4727da77f6f042f2c011464e99f34ba7df8b4bceb4fa8231f1d346f4063f7ba0e887918775879e619786728a8078c76647ed")) {
                                intent.putExtra("client_id", this.f436656b);
                                intent.putExtra("client_secret", "6C6B6397C2BCE5EDB7290039");
                                intent.putExtra("redirect_uri", this.f436658d);
                                String[] strArr = this.f436659e;
                                if (strArr.length != 0) {
                                    intent.putExtra("scopes", strArr);
                                }
                                startActivityForResult(intent, 31337);
                                this.f436661g = true;
                                return;
                            }
                        }
                    }
                } catch (ActivityNotFoundException | PackageManager.NameNotFoundException unused) {
                }
            }
            if (this.f436660f == okAuthType2) {
                c(getString(R.string.no_ok_application_installed));
                return;
            }
        }
        OkAuthType okAuthType4 = this.f436660f;
        if (okAuthType4 == OkAuthType.f436707c || okAuthType4 == okAuthType3) {
            this.f436662h.loadUrl(b());
        }
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder("https://connect.ok.ru/oauth/authorize?client_id=");
        sb2.append(this.f436656b);
        sb2.append("&response_type=token&redirect_uri=");
        String strS = AK.c.s(sb2, this.f436658d, "&layout=m&platform=ANDROID");
        String[] strArr = this.f436659e;
        return (strArr == null || strArr.length == 0) ? strS : androidx.appcompat.app.r.r(strS, "&scope=", URLEncoder.encode(C42756l.P(strArr, ";", null, null, null, 62)));
    }

    public final void c(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(2, intent);
        finish();
    }

    public final void d(long j12, String str, String str2) {
        if (str2 == null) {
            L.k();
            throw null;
        }
        t.f436705a.getClass();
        SharedPreferences.Editor editorEdit = getSharedPreferences("oksdkprefs", 0).edit();
        editorEdit.putString("acctkn", str);
        editorEdit.putString("ssk", str2);
        editorEdit.apply();
        Intent intent = new Intent();
        intent.putExtra("access_token", str);
        intent.putExtra("session_secret_key", str2);
        if (j12 > 0) {
            intent.putExtra("expires_in", j12);
        }
        setResult(-1, intent);
        finish();
    }

    public final void e(String str) {
        if (isFinishing()) {
            return;
        }
        try {
            new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(R.string.retry), new b()).setNegativeButton(getString(R.string.cancel), new c(str)).show();
        } catch (RuntimeException unused) {
            Intent intent = new Intent();
            intent.putExtra("error", str);
            setResult(3, intent);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, @Y61.l android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 31337(0x7a69, float:4.3912E-41)
            if (r6 != r0) goto L4f
            r6 = 0
            r5.f436661g = r6
            if (r8 == 0) goto L12
            java.lang.String r6 = "error"
            java.lang.String r6 = r8.getStringExtra(r6)
            if (r6 == 0) goto L12
            goto L14
        L12:
            java.lang.String r6 = ""
        L14:
            r0 = -1
            if (r7 != r0) goto L48
            r7 = 0
            if (r8 == 0) goto L21
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r8.getStringExtra(r0)
            goto L22
        L21:
            r0 = r7
        L22:
            if (r8 == 0) goto L2b
            java.lang.String r1 = "session_secret_key"
            java.lang.String r1 = r8.getStringExtra(r1)
            goto L2c
        L2b:
            r1 = r7
        L2c:
            if (r8 == 0) goto L34
            java.lang.String r7 = "refresh_token"
            java.lang.String r7 = r8.getStringExtra(r7)
        L34:
            r2 = 0
            if (r8 == 0) goto L3e
            java.lang.String r4 = "expires_in"
            long r2 = r8.getLongExtra(r4, r2)
        L3e:
            if (r0 == 0) goto L48
            if (r1 == 0) goto L43
            goto L44
        L43:
            r1 = r7
        L44:
            r5.d(r2, r0, r1)
            goto L4b
        L48:
            r5.c(r6)
        L4b:
            r5.finish()
            goto L52
        L4f:
            super.onActivityResult(r6, r7, r8)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.sdk.OkAuthActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) throws PackageManager.NameNotFoundException {
        OkAuthType okAuthType;
        super.onCreate(bundle);
        setContentView(R.layout.oksdk_webview_activity);
        findViewById(R.id.web_view).setVisibility(4);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f436662h = webView;
        webView.setWebViewClient(new a(this));
        this.f436662h.getSettings().setJavaScriptEnabled(true);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f436656b = bundle.getString("client_id");
        this.f436657c = bundle.getString("application_key");
        String string = bundle.getString("redirect_uri");
        if (string == null) {
            string = "okauth://auth";
        }
        this.f436658d = string;
        String[] stringArray = bundle.getStringArray("scopes");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        this.f436659e = stringArray;
        if (bundle.getSerializable("auth_type") instanceof OkAuthType) {
            Serializable serializable = bundle.getSerializable("auth_type");
            if (serializable == null) {
                throw new TypeCastException("null cannot be cast to non-null type ru.ok.android.sdk.util.OkAuthType");
            }
            okAuthType = (OkAuthType) serializable;
        } else {
            okAuthType = OkAuthType.f436708d;
        }
        this.f436660f = okAuthType;
        boolean z12 = bundle.getBoolean("SSO_STARTED", false);
        this.f436661g = z12;
        if (z12) {
            return;
        }
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, @Y61.k KeyEvent keyEvent) {
        if (4 != i12) {
            return false;
        }
        e(getString(R.string.authorization_canceled));
        return true;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("client_id", this.f436656b);
        bundle.putString("application_key", this.f436657c);
        bundle.putString("redirect_uri", this.f436658d);
        bundle.putStringArray("scopes", this.f436659e);
        bundle.putSerializable("auth_type", this.f436660f);
        bundle.putBoolean("SSO_STARTED", this.f436661g);
    }
}
