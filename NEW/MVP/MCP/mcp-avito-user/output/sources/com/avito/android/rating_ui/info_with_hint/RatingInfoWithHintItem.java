package com.avito.android.rating_ui.info_with_hint;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.UniversalImage;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingInfoWithHintItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "Hint", "InfoHorizontalAlign", "InfoImage", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingInfoWithHintItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RatingInfoWithHintItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250019b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250020c;

    /* renamed from: d, reason: collision with root package name */
    public final int f250021d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f250022e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f250023f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f250024g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Hint f250025h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final InfoHorizontalAlign f250026i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final InfoImage f250027j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f250028k;

    /* compiled from: RatingInfoWithHintItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem$Hint;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hint implements Parcelable {

        @k
        public static final Parcelable.Creator<Hint> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f250029b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f250030c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f250031d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f250032e;

        /* compiled from: RatingInfoWithHintItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Hint> {
            @Override // android.os.Parcelable.Creator
            public final Hint createFromParcel(Parcel parcel) {
                return new Hint(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Hint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Hint[] newArray(int i12) {
                return new Hint[i12];
            }
        }

        public Hint(@l String str, @k String str2, @l String str3, @l DeepLink deepLink) {
            this.f250029b = str;
            this.f250030c = str2;
            this.f250031d = str3;
            this.f250032e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Hint)) {
                return false;
            }
            Hint hint = (Hint) obj;
            return L.f(this.f250029b, hint.f250029b) && L.f(this.f250030c, hint.f250030c) && L.f(this.f250031d, hint.f250031d) && L.f(this.f250032e, hint.f250032e);
        }

        public final int hashCode() {
            String str = this.f250029b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f250030c);
            String str2 = this.f250031d;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f250032e;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Hint(title=");
            sb2.append(this.f250029b);
            sb2.append(", text=");
            sb2.append(this.f250030c);
            sb2.append(", actionText=");
            sb2.append(this.f250031d);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f250032e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250029b);
            parcel.writeString(this.f250030c);
            parcel.writeString(this.f250031d);
            parcel.writeParcelable(this.f250032e, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingInfoWithHintItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem$InfoHorizontalAlign;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoHorizontalAlign {

        /* renamed from: b, reason: collision with root package name */
        public static final InfoHorizontalAlign f250033b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ InfoHorizontalAlign[] f250034c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f250035d;

        static {
            InfoHorizontalAlign infoHorizontalAlign = new InfoHorizontalAlign("CENTER", 0);
            f250033b = infoHorizontalAlign;
            InfoHorizontalAlign[] infoHorizontalAlignArr = {infoHorizontalAlign};
            f250034c = infoHorizontalAlignArr;
            f250035d = kotlin.enums.c.a(infoHorizontalAlignArr);
        }

        public InfoHorizontalAlign() {
            throw null;
        }

        public static InfoHorizontalAlign valueOf(String str) {
            return (InfoHorizontalAlign) Enum.valueOf(InfoHorizontalAlign.class, str);
        }

        public static InfoHorizontalAlign[] values() {
            return (InfoHorizontalAlign[]) f250034c.clone();
        }
    }

    /* compiled from: RatingInfoWithHintItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem$InfoImage;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfoImage implements Parcelable {

        @k
        public static final Parcelable.Creator<InfoImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalImage f250036b;

        /* renamed from: c, reason: collision with root package name */
        public final int f250037c;

        /* compiled from: RatingInfoWithHintItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InfoImage> {
            @Override // android.os.Parcelable.Creator
            public final InfoImage createFromParcel(Parcel parcel) {
                return new InfoImage((UniversalImage) parcel.readParcelable(InfoImage.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final InfoImage[] newArray(int i12) {
                return new InfoImage[i12];
            }
        }

        public InfoImage(@k UniversalImage universalImage, int i12) {
            this.f250036b = universalImage;
            this.f250037c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoImage)) {
                return false;
            }
            InfoImage infoImage = (InfoImage) obj;
            return L.f(this.f250036b, infoImage.f250036b) && this.f250037c == infoImage.f250037c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f250037c) + (this.f250036b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoImage(image=");
            sb2.append(this.f250036b);
            sb2.append(", width=");
            return r.t(sb2, this.f250037c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f250036b, i12);
            parcel.writeInt(this.f250037c);
        }
    }

    /* compiled from: RatingInfoWithHintItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingInfoWithHintItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingInfoWithHintItem createFromParcel(Parcel parcel) {
            return new RatingInfoWithHintItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InfoHorizontalAlign.valueOf(parcel.readString()), parcel.readInt() != 0 ? InfoImage.CREATOR.createFromParcel(parcel) : null, (RatingItemsMarginHorizontal) parcel.readParcelable(RatingInfoWithHintItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingInfoWithHintItem[] newArray(int i12) {
            return new RatingInfoWithHintItem[i12];
        }
    }

    public RatingInfoWithHintItem(@k String str, @k String str2, @InterfaceC42150f int i12, @InterfaceC42150f @l Integer num, @l String str3, @InterfaceC42150f @l Integer num2, @l Hint hint, @l InfoHorizontalAlign infoHorizontalAlign, @l InfoImage infoImage, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f250019b = str;
        this.f250020c = str2;
        this.f250021d = i12;
        this.f250022e = num;
        this.f250023f = str3;
        this.f250024g = num2;
        this.f250025h = hint;
        this.f250026i = infoHorizontalAlign;
        this.f250027j = infoImage;
        this.f250028k = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingInfoWithHintItem)) {
            return false;
        }
        RatingInfoWithHintItem ratingInfoWithHintItem = (RatingInfoWithHintItem) obj;
        return L.f(this.f250019b, ratingInfoWithHintItem.f250019b) && L.f(this.f250020c, ratingInfoWithHintItem.f250020c) && this.f250021d == ratingInfoWithHintItem.f250021d && L.f(this.f250022e, ratingInfoWithHintItem.f250022e) && L.f(this.f250023f, ratingInfoWithHintItem.f250023f) && L.f(this.f250024g, ratingInfoWithHintItem.f250024g) && L.f(this.f250025h, ratingInfoWithHintItem.f250025h) && this.f250026i == ratingInfoWithHintItem.f250026i && L.f(this.f250027j, ratingInfoWithHintItem.f250027j) && L.f(this.f250028k, ratingInfoWithHintItem.f250028k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return getF251943b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF251943b() {
        return this.f250019b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f250021d, H.d(this.f250019b.hashCode() * 31, 31, this.f250020c), 31);
        Integer num = this.f250022e;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f250023f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f250024g;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Hint hint = this.f250025h;
        int iHashCode4 = (iHashCode3 + (hint == null ? 0 : hint.hashCode())) * 31;
        InfoHorizontalAlign infoHorizontalAlign = this.f250026i;
        int iHashCode5 = (iHashCode4 + (infoHorizontalAlign == null ? 0 : infoHorizontalAlign.hashCode())) * 31;
        InfoImage infoImage = this.f250027j;
        return this.f250028k.hashCode() + ((iHashCode5 + (infoImage != null ? infoImage.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "RatingInfoWithHintItem(stringId=" + this.f250019b + ", title=" + this.f250020c + ", titleAppearanceResId=" + this.f250021d + ", titleColorResId=" + this.f250022e + ", subtitle=" + this.f250023f + ", subtitleColorResId=" + this.f250024g + ", hint=" + this.f250025h + ", horizontalAlign=" + this.f250026i + ", imageInfo=" + this.f250027j + ", marginHorizontal=" + this.f250028k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250019b);
        parcel.writeString(this.f250020c);
        parcel.writeInt(this.f250021d);
        Integer num = this.f250022e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f250023f);
        Integer num2 = this.f250024g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Hint hint = this.f250025h;
        if (hint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hint.writeToParcel(parcel, i12);
        }
        InfoHorizontalAlign infoHorizontalAlign = this.f250026i;
        if (infoHorizontalAlign == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(infoHorizontalAlign.name());
        }
        InfoImage infoImage = this.f250027j;
        if (infoImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoImage.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f250028k, i12);
    }

    public /* synthetic */ RatingInfoWithHintItem(String str, String str2, int i12, Integer num, String str3, Integer num2, Hint hint, InfoHorizontalAlign infoHorizontalAlign, InfoImage infoImage, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i13, C42822w c42822w) {
        this(str, str2, i12, num, str3, num2, hint, infoHorizontalAlign, infoImage, (i13 & 512) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
