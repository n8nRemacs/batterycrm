package com.vk.id.refresh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKIDRefreshTokenParams.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vk/id/refresh/VKIDRefreshTokenParams;", "", VoiceInfo.STATE, "", "refreshAccessToken", "", "<init>", "(Ljava/lang/String;Z)V", "getState$vkid_release", "()Ljava/lang/String;", "getRefreshAccessToken$vkid_release", "()Z", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDRefreshTokenParams {
    private final boolean refreshAccessToken;

    @l
    private final String state;

    /* compiled from: VKIDRefreshTokenParams.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/vk/id/refresh/VKIDRefreshTokenParams$Builder;", "", "<init>", "()V", "Lcom/vk/id/refresh/VKIDRefreshTokenParams;", "build", "()Lcom/vk/id/refresh/VKIDRefreshTokenParams;", "", VoiceInfo.STATE, "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "", "refreshAccessToken", "Z", "getRefreshAccessToken", "()Z", "setRefreshAccessToken", "(Z)V", "getRefreshAccessToken$annotations", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean refreshAccessToken = true;

        @l
        private String state;

        @k
        public final VKIDRefreshTokenParams build() {
            return new VKIDRefreshTokenParams(this.state, this.refreshAccessToken, null);
        }

        public final void setState(@l String str) {
            this.state = str;
        }
    }

    public /* synthetic */ VKIDRefreshTokenParams(String str, boolean z12, C42822w c42822w) {
        this(str, z12);
    }

    /* renamed from: getRefreshAccessToken$vkid_release, reason: from getter */
    public final boolean getRefreshAccessToken() {
        return this.refreshAccessToken;
    }

    @l
    /* renamed from: getState$vkid_release, reason: from getter */
    public final String getState() {
        return this.state;
    }

    private VKIDRefreshTokenParams(String str, boolean z12) {
        this.state = str;
        this.refreshAccessToken = z12;
    }
}
