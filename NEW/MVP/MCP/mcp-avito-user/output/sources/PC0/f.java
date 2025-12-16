package Pc0;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: ProfileVkLinkV2Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LPc0/f;", "", "", "code", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getState", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f {

    @com.google.gson.annotations.c("code")
    @k
    private final String code;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @k
    private final String state;

    public f(@k String str, @k String str2) {
        this.code = str;
        this.state = str2;
    }
}
