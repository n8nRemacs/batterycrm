package com.avito.android.work_profile.api.profile_tabs;

import Y61.k;
import androidx.annotation.Keep;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ProfileTabsResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/work_profile/api/profile_tabs/TabResponse;", "", "type", "Lcom/avito/android/work_profile/api/profile_tabs/Type;", "title", "", TooltipAttribute.PARAM_DEEP_LINK, "(Lcom/avito/android/work_profile/api/profile_tabs/Type;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/work_profile/api/profile_tabs/Type;", "getUri", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TabResponse {

    @k
    private final String title;

    @k
    private final Type type;

    @k
    private final String uri;

    public TabResponse(@k Type type, @k String str, @k String str2) {
        this.type = type;
        this.title = str;
        this.uri = str2;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final Type getType() {
        return this.type;
    }

    @k
    public final String getUri() {
        return this.uri;
    }
}
