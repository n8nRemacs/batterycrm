package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectControls.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "PRIORITY_SCALED", "DEFAULT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectLayoutMode implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectLayoutMode[] $VALUES;

    @k
    public static final Parcelable.Creator<SelectLayoutMode> CREATOR;

    @c("priorityScaled")
    public static final SelectLayoutMode PRIORITY_SCALED = new SelectLayoutMode("PRIORITY_SCALED", 0);

    @c("default")
    public static final SelectLayoutMode DEFAULT = new SelectLayoutMode("DEFAULT", 1);

    private static final /* synthetic */ SelectLayoutMode[] $values() {
        return new SelectLayoutMode[]{PRIORITY_SCALED, DEFAULT};
    }

    static {
        SelectLayoutMode[] selectLayoutModeArr$values = $values();
        $VALUES = selectLayoutModeArr$values;
        $ENTRIES = kotlin.enums.c.a(selectLayoutModeArr$values);
        CREATOR = new Parcelable.Creator<SelectLayoutMode>() { // from class: com.avito.android.remote.model.auto_select.SelectLayoutMode.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectLayoutMode createFromParcel(@k Parcel parcel) {
                return SelectLayoutMode.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectLayoutMode[] newArray(int i12) {
                return new SelectLayoutMode[i12];
            }
        };
    }

    private SelectLayoutMode(String str, int i12) {
    }

    @k
    public static a<SelectLayoutMode> getEntries() {
        return $ENTRIES;
    }

    public static SelectLayoutMode valueOf(String str) {
        return (SelectLayoutMode) Enum.valueOf(SelectLayoutMode.class, str);
    }

    public static SelectLayoutMode[] values() {
        return (SelectLayoutMode[]) $VALUES.clone();
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
