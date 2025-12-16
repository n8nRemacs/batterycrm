package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "NOT_STARTED", "IN_PROGRESS", "SUCCESS", "FAILED", "EXPIRED", "DISABLED", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GigShiftDocumentStatus implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GigShiftDocumentStatus[] $VALUES;

    @k
    public static final Parcelable.Creator<GigShiftDocumentStatus> CREATOR;

    @c("not_started")
    public static final GigShiftDocumentStatus NOT_STARTED = new GigShiftDocumentStatus("NOT_STARTED", 0);

    @c("in_progress")
    public static final GigShiftDocumentStatus IN_PROGRESS = new GigShiftDocumentStatus("IN_PROGRESS", 1);

    @c("success")
    public static final GigShiftDocumentStatus SUCCESS = new GigShiftDocumentStatus("SUCCESS", 2);

    @c(PaymentStateKt.PAYMENT_STATE_FAILED)
    public static final GigShiftDocumentStatus FAILED = new GigShiftDocumentStatus("FAILED", 3);

    @c("expiring")
    public static final GigShiftDocumentStatus EXPIRED = new GigShiftDocumentStatus("EXPIRED", 4);

    @c(BeduinCartItemModel.DISABLED_STRING)
    public static final GigShiftDocumentStatus DISABLED = new GigShiftDocumentStatus("DISABLED", 5);

    private static final /* synthetic */ GigShiftDocumentStatus[] $values() {
        return new GigShiftDocumentStatus[]{NOT_STARTED, IN_PROGRESS, SUCCESS, FAILED, EXPIRED, DISABLED};
    }

    static {
        GigShiftDocumentStatus[] gigShiftDocumentStatusArr$values = $values();
        $VALUES = gigShiftDocumentStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(gigShiftDocumentStatusArr$values);
        CREATOR = new Parcelable.Creator<GigShiftDocumentStatus>() { // from class: com.avito.android.remote.model.gig.GigShiftDocumentStatus.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigShiftDocumentStatus createFromParcel(@k Parcel parcel) {
                return GigShiftDocumentStatus.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigShiftDocumentStatus[] newArray(int i12) {
                return new GigShiftDocumentStatus[i12];
            }
        };
    }

    private GigShiftDocumentStatus(String str, int i12) {
    }

    @k
    public static a<GigShiftDocumentStatus> getEntries() {
        return $ENTRIES;
    }

    public static GigShiftDocumentStatus valueOf(String str) {
        return (GigShiftDocumentStatus) Enum.valueOf(GigShiftDocumentStatus.class, str);
    }

    public static GigShiftDocumentStatus[] values() {
        return (GigShiftDocumentStatus[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(name());
    }
}
