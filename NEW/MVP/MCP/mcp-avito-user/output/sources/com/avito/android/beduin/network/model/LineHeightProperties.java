package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: LineHeightProperties.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/network/model/LineHeightProperties;", "Landroid/os/Parcelable;", "", "min", "max", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "component1", "()Ljava/lang/Float;", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/avito/android/beduin/network/model/LineHeightProperties;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getMin", "getMax", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LineHeightProperties implements Parcelable {

    @k
    public static final Parcelable.Creator<LineHeightProperties> CREATOR = new a();

    @l
    private final Float max;

    @l
    private final Float min;

    /* compiled from: LineHeightProperties.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LineHeightProperties> {
        @Override // android.os.Parcelable.Creator
        public final LineHeightProperties createFromParcel(Parcel parcel) {
            return new LineHeightProperties(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LineHeightProperties[] newArray(int i12) {
            return new LineHeightProperties[i12];
        }
    }

    public LineHeightProperties(@l Float f12, @l Float f13) {
        this.min = f12;
        this.max = f13;
    }

    public static /* synthetic */ LineHeightProperties copy$default(LineHeightProperties lineHeightProperties, Float f12, Float f13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = lineHeightProperties.min;
        }
        if ((i12 & 2) != 0) {
            f13 = lineHeightProperties.max;
        }
        return lineHeightProperties.copy(f12, f13);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Float getMin() {
        return this.min;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getMax() {
        return this.max;
    }

    @k
    public final LineHeightProperties copy(@l Float min, @l Float max) {
        return new LineHeightProperties(min, max);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightProperties)) {
            return false;
        }
        LineHeightProperties lineHeightProperties = (LineHeightProperties) other;
        return L.f(this.min, lineHeightProperties.min) && L.f(this.max, lineHeightProperties.max);
    }

    @l
    public final Float getMax() {
        return this.max;
    }

    @l
    public final Float getMin() {
        return this.min;
    }

    public int hashCode() {
        Float f12 = this.min;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        Float f13 = this.max;
        return iHashCode + (f13 != null ? f13.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightProperties(min=");
        sb2.append(this.min);
        sb2.append(", max=");
        return h.d(sb2, this.max, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.min;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Float f13 = this.max;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f13);
        }
    }
}
