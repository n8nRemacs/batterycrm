package com.vk.id.exchangetoken;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKIDExchangeTokenParams.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams;", "", VoiceInfo.STATE, "", "codeExchangeState", "codeChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getState$vkid_release", "()Ljava/lang/String;", "getCodeExchangeState$vkid_release", "getCodeChallenge$vkid_release", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDExchangeTokenParams {

    @l
    private final String codeChallenge;

    @l
    private final String codeExchangeState;

    @l
    private final String state;

    /* compiled from: VKIDExchangeTokenParams.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDExchangeTokenParams$Builder;", "", "<init>", "()V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
    }

    public /* synthetic */ VKIDExchangeTokenParams(String str, String str2, String str3, C42822w c42822w) {
        this(str, str2, str3);
    }

    @l
    /* renamed from: getCodeChallenge$vkid_release, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @l
    /* renamed from: getCodeExchangeState$vkid_release, reason: from getter */
    public final String getCodeExchangeState() {
        return this.codeExchangeState;
    }

    @l
    /* renamed from: getState$vkid_release, reason: from getter */
    public final String getState() {
        return this.state;
    }

    private VKIDExchangeTokenParams(String str, String str2, String str3) {
        this.state = str;
        this.codeExchangeState = str2;
        this.codeChallenge = str3;
    }

    public /* synthetic */ VKIDExchangeTokenParams(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
