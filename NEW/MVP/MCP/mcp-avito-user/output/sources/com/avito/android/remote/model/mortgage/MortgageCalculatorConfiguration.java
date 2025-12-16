package com.avito.android.remote.model.mortgage;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MortgageCalculatorConfiguration.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/mortgage/MortgageCalculatorConfiguration;", "Landroid/os/Parcelable;", "", "entityType", "entityId", "Lcom/avito/android/remote/model/mortgage/MortgageSnippet;", "snippet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/mortgage/MortgageSnippet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEntityType", "()Ljava/lang/String;", "getEntityId", "Lcom/avito/android/remote/model/mortgage/MortgageSnippet;", "getSnippet", "()Lcom/avito/android/remote/model/mortgage/MortgageSnippet;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MortgageCalculatorConfiguration implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageCalculatorConfiguration> CREATOR = new Creator();

    @c("entityId")
    @l
    private final String entityId;

    @c("entityType")
    @k
    private final String entityType;

    @c(EntryPointParameter.TYPE)
    @l
    private final MortgageSnippet snippet;

    /* compiled from: MortgageCalculatorConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MortgageCalculatorConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageCalculatorConfiguration createFromParcel(@k Parcel parcel) {
            return new MortgageCalculatorConfiguration(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MortgageSnippet.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageCalculatorConfiguration[] newArray(int i12) {
            return new MortgageCalculatorConfiguration[i12];
        }
    }

    public MortgageCalculatorConfiguration(@k String str, @l String str2, @l MortgageSnippet mortgageSnippet) {
        this.entityType = str;
        this.entityId = str2;
        this.snippet = mortgageSnippet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getEntityId() {
        return this.entityId;
    }

    @k
    public final String getEntityType() {
        return this.entityType;
    }

    @l
    public final MortgageSnippet getSnippet() {
        return this.snippet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.entityType);
        parcel.writeString(this.entityId);
        MortgageSnippet mortgageSnippet = this.snippet;
        if (mortgageSnippet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mortgageSnippet.writeToParcel(parcel, flags);
        }
    }
}
