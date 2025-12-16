package com.avito.android.evidence_request.mvi.domain.evidence_request;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.ModerationEvidence;
import kotlin.Metadata;

/* compiled from: AppealId.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_request/AppealId;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppealId implements Parcelable {

    @k
    public static final Parcelable.Creator<AppealId> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148723b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f148724c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ModerationEvidence f148725d;

    /* compiled from: AppealId.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppealId> {
        @Override // android.os.Parcelable.Creator
        public final AppealId createFromParcel(Parcel parcel) {
            return new AppealId(parcel.readString(), parcel.readString(), ModerationEvidence.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppealId[] newArray(int i12) {
            return new AppealId[i12];
        }
    }

    public AppealId(@k String str, @k String str2, @k ModerationEvidence moderationEvidence) {
        this.f148723b = str;
        this.f148724c = str2;
        this.f148725d = moderationEvidence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148723b);
        parcel.writeString(this.f148724c);
        parcel.writeString(this.f148725d.name());
    }
}
