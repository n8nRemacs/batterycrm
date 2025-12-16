package com.avito.android.profile.user_profile.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.service_booking.ActiveServiceBookingsDto;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Sharing;
import com.avito.android.remote.model.notification.NotificationsCount;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: UserProfileState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "Data", "VisibleData", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserProfileState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Data f226449b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final VisibleData f226450c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f226451d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f226452e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f226453f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f226454g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f226447h = new a(null);

    @k
    public static final Parcelable.Creator<UserProfileState> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final UserProfileState f226448i = new UserProfileState(null, null, false, null, false, false);

    /* compiled from: UserProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserProfileState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserProfileState> {
        @Override // android.os.Parcelable.Creator
        public final UserProfileState createFromParcel(Parcel parcel) {
            return new UserProfileState(parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VisibleData.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfileState[] newArray(int i12) {
            return new UserProfileState[i12];
        }
    }

    public UserProfileState(@l Data data, @l VisibleData visibleData, boolean z12, @l Throwable th2, boolean z13, boolean z14) {
        this.f226449b = data;
        this.f226450c = visibleData;
        this.f226451d = z12;
        this.f226452e = th2;
        this.f226453f = z13;
        this.f226454g = z14;
    }

    public static UserProfileState a(UserProfileState userProfileState, Data data, VisibleData visibleData, boolean z12, Throwable th2, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            data = userProfileState.f226449b;
        }
        Data data2 = data;
        if ((i12 & 2) != 0) {
            visibleData = userProfileState.f226450c;
        }
        VisibleData visibleData2 = visibleData;
        if ((i12 & 4) != 0) {
            z12 = userProfileState.f226451d;
        }
        boolean z14 = z12;
        if ((i12 & 8) != 0) {
            th2 = userProfileState.f226452e;
        }
        Throwable th3 = th2;
        boolean z15 = (i12 & 16) != 0 ? userProfileState.f226453f : true;
        if ((i12 & 32) != 0) {
            z13 = userProfileState.f226454g;
        }
        userProfileState.getClass();
        return new UserProfileState(data2, visibleData2, z14, th3, z15, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileState)) {
            return false;
        }
        UserProfileState userProfileState = (UserProfileState) obj;
        return L.f(this.f226449b, userProfileState.f226449b) && L.f(this.f226450c, userProfileState.f226450c) && this.f226451d == userProfileState.f226451d && L.f(this.f226452e, userProfileState.f226452e) && this.f226453f == userProfileState.f226453f && this.f226454g == userProfileState.f226454g;
    }

    public final int hashCode() {
        Data data = this.f226449b;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        VisibleData visibleData = this.f226450c;
        int i12 = r.i((iHashCode + (visibleData == null ? 0 : visibleData.hashCode())) * 31, 31, this.f226451d);
        Throwable th2 = this.f226452e;
        return Boolean.hashCode(this.f226454g) + r.i((i12 + (th2 != null ? th2.hashCode() : 0)) * 31, 31, this.f226453f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserProfileState(data=");
        sb2.append(this.f226449b);
        sb2.append(", visibleData=");
        sb2.append(this.f226450c);
        sb2.append(", isLoading=");
        sb2.append(this.f226451d);
        sb2.append(", loadingError=");
        sb2.append(this.f226452e);
        sb2.append(", unauthorizedError=");
        sb2.append(this.f226453f);
        sb2.append(", isLogoutInProgress=");
        return r.x(sb2, this.f226454g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Data data = this.f226449b;
        if (data == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            data.writeToParcel(parcel, i12);
        }
        VisibleData visibleData = this.f226450c;
        if (visibleData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            visibleData.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f226451d ? 1 : 0);
        parcel.writeSerializable(this.f226452e);
        parcel.writeInt(this.f226453f ? 1 : 0);
        parcel.writeInt(this.f226454g ? 1 : 0);
    }

    /* compiled from: UserProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$VisibleData;", "Landroid/os/Parcelable;", "HeaderState", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class VisibleData implements Parcelable {

        @k
        public static final Parcelable.Creator<VisibleData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CardItem.SilentUpdateItem f226464b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final HeaderState f226465c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<CardItem> f226466d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AvatarShape f226467e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Map<String, String> f226468f;

        /* compiled from: UserProfileState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VisibleData> {
            @Override // android.os.Parcelable.Creator
            public final VisibleData createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap = null;
                CardItem.SilentUpdateItem silentUpdateItemCreateFromParcel = parcel.readInt() == 0 ? null : CardItem.SilentUpdateItem.CREATOR.createFromParcel(parcel);
                HeaderState headerStateCreateFromParcel = HeaderState.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iA2 = 0;
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(VisibleData.class, parcel, arrayList, iL2, 1);
                }
                AvatarShape avatarShapeValueOf = parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i13);
                    while (iA2 != i13) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                }
                return new VisibleData(silentUpdateItemCreateFromParcel, headerStateCreateFromParcel, arrayList, avatarShapeValueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final VisibleData[] newArray(int i12) {
                return new VisibleData[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VisibleData(@l CardItem.SilentUpdateItem silentUpdateItem, @k HeaderState headerState, @k List<? extends CardItem> list, @l AvatarShape avatarShape, @l Map<String, String> map) {
            this.f226464b = silentUpdateItem;
            this.f226465c = headerState;
            this.f226466d = list;
            this.f226467e = avatarShape;
            this.f226468f = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static VisibleData a(VisibleData visibleData, HeaderState headerState, ArrayList arrayList, int i12) {
            CardItem.SilentUpdateItem silentUpdateItem = (i12 & 1) != 0 ? visibleData.f226464b : null;
            if ((i12 & 2) != 0) {
                headerState = visibleData.f226465c;
            }
            HeaderState headerState2 = headerState;
            List list = arrayList;
            if ((i12 & 4) != 0) {
                list = visibleData.f226466d;
            }
            AvatarShape avatarShape = visibleData.f226467e;
            Map<String, String> map = visibleData.f226468f;
            visibleData.getClass();
            return new VisibleData(silentUpdateItem, headerState2, list, avatarShape, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VisibleData)) {
                return false;
            }
            VisibleData visibleData = (VisibleData) obj;
            return L.f(this.f226464b, visibleData.f226464b) && L.f(this.f226465c, visibleData.f226465c) && L.f(this.f226466d, visibleData.f226466d) && this.f226467e == visibleData.f226467e && L.f(this.f226468f, visibleData.f226468f);
        }

        public final int hashCode() {
            CardItem.SilentUpdateItem silentUpdateItem = this.f226464b;
            int iE2 = H.e((this.f226465c.hashCode() + ((silentUpdateItem == null ? 0 : silentUpdateItem.hashCode()) * 31)) * 31, 31, this.f226466d);
            AvatarShape avatarShape = this.f226467e;
            int iHashCode = (iE2 + (avatarShape == null ? 0 : avatarShape.hashCode())) * 31;
            Map<String, String> map = this.f226468f;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VisibleData(silentUpdate=");
            sb2.append(this.f226464b);
            sb2.append(", headerState=");
            sb2.append(this.f226465c);
            sb2.append(", items=");
            sb2.append(this.f226466d);
            sb2.append(", avatarShapeType=");
            sb2.append(this.f226467e);
            sb2.append(", analytics=");
            return r.w(sb2, this.f226468f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            CardItem.SilentUpdateItem silentUpdateItem = this.f226464b;
            if (silentUpdateItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                silentUpdateItem.writeToParcel(parcel, i12);
            }
            this.f226465c.writeToParcel(parcel, i12);
            Iterator itJ = C0.j(this.f226466d, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            AvatarShape avatarShape = this.f226467e;
            if (avatarShape == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(avatarShape.name());
            }
            Map<String, String> map = this.f226468f;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        /* compiled from: UserProfileState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$VisibleData$HeaderState;", "Landroid/os/Parcelable;", "NotificationsState", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class HeaderState implements Parcelable {

            @k
            public static final Parcelable.Creator<HeaderState> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f226469b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<Action> f226470c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<ActionMenu> f226471d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Sharing f226472e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final NotificationsState f226473f;

            /* compiled from: UserProfileState.kt */
            @d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$VisibleData$HeaderState$NotificationsState;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class NotificationsState implements Parcelable {

                @k
                public static final Parcelable.Creator<NotificationsState> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final int f226474b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final NotificationsCount f226475c;

                /* compiled from: UserProfileState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<NotificationsState> {
                    @Override // android.os.Parcelable.Creator
                    public final NotificationsState createFromParcel(Parcel parcel) {
                        return new NotificationsState(parcel.readInt(), (NotificationsCount) parcel.readParcelable(NotificationsState.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final NotificationsState[] newArray(int i12) {
                        return new NotificationsState[i12];
                    }
                }

                public NotificationsState(int i12, @k NotificationsCount notificationsCount) {
                    this.f226474b = i12;
                    this.f226475c = notificationsCount;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NotificationsState)) {
                        return false;
                    }
                    NotificationsState notificationsState = (NotificationsState) obj;
                    return this.f226474b == notificationsState.f226474b && L.f(this.f226475c, notificationsState.f226475c);
                }

                public final int hashCode() {
                    return this.f226475c.hashCode() + (Integer.hashCode(this.f226474b) * 31);
                }

                @k
                public final String toString() {
                    return "NotificationsState(itemId=" + this.f226474b + ", count=" + this.f226475c + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeInt(this.f226474b);
                    parcel.writeParcelable(this.f226475c, i12);
                }
            }

            /* compiled from: UserProfileState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<HeaderState> {
                @Override // android.os.Parcelable.Creator
                public final HeaderState createFromParcel(Parcel parcel) {
                    int iL2 = 0;
                    boolean z12 = parcel.readInt() != 0;
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL3 = 0;
                    while (iL3 != i12) {
                        iL3 = com.avito.android.actions_sheet.a.l(HeaderState.class, parcel, arrayList, iL3, 1);
                    }
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(HeaderState.class, parcel, arrayList2, iL2, 1);
                    }
                    return new HeaderState(z12, arrayList, arrayList2, (Sharing) parcel.readParcelable(HeaderState.class.getClassLoader()), parcel.readInt() == 0 ? null : NotificationsState.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final HeaderState[] newArray(int i12) {
                    return new HeaderState[i12];
                }
            }

            public HeaderState(boolean z12, @k List<Action> list, @k List<ActionMenu> list2, @l Sharing sharing, @l NotificationsState notificationsState) {
                this.f226469b = z12;
                this.f226470c = list;
                this.f226471d = list2;
                this.f226472e = sharing;
                this.f226473f = notificationsState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeaderState)) {
                    return false;
                }
                HeaderState headerState = (HeaderState) obj;
                return this.f226469b == headerState.f226469b && L.f(this.f226470c, headerState.f226470c) && L.f(this.f226471d, headerState.f226471d) && L.f(this.f226472e, headerState.f226472e) && L.f(this.f226473f, headerState.f226473f);
            }

            public final int hashCode() {
                int iE2 = H.e(H.e(Boolean.hashCode(this.f226469b) * 31, 31, this.f226470c), 31, this.f226471d);
                Sharing sharing = this.f226472e;
                int iHashCode = (iE2 + (sharing == null ? 0 : sharing.hashCode())) * 31;
                NotificationsState notificationsState = this.f226473f;
                return iHashCode + (notificationsState != null ? notificationsState.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "HeaderState(dataIsNotLoaded=" + this.f226469b + ", actions=" + this.f226470c + ", menuActions=" + this.f226471d + ", sharingModel=" + this.f226472e + ", notificationsState=" + this.f226473f + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f226469b ? 1 : 0);
                Iterator itJ = C0.j(this.f226470c, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
                Iterator itJ2 = C0.j(this.f226471d, parcel);
                while (itJ2.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ2.next(), i12);
                }
                parcel.writeParcelable(this.f226472e, i12);
                NotificationsState notificationsState = this.f226473f;
                if (notificationsState == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    notificationsState.writeToParcel(parcel, i12);
                }
            }

            public HeaderState(boolean z12, List list, List list2, Sharing sharing, NotificationsState notificationsState, int i12, C42822w c42822w) {
                this(z12, list, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? null : sharing, (i12 & 16) != 0 ? null : notificationsState);
            }
        }

        public /* synthetic */ VisibleData(CardItem.SilentUpdateItem silentUpdateItem, HeaderState headerState, List list, AvatarShape avatarShape, Map map, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : silentUpdateItem, headerState, list, avatarShape, (i12 & 16) != 0 ? null : map);
        }
    }

    /* compiled from: UserProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$Data;", "Landroid/os/Parcelable;", "ServiceBookingState", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Data implements Parcelable {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CardItem.SilentUpdateItem f226455b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UserProfileResult f226456c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<CardItem.PromoBlockItem> f226457d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final OrdersNeedActionResponse f226458e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AvitoFinanceResponse f226459f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final CardItem f226460g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final ServiceBookingState f226461h;

        /* compiled from: UserProfileState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState$Data$ServiceBookingState;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServiceBookingState implements Parcelable {

            @k
            public static final Parcelable.Creator<ServiceBookingState> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final ActiveServiceBookingsDto f226462b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f226463c;

            /* compiled from: UserProfileState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ServiceBookingState> {
                @Override // android.os.Parcelable.Creator
                public final ServiceBookingState createFromParcel(Parcel parcel) {
                    return new ServiceBookingState(parcel.readInt() == 0 ? null : ActiveServiceBookingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ServiceBookingState[] newArray(int i12) {
                    return new ServiceBookingState[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ServiceBookingState() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServiceBookingState)) {
                    return false;
                }
                ServiceBookingState serviceBookingState = (ServiceBookingState) obj;
                return L.f(this.f226462b, serviceBookingState.f226462b) && this.f226463c == serviceBookingState.f226463c;
            }

            public final int hashCode() {
                ActiveServiceBookingsDto activeServiceBookingsDto = this.f226462b;
                return Boolean.hashCode(this.f226463c) + ((activeServiceBookingsDto == null ? 0 : activeServiceBookingsDto.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ServiceBookingState(activeBookingsInfo=");
                sb2.append(this.f226462b);
                sb2.append(", error=");
                return r.x(sb2, this.f226463c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                ActiveServiceBookingsDto activeServiceBookingsDto = this.f226462b;
                if (activeServiceBookingsDto == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    activeServiceBookingsDto.writeToParcel(parcel, i12);
                }
                parcel.writeInt(this.f226463c ? 1 : 0);
            }

            public ServiceBookingState(@l ActiveServiceBookingsDto activeServiceBookingsDto, boolean z12) {
                this.f226462b = activeServiceBookingsDto;
                this.f226463c = z12;
            }

            public /* synthetic */ ServiceBookingState(ActiveServiceBookingsDto activeServiceBookingsDto, boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : activeServiceBookingsDto, (i12 & 2) != 0 ? false : z12);
            }
        }

        /* compiled from: UserProfileState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                CardItem.SilentUpdateItem silentUpdateItemCreateFromParcel = parcel.readInt() == 0 ? null : CardItem.SilentUpdateItem.CREATOR.createFromParcel(parcel);
                UserProfileResult userProfileResult = (UserProfileResult) parcel.readParcelable(Data.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CardItem.PromoBlockItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Data(silentUpdateItemCreateFromParcel, userProfileResult, arrayList, (OrdersNeedActionResponse) parcel.readParcelable(Data.class.getClassLoader()), (AvitoFinanceResponse) parcel.readParcelable(Data.class.getClassLoader()), (CardItem) parcel.readParcelable(Data.class.getClassLoader()), parcel.readInt() != 0 ? ServiceBookingState.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@l CardItem.SilentUpdateItem silentUpdateItem, @l UserProfileResult userProfileResult, @k List<CardItem.PromoBlockItem> list, @l OrdersNeedActionResponse ordersNeedActionResponse, @l AvitoFinanceResponse avitoFinanceResponse, @l CardItem cardItem, @l ServiceBookingState serviceBookingState) {
            this.f226455b = silentUpdateItem;
            this.f226456c = userProfileResult;
            this.f226457d = list;
            this.f226458e = ordersNeedActionResponse;
            this.f226459f = avitoFinanceResponse;
            this.f226460g = cardItem;
            this.f226461h = serviceBookingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Data a(Data data, UserProfileResult userProfileResult, ArrayList arrayList, OrdersNeedActionResponse ordersNeedActionResponse, AvitoFinanceResponse avitoFinanceResponse, ServiceBookingState serviceBookingState, int i12) {
            CardItem.SilentUpdateItem silentUpdateItem = (i12 & 1) != 0 ? data.f226455b : null;
            UserProfileResult userProfileResult2 = (i12 & 2) != 0 ? data.f226456c : userProfileResult;
            List list = (i12 & 4) != 0 ? data.f226457d : arrayList;
            OrdersNeedActionResponse ordersNeedActionResponse2 = (i12 & 8) != 0 ? data.f226458e : ordersNeedActionResponse;
            AvitoFinanceResponse avitoFinanceResponse2 = (i12 & 16) != 0 ? data.f226459f : avitoFinanceResponse;
            CardItem cardItem = (i12 & 32) != 0 ? data.f226460g : null;
            ServiceBookingState serviceBookingState2 = (i12 & 64) != 0 ? data.f226461h : serviceBookingState;
            data.getClass();
            return new Data(silentUpdateItem, userProfileResult2, list, ordersNeedActionResponse2, avitoFinanceResponse2, cardItem, serviceBookingState2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return L.f(this.f226455b, data.f226455b) && L.f(this.f226456c, data.f226456c) && L.f(this.f226457d, data.f226457d) && L.f(this.f226458e, data.f226458e) && L.f(this.f226459f, data.f226459f) && L.f(this.f226460g, data.f226460g) && L.f(this.f226461h, data.f226461h);
        }

        public final int hashCode() {
            CardItem.SilentUpdateItem silentUpdateItem = this.f226455b;
            int iHashCode = (silentUpdateItem == null ? 0 : silentUpdateItem.hashCode()) * 31;
            UserProfileResult userProfileResult = this.f226456c;
            int iE2 = H.e((iHashCode + (userProfileResult == null ? 0 : userProfileResult.hashCode())) * 31, 31, this.f226457d);
            OrdersNeedActionResponse ordersNeedActionResponse = this.f226458e;
            int iHashCode2 = (iE2 + (ordersNeedActionResponse == null ? 0 : ordersNeedActionResponse.hashCode())) * 31;
            AvitoFinanceResponse avitoFinanceResponse = this.f226459f;
            int iHashCode3 = (iHashCode2 + (avitoFinanceResponse == null ? 0 : avitoFinanceResponse.hashCode())) * 31;
            CardItem cardItem = this.f226460g;
            int iHashCode4 = (iHashCode3 + (cardItem == null ? 0 : cardItem.hashCode())) * 31;
            ServiceBookingState serviceBookingState = this.f226461h;
            return iHashCode4 + (serviceBookingState != null ? serviceBookingState.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Data(silentUpdate=" + this.f226455b + ", userProfile=" + this.f226456c + ", promoBlocks=" + this.f226457d + ", activeOrdersWidgetItem=" + this.f226458e + ", avitoFinanceWidgetItem=" + this.f226459f + ", avitoFinanceDynamicItem=" + this.f226460g + ", serviceBookingState=" + this.f226461h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            CardItem.SilentUpdateItem silentUpdateItem = this.f226455b;
            if (silentUpdateItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                silentUpdateItem.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f226456c, i12);
            Iterator itJ = C0.j(this.f226457d, parcel);
            while (itJ.hasNext()) {
                ((CardItem.PromoBlockItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f226458e, i12);
            parcel.writeParcelable(this.f226459f, i12);
            parcel.writeParcelable(this.f226460g, i12);
            ServiceBookingState serviceBookingState = this.f226461h;
            if (serviceBookingState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                serviceBookingState.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Data(CardItem.SilentUpdateItem silentUpdateItem, UserProfileResult userProfileResult, List list, OrdersNeedActionResponse ordersNeedActionResponse, AvitoFinanceResponse avitoFinanceResponse, CardItem cardItem, ServiceBookingState serviceBookingState, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : silentUpdateItem, userProfileResult, list, ordersNeedActionResponse, avitoFinanceResponse, cardItem, serviceBookingState);
        }
    }
}
