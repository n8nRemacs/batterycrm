package com.avito.android.remote.model.sales_banner_image_out_of_bounds;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesBannerImageOutOfBounds.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;", "Landroid/os/Parcelable;", "", "fraction", "", "pixelsFromStart", "pixelsFromEnd", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getFraction", "Ljava/lang/Integer;", "getPixelsFromStart", "getPixelsFromEnd", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class WidthLayout implements Parcelable {

    @k
    public static final Parcelable.Creator<WidthLayout> CREATOR = new Creator();

    @c("fraction")
    @l
    private final Float fraction;

    @c("pixelsFromEnd")
    @l
    private final Integer pixelsFromEnd;

    @c("pixelsFromStart")
    @l
    private final Integer pixelsFromStart;

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WidthLayout> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WidthLayout createFromParcel(@k Parcel parcel) {
            return new WidthLayout(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WidthLayout[] newArray(int i12) {
            return new WidthLayout[i12];
        }
    }

    public WidthLayout(@l Float f12, @l Integer num, @l Integer num2) {
        this.fraction = f12;
        this.pixelsFromStart = num;
        this.pixelsFromEnd = num2;
    }

    public static /* synthetic */ WidthLayout copy$default(WidthLayout widthLayout, Float f12, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = widthLayout.fraction;
        }
        if ((i12 & 2) != 0) {
            num = widthLayout.pixelsFromStart;
        }
        if ((i12 & 4) != 0) {
            num2 = widthLayout.pixelsFromEnd;
        }
        return widthLayout.copy(f12, num, num2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Float getFraction() {
        return this.fraction;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getPixelsFromStart() {
        return this.pixelsFromStart;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getPixelsFromEnd() {
        return this.pixelsFromEnd;
    }

    @k
    public final WidthLayout copy(@l Float fraction, @l Integer pixelsFromStart, @l Integer pixelsFromEnd) {
        return new WidthLayout(fraction, pixelsFromStart, pixelsFromEnd);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidthLayout)) {
            return false;
        }
        WidthLayout widthLayout = (WidthLayout) other;
        return L.f(this.fraction, widthLayout.fraction) && L.f(this.pixelsFromStart, widthLayout.pixelsFromStart) && L.f(this.pixelsFromEnd, widthLayout.pixelsFromEnd);
    }

    @l
    public final Float getFraction() {
        return this.fraction;
    }

    @l
    public final Integer getPixelsFromEnd() {
        return this.pixelsFromEnd;
    }

    @l
    public final Integer getPixelsFromStart() {
        return this.pixelsFromStart;
    }

    public int hashCode() {
        Float f12 = this.fraction;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        Integer num = this.pixelsFromStart;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pixelsFromEnd;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WidthLayout(fraction=");
        sb2.append(this.fraction);
        sb2.append(", pixelsFromStart=");
        sb2.append(this.pixelsFromStart);
        sb2.append(", pixelsFromEnd=");
        return s.j(sb2, this.pixelsFromEnd, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.fraction;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Integer num = this.pixelsFromStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.pixelsFromEnd;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }
}
