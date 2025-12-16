package com.avito.android.work_profile.api.profile_tabs;

import Y61.k;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileTabsResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/work_profile/api/profile_tabs/ProfileTabsResponse;", "", "tabs", "", "Lcom/avito/android/work_profile/api/profile_tabs/TabResponse;", "(Ljava/util/List;)V", "getTabs", "()Ljava/util/List;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileTabsResponse {

    @k
    private final List<TabResponse> tabs;

    public ProfileTabsResponse(@k List<TabResponse> list) {
        this.tabs = list;
    }

    @k
    public final List<TabResponse> getTabs() {
        return this.tabs;
    }
}
