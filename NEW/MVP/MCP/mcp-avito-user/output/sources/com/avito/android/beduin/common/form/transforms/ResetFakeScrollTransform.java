package com.avito.android.beduin.common.form.transforms;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FakeScrollTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ResetFakeScrollTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lkotlin/G0;", "ignore", "<init>", "(Lkotlin/G0;)V", "component1", "()Lkotlin/G0;", "copy", "(Lkotlin/G0;)Lcom/avito/android/beduin/common/form/transforms/ResetFakeScrollTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlin/G0;", "getIgnore", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ResetFakeScrollTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<ResetFakeScrollTransform> CREATOR = new a();

    @l
    private final G0 ignore;

    /* compiled from: FakeScrollTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResetFakeScrollTransform> {
        @Override // android.os.Parcelable.Creator
        public final ResetFakeScrollTransform createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ResetFakeScrollTransform(G0.f406611a);
        }

        @Override // android.os.Parcelable.Creator
        public final ResetFakeScrollTransform[] newArray(int i12) {
            return new ResetFakeScrollTransform[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResetFakeScrollTransform() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ResetFakeScrollTransform copy$default(ResetFakeScrollTransform resetFakeScrollTransform, G0 g02, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            g02 = resetFakeScrollTransform.ignore;
        }
        return resetFakeScrollTransform.copy(g02);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final G0 getIgnore() {
        return this.ignore;
    }

    @k
    public final ResetFakeScrollTransform copy(@l G0 ignore) {
        return new ResetFakeScrollTransform(ignore);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResetFakeScrollTransform) && L.f(this.ignore, ((ResetFakeScrollTransform) other).ignore);
    }

    @l
    public final G0 getIgnore() {
        return this.ignore;
    }

    public int hashCode() {
        G0 g02 = this.ignore;
        if (g02 == null) {
            return 0;
        }
        return g02.hashCode();
    }

    @k
    public String toString() {
        return c.v(new StringBuilder("ResetFakeScrollTransform(ignore="), this.ignore, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(1);
    }

    public ResetFakeScrollTransform(@l G0 g02) {
        this.ignore = g02;
    }

    public /* synthetic */ ResetFakeScrollTransform(G0 g02, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : g02);
    }
}
