package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Verification.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/VerificationStep;", "Landroid/os/Parcelable;", "", "description", "errorMessage", "", "Lcom/avito/android/remote/model/VerificationStepType;", "types", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/VerificationStep;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "getErrorMessage", "Ljava/util/List;", "getTypes", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationStep implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationStep> CREATOR = new Creator();

    @c("description")
    @k
    private final String description;

    @c("errorMessage")
    @l
    private final String errorMessage;

    @c("types")
    @k
    private final List<VerificationStepType> types;

    /* compiled from: Verification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStep createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(VerificationStepType.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new VerificationStep(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStep[] newArray(int i12) {
            return new VerificationStep[i12];
        }
    }

    public VerificationStep(@k String str, @l String str2, @k List<VerificationStepType> list) {
        this.description = str;
        this.errorMessage = str2;
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerificationStep copy$default(VerificationStep verificationStep, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationStep.description;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationStep.errorMessage;
        }
        if ((i12 & 4) != 0) {
            list = verificationStep.types;
        }
        return verificationStep.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final List<VerificationStepType> component3() {
        return this.types;
    }

    @k
    public final VerificationStep copy(@k String description, @l String errorMessage, @k List<VerificationStepType> types) {
        return new VerificationStep(description, errorMessage, types);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationStep)) {
            return false;
        }
        VerificationStep verificationStep = (VerificationStep) other;
        return L.f(this.description, verificationStep.description) && L.f(this.errorMessage, verificationStep.errorMessage) && L.f(this.types, verificationStep.types);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final List<VerificationStepType> getTypes() {
        return this.types;
    }

    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        String str = this.errorMessage;
        return this.types.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStep(description=");
        sb2.append(this.description);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", types=");
        return H.p(sb2, this.types, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.description);
        parcel.writeString(this.errorMessage);
        Iterator itJ = C0.j(this.types, parcel);
        while (itJ.hasNext()) {
            ((VerificationStepType) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
