package com.avito.android.remote.model.beduin_teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTeaser.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/beduin_teaser/BeduinTeaser;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;", "fullscreen", "slideTeaser", "<init>", "(Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;)V", "component1", "()Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;", "component2", "copy", "(Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;)Lcom/avito/android/remote/model/beduin_teaser/BeduinTeaser;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;", "getFullscreen", "getSlideTeaser", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BeduinTeaser implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinTeaser> CREATOR = new Creator();

    @c("fullscreen")
    @l
    private final BeduinItemTeaser fullscreen;

    @c("slide")
    @l
    private final BeduinItemTeaser slideTeaser;

    /* compiled from: BeduinTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BeduinTeaser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinTeaser createFromParcel(@k Parcel parcel) {
            return new BeduinTeaser(parcel.readInt() == 0 ? null : BeduinItemTeaser.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinItemTeaser.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinTeaser[] newArray(int i12) {
            return new BeduinTeaser[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTeaser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeduinTeaser copy$default(BeduinTeaser beduinTeaser, BeduinItemTeaser beduinItemTeaser, BeduinItemTeaser beduinItemTeaser2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinItemTeaser = beduinTeaser.fullscreen;
        }
        if ((i12 & 2) != 0) {
            beduinItemTeaser2 = beduinTeaser.slideTeaser;
        }
        return beduinTeaser.copy(beduinItemTeaser, beduinItemTeaser2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BeduinItemTeaser getFullscreen() {
        return this.fullscreen;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinItemTeaser getSlideTeaser() {
        return this.slideTeaser;
    }

    @k
    public final BeduinTeaser copy(@l BeduinItemTeaser fullscreen, @l BeduinItemTeaser slideTeaser) {
        return new BeduinTeaser(fullscreen, slideTeaser);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTeaser)) {
            return false;
        }
        BeduinTeaser beduinTeaser = (BeduinTeaser) other;
        return L.f(this.fullscreen, beduinTeaser.fullscreen) && L.f(this.slideTeaser, beduinTeaser.slideTeaser);
    }

    @l
    public final BeduinItemTeaser getFullscreen() {
        return this.fullscreen;
    }

    @l
    public final BeduinItemTeaser getSlideTeaser() {
        return this.slideTeaser;
    }

    public int hashCode() {
        BeduinItemTeaser beduinItemTeaser = this.fullscreen;
        int iHashCode = (beduinItemTeaser == null ? 0 : beduinItemTeaser.hashCode()) * 31;
        BeduinItemTeaser beduinItemTeaser2 = this.slideTeaser;
        return iHashCode + (beduinItemTeaser2 != null ? beduinItemTeaser2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinTeaser(fullscreen=" + this.fullscreen + ", slideTeaser=" + this.slideTeaser + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        BeduinItemTeaser beduinItemTeaser = this.fullscreen;
        if (beduinItemTeaser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinItemTeaser.writeToParcel(parcel, flags);
        }
        BeduinItemTeaser beduinItemTeaser2 = this.slideTeaser;
        if (beduinItemTeaser2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinItemTeaser2.writeToParcel(parcel, flags);
        }
    }

    public BeduinTeaser(@l BeduinItemTeaser beduinItemTeaser, @l BeduinItemTeaser beduinItemTeaser2) {
        this.fullscreen = beduinItemTeaser;
        this.slideTeaser = beduinItemTeaser2;
    }

    public /* synthetic */ BeduinTeaser(BeduinItemTeaser beduinItemTeaser, BeduinItemTeaser beduinItemTeaser2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : beduinItemTeaser, (i12 & 2) != 0 ? null : beduinItemTeaser2);
    }
}
