package com.avito.android.remote.model.messenger.voice;

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

/* compiled from: VoiceInfo.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "Landroid/os/Parcelable;", "", "duration", "", VoiceInfo.STATE, "", "error", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(JLjava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getDuration", "Ljava/lang/Integer;", "getState", "Ljava/lang/String;", "getError", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VoiceInfo implements Parcelable {

    @k
    public static final String DURATION = "duration";

    @k
    public static final String ERROR = "error";

    @k
    public static final String STATE = "state";

    @c("duration")
    private final long duration;

    @c("error")
    @l
    private final String error;

    @c(STATE)
    @l
    private final Integer state;

    @k
    public static final Parcelable.Creator<VoiceInfo> CREATOR = new Creator();

    /* compiled from: VoiceInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoiceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VoiceInfo createFromParcel(@k Parcel parcel) {
            return new VoiceInfo(parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VoiceInfo[] newArray(int i12) {
            return new VoiceInfo[i12];
        }
    }

    public VoiceInfo(long j12, @l Integer num, @l String str) {
        this.duration = j12;
        this.state = num;
        this.error = str;
    }

    public static /* synthetic */ VoiceInfo copy$default(VoiceInfo voiceInfo, long j12, Integer num, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = voiceInfo.duration;
        }
        if ((i12 & 2) != 0) {
            num = voiceInfo.state;
        }
        if ((i12 & 4) != 0) {
            str = voiceInfo.error;
        }
        return voiceInfo.copy(j12, num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @k
    public final VoiceInfo copy(long duration, @l Integer state, @l String error) {
        return new VoiceInfo(duration, state, error);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceInfo)) {
            return false;
        }
        VoiceInfo voiceInfo = (VoiceInfo) other;
        return this.duration == voiceInfo.duration && L.f(this.state, voiceInfo.state) && L.f(this.error, voiceInfo.error);
    }

    public final long getDuration() {
        return this.duration;
    }

    @l
    public final String getError() {
        return this.error;
    }

    @l
    public final Integer getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.duration) * 31;
        Integer num = this.state;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceInfo(duration=");
        sb2.append(this.duration);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", error=");
        return C22026a.c(sb2, this.error, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.duration);
        Integer num = this.state;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.error);
    }
}
