package com.avito.android.comfortable_deal.submitting.promo.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/InputState;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputState implements Parcelable {

    @k
    public static final Parcelable.Creator<InputState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f123174b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f123175c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f123176d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f123177e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f123178f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f123179g;

    /* compiled from: PromoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputState> {
        @Override // android.os.Parcelable.Creator
        public final InputState createFromParcel(Parcel parcel) {
            return new InputState(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(InputState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InputState[] newArray(int i12) {
            return new InputState[i12];
        }
    }

    public InputState(@l String str, @l String str2, @k String str3, @l AttributedText attributedText, @l String str4, boolean z12) {
        this.f123174b = str;
        this.f123175c = str2;
        this.f123176d = str3;
        this.f123177e = attributedText;
        this.f123178f = str4;
        this.f123179g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputState)) {
            return false;
        }
        InputState inputState = (InputState) obj;
        return L.f(this.f123174b, inputState.f123174b) && L.f(this.f123175c, inputState.f123175c) && L.f(this.f123176d, inputState.f123176d) && L.f(this.f123177e, inputState.f123177e) && L.f(this.f123178f, inputState.f123178f) && this.f123179g == inputState.f123179g;
    }

    public final int hashCode() {
        String str = this.f123174b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123175c;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f123176d);
        AttributedText attributedText = this.f123177e;
        int iHashCode2 = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.f123178f;
        return Boolean.hashCode(this.f123179g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputState(title=");
        sb2.append(this.f123174b);
        sb2.append(", subtitle=");
        sb2.append(this.f123175c);
        sb2.append(", value=");
        sb2.append(this.f123176d);
        sb2.append(", hint=");
        sb2.append(this.f123177e);
        sb2.append(", placeHolder=");
        sb2.append(this.f123178f);
        sb2.append(", showInputError=");
        return r.x(sb2, this.f123179g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123174b);
        parcel.writeString(this.f123175c);
        parcel.writeString(this.f123176d);
        parcel.writeParcelable(this.f123177e, i12);
        parcel.writeString(this.f123178f);
        parcel.writeInt(this.f123179g ? 1 : 0);
    }
}
