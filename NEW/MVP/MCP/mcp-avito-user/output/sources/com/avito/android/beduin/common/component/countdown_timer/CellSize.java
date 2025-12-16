package com.avito.android.beduin.common.component.countdown_timer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCountDownTimerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/CellSize;", "Landroid/os/Parcelable;", "", "width", "height", "_separatorSpace", "<init>", "(IILjava/lang/Integer;)V", "I", "getWidth", "()I", "getHeight", "Ljava/lang/Integer;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellSize implements Parcelable {

    @k
    public static final Parcelable.Creator<CellSize> CREATOR = new a();

    @com.google.gson.annotations.c("separatorSpace")
    @l
    private final Integer _separatorSpace;

    @com.google.gson.annotations.c("height")
    private final int height;

    @com.google.gson.annotations.c("width")
    private final int width;

    /* compiled from: BeduinCountDownTimerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CellSize> {
        @Override // android.os.Parcelable.Creator
        public final CellSize createFromParcel(Parcel parcel) {
            return new CellSize(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final CellSize[] newArray(int i12) {
            return new CellSize[i12];
        }
    }

    public CellSize(int i12, int i13, @l Integer num) {
        this.width = i12;
        this.height = i13;
        this._separatorSpace = num;
    }

    public final int c() {
        Integer num = this._separatorSpace;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellSize)) {
            return false;
        }
        CellSize cellSize = (CellSize) obj;
        return this.width == cellSize.width && this.height == cellSize.height && L.f(this._separatorSpace, cellSize._separatorSpace);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int iE2 = r.e(this.height, Integer.hashCode(this.width) * 31, 31);
        Integer num = this._separatorSpace;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellSize(width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", _separatorSpace=");
        return s.j(sb2, this._separatorSpace, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        Integer num = this._separatorSpace;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
