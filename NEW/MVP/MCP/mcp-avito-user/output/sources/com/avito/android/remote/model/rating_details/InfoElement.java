package com.avito.android.remote.model.rating_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.rating_details.RatingDetailsElement;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: RatingDetailsElement.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/rating_details/InfoElement;", "Lcom/avito/android/remote/model/rating_details/RatingDetailsElement;", "", "title", "Lcom/avito/android/remote/model/rating_details/InfoElement$InfoElementTitleSize;", "titleSize", "subtitle", "Lcom/avito/android/remote/model/rating_details/InfoHint;", "hint", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details/InfoElement$InfoElementTitleSize;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details/InfoHint;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/rating_details/InfoElement$InfoElementTitleSize;", "getTitleSize", "()Lcom/avito/android/remote/model/rating_details/InfoElement$InfoElementTitleSize;", "getSubtitle", "Lcom/avito/android/remote/model/rating_details/InfoHint;", "getHint", "()Lcom/avito/android/remote/model/rating_details/InfoHint;", "InfoElementTitleSize", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InfoElement implements RatingDetailsElement {

    @k
    public static final Parcelable.Creator<InfoElement> CREATOR = new Creator();

    @c("hint")
    @l
    private final InfoHint hint;

    @c("subTitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("titleSize")
    @l
    private final InfoElementTitleSize titleSize;

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoElement createFromParcel(@k Parcel parcel) {
            return new InfoElement(parcel.readString(), parcel.readInt() == 0 ? null : InfoElementTitleSize.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? InfoHint.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoElement[] newArray(int i12) {
            return new InfoElement[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingDetailsElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/rating_details/InfoElement$InfoElementTitleSize;", "", "(Ljava/lang/String;I)V", "H1", "H2", "H3", "H4", "S2", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoElementTitleSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InfoElementTitleSize[] $VALUES;

        /* renamed from: H1, reason: collision with root package name */
        @c("h1")
        public static final InfoElementTitleSize f253902H1 = new InfoElementTitleSize("H1", 0);

        /* renamed from: H2, reason: collision with root package name */
        @c("h2")
        public static final InfoElementTitleSize f253903H2 = new InfoElementTitleSize("H2", 1);

        /* renamed from: H3, reason: collision with root package name */
        @c("h3")
        public static final InfoElementTitleSize f253904H3 = new InfoElementTitleSize("H3", 2);

        /* renamed from: H4, reason: collision with root package name */
        @c("h4")
        public static final InfoElementTitleSize f253905H4 = new InfoElementTitleSize("H4", 3);

        /* renamed from: S2, reason: collision with root package name */
        @c("s2")
        public static final InfoElementTitleSize f253906S2 = new InfoElementTitleSize("S2", 4);

        private static final /* synthetic */ InfoElementTitleSize[] $values() {
            return new InfoElementTitleSize[]{f253902H1, f253903H2, f253904H3, f253905H4, f253906S2};
        }

        static {
            InfoElementTitleSize[] infoElementTitleSizeArr$values = $values();
            $VALUES = infoElementTitleSizeArr$values;
            $ENTRIES = kotlin.enums.c.a(infoElementTitleSizeArr$values);
        }

        private InfoElementTitleSize(String str, int i12) {
        }

        @k
        public static a<InfoElementTitleSize> getEntries() {
            return $ENTRIES;
        }

        public static InfoElementTitleSize valueOf(String str) {
            return (InfoElementTitleSize) Enum.valueOf(InfoElementTitleSize.class, str);
        }

        public static InfoElementTitleSize[] values() {
            return (InfoElementTitleSize[]) $VALUES.clone();
        }
    }

    public InfoElement(@k String str, @l InfoElementTitleSize infoElementTitleSize, @l String str2, @l InfoHint infoHint) {
        this.title = str;
        this.titleSize = infoElementTitleSize;
        this.subtitle = str2;
        this.hint = infoHint;
    }

    @Override // com.avito.android.remote.model.rating_details.RatingDetailsElement, android.os.Parcelable
    public int describeContents() {
        return RatingDetailsElement.DefaultImpls.describeContents(this);
    }

    @l
    public final InfoHint getHint() {
        return this.hint;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final InfoElementTitleSize getTitleSize() {
        return this.titleSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        InfoElementTitleSize infoElementTitleSize = this.titleSize;
        if (infoElementTitleSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(infoElementTitleSize.name());
        }
        parcel.writeString(this.subtitle);
        InfoHint infoHint = this.hint;
        if (infoHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoHint.writeToParcel(parcel, flags);
        }
    }
}
