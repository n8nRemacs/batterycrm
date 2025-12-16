package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileBadgeBarV3.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadge;", "badges", "", "widgetName", "Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;", "view", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;)Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBadges", "Ljava/lang/String;", "getWidgetName", "Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;", "getView", "BadgeBarView", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileBadgeBarV3 implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileBadgeBarV3> CREATOR = new Creator();

    @c("badges")
    @l
    private final List<AdvertBadge> badges;

    @c("view")
    @l
    private final BadgeBarView view;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileBadgeBarV3.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Action;", "action", "", "showMoreTitle", "<init>", "(Lcom/avito/android/remote/model/Action;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/Action;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/Action;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileBadgeBarV3$BadgeBarView;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "Ljava/lang/String;", "getShowMoreTitle", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BadgeBarView implements Parcelable {

        @k
        public static final Parcelable.Creator<BadgeBarView> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("showMoreTitle")
        @l
        private final String showMoreTitle;

        /* compiled from: ExtendedProfileBadgeBarV3.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BadgeBarView> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BadgeBarView createFromParcel(@k Parcel parcel) {
                return new BadgeBarView((Action) parcel.readParcelable(BadgeBarView.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BadgeBarView[] newArray(int i12) {
                return new BadgeBarView[i12];
            }
        }

        public BadgeBarView(@l Action action, @l String str) {
            this.action = action;
            this.showMoreTitle = str;
        }

        public static /* synthetic */ BadgeBarView copy$default(BadgeBarView badgeBarView, Action action, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                action = badgeBarView.action;
            }
            if ((i12 & 2) != 0) {
                str = badgeBarView.showMoreTitle;
            }
            return badgeBarView.copy(action, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        @k
        public final BadgeBarView copy(@l Action action, @l String showMoreTitle) {
            return new BadgeBarView(action, showMoreTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeBarView)) {
                return false;
            }
            BadgeBarView badgeBarView = (BadgeBarView) other;
            return L.f(this.action, badgeBarView.action) && L.f(this.showMoreTitle, badgeBarView.showMoreTitle);
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @l
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        public int hashCode() {
            Action action = this.action;
            int iHashCode = (action == null ? 0 : action.hashCode()) * 31;
            String str = this.showMoreTitle;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BadgeBarView(action=");
            sb2.append(this.action);
            sb2.append(", showMoreTitle=");
            return C22026a.c(sb2, this.showMoreTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
            parcel.writeString(this.showMoreTitle);
        }
    }

    /* compiled from: ExtendedProfileBadgeBarV3.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileBadgeBarV3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBadgeBarV3 createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileBadgeBarV3.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExtendedProfileBadgeBarV3(arrayList, parcel.readString(), parcel.readInt() != 0 ? BadgeBarView.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBadgeBarV3[] newArray(int i12) {
            return new ExtendedProfileBadgeBarV3[i12];
        }
    }

    public ExtendedProfileBadgeBarV3(@l List<AdvertBadge> list, @l String str, @l BadgeBarView badgeBarView) {
        this.badges = list;
        this.widgetName = str;
        this.view = badgeBarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileBadgeBarV3 copy$default(ExtendedProfileBadgeBarV3 extendedProfileBadgeBarV3, List list, String str, BadgeBarView badgeBarView, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = extendedProfileBadgeBarV3.badges;
        }
        if ((i12 & 2) != 0) {
            str = extendedProfileBadgeBarV3.widgetName;
        }
        if ((i12 & 4) != 0) {
            badgeBarView = extendedProfileBadgeBarV3.view;
        }
        return extendedProfileBadgeBarV3.copy(list, str, badgeBarView);
    }

    @l
    public final List<AdvertBadge> component1() {
        return this.badges;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BadgeBarView getView() {
        return this.view;
    }

    @k
    public final ExtendedProfileBadgeBarV3 copy(@l List<AdvertBadge> badges, @l String widgetName, @l BadgeBarView view) {
        return new ExtendedProfileBadgeBarV3(badges, widgetName, view);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileBadgeBarV3)) {
            return false;
        }
        ExtendedProfileBadgeBarV3 extendedProfileBadgeBarV3 = (ExtendedProfileBadgeBarV3) other;
        return L.f(this.badges, extendedProfileBadgeBarV3.badges) && L.f(this.widgetName, extendedProfileBadgeBarV3.widgetName) && L.f(this.view, extendedProfileBadgeBarV3.view);
    }

    @l
    public final List<AdvertBadge> getBadges() {
        return this.badges;
    }

    @l
    public final BadgeBarView getView() {
        return this.view;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        List<AdvertBadge> list = this.badges;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.widgetName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BadgeBarView badgeBarView = this.view;
        return iHashCode2 + (badgeBarView != null ? badgeBarView.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfileBadgeBarV3(badges=" + this.badges + ", widgetName=" + this.widgetName + ", view=" + this.view + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<AdvertBadge> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.widgetName);
        BadgeBarView badgeBarView = this.view;
        if (badgeBarView == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeBarView.writeToParcel(parcel, flags);
        }
    }
}
