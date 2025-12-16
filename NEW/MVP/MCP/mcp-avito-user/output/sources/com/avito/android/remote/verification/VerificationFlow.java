package com.avito.android.remote.verification;

import K51.d;
import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlow.kt */
@d
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/verification/VerificationFlow;", "Landroid/os/Parcelable;", MessageBody.SystemMessageBody.Platform.FLOW, "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerificationFlow implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationFlow> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254400b;

    /* compiled from: VerificationFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationFlow> {
        @Override // android.os.Parcelable.Creator
        public final VerificationFlow createFromParcel(Parcel parcel) {
            return VerificationFlow.a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationFlow[] newArray(int i12) {
            return new VerificationFlow[i12];
        }
    }

    private /* synthetic */ VerificationFlow(String str) {
        this.f254400b = str;
    }

    public static final /* synthetic */ VerificationFlow a(String str) {
        return new VerificationFlow(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VerificationFlow) {
            return L.f(this.f254400b, ((VerificationFlow) obj).f254400b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f254400b.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("VerificationFlow(flow="), this.f254400b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254400b);
    }
}
