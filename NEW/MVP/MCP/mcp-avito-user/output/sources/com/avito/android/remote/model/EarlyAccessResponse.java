package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.early_access.remote.model.EarlyAccessModal;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneResponse.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/EarlyAccessResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PhoneResponse;", "Lcom/avito/android/remote/model/NotificationToastResponse;", "Lcom/avito/android/remote/model/NotificationToast;", "notificationToast", "Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "earlyAccessModal", "<init>", "(Lcom/avito/android/remote/model/NotificationToast;Lcom/avito/android/early_access/remote/model/EarlyAccessModal;)V", "component1", "()Lcom/avito/android/remote/model/NotificationToast;", "component2", "()Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "copy", "(Lcom/avito/android/remote/model/NotificationToast;Lcom/avito/android/early_access/remote/model/EarlyAccessModal;)Lcom/avito/android/remote/model/EarlyAccessResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/NotificationToast;", "getNotificationToast", "Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "getEarlyAccessModal", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EarlyAccessResponse extends PhoneResponse implements Parcelable, NotificationToastResponse {

    @k
    public static final Parcelable.Creator<EarlyAccessResponse> CREATOR = new Creator();

    @c("earlyAccessModal")
    @k
    private final EarlyAccessModal earlyAccessModal;

    @c("notificationToast")
    @l
    private final NotificationToast notificationToast;

    /* compiled from: PhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EarlyAccessResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessResponse createFromParcel(@k Parcel parcel) {
            return new EarlyAccessResponse(parcel.readInt() == 0 ? null : NotificationToast.CREATOR.createFromParcel(parcel), (EarlyAccessModal) parcel.readParcelable(EarlyAccessResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessResponse[] newArray(int i12) {
            return new EarlyAccessResponse[i12];
        }
    }

    public EarlyAccessResponse(@l NotificationToast notificationToast, @k EarlyAccessModal earlyAccessModal) {
        super(null);
        this.notificationToast = notificationToast;
        this.earlyAccessModal = earlyAccessModal;
    }

    public static /* synthetic */ EarlyAccessResponse copy$default(EarlyAccessResponse earlyAccessResponse, NotificationToast notificationToast, EarlyAccessModal earlyAccessModal, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            notificationToast = earlyAccessResponse.notificationToast;
        }
        if ((i12 & 2) != 0) {
            earlyAccessModal = earlyAccessResponse.earlyAccessModal;
        }
        return earlyAccessResponse.copy(notificationToast, earlyAccessModal);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final NotificationToast getNotificationToast() {
        return this.notificationToast;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final EarlyAccessModal getEarlyAccessModal() {
        return this.earlyAccessModal;
    }

    @k
    public final EarlyAccessResponse copy(@l NotificationToast notificationToast, @k EarlyAccessModal earlyAccessModal) {
        return new EarlyAccessResponse(notificationToast, earlyAccessModal);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyAccessResponse)) {
            return false;
        }
        EarlyAccessResponse earlyAccessResponse = (EarlyAccessResponse) other;
        return L.f(this.notificationToast, earlyAccessResponse.notificationToast) && L.f(this.earlyAccessModal, earlyAccessResponse.earlyAccessModal);
    }

    @k
    public final EarlyAccessModal getEarlyAccessModal() {
        return this.earlyAccessModal;
    }

    @Override // com.avito.android.remote.model.NotificationToastResponse
    @l
    public NotificationToast getNotificationToast() {
        return this.notificationToast;
    }

    public int hashCode() {
        NotificationToast notificationToast = this.notificationToast;
        return this.earlyAccessModal.hashCode() + ((notificationToast == null ? 0 : notificationToast.hashCode()) * 31);
    }

    @k
    public String toString() {
        return "EarlyAccessResponse(notificationToast=" + this.notificationToast + ", earlyAccessModal=" + this.earlyAccessModal + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        NotificationToast notificationToast = this.notificationToast;
        if (notificationToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationToast.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.earlyAccessModal, flags);
    }
}
