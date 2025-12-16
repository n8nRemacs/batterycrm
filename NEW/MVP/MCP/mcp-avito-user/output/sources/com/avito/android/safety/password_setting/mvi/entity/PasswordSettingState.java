package com.avito.android.safety.password_setting.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PasswordSettingState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "ViewState", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class PasswordSettingState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewState f257503b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f257504c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f257505d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f257501e = new a(null);

    @k
    public static final Parcelable.Creator<PasswordSettingState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final PasswordSettingState f257502f = new PasswordSettingState(new ViewState(null, false), "", null, 4, null);

    /* compiled from: PasswordSettingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState$ViewState;", "Landroid/os/Parcelable;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ViewState implements Parcelable {

        @k
        public static final Parcelable.Creator<ViewState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257506b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f257507c;

        /* compiled from: PasswordSettingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState((PrintableText) parcel.readParcelable(ViewState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i12) {
                return new ViewState[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f257506b == viewState.f257506b && L.f(this.f257507c, viewState.f257507c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f257506b) * 31;
            PrintableText printableText = this.f257507c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(isLoading=");
            sb2.append(this.f257506b);
            sb2.append(", passwordError=");
            return c.m(sb2, this.f257507c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f257506b ? 1 : 0);
            parcel.writeParcelable(this.f257507c, i12);
        }

        public ViewState(@l PrintableText printableText, boolean z12) {
            this.f257506b = z12;
            this.f257507c = printableText;
        }

        public /* synthetic */ ViewState(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : printableText, (i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: PasswordSettingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PasswordSettingState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PasswordSettingState> {
        @Override // android.os.Parcelable.Creator
        public final PasswordSettingState createFromParcel(Parcel parcel) {
            return new PasswordSettingState(ViewState.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PasswordSettingState[] newArray(int i12) {
            return new PasswordSettingState[i12];
        }
    }

    public /* synthetic */ PasswordSettingState(ViewState viewState, String str, String str2, int i12, C42822w c42822w) {
        this(viewState, str, (i12 & 4) != 0 ? null : str2);
    }

    public static PasswordSettingState a(PasswordSettingState passwordSettingState, ViewState viewState, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            viewState = passwordSettingState.f257503b;
        }
        if ((i12 & 2) != 0) {
            str = passwordSettingState.f257504c;
        }
        if ((i12 & 4) != 0) {
            str2 = passwordSettingState.f257505d;
        }
        passwordSettingState.getClass();
        return new PasswordSettingState(viewState, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordSettingState)) {
            return false;
        }
        PasswordSettingState passwordSettingState = (PasswordSettingState) obj;
        return L.f(this.f257503b, passwordSettingState.f257503b) && L.f(this.f257504c, passwordSettingState.f257504c) && L.f(this.f257505d, passwordSettingState.f257505d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f257503b.hashCode() * 31, 31, this.f257504c);
        String str = this.f257505d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordSettingState(viewState=");
        sb2.append(this.f257503b);
        sb2.append(", password=");
        sb2.append(this.f257504c);
        sb2.append(", login=");
        return C22026a.c(sb2, this.f257505d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f257503b.writeToParcel(parcel, i12);
        parcel.writeString(this.f257504c);
        parcel.writeString(this.f257505d);
    }

    public PasswordSettingState(@k ViewState viewState, @k String str, @l String str2) {
        this.f257503b = viewState;
        this.f257504c = str;
        this.f257505d = str2;
    }
}
