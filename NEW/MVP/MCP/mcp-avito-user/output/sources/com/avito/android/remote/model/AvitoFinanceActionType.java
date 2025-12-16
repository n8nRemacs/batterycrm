package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoFinanceBaseCard.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceActionType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "OpenDeeplink", "SendEvent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AvitoFinanceActionType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvitoFinanceActionType[] $VALUES;

    @k
    public static final Parcelable.Creator<AvitoFinanceActionType> CREATOR;

    @c("openDeeplink")
    public static final AvitoFinanceActionType OpenDeeplink = new AvitoFinanceActionType("OpenDeeplink", 0);

    @c("sendEvent")
    public static final AvitoFinanceActionType SendEvent = new AvitoFinanceActionType("SendEvent", 1);

    private static final /* synthetic */ AvitoFinanceActionType[] $values() {
        return new AvitoFinanceActionType[]{OpenDeeplink, SendEvent};
    }

    static {
        AvitoFinanceActionType[] avitoFinanceActionTypeArr$values = $values();
        $VALUES = avitoFinanceActionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(avitoFinanceActionTypeArr$values);
        CREATOR = new Parcelable.Creator<AvitoFinanceActionType>() { // from class: com.avito.android.remote.model.AvitoFinanceActionType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AvitoFinanceActionType createFromParcel(@k Parcel parcel) {
                return AvitoFinanceActionType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AvitoFinanceActionType[] newArray(int i12) {
                return new AvitoFinanceActionType[i12];
            }
        };
    }

    private AvitoFinanceActionType(String str, int i12) {
    }

    @k
    public static a<AvitoFinanceActionType> getEntries() {
        return $ENTRIES;
    }

    public static AvitoFinanceActionType valueOf(String str) {
        return (AvitoFinanceActionType) Enum.valueOf(AvitoFinanceActionType.class, str);
    }

    public static AvitoFinanceActionType[] values() {
        return (AvitoFinanceActionType[]) $VALUES.clone();
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
