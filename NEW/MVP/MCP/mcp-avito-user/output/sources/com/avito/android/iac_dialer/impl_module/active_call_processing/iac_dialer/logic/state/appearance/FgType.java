package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: FgType.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\t¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "LdL/d;", "Landroid/os/Parcelable;", "", "mic", "camera", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getMic", "getCamera", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FgType implements dL.d, Parcelable {
    public static final int $stable = 0;

    @Y61.k
    public static final Parcelable.Creator<FgType> CREATOR = new a();
    private final boolean camera;
    private final boolean mic;

    /* compiled from: FgType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FgType> {
        @Override // android.os.Parcelable.Creator
        public final FgType createFromParcel(Parcel parcel) {
            return new FgType(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FgType[] newArray(int i12) {
            return new FgType[i12];
        }
    }

    public FgType(boolean z12, boolean z13) {
        this.mic = z12;
        this.camera = z13;
    }

    public static /* synthetic */ FgType copy$default(FgType fgType, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = fgType.mic;
        }
        if ((i12 & 2) != 0) {
            z13 = fgType.camera;
        }
        return fgType.copy(z12, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMic() {
        return this.mic;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCamera() {
        return this.camera;
    }

    @Y61.k
    public final FgType copy(boolean mic, boolean camera) {
        return new FgType(mic, camera);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FgType)) {
            return false;
        }
        FgType fgType = (FgType) other;
        return this.mic == fgType.mic && this.camera == fgType.camera;
    }

    public final boolean getCamera() {
        return this.camera;
    }

    public final boolean getMic() {
        return this.mic;
    }

    public int hashCode() {
        return Boolean.hashCode(this.camera) + (Boolean.hashCode(this.mic) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FgType(mic=");
        sb2.append(this.mic);
        sb2.append(", camera=");
        return androidx.appcompat.app.r.x(sb2, this.camera, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.mic ? 1 : 0);
        parcel.writeInt(this.camera ? 1 : 0);
    }
}
