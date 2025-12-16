package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapOnboardingResponse.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AnimatedIcon;", "Landroid/os/Parcelable;", "", "value", "valueDark", "", "repeatCount", "repeatMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/AnimatedIcon;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getValueDark", "Ljava/lang/Integer;", "getRepeatCount", "getRepeatMode", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AnimatedIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<AnimatedIcon> CREATOR = new Creator();

    @c("repeatCount")
    @l
    private final Integer repeatCount;

    @c("repeatMode")
    @l
    private final String repeatMode;

    @c("value")
    @l
    private final String value;

    @c("valueDark")
    @l
    private final String valueDark;

    /* compiled from: MapOnboardingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnimatedIcon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnimatedIcon createFromParcel(@k Parcel parcel) {
            return new AnimatedIcon(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnimatedIcon[] newArray(int i12) {
            return new AnimatedIcon[i12];
        }
    }

    public AnimatedIcon(@l String str, @l String str2, @l Integer num, @l String str3) {
        this.value = str;
        this.valueDark = str2;
        this.repeatCount = num;
        this.repeatMode = str3;
    }

    public static /* synthetic */ AnimatedIcon copy$default(AnimatedIcon animatedIcon, String str, String str2, Integer num, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = animatedIcon.value;
        }
        if ((i12 & 2) != 0) {
            str2 = animatedIcon.valueDark;
        }
        if ((i12 & 4) != 0) {
            num = animatedIcon.repeatCount;
        }
        if ((i12 & 8) != 0) {
            str3 = animatedIcon.repeatMode;
        }
        return animatedIcon.copy(str, str2, num, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getValueDark() {
        return this.valueDark;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getRepeatCount() {
        return this.repeatCount;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getRepeatMode() {
        return this.repeatMode;
    }

    @k
    public final AnimatedIcon copy(@l String value, @l String valueDark, @l Integer repeatCount, @l String repeatMode) {
        return new AnimatedIcon(value, valueDark, repeatCount, repeatMode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedIcon)) {
            return false;
        }
        AnimatedIcon animatedIcon = (AnimatedIcon) other;
        return L.f(this.value, animatedIcon.value) && L.f(this.valueDark, animatedIcon.valueDark) && L.f(this.repeatCount, animatedIcon.repeatCount) && L.f(this.repeatMode, animatedIcon.repeatMode);
    }

    @l
    public final Integer getRepeatCount() {
        return this.repeatCount;
    }

    @l
    public final String getRepeatMode() {
        return this.repeatMode;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    @l
    public final String getValueDark() {
        return this.valueDark;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.repeatCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.repeatMode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedIcon(value=");
        sb2.append(this.value);
        sb2.append(", valueDark=");
        sb2.append(this.valueDark);
        sb2.append(", repeatCount=");
        sb2.append(this.repeatCount);
        sb2.append(", repeatMode=");
        return C22026a.c(sb2, this.repeatMode, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.value);
        parcel.writeString(this.valueDark);
        Integer num = this.repeatCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.repeatMode);
    }
}
