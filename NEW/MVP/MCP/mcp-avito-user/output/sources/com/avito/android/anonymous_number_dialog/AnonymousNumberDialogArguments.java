package com.avito.android.anonymous_number_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnonymousNumberDialogArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogArguments;", "Landroid/os/Parcelable;", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AnonymousNumberDialogArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AnonymousNumberDialogArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f91262b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f91263c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f91264d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f91265e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f91266f;

    /* compiled from: AnonymousNumberDialogArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnonymousNumberDialogArguments> {
        @Override // android.os.Parcelable.Creator
        public final AnonymousNumberDialogArguments createFromParcel(Parcel parcel) {
            return new AnonymousNumberDialogArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AnonymousNumberDialogArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AnonymousNumberDialogArguments[] newArray(int i12) {
            return new AnonymousNumberDialogArguments[i12];
        }
    }

    public AnonymousNumberDialogArguments(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k DeepLink deepLink) {
        this.f91262b = str;
        this.f91263c = str2;
        this.f91264d = str3;
        this.f91265e = str4;
        this.f91266f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousNumberDialogArguments)) {
            return false;
        }
        AnonymousNumberDialogArguments anonymousNumberDialogArguments = (AnonymousNumberDialogArguments) obj;
        return L.f(this.f91262b, anonymousNumberDialogArguments.f91262b) && L.f(this.f91263c, anonymousNumberDialogArguments.f91263c) && L.f(this.f91264d, anonymousNumberDialogArguments.f91264d) && L.f(this.f91265e, anonymousNumberDialogArguments.f91265e) && L.f(this.f91266f, anonymousNumberDialogArguments.f91266f);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f91262b.hashCode() * 31, 31, this.f91263c);
        String str = this.f91264d;
        return this.f91266f.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91265e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnonymousNumberDialogArguments(title=");
        sb2.append(this.f91262b);
        sb2.append(", description=");
        sb2.append(this.f91263c);
        sb2.append(", pictureId=");
        sb2.append(this.f91264d);
        sb2.append(", textButton=");
        sb2.append(this.f91265e);
        sb2.append(", callLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f91266f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f91262b);
        parcel.writeString(this.f91263c);
        parcel.writeString(this.f91264d);
        parcel.writeString(this.f91265e);
        parcel.writeParcelable(this.f91266f, i12);
    }
}
