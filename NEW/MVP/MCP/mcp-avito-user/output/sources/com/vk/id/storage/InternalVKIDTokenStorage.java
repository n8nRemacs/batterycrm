package com.vk.id.storage;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.vk.id.AccessToken;
import com.vk.id.RefreshToken;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InternalVKIDTokenStorage.kt */
@P
@s0
@InternalVKIDApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00178@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/vk/id/storage/InternalVKIDTokenStorage;", "", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "preferences", "<init>", "(Lcom/vk/id/storage/InternalVKIDPreferencesStorage;)V", "Lkotlin/G0;", "clear$vkid_release", "()V", "clear", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Lcom/vk/id/AccessToken;", "value", "getAccessToken$vkid_release", "()Lcom/vk/id/AccessToken;", "setAccessToken$vkid_release", "(Lcom/vk/id/AccessToken;)V", "accessToken", "getCurrentAccessToken", "currentAccessToken", "Lcom/vk/id/RefreshToken;", "getRefreshToken$vkid_release", "()Lcom/vk/id/RefreshToken;", "setRefreshToken$vkid_release", "(Lcom/vk/id/RefreshToken;)V", "refreshToken", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDTokenStorage {

    @k
    private final Gson gson = new Gson();

    @k
    private final InternalVKIDPreferencesStorage preferences;
    public static final int $stable = 8;

    public InternalVKIDTokenStorage(@k InternalVKIDPreferencesStorage internalVKIDPreferencesStorage) {
        this.preferences = internalVKIDPreferencesStorage;
    }

    public final void clear$vkid_release() {
        setAccessToken$vkid_release(null);
        setRefreshToken$vkid_release(null);
        this.preferences.set("REFRESH_TOKEN_KEY", null);
    }

    @l
    public final AccessToken getAccessToken$vkid_release() {
        try {
            return (AccessToken) this.gson.d(AccessToken.class, this.preferences.getString("ACCESS_TOKEN_KEY"));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    @l
    public final AccessToken getCurrentAccessToken() {
        return getAccessToken$vkid_release();
    }

    @l
    public final RefreshToken getRefreshToken$vkid_release() {
        RefreshToken refreshToken;
        try {
            String string = this.preferences.getString("REFRESH_TOKEN_WITH_SCOPES_KEY");
            if (string != null && (refreshToken = (RefreshToken) this.gson.d(RefreshToken.class, string)) != null) {
                return refreshToken;
            }
            String string2 = this.preferences.getString("REFRESH_TOKEN_KEY");
            if (string2 != null) {
                return new RefreshToken(string2, null);
            }
            return null;
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public final void setAccessToken$vkid_release(@l AccessToken accessToken) {
        this.preferences.set("ACCESS_TOKEN_KEY", accessToken != null ? this.gson.l(accessToken) : null);
    }

    public final void setRefreshToken$vkid_release(@l RefreshToken refreshToken) {
        this.preferences.set("REFRESH_TOKEN_WITH_SCOPES_KEY", refreshToken != null ? this.gson.l(refreshToken) : null);
    }
}
