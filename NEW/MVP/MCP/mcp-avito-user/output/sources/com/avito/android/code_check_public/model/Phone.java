package com.avito.android.code_check_public.model;

import K51.d;
import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import androidx.compose.ui.platform.C22491k0;
import j.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Phone.kt */
@d
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "Landroid/os/Parcelable;", "withoutPrefix", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Phone implements Parcelable {

    @k
    public static final Parcelable.Creator<Phone> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119296b;

    /* compiled from: Phone.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Phone> {
        @Override // android.os.Parcelable.Creator
        public final Phone createFromParcel(Parcel parcel) {
            return Phone.a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Phone[] newArray(int i12) {
            return new Phone[i12];
        }
    }

    @k0
    private /* synthetic */ Phone(String str) {
        this.f119296b = str;
    }

    public static final /* synthetic */ Phone a(String str) {
        return new Phone(str);
    }

    @k
    public static final String b(String str) {
        return G.f("7", str);
    }

    public static String c(String str) {
        return C22491k0.a(')', "Phone(withoutPrefix=", str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Phone) {
            return L.f(this.f119296b, ((Phone) obj).f119296b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f119296b.hashCode();
    }

    public final String toString() {
        return c(this.f119296b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119296b);
    }
}
