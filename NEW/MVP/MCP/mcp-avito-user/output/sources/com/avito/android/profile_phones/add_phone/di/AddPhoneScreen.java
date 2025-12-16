package com.avito.android.profile_phones.add_phone.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: AddPhoneModule.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/di/AddPhoneScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes16.dex */
public final class AddPhoneScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AddPhoneScreen f226834d = new AddPhoneScreen();

    @k
    public static final Parcelable.Creator<AddPhoneScreen> CREATOR = new a();

    /* compiled from: AddPhoneModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddPhoneScreen> {
        @Override // android.os.Parcelable.Creator
        public final AddPhoneScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AddPhoneScreen.f226834d;
        }

        @Override // android.os.Parcelable.Creator
        public final AddPhoneScreen[] newArray(int i12) {
            return new AddPhoneScreen[i12];
        }
    }

    public AddPhoneScreen() {
        super("AddPhone", false);
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
