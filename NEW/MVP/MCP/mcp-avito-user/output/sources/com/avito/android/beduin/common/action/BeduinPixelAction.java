package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.pixel.BeduinPixelModel;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPixelAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinPixelAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPixelAction implements BeduinAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinPixelAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BeduinPixelModel f99989b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final BeduinPixelActionScreenPosition f99990c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99991d;

    /* compiled from: BeduinPixelAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPixelAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPixelAction createFromParcel(Parcel parcel) {
            return new BeduinPixelAction(BeduinPixelModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinPixelActionScreenPosition.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPixelAction[] newArray(int i12) {
            return new BeduinPixelAction[i12];
        }
    }

    public BeduinPixelAction(@Y61.k BeduinPixelModel beduinPixelModel, @l BeduinPixelActionScreenPosition beduinPixelActionScreenPosition, boolean z12) {
        this.f99989b = beduinPixelModel;
        this.f99990c = beduinPixelActionScreenPosition;
        this.f99991d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinPixelAction)) {
            return false;
        }
        BeduinPixelAction beduinPixelAction = (BeduinPixelAction) obj;
        return L.f(this.f99989b, beduinPixelAction.f99989b) && L.f(this.f99990c, beduinPixelAction.f99990c) && this.f99991d == beduinPixelAction.f99991d;
    }

    public final int hashCode() {
        int iHashCode = this.f99989b.hashCode() * 31;
        BeduinPixelActionScreenPosition beduinPixelActionScreenPosition = this.f99990c;
        return Boolean.hashCode(this.f99991d) + ((iHashCode + (beduinPixelActionScreenPosition == null ? 0 : beduinPixelActionScreenPosition.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPixelAction(model=");
        sb2.append(this.f99989b);
        sb2.append(", screenPosition=");
        sb2.append(this.f99990c);
        sb2.append(", isBeforeDetach=");
        return r.x(sb2, this.f99991d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f99989b.writeToParcel(parcel, i12);
        BeduinPixelActionScreenPosition beduinPixelActionScreenPosition = this.f99990c;
        if (beduinPixelActionScreenPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinPixelActionScreenPosition.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f99991d ? 1 : 0);
    }

    public /* synthetic */ BeduinPixelAction(BeduinPixelModel beduinPixelModel, BeduinPixelActionScreenPosition beduinPixelActionScreenPosition, boolean z12, int i12, C42822w c42822w) {
        this(beduinPixelModel, (i12 & 2) != 0 ? null : beduinPixelActionScreenPosition, (i12 & 4) != 0 ? false : z12);
    }
}
