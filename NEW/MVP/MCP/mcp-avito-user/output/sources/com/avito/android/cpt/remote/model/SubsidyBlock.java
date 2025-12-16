package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ActivationEstimateResponseV2.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/cpt/remote/model/SubsidyBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "", "amountPenny", "", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "c", "()J", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubsidyBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<SubsidyBlock> CREATOR = new a();

    @c("amountPenny")
    private final long amountPenny;

    @c("label")
    @k
    private final AttributedText label;

    @c("value")
    @k
    private final String value;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubsidyBlock> {
        @Override // android.os.Parcelable.Creator
        public final SubsidyBlock createFromParcel(Parcel parcel) {
            return new SubsidyBlock((AttributedText) parcel.readParcelable(SubsidyBlock.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SubsidyBlock[] newArray(int i12) {
            return new SubsidyBlock[i12];
        }
    }

    public SubsidyBlock(@k AttributedText attributedText, long j12, @k String str) {
        this.label = attributedText;
        this.amountPenny = j12;
        this.value = str;
    }

    /* renamed from: c, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.label, i12);
        parcel.writeLong(this.amountPenny);
        parcel.writeString(this.value);
    }
}
