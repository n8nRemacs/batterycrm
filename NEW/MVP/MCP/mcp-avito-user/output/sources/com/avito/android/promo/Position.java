package com.avito.android.promo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/promo/Position;", "Landroid/os/Parcelable;", "", "offsetX", "offsetY", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "d", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Position implements Parcelable {

    @k
    public static final Parcelable.Creator<Position> CREATOR = new a();

    @c("offsetX")
    @l
    private final Float offsetX;

    @c("offsetY")
    @l
    private final Float offsetY;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Position> {
        @Override // android.os.Parcelable.Creator
        public final Position createFromParcel(Parcel parcel) {
            return new Position(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Position[] newArray(int i12) {
            return new Position[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Position() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Float getOffsetX() {
        return this.offsetX;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Float getOffsetY() {
        return this.offsetY;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Float f12 = this.offsetX;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Float f13 = this.offsetY;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f13);
        }
    }

    public Position(@l Float f12, @l Float f13) {
        this.offsetX = f12;
        this.offsetY = f13;
    }

    public /* synthetic */ Position(Float f12, Float f13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : f12, (i12 & 2) != 0 ? null : f13);
    }
}
