package com.vk.id.internal.store;

import Y61.k;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import androidx.preference.s;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InternalVKIDPrefsStore.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/G0;", "clear", "()V", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "", "value", "getCodeVerifier$vkid_release", "()Ljava/lang/String;", "setCodeVerifier$vkid_release", "(Ljava/lang/String;)V", "codeVerifier", "getState", "setState", VoiceInfo.STATE, "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDPrefsStore {

    @k
    private final Context context;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalVKIDPrefsStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/store/InternalVKIDPrefsStore$Companion;", "", "<init>", "()V", "DEFAULT_STATE", "", "CODE_VERIFIER", "DEFAULT_CODE_VERIFIER", "STATE", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public InternalVKIDPrefsStore(@k Context context) {
        this.context = context;
    }

    private final SharedPreferences getPrefs() {
        Context context = this.context;
        return context.getSharedPreferences(s.a(context), 0);
    }

    public final void clear() {
        setState("");
        setCodeVerifier$vkid_release("");
    }

    @k
    public final String getCodeVerifier$vkid_release() {
        String string = getPrefs().getString("pkce_code_verifier", "");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @k
    public final String getState() {
        String string = getPrefs().getString(VoiceInfo.STATE, "");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void setCodeVerifier$vkid_release(@k String str) {
        getPrefs().edit().putString("pkce_code_verifier", str).apply();
    }

    public final void setState(@k String str) {
        getPrefs().edit().putString(VoiceInfo.STATE, str).apply();
    }
}
