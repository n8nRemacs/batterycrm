package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBanner.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJf\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b:\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010\u001d¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "button", "", "componentSlug", "targetPage", "Lcom/avito/android/remote/model/Image;", "image", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/avito/android/remote/model/Image;", "component7", "component8", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/auto_select/AutoSelectBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "getButton", "Ljava/lang/String;", "getComponentSlug", "getTargetPage", "Lcom/avito/android/remote/model/Image;", "getImage", "getStyle", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectBanner> CREATOR = new Creator();

    @c("button")
    @k
    private final SelectButtonParams button;

    @c("componentSlug")
    @k
    private final String componentSlug;

    @c("description")
    @k
    private final AttributedText description;

    @c("image")
    @l
    private final Image image;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("targetPage")
    @k
    private final String targetPage;

    @c("title")
    @k
    private final AttributedText title;

    @c("universalImage")
    @l
    private final UniversalImage universalImage;

    /* compiled from: AutoSelectBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectBanner createFromParcel(@k Parcel parcel) {
            return new AutoSelectBanner((AttributedText) parcel.readParcelable(AutoSelectBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(AutoSelectBanner.class.getClassLoader()), SelectButtonParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(AutoSelectBanner.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(AutoSelectBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectBanner[] newArray(int i12) {
            return new AutoSelectBanner[i12];
        }
    }

    public AutoSelectBanner(@k AttributedText attributedText, @k AttributedText attributedText2, @k SelectButtonParams selectButtonParams, @k String str, @k String str2, @l Image image, @l String str3, @l UniversalImage universalImage) {
        this.title = attributedText;
        this.description = attributedText2;
        this.button = selectButtonParams;
        this.componentSlug = str;
        this.targetPage = str2;
        this.image = image;
        this.style = str3;
        this.universalImage = universalImage;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final SelectButtonParams getButton() {
        return this.button;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getTargetPage() {
        return this.targetPage;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @k
    public final AutoSelectBanner copy(@k AttributedText title, @k AttributedText description, @k SelectButtonParams button, @k String componentSlug, @k String targetPage, @l Image image, @l String style, @l UniversalImage universalImage) {
        return new AutoSelectBanner(title, description, button, componentSlug, targetPage, image, style, universalImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectBanner)) {
            return false;
        }
        AutoSelectBanner autoSelectBanner = (AutoSelectBanner) other;
        return L.f(this.title, autoSelectBanner.title) && L.f(this.description, autoSelectBanner.description) && L.f(this.button, autoSelectBanner.button) && L.f(this.componentSlug, autoSelectBanner.componentSlug) && L.f(this.targetPage, autoSelectBanner.targetPage) && L.f(this.image, autoSelectBanner.image) && L.f(this.style, autoSelectBanner.style) && L.f(this.universalImage, autoSelectBanner.universalImage);
    }

    @k
    public final SelectButtonParams getButton() {
        return this.button;
    }

    @k
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTargetPage() {
        return this.targetPage;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        int iD2 = H.d(H.d((this.button.hashCode() + a.b(this.title.hashCode() * 31, 31, this.description)) * 31, 31, this.componentSlug), 31, this.targetPage);
        Image image = this.image;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectBanner(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", componentSlug=");
        sb2.append(this.componentSlug);
        sb2.append(", targetPage=");
        sb2.append(this.targetPage);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", universalImage=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.universalImage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        this.button.writeToParcel(parcel, flags);
        parcel.writeString(this.componentSlug);
        parcel.writeString(this.targetPage);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.style);
        parcel.writeParcelable(this.universalImage, flags);
    }

    public /* synthetic */ AutoSelectBanner(AttributedText attributedText, AttributedText attributedText2, SelectButtonParams selectButtonParams, String str, String str2, Image image, String str3, UniversalImage universalImage, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, selectButtonParams, str, str2, (i12 & 32) != 0 ? null : image, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : universalImage);
    }
}
