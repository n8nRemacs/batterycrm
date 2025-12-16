package com.avito.android.remote.model.developments_catalog;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AmenityButton.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/AmenityButton;", "Landroid/os/Parcelable;", "", "title", "type", "Lcom/avito/android/remote/model/Color;", "bgPressedColor", "bgUnpressedColor", "", "show", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Color;", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Z)Lcom/avito/android/remote/model/developments_catalog/AmenityButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getType", "Lcom/avito/android/remote/model/Color;", "getBgPressedColor", "getBgUnpressedColor", "Z", "getShow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AmenityButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AmenityButton> CREATOR = new Creator();

    @c("bgPressedColor")
    @l
    private final Color bgPressedColor;

    @c("bgUnpressedColor")
    @l
    private final Color bgUnpressedColor;

    @c("show")
    private final boolean show;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final String type;

    /* compiled from: AmenityButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AmenityButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AmenityButton createFromParcel(@k Parcel parcel) {
            return new AmenityButton(parcel.readString(), parcel.readString(), (Color) parcel.readParcelable(AmenityButton.class.getClassLoader()), (Color) parcel.readParcelable(AmenityButton.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AmenityButton[] newArray(int i12) {
            return new AmenityButton[i12];
        }
    }

    public AmenityButton() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ AmenityButton copy$default(AmenityButton amenityButton, String str, String str2, Color color, Color color2, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = amenityButton.title;
        }
        if ((i12 & 2) != 0) {
            str2 = amenityButton.type;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            color = amenityButton.bgPressedColor;
        }
        Color color3 = color;
        if ((i12 & 8) != 0) {
            color2 = amenityButton.bgUnpressedColor;
        }
        Color color4 = color2;
        if ((i12 & 16) != 0) {
            z12 = amenityButton.show;
        }
        return amenityButton.copy(str, str3, color3, color4, z12);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Color getBgPressedColor() {
        return this.bgPressedColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Color getBgUnpressedColor() {
        return this.bgUnpressedColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @k
    public final AmenityButton copy(@l String title, @l String type, @l Color bgPressedColor, @l Color bgUnpressedColor, boolean show) {
        return new AmenityButton(title, type, bgPressedColor, bgUnpressedColor, show);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmenityButton)) {
            return false;
        }
        AmenityButton amenityButton = (AmenityButton) other;
        return L.f(this.title, amenityButton.title) && L.f(this.type, amenityButton.type) && L.f(this.bgPressedColor, amenityButton.bgPressedColor) && L.f(this.bgUnpressedColor, amenityButton.bgUnpressedColor) && this.show == amenityButton.show;
    }

    @l
    public final Color getBgPressedColor() {
        return this.bgPressedColor;
    }

    @l
    public final Color getBgUnpressedColor() {
        return this.bgUnpressedColor;
    }

    public final boolean getShow() {
        return this.show;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color = this.bgPressedColor;
        int iHashCode3 = (iHashCode2 + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.bgUnpressedColor;
        return Boolean.hashCode(this.show) + ((iHashCode3 + (color2 != null ? color2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityButton(title=");
        sb2.append(this.title);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", bgPressedColor=");
        sb2.append(this.bgPressedColor);
        sb2.append(", bgUnpressedColor=");
        sb2.append(this.bgUnpressedColor);
        sb2.append(", show=");
        return r.x(sb2, this.show, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.bgPressedColor, flags);
        parcel.writeParcelable(this.bgUnpressedColor, flags);
        parcel.writeInt(this.show ? 1 : 0);
    }

    public AmenityButton(@l String str, @l String str2, @l Color color, @l Color color2, boolean z12) {
        this.title = str;
        this.type = str2;
        this.bgPressedColor = color;
        this.bgUnpressedColor = color2;
        this.show = z12;
    }

    public /* synthetic */ AmenityButton(String str, String str2, Color color, Color color2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : color, (i12 & 8) == 0 ? color2 : null, (i12 & 16) != 0 ? false : z12);
    }
}
