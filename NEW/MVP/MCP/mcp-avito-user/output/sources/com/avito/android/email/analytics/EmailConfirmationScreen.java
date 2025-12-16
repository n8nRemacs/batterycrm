package com.avito.android.email.analytics;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: EmailScreens.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/analytics/EmailConfirmationScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes13.dex */
public final class EmailConfirmationScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final EmailConfirmationScreen f147075d = new EmailConfirmationScreen();

    @k
    public static final Parcelable.Creator<EmailConfirmationScreen> CREATOR = new a();

    /* compiled from: EmailScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmailConfirmationScreen> {
        @Override // android.os.Parcelable.Creator
        public final EmailConfirmationScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return EmailConfirmationScreen.f147075d;
        }

        @Override // android.os.Parcelable.Creator
        public final EmailConfirmationScreen[] newArray(int i12) {
            return new EmailConfirmationScreen[i12];
        }
    }

    public EmailConfirmationScreen() {
        super("EmailConfirmation", false, 2, null);
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
