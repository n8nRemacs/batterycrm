package ru.ok.android.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: AbstractWidgetActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/android/sdk/a;", "Landroid/app/Activity;", "<init>", "()V", "a", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public abstract class a extends Activity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f436673g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f436674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f436675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f436676d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, String> f436677e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f436678f = true;

    /* compiled from: AbstractWidgetActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/a$a;", "Lru/ok/android/sdk/q;", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: ru.ok.android.sdk.a$a, reason: collision with other inner class name */
    public final class C12578a extends q {
        public C12578a(@Y61.k a aVar) {
            super(aVar);
        }

        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        public final void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
            super.onReceivedError(webView, i12, str, str2);
            a.this.e(a(i12));
        }

        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        public final void onReceivedSslError(@Y61.k WebView webView, @Y61.k SslErrorHandler sslErrorHandler, @Y61.k SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            a.this.e(b(sslError));
        }

        @Override // ru.ok.android.sdk.q, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Y61.k WebView webView, @Y61.k String str) {
            a aVar = a.this;
            if (!C43066x.h0(str, aVar.b(), false)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Bundle bundle = new Bundle();
            String[] strArrSplit = str.split("\\?");
            if (strArrSplit.length > 1) {
                for (String str2 : strArrSplit[1].split("[&#]")) {
                    String[] strArrSplit2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    bundle.putString(URLDecoder.decode(strArrSplit2[0]), strArrSplit2.length > 1 ? URLDecoder.decode(strArrSplit2[1]) : null);
                }
            }
            aVar.f(bundle.getString("result"));
            return true;
        }
    }

    /* compiled from: AbstractWidgetActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            a aVar = a.this;
            WebView webView = (WebView) aVar.findViewById(R.id.web_view);
            int i13 = a.f436673g;
            webView.loadUrl(aVar.d());
        }
    }

    /* compiled from: AbstractWidgetActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f436682c;

        public c(String str) {
            this.f436682c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            a.this.f(this.f436682c);
        }
    }

    public abstract int a();

    @Y61.k
    public final String b() {
        return "okwidget://".concat(c().toLowerCase());
    }

    @Y61.k
    public abstract String c();

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    @Y61.k
    public final String d() throws UnsupportedEncodingException {
        String strEncode;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : this.f436677e.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        treeMap.put("st.return", b());
        StringBuilder sb2 = new StringBuilder(200);
        StringBuilder sb3 = new StringBuilder("https://connect.ok.ru/dk?st.cmd=" + c() + "&st.access_token=" + this.f436675c + "&st.app=" + this.f436674b + "&st.return=" + b());
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            if (C42756l.H(str, s.f436704a) >= 0) {
                sb2.append(str);
                sb2.append('=');
                sb2.append(str2);
            }
            if (!L.f(str, "st.return")) {
                sb3.append('&');
                sb3.append(str);
                sb3.append('=');
                try {
                    strEncode = URLEncoder.encode(str2, Constants.ENCODING);
                } catch (UnsupportedEncodingException e12) {
                    e12.getLocalizedMessage();
                    strEncode = null;
                }
                sb3.append(strEncode);
            }
        }
        ru.ok.android.sdk.util.e eVar = ru.ok.android.sdk.util.e.f436721b;
        String str3 = sb2.toString() + this.f436676d;
        eVar.getClass();
        String strB = ru.ok.android.sdk.util.e.b(str3);
        for (Map.Entry entry3 : ru.ok.android.sdk.b.f436683a.entrySet()) {
            String str4 = (String) entry3.getKey();
            String str5 = (String) entry3.getValue();
            sb3.append('&');
            sb3.append(str4);
            sb3.append('=');
            sb3.append(str5);
        }
        return AK.c.s(sb3, "&st.signature=", strB);
    }

    public final void e(@Y61.k String str) {
        if (!this.f436678f) {
            f(str);
            return;
        }
        try {
            new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(R.string.retry), new b()).setNegativeButton(getString(R.string.cancel), new c(str)).show();
        } catch (RuntimeException unused) {
            f(str);
        }
    }

    public abstract void f(@Y61.l String str);

    @Override // android.app.Activity
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.oksdk_webview_activity);
        HashMap<String, String> map = this.f436677e;
        map.clear();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f436674b = extras.getString("appId");
            this.f436675c = extras.getString("access_token");
            this.f436676d = extras.getString("session_secret_key");
            if (extras.containsKey("widget_args")) {
                Serializable serializable = extras.getSerializable("widget_args");
                if (!(serializable instanceof HashMap)) {
                    serializable = null;
                }
                HashMap map2 = (HashMap) serializable;
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
            if (extras.containsKey("widget_retry_allowed")) {
                this.f436678f = extras.getBoolean("widget_retry_allowed", true);
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, @Y61.k KeyEvent keyEvent) {
        if (4 != i12) {
            return false;
        }
        e(getString(a()));
        return true;
    }
}
