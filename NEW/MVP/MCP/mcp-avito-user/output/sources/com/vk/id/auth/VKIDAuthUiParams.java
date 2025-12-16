package com.vk.id.auth;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VKIDAuthUiParams.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B+\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/vk/id/auth/VKIDAuthUiParams;", "", "", VoiceInfo.STATE, "codeChallenge", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "Ljava/lang/String;", "getState$vkid_release", "()Ljava/lang/String;", "getCodeChallenge$vkid_release", "Ljava/util/Set;", "getScopes$vkid_release", "()Ljava/util/Set;", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDAuthUiParams {

    @l
    private final String codeChallenge;

    @k
    private final Set<String> scopes;

    @l
    private final String state;

    /* compiled from: VKIDAuthUiParams.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/id/auth/VKIDAuthUiParams$Builder;", "", "<init>", "()V", "", "", "scopes", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @k
        private Set<String> scopes = B0.f406639b;
    }

    public /* synthetic */ VKIDAuthUiParams(String str, String str2, Set set, C42822w c42822w) {
        this(str, str2, set);
    }

    private VKIDAuthUiParams(String str, String str2, Set<String> set) {
        this.state = str;
        this.codeChallenge = str2;
        this.scopes = set;
    }
}
