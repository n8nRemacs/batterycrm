package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsShortcutGroup.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup;", "Landroid/os/Parcelable;", "All", "a", "Named", "Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup$All;", "Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup$Named;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertsShortcutGroup extends Parcelable {

    /* renamed from: b2, reason: collision with root package name */
    @k
    public static final a f312197b2 = a.f312200a;

    /* compiled from: UserAdvertsShortcutGroup.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup$All;", "Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class All implements UserAdvertsShortcutGroup {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final All f312198b = new All();

        @k
        public static final Parcelable.Creator<All> CREATOR = new a();

        /* compiled from: UserAdvertsShortcutGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<All> {
            @Override // android.os.Parcelable.Creator
            public final All createFromParcel(Parcel parcel) {
                parcel.readInt();
                return All.f312198b;
            }

            @Override // android.os.Parcelable.Creator
            public final All[] newArray(int i12) {
                return new All[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof All);
        }

        public final int hashCode() {
            return -731748715;
        }

        @k
        public final String toString() {
            return "All";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UserAdvertsShortcutGroup.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup$Named;", "Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Named implements UserAdvertsShortcutGroup {

        @k
        public static final Parcelable.Creator<Named> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312199b;

        /* compiled from: UserAdvertsShortcutGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Named> {
            @Override // android.os.Parcelable.Creator
            public final Named createFromParcel(Parcel parcel) {
                return new Named(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Named[] newArray(int i12) {
                return new Named[i12];
            }
        }

        public Named(@k String str) {
            this.f312199b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Named) && L.f(this.f312199b, ((Named) obj).f312199b);
        }

        public final int hashCode() {
            return this.f312199b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Named(shortcut="), this.f312199b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312199b);
        }
    }

    /* compiled from: UserAdvertsShortcutGroup.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsShortcutGroup$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f312200a = new a();

        @k
        public static UserAdvertsShortcutGroup a(@l String str) {
            return (str == null || str.length() == 0) ? All.f312198b : new Named(str);
        }
    }
}
