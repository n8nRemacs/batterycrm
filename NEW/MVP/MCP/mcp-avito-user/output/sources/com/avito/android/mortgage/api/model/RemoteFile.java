package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RemoteFile.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/api/model/RemoteFile;", "Landroid/os/Parcelable;", "", "id", "name", "", "sizeInBytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "J", "c", "()J", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RemoteFile implements Parcelable {

    @k
    public static final Parcelable.Creator<RemoteFile> CREATOR = new a();

    @c("fileId")
    @k
    private final String id;

    @c("name")
    @k
    private final String name;

    @c("size")
    private final long sizeInBytes;

    /* compiled from: RemoteFile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RemoteFile> {
        @Override // android.os.Parcelable.Creator
        public final RemoteFile createFromParcel(Parcel parcel) {
            return new RemoteFile(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteFile[] newArray(int i12) {
            return new RemoteFile[i12];
        }
    }

    public RemoteFile(@k String str, @k String str2, long j12) {
        this.id = str;
        this.name = str2;
        this.sizeInBytes = j12;
    }

    /* renamed from: c, reason: from getter */
    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteFile)) {
            return false;
        }
        RemoteFile remoteFile = (RemoteFile) obj;
        return L.f(this.id, remoteFile.id) && L.f(this.name, remoteFile.name) && this.sizeInBytes == remoteFile.sizeInBytes;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return Long.hashCode(this.sizeInBytes) + H.d(this.id.hashCode() * 31, 31, this.name);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteFile(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", sizeInBytes=");
        return r.u(sb2, this.sizeInBytes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.sizeInBytes);
    }
}
