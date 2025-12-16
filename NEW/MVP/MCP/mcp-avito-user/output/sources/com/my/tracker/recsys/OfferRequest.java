package com.my.tracker.recsys;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f;
import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.C37835i;
import com.my.tracker.obfuscated.e2;
import com.my.tracker.obfuscated.h0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OfferRequest {

    /* renamed from: a, reason: collision with root package name */
    final OnCompleteListener f365901a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f365902b;
    public final String data;
    public final List<String> placementIds;
    public final Boolean reset;
    public final String userId;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f365904d = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    final String f365903c = "https://recsys.tracker.my.com/api/public/v3/rec/item";

    public interface OnCompleteListener {
        void onComplete(OfferRequest offerRequest, List<Offer> list, String str);
    }

    public class a implements h0.a {
        public a() {
        }

        @Override // com.my.tracker.obfuscated.h0.a
        public String a() {
            return "application/json";
        }

        @Override // com.my.tracker.obfuscated.h0.a
        public void a(OutputStream outputStream) throws IOException {
            if (TextUtils.isEmpty(OfferRequest.this.data)) {
                return;
            }
            outputStream.write(OfferRequest.this.data.getBytes(Constants.ENCODING));
        }
    }

    public OfferRequest(String str, List<String> list, String str2, Boolean bool, OnCompleteListener onCompleteListener, Handler handler) {
        this.userId = str;
        this.placementIds = list;
        this.data = str2;
        this.reset = bool;
        this.f365901a = onCompleteListener;
        this.f365902b = handler;
    }

    public String a(String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("custom_user_id", this.userId);
        builderBuildUpon.appendQueryParameter("sdk_key", str2);
        Boolean bool = this.reset;
        if (bool != null) {
            builderBuildUpon.appendQueryParameter("reset", String.valueOf(bool));
        }
        if (!this.placementIds.isEmpty()) {
            int size = this.placementIds.size();
            for (int i12 = 0; i12 < size; i12++) {
                builderBuildUpon.appendQueryParameter("placement_id", this.placementIds.get(i12));
            }
        }
        return builderBuildUpon.toString();
    }

    public void send() {
        if (this.f365901a == null) {
            e2.a("OfferRequest: listener is null, offers from response can not be returned");
        } else if (this.f365904d.compareAndSet(false, true)) {
            C37835i.b(new f(this, 12));
        } else {
            e2.a("OfferRequest: send has already been called");
        }
    }

    public static List<Offer> a(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    String strOptString = jSONObject.optString("placement_id");
                    int iOptInt = jSONObject.optInt("test_id");
                    int iOptInt2 = jSONObject.optInt("split_id");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("offer");
                    arrayList.add(new Offer(strOptString, jSONObject2.optString("item_id"), jSONObject2.optDouble("price"), jSONObject2.optDouble("discount_price"), jSONObject2.optInt("value"), jSONObject2.optInt("discount_value"), iOptInt, iOptInt2));
                } catch (Throwable unused) {
                    e2.a("OfferRequest: json response has invalid item");
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            e2.a("OfferRequest: error occurred while parsing values from json response");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        String id2 = MyTracker.getTrackerConfig().getId();
        if (TextUtils.isEmpty(id2)) {
            e2.b("OfferRequest: MyTracker hasn't been initialized yet, MyTracker.initTracker() should be called first");
            a(this, this.f365902b, this.f365901a, (h0.b<String>) null);
        } else {
            a(this, this.f365902b, this.f365901a, h0.a(new a(), null, false).a(a(this.f365903c, id2)));
        }
    }

    public static void a(OfferRequest offerRequest, Handler handler, OnCompleteListener onCompleteListener, h0.b<String> bVar) {
        List<Offer> list;
        String str;
        String str2;
        if (bVar == null) {
            str2 = "MyTracker hasn't been initialized yet";
        } else if (bVar.b()) {
            String strA = bVar.a();
            if (TextUtils.isEmpty(strA)) {
                e2.a("OfferRequest: http response is empty ");
                str2 = "Empty response";
            } else {
                List<Offer> listA = a(strA);
                if (listA != null) {
                    list = listA;
                    str = null;
                    handler.post(new FX0.a(onCompleteListener, offerRequest, list, str, 10));
                }
                e2.a("OfferRequest: error while parsing offers from response");
                str2 = "Offers parsing error";
            }
        } else {
            e2.a("OfferRequest: http response is unsuccessful");
            str2 = "Unsuccessful response";
        }
        str = str2;
        list = null;
        handler.post(new FX0.a(onCompleteListener, offerRequest, list, str, 10));
    }
}
