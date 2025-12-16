package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/extended/ProfileBannerPrivate;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", "widgetName", "", "(Ljava/lang/String;)V", "getWidgetName", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileBannerPrivate implements ExtendedSettingsWidget {

    @c("widgetName")
    @k
    private final String widgetName;

    public ProfileBannerPrivate(@k String str) {
        this.widgetName = str;
    }

    public static /* synthetic */ ProfileBannerPrivate copy$default(ProfileBannerPrivate profileBannerPrivate, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = profileBannerPrivate.widgetName;
        }
        return profileBannerPrivate.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final ProfileBannerPrivate copy(@k String widgetName) {
        return new ProfileBannerPrivate(widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfileBannerPrivate) && L.f(this.widgetName, ((ProfileBannerPrivate) other).widgetName);
    }

    @k
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        return this.widgetName.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("ProfileBannerPrivate(widgetName="), this.widgetName, ')');
    }
}
