package e11;

import java.net.HttpCookie;
import org.json.JSONObject;

/* renamed from: e11.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39890n0 {
    @j.P
    public static HttpCookie a(@j.N String str) {
        Throwable th2;
        HttpCookie httpCookie;
        try {
            JSONObject jSONObject = new JSONObject(str);
            httpCookie = new HttpCookie(jSONObject.getString("name"), jSONObject.optString("value"));
            try {
                httpCookie.setComment(jSONObject.optString("comment"));
                httpCookie.setCommentURL(jSONObject.optString("commentUrl"));
                httpCookie.setDomain(jSONObject.optString("domain"));
                httpCookie.setMaxAge(jSONObject.optInt("maxage"));
                httpCookie.setPath(jSONObject.optString("path"));
                httpCookie.setPortlist(jSONObject.optString("portlist"));
                httpCookie.setVersion(jSONObject.optInt("version"));
                httpCookie.setSecure(jSONObject.optBoolean("secure"));
                httpCookie.setDiscard(jSONObject.optBoolean("discard"));
                httpCookie.setHttpOnly(jSONObject.optBoolean("httpOnly"));
            } catch (Throwable th3) {
                th2 = th3;
                th2.getMessage();
                return httpCookie;
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpCookie = null;
        }
        return httpCookie;
    }
}
