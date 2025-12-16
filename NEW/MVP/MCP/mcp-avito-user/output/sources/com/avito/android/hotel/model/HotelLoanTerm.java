package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingInstallmentsItem.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/hotel/model/HotelLoanTerm;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/hotel/model/HotelLoanTerm$Progress;", "progress", "termTitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/hotel/model/HotelLoanTerm$Progress;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/hotel/model/HotelLoanTerm$Progress;", "c", "()Lcom/avito/android/hotel/model/HotelLoanTerm$Progress;", "d", "Block", "Progress", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelLoanTerm implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelLoanTerm> CREATOR = new a();

    @c("id")
    @l
    private final String id;

    @c("progress")
    @k
    private final Progress progress;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("termTitle")
    @k
    private final String termTitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: HotelBookingInstallmentsItem.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/hotel/model/HotelLoanTerm$Block;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "dashCount", "blockWidth", "dashHeight", "dashSpacing", "textMarginTop", "Lcom/avito/android/remote/model/UniversalColor;", "dashColor", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;ILjava/lang/Integer;IIILcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "I", "e", "()I", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "f", "g", "h", "Lcom/avito/android/remote/model/UniversalColor;", "d", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new a();

        @c("width")
        @l
        private final Integer blockWidth;

        @c("dashColor")
        @k
        private final UniversalColor dashColor;

        @c("dashCount")
        private final int dashCount;

        @c("dashHeight")
        private final int dashHeight;

        @c("dashSpacing")
        private final int dashSpacing;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("textMarginTop")
        private final int textMarginTop;

        @c("title")
        @k
        private final AttributedText title;

        /* compiled from: HotelBookingInstallmentsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Block> {
            @Override // android.os.Parcelable.Creator
            public final Block createFromParcel(Parcel parcel) {
                return new Block((AttributedText) parcel.readParcelable(Block.class.getClassLoader()), (AttributedText) parcel.readParcelable(Block.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), (UniversalColor) parcel.readParcelable(Block.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        public Block(@k AttributedText attributedText, @l AttributedText attributedText2, int i12, @l Integer num, int i13, int i14, int i15, @k UniversalColor universalColor) {
            this.title = attributedText;
            this.subtitle = attributedText2;
            this.dashCount = i12;
            this.blockWidth = num;
            this.dashHeight = i13;
            this.dashSpacing = i14;
            this.textMarginTop = i15;
            this.dashColor = universalColor;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getBlockWidth() {
            return this.blockWidth;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final UniversalColor getDashColor() {
            return this.dashColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final int getDashCount() {
            return this.dashCount;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Block)) {
                return false;
            }
            Block block = (Block) obj;
            return L.f(this.title, block.title) && L.f(this.subtitle, block.subtitle) && this.dashCount == block.dashCount && L.f(this.blockWidth, block.blockWidth) && this.dashHeight == block.dashHeight && this.dashSpacing == block.dashSpacing && this.textMarginTop == block.textMarginTop && L.f(this.dashColor, block.dashColor);
        }

        /* renamed from: f, reason: from getter */
        public final int getDashHeight() {
            return this.dashHeight;
        }

        /* renamed from: g, reason: from getter */
        public final int getDashSpacing() {
            return this.dashSpacing;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: h, reason: from getter */
        public final int getTextMarginTop() {
            return this.textMarginTop;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            AttributedText attributedText = this.subtitle;
            int iE2 = r.e(this.dashCount, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
            Integer num = this.blockWidth;
            return this.dashColor.hashCode() + r.e(this.textMarginTop, r.e(this.dashSpacing, r.e(this.dashHeight, (iE2 + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @k
        /* renamed from: i, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Block(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", dashCount=");
            sb2.append(this.dashCount);
            sb2.append(", blockWidth=");
            sb2.append(this.blockWidth);
            sb2.append(", dashHeight=");
            sb2.append(this.dashHeight);
            sb2.append(", dashSpacing=");
            sb2.append(this.dashSpacing);
            sb2.append(", textMarginTop=");
            sb2.append(this.textMarginTop);
            sb2.append(", dashColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.dashColor, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.subtitle, i12);
            parcel.writeInt(this.dashCount);
            Integer num = this.blockWidth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.dashHeight);
            parcel.writeInt(this.dashSpacing);
            parcel.writeInt(this.textMarginTop);
            parcel.writeParcelable(this.dashColor, i12);
        }
    }

    /* compiled from: HotelBookingInstallmentsItem.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/hotel/model/HotelLoanTerm$Progress;", "Landroid/os/Parcelable;", "", "blockSpacing", "Lcom/avito/android/hotel/model/HotelLoanTerm$Block;", "leftBlock", "rightBlock", "<init>", "(ILcom/avito/android/hotel/model/HotelLoanTerm$Block;Lcom/avito/android/hotel/model/HotelLoanTerm$Block;)V", "I", "c", "()I", "Lcom/avito/android/hotel/model/HotelLoanTerm$Block;", "d", "()Lcom/avito/android/hotel/model/HotelLoanTerm$Block;", "e", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Progress implements Parcelable {

        @k
        public static final Parcelable.Creator<Progress> CREATOR = new a();

        @c("blockSpacing")
        private final int blockSpacing;

        @c("leftBlock")
        @k
        private final Block leftBlock;

        @c("rightBlock")
        @k
        private final Block rightBlock;

        /* compiled from: HotelBookingInstallmentsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Progress> {
            @Override // android.os.Parcelable.Creator
            public final Progress createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                Parcelable.Creator<Block> creator = Block.CREATOR;
                return new Progress(i12, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Progress[] newArray(int i12) {
                return new Progress[i12];
            }
        }

        public Progress(int i12, @k Block block, @k Block block2) {
            this.blockSpacing = i12;
            this.leftBlock = block;
            this.rightBlock = block2;
        }

        /* renamed from: c, reason: from getter */
        public final int getBlockSpacing() {
            return this.blockSpacing;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Block getLeftBlock() {
            return this.leftBlock;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final Block getRightBlock() {
            return this.rightBlock;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return this.blockSpacing == progress.blockSpacing && L.f(this.leftBlock, progress.leftBlock) && L.f(this.rightBlock, progress.rightBlock);
        }

        public final int hashCode() {
            return this.rightBlock.hashCode() + ((this.leftBlock.hashCode() + (Integer.hashCode(this.blockSpacing) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Progress(blockSpacing=" + this.blockSpacing + ", leftBlock=" + this.leftBlock + ", rightBlock=" + this.rightBlock + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.blockSpacing);
            this.leftBlock.writeToParcel(parcel, i12);
            this.rightBlock.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: HotelBookingInstallmentsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelLoanTerm> {
        @Override // android.os.Parcelable.Creator
        public final HotelLoanTerm createFromParcel(Parcel parcel) {
            return new HotelLoanTerm(parcel.readString(), (AttributedText) parcel.readParcelable(HotelLoanTerm.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelLoanTerm.class.getClassLoader()), Progress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelLoanTerm[] newArray(int i12) {
            return new HotelLoanTerm[i12];
        }
    }

    public HotelLoanTerm(@l String str, @k AttributedText attributedText, @l AttributedText attributedText2, @k Progress progress, @k String str2) {
        this.id = str;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.progress = progress;
        this.termTitle = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTermTitle() {
        return this.termTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelLoanTerm)) {
            return false;
        }
        HotelLoanTerm hotelLoanTerm = (HotelLoanTerm) obj;
        return L.f(this.id, hotelLoanTerm.id) && L.f(this.title, hotelLoanTerm.title) && L.f(this.subtitle, hotelLoanTerm.subtitle) && L.f(this.progress, hotelLoanTerm.progress) && L.f(this.termTitle, hotelLoanTerm.termTitle);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        String str = this.id;
        int iB2 = com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        AttributedText attributedText = this.subtitle;
        return this.termTitle.hashCode() + ((this.progress.hashCode() + ((iB2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelLoanTerm(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", termTitle=");
        return C22026a.c(sb2, this.termTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.subtitle, i12);
        this.progress.writeToParcel(parcel, i12);
        parcel.writeString(this.termTitle);
    }
}
