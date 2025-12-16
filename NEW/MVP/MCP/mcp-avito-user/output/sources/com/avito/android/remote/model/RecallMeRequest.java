package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeRequest.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/RecallMeRequest;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/RecallMeParams;", "recallParams", "<init>", "(Lcom/avito/android/remote/model/RecallMeParams;)V", "component1", "()Lcom/avito/android/remote/model/RecallMeParams;", "copy", "(Lcom/avito/android/remote/model/RecallMeParams;)Lcom/avito/android/remote/model/RecallMeRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/RecallMeParams;", "getRecallParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecallMeRequest implements Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeRequest> CREATOR = new Creator();

    @c("recallRequestFormParams")
    @k
    private final RecallMeParams recallParams;

    /* compiled from: RecallMeRequest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecallMeRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeRequest createFromParcel(@k Parcel parcel) {
            return new RecallMeRequest(RecallMeParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeRequest[] newArray(int i12) {
            return new RecallMeRequest[i12];
        }
    }

    public RecallMeRequest(@k RecallMeParams recallMeParams) {
        this.recallParams = recallMeParams;
    }

    public static /* synthetic */ RecallMeRequest copy$default(RecallMeRequest recallMeRequest, RecallMeParams recallMeParams, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            recallMeParams = recallMeRequest.recallParams;
        }
        return recallMeRequest.copy(recallMeParams);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final RecallMeParams getRecallParams() {
        return this.recallParams;
    }

    @k
    public final RecallMeRequest copy(@k RecallMeParams recallParams) {
        return new RecallMeRequest(recallParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecallMeRequest) && L.f(this.recallParams, ((RecallMeRequest) other).recallParams);
    }

    @k
    public final RecallMeParams getRecallParams() {
        return this.recallParams;
    }

    public int hashCode() {
        return this.recallParams.hashCode();
    }

    @k
    public String toString() {
        return "RecallMeRequest(recallParams=" + this.recallParams + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.recallParams.writeToParcel(parcel, flags);
    }
}
