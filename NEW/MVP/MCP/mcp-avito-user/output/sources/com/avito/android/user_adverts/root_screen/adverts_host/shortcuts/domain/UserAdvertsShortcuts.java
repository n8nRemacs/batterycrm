package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsShortcuts.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/domain/UserAdvertsShortcuts;", "Landroid/os/Parcelable;", "Shortcut", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsShortcuts implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsShortcuts> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f313851b;

    /* compiled from: UserAdvertsShortcuts.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/domain/UserAdvertsShortcuts$Shortcut;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shortcut implements Parcelable {

        @k
        public static final Parcelable.Creator<Shortcut> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f313852b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f313853c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f313854d;

        /* compiled from: UserAdvertsShortcuts.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Shortcut> {
            @Override // android.os.Parcelable.Creator
            public final Shortcut createFromParcel(Parcel parcel) {
                return new Shortcut(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Shortcut[] newArray(int i12) {
                return new Shortcut[i12];
            }
        }

        public Shortcut(int i12, @k String str, @k String str2) {
            this.f313852b = i12;
            this.f313853c = str;
            this.f313854d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shortcut)) {
                return false;
            }
            Shortcut shortcut = (Shortcut) obj;
            return this.f313852b == shortcut.f313852b && L.f(this.f313853c, shortcut.f313853c) && L.f(this.f313854d, shortcut.f313854d);
        }

        public final int hashCode() {
            return this.f313854d.hashCode() + H.d(Integer.hashCode(this.f313852b) * 31, 31, this.f313853c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Shortcut(count=");
            sb2.append(this.f313852b);
            sb2.append(", shortcut=");
            sb2.append(this.f313853c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f313854d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f313852b);
            parcel.writeString(this.f313853c);
            parcel.writeString(this.f313854d);
        }
    }

    /* compiled from: UserAdvertsShortcuts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsShortcuts> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsShortcuts createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Shortcut.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UserAdvertsShortcuts(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsShortcuts[] newArray(int i12) {
            return new UserAdvertsShortcuts[i12];
        }
    }

    public UserAdvertsShortcuts(@k ArrayList arrayList) {
        this.f313851b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserAdvertsShortcuts) && this.f313851b.equals(((UserAdvertsShortcuts) obj).f313851b);
    }

    public final int hashCode() {
        return this.f313851b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("UserAdvertsShortcuts(list="), this.f313851b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f313851b, parcel);
        while (itZ.hasNext()) {
            ((Shortcut) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
