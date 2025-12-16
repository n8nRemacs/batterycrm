package com.avito.android.remote.model.gallery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GalleryConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;", "counterPosition", "<init>", "(Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;)V", "component1", "()Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;", "copy", "(Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;)Lcom/avito/android/remote/model/gallery/GalleryConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;", "getCounterPosition", "CounterPosition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<GalleryConfig> CREATOR = new Creator();

    @c("counterPosition")
    @l
    private final CounterPosition counterPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryConfig$CounterPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "BOTTOM_RIGHT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class CounterPosition implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CounterPosition[] $VALUES;

        @c("bottomRight")
        public static final CounterPosition BOTTOM_RIGHT = new CounterPosition("BOTTOM_RIGHT", 0);

        @k
        public static final Parcelable.Creator<CounterPosition> CREATOR;

        /* compiled from: GalleryConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CounterPosition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CounterPosition createFromParcel(@k Parcel parcel) {
                return CounterPosition.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CounterPosition[] newArray(int i12) {
                return new CounterPosition[i12];
            }
        }

        private static final /* synthetic */ CounterPosition[] $values() {
            return new CounterPosition[]{BOTTOM_RIGHT};
        }

        static {
            CounterPosition[] counterPositionArr$values = $values();
            $VALUES = counterPositionArr$values;
            $ENTRIES = kotlin.enums.c.a(counterPositionArr$values);
            CREATOR = new Creator();
        }

        private CounterPosition(String str, int i12) {
        }

        @k
        public static a<CounterPosition> getEntries() {
            return $ENTRIES;
        }

        public static CounterPosition valueOf(String str) {
            return (CounterPosition) Enum.valueOf(CounterPosition.class, str);
        }

        public static CounterPosition[] values() {
            return (CounterPosition[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GalleryConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryConfig createFromParcel(@k Parcel parcel) {
            return new GalleryConfig(parcel.readInt() == 0 ? null : CounterPosition.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryConfig[] newArray(int i12) {
            return new GalleryConfig[i12];
        }
    }

    public GalleryConfig(@l CounterPosition counterPosition) {
        this.counterPosition = counterPosition;
    }

    public static /* synthetic */ GalleryConfig copy$default(GalleryConfig galleryConfig, CounterPosition counterPosition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            counterPosition = galleryConfig.counterPosition;
        }
        return galleryConfig.copy(counterPosition);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final CounterPosition getCounterPosition() {
        return this.counterPosition;
    }

    @k
    public final GalleryConfig copy(@l CounterPosition counterPosition) {
        return new GalleryConfig(counterPosition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GalleryConfig) && this.counterPosition == ((GalleryConfig) other).counterPosition;
    }

    @l
    public final CounterPosition getCounterPosition() {
        return this.counterPosition;
    }

    public int hashCode() {
        CounterPosition counterPosition = this.counterPosition;
        if (counterPosition == null) {
            return 0;
        }
        return counterPosition.hashCode();
    }

    @k
    public String toString() {
        return "GalleryConfig(counterPosition=" + this.counterPosition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        CounterPosition counterPosition = this.counterPosition;
        if (counterPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            counterPosition.writeToParcel(parcel, flags);
        }
    }
}
