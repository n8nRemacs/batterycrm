package com.vk.api.sdk.exceptions;

import X41.j;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VKApiExecutionException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/exceptions/VKApiExecutionException;", "Lcom/vk/api/sdk/exceptions/VKApiException;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class VKApiExecutionException extends VKApiException {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f366583g = new a(null);
    public static final long serialVersionUID = 7524047853274172872L;

    /* renamed from: b, reason: collision with root package name */
    public final int f366584b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f366585c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Bundle f366586d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<VKApiExecutionException> f366587e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Map<String, String> f366588f;

    /* compiled from: VKApiExecutionException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/exceptions/VKApiExecutionException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @j
        @k
        public static VKApiExecutionException a(@k JSONObject jSONObject, @l String str, @l Bundle bundle) throws JSONException {
            JSONArray jSONArray;
            if (str == null) {
                str = jSONObject.optString("method");
            }
            String str2 = str == null ? "" : str;
            int iOptInt = jSONObject.optInt("error_code", 1);
            int iOptInt2 = jSONObject.optInt("error_subcode", 1);
            String strOptString = jSONObject.optString("error_msg");
            String str3 = strOptString == null ? "" : strOptString;
            try {
                jSONArray = jSONObject.getJSONArray("request_params");
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            kotlin.ranges.l lVarR = s.r(0, jSONArray.length());
            int iF2 = P0.f(C42745f0.q(lVarR, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            kotlin.ranges.k it = lVarR.iterator();
            while (it.f406910d) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(it.a());
                linkedHashMap.put(jSONObject2.getString("key"), jSONObject2.getString("value"));
            }
            if (jSONObject.has("error_text")) {
                String strOptString2 = jSONObject.optString("error_text");
                return new VKApiExecutionException(iOptInt, str2, true, strOptString2 == null ? "" : strOptString2, bundle, null, str3, linkedHashMap, iOptInt2, 32, null);
            }
            String strOptString3 = jSONObject.optString("error_msg");
            String string = strOptString3 == null ? jSONObject.toString() : strOptString3;
            return new VKApiExecutionException(iOptInt, str2, false, string + " | by [" + str2 + ']', bundle, null, string, linkedHashMap, iOptInt2, 32, null);
        }

        public a() {
        }
    }

    @j
    public VKApiExecutionException() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i12, String str, boolean z12, String str2, Bundle bundle, List list, String str3, Map map, int i13, int i14, C42822w c42822w) {
        super(str2);
        bundle = (i14 & 16) != 0 ? Bundle.EMPTY : bundle;
        list = (i14 & 32) != 0 ? null : list;
        map = (i14 & 128) != 0 ? null : map;
        this.f366584b = i12;
        this.f366585c = str;
        this.f366586d = bundle;
        this.f366587e = list;
        this.f366588f = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiExecutionException)) {
            return false;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
        if (this.f366584b == vKApiExecutionException.f366584b) {
            Bundle bundle = vKApiExecutionException.f366586d;
            Bundle bundle2 = this.f366586d;
            if (bundle2 != null) {
                if (L.f(bundle2, bundle)) {
                    return true;
                }
            } else if (bundle == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f366584b * 31;
        Bundle bundle = this.f366586d;
        return i12 + (bundle == null ? 0 : bundle.hashCode());
    }

    @Override // java.lang.Throwable
    @k
    public final String toString() {
        Bundle bundle = this.f366586d;
        if (bundle != null && bundle.containsKey("access_token")) {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString("access_token", HiddenParameter.TYPE);
            bundle = bundle2;
        }
        StringBuilder sb2 = new StringBuilder("VKApiExecutionException{code=");
        sb2.append(this.f366584b);
        sb2.append(", extra=");
        sb2.append(bundle);
        sb2.append(", method=");
        sb2.append(this.f366585c);
        sb2.append(", executeErrors=");
        List<VKApiExecutionException> list = this.f366587e;
        sb2.append((Object) (list == null ? null : C42745f0.O(list, null, "[", "]", null, 57)));
        sb2.append(", super=");
        return C22026a.c(sb2, super.toString(), '}');
    }
}
