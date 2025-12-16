package com.avito.android.remote.model.category_parameters.slot.no_car;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NoCarSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;", "noCarText", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;)V", "", "getLink", "()Ljava/lang/String;", "getTitle", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;)Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;", "getNoCarText", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NoCarSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<NoCarSlotConfig> CREATOR = new Creator();

    @c("text")
    @k
    private final NoCarText noCarText;

    /* compiled from: NoCarSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NoCarSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarSlotConfig createFromParcel(@k Parcel parcel) {
            return new NoCarSlotConfig(NoCarText.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarSlotConfig[] newArray(int i12) {
            return new NoCarSlotConfig[i12];
        }
    }

    public NoCarSlotConfig(@k NoCarText noCarText) {
        this.noCarText = noCarText;
    }

    public static /* synthetic */ NoCarSlotConfig copy$default(NoCarSlotConfig noCarSlotConfig, NoCarText noCarText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            noCarText = noCarSlotConfig.noCarText;
        }
        return noCarSlotConfig.copy(noCarText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final NoCarText getNoCarText() {
        return this.noCarText;
    }

    @k
    public final NoCarSlotConfig copy(@k NoCarText noCarText) {
        return new NoCarSlotConfig(noCarText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NoCarSlotConfig) && L.f(this.noCarText, ((NoCarSlotConfig) other).noCarText);
    }

    @k
    public final String getLink() {
        return this.noCarText.getAttributes().getNoCarLink().getValue().getUrl();
    }

    @k
    public final NoCarText getNoCarText() {
        return this.noCarText;
    }

    @k
    public final String getTitle() {
        return this.noCarText.getAttributes().getNoCarLink().getValue().getTitle();
    }

    public int hashCode() {
        return this.noCarText.hashCode();
    }

    @k
    public String toString() {
        return "NoCarSlotConfig(noCarText=" + this.noCarText + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.noCarText.writeToParcel(parcel, flags);
    }
}
