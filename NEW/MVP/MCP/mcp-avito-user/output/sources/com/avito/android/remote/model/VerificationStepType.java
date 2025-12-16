package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Verification.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/VerificationStepType;", "Landroid/os/Parcelable;", "", "title", "value", "Lcom/avito/android/remote/model/VerificationStepTypeOrientation;", "orientation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/VerificationStepTypeOrientation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/VerificationStepTypeOrientation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/VerificationStepTypeOrientation;)Lcom/avito/android/remote/model/VerificationStepType;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "Lcom/avito/android/remote/model/VerificationStepTypeOrientation;", "getOrientation", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationStepType implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationStepType> CREATOR = new Creator();

    @c("orientation")
    @l
    private final VerificationStepTypeOrientation orientation;

    @c("title")
    @k
    private final String title;

    @c("value")
    @k
    private final String value;

    /* compiled from: Verification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationStepType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStepType createFromParcel(@k Parcel parcel) {
            return new VerificationStepType(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VerificationStepTypeOrientation.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStepType[] newArray(int i12) {
            return new VerificationStepType[i12];
        }
    }

    public VerificationStepType(@k String str, @k String str2, @l VerificationStepTypeOrientation verificationStepTypeOrientation) {
        this.title = str;
        this.value = str2;
        this.orientation = verificationStepTypeOrientation;
    }

    public static /* synthetic */ VerificationStepType copy$default(VerificationStepType verificationStepType, String str, String str2, VerificationStepTypeOrientation verificationStepTypeOrientation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationStepType.title;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationStepType.value;
        }
        if ((i12 & 4) != 0) {
            verificationStepTypeOrientation = verificationStepType.orientation;
        }
        return verificationStepType.copy(str, str2, verificationStepTypeOrientation);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final VerificationStepTypeOrientation getOrientation() {
        return this.orientation;
    }

    @k
    public final VerificationStepType copy(@k String title, @k String value, @l VerificationStepTypeOrientation orientation) {
        return new VerificationStepType(title, value, orientation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationStepType)) {
            return false;
        }
        VerificationStepType verificationStepType = (VerificationStepType) other;
        return L.f(this.title, verificationStepType.title) && L.f(this.value, verificationStepType.value) && this.orientation == verificationStepType.orientation;
    }

    @l
    public final VerificationStepTypeOrientation getOrientation() {
        return this.orientation;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.value);
        VerificationStepTypeOrientation verificationStepTypeOrientation = this.orientation;
        return iD2 + (verificationStepTypeOrientation == null ? 0 : verificationStepTypeOrientation.hashCode());
    }

    @k
    public String toString() {
        return "VerificationStepType(title=" + this.title + ", value=" + this.value + ", orientation=" + this.orientation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        VerificationStepTypeOrientation verificationStepTypeOrientation = this.orientation;
        if (verificationStepTypeOrientation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verificationStepTypeOrientation.name());
        }
    }
}
