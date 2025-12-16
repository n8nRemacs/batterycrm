package com.avito.android.serp.adapter.replace_main_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: ReplaceMainWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "<init>", "()V", "ReplaceMain", "ShowAvito", "Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ReplaceMain;", "Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ShowAvito;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ReplaceMainWidgetItem implements PersistableSerpItem, is0.h, InterfaceC47435a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270668c;

    /* compiled from: ReplaceMainWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ReplaceMain;", "Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReplaceMain extends ReplaceMainWidgetItem {

        @Y61.k
        public static final Parcelable.Creator<ReplaceMain> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f270669d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainItem.ReplaceMain f270670e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Analytics f270671f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Settings f270672g;

        /* compiled from: ReplaceMainWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReplaceMain> {
            @Override // android.os.Parcelable.Creator
            public final ReplaceMain createFromParcel(Parcel parcel) {
                return new ReplaceMain(parcel.readString(), (ReplaceMainItem.ReplaceMain) parcel.readParcelable(ReplaceMain.class.getClassLoader()), (Analytics) parcel.readParcelable(ReplaceMain.class.getClassLoader()), (Settings) parcel.readParcelable(ReplaceMain.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ReplaceMain[] newArray(int i12) {
                return new ReplaceMain[i12];
            }
        }

        public ReplaceMain(@Y61.k String str, @Y61.k ReplaceMainItem.ReplaceMain replaceMain, @Y61.l Analytics analytics, @Y61.l Settings settings) {
            super(null);
            this.f270669d = str;
            this.f270670e = replaceMain;
            this.f270671f = analytics;
            this.f270672g = settings;
        }

        public static ReplaceMain W(ReplaceMain replaceMain, ReplaceMainItem.ReplaceMain replaceMain2) {
            String str = replaceMain.f270669d;
            Analytics analytics = replaceMain.f270671f;
            Settings settings = replaceMain.f270672g;
            replaceMain.getClass();
            return new ReplaceMain(str, replaceMain2, analytics, settings);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplaceMain)) {
                return false;
            }
            ReplaceMain replaceMain = (ReplaceMain) obj;
            return L.f(this.f270669d, replaceMain.f270669d) && L.f(this.f270670e, replaceMain.f270670e) && L.f(this.f270671f, replaceMain.f270671f) && L.f(this.f270672g, replaceMain.f270672g);
        }

        @Override // com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem
        public final ReplaceMainItem f() {
            return this.f270670e;
        }

        @Override // com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem
        @Y61.l
        /* renamed from: getAnalytics, reason: from getter */
        public final Analytics getF270675f() {
            return this.f270671f;
        }

        @Override // qs0.InterfaceC47435a
        @Y61.l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF269954f() {
            return this.f270672g;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF269951c() {
            return this.f270669d;
        }

        public final int hashCode() {
            int iHashCode = (this.f270670e.hashCode() + (this.f270669d.hashCode() * 31)) * 31;
            Analytics analytics = this.f270671f;
            int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
            Settings settings = this.f270672g;
            return iHashCode2 + (settings != null ? settings.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceMain(stringId=");
            sb2.append(this.f270669d);
            sb2.append(", mainItem=");
            sb2.append(this.f270670e);
            sb2.append(", analytics=");
            sb2.append(this.f270671f);
            sb2.append(", settings=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270672g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f270669d);
            parcel.writeParcelable(this.f270670e, i12);
            parcel.writeParcelable(this.f270671f, i12);
            parcel.writeParcelable(this.f270672g, i12);
        }
    }

    /* compiled from: ReplaceMainWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ShowAvito;", "Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAvito extends ReplaceMainWidgetItem {

        @Y61.k
        public static final Parcelable.Creator<ShowAvito> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f270673d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainItem.ShowAvito f270674e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Analytics f270675f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Settings f270676g;

        /* compiled from: ReplaceMainWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowAvito> {
            @Override // android.os.Parcelable.Creator
            public final ShowAvito createFromParcel(Parcel parcel) {
                return new ShowAvito(parcel.readString(), (ReplaceMainItem.ShowAvito) parcel.readParcelable(ShowAvito.class.getClassLoader()), (Analytics) parcel.readParcelable(ShowAvito.class.getClassLoader()), (Settings) parcel.readParcelable(ShowAvito.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShowAvito[] newArray(int i12) {
                return new ShowAvito[i12];
            }
        }

        public ShowAvito(@Y61.k String str, @Y61.k ReplaceMainItem.ShowAvito showAvito, @Y61.l Analytics analytics, @Y61.l Settings settings) {
            super(null);
            this.f270673d = str;
            this.f270674e = showAvito;
            this.f270675f = analytics;
            this.f270676g = settings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAvito)) {
                return false;
            }
            ShowAvito showAvito = (ShowAvito) obj;
            return L.f(this.f270673d, showAvito.f270673d) && L.f(this.f270674e, showAvito.f270674e) && L.f(this.f270675f, showAvito.f270675f) && L.f(this.f270676g, showAvito.f270676g);
        }

        @Override // com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem
        public final ReplaceMainItem f() {
            return this.f270674e;
        }

        @Override // com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem
        @Y61.l
        /* renamed from: getAnalytics, reason: from getter */
        public final Analytics getF270675f() {
            return this.f270675f;
        }

        @Override // qs0.InterfaceC47435a
        @Y61.l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF269954f() {
            return this.f270676g;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF269951c() {
            return this.f270673d;
        }

        public final int hashCode() {
            int iHashCode = (this.f270674e.hashCode() + (this.f270673d.hashCode() * 31)) * 31;
            Analytics analytics = this.f270675f;
            int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
            Settings settings = this.f270676g;
            return iHashCode2 + (settings != null ? settings.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAvito(stringId=");
            sb2.append(this.f270673d);
            sb2.append(", mainItem=");
            sb2.append(this.f270674e);
            sb2.append(", analytics=");
            sb2.append(this.f270675f);
            sb2.append(", settings=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270676g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f270673d);
            parcel.writeParcelable(this.f270674e, i12);
            parcel.writeParcelable(this.f270675f, i12);
            parcel.writeParcelable(this.f270676g, i12);
        }
    }

    public /* synthetic */ ReplaceMainWidgetItem(C42822w c42822w) {
        this();
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Y61.k
    public abstract ReplaceMainItem f();

    @Y61.l
    /* renamed from: getAnalytics */
    public abstract Analytics getF270675f();

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF285043q() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269958j() {
        return this.f270668c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF269956h() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269957i() {
        return this.f270667b;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1 */
    public final h.b getF269955g() {
        return new h.b("replace_main", null, null, null, null, getF270675f(), 30, null);
    }

    public ReplaceMainWidgetItem() {
        this.f270667b = SerpViewType.f268585e;
        this.f270668c = 6;
    }
}
