package com.avito.android.beduin.common.container;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Corners.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/beduin/common/container/Corners;", "Landroid/os/Parcelable;", "", ProfileTab.ALL, "_topLeft", "_topRight", "_bottomRight", "_bottomLeft", "Lcom/avito/android/remote/model/UniversalColor;", "staticColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalColor;", "f", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Corners implements Parcelable {

    @k
    public static final Parcelable.Creator<Corners> CREATOR = new a();

    @c("bottomLeft")
    @l
    private final Integer _bottomLeft;

    @c("bottomRight")
    @l
    private final Integer _bottomRight;

    @c("topLeft")
    @l
    private final Integer _topLeft;

    @c("topRight")
    @l
    private final Integer _topRight;

    @c("radius")
    @l
    private final Integer all;

    @c("staticColor")
    @l
    private final UniversalColor staticColor;

    /* compiled from: Corners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Corners> {
        @Override // android.os.Parcelable.Creator
        public final Corners createFromParcel(Parcel parcel) {
            return new Corners(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(Corners.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Corners[] newArray(int i12) {
            return new Corners[i12];
        }
    }

    public Corners(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l UniversalColor universalColor) {
        this.all = num;
        this._topLeft = num2;
        this._topRight = num3;
        this._bottomRight = num4;
        this._bottomLeft = num5;
        this.staticColor = universalColor;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getAll() {
        return this.all;
    }

    @l
    public final Integer d() {
        Integer num = this._bottomLeft;
        return num == null ? this.all : num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final Integer e() {
        Integer num = this._bottomRight;
        return num == null ? this.all : num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Corners.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Corners corners = (Corners) obj;
        return L.f(g(), corners.g()) && L.f(h(), corners.h()) && L.f(e(), corners.e()) && L.f(d(), corners.d());
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalColor getStaticColor() {
        return this.staticColor;
    }

    @l
    public final Integer g() {
        Integer num = this._topLeft;
        return num == null ? this.all : num;
    }

    @l
    public final Integer h() {
        Integer num = this._topRight;
        return num == null ? this.all : num;
    }

    public final int hashCode() {
        Integer numG = g();
        int iIntValue = (numG != null ? numG.intValue() : 0) * 31;
        Integer numH = h();
        int iIntValue2 = (iIntValue + (numH != null ? numH.intValue() : 0)) * 31;
        Integer numE = e();
        int iIntValue3 = (iIntValue2 + (numE != null ? numE.intValue() : 0)) * 31;
        Integer numD = d();
        return iIntValue3 + (numD != null ? numD.intValue() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Corners(all=");
        sb2.append(this.all);
        sb2.append(", _topLeft=");
        sb2.append(this._topLeft);
        sb2.append(", _topRight=");
        sb2.append(this._topRight);
        sb2.append(", _bottomRight=");
        sb2.append(this._bottomRight);
        sb2.append(", _bottomLeft=");
        sb2.append(this._bottomLeft);
        sb2.append(", staticColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.staticColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.all;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this._topLeft;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this._topRight;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this._bottomRight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        Integer num5 = this._bottomLeft;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        parcel.writeParcelable(this.staticColor, i12);
    }

    public /* synthetic */ Corners(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, UniversalColor universalColor, int i12, C42822w c42822w) {
        this(num, num2, num3, num4, num5, (i12 & 32) != 0 ? null : universalColor);
    }
}
