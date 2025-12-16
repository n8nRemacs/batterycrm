package com.avito.android.virtual_deal_room_client_creation.create.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.virtual_deal_room_client_creation.model.ClientCreationArguments;
import kotlin.Metadata;

/* compiled from: CreateArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/model/CreateArguments;", "Lcom/avito/android/virtual_deal_room_client_creation/model/ClientCreationArguments;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateArguments implements ClientCreationArguments {

    @k
    public static final Parcelable.Creator<CreateArguments> CREATOR = new a();

    /* compiled from: CreateArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateArguments> {
        @Override // android.os.Parcelable.Creator
        public final CreateArguments createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CreateArguments();
        }

        @Override // android.os.Parcelable.Creator
        public final CreateArguments[] newArray(int i12) {
            return new CreateArguments[i12];
        }
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
