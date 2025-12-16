package com.avito.android.serp.adapter.witcher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: WitcherItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WitcherItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "Lqs0/a;", "Action", "AnalyticsMode", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WitcherItem implements PersistableSerpItem, is0.h, FavoriteListItem, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<WitcherItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f273811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273812c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f273813d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final WitcherSelectionType f273814e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f273815f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f273816g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f273817h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Action f273818i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f273819j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<WidgetIndents> f273820k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final AnalyticsMode f273821l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final SerpDisplayType f273822m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Analytics f273823n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Settings f273824o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final h.b f273825p;

    /* renamed from: q, reason: collision with root package name */
    public final long f273826q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f273827r;

    /* compiled from: WitcherItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WitcherItem$Action;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f273828b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f273829c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f273830d;

        /* compiled from: WitcherItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l String str2) {
            this.f273828b = str;
            this.f273829c = deepLink;
            this.f273830d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return kotlin.jvm.internal.L.f(this.f273828b, action.f273828b) && kotlin.jvm.internal.L.f(this.f273829c, action.f273829c) && kotlin.jvm.internal.L.f(this.f273830d, action.f273830d);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f273829c, this.f273828b.hashCode() * 31, 31);
            String str = this.f273830d;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f273828b);
            sb2.append(", deepLink=");
            sb2.append(this.f273829c);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f273830d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f273828b);
            parcel.writeParcelable(this.f273829c, i12);
            parcel.writeString(this.f273830d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WitcherItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WitcherItem$AnalyticsMode;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnalyticsMode {

        /* renamed from: b, reason: collision with root package name */
        public static final AnalyticsMode f273831b;

        /* renamed from: c, reason: collision with root package name */
        public static final AnalyticsMode f273832c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AnalyticsMode[] f273833d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f273834e;

        static {
            AnalyticsMode analyticsMode = new AnalyticsMode("FEATURED_WIDGET", 0);
            f273831b = analyticsMode;
            AnalyticsMode analyticsMode2 = new AnalyticsMode("DEFAULT", 1);
            f273832c = analyticsMode2;
            AnalyticsMode[] analyticsModeArr = {analyticsMode, analyticsMode2};
            f273833d = analyticsModeArr;
            f273834e = kotlin.enums.c.a(analyticsModeArr);
        }

        public AnalyticsMode() {
            throw null;
        }

        public static AnalyticsMode valueOf(String str) {
            return (AnalyticsMode) Enum.valueOf(AnalyticsMode.class, str);
        }

        public static AnalyticsMode[] values() {
            return (AnalyticsMode[]) f273833d.clone();
        }
    }

    /* compiled from: WitcherItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WitcherItem$a;", "", "<init>", "()V", "", "FEATURED_WIDGET", "Ljava/lang/String;", "SEEN_ITEMS_WIDGET", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final WitcherItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            WitcherSelectionType witcherSelectionTypeValueOf = WitcherSelectionType.valueOf(parcel.readString());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(WitcherItem.class, parcel, arrayList2, iL2, 1);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(WidgetIndents.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new WitcherItem(string, i12, z12, witcherSelectionTypeValueOf, arrayList2, string2, string3, actionCreateFromParcel, z13, arrayList, AnalyticsMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString()), (Analytics) parcel.readParcelable(WitcherItem.class.getClassLoader()), (Settings) parcel.readParcelable(WitcherItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WitcherItem[] newArray(int i12) {
            return new WitcherItem[i12];
        }
    }

    /* compiled from: WitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[AnalyticsMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnalyticsMode analyticsMode = AnalyticsMode.f273831b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WitcherItem(@Y61.k String str, int i12, boolean z12, @Y61.k WitcherSelectionType witcherSelectionType, @Y61.k List<? extends PersistableSerpItem> list, @Y61.k String str2, @Y61.l String str3, @Y61.l Action action, boolean z13, @Y61.l List<WidgetIndents> list2, @Y61.k AnalyticsMode analyticsMode, @Y61.l SerpDisplayType serpDisplayType, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        String str4;
        this.f273811b = str;
        this.f273812c = i12;
        this.f273813d = z12;
        this.f273814e = witcherSelectionType;
        this.f273815f = list;
        this.f273816g = str2;
        this.f273817h = str3;
        this.f273818i = action;
        this.f273819j = z13;
        this.f273820k = list2;
        this.f273821l = analyticsMode;
        this.f273822m = serpDisplayType;
        this.f273823n = analytics;
        this.f273824o = settings;
        int iOrdinal = analyticsMode.ordinal();
        if (iOrdinal == 0) {
            str4 = "featured";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = "seen_items";
        }
        this.f273825p = new h.b(str4, str2, null, null, null, analytics, 28, null);
        this.f273826q = a.C10492a.a(this);
        this.f273827r = SerpViewType.f268585e;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WitcherItem)) {
            return false;
        }
        WitcherItem witcherItem = (WitcherItem) obj;
        if (this.f273812c != witcherItem.f273812c || !kotlin.jvm.internal.L.f(this.f273816g, witcherItem.f273816g) || !kotlin.jvm.internal.L.f(this.f273817h, witcherItem.f273817h) || this.f273815f.size() != witcherItem.f273815f.size()) {
            return false;
        }
        Action action = this.f273818i;
        String str = action != null ? action.f273828b : null;
        Action action2 = witcherItem.f273818i;
        return kotlin.jvm.internal.L.f(str, action2 != null ? action2.f273828b : null) && this.f273814e == witcherItem.f273814e && this.f273822m == witcherItem.f273822m;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272893o() {
        return this.f273824o;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83914b() {
        return this.f273812c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265384b() {
        return this.f273811b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF83932t() {
        return this.f273826q;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83931s() {
        return this.f273827r;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(Integer.hashCode(this.f273812c) * 31, 31, this.f273816g);
        String str = this.f273817h;
        int size = (this.f273815f.size() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        Action action = this.f273818i;
        String str2 = action != null ? action.f273828b : null;
        int iHashCode = (this.f273814e.hashCode() + ((size + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        SerpDisplayType serpDisplayType = this.f273822m;
        return iHashCode + (serpDisplayType != null ? serpDisplayType.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272895q() {
        return this.f273825p;
    }

    @Y61.k
    public final String toString() {
        return "WitcherItem(title=" + this.f273816g + ", subtitle=" + this.f273817h + ", items=" + this.f273815f + ", action=" + this.f273818i + ", selectionType=" + this.f273814e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f273811b);
        parcel.writeInt(this.f273812c);
        parcel.writeInt(this.f273813d ? 1 : 0);
        parcel.writeString(this.f273814e.name());
        Iterator itJ = C0.j(this.f273815f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f273816g);
        parcel.writeString(this.f273817h);
        Action action = this.f273818i;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f273819j ? 1 : 0);
        List<WidgetIndents> list = this.f273820k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((WidgetIndents) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.f273821l.name());
        SerpDisplayType serpDisplayType = this.f273822m;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeParcelable(this.f273823n, i12);
        parcel.writeParcelable(this.f273824o, i12);
    }

    public WitcherItem(String str, int i12, boolean z12, WitcherSelectionType witcherSelectionType, List list, String str2, String str3, Action action, boolean z13, List list2, AnalyticsMode analyticsMode, SerpDisplayType serpDisplayType, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? UUID.randomUUID().toString() : str, i12, (i13 & 4) != 0 ? false : z12, witcherSelectionType, (i13 & 16) != 0 ? C42784z0.f406748b : list, (i13 & 32) != 0 ? "" : str2, str3, (i13 & 128) != 0 ? null : action, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : list2, (i13 & 1024) != 0 ? AnalyticsMode.f273832c : analyticsMode, (i13 & 2048) != 0 ? null : serpDisplayType, analytics, settings);
    }
}
