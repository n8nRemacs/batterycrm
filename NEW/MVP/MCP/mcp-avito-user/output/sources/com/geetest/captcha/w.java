package com.geetest.captcha;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/geetest/captcha/model/ErrorBean;", "", "", "code", "msg", "Lorg/json/JSONObject;", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "toJson", "()Ljava/lang/String;", "Ljava/lang/String;", "Lorg/json/JSONObject;", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f342797d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f342798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f342799b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f342800c;

    public static final class a {
        @Y61.k
        public final w a(@Y61.k String str, @Y61.k String str2, @Y61.k JSONObject jSONObject) {
            return new w(str, str2, jSONObject);
        }
    }

    public w(String str, String str2, JSONObject jSONObject) {
        this.f342798a = str;
        this.f342799b = str2;
        this.f342800c = jSONObject;
    }

    @Y61.k
    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f342798a);
            jSONObject.put("msg", this.f342799b);
            jSONObject.put("desc", this.f342800c);
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
        return jSONObject.toString();
    }
}
