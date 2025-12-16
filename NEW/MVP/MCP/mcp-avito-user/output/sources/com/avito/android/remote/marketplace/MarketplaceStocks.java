package com.avito.android.remote.marketplace;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketplaceStocks.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/marketplace/MarketplaceStocks;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description;", "description", "<init>", "(Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description;)V", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description;", "c", "()Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description;", "Alignment", "Description", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketplaceStocks implements Parcelable {

    @k
    public static final Parcelable.Creator<MarketplaceStocks> CREATOR = new a();

    @c("stockDescription")
    @l
    private final Description description;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketplaceStocks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/marketplace/MarketplaceStocks$Alignment;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        @c("center")
        public static final Alignment CENTER;

        @c("left")
        public static final Alignment LEFT;

        @c("right")
        public static final Alignment RIGHT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f253571b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f253572c;

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            LEFT = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            CENTER = alignment2;
            Alignment alignment3 = new Alignment("RIGHT", 2);
            RIGHT = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            f253571b = alignmentArr;
            f253572c = kotlin.enums.c.a(alignmentArr);
        }

        private Alignment(String str, int i12) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f253571b.clone();
        }
    }

    /* compiled from: MarketplaceStocks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceStocks> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceStocks createFromParcel(Parcel parcel) {
            return new MarketplaceStocks(parcel.readInt() == 0 ? null : Description.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceStocks[] newArray(int i12) {
            return new MarketplaceStocks[i12];
        }
    }

    public MarketplaceStocks(@l Description description) {
        this.description = description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Description getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Description description = this.description;
        if (description == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            description.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MarketplaceStocks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$Text;", "text", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$AnimationUrl;", "animationUrl", "<init>", "(Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$Text;Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$AnimationUrl;)V", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$Text;", "d", "()Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$Text;", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$AnimationUrl;", "c", "()Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$AnimationUrl;", "AnimationUrl", "Text", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Description implements Parcelable {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new a();

        @c("animationUrl")
        @l
        private final AnimationUrl animationUrl;

        @c("text")
        @k
        private final Text text;

        /* compiled from: MarketplaceStocks.kt */
        @d
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$Text;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Alignment;", "alignment", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/marketplace/MarketplaceStocks$Alignment;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/marketplace/MarketplaceStocks$Alignment;", "c", "()Lcom/avito/android/remote/marketplace/MarketplaceStocks$Alignment;", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Text implements Parcelable {

            @k
            public static final Parcelable.Creator<Text> CREATOR = new a();

            @c("alignment")
            @l
            private final Alignment alignment;

            @c("attributedText")
            @k
            private final AttributedText attributedText;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final String style;

            /* compiled from: MarketplaceStocks.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Text> {
                @Override // android.os.Parcelable.Creator
                public final Text createFromParcel(Parcel parcel) {
                    return new Text((AttributedText) parcel.readParcelable(Text.class.getClassLoader()), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i12) {
                    return new Text[i12];
                }
            }

            public Text(@k AttributedText attributedText, @l Alignment alignment, @l String str) {
                this.attributedText = attributedText;
                this.alignment = alignment;
                this.style = str;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getAttributedText() {
                return this.attributedText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return L.f(this.attributedText, text.attributedText) && this.alignment == text.alignment && L.f(this.style, text.style);
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            public final int hashCode() {
                int iHashCode = this.attributedText.hashCode() * 31;
                Alignment alignment = this.alignment;
                int iHashCode2 = (iHashCode + (alignment == null ? 0 : alignment.hashCode())) * 31;
                String str = this.style;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Text(attributedText=");
                sb2.append(this.attributedText);
                sb2.append(", alignment=");
                sb2.append(this.alignment);
                sb2.append(", style=");
                return C22026a.c(sb2, this.style, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.attributedText, i12);
                Alignment alignment = this.alignment;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
                parcel.writeString(this.style);
            }
        }

        /* compiled from: MarketplaceStocks.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                return new Description(Text.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnimationUrl.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@k Text text, @l AnimationUrl animationUrl) {
            this.text = text;
            this.animationUrl = animationUrl;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AnimationUrl getAnimationUrl() {
            return this.animationUrl;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Text getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return L.f(this.text, description.text) && L.f(this.animationUrl, description.animationUrl);
        }

        public final int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            AnimationUrl animationUrl = this.animationUrl;
            return iHashCode + (animationUrl == null ? 0 : animationUrl.hashCode());
        }

        @k
        public final String toString() {
            return "Description(text=" + this.text + ", animationUrl=" + this.animationUrl + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.text.writeToParcel(parcel, i12);
            AnimationUrl animationUrl = this.animationUrl;
            if (animationUrl == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                animationUrl.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: MarketplaceStocks.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/marketplace/MarketplaceStocks$Description$AnimationUrl;", "Landroid/os/Parcelable;", "", "value", "valueDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AnimationUrl implements Parcelable {

            @k
            public static final Parcelable.Creator<AnimationUrl> CREATOR = new a();

            @c("value")
            @k
            private final String value;

            @c("valueDark")
            @l
            private final String valueDark;

            /* compiled from: MarketplaceStocks.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AnimationUrl> {
                @Override // android.os.Parcelable.Creator
                public final AnimationUrl createFromParcel(Parcel parcel) {
                    return new AnimationUrl(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AnimationUrl[] newArray(int i12) {
                    return new AnimationUrl[i12];
                }
            }

            public AnimationUrl(@k String str, @l String str2) {
                this.value = str;
                this.valueDark = str2;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getValueDark() {
                return this.valueDark;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnimationUrl)) {
                    return false;
                }
                AnimationUrl animationUrl = (AnimationUrl) obj;
                return L.f(this.value, animationUrl.value) && L.f(this.valueDark, animationUrl.valueDark);
            }

            @k
            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                String str = this.valueDark;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AnimationUrl(value=");
                sb2.append(this.value);
                sb2.append(", valueDark=");
                return C22026a.c(sb2, this.valueDark, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.value);
                parcel.writeString(this.valueDark);
            }

            public /* synthetic */ AnimationUrl(String str, String str2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2);
            }
        }
    }
}
