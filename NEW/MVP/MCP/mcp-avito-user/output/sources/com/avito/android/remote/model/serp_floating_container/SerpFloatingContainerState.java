package com.avito.android.remote.model.serp_floating_container;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpFloatingContainerState.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/serp_floating_container/SerpFloatingContainerState;", "Landroid/os/Parcelable;", "", "alpha", "", "isVisible", "<init>", "(FZ)V", "component1", "()F", "component2", "()Z", "copy", "(FZ)Lcom/avito/android/remote/model/serp_floating_container/SerpFloatingContainerState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getAlpha", "Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SerpFloatingContainerState implements Parcelable {

    @k
    public static final Parcelable.Creator<SerpFloatingContainerState> CREATOR = new Creator();
    private final float alpha;
    private final boolean isVisible;

    /* compiled from: SerpFloatingContainerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpFloatingContainerState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpFloatingContainerState createFromParcel(@k Parcel parcel) {
            return new SerpFloatingContainerState(parcel.readFloat(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpFloatingContainerState[] newArray(int i12) {
            return new SerpFloatingContainerState[i12];
        }
    }

    public SerpFloatingContainerState() {
        this(0.0f, false, 3, null);
    }

    public static /* synthetic */ SerpFloatingContainerState copy$default(SerpFloatingContainerState serpFloatingContainerState, float f12, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = serpFloatingContainerState.alpha;
        }
        if ((i12 & 2) != 0) {
            z12 = serpFloatingContainerState.isVisible;
        }
        return serpFloatingContainerState.copy(f12, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    public final SerpFloatingContainerState copy(float alpha, boolean isVisible) {
        return new SerpFloatingContainerState(alpha, isVisible);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpFloatingContainerState)) {
            return false;
        }
        SerpFloatingContainerState serpFloatingContainerState = (SerpFloatingContainerState) other;
        return Float.compare(this.alpha, serpFloatingContainerState.alpha) == 0 && this.isVisible == serpFloatingContainerState.isVisible;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVisible) + (Float.hashCode(this.alpha) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SerpFloatingContainerState(alpha=");
        sb2.append(this.alpha);
        sb2.append(", isVisible=");
        return r.x(sb2, this.isVisible, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.isVisible ? 1 : 0);
    }

    public SerpFloatingContainerState(float f12, boolean z12) {
        this.alpha = f12;
        this.isVisible = z12;
    }

    public /* synthetic */ SerpFloatingContainerState(float f12, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? false : z12);
    }
}
