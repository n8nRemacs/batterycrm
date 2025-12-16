package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListItemAlignment.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CENTER", "FIRST_LINE_CENTER", "TWO_LINES_CENTER", "MIN_HEIGHT_CENTER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ListItemAlignment implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListItemAlignment[] $VALUES;

    @k
    public static final Parcelable.Creator<ListItemAlignment> CREATOR;

    @c(alternate = {"default"}, value = "center")
    public static final ListItemAlignment CENTER = new ListItemAlignment("CENTER", 0);

    @c(alternate = {"titleFirstLineTop"}, value = "firstLineCenter")
    public static final ListItemAlignment FIRST_LINE_CENTER = new ListItemAlignment("FIRST_LINE_CENTER", 1);

    @c("twoLinesCenter")
    public static final ListItemAlignment TWO_LINES_CENTER = new ListItemAlignment("TWO_LINES_CENTER", 2);

    @c("minHeightCenter")
    public static final ListItemAlignment MIN_HEIGHT_CENTER = new ListItemAlignment("MIN_HEIGHT_CENTER", 3);

    private static final /* synthetic */ ListItemAlignment[] $values() {
        return new ListItemAlignment[]{CENTER, FIRST_LINE_CENTER, TWO_LINES_CENTER, MIN_HEIGHT_CENTER};
    }

    static {
        ListItemAlignment[] listItemAlignmentArr$values = $values();
        $VALUES = listItemAlignmentArr$values;
        $ENTRIES = kotlin.enums.c.a(listItemAlignmentArr$values);
        CREATOR = new Parcelable.Creator<ListItemAlignment>() { // from class: com.avito.android.remote.model.category_parameters.ListItemAlignment.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ListItemAlignment createFromParcel(@k Parcel parcel) {
                return ListItemAlignment.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ListItemAlignment[] newArray(int i12) {
                return new ListItemAlignment[i12];
            }
        };
    }

    private ListItemAlignment(String str, int i12) {
    }

    @k
    public static a<ListItemAlignment> getEntries() {
        return $ENTRIES;
    }

    public static ListItemAlignment valueOf(String str) {
        return (ListItemAlignment) Enum.valueOf(ListItemAlignment.class, str);
    }

    public static ListItemAlignment[] values() {
        return (ListItemAlignment[]) $VALUES.clone();
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
