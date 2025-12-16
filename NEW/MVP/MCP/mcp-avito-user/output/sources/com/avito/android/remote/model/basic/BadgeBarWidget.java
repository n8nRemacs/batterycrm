package com.avito.android.remote.model.basic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicSettingsWidget.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/basic/BadgeBarWidget;", "Lcom/avito/android/remote/model/basic/BasicSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/basic/Header;", "badges", "", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadge;", "(Lcom/avito/android/remote/model/basic/Header;Ljava/util/List;)V", "getBadges", "()Ljava/util/List;", "getConfig", "()Lcom/avito/android/remote/model/basic/Header;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BadgeBarWidget implements BasicSettingsWidget {

    @c("badges")
    @l
    private final List<AdvertBadge> badges;

    @c(Navigation.CONFIG)
    @k
    private final Header config;

    public BadgeBarWidget(@k Header header, @l List<AdvertBadge> list) {
        this.config = header;
        this.badges = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BadgeBarWidget copy$default(BadgeBarWidget badgeBarWidget, Header header, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            header = badgeBarWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = badgeBarWidget.badges;
        }
        return badgeBarWidget.copy(header, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Header getConfig() {
        return this.config;
    }

    @l
    public final List<AdvertBadge> component2() {
        return this.badges;
    }

    @k
    public final BadgeBarWidget copy(@k Header config, @l List<AdvertBadge> badges) {
        return new BadgeBarWidget(config, badges);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeBarWidget)) {
            return false;
        }
        BadgeBarWidget badgeBarWidget = (BadgeBarWidget) other;
        return L.f(this.config, badgeBarWidget.config) && L.f(this.badges, badgeBarWidget.badges);
    }

    @l
    public final List<AdvertBadge> getBadges() {
        return this.badges;
    }

    @k
    public final Header getConfig() {
        return this.config;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        List<AdvertBadge> list = this.badges;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeBarWidget(config=");
        sb2.append(this.config);
        sb2.append(", badges=");
        return H.p(sb2, this.badges, ')');
    }
}
