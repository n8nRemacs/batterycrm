package com.avito.android.user_viewed.screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedState.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "Content", "Error", "Loading", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Content;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Error;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Loading;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class UserViewedState extends q implements Parcelable {

    /* compiled from: UserViewedState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Content;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content extends UserViewedState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<UserViewedAdvert> f318420b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f318421c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f318422d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f318423e;

        /* compiled from: UserViewedState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(UserViewedAdvert.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Content(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k List<UserViewedAdvert> list, boolean z12, boolean z13, boolean z14) {
            super(null);
            this.f318420b = list;
            this.f318421c = z12;
            this.f318422d = z13;
            this.f318423e = z14;
        }

        public static Content a(Content content, List list, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                list = content.f318420b;
            }
            if ((i12 & 2) != 0) {
                z12 = content.f318421c;
            }
            if ((i12 & 4) != 0) {
                z13 = content.f318422d;
            }
            boolean z14 = (i12 & 8) != 0 ? content.f318423e : true;
            content.getClass();
            return new Content(list, z12, z13, z14);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f318420b, content.f318420b) && this.f318421c == content.f318421c && this.f318422d == content.f318422d && this.f318423e == content.f318423e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f318423e) + r.i(r.i(this.f318420b.hashCode() * 31, 31, this.f318421c), 31, this.f318422d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(this.f318420b);
            sb2.append(", isRefreshing=");
            sb2.append(this.f318421c);
            sb2.append(", isResetRequired=");
            sb2.append(this.f318422d);
            sb2.append(", isScrolledBottom=");
            return r.x(sb2, this.f318423e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f318420b, parcel);
            while (itJ.hasNext()) {
                ((UserViewedAdvert) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f318421c ? 1 : 0);
            parcel.writeInt(this.f318422d ? 1 : 0);
            parcel.writeInt(this.f318423e ? 1 : 0);
        }
    }

    /* compiled from: UserViewedState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Error;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends UserViewedState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f318424b = new Error();

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: UserViewedState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.f318424b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error() {
            super(null);
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

    /* compiled from: UserViewedState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState$Loading;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends UserViewedState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f318425b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: UserViewedState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f318425b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading() {
            super(null);
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

    public /* synthetic */ UserViewedState(C42822w c42822w) {
        this();
    }

    public UserViewedState() {
    }
}
