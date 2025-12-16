package com.avito.android.remote.model.user_profile;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Sharing;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.user_profile.items.InfoItem;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserProfileResult.kt */
@d
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00019BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jd\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u0018R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/user_profile/UserProfileResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "items", "Lcom/avito/android/remote/model/Action;", "actions", "Lcom/avito/android/remote/model/Sharing;", "sharing", "", "", "analytics", "Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;", "uxFeedback", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Sharing;Ljava/util/Map;Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/avito/android/remote/model/Sharing;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Sharing;Ljava/util/Map;Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;)Lcom/avito/android/remote/model/user_profile/UserProfileResult;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "getActions", "Lcom/avito/android/remote/model/Sharing;", "getSharing", "Ljava/util/Map;", "getAnalytics", "Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;", "getUxFeedback", "Lcom/avito/android/remote/model/user_profile/items/InfoItem;", "getInfo", "()Lcom/avito/android/remote/model/user_profile/items/InfoItem;", RequestReviewResultKt.INFO_TYPE, "UxFeedback", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserProfileResult implements Parcelable {

    @k
    public static final Parcelable.Creator<UserProfileResult> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("analytics")
    @l
    private final Map<String, String> analytics;

    @c("elements")
    @l
    private final List<UserProfileItem> items;

    @c("sharing")
    @l
    private final Sharing sharing;

    @c("uxFeedback")
    @l
    private final UxFeedback uxFeedback;

    /* compiled from: UserProfileResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserProfileResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserProfileResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap;
            int iA2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(UserProfileResult.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = a.l(UserProfileResult.class, parcel, arrayList4, iL3, 1);
                }
                arrayList2 = arrayList4;
            }
            Sharing sharing = (Sharing) parcel.readParcelable(UserProfileResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UserProfileResult(arrayList, arrayList2, sharing, linkedHashMap, parcel.readInt() != 0 ? UxFeedback.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserProfileResult[] newArray(int i12) {
            return new UserProfileResult[i12];
        }
    }

    /* compiled from: UserProfileResult.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;", "Landroid/os/Parcelable;", "", "isAvitoProControlGroup", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/user_profile/UserProfileResult$UxFeedback;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UxFeedback implements Parcelable {

        @k
        public static final Parcelable.Creator<UxFeedback> CREATOR = new Creator();

        @c("is_avito_pro_control_group")
        @l
        private final Boolean isAvitoProControlGroup;

        /* compiled from: UserProfileResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UxFeedback> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UxFeedback createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new UxFeedback(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UxFeedback[] newArray(int i12) {
                return new UxFeedback[i12];
            }
        }

        public UxFeedback(@l Boolean bool) {
            this.isAvitoProControlGroup = bool;
        }

        public static /* synthetic */ UxFeedback copy$default(UxFeedback uxFeedback, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = uxFeedback.isAvitoProControlGroup;
            }
            return uxFeedback.copy(bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getIsAvitoProControlGroup() {
            return this.isAvitoProControlGroup;
        }

        @k
        public final UxFeedback copy(@l Boolean isAvitoProControlGroup) {
            return new UxFeedback(isAvitoProControlGroup);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UxFeedback) && L.f(this.isAvitoProControlGroup, ((UxFeedback) other).isAvitoProControlGroup);
        }

        public int hashCode() {
            Boolean bool = this.isAvitoProControlGroup;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @l
        public final Boolean isAvitoProControlGroup() {
            return this.isAvitoProControlGroup;
        }

        @k
        public String toString() {
            return C0.g(new StringBuilder("UxFeedback(isAvitoProControlGroup="), this.isAvitoProControlGroup, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.isAvitoProControlGroup;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileResult(@l List<? extends UserProfileItem> list, @l List<Action> list2, @l Sharing sharing, @l Map<String, String> map, @l UxFeedback uxFeedback) {
        this.items = list;
        this.actions = list2;
        this.sharing = sharing;
        this.analytics = map;
        this.uxFeedback = uxFeedback;
    }

    public static /* synthetic */ UserProfileResult copy$default(UserProfileResult userProfileResult, List list, List list2, Sharing sharing, Map map, UxFeedback uxFeedback, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = userProfileResult.items;
        }
        if ((i12 & 2) != 0) {
            list2 = userProfileResult.actions;
        }
        List list3 = list2;
        if ((i12 & 4) != 0) {
            sharing = userProfileResult.sharing;
        }
        Sharing sharing2 = sharing;
        if ((i12 & 8) != 0) {
            map = userProfileResult.analytics;
        }
        Map map2 = map;
        if ((i12 & 16) != 0) {
            uxFeedback = userProfileResult.uxFeedback;
        }
        return userProfileResult.copy(list, list3, sharing2, map2, uxFeedback);
    }

    @l
    public final List<UserProfileItem> component1() {
        return this.items;
    }

    @l
    public final List<Action> component2() {
        return this.actions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Sharing getSharing() {
        return this.sharing;
    }

    @l
    public final Map<String, String> component4() {
        return this.analytics;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UxFeedback getUxFeedback() {
        return this.uxFeedback;
    }

    @k
    public final UserProfileResult copy(@l List<? extends UserProfileItem> items, @l List<Action> actions, @l Sharing sharing, @l Map<String, String> analytics, @l UxFeedback uxFeedback) {
        return new UserProfileResult(items, actions, sharing, analytics, uxFeedback);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileResult)) {
            return false;
        }
        UserProfileResult userProfileResult = (UserProfileResult) other;
        return L.f(this.items, userProfileResult.items) && L.f(this.actions, userProfileResult.actions) && L.f(this.sharing, userProfileResult.sharing) && L.f(this.analytics, userProfileResult.analytics) && L.f(this.uxFeedback, userProfileResult.uxFeedback);
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final Map<String, String> getAnalytics() {
        return this.analytics;
    }

    @l
    public final InfoItem getInfo() {
        UserProfileItem userProfileItem;
        Object next;
        List<UserProfileItem> list = this.items;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((UserProfileItem) next) instanceof InfoItem) {
                    break;
                }
            }
            userProfileItem = (UserProfileItem) next;
        } else {
            userProfileItem = null;
        }
        if (userProfileItem instanceof InfoItem) {
            return (InfoItem) userProfileItem;
        }
        return null;
    }

    @l
    public final List<UserProfileItem> getItems() {
        return this.items;
    }

    @l
    public final Sharing getSharing() {
        return this.sharing;
    }

    @l
    public final UxFeedback getUxFeedback() {
        return this.uxFeedback;
    }

    public int hashCode() {
        List<UserProfileItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Action> list2 = this.actions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Sharing sharing = this.sharing;
        int iHashCode3 = (iHashCode2 + (sharing == null ? 0 : sharing.hashCode())) * 31;
        Map<String, String> map = this.analytics;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        UxFeedback uxFeedback = this.uxFeedback;
        return iHashCode4 + (uxFeedback != null ? uxFeedback.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UserProfileResult(items=" + this.items + ", actions=" + this.actions + ", sharing=" + this.sharing + ", analytics=" + this.analytics + ", uxFeedback=" + this.uxFeedback + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<UserProfileItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<Action> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeParcelable(this.sharing, flags);
        Map<String, String> map = this.analytics;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        UxFeedback uxFeedback = this.uxFeedback;
        if (uxFeedback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxFeedback.writeToParcel(parcel, flags);
        }
    }
}
