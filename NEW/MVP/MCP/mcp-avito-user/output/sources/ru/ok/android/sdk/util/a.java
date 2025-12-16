package ru.ok.android.sdk.util;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.OkRequestMode;
import ru.ok.android.sdk.f;

/* compiled from: OkPayment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/sdk/util/a;", "", "a", "b", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<C12579a> f436711a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f436712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f436713c;

    /* compiled from: OkPayment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/util/a$a;", "", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: ru.ok.android.sdk.util.a$a, reason: collision with other inner class name */
    public final class C12579a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public String f436714a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f436715b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public String f436716c;

        /* renamed from: d, reason: collision with root package name */
        public int f436717d;

        public C12579a() {
            throw null;
        }
    }

    /* compiled from: OkPayment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/ok/android/sdk/util/a$b;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    @SuppressLint({"StaticFieldLeak"})
    public final class b extends AsyncTask<Void, Void, Void> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) throws JSONException {
            JSONObject jSONObject;
            HashMap map = new HashMap();
            while (true) {
                a aVar = a.this;
                ConcurrentLinkedQueue<C12579a> concurrentLinkedQueue = aVar.f436711a;
                C12579a c12579aPeek = concurrentLinkedQueue.peek();
                if (c12579aPeek == null) {
                    return null;
                }
                map.clear();
                map.put("trx_id", c12579aPeek.f436714a);
                map.put(DeliverySubsidiesSlotKt.AMOUNT, c12579aPeek.f436715b);
                map.put("currency", c12579aPeek.f436716c);
                try {
                    f.a aVar2 = f.f436689i;
                    Context context = aVar.f436713c;
                    aVar2.getClass();
                    f fVar = f.f436688h;
                    if (fVar == null) {
                        fVar = new f(context, null, null, 6, null);
                    }
                    jSONObject = new JSONObject(fVar.c("sdk.reportPayment", map, EnumSet.of(OkRequestMode.f436667b)));
                } catch (IOException e12) {
                    map.toString();
                    e12.getMessage();
                } catch (JSONException e13) {
                    map.toString();
                    e13.getMessage();
                }
                if (jSONObject.optBoolean("result")) {
                    concurrentLinkedQueue.remove();
                    a.a(aVar);
                } else {
                    jSONObject.toString();
                    jSONObject.optInt("error_code", 0);
                    int i12 = c12579aPeek.f436717d + 1;
                    c12579aPeek.f436717d = i12;
                    if (i12 <= 20) {
                        a.a(aVar);
                        return null;
                    }
                    map.toString();
                    concurrentLinkedQueue.remove();
                    a.a(aVar);
                }
            }
        }
    }

    public a(@k Context context) {
        this.f436713c = context;
        this.f436712b = context.getSharedPreferences("ok.payment", 0);
    }

    public static final void a(a aVar) throws JSONException {
        SharedPreferences.Editor editorEdit = aVar.f436712b.edit();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C12579a> it = aVar.f436711a.iterator();
            while (it.hasNext()) {
                C12579a next = it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", next.f436714a);
                jSONObject.put(DeliverySubsidiesSlotKt.AMOUNT, next.f436715b);
                jSONObject.put("currency", next.f436716c);
                int i12 = next.f436717d;
                if (i12 > 0) {
                    jSONObject.put("tries", i12);
                }
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e12) {
            e12.getMessage();
        }
        editorEdit.putString("queue", jSONArray.toString());
        editorEdit.apply();
    }

    public final void b() {
        ConcurrentLinkedQueue<C12579a> concurrentLinkedQueue = this.f436711a;
        concurrentLinkedQueue.clear();
        String string = this.f436712b.getString("queue", null);
        ArrayList arrayList = new ArrayList();
        if (string != null && string.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    C12579a c12579a = new C12579a();
                    c12579a.f436714a = "";
                    c12579a.f436715b = "";
                    c12579a.f436716c = "";
                    c12579a.f436714a = jSONObject.getString("id");
                    c12579a.f436715b = jSONObject.getString(DeliverySubsidiesSlotKt.AMOUNT);
                    c12579a.f436716c = jSONObject.getString("currency");
                    c12579a.f436717d = jSONObject.optInt("tries");
                    arrayList.add(c12579a);
                }
            } catch (JSONException e12) {
                e12.getMessage();
            }
        }
        concurrentLinkedQueue.addAll(arrayList);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new b().execute(new Void[0]);
    }
}
