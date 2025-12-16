package com.avito.android.beduin.common.component.favorite_button;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.IsFavoriteTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import fj.InterfaceC40429a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFavoriteButtonModel.kt */
@K51.d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b\f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b(\u0010\u0017¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lfj/a;", "", "id", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "_theme", "Lcom/avito/android/beduin/common/component/favorite_button/Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/favorite_button/Size;", "size", "", "isFavorite", "advertId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "analyticsSource", "fromSpace", "isRedesign", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/favorite_button/Style;Lcom/avito/android/beduin/common/component/favorite_button/Size;ZLjava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Lcom/avito/android/beduin/common/component/favorite_button/Style;", "f", "()Lcom/avito/android/beduin/common/component/favorite_button/Style;", "Lcom/avito/android/beduin/common/component/favorite_button/Size;", "e", "()Lcom/avito/android/beduin/common/component/favorite_button/Size;", "Z", "()Z", "setFavorite", "(Z)V", "getAdvertId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "c", "d", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinFavoriteButtonModel extends LeafBeduinModel implements InterfaceC40429a {

    @Y61.k
    public static final Parcelable.Creator<BeduinFavoriteButtonModel> CREATOR = new a();

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme _theme;

    @com.google.gson.annotations.c("advertisementId")
    @l
    private final String advertId;

    @com.google.gson.annotations.c("analyticsSource")
    @l
    private final String analyticsSource;

    /* renamed from: b, reason: collision with root package name */
    public transient boolean f101175b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public N f101176c;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("fromSpace")
    @l
    private final String fromSpace;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("isFavorite")
    private boolean isFavorite;

    @com.google.gson.annotations.c("size")
    @l
    private final Size size;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    /* compiled from: BeduinFavoriteButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinFavoriteButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinFavoriteButtonModel createFromParcel(Parcel parcel) {
            return new BeduinFavoriteButtonModel(parcel.readString(), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Size.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinFavoriteButtonModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinFavoriteButtonModel[] newArray(int i12) {
            return new BeduinFavoriteButtonModel[i12];
        }
    }

    public BeduinFavoriteButtonModel(@Y61.k String str, @l BeduinComponentTheme beduinComponentTheme, @l Style style, @l Size size, boolean z12, @l String str2, @l DisplayingPredicate displayingPredicate, @l String str3, @l String str4, boolean z13) {
        this.id = str;
        this._theme = beduinComponentTheme;
        this.style = style;
        this.size = size;
        this.isFavorite = z12;
        this.advertId = str2;
        this.displayingPredicate = displayingPredicate;
        this.analyticsSource = str3;
        this.fromSpace = str4;
        this.f101175b = z13;
    }

    public static BeduinFavoriteButtonModel a(BeduinFavoriteButtonModel beduinFavoriteButtonModel, boolean z12) {
        String str = beduinFavoriteButtonModel.id;
        BeduinComponentTheme beduinComponentTheme = beduinFavoriteButtonModel._theme;
        Style style = beduinFavoriteButtonModel.style;
        Size size = beduinFavoriteButtonModel.size;
        String str2 = beduinFavoriteButtonModel.advertId;
        DisplayingPredicate displayingPredicate = beduinFavoriteButtonModel.displayingPredicate;
        String str3 = beduinFavoriteButtonModel.analyticsSource;
        String str4 = beduinFavoriteButtonModel.fromSpace;
        boolean z13 = beduinFavoriteButtonModel.f101175b;
        beduinFavoriteButtonModel.getClass();
        return new BeduinFavoriteButtonModel(str, beduinComponentTheme, style, size, z12, str2, displayingPredicate, str3, str4, z13);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final BeduinModel apply(@Y61.k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof IsFavoriteTransform ? a(this, ((IsFavoriteTransform) beduinModelTransform).isFavorite()) : super.apply(beduinModelTransform);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAnalyticsSource() {
        return this.analyticsSource;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getFromSpace() {
        return this.fromSpace;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinFavoriteButtonModel)) {
            return false;
        }
        BeduinFavoriteButtonModel beduinFavoriteButtonModel = (BeduinFavoriteButtonModel) obj;
        return L.f(this.id, beduinFavoriteButtonModel.id) && this._theme == beduinFavoriteButtonModel._theme && this.style == beduinFavoriteButtonModel.style && L.f(this.size, beduinFavoriteButtonModel.size) && this.isFavorite == beduinFavoriteButtonModel.isFavorite && L.f(this.advertId, beduinFavoriteButtonModel.advertId) && L.f(this.displayingPredicate, beduinFavoriteButtonModel.displayingPredicate) && L.f(this.analyticsSource, beduinFavoriteButtonModel.analyticsSource) && L.f(this.fromSpace, beduinFavoriteButtonModel.fromSpace) && this.f101175b == beduinFavoriteButtonModel.f101175b;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Override // cj.InterfaceC27206d
    @l
    public final String getAdvertId() {
        return this.advertId;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final BeduinComponentTheme getTheme() {
        BeduinComponentTheme beduinComponentTheme = this._theme;
        return beduinComponentTheme == null ? BeduinComponentTheme.AVITO : beduinComponentTheme;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        BeduinComponentTheme beduinComponentTheme = this._theme;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        Style style = this.style;
        int iHashCode3 = (iHashCode2 + (style == null ? 0 : style.hashCode())) * 31;
        Size size = this.size;
        int i12 = r.i((iHashCode3 + (size == null ? 0 : size.hashCode())) * 31, 31, this.isFavorite);
        String str = this.advertId;
        int iHashCode4 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode5 = (iHashCode4 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str2 = this.analyticsSource;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromSpace;
        return Boolean.hashCode(this.f101175b) + ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // cj.InterfaceC27206d
    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // fj.InterfaceC40429a
    public final void setFavorite(boolean z12) {
        this.isFavorite = z12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinFavoriteButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", _theme=");
        sb2.append(this._theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", advertId=");
        sb2.append(this.advertId);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", analyticsSource=");
        sb2.append(this.analyticsSource);
        sb2.append(", fromSpace=");
        sb2.append(this.fromSpace);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f101175b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fj.InterfaceC40429a
    public final void u0(@l Y41.l<? super Boolean, G0> lVar) {
        this.f101176c = (N) lVar;
    }

    @Override // fj.InterfaceC40429a
    public final void v5(boolean z12) {
        this.f101175b = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        BeduinComponentTheme beduinComponentTheme = this._theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, i12);
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.advertId);
        parcel.writeParcelable(this.displayingPredicate, i12);
        parcel.writeString(this.analyticsSource);
        parcel.writeString(this.fromSpace);
        parcel.writeInt(this.f101175b ? 1 : 0);
    }
}
