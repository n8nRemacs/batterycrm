package com.vk.api.sdk.internal;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: VKErrorUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/internal/g;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f366628a = new g();

    @k
    public static VKApiException a(@k JSONObject jSONObject, @l String str, @l String str2) {
        try {
            int iOptInt = jSONObject.optInt("error_code");
            Bundle bundle = null;
            if (iOptInt == 5) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ban_info");
                if (jSONObjectOptJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString("user_ban_info", jSONObjectOptJSONObject.toString());
                }
            } else if (iOptInt == 14) {
                bundle = new Bundle();
                bundle.putString("captcha_sid", jSONObject.getString("captcha_sid"));
                bundle.putString("captcha_img", jSONObject.getString("captcha_img"));
            } else if (iOptInt == 17) {
                bundle = new Bundle();
                bundle.putString("validation_url", jSONObject.getString("redirect_uri"));
            } else if (iOptInt == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", jSONObject.getString("confirmation_text"));
            } else if (iOptInt == 3609) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("extend_hash", jSONObject.optString("extend_hash", null));
                bundle = bundle2;
            }
            if (str2 != null) {
                if (bundle == null) {
                    bundle = new Bundle(1);
                }
                bundle.putString("access_token", str2);
            }
            VKApiExecutionException.f366583g.getClass();
            return VKApiExecutionException.a.a(jSONObject, str, bundle);
        } catch (Exception e12) {
            return new VKApiIllegalResponseException(jSONObject.toString(), e12);
        }
    }
}
