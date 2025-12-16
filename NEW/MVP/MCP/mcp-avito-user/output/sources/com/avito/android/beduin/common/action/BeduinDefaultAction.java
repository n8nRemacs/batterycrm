package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;

/* compiled from: BeduinDefaultAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinDefaultAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinDefaultAction implements BeduinAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinDefaultAction> CREATOR = new a();

    /* compiled from: BeduinDefaultAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinDefaultAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinDefaultAction createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new BeduinDefaultAction();
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinDefaultAction[] newArray(int i12) {
            return new BeduinDefaultAction[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this != obj) {
            if (!BeduinDefaultAction.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return BeduinDefaultAction.class.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
