package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ServiceTypeKt;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertActionType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionType;", "Landroid/os/Parcelable;", "Multiple", "Single", "Lcom/avito/android/user_adverts/model/UserAdvertActionType$Multiple;", "Lcom/avito/android/user_adverts/model/UserAdvertActionType$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertActionType extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertActionType.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionType$Multiple;", "", "Lcom/avito/android/user_adverts/model/UserAdvertActionType;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Multiple implements UserAdvertActionType {

        @k
        public static final Parcelable.Creator<Multiple> CREATOR;

        /* renamed from: c, reason: collision with root package name */
        public static final Multiple f312173c;

        /* renamed from: d, reason: collision with root package name */
        public static final Multiple f312174d;

        /* renamed from: e, reason: collision with root package name */
        public static final Multiple f312175e;

        /* renamed from: f, reason: collision with root package name */
        public static final Multiple f312176f;

        /* renamed from: g, reason: collision with root package name */
        public static final Multiple f312177g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Multiple[] f312178h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f312179i;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312180b;

        /* compiled from: UserAdvertActionType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Multiple> {
            @Override // android.os.Parcelable.Creator
            public final Multiple createFromParcel(Parcel parcel) {
                return Multiple.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Multiple[] newArray(int i12) {
                return new Multiple[i12];
            }
        }

        static {
            Multiple multiple = new Multiple("ACTIVATE", 0, ServiceTypeKt.SERVICE_ACTIVATION);
            f312173c = multiple;
            Multiple multiple2 = new Multiple("DELETE", 1, "delete");
            f312174d = multiple2;
            Multiple multiple3 = new Multiple("CLOSE", 2, "close");
            f312175e = multiple3;
            Multiple multiple4 = new Multiple("RESTORE", 3, "restore");
            f312176f = multiple4;
            Multiple multiple5 = new Multiple("COPY", 4, "copy");
            f312177g = multiple5;
            Multiple[] multipleArr = {multiple, multiple2, multiple3, multiple4, multiple5};
            f312178h = multipleArr;
            f312179i = c.a(multipleArr);
            CREATOR = new a();
        }

        public Multiple(String str, int i12, String str2) {
            this.f312180b = str2;
        }

        public static Multiple valueOf(String str) {
            return (Multiple) Enum.valueOf(Multiple.class, str);
        }

        public static Multiple[] values() {
            return (Multiple[]) f312178h.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.user_adverts.model.UserAdvertActionType
        @k
        /* renamed from: m3, reason: from getter */
        public final String getF312181b() {
            return this.f312180b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UserAdvertActionType.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionType$Single;", "Lcom/avito/android/user_adverts/model/UserAdvertActionType;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Single implements UserAdvertActionType {

        @k
        public static final Parcelable.Creator<Single> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312181b;

        /* compiled from: UserAdvertActionType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Single> {
            @Override // android.os.Parcelable.Creator
            public final Single createFromParcel(Parcel parcel) {
                return new Single(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Single[] newArray(int i12) {
                return new Single[i12];
            }
        }

        public Single(@k String str) {
            this.f312181b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Single) && L.f(this.f312181b, ((Single) obj).f312181b);
        }

        public final int hashCode() {
            return this.f312181b.hashCode();
        }

        @Override // com.avito.android.user_adverts.model.UserAdvertActionType
        @k
        /* renamed from: m3, reason: from getter */
        public final String getF312181b() {
            return this.f312181b;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Single(actionName="), this.f312181b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312181b);
        }
    }

    @k
    /* renamed from: m3 */
    String getF312181b();
}
