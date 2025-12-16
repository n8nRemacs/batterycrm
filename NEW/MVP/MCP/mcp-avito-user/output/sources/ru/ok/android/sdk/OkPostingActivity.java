package ru.ok.android.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.avito.android.R;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.a;

/* compiled from: OkPostingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/sdk/OkPostingActivity;", "Lru/ok/android/sdk/a;", "<init>", "()V", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class OkPostingActivity extends a {
    @Override // ru.ok.android.sdk.a
    public final int a() {
        return R.string.posting_canceled;
    }

    @Override // ru.ok.android.sdk.a
    @Y61.k
    public final String c() {
        return "WidgetMediatopicPost";
    }

    @Override // ru.ok.android.sdk.a
    public final void f(@Y61.l String str) {
        Intent intent = new Intent();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("error".equals(jSONObject.getString("type"))) {
                intent.putExtra("error", jSONObject.getString("message"));
            } else {
                intent.putExtra("result", jSONObject.toString());
            }
        } catch (JSONException unused) {
            intent.putExtra("error", str);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // ru.ok.android.sdk.a, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new a.C12578a(this));
        webView.getSettings().setJavaScriptEnabled(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            HashMap<String, String> map = this.f436677e;
            String string = extras.getString("attachment");
            if (string == null) {
                string = "{}";
            }
            map.put("st.attachment", string);
            map.put("st.utext", extras.getBoolean("utext", false) ? "on" : "off");
        }
        ((WebView) findViewById(R.id.web_view)).loadUrl(d());
    }
}
