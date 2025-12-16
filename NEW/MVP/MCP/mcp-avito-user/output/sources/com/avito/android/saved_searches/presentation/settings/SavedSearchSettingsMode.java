package com.avito.android.saved_searches.presentation.settings;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SavedSearchSettingsMode.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/SavedSearchSettingsMode;", "", "Landroid/os/Parcelable;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchSettingsMode implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedSearchSettingsMode> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final SavedSearchSettingsMode f258740b;

    /* renamed from: c, reason: collision with root package name */
    public static final SavedSearchSettingsMode f258741c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SavedSearchSettingsMode[] f258742d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f258743e;

    static {
        SavedSearchSettingsMode savedSearchSettingsMode = new SavedSearchSettingsMode("PUSH", 0);
        f258740b = savedSearchSettingsMode;
        SavedSearchSettingsMode savedSearchSettingsMode2 = new SavedSearchSettingsMode("EMAIL", 1);
        f258741c = savedSearchSettingsMode2;
        SavedSearchSettingsMode[] savedSearchSettingsModeArr = {savedSearchSettingsMode, savedSearchSettingsMode2};
        f258742d = savedSearchSettingsModeArr;
        f258743e = kotlin.enums.c.a(savedSearchSettingsModeArr);
        CREATOR = new Parcelable.Creator<SavedSearchSettingsMode>() { // from class: com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode.a
            @Override // android.os.Parcelable.Creator
            public final SavedSearchSettingsMode createFromParcel(Parcel parcel) {
                return SavedSearchSettingsMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedSearchSettingsMode[] newArray(int i12) {
                return new SavedSearchSettingsMode[i12];
            }
        };
    }

    public SavedSearchSettingsMode() {
        throw null;
    }

    public static SavedSearchSettingsMode valueOf(String str) {
        return (SavedSearchSettingsMode) Enum.valueOf(SavedSearchSettingsMode.class, str);
    }

    public static SavedSearchSettingsMode[] values() {
        return (SavedSearchSettingsMode[]) f258742d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
