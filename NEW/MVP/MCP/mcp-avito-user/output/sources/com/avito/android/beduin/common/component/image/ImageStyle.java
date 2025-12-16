package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b7\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b8\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001b¨\u0006="}, d2 = {"Lcom/avito/android/beduin/common/component/image/ImageStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "", "cornerRadius", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "loadingColor", "errorColor", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "overlay", "Lcom/avito/android/beduin/common/component/image/BorderStyle;", "border", "<init>", "(Lcom/avito/android/beduin/common/container/Corners;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/OverlayStyle;Lcom/avito/android/beduin/common/component/image/BorderStyle;)V", "component1", "()Lcom/avito/android/beduin/common/container/Corners;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "component5", "component6", "()Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "component7", "()Lcom/avito/android/beduin/common/component/image/BorderStyle;", "copy", "(Lcom/avito/android/beduin/common/container/Corners;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/OverlayStyle;Lcom/avito/android/beduin/common/component/image/BorderStyle;)Lcom/avito/android/beduin/common/component/image/ImageStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/container/Corners;", "getCorners", "Ljava/lang/Integer;", "getCornerRadius", "getCornerRadius$annotations", "()V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getLoadingColor", "getErrorColor", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "getOverlay", "Lcom/avito/android/beduin/common/component/image/BorderStyle;", "getBorder", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ImageStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageStyle> CREATOR = new a();

    @l
    private final UniversalColor backgroundColor;

    @l
    private final BorderStyle border;

    @l
    private final Integer cornerRadius;

    @l
    private final Corners corners;

    @l
    private final UniversalColor errorColor;

    @l
    private final UniversalColor loadingColor;

    @l
    private final OverlayStyle overlay;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageStyle> {
        @Override // android.os.Parcelable.Creator
        public final ImageStyle createFromParcel(Parcel parcel) {
            return new ImageStyle(parcel.readInt() == 0 ? null : Corners.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(ImageStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ImageStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ImageStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : OverlayStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BorderStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStyle[] newArray(int i12) {
            return new ImageStyle[i12];
        }
    }

    public ImageStyle(@l Corners corners, @l Integer num, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l OverlayStyle overlayStyle, @l BorderStyle borderStyle) {
        this.corners = corners;
        this.cornerRadius = num;
        this.backgroundColor = universalColor;
        this.loadingColor = universalColor2;
        this.errorColor = universalColor3;
        this.overlay = overlayStyle;
        this.border = borderStyle;
    }

    public static /* synthetic */ ImageStyle copy$default(ImageStyle imageStyle, Corners corners, Integer num, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, OverlayStyle overlayStyle, BorderStyle borderStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            corners = imageStyle.corners;
        }
        if ((i12 & 2) != 0) {
            num = imageStyle.cornerRadius;
        }
        Integer num2 = num;
        if ((i12 & 4) != 0) {
            universalColor = imageStyle.backgroundColor;
        }
        UniversalColor universalColor4 = universalColor;
        if ((i12 & 8) != 0) {
            universalColor2 = imageStyle.loadingColor;
        }
        UniversalColor universalColor5 = universalColor2;
        if ((i12 & 16) != 0) {
            universalColor3 = imageStyle.errorColor;
        }
        UniversalColor universalColor6 = universalColor3;
        if ((i12 & 32) != 0) {
            overlayStyle = imageStyle.overlay;
        }
        OverlayStyle overlayStyle2 = overlayStyle;
        if ((i12 & 64) != 0) {
            borderStyle = imageStyle.border;
        }
        return imageStyle.copy(corners, num2, universalColor4, universalColor5, universalColor6, overlayStyle2, borderStyle);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Corners getCorners() {
        return this.corners;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getLoadingColor() {
        return this.loadingColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getErrorColor() {
        return this.errorColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BorderStyle getBorder() {
        return this.border;
    }

    @k
    public final ImageStyle copy(@l Corners corners, @l Integer cornerRadius, @l UniversalColor backgroundColor, @l UniversalColor loadingColor, @l UniversalColor errorColor, @l OverlayStyle overlay, @l BorderStyle border) {
        return new ImageStyle(corners, cornerRadius, backgroundColor, loadingColor, errorColor, overlay, border);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageStyle)) {
            return false;
        }
        ImageStyle imageStyle = (ImageStyle) other;
        return L.f(this.corners, imageStyle.corners) && L.f(this.cornerRadius, imageStyle.cornerRadius) && L.f(this.backgroundColor, imageStyle.backgroundColor) && L.f(this.loadingColor, imageStyle.loadingColor) && L.f(this.errorColor, imageStyle.errorColor) && L.f(this.overlay, imageStyle.overlay) && L.f(this.border, imageStyle.border);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final BorderStyle getBorder() {
        return this.border;
    }

    @l
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    public final Corners getCorners() {
        return this.corners;
    }

    @l
    public final UniversalColor getErrorColor() {
        return this.errorColor;
    }

    @l
    public final UniversalColor getLoadingColor() {
        return this.loadingColor;
    }

    @l
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    public int hashCode() {
        Corners corners = this.corners;
        int iHashCode = (corners == null ? 0 : corners.hashCode()) * 31;
        Integer num = this.cornerRadius;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.loadingColor;
        int iHashCode4 = (iHashCode3 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.errorColor;
        int iHashCode5 = (iHashCode4 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        OverlayStyle overlayStyle = this.overlay;
        int iHashCode6 = (iHashCode5 + (overlayStyle == null ? 0 : overlayStyle.hashCode())) * 31;
        BorderStyle borderStyle = this.border;
        return iHashCode6 + (borderStyle != null ? borderStyle.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ImageStyle(corners=" + this.corners + ", cornerRadius=" + this.cornerRadius + ", backgroundColor=" + this.backgroundColor + ", loadingColor=" + this.loadingColor + ", errorColor=" + this.errorColor + ", overlay=" + this.overlay + ", border=" + this.border + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Corners corners = this.corners;
        if (corners == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            corners.writeToParcel(parcel, flags);
        }
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.loadingColor, flags);
        parcel.writeParcelable(this.errorColor, flags);
        OverlayStyle overlayStyle = this.overlay;
        if (overlayStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayStyle.writeToParcel(parcel, flags);
        }
        BorderStyle borderStyle = this.border;
        if (borderStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            borderStyle.writeToParcel(parcel, flags);
        }
    }

    @InterfaceC42830m
    public static /* synthetic */ void getCornerRadius$annotations() {
    }
}
