package com.vk.push.core.network.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l21.C43531a;
import okhttp3.internal.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppInfoJsonParser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/network/utils/a;", "", "<init>", "()V", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f367123a = new a();

    @Y61.k
    public static List a(@Y61.k String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("hosts");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i12);
            f367123a.getClass();
            arrayList.add(new C43531a(jSONObject.getString("package_name"), jSONObject.getString("pub_key"), jSONObject.optBoolean("is_arbiter")));
        }
        return Util.toImmutableList(arrayList);
    }
}
