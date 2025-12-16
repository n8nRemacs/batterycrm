package com.avito.android.advert_collection.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.OrderEntity;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "Actions", "a", "OrderState", "SocialInfo", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f81615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OrderState f81616c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f81617d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81618e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Actions f81619f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SocialInfo f81620g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f81613h = new a(null);

    @k
    public static final Parcelable.Creator<AdvertCollectionState> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final AdvertCollectionState f81614i = new AdvertCollectionState(C42784z0.f406748b, new OrderState(null, null, null, null, 15, null), "", false, new Actions(null, null, false, false, false, false, false), new SocialInfo(false, ""));

    /* compiled from: AdvertCollectionState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState$Actions;", "Landroid/os/Parcelable;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Actions implements Parcelable {

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f81621b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f81622c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f81623d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f81624e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f81625f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f81626g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f81627h;

        /* compiled from: AdvertCollectionState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Actions> {
            @Override // android.os.Parcelable.Creator
            public final Actions createFromParcel(Parcel parcel) {
                return new Actions((DeepLink) parcel.readParcelable(Actions.class.getClassLoader()), (DeepLink) parcel.readParcelable(Actions.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(@l DeepLink deepLink, @l DeepLink deepLink2, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f81621b = deepLink;
            this.f81622c = deepLink2;
            this.f81623d = z12;
            this.f81624e = z13;
            this.f81625f = z14;
            this.f81626g = z15;
            this.f81627h = z16;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return L.f(this.f81621b, actions.f81621b) && L.f(this.f81622c, actions.f81622c) && this.f81623d == actions.f81623d && this.f81624e == actions.f81624e && this.f81625f == actions.f81625f && this.f81626g == actions.f81626g && this.f81627h == actions.f81627h;
        }

        public final int hashCode() {
            DeepLink deepLink = this.f81621b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            DeepLink deepLink2 = this.f81622c;
            return Boolean.hashCode(this.f81627h) + r.i(r.i(r.i(r.i((iHashCode + (deepLink2 != null ? deepLink2.hashCode() : 0)) * 31, 31, this.f81623d), 31, this.f81624e), 31, this.f81625f), 31, this.f81626g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Actions(edit=");
            sb2.append(this.f81621b);
            sb2.append(", adding=");
            sb2.append(this.f81622c);
            sb2.append(", canDelete=");
            sb2.append(this.f81623d);
            sb2.append(", canShare=");
            sb2.append(this.f81624e);
            sb2.append(", canLike=");
            sb2.append(this.f81625f);
            sb2.append(", canPublish=");
            sb2.append(this.f81626g);
            sb2.append(", canUnpublish=");
            return r.x(sb2, this.f81627h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f81621b, i12);
            parcel.writeParcelable(this.f81622c, i12);
            parcel.writeInt(this.f81623d ? 1 : 0);
            parcel.writeInt(this.f81624e ? 1 : 0);
            parcel.writeInt(this.f81625f ? 1 : 0);
            parcel.writeInt(this.f81626g ? 1 : 0);
            parcel.writeInt(this.f81627h ? 1 : 0);
        }
    }

    /* compiled from: AdvertCollectionState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState$OrderState;", "Landroid/os/Parcelable;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class OrderState implements Parcelable {

        @k
        public static final Parcelable.Creator<OrderState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f81628b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f81629c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f81630d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<OrderEntity> f81631e;

        /* compiled from: AdvertCollectionState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OrderState> {
            @Override // android.os.Parcelable.Creator
            public final OrderState createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(OrderState.class, parcel, arrayList, iL2, 1);
                }
                return new OrderState(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OrderState[] newArray(int i12) {
                return new OrderState[i12];
            }
        }

        public OrderState() {
            this(null, null, null, null, 15, null);
        }

        @l
        public final OrderEntity c() {
            Object next;
            Iterator<T> it = this.f81631e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((OrderEntity) next).f156311b, this.f81629c)) {
                    break;
                }
            }
            return (OrderEntity) next;
        }

        @l
        public final OrderEntity d() {
            Object next;
            List<OrderEntity> list = this.f81631e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((OrderEntity) next).f156311b, this.f81630d)) {
                    break;
                }
            }
            OrderEntity orderEntity = (OrderEntity) next;
            return orderEntity == null ? (OrderEntity) C42745f0.G(list) : orderEntity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderState)) {
                return false;
            }
            OrderState orderState = (OrderState) obj;
            return L.f(this.f81628b, orderState.f81628b) && L.f(this.f81629c, orderState.f81629c) && L.f(this.f81630d, orderState.f81630d) && L.f(this.f81631e, orderState.f81631e);
        }

        public final int hashCode() {
            String str = this.f81628b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81629c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81630d;
            return this.f81631e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OrderState(queryParam=");
            sb2.append(this.f81628b);
            sb2.append(", currentOrderId=");
            sb2.append(this.f81629c);
            sb2.append(", defaultOrderId=");
            sb2.append(this.f81630d);
            sb2.append(", orders=");
            return H.p(sb2, this.f81631e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f81628b);
            parcel.writeString(this.f81629c);
            parcel.writeString(this.f81630d);
            Iterator itJ = C0.j(this.f81631e, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }

        public OrderState(@l String str, @l String str2, @l String str3, @k List<OrderEntity> list) {
            this.f81628b = str;
            this.f81629c = str2;
            this.f81630d = str3;
            this.f81631e = list;
        }

        public OrderState(String str, String str2, String str3, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: AdvertCollectionState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState$SocialInfo;", "Landroid/os/Parcelable;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SocialInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<SocialInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f81632b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81633c;

        /* compiled from: AdvertCollectionState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SocialInfo> {
            @Override // android.os.Parcelable.Creator
            public final SocialInfo createFromParcel(Parcel parcel) {
                return new SocialInfo(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialInfo[] newArray(int i12) {
                return new SocialInfo[i12];
            }
        }

        public SocialInfo(boolean z12, @k String str) {
            this.f81632b = z12;
            this.f81633c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialInfo)) {
                return false;
            }
            SocialInfo socialInfo = (SocialInfo) obj;
            return this.f81632b == socialInfo.f81632b && L.f(this.f81633c, socialInfo.f81633c);
        }

        public final int hashCode() {
            return this.f81633c.hashCode() + (Boolean.hashCode(this.f81632b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SocialInfo(isLiked=");
            sb2.append(this.f81632b);
            sb2.append(", likesCount=");
            return C22026a.c(sb2, this.f81633c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f81632b ? 1 : 0);
            parcel.writeString(this.f81633c);
        }
    }

    /* compiled from: AdvertCollectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState$a;", "", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertCollectionState> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertCollectionState.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertCollectionState(arrayList, OrderState.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, Actions.CREATOR.createFromParcel(parcel), SocialInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionState[] newArray(int i12) {
            return new AdvertCollectionState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertCollectionState(@k List<? extends ParcelableItem> list, @k OrderState orderState, @k String str, boolean z12, @k Actions actions, @k SocialInfo socialInfo) {
        this.f81615b = list;
        this.f81616c = orderState;
        this.f81617d = str;
        this.f81618e = z12;
        this.f81619f = actions;
        this.f81620g = socialInfo;
    }

    public static AdvertCollectionState a(AdvertCollectionState advertCollectionState, List list, OrderState orderState, String str, boolean z12, Actions actions, SocialInfo socialInfo, int i12) {
        if ((i12 & 1) != 0) {
            list = advertCollectionState.f81615b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            orderState = advertCollectionState.f81616c;
        }
        OrderState orderState2 = orderState;
        if ((i12 & 4) != 0) {
            str = advertCollectionState.f81617d;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z12 = advertCollectionState.f81618e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            actions = advertCollectionState.f81619f;
        }
        Actions actions2 = actions;
        if ((i12 & 32) != 0) {
            socialInfo = advertCollectionState.f81620g;
        }
        advertCollectionState.getClass();
        return new AdvertCollectionState(list2, orderState2, str2, z13, actions2, socialInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionState)) {
            return false;
        }
        AdvertCollectionState advertCollectionState = (AdvertCollectionState) obj;
        return L.f(this.f81615b, advertCollectionState.f81615b) && L.f(this.f81616c, advertCollectionState.f81616c) && L.f(this.f81617d, advertCollectionState.f81617d) && this.f81618e == advertCollectionState.f81618e && L.f(this.f81619f, advertCollectionState.f81619f) && L.f(this.f81620g, advertCollectionState.f81620g);
    }

    public final int hashCode() {
        return this.f81620g.hashCode() + ((this.f81619f.hashCode() + r.i(H.d((this.f81616c.hashCode() + (this.f81615b.hashCode() * 31)) * 31, 31, this.f81617d), 31, this.f81618e)) * 31);
    }

    @k
    public final String toString() {
        return "AdvertCollectionState(items=" + this.f81615b + ", orderState=" + this.f81616c + ", collectionName=" + this.f81617d + ", swipeToRefreshIsShown=" + this.f81618e + ", actions=" + this.f81619f + ", social=" + this.f81620g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f81615b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        this.f81616c.writeToParcel(parcel, i12);
        parcel.writeString(this.f81617d);
        parcel.writeInt(this.f81618e ? 1 : 0);
        this.f81619f.writeToParcel(parcel, i12);
        this.f81620g.writeToParcel(parcel, i12);
    }
}
