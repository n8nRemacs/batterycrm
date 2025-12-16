package com.avito.android.comfortable_deal_invite.screens;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ComfortableDealInviteScreenConsts.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/screens/ComfortableDealInviteScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes12.dex */
public final class ComfortableDealInviteScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ComfortableDealInviteScreen f123745d = new ComfortableDealInviteScreen();

    @k
    public static final Parcelable.Creator<ComfortableDealInviteScreen> CREATOR = new a();

    /* compiled from: ComfortableDealInviteScreenConsts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealInviteScreen> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInviteScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ComfortableDealInviteScreen.f123745d;
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInviteScreen[] newArray(int i12) {
            return new ComfortableDealInviteScreen[i12];
        }
    }

    public ComfortableDealInviteScreen() {
        super("ComfortableDealInvite", false, 2, null);
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
