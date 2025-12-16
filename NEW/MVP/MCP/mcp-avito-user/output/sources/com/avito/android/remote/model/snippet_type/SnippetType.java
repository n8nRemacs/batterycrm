package com.avito.android.remote.model.snippet_type;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetType.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/snippet_type/SnippetType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "JOB_23", "JOB_24", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SnippetType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnippetType[] $VALUES;

    @k
    public static final Parcelable.Creator<SnippetType> CREATOR;

    @c("job23")
    public static final SnippetType JOB_23 = new SnippetType("JOB_23", 0);

    @c("job24")
    public static final SnippetType JOB_24 = new SnippetType("JOB_24", 1);

    private static final /* synthetic */ SnippetType[] $values() {
        return new SnippetType[]{JOB_23, JOB_24};
    }

    static {
        SnippetType[] snippetTypeArr$values = $values();
        $VALUES = snippetTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(snippetTypeArr$values);
        CREATOR = new Parcelable.Creator<SnippetType>() { // from class: com.avito.android.remote.model.snippet_type.SnippetType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SnippetType createFromParcel(@k Parcel parcel) {
                return SnippetType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SnippetType[] newArray(int i12) {
                return new SnippetType[i12];
            }
        };
    }

    private SnippetType(String str, int i12) {
    }

    @k
    public static a<SnippetType> getEntries() {
        return $ENTRIES;
    }

    public static SnippetType valueOf(String str) {
        return (SnippetType) Enum.valueOf(SnippetType.class, str);
    }

    public static SnippetType[] values() {
        return (SnippetType[]) $VALUES.clone();
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
