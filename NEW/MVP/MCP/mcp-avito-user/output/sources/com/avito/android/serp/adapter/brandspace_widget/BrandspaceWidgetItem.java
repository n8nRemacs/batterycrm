package com.avito.android.serp.adapter.brandspace_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
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
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: BrandspaceWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/BrandspaceWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lqs0/a;", "Lis0/h;", "Action", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrandspaceWidgetItem implements PersistableSerpItem, InterfaceC47435a, is0.h {

    @Y61.k
    public static final Parcelable.Creator<BrandspaceWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f269019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f269020c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f269021d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f269022e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f269023f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f269024g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Action f269025h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Action f269026i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f269027j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Analytics f269028k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Settings f269029l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h.b f269030m;

    /* renamed from: n, reason: collision with root package name */
    public final long f269031n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f269032o;

    /* compiled from: BrandspaceWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/BrandspaceWidgetItem$Action;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f269033b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f269034c;

        /* compiled from: BrandspaceWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@Y61.l String str, @Y61.l DeepLink deepLink) {
            this.f269033b = str;
            this.f269034c = deepLink;
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
            return L.f(this.f269033b, action.f269033b) && L.f(this.f269034c, action.f269034c);
        }

        public final int hashCode() {
            String str = this.f269033b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.f269034c;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f269033b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f269034c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f269033b);
            parcel.writeParcelable(this.f269034c, i12);
        }
    }

    /* compiled from: BrandspaceWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/BrandspaceWidgetItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BrandspaceWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BrandspaceWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final BrandspaceWidgetItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(BrandspaceWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            return new BrandspaceWidgetItem(string, i12, string2, string3, boolValueOf, arrayList, parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null, (UniversalImage) parcel.readParcelable(BrandspaceWidgetItem.class.getClassLoader()), (Analytics) parcel.readParcelable(BrandspaceWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(BrandspaceWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BrandspaceWidgetItem[] newArray(int i12) {
            return new BrandspaceWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrandspaceWidgetItem(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.k List<? extends PersistableSerpItem> list, @Y61.l Action action, @Y61.l Action action2, @Y61.l UniversalImage universalImage, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f269019b = str;
        this.f269020c = i12;
        this.f269021d = str2;
        this.f269022e = str3;
        this.f269023f = bool;
        this.f269024g = list;
        this.f269025h = action;
        this.f269026i = action2;
        this.f269027j = universalImage;
        this.f269028k = analytics;
        this.f269029l = settings;
        this.f269030m = new h.b("brandspaceWidget", null, null, null, null, analytics, 30, null);
        this.f269031n = a.C10492a.a(this);
        this.f269032o = SerpViewType.f268585e;
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
        if (!(obj instanceof BrandspaceWidgetItem)) {
            return false;
        }
        BrandspaceWidgetItem brandspaceWidgetItem = (BrandspaceWidgetItem) obj;
        return L.f(this.f269019b, brandspaceWidgetItem.f269019b) && this.f269020c == brandspaceWidgetItem.f269020c && L.f(this.f269021d, brandspaceWidgetItem.f269021d) && L.f(this.f269022e, brandspaceWidgetItem.f269022e) && L.f(this.f269023f, brandspaceWidgetItem.f269023f) && L.f(this.f269024g, brandspaceWidgetItem.f269024g) && L.f(this.f269025h, brandspaceWidgetItem.f269025h) && L.f(this.f269026i, brandspaceWidgetItem.f269026i) && L.f(this.f269027j, brandspaceWidgetItem.f269027j) && L.f(this.f269028k, brandspaceWidgetItem.f269028k) && L.f(this.f269029l, brandspaceWidgetItem.f269029l);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272775j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF269029l() {
        return this.f269029l;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269020c() {
        return this.f269020c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF269019b() {
        return this.f269019b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF269031n() {
        return this.f269031n;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269032o() {
        return this.f269032o;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f269020c, this.f269019b.hashCode() * 31, 31);
        String str = this.f269021d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f269022e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f269023f;
        int iE3 = H.e((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f269024g);
        Action action = this.f269025h;
        int iHashCode3 = (iE3 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f269026i;
        int iHashCode4 = (iHashCode3 + (action2 == null ? 0 : action2.hashCode())) * 31;
        UniversalImage universalImage = this.f269027j;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Analytics analytics = this.f269028k;
        int iHashCode6 = (iHashCode5 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f269029l;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF269030m() {
        return this.f269030m;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandspaceWidgetItem(stringId=");
        sb2.append(this.f269019b);
        sb2.append(", spanCount=");
        sb2.append(this.f269020c);
        sb2.append(", title=");
        sb2.append(this.f269021d);
        sb2.append(", subtitle=");
        sb2.append(this.f269022e);
        sb2.append(", showCountDownTimerToNoon=");
        sb2.append(this.f269023f);
        sb2.append(", items=");
        sb2.append(this.f269024g);
        sb2.append(", action=");
        sb2.append(this.f269025h);
        sb2.append(", infoAction=");
        sb2.append(this.f269026i);
        sb2.append(", logo=");
        sb2.append(this.f269027j);
        sb2.append(", analytics=");
        sb2.append(this.f269028k);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f269029l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f269019b);
        parcel.writeInt(this.f269020c);
        parcel.writeString(this.f269021d);
        parcel.writeString(this.f269022e);
        Boolean bool = this.f269023f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Iterator itJ = C0.j(this.f269024g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Action action = this.f269025h;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        Action action2 = this.f269026i;
        if (action2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action2.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f269027j, i12);
        parcel.writeParcelable(this.f269028k, i12);
        parcel.writeParcelable(this.f269029l, i12);
    }

    public BrandspaceWidgetItem(String str, int i12, String str2, String str3, Boolean bool, List list, Action action, Action action2, UniversalImage universalImage, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? UUID.randomUUID().toString() : str, i12, str2, str3, bool, (i13 & 32) != 0 ? C42784z0.f406748b : list, (i13 & 64) != 0 ? null : action, (i13 & 128) != 0 ? null : action2, (i13 & 256) != 0 ? null : universalImage, (i13 & 512) != 0 ? null : analytics, (i13 & 1024) != 0 ? null : settings);
    }
}
