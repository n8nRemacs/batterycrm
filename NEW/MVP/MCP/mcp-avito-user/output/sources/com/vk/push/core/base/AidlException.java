package com.vk.push.core.base;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AidlException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/base/AidlException;", "Landroid/os/Parcelable;", "b", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AidlException implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<AidlException> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final int f367012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f367013c;

    /* compiled from: AidlException.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/vk/push/core/base/AidlException$a", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlException;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AidlException> {
        @Override // android.os.Parcelable.Creator
        public final AidlException createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            return new AidlException(i12, string);
        }

        @Override // android.os.Parcelable.Creator
        public final AidlException[] newArray(int i12) {
            return new AidlException[i12];
        }
    }

    /* compiled from: AidlException.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/base/AidlException$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlException;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "HOST_IS_NOT_MASTER", "I", "ILLEGAL_ARGUMENT_EXCEPTION", "ILLEGAL_STATE_EXCEPTION", "RUNTIME_EXCEPTION", "UNKNOWN_EXCEPTION", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public AidlException(int i12, @k String str) {
        this.f367012b = i12;
        this.f367013c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AidlException)) {
            return false;
        }
        AidlException aidlException = (AidlException) obj;
        return this.f367012b == aidlException.f367012b && L.f(this.f367013c, aidlException.f367013c);
    }

    public final int hashCode() {
        return this.f367013c.hashCode() + (Integer.hashCode(this.f367012b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AidlException(code=");
        sb2.append(this.f367012b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f367013c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f367012b);
        parcel.writeString(this.f367013c);
    }
}
