package com.avito.android.remote.model.messenger;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputState.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J2\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/messenger/InputState;", "Landroid/os/Parcelable;", "", "isDisabled", "", "reason", "description", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/InputState;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getReason", "getDescription", "CREATOR", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InputState implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final InputState DEFAULT_ENABLED_STATE = new InputState(false, null, null);

    @c("description")
    @l
    private final String description;

    @c("isDisabled")
    private final boolean isDisabled;

    @c("reason")
    @l
    private final String reason;

    /* compiled from: InputState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/messenger/InputState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/remote/model/messenger/InputState;", "()V", "DEFAULT_ENABLED_STATE", "getDEFAULT_ENABLED_STATE", "()Lcom/avito/android/remote/model/messenger/InputState;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/avito/android/remote/model/messenger/InputState;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.messenger.InputState$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<InputState> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final InputState getDEFAULT_ENABLED_STATE() {
            return InputState.DEFAULT_ENABLED_STATE;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public InputState createFromParcel(@k Parcel parcel) {
            return new InputState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public InputState[] newArray(int size) {
            return new InputState[size];
        }
    }

    public InputState(boolean z12, @l String str, @l String str2) {
        this.isDisabled = z12;
        this.reason = str;
        this.description = str2;
    }

    public static /* synthetic */ InputState copy$default(InputState inputState, boolean z12, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = inputState.isDisabled;
        }
        if ((i12 & 2) != 0) {
            str = inputState.reason;
        }
        if ((i12 & 4) != 0) {
            str2 = inputState.description;
        }
        return inputState.copy(z12, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final InputState copy(boolean isDisabled, @l String reason, @l String description) {
        return new InputState(isDisabled, reason, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputState)) {
            return false;
        }
        InputState inputState = (InputState) other;
        return this.isDisabled == inputState.isDisabled && L.f(this.reason, inputState.reason) && L.f(this.description, inputState.description);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isDisabled) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputState(isDisabled=");
        sb2.append(this.isDisabled);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeByte(this.isDisabled ? (byte) 1 : (byte) 0);
        parcel.writeString(this.reason);
        parcel.writeString(this.description);
    }

    public InputState(@k Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readString(), parcel.readString());
    }
}
