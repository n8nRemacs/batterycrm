package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertSellerShortTermRent.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertSellerShortTermRent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Switcher;", "onlineBookingField", "", "Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Parameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/Action;", "manageCalendarButton", "<init>", "(Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Switcher;Ljava/util/List;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Switcher;", "getOnlineBookingField", "()Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Switcher;", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "getManageCalendarButton", "()Lcom/avito/android/remote/model/Action;", "Parameter", "Switcher", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertSellerShortTermRent implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertSellerShortTermRent> CREATOR = new Creator();

    @c("manageCalendarButton")
    @l
    private final Action manageCalendarButton;

    @c("onlineBookingField")
    @l
    private final Switcher onlineBookingField;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<Parameter> parameters;

    /* compiled from: AdvertSellerShortTermRent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertSellerShortTermRent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSellerShortTermRent createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Switcher switcherCreateFromParcel = parcel.readInt() == 0 ? null : Switcher.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Parameter.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertSellerShortTermRent(switcherCreateFromParcel, arrayList, (Action) parcel.readParcelable(AdvertSellerShortTermRent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSellerShortTermRent[] newArray(int i12) {
            return new AdvertSellerShortTermRent[i12];
        }
    }

    /* compiled from: AdvertSellerShortTermRent.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Parameter;", "Landroid/os/Parcelable;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Parameter implements Parcelable {

        @k
        public static final Parcelable.Creator<Parameter> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertSellerShortTermRent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter createFromParcel(@k Parcel parcel) {
                return new Parameter(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter[] newArray(int i12) {
                return new Parameter[i12];
            }
        }

        public Parameter(@k String str, @k String str2) {
            this.title = str;
            this.description = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: AdvertSellerShortTermRent.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018\"\u0004\b\u001b\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertSellerShortTermRent$Switcher;", "Landroid/os/Parcelable;", "", "title", "", "isEnabled", "isToggleHidden", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "<init>", "(Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "()Z", "setEnabled", "(Z)V", "setToggleHidden", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Switcher implements Parcelable {

        @k
        public static final Parcelable.Creator<Switcher> CREATOR = new Creator();

        @c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @l
        private final AttributedText disclaimer;

        @c("isEnabled")
        private boolean isEnabled;

        @c("isToggleHidden")
        private boolean isToggleHidden;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertSellerShortTermRent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Switcher> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Switcher createFromParcel(@k Parcel parcel) {
                return new Switcher(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (AttributedText) parcel.readParcelable(Switcher.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Switcher[] newArray(int i12) {
                return new Switcher[i12];
            }
        }

        public Switcher(@k String str, boolean z12, boolean z13, @l AttributedText attributedText) {
            this.title = str;
            this.isEnabled = z12;
            this.isToggleHidden = z13;
            this.disclaimer = attributedText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AttributedText getDisclaimer() {
            return this.disclaimer;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isToggleHidden, reason: from getter */
        public final boolean getIsToggleHidden() {
            return this.isToggleHidden;
        }

        public final void setEnabled(boolean z12) {
            this.isEnabled = z12;
        }

        public final void setToggleHidden(boolean z12) {
            this.isToggleHidden = z12;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            parcel.writeInt(this.isToggleHidden ? 1 : 0);
            parcel.writeParcelable(this.disclaimer, flags);
        }
    }

    public AdvertSellerShortTermRent(@l Switcher switcher, @l List<Parameter> list, @l Action action) {
        this.onlineBookingField = switcher;
        this.parameters = list;
        this.manageCalendarButton = action;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getManageCalendarButton() {
        return this.manageCalendarButton;
    }

    @l
    public final Switcher getOnlineBookingField() {
        return this.onlineBookingField;
    }

    @l
    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Switcher switcher = this.onlineBookingField;
        if (switcher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            switcher.writeToParcel(parcel, flags);
        }
        List<Parameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Parameter) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.manageCalendarButton, flags);
    }
}
