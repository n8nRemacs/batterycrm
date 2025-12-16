package com.avito.android.profile_settings.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.profile_settings.TabItem;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSettingsState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState;", "Landroid/os/Parcelable;", "a", "Data", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileSettingsState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final transient Data f228468b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f228469c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final transient Throwable f228470d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f228471e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f228466f = new a(null);

    @k
    public static final Parcelable.Creator<ProfileSettingsState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final ProfileSettingsState f228467g = new ProfileSettingsState(null, false, null, null, 15, null);

    /* compiled from: ProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState$Data;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Data implements Parcelable {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f228472b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<TabItem> f228473c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeeplinkAction f228474d;

        /* compiled from: ProfileSettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(TabItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Data((DeeplinkAction) parcel.readParcelable(Data.class.getClassLoader()), string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@l DeeplinkAction deeplinkAction, @l String str, @k List list) {
            this.f228472b = str;
            this.f228473c = list;
            this.f228474d = deeplinkAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return L.f(this.f228472b, data.f228472b) && L.f(this.f228473c, data.f228473c) && L.f(this.f228474d, data.f228474d);
        }

        public final int hashCode() {
            String str = this.f228472b;
            int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f228473c);
            DeeplinkAction deeplinkAction = this.f228474d;
            return iE2 + (deeplinkAction != null ? deeplinkAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Data(title=" + this.f228472b + ", tabs=" + this.f228473c + ", action=" + this.f228474d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f228472b);
            Iterator itJ = C0.j(this.f228473c, parcel);
            while (itJ.hasNext()) {
                ((TabItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f228474d, i12);
        }
    }

    /* compiled from: ProfileSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileSettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileSettingsState> {
        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsState createFromParcel(Parcel parcel) {
            return new ProfileSettingsState(parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Throwable) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsState[] newArray(int i12) {
            return new ProfileSettingsState[i12];
        }
    }

    public ProfileSettingsState() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    public static ProfileSettingsState a(ProfileSettingsState profileSettingsState, boolean z12, ApiException apiException, String str, int i12) {
        Data data = (i12 & 1) != 0 ? profileSettingsState.f228468b : null;
        if ((i12 & 2) != 0) {
            z12 = profileSettingsState.f228469c;
        }
        ApiException apiException2 = apiException;
        if ((i12 & 4) != 0) {
            apiException2 = profileSettingsState.f228470d;
        }
        if ((i12 & 8) != 0) {
            str = profileSettingsState.f228471e;
        }
        profileSettingsState.getClass();
        return new ProfileSettingsState(data, z12, apiException2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSettingsState)) {
            return false;
        }
        ProfileSettingsState profileSettingsState = (ProfileSettingsState) obj;
        return L.f(this.f228468b, profileSettingsState.f228468b) && this.f228469c == profileSettingsState.f228469c && L.f(this.f228470d, profileSettingsState.f228470d) && L.f(this.f228471e, profileSettingsState.f228471e);
    }

    public final int hashCode() {
        Data data = this.f228468b;
        int i12 = r.i((data == null ? 0 : data.hashCode()) * 31, 31, this.f228469c);
        Throwable th2 = this.f228470d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str = this.f228471e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileSettingsState(data=");
        sb2.append(this.f228468b);
        sb2.append(", isLoading=");
        sb2.append(this.f228469c);
        sb2.append(", error=");
        sb2.append(this.f228470d);
        sb2.append(", activeTabShortcut=");
        return C22026a.c(sb2, this.f228471e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Data data = this.f228468b;
        if (data == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            data.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f228469c ? 1 : 0);
        parcel.writeSerializable(this.f228470d);
        parcel.writeString(this.f228471e);
    }

    public ProfileSettingsState(@l Data data, boolean z12, @l Throwable th2, @l String str) {
        this.f228468b = data;
        this.f228469c = z12;
        this.f228470d = th2;
        this.f228471e = str;
    }

    public /* synthetic */ ProfileSettingsState(Data data, boolean z12, Throwable th2, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : data, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : str);
    }
}
