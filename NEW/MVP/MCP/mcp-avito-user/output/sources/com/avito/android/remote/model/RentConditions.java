package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: RentConditions.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/RentConditions;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "params", "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandParamsButton", "Lcom/avito/android/remote/model/RentAgreement;", "rentAgreement", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/ExpandItemsButton;Lcom/avito/android/remote/model/RentAgreement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ExpandItemsButton;", "getExpandParamsButton", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "Lcom/avito/android/remote/model/RentAgreement;", "getRentAgreement", "()Lcom/avito/android/remote/model/RentAgreement;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RentConditions implements Parcelable {

    @k
    public static final Parcelable.Creator<RentConditions> CREATOR = new Creator();

    @c("expandButton")
    @l
    private final ExpandItemsButton expandParamsButton;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<AdvertParameters.Parameter> params;

    @c("rentAgreement")
    @l
    private final RentAgreement rentAgreement;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: RentConditions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RentConditions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RentConditions createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RentConditions.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(AdvertParameters.Parameter.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RentConditions(attributedText, arrayList, parcel.readInt() == 0 ? null : ExpandItemsButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RentAgreement.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RentConditions[] newArray(int i12) {
            return new RentConditions[i12];
        }
    }

    public RentConditions() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ExpandItemsButton getExpandParamsButton() {
        return this.expandParamsButton;
    }

    @k
    public final List<AdvertParameters.Parameter> getParams() {
        return this.params;
    }

    @l
    public final RentAgreement getRentAgreement() {
        return this.rentAgreement;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        Iterator itJ = C0.j(this.params, parcel);
        while (itJ.hasNext()) {
            ((AdvertParameters.Parameter) itJ.next()).writeToParcel(parcel, flags);
        }
        ExpandItemsButton expandItemsButton = this.expandParamsButton;
        if (expandItemsButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expandItemsButton.writeToParcel(parcel, flags);
        }
        RentAgreement rentAgreement = this.rentAgreement;
        if (rentAgreement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rentAgreement.writeToParcel(parcel, flags);
        }
    }

    public RentConditions(@l AttributedText attributedText, @k List<AdvertParameters.Parameter> list, @l ExpandItemsButton expandItemsButton, @l RentAgreement rentAgreement) {
        this.title = attributedText;
        this.params = list;
        this.expandParamsButton = expandItemsButton;
        this.rentAgreement = rentAgreement;
    }

    public RentConditions(AttributedText attributedText, List list, ExpandItemsButton expandItemsButton, RentAgreement rentAgreement, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : expandItemsButton, (i12 & 8) != 0 ? null : rentAgreement);
    }
}
