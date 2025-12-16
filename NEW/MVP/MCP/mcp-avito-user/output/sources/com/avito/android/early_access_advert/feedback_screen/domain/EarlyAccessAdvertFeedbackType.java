package com.avito.android.early_access_advert.feedback_screen.domain;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyAccessAdvertFeedbackType.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/domain/EarlyAccessAdvertFeedbackType;", "", "Landroid/os/Parcelable;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessAdvertFeedbackType implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessAdvertFeedbackType> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final EarlyAccessAdvertFeedbackType f145650d;

    /* renamed from: e, reason: collision with root package name */
    public static final EarlyAccessAdvertFeedbackType f145651e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EarlyAccessAdvertFeedbackType[] f145652f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145653g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f145655c;

    static {
        EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType = new EarlyAccessAdvertFeedbackType("POSITIVE", 0, "positive", 1);
        f145650d = earlyAccessAdvertFeedbackType;
        EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType2 = new EarlyAccessAdvertFeedbackType("NEGATIVE", 1, "negative", 2);
        f145651e = earlyAccessAdvertFeedbackType2;
        EarlyAccessAdvertFeedbackType[] earlyAccessAdvertFeedbackTypeArr = {earlyAccessAdvertFeedbackType, earlyAccessAdvertFeedbackType2};
        f145652f = earlyAccessAdvertFeedbackTypeArr;
        f145653g = c.a(earlyAccessAdvertFeedbackTypeArr);
        CREATOR = new Parcelable.Creator<EarlyAccessAdvertFeedbackType>() { // from class: com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType.a
            @Override // android.os.Parcelable.Creator
            public final EarlyAccessAdvertFeedbackType createFromParcel(Parcel parcel) {
                return EarlyAccessAdvertFeedbackType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EarlyAccessAdvertFeedbackType[] newArray(int i12) {
                return new EarlyAccessAdvertFeedbackType[i12];
            }
        };
    }

    public EarlyAccessAdvertFeedbackType(String str, int i12, String str2, int i13) {
        this.f145654b = str2;
        this.f145655c = i13;
    }

    public static EarlyAccessAdvertFeedbackType valueOf(String str) {
        return (EarlyAccessAdvertFeedbackType) Enum.valueOf(EarlyAccessAdvertFeedbackType.class, str);
    }

    public static EarlyAccessAdvertFeedbackType[] values() {
        return (EarlyAccessAdvertFeedbackType[]) f145652f.clone();
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
