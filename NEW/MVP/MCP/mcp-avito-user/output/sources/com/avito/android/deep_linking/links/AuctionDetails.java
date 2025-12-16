package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AuctionDetailsBottomSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dBI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionDetails;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/deep_linking/links/AuctionDetails$AuctionDetailsListElement;", "elements", "footer", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "buttonText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Lcom/avito/android/remote/model/UniversalImage;", "f", "()Lcom/avito/android/remote/model/UniversalImage;", "c", "AuctionDetailsListElement", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AuctionDetails implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AuctionDetails> CREATOR = new a();

    @com.google.gson.annotations.c("buttonText")
    @Y61.l
    private final String buttonText;

    @com.google.gson.annotations.c("detailsElements")
    @Y61.l
    private final List<AuctionDetailsListElement> elements;

    @com.google.gson.annotations.c("footer")
    @Y61.l
    private final AttributedText footer;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final UniversalImage universalImage;

    /* compiled from: AuctionDetailsBottomSheetLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionDetails$AuctionDetailsListElement;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuctionDetailsListElement implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AuctionDetailsListElement> CREATOR = new a();

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        /* compiled from: AuctionDetailsBottomSheetLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AuctionDetailsListElement> {
            @Override // android.os.Parcelable.Creator
            public final AuctionDetailsListElement createFromParcel(Parcel parcel) {
                return new AuctionDetailsListElement(parcel.readString(), (AttributedText) parcel.readParcelable(AuctionDetailsListElement.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AuctionDetailsListElement[] newArray(int i12) {
                return new AuctionDetailsListElement[i12];
            }
        }

        public AuctionDetailsListElement(@Y61.l String str, @Y61.l AttributedText attributedText) {
            this.title = str;
            this.description = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuctionDetailsListElement)) {
                return false;
            }
            AuctionDetailsListElement auctionDetailsListElement = (AuctionDetailsListElement) obj;
            return kotlin.jvm.internal.L.f(this.title, auctionDetailsListElement.title) && kotlin.jvm.internal.L.f(this.description, auctionDetailsListElement.description);
        }

        @Y61.l
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.description;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AuctionDetailsListElement(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.description, i12);
        }
    }

    /* compiled from: AuctionDetailsBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionDetails> {
        @Override // android.os.Parcelable.Creator
        public final AuctionDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AuctionDetails.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AuctionDetailsListElement.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AuctionDetails(string, attributedText, arrayList, (AttributedText) parcel.readParcelable(AuctionDetails.class.getClassLoader()), (UniversalImage) parcel.readParcelable(AuctionDetails.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionDetails[] newArray(int i12) {
            return new AuctionDetails[i12];
        }
    }

    public AuctionDetails(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l List<AuctionDetailsListElement> list, @Y61.l AttributedText attributedText2, @Y61.l UniversalImage universalImage, @Y61.l String str2) {
        this.title = str;
        this.subtitle = attributedText;
        this.elements = list;
        this.footer = attributedText2;
        this.universalImage = universalImage;
        this.buttonText = str2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Y61.l
    public final List<AuctionDetailsListElement> d() {
        return this.elements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionDetails)) {
            return false;
        }
        AuctionDetails auctionDetails = (AuctionDetails) obj;
        return kotlin.jvm.internal.L.f(this.title, auctionDetails.title) && kotlin.jvm.internal.L.f(this.subtitle, auctionDetails.subtitle) && kotlin.jvm.internal.L.f(this.elements, auctionDetails.elements) && kotlin.jvm.internal.L.f(this.footer, auctionDetails.footer) && kotlin.jvm.internal.L.f(this.universalImage, auctionDetails.universalImage) && kotlin.jvm.internal.L.f(this.buttonText, auctionDetails.buttonText);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @Y61.l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<AuctionDetailsListElement> list = this.elements;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText2 = this.footer;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.buttonText;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionDetails(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", elements=");
        sb2.append(this.elements);
        sb2.append(", footer=");
        sb2.append(this.footer);
        sb2.append(", universalImage=");
        sb2.append(this.universalImage);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, i12);
        List<AuctionDetailsListElement> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AuctionDetailsListElement) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.footer, i12);
        parcel.writeParcelable(this.universalImage, i12);
        parcel.writeString(this.buttonText);
    }
}
