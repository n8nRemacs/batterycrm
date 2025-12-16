package com.avito.android.mortgage.person_form.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/model/PersonFormArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonFormArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<PersonFormArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200852b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f200853c;

    /* renamed from: d, reason: collision with root package name */
    public final int f200854d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f200855e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f200856f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f200857g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f200858h;

    /* compiled from: PersonFormArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PersonFormArguments> {
        @Override // android.os.Parcelable.Creator
        public final PersonFormArguments createFromParcel(Parcel parcel) {
            return new PersonFormArguments(parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersonFormArguments[] newArray(int i12) {
            return new PersonFormArguments[i12];
        }
    }

    public PersonFormArguments(@k String str, @k List<String> list, int i12, @k String str2, @k String str3, @k String str4, @l String str5) {
        this.f200852b = str;
        this.f200853c = list;
        this.f200854d = i12;
        this.f200855e = str2;
        this.f200856f = str3;
        this.f200857g = str4;
        this.f200858h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonFormArguments)) {
            return false;
        }
        PersonFormArguments personFormArguments = (PersonFormArguments) obj;
        return L.f(this.f200852b, personFormArguments.f200852b) && L.f(this.f200853c, personFormArguments.f200853c) && this.f200854d == personFormArguments.f200854d && L.f(this.f200855e, personFormArguments.f200855e) && L.f(this.f200856f, personFormArguments.f200856f) && L.f(this.f200857g, personFormArguments.f200857g) && L.f(this.f200858h, personFormArguments.f200858h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(r.e(this.f200854d, H.e(this.f200852b.hashCode() * 31, 31, this.f200853c), 31), 31, this.f200855e), 31, this.f200856f), 31, this.f200857g);
        String str = this.f200858h;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonFormArguments(screenTitle=");
        sb2.append(this.f200852b);
        sb2.append(", steps=");
        sb2.append(this.f200853c);
        sb2.append(", currentStepIdx=");
        sb2.append(this.f200854d);
        sb2.append(", applicantId=");
        sb2.append(this.f200855e);
        sb2.append(", applicationId=");
        sb2.append(this.f200856f);
        sb2.append(", flowType=");
        sb2.append(this.f200857g);
        sb2.append(", applicantType=");
        return C22026a.c(sb2, this.f200858h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200852b);
        parcel.writeStringList(this.f200853c);
        parcel.writeInt(this.f200854d);
        parcel.writeString(this.f200855e);
        parcel.writeString(this.f200856f);
        parcel.writeString(this.f200857g);
        parcel.writeString(this.f200858h);
    }
}
