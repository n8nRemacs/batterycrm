package z01;

import android.text.TextUtils;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PushSelfShowMessage.java */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: A, reason: collision with root package name */
    public String f443711A;

    /* renamed from: B, reason: collision with root package name */
    public String f443712B;

    /* renamed from: C, reason: collision with root package name */
    public String f443713C;

    /* renamed from: a, reason: collision with root package name */
    public String f443714a;

    /* renamed from: b, reason: collision with root package name */
    public int f443715b;

    /* renamed from: c, reason: collision with root package name */
    public String f443716c;

    /* renamed from: d, reason: collision with root package name */
    public String f443717d;

    /* renamed from: e, reason: collision with root package name */
    public String f443718e;

    /* renamed from: f, reason: collision with root package name */
    public String f443719f;

    /* renamed from: g, reason: collision with root package name */
    public String f443720g;

    /* renamed from: h, reason: collision with root package name */
    public String f443721h;

    /* renamed from: i, reason: collision with root package name */
    public String f443722i;

    /* renamed from: j, reason: collision with root package name */
    public String f443723j;

    /* renamed from: k, reason: collision with root package name */
    public String f443724k;

    /* renamed from: l, reason: collision with root package name */
    public String f443725l;

    /* renamed from: m, reason: collision with root package name */
    public String f443726m;

    /* renamed from: n, reason: collision with root package name */
    public String f443727n;

    /* renamed from: o, reason: collision with root package name */
    public String f443728o;

    /* renamed from: p, reason: collision with root package name */
    public String f443729p;

    /* renamed from: q, reason: collision with root package name */
    public String f443730q;

    /* renamed from: r, reason: collision with root package name */
    public String f443731r;

    /* renamed from: s, reason: collision with root package name */
    public int f443732s;

    /* renamed from: t, reason: collision with root package name */
    public String f443733t;

    /* renamed from: u, reason: collision with root package name */
    public String f443734u;

    /* renamed from: v, reason: collision with root package name */
    public int f443735v;

    /* renamed from: w, reason: collision with root package name */
    public int f443736w;

    /* renamed from: x, reason: collision with root package name */
    public String f443737x;

    /* renamed from: y, reason: collision with root package name */
    public String f443738y;

    /* renamed from: z, reason: collision with root package name */
    public int f443739z;

    public final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msgContent", jSONObject);
        jSONObject2.put("group", this.f443714a);
        jSONObject2.put("tag", this.f443738y);
        jSONObject2.put("autoCancel", this.f443735v);
        jSONObject2.put("visibility", this.f443736w);
        jSONObject2.put("when", this.f443737x);
        return jSONObject2;
    }

    public final JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f443719f);
        jSONObject3.put("msgId", this.f443718e);
        jSONObject3.put("ap", this.f443717d);
        jSONObject3.put("notifyId", this.f443739z);
        jSONObject3.put("psContent", jSONObject);
        jSONObject3.put("notifyDetail", jSONObject2);
        jSONObject3.put("ticker", this.f443712B);
        jSONObject3.put("data", this.f443711A);
        return jSONObject3;
    }

    public final JSONObject c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cmd", this.f443720g);
        jSONObject2.put("content", this.f443721h);
        jSONObject2.put("notifyIcon", this.f443722i);
        jSONObject2.put("notifyTitle", this.f443723j);
        jSONObject2.put("notifySummary", this.f443724k);
        jSONObject2.put("param", jSONObject);
        return jSONObject2;
    }

    public final void d(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f443717d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i12 = 0; i12 < length; i12++) {
                sb2.append("0");
            }
            sb2.append(string);
            this.f443717d = sb2.toString();
        }
    }

    public final void e(JSONObject jSONObject) {
        if (jSONObject.has("acn")) {
            this.f443726m = jSONObject.getString("acn");
        }
        if (jSONObject.has("intentUri")) {
            this.f443716c = jSONObject.getString("intentUri");
        }
        if (jSONObject.has("appPackageName")) {
            this.f443725l = jSONObject.getString("appPackageName");
        } else {
            HMSLog.d("PushSelfShowLog", "appPackageName is null");
        }
    }

    public final boolean f(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("msgId")) {
            HMSLog.i("PushSelfShowLog", "msgId == null");
            return false;
        }
        Object obj = jSONObject.get("msgId");
        if (obj instanceof String) {
            this.f443718e = (String) obj;
            return true;
        }
        if (!(obj instanceof Integer)) {
            return true;
        }
        this.f443718e = String.valueOf(((Integer) obj).intValue());
        return true;
    }

    public final void g(JSONObject jSONObject) {
        this.f443714a = jSONObject.optString("group");
        HMSLog.d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f443714a);
        this.f443735v = jSONObject.optInt("autoCancel", 1);
        HMSLog.d("PushSelfShowLog", "autoCancel: " + this.f443735v);
        this.f443736w = jSONObject.optInt("visibility", 0);
        this.f443737x = jSONObject.optString("when");
        this.f443738y = jSONObject.optString("tag");
    }

    public final boolean h(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("psContent")) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("psContent");
        this.f443720g = jSONObject2.getString("cmd");
        this.f443721h = jSONObject2.optString("content");
        this.f443722i = jSONObject2.optString("notifyIcon");
        this.f443723j = jSONObject2.optString("notifyTitle");
        this.f443724k = jSONObject2.optString("notifySummary");
        this.f443712B = jSONObject2.optString("ticker");
        if (jSONObject2.has("notifyDetail")) {
            HMSLog.d("PushSelfShowLog", "enter parseNotifyParam");
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("notifyDetail");
                if (jSONObject3.has(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)) {
                    this.f443732s = jSONObject3.getInt(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
                }
                this.f443733t = jSONObject3.optString("bigTitle");
                this.f443734u = jSONObject3.optString("bigContent");
                this.f443713C = jSONObject3.optString("icon");
            } catch (JSONException e12) {
                HMSLog.i("PushSelfShowLog", e12.toString());
                return false;
            }
        }
        if (!jSONObject2.has("param")) {
            return false;
        }
        try {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("param");
            if (jSONObject4.has("autoClear")) {
                this.f443715b = jSONObject4.getInt("autoClear");
            } else {
                this.f443715b = 0;
            }
            if ("app".equals(this.f443720g) || "cosa".equals(this.f443720g)) {
                e(jSONObject4);
            } else if (ContextActionHandler.Link.URL.equals(this.f443720g)) {
                j(jSONObject4);
            } else if ("rp".equals(this.f443720g)) {
                i(jSONObject4);
            }
            return true;
        } catch (Exception e13) {
            HMSLog.e("PushSelfShowLog", "ParseParam error ", e13);
            return false;
        }
    }

    public final void i(JSONObject jSONObject) {
        if (jSONObject.has("appPackageName")) {
            this.f443725l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.d("PushSelfShowLog", "rpl or rpt is null");
            return;
        }
        this.f443728o = jSONObject.getString("rpl");
        this.f443729p = jSONObject.getString("rpt");
        if (jSONObject.has("rpct")) {
            this.f443730q = jSONObject.getString("rpct");
        }
    }

    public final void j(JSONObject jSONObject) {
        if (!jSONObject.has(ContextActionHandler.Link.URL)) {
            HMSLog.d("PushSelfShowLog", "url is null");
            return;
        }
        this.f443727n = jSONObject.getString(ContextActionHandler.Link.URL);
        if (jSONObject.has("appPackageName")) {
            this.f443725l = jSONObject.getString("appPackageName");
        }
        if (jSONObject.has("rpt") && jSONObject.has("rpl")) {
            this.f443728o = jSONObject.getString("rpl");
            this.f443729p = jSONObject.getString("rpt");
            if (jSONObject.has("rpct")) {
                this.f443730q = jSONObject.getString("rpct");
            }
        }
    }

    public final String k() {
        HMSLog.d("PushSelfShowLog", "msgId =" + this.f443718e);
        return this.f443718e;
    }

    public final JSONObject l() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.f443715b);
        jSONObject.put(ContextActionHandler.Link.URL, this.f443727n);
        jSONObject.put("rpl", this.f443728o);
        jSONObject.put("rpt", this.f443729p);
        jSONObject.put("rpct", this.f443730q);
        jSONObject.put("appPackageName", this.f443725l);
        jSONObject.put("acn", this.f443726m);
        jSONObject.put("intentUri", this.f443716c);
        return jSONObject;
    }
}
