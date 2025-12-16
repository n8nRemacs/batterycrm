package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: IacPii.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "Lcom/avito/android/iac_dialer_models/abstract_module/b;", "Landroid/os/Parcelable;", "LdL/d;", "", "value", "<init>", "(J)V", "", "toStringUnmasked", "()Ljava/lang/String;", "unwrap", "()J", "component1", "copy", "(J)Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getValue", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPiiLong extends b implements Parcelable, dL.d {

    @k
    public static final Parcelable.Creator<IacPiiLong> CREATOR = new a();
    private final long value;

    /* compiled from: IacPii.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPiiLong> {
        @Override // android.os.Parcelable.Creator
        public final IacPiiLong createFromParcel(Parcel parcel) {
            return new IacPiiLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final IacPiiLong[] newArray(int i12) {
            return new IacPiiLong[i12];
        }
    }

    public IacPiiLong(long j12) {
        this.value = j12;
    }

    public static /* synthetic */ IacPiiLong copy$default(IacPiiLong iacPiiLong, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = iacPiiLong.value;
        }
        return iacPiiLong.copy(j12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @k
    public final IacPiiLong copy(long value) {
        return new IacPiiLong(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacPiiLong) && this.value == ((IacPiiLong) other).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    @Override // com.avito.android.iac_dialer_models.abstract_module.b
    @k
    public String toStringUnmasked() {
        return String.valueOf(this.value);
    }

    public final long unwrap() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.value);
    }
}
