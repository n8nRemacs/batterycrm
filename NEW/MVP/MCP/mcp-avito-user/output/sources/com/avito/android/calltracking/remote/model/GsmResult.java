package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerPhoneCallResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/calltracking/remote/model/GsmResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/calltracking/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/calltracking/remote/model/Action;)V", "Lcom/avito/android/calltracking/remote/model/Action;", "c", "()Lcom/avito/android/calltracking/remote/model/Action;", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GsmResult implements Parcelable {

    @k
    public static final Parcelable.Creator<GsmResult> CREATOR = new a();

    @c("action")
    @k
    private final Action action;

    /* compiled from: MessengerPhoneCallResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GsmResult> {
        @Override // android.os.Parcelable.Creator
        public final GsmResult createFromParcel(Parcel parcel) {
            return new GsmResult(Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GsmResult[] newArray(int i12) {
            return new GsmResult[i12];
        }
    }

    public GsmResult(@k Action action) {
        this.action = action;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GsmResult) && L.f(this.action, ((GsmResult) obj).action);
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    @k
    public final String toString() {
        return "GsmResult(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.action.writeToParcel(parcel, i12);
    }
}
