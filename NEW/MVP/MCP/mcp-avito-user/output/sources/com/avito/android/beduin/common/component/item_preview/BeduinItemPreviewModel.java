package com.avito.android.beduin.common.component.item_preview;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItemPreviewModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lcom/avito/android/beduin/common/component/item_preview/BeduinItemPreviewModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "titleStyle", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/item_preview/BeduinItemPreviewModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getTitleStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinItemPreviewModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinItemPreviewModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Image image;

    @k
    private final AttributedText title;

    @l
    private final String titleStyle;

    /* compiled from: BeduinItemPreviewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinItemPreviewModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinItemPreviewModel createFromParcel(Parcel parcel) {
            return new BeduinItemPreviewModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinItemPreviewModel.class.getClassLoader()), (Image) parcel.readParcelable(BeduinItemPreviewModel.class.getClassLoader()), (AttributedText) parcel.readParcelable(BeduinItemPreviewModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinItemPreviewModel[] newArray(int i12) {
            return new BeduinItemPreviewModel[i12];
        }
    }

    public BeduinItemPreviewModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Image image, @k AttributedText attributedText, @l String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.image = image;
        this.title = attributedText;
        this.titleStyle = str2;
    }

    public static /* synthetic */ BeduinItemPreviewModel copy$default(BeduinItemPreviewModel beduinItemPreviewModel, String str, DisplayingPredicate displayingPredicate, Image image, AttributedText attributedText, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinItemPreviewModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinItemPreviewModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            image = beduinItemPreviewModel.image;
        }
        Image image2 = image;
        if ((i12 & 8) != 0) {
            attributedText = beduinItemPreviewModel.title;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 16) != 0) {
            str2 = beduinItemPreviewModel.titleStyle;
        }
        return beduinItemPreviewModel.copy(str, displayingPredicate2, image2, attributedText2, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    @k
    public final BeduinItemPreviewModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Image image, @k AttributedText title, @l String titleStyle) {
        return new BeduinItemPreviewModel(id2, displayingPredicate, image, title, titleStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinItemPreviewModel)) {
            return false;
        }
        BeduinItemPreviewModel beduinItemPreviewModel = (BeduinItemPreviewModel) other;
        return L.f(this.id, beduinItemPreviewModel.id) && L.f(this.displayingPredicate, beduinItemPreviewModel.displayingPredicate) && L.f(this.image, beduinItemPreviewModel.image) && L.f(this.title, beduinItemPreviewModel.title) && L.f(this.titleStyle, beduinItemPreviewModel.titleStyle);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100948c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100947b() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Image image = this.image;
        int iB2 = com.avito.android.actions_sheet.a.b((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.title);
        String str = this.titleStyle;
        return iB2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItemPreviewModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", titleStyle=");
        return C22026a.c(sb2, this.titleStyle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.title, flags);
        parcel.writeString(this.titleStyle);
    }
}
