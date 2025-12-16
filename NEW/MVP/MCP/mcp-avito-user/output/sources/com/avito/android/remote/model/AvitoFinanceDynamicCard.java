package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBaseCard.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0092\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0016J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010!R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010#R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bE\u0010#¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceDynamicCard;", "Landroid/os/Parcelable;", "", "id", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "imagePosition", "Lcom/avito/android/remote/model/AvitoFinanceBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/AvitoFinanceButton;", "button", "", "weight", "", "Lcom/avito/android/remote/model/AvitoFinanceAction;", "onSelect", "onAppear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/AvitoFinanceBackground;Lcom/avito/android/remote/model/AvitoFinanceButton;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "component6", "()Lcom/avito/android/remote/model/AvitoFinanceBackground;", "component7", "()Lcom/avito/android/remote/model/AvitoFinanceButton;", "component8", "()Ljava/lang/Integer;", "component9", "()Ljava/util/List;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/AvitoFinanceBackground;Lcom/avito/android/remote/model/AvitoFinanceButton;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/AvitoFinanceDynamicCard;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getImagePosition", "Lcom/avito/android/remote/model/AvitoFinanceBackground;", "getBackground", "Lcom/avito/android/remote/model/AvitoFinanceButton;", "getButton", "Ljava/lang/Integer;", "getWeight", "Ljava/util/List;", "getOnSelect", "getOnAppear", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoFinanceDynamicCard implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceDynamicCard> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final AvitoFinanceBackground background;

    @c("button")
    @l
    private final AvitoFinanceButton button;

    @c("id")
    @k
    private final String id;

    @c("image")
    @l
    private final UniversalImage image;

    @c("imagePosition")
    @l
    private final String imagePosition;

    @c("onAppear")
    @l
    private final List<AvitoFinanceAction> onAppear;

    @c("onSelect")
    @l
    private final List<AvitoFinanceAction> onSelect;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("weight")
    @l
    private final Integer weight;

    /* compiled from: AvitoFinanceBaseCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoFinanceDynamicCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceDynamicCard createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(AvitoFinanceDynamicCard.class.getClassLoader());
            String string4 = parcel.readString();
            AvitoFinanceBackground avitoFinanceBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : AvitoFinanceBackground.CREATOR.createFromParcel(parcel);
            AvitoFinanceButton avitoFinanceButtonCreateFromParcel = parcel.readInt() == 0 ? null : AvitoFinanceButton.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(AvitoFinanceDynamicCard.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(AvitoFinanceDynamicCard.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AvitoFinanceDynamicCard(string, string2, string3, universalImage, string4, avitoFinanceBackgroundCreateFromParcel, avitoFinanceButtonCreateFromParcel, numValueOf, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceDynamicCard[] newArray(int i12) {
            return new AvitoFinanceDynamicCard[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoFinanceDynamicCard(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l String str4, @l AvitoFinanceBackground avitoFinanceBackground, @l AvitoFinanceButton avitoFinanceButton, @l Integer num, @l List<? extends AvitoFinanceAction> list, @l List<? extends AvitoFinanceAction> list2) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.image = universalImage;
        this.imagePosition = str4;
        this.background = avitoFinanceBackground;
        this.button = avitoFinanceButton;
        this.weight = num;
        this.onSelect = list;
        this.onAppear = list2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<AvitoFinanceAction> component10() {
        return this.onAppear;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getImagePosition() {
        return this.imagePosition;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AvitoFinanceBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AvitoFinanceButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    @l
    public final List<AvitoFinanceAction> component9() {
        return this.onSelect;
    }

    @k
    public final AvitoFinanceDynamicCard copy(@k String id2, @l String title, @l String subtitle, @l UniversalImage image, @l String imagePosition, @l AvitoFinanceBackground background, @l AvitoFinanceButton button, @l Integer weight, @l List<? extends AvitoFinanceAction> onSelect, @l List<? extends AvitoFinanceAction> onAppear) {
        return new AvitoFinanceDynamicCard(id2, title, subtitle, image, imagePosition, background, button, weight, onSelect, onAppear);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoFinanceDynamicCard)) {
            return false;
        }
        AvitoFinanceDynamicCard avitoFinanceDynamicCard = (AvitoFinanceDynamicCard) other;
        return L.f(this.id, avitoFinanceDynamicCard.id) && L.f(this.title, avitoFinanceDynamicCard.title) && L.f(this.subtitle, avitoFinanceDynamicCard.subtitle) && L.f(this.image, avitoFinanceDynamicCard.image) && L.f(this.imagePosition, avitoFinanceDynamicCard.imagePosition) && L.f(this.background, avitoFinanceDynamicCard.background) && L.f(this.button, avitoFinanceDynamicCard.button) && L.f(this.weight, avitoFinanceDynamicCard.weight) && L.f(this.onSelect, avitoFinanceDynamicCard.onSelect) && L.f(this.onAppear, avitoFinanceDynamicCard.onAppear);
    }

    @l
    public final AvitoFinanceBackground getBackground() {
        return this.background;
    }

    @l
    public final AvitoFinanceButton getButton() {
        return this.button;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getImagePosition() {
        return this.imagePosition;
    }

    @l
    public final List<AvitoFinanceAction> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<AvitoFinanceAction> getOnSelect() {
        return this.onSelect;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.imagePosition;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvitoFinanceBackground avitoFinanceBackground = this.background;
        int iHashCode6 = (iHashCode5 + (avitoFinanceBackground == null ? 0 : avitoFinanceBackground.hashCode())) * 31;
        AvitoFinanceButton avitoFinanceButton = this.button;
        int iHashCode7 = (iHashCode6 + (avitoFinanceButton == null ? 0 : avitoFinanceButton.hashCode())) * 31;
        Integer num = this.weight;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<AvitoFinanceAction> list = this.onSelect;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<AvitoFinanceAction> list2 = this.onAppear;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceDynamicCard(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", imagePosition=");
        sb2.append(this.imagePosition);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", weight=");
        sb2.append(this.weight);
        sb2.append(", onSelect=");
        sb2.append(this.onSelect);
        sb2.append(", onAppear=");
        return H.p(sb2, this.onAppear, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.imagePosition);
        AvitoFinanceBackground avitoFinanceBackground = this.background;
        if (avitoFinanceBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoFinanceBackground.writeToParcel(parcel, flags);
        }
        AvitoFinanceButton avitoFinanceButton = this.button;
        if (avitoFinanceButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoFinanceButton.writeToParcel(parcel, flags);
        }
        Integer num = this.weight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<AvitoFinanceAction> list = this.onSelect;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<AvitoFinanceAction> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
