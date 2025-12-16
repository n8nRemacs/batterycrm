package com.avito.android.advert.item.select.parameters_v3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.select.number_input.AutoSelectNumberInputButtonParams;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV3Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/AutoSelectParametersV3Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Advantage", "Analytics", "Badge", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectParametersV3Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectParametersV3Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Advantage> f79533c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Badge f79535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f79536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AutoSelectNumberInputButtonParams f79537g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79538h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Analytics f79539i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f79540j;

    /* renamed from: k, reason: collision with root package name */
    public final long f79541k;

    /* renamed from: l, reason: collision with root package name */
    public final int f79542l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79543m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79544n;

    /* compiled from: AutoSelectParametersV3Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/AutoSelectParametersV3Item$Advantage;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Advantage implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Advantage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f79545b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f79546c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f79547d;

        /* compiled from: AutoSelectParametersV3Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advantage> {
            @Override // android.os.Parcelable.Creator
            public final Advantage createFromParcel(Parcel parcel) {
                return new Advantage(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Advantage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Advantage[] newArray(int i12) {
                return new Advantage[i12];
            }
        }

        public Advantage(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
            this.f79545b = str;
            this.f79546c = str2;
            this.f79547d = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Advantage)) {
                return false;
            }
            Advantage advantage = (Advantage) obj;
            return L.f(this.f79545b, advantage.f79545b) && L.f(this.f79546c, advantage.f79546c) && L.f(this.f79547d, advantage.f79547d);
        }

        public final int hashCode() {
            return this.f79547d.hashCode() + H.d(this.f79545b.hashCode() * 31, 31, this.f79546c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Advantage(icon=");
            sb2.append(this.f79545b);
            sb2.append(", title=");
            sb2.append(this.f79546c);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f79547d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f79545b);
            parcel.writeString(this.f79546c);
            parcel.writeParcelable(this.f79547d, i12);
        }
    }

    /* compiled from: AutoSelectParametersV3Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/AutoSelectParametersV3Item$Analytics;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Analytics implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f79548b;

        /* compiled from: AutoSelectParametersV3Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Analytics> {
            @Override // android.os.Parcelable.Creator
            public final Analytics createFromParcel(Parcel parcel) {
                return new Analytics((DeepLink) parcel.readParcelable(Analytics.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@Y61.k DeepLink deepLink) {
            this.f79548b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && L.f(this.f79548b, ((Analytics) obj).f79548b);
        }

        public final int hashCode() {
            return this.f79548b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Analytics(onShowForm="), this.f79548b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f79548b, i12);
        }
    }

    /* compiled from: AutoSelectParametersV3Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/AutoSelectParametersV3Item$Badge;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Badge implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Badge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f79549b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Image f79550c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f79551d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f79552e;

        /* compiled from: AutoSelectParametersV3Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Badge> {
            @Override // android.os.Parcelable.Creator
            public final Badge createFromParcel(Parcel parcel) {
                return new Badge(parcel.readString(), (AttributedText) parcel.readParcelable(Badge.class.getClassLoader()), (Image) parcel.readParcelable(Badge.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k Image image, @Y61.k String str2) {
            this.f79549b = str;
            this.f79550c = image;
            this.f79551d = attributedText;
            this.f79552e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return L.f(this.f79549b, badge.f79549b) && L.f(this.f79550c, badge.f79550c) && L.f(this.f79551d, badge.f79551d) && L.f(this.f79552e, badge.f79552e);
        }

        public final int hashCode() {
            return this.f79552e.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.f79550c, this.f79549b.hashCode() * 31, 31), 31, this.f79551d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Badge(title=");
            sb2.append(this.f79549b);
            sb2.append(", image=");
            sb2.append(this.f79550c);
            sb2.append(", description=");
            sb2.append(this.f79551d);
            sb2.append(", color=");
            return C22026a.c(sb2, this.f79552e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f79549b);
            parcel.writeParcelable(this.f79550c, i12);
            parcel.writeParcelable(this.f79551d, i12);
            parcel.writeString(this.f79552e);
        }
    }

    /* compiled from: AutoSelectParametersV3Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectParametersV3Item> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectParametersV3Item createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoSelectParametersV3Item.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Advantage.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectParametersV3Item(attributedText, arrayList, (AttributedText) parcel.readParcelable(AutoSelectParametersV3Item.class.getClassLoader()), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readString(), AutoSelectNumberInputButtonParams.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(AutoSelectParametersV3Item.class.getClassLoader()), Analytics.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectParametersV3Item[] newArray(int i12) {
            return new AutoSelectParametersV3Item[i12];
        }
    }

    public AutoSelectParametersV3Item(@Y61.k AttributedText attributedText, @Y61.k List<Advantage> list, @Y61.k AttributedText attributedText2, @Y61.l Badge badge, @Y61.k String str, @Y61.k AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams, @Y61.k AttributedText attributedText3, @Y61.k Analytics analytics, @Y61.k String str2, long j12, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f79532b = attributedText;
        this.f79533c = list;
        this.f79534d = attributedText2;
        this.f79535e = badge;
        this.f79536f = str;
        this.f79537g = autoSelectNumberInputButtonParams;
        this.f79538h = attributedText3;
        this.f79539i = analytics;
        this.f79540j = str2;
        this.f79541k = j12;
        this.f79542l = i12;
        this.f79543m = serpDisplayType;
        this.f79544n = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AutoSelectParametersV3Item(this.f79532b, this.f79533c, this.f79534d, this.f79535e, this.f79536f, this.f79537g, this.f79538h, this.f79539i, this.f79540j, this.f79541k, i12, this.f79543m, this.f79544n);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79543m = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectParametersV3Item)) {
            return false;
        }
        AutoSelectParametersV3Item autoSelectParametersV3Item = (AutoSelectParametersV3Item) obj;
        return L.f(this.f79532b, autoSelectParametersV3Item.f79532b) && L.f(this.f79533c, autoSelectParametersV3Item.f79533c) && L.f(this.f79534d, autoSelectParametersV3Item.f79534d) && L.f(this.f79535e, autoSelectParametersV3Item.f79535e) && L.f(this.f79536f, autoSelectParametersV3Item.f79536f) && L.f(this.f79537g, autoSelectParametersV3Item.f79537g) && L.f(this.f79538h, autoSelectParametersV3Item.f79538h) && L.f(this.f79539i, autoSelectParametersV3Item.f79539i) && L.f(this.f79540j, autoSelectParametersV3Item.f79540j) && this.f79541k == autoSelectParametersV3Item.f79541k && this.f79542l == autoSelectParametersV3Item.f79542l && this.f79543m == autoSelectParametersV3Item.f79543m && this.f79544n == autoSelectParametersV3Item.f79544n;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85686c() {
        return this.f79541k;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272884f() {
        return this.f79542l;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229386b() {
        return this.f79540j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272883e() {
        return this.f79544n;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.e(this.f79532b.hashCode() * 31, 31, this.f79533c), 31, this.f79534d);
        Badge badge = this.f79535e;
        return this.f79544n.hashCode() + com.avito.android.actions_sheet.a.h(this.f79543m, androidx.appcompat.app.r.e(this.f79542l, androidx.appcompat.app.r.g(H.d(com.avito.android.actions_sheet.a.e(this.f79539i.f79548b, com.avito.android.actions_sheet.a.b((this.f79537g.hashCode() + H.d((iB2 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.f79536f)) * 31, 31, this.f79538h), 31), 31, this.f79540j), 31, this.f79541k), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectParametersV3Item(title=");
        sb2.append(this.f79532b);
        sb2.append(", advantages=");
        sb2.append(this.f79533c);
        sb2.append(", description=");
        sb2.append(this.f79534d);
        sb2.append(", badge=");
        sb2.append(this.f79535e);
        sb2.append(", inputTitle=");
        sb2.append(this.f79536f);
        sb2.append(", submitButton=");
        sb2.append(this.f79537g);
        sb2.append(", disclaimer=");
        sb2.append(this.f79538h);
        sb2.append(", analytics=");
        sb2.append(this.f79539i);
        sb2.append(", stringId=");
        sb2.append(this.f79540j);
        sb2.append(", id=");
        sb2.append(this.f79541k);
        sb2.append(", spanCount=");
        sb2.append(this.f79542l);
        sb2.append(", displayType=");
        sb2.append(this.f79543m);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79544n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f79532b, i12);
        Iterator itJ = C0.j(this.f79533c, parcel);
        while (itJ.hasNext()) {
            ((Advantage) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f79534d, i12);
        Badge badge = this.f79535e;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f79536f);
        this.f79537g.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f79538h, i12);
        this.f79539i.writeToParcel(parcel, i12);
        parcel.writeString(this.f79540j);
        parcel.writeLong(this.f79541k);
        parcel.writeInt(this.f79542l);
        parcel.writeString(this.f79543m.name());
        parcel.writeString(this.f79544n.name());
    }

    public /* synthetic */ AutoSelectParametersV3Item(AttributedText attributedText, List list, AttributedText attributedText2, Badge badge, String str, AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams, AttributedText attributedText3, Analytics analytics, String str2, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(attributedText, list, attributedText2, (i13 & 8) != 0 ? null : badge, str, autoSelectNumberInputButtonParams, attributedText3, analytics, str2, j12, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
