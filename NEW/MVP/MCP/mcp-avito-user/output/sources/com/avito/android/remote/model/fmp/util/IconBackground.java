package com.avito.android.remote.model.fmp.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Icons.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/fmp/util/IconBackground;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "cornerRadius", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Integer;)Lcom/avito/android/remote/model/fmp/util/IconBackground;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Ljava/lang/Integer;", "getCornerRadius", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IconBackground implements Parcelable {

    @k
    public static final Parcelable.Creator<IconBackground> CREATOR = new Creator();

    @c("color")
    @l
    private final UniversalColor color;

    @c("cornerRadius")
    @l
    private final Integer cornerRadius;

    /* compiled from: Icons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconBackground> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IconBackground createFromParcel(@k Parcel parcel) {
            return new IconBackground((UniversalColor) parcel.readParcelable(IconBackground.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IconBackground[] newArray(int i12) {
            return new IconBackground[i12];
        }
    }

    public IconBackground(@l UniversalColor universalColor, @l Integer num) {
        this.color = universalColor;
        this.cornerRadius = num;
    }

    public static /* synthetic */ IconBackground copy$default(IconBackground iconBackground, UniversalColor universalColor, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = iconBackground.color;
        }
        if ((i12 & 2) != 0) {
            num = iconBackground.cornerRadius;
        }
        return iconBackground.copy(universalColor, num);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @k
    public final IconBackground copy(@l UniversalColor color, @l Integer cornerRadius) {
        return new IconBackground(color, cornerRadius);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconBackground)) {
            return false;
        }
        IconBackground iconBackground = (IconBackground) other;
        return L.f(this.color, iconBackground.color) && L.f(this.cornerRadius, iconBackground.cornerRadius);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        UniversalColor universalColor = this.color;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        Integer num = this.cornerRadius;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IconBackground(color=");
        sb2.append(this.color);
        sb2.append(", cornerRadius=");
        return s.j(sb2, this.cornerRadius, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
