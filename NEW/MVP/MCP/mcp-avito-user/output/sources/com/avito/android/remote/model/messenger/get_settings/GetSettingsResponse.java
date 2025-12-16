package com.avito.android.remote.model.messenger.get_settings;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetSettingsResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsResponse;", "", "autoRepliesUrl", "", "(Ljava/lang/String;)V", "getAutoRepliesUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GetSettingsResponse {

    @k
    public static final String AUTO_REPLIES_URL = "promt_autoreplies_url";

    @c(AUTO_REPLIES_URL)
    @k
    private final String autoRepliesUrl;

    public GetSettingsResponse(@k String str) {
        this.autoRepliesUrl = str;
    }

    public static /* synthetic */ GetSettingsResponse copy$default(GetSettingsResponse getSettingsResponse, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = getSettingsResponse.autoRepliesUrl;
        }
        return getSettingsResponse.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAutoRepliesUrl() {
        return this.autoRepliesUrl;
    }

    @k
    public final GetSettingsResponse copy(@k String autoRepliesUrl) {
        return new GetSettingsResponse(autoRepliesUrl);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSettingsResponse) && L.f(this.autoRepliesUrl, ((GetSettingsResponse) other).autoRepliesUrl);
    }

    @k
    public final String getAutoRepliesUrl() {
        return this.autoRepliesUrl;
    }

    public int hashCode() {
        return this.autoRepliesUrl.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("GetSettingsResponse(autoRepliesUrl="), this.autoRepliesUrl, ')');
    }
}
