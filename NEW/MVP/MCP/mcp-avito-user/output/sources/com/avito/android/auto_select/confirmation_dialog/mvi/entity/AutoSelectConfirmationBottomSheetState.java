package com.avito.android.auto_select.confirmation_dialog.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectConfirmationBottomSheetState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState;", "Landroid/os/Parcelable;", "Button", "a", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoSelectConfirmationBottomSheetState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f95905b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f95906c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Button f95907d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f95903e = new a(null);

    @k
    public static final Parcelable.Creator<AutoSelectConfirmationBottomSheetState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final AutoSelectConfirmationBottomSheetState f95904f = new AutoSelectConfirmationBottomSheetState(null, null, null);

    /* compiled from: AutoSelectConfirmationBottomSheetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState$Button;", "Landroid/os/Parcelable;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f95908b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f95909c;

        /* compiled from: AutoSelectConfirmationBottomSheetState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k DeepLink deepLink) {
            this.f95908b = str;
            this.f95909c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f95908b, button.f95908b) && L.f(this.f95909c, button.f95909c);
        }

        public final int hashCode() {
            return this.f95909c.hashCode() + (this.f95908b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f95908b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f95909c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f95908b);
            parcel.writeParcelable(this.f95909c, i12);
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState$a;", "", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AutoSelectConfirmationBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationBottomSheetState createFromParcel(Parcel parcel) {
            return new AutoSelectConfirmationBottomSheetState(parcel.readString(), (AttributedText) parcel.readParcelable(AutoSelectConfirmationBottomSheetState.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationBottomSheetState[] newArray(int i12) {
            return new AutoSelectConfirmationBottomSheetState[i12];
        }
    }

    public AutoSelectConfirmationBottomSheetState(@l String str, @l AttributedText attributedText, @l Button button) {
        this.f95905b = str;
        this.f95906c = attributedText;
        this.f95907d = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectConfirmationBottomSheetState)) {
            return false;
        }
        AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState = (AutoSelectConfirmationBottomSheetState) obj;
        return L.f(this.f95905b, autoSelectConfirmationBottomSheetState.f95905b) && L.f(this.f95906c, autoSelectConfirmationBottomSheetState.f95906c) && L.f(this.f95907d, autoSelectConfirmationBottomSheetState.f95907d);
    }

    public final int hashCode() {
        String str = this.f95905b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f95906c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Button button = this.f95907d;
        return iHashCode2 + (button != null ? button.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AutoSelectConfirmationBottomSheetState(title=" + this.f95905b + ", content=" + this.f95906c + ", button=" + this.f95907d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95905b);
        parcel.writeParcelable(this.f95906c, i12);
        Button button = this.f95907d;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
    }
}
