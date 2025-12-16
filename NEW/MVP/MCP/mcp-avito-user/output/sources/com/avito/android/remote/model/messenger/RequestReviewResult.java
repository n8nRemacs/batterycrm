package com.avito.android.remote.model.messenger;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RequestReviewResult.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/messenger/RequestReviewResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/RequestReviewResultMessage;", "message", "<init>", "(Lcom/avito/android/remote/model/messenger/RequestReviewResultMessage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/RequestReviewResultMessage;", "getMessage", "()Lcom/avito/android/remote/model/messenger/RequestReviewResultMessage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestReviewResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RequestReviewResult> CREATOR = new Creator();

    @c("message")
    @k
    private final RequestReviewResultMessage message;

    /* compiled from: RequestReviewResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequestReviewResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RequestReviewResult createFromParcel(@k Parcel parcel) {
            return new RequestReviewResult(RequestReviewResultMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RequestReviewResult[] newArray(int i12) {
            return new RequestReviewResult[i12];
        }
    }

    public RequestReviewResult(@k RequestReviewResultMessage requestReviewResultMessage) {
        this.message = requestReviewResultMessage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final RequestReviewResultMessage getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.message.writeToParcel(parcel, flags);
    }
}
