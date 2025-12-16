package com.avito.android.advert.item.select.no_click_contact;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.select.number_input.AutoSelectNumberInputButtonParams;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectNoClickContactItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/AutoSelectNoClickContactItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Analytics", "NoClickContactCard", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectNoClickContactItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectNoClickContactItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f79424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NoClickContactCard f79425c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NoClickContactCard f79426d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f79427e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AutoSelectNumberInputButtonParams f79428f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79429g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Analytics f79430h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f79431i;

    /* renamed from: j, reason: collision with root package name */
    public final long f79432j;

    /* renamed from: k, reason: collision with root package name */
    public final int f79433k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79434l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79435m;

    /* compiled from: AutoSelectNoClickContactItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/AutoSelectNoClickContactItem$Analytics;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Analytics implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f79436b;

        /* compiled from: AutoSelectNoClickContactItem.kt */
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
            this.f79436b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && L.f(this.f79436b, ((Analytics) obj).f79436b);
        }

        public final int hashCode() {
            return this.f79436b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Analytics(onShowForm="), this.f79436b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f79436b, i12);
        }
    }

    /* compiled from: AutoSelectNoClickContactItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectNoClickContactItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectNoClickContactItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<NoClickContactCard> creator = NoClickContactCard.CREATOR;
            return new AutoSelectNoClickContactItem(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), AutoSelectNumberInputButtonParams.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(AutoSelectNoClickContactItem.class.getClassLoader()), Analytics.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectNoClickContactItem[] newArray(int i12) {
            return new AutoSelectNoClickContactItem[i12];
        }
    }

    public AutoSelectNoClickContactItem(@Y61.k String str, @Y61.k NoClickContactCard noClickContactCard, @Y61.k NoClickContactCard noClickContactCard2, @Y61.k String str2, @Y61.k AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams, @Y61.k AttributedText attributedText, @Y61.k Analytics analytics, @Y61.k String str3, long j12, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f79424b = str;
        this.f79425c = noClickContactCard;
        this.f79426d = noClickContactCard2;
        this.f79427e = str2;
        this.f79428f = autoSelectNumberInputButtonParams;
        this.f79429g = attributedText;
        this.f79430h = analytics;
        this.f79431i = str3;
        this.f79432j = j12;
        this.f79433k = i12;
        this.f79434l = serpDisplayType;
        this.f79435m = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AutoSelectNoClickContactItem(this.f79424b, this.f79425c, this.f79426d, this.f79427e, this.f79428f, this.f79429g, this.f79430h, this.f79431i, this.f79432j, i12, this.f79434l, this.f79435m);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79434l = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectNoClickContactItem)) {
            return false;
        }
        AutoSelectNoClickContactItem autoSelectNoClickContactItem = (AutoSelectNoClickContactItem) obj;
        return L.f(this.f79424b, autoSelectNoClickContactItem.f79424b) && L.f(this.f79425c, autoSelectNoClickContactItem.f79425c) && L.f(this.f79426d, autoSelectNoClickContactItem.f79426d) && L.f(this.f79427e, autoSelectNoClickContactItem.f79427e) && L.f(this.f79428f, autoSelectNoClickContactItem.f79428f) && L.f(this.f79429g, autoSelectNoClickContactItem.f79429g) && L.f(this.f79430h, autoSelectNoClickContactItem.f79430h) && L.f(this.f79431i, autoSelectNoClickContactItem.f79431i) && this.f79432j == autoSelectNoClickContactItem.f79432j && this.f79433k == autoSelectNoClickContactItem.f79433k && this.f79434l == autoSelectNoClickContactItem.f79434l && this.f79435m == autoSelectNoClickContactItem.f79435m;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF247679b() {
        return this.f79432j;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272980i() {
        return this.f79433k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200728b() {
        return this.f79431i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272979h() {
        return this.f79435m;
    }

    public final int hashCode() {
        return this.f79435m.hashCode() + com.avito.android.actions_sheet.a.h(this.f79434l, androidx.appcompat.app.r.e(this.f79433k, androidx.appcompat.app.r.g(H.d(com.avito.android.actions_sheet.a.e(this.f79430h.f79436b, com.avito.android.actions_sheet.a.b((this.f79428f.hashCode() + H.d((this.f79426d.hashCode() + ((this.f79425c.hashCode() + (this.f79424b.hashCode() * 31)) * 31)) * 31, 31, this.f79427e)) * 31, 31, this.f79429g), 31), 31, this.f79431i), 31, this.f79432j), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectNoClickContactItem(title=");
        sb2.append(this.f79424b);
        sb2.append(", leftCard=");
        sb2.append(this.f79425c);
        sb2.append(", rightCard=");
        sb2.append(this.f79426d);
        sb2.append(", inputTitle=");
        sb2.append(this.f79427e);
        sb2.append(", submitButton=");
        sb2.append(this.f79428f);
        sb2.append(", disclaimer=");
        sb2.append(this.f79429g);
        sb2.append(", analytics=");
        sb2.append(this.f79430h);
        sb2.append(", stringId=");
        sb2.append(this.f79431i);
        sb2.append(", id=");
        sb2.append(this.f79432j);
        sb2.append(", spanCount=");
        sb2.append(this.f79433k);
        sb2.append(", displayType=");
        sb2.append(this.f79434l);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79435m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f79424b);
        this.f79425c.writeToParcel(parcel, i12);
        this.f79426d.writeToParcel(parcel, i12);
        parcel.writeString(this.f79427e);
        this.f79428f.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f79429g, i12);
        this.f79430h.writeToParcel(parcel, i12);
        parcel.writeString(this.f79431i);
        parcel.writeLong(this.f79432j);
        parcel.writeInt(this.f79433k);
        parcel.writeString(this.f79434l.name());
        parcel.writeString(this.f79435m.name());
    }

    /* compiled from: AutoSelectNoClickContactItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/AutoSelectNoClickContactItem$NoClickContactCard;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class NoClickContactCard implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<NoClickContactCard> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UniversalImage f79437b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AttributedText f79438c;

        /* compiled from: AutoSelectNoClickContactItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoClickContactCard> {
            @Override // android.os.Parcelable.Creator
            public final NoClickContactCard createFromParcel(Parcel parcel) {
                return new NoClickContactCard((UniversalImage) parcel.readParcelable(NoClickContactCard.class.getClassLoader()), (AttributedText) parcel.readParcelable(NoClickContactCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NoClickContactCard[] newArray(int i12) {
                return new NoClickContactCard[i12];
            }
        }

        public NoClickContactCard(@Y61.l UniversalImage universalImage, @Y61.k AttributedText attributedText) {
            this.f79437b = universalImage;
            this.f79438c = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoClickContactCard)) {
                return false;
            }
            NoClickContactCard noClickContactCard = (NoClickContactCard) obj;
            return L.f(this.f79437b, noClickContactCard.f79437b) && L.f(this.f79438c, noClickContactCard.f79438c);
        }

        public final int hashCode() {
            UniversalImage universalImage = this.f79437b;
            return this.f79438c.hashCode() + ((universalImage == null ? 0 : universalImage.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NoClickContactCard(image=");
            sb2.append(this.f79437b);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f79438c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f79437b, i12);
            parcel.writeParcelable(this.f79438c, i12);
        }

        public /* synthetic */ NoClickContactCard(UniversalImage universalImage, AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : universalImage, attributedText);
        }
    }

    public /* synthetic */ AutoSelectNoClickContactItem(String str, NoClickContactCard noClickContactCard, NoClickContactCard noClickContactCard2, String str2, AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams, AttributedText attributedText, Analytics analytics, String str3, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, noClickContactCard, noClickContactCard2, str2, autoSelectNumberInputButtonParams, attributedText, analytics, str3, j12, i12, (i13 & 1024) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 2048) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
