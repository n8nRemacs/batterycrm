package com.avito.android.user_adverts_filters.main.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersBeduinNavBar.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinNavBar;", "Landroid/os/Parcelable;", "a", "Type", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFiltersBeduinNavBar implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f316068b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f316069c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f316070d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f316071e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f316067f = new a(null);

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersBeduinNavBar> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertsFiltersBeduinNavBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinNavBar$Type;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f316072b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f316073c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f316074d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f316075e;

        static {
            Type type = new Type("CLOSE", 0);
            f316072b = type;
            Type type2 = new Type("BACK", 1);
            f316073c = type2;
            Type[] typeArr = {type, type2};
            f316074d = typeArr;
            f316075e = c.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f316074d.clone();
        }
    }

    /* compiled from: UserAdvertsFiltersBeduinNavBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinNavBar$a;", "", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserAdvertsFiltersBeduinNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAdvertsFiltersBeduinNavBar> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinNavBar createFromParcel(Parcel parcel) {
            return new UserAdvertsFiltersBeduinNavBar(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinNavBar[] newArray(int i12) {
            return new UserAdvertsFiltersBeduinNavBar[i12];
        }
    }

    public UserAdvertsFiltersBeduinNavBar(@k Type type, @k String str, @l String str2, boolean z12) {
        this.f316068b = type;
        this.f316069c = str;
        this.f316070d = str2;
        this.f316071e = z12;
    }

    public static UserAdvertsFiltersBeduinNavBar a(UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar, boolean z12) {
        Type type = userAdvertsFiltersBeduinNavBar.f316068b;
        String str = userAdvertsFiltersBeduinNavBar.f316069c;
        String str2 = userAdvertsFiltersBeduinNavBar.f316070d;
        userAdvertsFiltersBeduinNavBar.getClass();
        return new UserAdvertsFiltersBeduinNavBar(type, str, str2, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsFiltersBeduinNavBar)) {
            return false;
        }
        UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar = (UserAdvertsFiltersBeduinNavBar) obj;
        return this.f316068b == userAdvertsFiltersBeduinNavBar.f316068b && L.f(this.f316069c, userAdvertsFiltersBeduinNavBar.f316069c) && L.f(this.f316070d, userAdvertsFiltersBeduinNavBar.f316070d) && this.f316071e == userAdvertsFiltersBeduinNavBar.f316071e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f316068b.hashCode() * 31, 31, this.f316069c);
        String str = this.f316070d;
        return Boolean.hashCode(this.f316071e) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersBeduinNavBar(type=");
        sb2.append(this.f316068b);
        sb2.append(", title=");
        sb2.append(this.f316069c);
        sb2.append(", actionTitle=");
        sb2.append(this.f316070d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f316071e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f316068b.name());
        parcel.writeString(this.f316069c);
        parcel.writeString(this.f316070d);
        parcel.writeInt(this.f316071e ? 1 : 0);
    }
}
