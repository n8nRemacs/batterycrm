package com.avito.android.publish.video_upload.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CreateFileIdModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/video_upload/models/CreateFileIdModel;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CreateFileIdModel implements Parcelable {

    @k
    public static final Parcelable.Creator<CreateFileIdModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f245561c;

    /* compiled from: CreateFileIdModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateFileIdModel> {
        @Override // android.os.Parcelable.Creator
        public final CreateFileIdModel createFromParcel(Parcel parcel) {
            return new CreateFileIdModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateFileIdModel[] newArray(int i12) {
            return new CreateFileIdModel[i12];
        }
    }

    public CreateFileIdModel(@k String str, @k String str2) {
        this.f245560b = str;
        this.f245561c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245560b);
        parcel.writeString(this.f245561c);
    }
}
