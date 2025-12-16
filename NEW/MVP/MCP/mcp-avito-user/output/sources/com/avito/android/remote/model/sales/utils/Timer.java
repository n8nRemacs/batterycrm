package com.avito.android.remote.model.sales.utils;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Timer.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/sales/utils/Timer;", "Landroid/os/Parcelable;", "", "ends", "Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(JLcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;)V", "component1", "()J", "component2", "()Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "copy", "(JLcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;)Lcom/avito/android/remote/model/sales/utils/Timer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getEnds", "Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "getStyle", "TimerStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Timer implements Parcelable {

    @k
    public static final Parcelable.Creator<Timer> CREATOR = new Creator();

    @c("ends")
    private final long ends;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final TimerStyle style;

    /* compiled from: Timer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Timer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Timer createFromParcel(@k Parcel parcel) {
            return new Timer(parcel.readLong(), parcel.readInt() == 0 ? null : TimerStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Timer[] newArray(int i12) {
            return new Timer[i12];
        }
    }

    /* compiled from: Timer.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "cellColor", "textColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getCellColor", "getTextColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimerStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<TimerStyle> CREATOR = new Creator();

        @c("cellColor")
        @k
        private final UniversalColor cellColor;

        @c("textColor")
        @k
        private final UniversalColor textColor;

        /* compiled from: Timer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TimerStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TimerStyle createFromParcel(@k Parcel parcel) {
                return new TimerStyle((UniversalColor) parcel.readParcelable(TimerStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(TimerStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TimerStyle[] newArray(int i12) {
                return new TimerStyle[i12];
            }
        }

        public TimerStyle(@k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.cellColor = universalColor;
            this.textColor = universalColor2;
        }

        public static /* synthetic */ TimerStyle copy$default(TimerStyle timerStyle, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = timerStyle.cellColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = timerStyle.textColor;
            }
            return timerStyle.copy(universalColor, universalColor2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getCellColor() {
            return this.cellColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        public final TimerStyle copy(@k UniversalColor cellColor, @k UniversalColor textColor) {
            return new TimerStyle(cellColor, textColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerStyle)) {
                return false;
            }
            TimerStyle timerStyle = (TimerStyle) other;
            return L.f(this.cellColor, timerStyle.cellColor) && L.f(this.textColor, timerStyle.textColor);
        }

        @k
        public final UniversalColor getCellColor() {
            return this.cellColor;
        }

        @k
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.textColor.hashCode() + (this.cellColor.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TimerStyle(cellColor=");
            sb2.append(this.cellColor);
            sb2.append(", textColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.textColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.cellColor, flags);
            parcel.writeParcelable(this.textColor, flags);
        }
    }

    public Timer(long j12, @l TimerStyle timerStyle) {
        this.ends = j12;
        this.style = timerStyle;
    }

    public static /* synthetic */ Timer copy$default(Timer timer, long j12, TimerStyle timerStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = timer.ends;
        }
        if ((i12 & 2) != 0) {
            timerStyle = timer.style;
        }
        return timer.copy(j12, timerStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final long getEnds() {
        return this.ends;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final TimerStyle getStyle() {
        return this.style;
    }

    @k
    public final Timer copy(long ends, @l TimerStyle style) {
        return new Timer(ends, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timer)) {
            return false;
        }
        Timer timer = (Timer) other;
        return this.ends == timer.ends && L.f(this.style, timer.style);
    }

    public final long getEnds() {
        return this.ends;
    }

    @l
    public final TimerStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.ends) * 31;
        TimerStyle timerStyle = this.style;
        return iHashCode + (timerStyle == null ? 0 : timerStyle.hashCode());
    }

    @k
    public String toString() {
        return "Timer(ends=" + this.ends + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.ends);
        TimerStyle timerStyle = this.style;
        if (timerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timerStyle.writeToParcel(parcel, flags);
        }
    }
}
