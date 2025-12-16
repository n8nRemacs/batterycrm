package com.avito.android.remote.model.ux_feedback;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFeedbackConfigOld.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/ux_feedback/UxFeedbackConfigOld;", "Landroid/os/Parcelable;", "", "pollId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/ux_feedback/UxFeedbackConfigOld;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPollId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final /* data */ class UxFeedbackConfigOld implements Parcelable {

    @k
    public static final Parcelable.Creator<UxFeedbackConfigOld> CREATOR = new Creator();

    @c("pollId")
    @l
    private final String pollId;

    /* compiled from: UxFeedbackConfigOld.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UxFeedbackConfigOld> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UxFeedbackConfigOld createFromParcel(@k Parcel parcel) {
            return new UxFeedbackConfigOld(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UxFeedbackConfigOld[] newArray(int i12) {
            return new UxFeedbackConfigOld[i12];
        }
    }

    public UxFeedbackConfigOld(@l String str) {
        this.pollId = str;
    }

    public static /* synthetic */ UxFeedbackConfigOld copy$default(UxFeedbackConfigOld uxFeedbackConfigOld, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = uxFeedbackConfigOld.pollId;
        }
        return uxFeedbackConfigOld.copy(str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    @k
    public final UxFeedbackConfigOld copy(@l String pollId) {
        return new UxFeedbackConfigOld(pollId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UxFeedbackConfigOld) && L.f(this.pollId, ((UxFeedbackConfigOld) other).pollId);
    }

    @l
    public final String getPollId() {
        return this.pollId;
    }

    public int hashCode() {
        String str = this.pollId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("UxFeedbackConfigOld(pollId="), this.pollId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.pollId);
    }
}
