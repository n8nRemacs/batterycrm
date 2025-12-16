package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectContactMeLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectContactMeType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "Phone", "Messenger", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AutoSelectContactMeType implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectContactMeType> CREATOR;

    @com.google.gson.annotations.c(NotificationsSettings.Section.SECTION_MESSENGER)
    public static final AutoSelectContactMeType Messenger;

    @com.google.gson.annotations.c("phone")
    public static final AutoSelectContactMeType Phone;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AutoSelectContactMeType[] f133036b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133037c;

    static {
        AutoSelectContactMeType autoSelectContactMeType = new AutoSelectContactMeType("Phone", 0);
        Phone = autoSelectContactMeType;
        AutoSelectContactMeType autoSelectContactMeType2 = new AutoSelectContactMeType("Messenger", 1);
        Messenger = autoSelectContactMeType2;
        AutoSelectContactMeType[] autoSelectContactMeTypeArr = {autoSelectContactMeType, autoSelectContactMeType2};
        f133036b = autoSelectContactMeTypeArr;
        f133037c = kotlin.enums.c.a(autoSelectContactMeTypeArr);
        CREATOR = new Parcelable.Creator<AutoSelectContactMeType>() { // from class: com.avito.android.deep_linking.links.AutoSelectContactMeType.a
            @Override // android.os.Parcelable.Creator
            public final AutoSelectContactMeType createFromParcel(Parcel parcel) {
                return AutoSelectContactMeType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AutoSelectContactMeType[] newArray(int i12) {
                return new AutoSelectContactMeType[i12];
            }
        };
    }

    private AutoSelectContactMeType(String str, int i12) {
    }

    public static AutoSelectContactMeType valueOf(String str) {
        return (AutoSelectContactMeType) Enum.valueOf(AutoSelectContactMeType.class, str);
    }

    public static AutoSelectContactMeType[] values() {
        return (AutoSelectContactMeType[]) f133036b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
