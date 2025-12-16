package com.avito.android.beduin.common.component.favorite_button;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFavoriteButtonModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Size implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Size> CREATOR = new a();

    @com.google.gson.annotations.c("height")
    @l
    private final Integer height;

    @com.google.gson.annotations.c("width")
    @l
    private final Integer width;

    /* compiled from: BeduinFavoriteButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Size> {
        @Override // android.os.Parcelable.Creator
        public final Size createFromParcel(Parcel parcel) {
            return new Size(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Size[] newArray(int i12) {
            return new Size[i12];
        }
    }

    public Size(@l Integer num, @l Integer num2) {
        this.width = num;
        this.height = num2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return L.f(this.width, size.width) && L.f(this.height, size.height);
    }

    public final int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Size(width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return s.j(sb2, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
