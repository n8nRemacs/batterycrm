package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StrSellerCalendarParameters.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/StrSellerCalendarParameters;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "formFields", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "", "screenTitle", "Lcom/avito/android/remote/model/StrSellerCalendarRejectInfo;", "rejectInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/StrSellerCalendarRejectInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFormFields", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getScreenTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/StrSellerCalendarRejectInfo;", "getRejectInfo", "()Lcom/avito/android/remote/model/StrSellerCalendarRejectInfo;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrSellerCalendarParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerCalendarParameters> CREATOR = new Creator();

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @k
    private final AttributedText disclaimer;

    @c("formFields")
    @l
    private final List<ParameterSlot> formFields;

    @c("rejectInfo")
    @l
    private final StrSellerCalendarRejectInfo rejectInfo;

    @c("screenTitle")
    @l
    private final String screenTitle;

    /* compiled from: StrSellerCalendarParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerCalendarParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParameters createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(StrSellerCalendarParameters.class, parcel, arrayList, iL2, 1);
                }
            }
            return new StrSellerCalendarParameters(arrayList, (AttributedText) parcel.readParcelable(StrSellerCalendarParameters.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? StrSellerCalendarRejectInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParameters[] newArray(int i12) {
            return new StrSellerCalendarParameters[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrSellerCalendarParameters(@l List<? extends ParameterSlot> list, @k AttributedText attributedText, @l String str, @l StrSellerCalendarRejectInfo strSellerCalendarRejectInfo) {
        this.formFields = list;
        this.disclaimer = attributedText;
        this.screenTitle = str;
        this.rejectInfo = strSellerCalendarRejectInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final List<ParameterSlot> getFormFields() {
        return this.formFields;
    }

    @l
    public final StrSellerCalendarRejectInfo getRejectInfo() {
        return this.rejectInfo;
    }

    @l
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<ParameterSlot> list = this.formFields;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.disclaimer, flags);
        parcel.writeString(this.screenTitle);
        StrSellerCalendarRejectInfo strSellerCalendarRejectInfo = this.rejectInfo;
        if (strSellerCalendarRejectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerCalendarRejectInfo.writeToParcel(parcel, flags);
        }
    }
}
