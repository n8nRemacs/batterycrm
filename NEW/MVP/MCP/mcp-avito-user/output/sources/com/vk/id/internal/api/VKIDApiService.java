package com.vk.id.internal.api;

import O11.c;
import P11.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.VKIDInvalidTokenException;
import com.vk.id.internal.api.dto.VKIDUserInfoPayload;
import com.vk.id.internal.auth.VKIDCodePayload;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.internal.auth.app.VkAuthSilentAuthProvider;
import com.vk.id.network.InternalVKIDApiContract;
import com.vk.id.network.InternalVKIDCall;
import com.vk.id.network.InternalVKIDCallKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VKIDApiService.kt */
@P
@s0
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J+\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00072\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006'"}, d2 = {"Lcom/vk/id/internal/api/VKIDApiService;", "", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "<init>", "(Lcom/vk/id/network/InternalVKIDApiContract;)V", "Lokhttp3/Call;", "Lcom/vk/id/network/InternalVKIDCall;", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "wrapTokenToVKIDCall", "(Lokhttp3/Call;)Lcom/vk/id/network/InternalVKIDCall;", "", "code", "codeVerifier", "clientId", "deviceId", "redirectUri", VoiceInfo.STATE, "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "accessToken", "Lcom/vk/id/internal/api/dto/VKIDUserInfoPayload;", "getUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "clientSecret", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "getSilentAuthProviders", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "v1Token", "codeChallenge", "Lcom/vk/id/internal/auth/VKIDCodePayload;", "exchangeToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "Lkotlin/G0;", "logout", "Lcom/vk/id/network/InternalVKIDApiContract;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDApiService {

    @k
    private final InternalVKIDApiContract api;

    public VKIDApiService(@k InternalVKIDApiContract internalVKIDApiContract) {
        this.api = internalVKIDApiContract;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z exchangeToken$lambda$2(Response response) throws JSONException, IOException {
        if (response.body() == null) {
            throw new IOException("Empty body " + response.code() + " " + response);
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strString = responseBodyBody.string();
        JSONObject jSONObject = new JSONObject(strString);
        if (jSONObject.has("error")) {
            throw new IOException("Api error: " + response.code() + " " + strString);
        }
        try {
            int i12 = Z.f406624c;
            return Z.a(new VKIDCodePayload(jSONObject.getString("code"), jSONObject.optString(VoiceInfo.STATE), jSONObject.optString("device_id")));
        } catch (JSONException e12) {
            throw new JSONException(e12.getMessage() + ": " + response.code() + " " + strString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public static final Z getSilentAuthProviders$lambda$1(VKIDApiService vKIDApiService, Response response) throws JSONException {
        ?? arrayList;
        int i12 = Z.f406624c;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONArray jSONArray = new JSONObject(responseBodyBody.string()).getJSONArray("response");
        VkAuthSilentAuthProvider.Companion companion = VkAuthSilentAuthProvider.INSTANCE;
        if (jSONArray != null) {
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(companion.parse(jSONObjectOptJSONObject));
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        return Z.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z getUserInfo$lambda$0(Response response) throws JSONException {
        Object bVar;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(responseBodyBody.string());
        if (jSONObject.isNull("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ChannelContext.UserToUser.TYPE);
            int i12 = Z.f406624c;
            bVar = new VKIDUserInfoPayload(jSONObject2.optString("first_name"), jSONObject2.optString("last_name"), jSONObject2.optString("phone"), jSONObject2.optString("avatar"), jSONObject2.optString("email"));
        } else if (L.f(jSONObject.getString("error"), "invalid_token")) {
            int i13 = Z.f406624c;
            bVar = new Z.b(new VKIDInvalidTokenException());
        } else {
            int i14 = Z.f406624c;
            bVar = new Z.b(new IOException());
        }
        return Z.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z logout$lambda$3(Response response) {
        Z.b bVar;
        Object obj;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(responseBodyBody.string());
        if (jSONObject.isNull("error")) {
            int i12 = Z.f406624c;
            obj = G0.f406611a;
        } else {
            if (L.f(jSONObject.getString("error"), "invalid_token")) {
                int i13 = Z.f406624c;
                bVar = new Z.b(new VKIDInvalidTokenException());
            } else {
                int i14 = Z.f406624c;
                bVar = new Z.b(new IOException());
            }
            obj = bVar;
        }
        return Z.a(obj);
    }

    private final InternalVKIDCall<VKIDTokenPayload> wrapTokenToVKIDCall(Call call) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(call, new a(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z wrapTokenToVKIDCall$lambda$6(Response response) throws JSONException, IOException {
        if (response.body() == null) {
            throw new IOException("Empty body " + response.code() + " " + response);
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strString = responseBodyBody.string();
        JSONObject jSONObject = new JSONObject(strString);
        if (jSONObject.has("error")) {
            throw new IOException("Api error: " + response.code() + " " + strString);
        }
        try {
            int i12 = Z.f406624c;
            return Z.a(new VKIDTokenPayload(jSONObject.getString("access_token"), jSONObject.getString("refresh_token"), jSONObject.optString("id_token"), jSONObject.optLong("expires_in"), jSONObject.getLong("user_id"), jSONObject.optString(VoiceInfo.STATE), jSONObject.getString("scope")));
        } catch (JSONException e12) {
            throw new JSONException(e12.getMessage() + ": " + response.code() + " " + strString);
        }
    }

    @k
    public final InternalVKIDCall<VKIDCodePayload> exchangeToken(@k String v1Token, @k String clientId, @k String deviceId, @k String state, @k String codeChallenge) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.exchangeToken(v1Token, clientId, deviceId, state, codeChallenge), new a(1));
    }

    @k
    public final InternalVKIDCall<List<VkAuthSilentAuthProvider>> getSilentAuthProviders(@k String clientId, @k String clientSecret) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.getSilentAuthProviders(clientId, clientSecret), new c(this, 1));
    }

    @k
    public final InternalVKIDCall<VKIDTokenPayload> getToken(@k String code, @k String codeVerifier, @k String clientId, @k String deviceId, @k String redirectUri, @k String state) {
        return wrapTokenToVKIDCall(this.api.getToken(code, codeVerifier, clientId, deviceId, redirectUri, state));
    }

    @k
    public final InternalVKIDCall<VKIDUserInfoPayload> getUserInfo(@k String accessToken, @k String clientId, @k String deviceId) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.getUser(accessToken, clientId, deviceId), new a(2));
    }

    @k
    public final InternalVKIDCall<G0> logout(@k String accessToken, @k String clientId, @k String deviceId) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.logout(accessToken, clientId, deviceId), new a(3));
    }

    @k
    public final InternalVKIDCall<VKIDTokenPayload> refreshToken(@k String refreshToken, @k String clientId, @k String deviceId, @k String state) {
        return wrapTokenToVKIDCall(this.api.refreshToken(refreshToken, clientId, deviceId, state));
    }
}
