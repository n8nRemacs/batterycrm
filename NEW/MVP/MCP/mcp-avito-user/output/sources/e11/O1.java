package e11;

import android.content.Context;
import android.util.Base64OutputStream;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class O1 {
    @j.P
    public static String a(@j.N String str, @j.N String str2, @j.P String str3, @j.P String str4, @j.P String str5, @j.P String str6, @j.P String str7, @j.P String str8, float f12, int i12, boolean z12, @j.N Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", com.my.target.T.f364598o.f364600c.i(context));
            jSONObject.put("network", str);
            jSONObject.put("navigationType", str2);
            if (c(str3)) {
                jSONObject.put("title", str3);
            }
            if (c(str4)) {
                jSONObject.put("ctaText", str4);
            }
            if (c(str5)) {
                jSONObject.put("domain", str5);
            }
            if (c(str6)) {
                jSONObject.put("ageRestrictions", str6);
            }
            if (c(str7)) {
                jSONObject.put(ServiceTransportationWidget.DisclaimerField.TYPE, str7);
            }
            if (f12 > 0.0f) {
                jSONObject.put("rating", String.valueOf(f12));
            }
            if (i12 > 0) {
                jSONObject.put("votes", String.valueOf(i12));
            }
            if (c(str8)) {
                jSONObject.put("description", str8);
            }
            if (z12) {
                jSONObject.put("hasVideo", "true");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void b(@j.P String str, @j.N Context context) {
        String string;
        if (str == null) {
            return;
        }
        C39926z1 c39926z1 = new C39926z1();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
                try {
                    deflaterOutputStream.write(str.getBytes());
                    deflaterOutputStream.close();
                    string = byteArrayOutputStream.toString();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            th2.getMessage();
            string = "";
        }
        c39926z1.b("https://ad.mail.ru/mobile/adcontext", string, null, context);
    }

    public static boolean c(@j.P String str) {
        return str != null && str.length() > 0;
    }
}
