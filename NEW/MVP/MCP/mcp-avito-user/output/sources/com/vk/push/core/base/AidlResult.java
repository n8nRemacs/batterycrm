package com.vk.push.core.base;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AidlResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "T", "b", "Success", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AidlResult<T extends Parcelable> implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f367015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f367014c = new b(null);

    @f
    @k
    public static final Parcelable.Creator<AidlResult<? extends Parcelable>> CREATOR = new a();

    /* compiled from: AidlResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/base/AidlResult$Success;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Success implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: AidlResult.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/base/AidlResult$Success$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlResult$Success;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        /* renamed from: com.vk.push.core.base.AidlResult$Success$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<Success> {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new Success();
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }

            public Companion() {
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AidlResult.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/vk/push/core/base/AidlResult$a", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AidlResult<? extends Parcelable>> {
        @Override // android.os.Parcelable.Creator
        public final AidlResult<? extends Parcelable> createFromParcel(Parcel parcel) {
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) parcel.readParcelable(AidlResult.class.getClassLoader(), Parcelable.class) : parcel.readParcelable(AidlResult.class.getClassLoader());
            if (parcelable != null) {
                return new AidlResult<>(parcelable);
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final AidlResult<? extends Parcelable>[] newArray(int i12) {
            return new AidlResult[i12];
        }
    }

    /* compiled from: AidlResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/push/core/base/AidlResult$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AidlResult(@k T t12) {
        this.f367015b = t12;
    }

    @l
    public final RuntimeException c() {
        T t12 = this.f367015b;
        if (!(t12 instanceof AidlException)) {
            return null;
        }
        AidlException aidlException = (AidlException) t12;
        int i12 = aidlException.f367012b;
        String str = aidlException.f367013c;
        switch (i12) {
            case 100:
                return new RuntimeException(str);
            case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                return new IllegalArgumentException(str);
            case 102:
                return new IllegalStateException(str);
            case 103:
                return new HostIsNotMasterException(str);
            default:
                return new RuntimeException(str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AidlResult) && L.f(this.f367015b, ((AidlResult) obj).f367015b);
    }

    public final int hashCode() {
        return this.f367015b.hashCode();
    }

    @k
    public final String toString() {
        T t12 = this.f367015b;
        if (t12 instanceof AidlException) {
            return t12.toString();
        }
        if (t12 instanceof Success) {
            return "Success()";
        }
        return "Success(" + t12 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f367015b, i12);
    }
}
