package com.avito.android.safety.password_change.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PasswordChangeState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "ViewState", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class PasswordChangeState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewState f257340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f257341c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f257342d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InputType f257343e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f257344f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f257345g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f257338h = new a(null);

    @k
    public static final Parcelable.Creator<PasswordChangeState> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final PasswordChangeState f257339i = new PasswordChangeState(new ViewState(false, null, null, false, false), "", "", InputType.f257311b, null, false, 48, null);

    /* compiled from: PasswordChangeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PasswordChangeState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PasswordChangeState> {
        @Override // android.os.Parcelable.Creator
        public final PasswordChangeState createFromParcel(Parcel parcel) {
            return new PasswordChangeState(ViewState.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), InputType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PasswordChangeState[] newArray(int i12) {
            return new PasswordChangeState[i12];
        }
    }

    public /* synthetic */ PasswordChangeState(ViewState viewState, String str, String str2, InputType inputType, String str3, boolean z12, int i12, C42822w c42822w) {
        this(viewState, str, str2, inputType, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? true : z12);
    }

    public static PasswordChangeState a(PasswordChangeState passwordChangeState, ViewState viewState, String str, String str2, InputType inputType, String str3, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            viewState = passwordChangeState.f257340b;
        }
        ViewState viewState2 = viewState;
        if ((i12 & 2) != 0) {
            str = passwordChangeState.f257341c;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = passwordChangeState.f257342d;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            inputType = passwordChangeState.f257343e;
        }
        InputType inputType2 = inputType;
        if ((i12 & 16) != 0) {
            str3 = passwordChangeState.f257344f;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            z12 = passwordChangeState.f257345g;
        }
        passwordChangeState.getClass();
        return new PasswordChangeState(viewState2, str4, str5, inputType2, str6, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordChangeState)) {
            return false;
        }
        PasswordChangeState passwordChangeState = (PasswordChangeState) obj;
        return L.f(this.f257340b, passwordChangeState.f257340b) && L.f(this.f257341c, passwordChangeState.f257341c) && L.f(this.f257342d, passwordChangeState.f257342d) && this.f257343e == passwordChangeState.f257343e && L.f(this.f257344f, passwordChangeState.f257344f) && this.f257345g == passwordChangeState.f257345g;
    }

    public final int hashCode() {
        int iHashCode = (this.f257343e.hashCode() + H.d(H.d(this.f257340b.hashCode() * 31, 31, this.f257341c), 31, this.f257342d)) * 31;
        String str = this.f257344f;
        return Boolean.hashCode(this.f257345g) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordChangeState(viewState=");
        sb2.append(this.f257340b);
        sb2.append(", oldPassword=");
        sb2.append(this.f257341c);
        sb2.append(", newPassword=");
        sb2.append(this.f257342d);
        sb2.append(", focusedInput=");
        sb2.append(this.f257343e);
        sb2.append(", login=");
        sb2.append(this.f257344f);
        sb2.append(", isOldPasswordHidden=");
        return r.x(sb2, this.f257345g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f257340b.writeToParcel(parcel, i12);
        parcel.writeString(this.f257341c);
        parcel.writeString(this.f257342d);
        parcel.writeString(this.f257343e.name());
        parcel.writeString(this.f257344f);
        parcel.writeInt(this.f257345g ? 1 : 0);
    }

    public PasswordChangeState(@k ViewState viewState, @k String str, @k String str2, @k InputType inputType, @l String str3, boolean z12) {
        this.f257340b = viewState;
        this.f257341c = str;
        this.f257342d = str2;
        this.f257343e = inputType;
        this.f257344f = str3;
        this.f257345g = z12;
    }

    /* compiled from: PasswordChangeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState$ViewState;", "Landroid/os/Parcelable;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ViewState implements Parcelable {

        @k
        public static final Parcelable.Creator<ViewState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257346b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f257347c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final PrintableText f257348d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f257349e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f257350f;

        /* compiled from: PasswordChangeState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(parcel.readInt() != 0, (PrintableText) parcel.readParcelable(ViewState.class.getClassLoader()), (PrintableText) parcel.readParcelable(ViewState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i12) {
                return new ViewState[i12];
            }
        }

        public ViewState(boolean z12, @l PrintableText printableText, @l PrintableText printableText2, boolean z13, boolean z14) {
            this.f257346b = z12;
            this.f257347c = printableText;
            this.f257348d = printableText2;
            this.f257349e = z13;
            this.f257350f = z14;
        }

        public static ViewState a(ViewState viewState, boolean z12, PrintableText printableText, PrintableText printableText2, boolean z13, boolean z14, int i12) {
            if ((i12 & 1) != 0) {
                z12 = viewState.f257346b;
            }
            boolean z15 = z12;
            if ((i12 & 2) != 0) {
                printableText = viewState.f257347c;
            }
            PrintableText printableText3 = printableText;
            if ((i12 & 4) != 0) {
                printableText2 = viewState.f257348d;
            }
            PrintableText printableText4 = printableText2;
            if ((i12 & 8) != 0) {
                z13 = viewState.f257349e;
            }
            boolean z16 = z13;
            if ((i12 & 16) != 0) {
                z14 = viewState.f257350f;
            }
            viewState.getClass();
            return new ViewState(z15, printableText3, printableText4, z16, z14);
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
            return this.f257346b == viewState.f257346b && L.f(this.f257347c, viewState.f257347c) && L.f(this.f257348d, viewState.f257348d) && this.f257349e == viewState.f257349e && this.f257350f == viewState.f257350f;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f257346b) * 31;
            PrintableText printableText = this.f257347c;
            int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
            PrintableText printableText2 = this.f257348d;
            return Boolean.hashCode(this.f257350f) + r.i((iHashCode2 + (printableText2 != null ? printableText2.hashCode() : 0)) * 31, 31, this.f257349e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(isLoading=");
            sb2.append(this.f257346b);
            sb2.append(", oldPasswordError=");
            sb2.append(this.f257347c);
            sb2.append(", newPasswordError=");
            sb2.append(this.f257348d);
            sb2.append(", isSessionsFlow=");
            sb2.append(this.f257349e);
            sb2.append(", isPassportMultiprofile=");
            return r.x(sb2, this.f257350f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f257346b ? 1 : 0);
            parcel.writeParcelable(this.f257347c, i12);
            parcel.writeParcelable(this.f257348d, i12);
            parcel.writeInt(this.f257349e ? 1 : 0);
            parcel.writeInt(this.f257350f ? 1 : 0);
        }

        public /* synthetic */ ViewState(boolean z12, PrintableText printableText, PrintableText printableText2, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : printableText, (i12 & 4) != 0 ? null : printableText2, z13, z14);
        }
    }
}
