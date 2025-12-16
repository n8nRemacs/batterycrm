package com.avito.android.favorite_sellers.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* compiled from: FavoriteSellersState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "SubscriptionMenuState", "UndoSnackbar", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FavoriteSellersState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f156037b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<FavoriteSellersItem> f156038c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f156039d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156040e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Throwable f156041f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f156042g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Q<Integer, FavoriteSellersItem>> f156043h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final SubscriptionMenuState f156044i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final UndoSnackbar f156045j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f156046k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final SubscribableItem f156047l;

    /* renamed from: m, reason: collision with root package name */
    public final int f156048m;

    /* renamed from: n, reason: collision with root package name */
    public final int f156049n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f156050o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f156051p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f156052q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f156035r = new a(null);

    @k
    public static final Parcelable.Creator<FavoriteSellersState> CREATOR = new b();

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final FavoriteSellersState f156036s = new FavoriteSellersState(null, null, false, false, null, false, null, null, null, false, null, 0, 0, false, false, false, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);

    /* compiled from: FavoriteSellersState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState$SubscriptionMenuState;", "Landroid/os/Parcelable;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscriptionMenuState implements Parcelable {

        @k
        public static final Parcelable.Creator<SubscriptionMenuState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SellerItem f156053b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f156054c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f156055d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f156056e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f156057f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f156058g;

        /* compiled from: FavoriteSellersState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SubscriptionMenuState> {
            @Override // android.os.Parcelable.Creator
            public final SubscriptionMenuState createFromParcel(Parcel parcel) {
                return new SubscriptionMenuState((SellerItem) parcel.readParcelable(SubscriptionMenuState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SubscriptionMenuState[] newArray(int i12) {
                return new SubscriptionMenuState[i12];
            }
        }

        public SubscriptionMenuState(@k SellerItem sellerItem, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f156053b = sellerItem;
            this.f156054c = z12;
            this.f156055d = z13;
            this.f156056e = z14;
            this.f156057f = z15;
            this.f156058g = z16;
        }

        public static SubscriptionMenuState a(SubscriptionMenuState subscriptionMenuState, boolean z12, boolean z13, boolean z14, int i12) {
            SellerItem sellerItem = subscriptionMenuState.f156053b;
            boolean z15 = subscriptionMenuState.f156054c;
            boolean z16 = subscriptionMenuState.f156055d;
            if ((i12 & 8) != 0) {
                z12 = subscriptionMenuState.f156056e;
            }
            boolean z17 = z12;
            if ((i12 & 16) != 0) {
                z13 = subscriptionMenuState.f156057f;
            }
            boolean z18 = z13;
            if ((i12 & 32) != 0) {
                z14 = subscriptionMenuState.f156058g;
            }
            subscriptionMenuState.getClass();
            return new SubscriptionMenuState(sellerItem, z15, z16, z17, z18, z14);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionMenuState)) {
                return false;
            }
            SubscriptionMenuState subscriptionMenuState = (SubscriptionMenuState) obj;
            return L.f(this.f156053b, subscriptionMenuState.f156053b) && this.f156054c == subscriptionMenuState.f156054c && this.f156055d == subscriptionMenuState.f156055d && this.f156056e == subscriptionMenuState.f156056e && this.f156057f == subscriptionMenuState.f156057f && this.f156058g == subscriptionMenuState.f156058g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156058g) + r.i(r.i(r.i(r.i(this.f156053b.hashCode() * 31, 31, this.f156054c), 31, this.f156055d), 31, this.f156056e), 31, this.f156057f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubscriptionMenuState(selectedSeller=");
            sb2.append(this.f156053b);
            sb2.append(", isSubscribed=");
            sb2.append(this.f156054c);
            sb2.append(", isEnabled=");
            sb2.append(this.f156055d);
            sb2.append(", isNotificationActivated=");
            sb2.append(this.f156056e);
            sb2.append(", isSubscriptionInProgress=");
            sb2.append(this.f156057f);
            sb2.append(", isNotificationInProgress=");
            return r.x(sb2, this.f156058g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f156053b, i12);
            parcel.writeInt(this.f156054c ? 1 : 0);
            parcel.writeInt(this.f156055d ? 1 : 0);
            parcel.writeInt(this.f156056e ? 1 : 0);
            parcel.writeInt(this.f156057f ? 1 : 0);
            parcel.writeInt(this.f156058g ? 1 : 0);
        }
    }

    /* compiled from: FavoriteSellersState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState$UndoSnackbar;", "Landroid/os/Parcelable;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UndoSnackbar implements Parcelable {

        @k
        public static final Parcelable.Creator<UndoSnackbar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f156059b;

        /* compiled from: FavoriteSellersState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UndoSnackbar> {
            @Override // android.os.Parcelable.Creator
            public final UndoSnackbar createFromParcel(Parcel parcel) {
                return new UndoSnackbar((SubscribableItem) parcel.readParcelable(UndoSnackbar.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UndoSnackbar[] newArray(int i12) {
                return new UndoSnackbar[i12];
            }
        }

        public UndoSnackbar(@k SubscribableItem subscribableItem) {
            this.f156059b = subscribableItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UndoSnackbar) && L.f(this.f156059b, ((UndoSnackbar) obj).f156059b);
        }

        public final int hashCode() {
            return this.f156059b.hashCode();
        }

        @k
        public final String toString() {
            return "UndoSnackbar(item=" + this.f156059b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f156059b, i12);
        }
    }

    /* compiled from: FavoriteSellersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState$a;", "", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FavoriteSellersState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FavoriteSellersState> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteSellersState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(FavoriteSellersState.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            Throwable th2 = (Throwable) parcel.readSerializable();
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(parcel.readSerializable());
            }
            return new FavoriteSellersState(string, arrayList, z12, z13, th2, z14, arrayList3, parcel.readInt() == 0 ? null : SubscriptionMenuState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UndoSnackbar.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (SubscribableItem) parcel.readParcelable(FavoriteSellersState.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteSellersState[] newArray(int i12) {
            return new FavoriteSellersState[i12];
        }
    }

    public FavoriteSellersState() {
        this(null, null, false, false, null, false, null, null, null, false, null, 0, 0, false, false, false, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public static FavoriteSellersState a(FavoriteSellersState favoriteSellersState, String str, List list, boolean z12, boolean z13, Throwable th2, List list2, SubscriptionMenuState subscriptionMenuState, UndoSnackbar undoSnackbar, boolean z14, SubscribableItem subscribableItem, int i12, boolean z15, boolean z16, boolean z17, int i13) {
        String str2 = (i13 & 1) != 0 ? favoriteSellersState.f156037b : str;
        List list3 = (i13 & 2) != 0 ? favoriteSellersState.f156038c : list;
        boolean z18 = (i13 & 4) != 0 ? favoriteSellersState.f156039d : z12;
        boolean z19 = (i13 & 8) != 0 ? favoriteSellersState.f156040e : z13;
        Throwable th3 = (i13 & 16) != 0 ? favoriteSellersState.f156041f : th2;
        boolean z22 = favoriteSellersState.f156042g;
        List list4 = (i13 & 64) != 0 ? favoriteSellersState.f156043h : list2;
        SubscriptionMenuState subscriptionMenuState2 = (i13 & 128) != 0 ? favoriteSellersState.f156044i : subscriptionMenuState;
        UndoSnackbar undoSnackbar2 = (i13 & 256) != 0 ? favoriteSellersState.f156045j : undoSnackbar;
        boolean z23 = (i13 & 512) != 0 ? favoriteSellersState.f156046k : z14;
        SubscribableItem subscribableItem2 = (i13 & 1024) != 0 ? favoriteSellersState.f156047l : subscribableItem;
        int i14 = (i13 & 2048) != 0 ? favoriteSellersState.f156048m : 1;
        int i15 = (i13 & 4096) != 0 ? favoriteSellersState.f156049n : i12;
        boolean z24 = (i13 & 8192) != 0 ? favoriteSellersState.f156050o : z15;
        boolean z25 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? favoriteSellersState.f156051p : z16;
        boolean z26 = (i13 & 32768) != 0 ? favoriteSellersState.f156052q : z17;
        favoriteSellersState.getClass();
        return new FavoriteSellersState(str2, list3, z18, z19, th3, z22, list4, subscriptionMenuState2, undoSnackbar2, z23, subscribableItem2, i14, i15, z24, z25, z26);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteSellersState)) {
            return false;
        }
        FavoriteSellersState favoriteSellersState = (FavoriteSellersState) obj;
        return L.f(this.f156037b, favoriteSellersState.f156037b) && L.f(this.f156038c, favoriteSellersState.f156038c) && this.f156039d == favoriteSellersState.f156039d && this.f156040e == favoriteSellersState.f156040e && L.f(this.f156041f, favoriteSellersState.f156041f) && this.f156042g == favoriteSellersState.f156042g && L.f(this.f156043h, favoriteSellersState.f156043h) && L.f(this.f156044i, favoriteSellersState.f156044i) && L.f(this.f156045j, favoriteSellersState.f156045j) && this.f156046k == favoriteSellersState.f156046k && L.f(this.f156047l, favoriteSellersState.f156047l) && this.f156048m == favoriteSellersState.f156048m && this.f156049n == favoriteSellersState.f156049n && this.f156050o == favoriteSellersState.f156050o && this.f156051p == favoriteSellersState.f156051p && this.f156052q == favoriteSellersState.f156052q;
    }

    public final int hashCode() {
        String str = this.f156037b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FavoriteSellersItem> list = this.f156038c;
        int i12 = r.i(r.i((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f156039d), 31, this.f156040e);
        Throwable th2 = this.f156041f;
        int iE2 = H.e(r.i((i12 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f156042g), 31, this.f156043h);
        SubscriptionMenuState subscriptionMenuState = this.f156044i;
        int iHashCode2 = (iE2 + (subscriptionMenuState == null ? 0 : subscriptionMenuState.hashCode())) * 31;
        UndoSnackbar undoSnackbar = this.f156045j;
        int i13 = r.i((iHashCode2 + (undoSnackbar == null ? 0 : undoSnackbar.f156059b.hashCode())) * 31, 31, this.f156046k);
        SubscribableItem subscribableItem = this.f156047l;
        return Boolean.hashCode(this.f156052q) + r.i(r.i(r.e(this.f156049n, r.e(this.f156048m, (i13 + (subscribableItem != null ? subscribableItem.hashCode() : 0)) * 31, 31), 31), 31, this.f156050o), 31, this.f156051p);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteSellersState(userId=");
        sb2.append(this.f156037b);
        sb2.append(", items=");
        sb2.append(this.f156038c);
        sb2.append(", dataLoading=");
        sb2.append(this.f156039d);
        sb2.append(", dataRefreshing=");
        sb2.append(this.f156040e);
        sb2.append(", loadingError=");
        sb2.append(this.f156041f);
        sb2.append(", subscriptionInProgress=");
        sb2.append(this.f156042g);
        sb2.append(", removedItems=");
        sb2.append(this.f156043h);
        sb2.append(", subscriptionMenuState=");
        sb2.append(this.f156044i);
        sb2.append(", undoSnackbar=");
        sb2.append(this.f156045j);
        sb2.append(", isFullScreenProgressVisible=");
        sb2.append(this.f156046k);
        sb2.append(", itemToResubscribe=");
        sb2.append(this.f156047l);
        sb2.append(", indexOfLastVisibleItem=");
        sb2.append(this.f156048m);
        sb2.append(", indexMarkedAsRead=");
        sb2.append(this.f156049n);
        sb2.append(", isSellersViewed=");
        sb2.append(this.f156050o);
        sb2.append(", withReload=");
        sb2.append(this.f156051p);
        sb2.append(", isScreenVisible=");
        return r.x(sb2, this.f156052q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156037b);
        List<FavoriteSellersItem> list = this.f156038c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f156039d ? 1 : 0);
        parcel.writeInt(this.f156040e ? 1 : 0);
        parcel.writeSerializable(this.f156041f);
        parcel.writeInt(this.f156042g ? 1 : 0);
        Iterator itJ = C0.j(this.f156043h, parcel);
        while (itJ.hasNext()) {
            parcel.writeSerializable((Serializable) itJ.next());
        }
        SubscriptionMenuState subscriptionMenuState = this.f156044i;
        if (subscriptionMenuState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscriptionMenuState.writeToParcel(parcel, i12);
        }
        UndoSnackbar undoSnackbar = this.f156045j;
        if (undoSnackbar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            undoSnackbar.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f156046k ? 1 : 0);
        parcel.writeParcelable(this.f156047l, i12);
        parcel.writeInt(this.f156048m);
        parcel.writeInt(this.f156049n);
        parcel.writeInt(this.f156050o ? 1 : 0);
        parcel.writeInt(this.f156051p ? 1 : 0);
        parcel.writeInt(this.f156052q ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSellersState(@l String str, @l List<? extends FavoriteSellersItem> list, boolean z12, boolean z13, @l Throwable th2, boolean z14, @k List<? extends Q<Integer, ? extends FavoriteSellersItem>> list2, @l SubscriptionMenuState subscriptionMenuState, @l UndoSnackbar undoSnackbar, boolean z15, @l SubscribableItem subscribableItem, int i12, int i13, boolean z16, boolean z17, boolean z18) {
        this.f156037b = str;
        this.f156038c = list;
        this.f156039d = z12;
        this.f156040e = z13;
        this.f156041f = th2;
        this.f156042g = z14;
        this.f156043h = list2;
        this.f156044i = subscriptionMenuState;
        this.f156045j = undoSnackbar;
        this.f156046k = z15;
        this.f156047l = subscribableItem;
        this.f156048m = i12;
        this.f156049n = i13;
        this.f156050o = z16;
        this.f156051p = z17;
        this.f156052q = z18;
    }

    public FavoriteSellersState(String str, List list, boolean z12, boolean z13, Throwable th2, boolean z14, List list2, SubscriptionMenuState subscriptionMenuState, UndoSnackbar undoSnackbar, boolean z15, SubscribableItem subscribableItem, int i12, int i13, boolean z16, boolean z17, boolean z18, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? false : z12, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? null : th2, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? C42784z0.f406748b : list2, (i14 & 128) != 0 ? null : subscriptionMenuState, (i14 & 256) != 0 ? null : undoSnackbar, (i14 & 512) != 0 ? false : z15, (i14 & 1024) == 0 ? subscribableItem : null, (i14 & 2048) != 0 ? 1 : i12, (i14 & 4096) != 0 ? 0 : i13, (i14 & 8192) != 0 ? false : z16, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z17, (i14 & 32768) != 0 ? false : z18);
    }
}
