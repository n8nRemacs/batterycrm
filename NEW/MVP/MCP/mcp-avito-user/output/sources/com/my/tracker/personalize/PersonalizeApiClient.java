package com.my.tracker.personalize;

import Ba1.n;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.C37835i;
import com.my.tracker.obfuscated.e2;
import com.my.tracker.obfuscated.h0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PersonalizeApiClient {

    /* renamed from: a, reason: collision with root package name */
    private final a f365885a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f365886a;

        /* renamed from: b, reason: collision with root package name */
        private Context f365887b;

        public PersonalizeApiClient build() {
            String id2 = MyTracker.getTrackerConfig().getId();
            if (TextUtils.isEmpty(id2)) {
                e2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.f365887b;
            return new PersonalizeApiClient(new a(id2, context != null ? MyTracker.getInstanceId(context) : null, this.f365886a));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.f365886a = list;
            this.f365887b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    public PersonalizeApiClient(a aVar) {
        this.f365885a = aVar;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(PersonalizeRequest<T> personalizeRequest, Handler handler, OnCompleteListener<T> onCompleteListener) {
        C37835i.b(new n(this, a(personalizeRequest, this.f365885a), personalizeRequest, handler, onCompleteListener, 2));
    }

    private String a(PersonalizeRequest<?> personalizeRequest, a aVar) {
        String strG = G.g(new StringBuilder(), aVar.f365896b, "/api/v1/recommendation", personalizeRequest.a());
        Map<String, List<String>> mapB = personalizeRequest.b();
        mapB.remove("sdk_key");
        if (mapB.isEmpty()) {
            return strG;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strG).buildUpon();
        for (Map.Entry<String, List<String>> entry : mapB.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(key, it.next());
            }
        }
        builderBuildUpon.appendQueryParameter("sdk_key", aVar.f365895a);
        return builderBuildUpon.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    private <T> void a(PersonalizeRequest<T> personalizeRequest, h0.b<String> bVar, Handler handler, OnCompleteListener<T> onCompleteListener) {
        String str;
        String str2;
        if (bVar == null) {
            e2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String strA = bVar.a();
            if (!TextUtils.isEmpty(strA)) {
                try {
                    c<T> cVarA = personalizeRequest.c().a(new JSONObject(strA));
                    String strA2 = cVarA.a();
                    if (strA2 != null) {
                        a(personalizeRequest, null, null, handler, strA2, onCompleteListener);
                    } else {
                        a(personalizeRequest, cVarA.b(), strA, handler, null, onCompleteListener);
                    }
                    return;
                } catch (Throwable th2) {
                    String strI = G.i(th2, new StringBuilder("Can't parse JSON with error: "));
                    e2.a("PersonalizeApiClient: " + strI);
                    a(personalizeRequest, null, null, handler, strI, onCompleteListener);
                    return;
                }
            }
            e2.a("PersonalizeApiClient: HTTP response is empty");
            str = null;
            str2 = "HTTP response is empty";
        }
        a(personalizeRequest, null, str, handler, str2, onCompleteListener);
    }

    private <T> void a(PersonalizeRequest<T> personalizeRequest, T t12, String str, Handler handler, String str2, OnCompleteListener<T> onCompleteListener) {
        FX0.a aVar;
        Handler handler2 = handler == null ? C37835i.f365658a : handler;
        if (TextUtils.isEmpty(str2)) {
            aVar = new FX0.a(this, onCompleteListener, personalizeRequest, new PersonalizeResponse(t12, null, str), 9);
        } else {
            e2.b("PersonalizeApiClient: " + str2);
            aVar = new FX0.a(this, onCompleteListener, personalizeRequest, str2, 8);
        }
        handler2.post(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, h0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }
}
