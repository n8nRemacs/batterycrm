package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37836j {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f365672a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    final f2 f365673b;

    /* renamed from: c, reason: collision with root package name */
    final Context f365674c;

    public C37836j(f2 f2Var, Context context) {
        this.f365673b = f2Var;
        this.f365674c = context.getApplicationContext();
    }

    public static C37836j a(f2 f2Var, Context context) {
        return new C37836j(f2Var, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            e2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    public void b(String str) {
        if (a()) {
            e2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                e2.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            e2.a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th2) {
            e2.b("AttributionHandler error: handling server attribution failed with error: ", th2);
        }
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else {
            if (!a()) {
                try {
                    String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, Constants.ENCODING)).getQueryParameter("mt_deeplink");
                    if (TextUtils.isEmpty(queryParameter)) {
                        e2.a("AttributionHandler: deeplink is empty");
                        return;
                    } else {
                        a(new JSONObject().put(Constants.DEEPLINK, queryParameter));
                        return;
                    }
                } catch (Throwable th2) {
                    e2.b("AttributionHandler error: handling referrer failed with error: ", th2);
                    return;
                }
            }
            str2 = "AttributionHandler: attribution has already been received";
        }
        e2.a(str2);
    }

    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.DEEPLINK);
        if (TextUtils.isEmpty(strOptString)) {
            e2.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.f365672a.compareAndSet(false, true)) {
            e2.a("AttributionHandler: attribution has already been received");
            return;
        }
        z0 z0VarA = z0.a(this.f365674c);
        if (!TextUtils.isEmpty(z0VarA.g())) {
            e2.a("AttributionHandler: attribution has already been received");
            return;
        }
        z0VarA.i(jSONObject.toString());
        MyTracker.AttributionListener attributionListenerD = this.f365673b.d();
        if (attributionListenerD == null) {
            return;
        }
        Handler handlerC = this.f365673b.c();
        if (handlerC == null) {
            handlerC = C37835i.f365658a;
        }
        try {
            handlerC.post(new H(8, attributionListenerD, MyTrackerAttribution.newAttribution(strOptString)));
        } catch (Throwable th2) {
            e2.b("AttributionHandler error: exception occurred while post runnable", th2);
        }
    }

    public boolean a() {
        if (this.f365672a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(z0.a(this.f365674c).g());
    }
}
