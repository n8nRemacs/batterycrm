package com.avito.android.success_screen_after_apply.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: SuccessScreenAfterApplyOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessScreenAfterApplyOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SuccessScreenAfterApplyOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f291768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f291769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f291770d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f291771e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f291772f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f291773g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f291774h;

    /* compiled from: SuccessScreenAfterApplyOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuccessScreenAfterApplyOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SuccessScreenAfterApplyOpenParams createFromParcel(Parcel parcel) {
            return new SuccessScreenAfterApplyOpenParams(parcel.readLong(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(SuccessScreenAfterApplyOpenParams.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(SuccessScreenAfterApplyOpenParams.class.getClassLoader()), (DeepLink) parcel.readParcelable(SuccessScreenAfterApplyOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuccessScreenAfterApplyOpenParams[] newArray(int i12) {
            return new SuccessScreenAfterApplyOpenParams[i12];
        }
    }

    public SuccessScreenAfterApplyOpenParams(long j12, @k String str, @k String str2, @l UniversalImage universalImage, @k String str3, @k DeepLink deepLink, @l DeepLink deepLink2) {
        this.f291768b = j12;
        this.f291769c = str;
        this.f291770d = str2;
        this.f291771e = universalImage;
        this.f291772f = str3;
        this.f291773g = deepLink;
        this.f291774h = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f291768b);
        parcel.writeString(this.f291769c);
        parcel.writeString(this.f291770d);
        parcel.writeParcelable(this.f291771e, i12);
        parcel.writeString(this.f291772f);
        parcel.writeParcelable(this.f291773g, i12);
        parcel.writeParcelable(this.f291774h, i12);
    }
}
