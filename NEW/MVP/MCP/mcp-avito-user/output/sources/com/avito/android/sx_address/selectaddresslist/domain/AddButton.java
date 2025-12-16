package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: SelectListScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/AddButton;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AddButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f294062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f294063c;

    /* compiled from: SelectListScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddButton> {
        @Override // android.os.Parcelable.Creator
        public final AddButton createFromParcel(Parcel parcel) {
            return new AddButton((AttributedText) parcel.readParcelable(AddButton.class.getClassLoader()), (DeepLink) parcel.readParcelable(AddButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddButton[] newArray(int i12) {
            return new AddButton[i12];
        }
    }

    public AddButton(@k AttributedText attributedText, @k DeepLink deepLink) {
        this.f294062b = attributedText;
        this.f294063c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f294062b, i12);
        parcel.writeParcelable(this.f294063c, i12);
    }
}
