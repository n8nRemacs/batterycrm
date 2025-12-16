package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jv\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010 ¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServices;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "header", "title", "hint", "Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;", "hintData", "", "Lcom/avito/android/remote/model/imv_services/ImvServicesInfoBody;", "services", "Lcom/avito/android/remote/model/imv_services/ImvServicesChart;", "priceRange", "Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;", "feedback", "Lcom/avito/android/remote/model/imv_services/ImvServicesLabel;", "label", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;Ljava/util/List;Lcom/avito/android/remote/model/imv_services/ImvServicesChart;Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;Lcom/avito/android/remote/model/imv_services/ImvServicesLabel;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/imv_services/ImvServicesChart;", "component7", "()Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;", "component8", "()Lcom/avito/android/remote/model/imv_services/ImvServicesLabel;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;Ljava/util/List;Lcom/avito/android/remote/model/imv_services/ImvServicesChart;Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;Lcom/avito/android/remote/model/imv_services/ImvServicesLabel;)Lcom/avito/android/remote/model/imv_services/ImvServices;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getHeader", "getTitle", "getHint", "Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;", "getHintData", "Ljava/util/List;", "getServices", "Lcom/avito/android/remote/model/imv_services/ImvServicesChart;", "getPriceRange", "Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;", "getFeedback", "Lcom/avito/android/remote/model/imv_services/ImvServicesLabel;", "getLabel", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServices implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvServices> CREATOR = new Creator();

    @c("feedback")
    @l
    private final ImvServicesFeedback feedback;

    @c("header")
    @l
    private final AttributedText header;

    @c("hint")
    @l
    private final AttributedText hint;

    @c("hintData")
    @l
    private final ImvServicesHintData hintData;

    @c("label")
    @l
    private final ImvServicesLabel label;

    @c("priceRange")
    @l
    private final ImvServicesChart priceRange;

    @c("priceRanges")
    @l
    private final List<ImvServicesInfoBody> services;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServices> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServices createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ImvServices.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(ImvServices.class.getClassLoader());
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(ImvServices.class.getClassLoader());
            ImvServicesHintData imvServicesHintDataCreateFromParcel = parcel.readInt() == 0 ? null : ImvServicesHintData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ImvServicesInfoBody.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ImvServices(attributedText, attributedText2, attributedText3, imvServicesHintDataCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : ImvServicesChart.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImvServicesFeedback.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImvServicesLabel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServices[] newArray(int i12) {
            return new ImvServices[i12];
        }
    }

    public ImvServices(@l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l ImvServicesHintData imvServicesHintData, @l List<ImvServicesInfoBody> list, @l ImvServicesChart imvServicesChart, @l ImvServicesFeedback imvServicesFeedback, @l ImvServicesLabel imvServicesLabel) {
        this.header = attributedText;
        this.title = attributedText2;
        this.hint = attributedText3;
        this.hintData = imvServicesHintData;
        this.services = list;
        this.priceRange = imvServicesChart;
        this.feedback = imvServicesFeedback;
        this.label = imvServicesLabel;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ImvServicesHintData getHintData() {
        return this.hintData;
    }

    @l
    public final List<ImvServicesInfoBody> component5() {
        return this.services;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ImvServicesChart getPriceRange() {
        return this.priceRange;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ImvServicesFeedback getFeedback() {
        return this.feedback;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ImvServicesLabel getLabel() {
        return this.label;
    }

    @k
    public final ImvServices copy(@l AttributedText header, @l AttributedText title, @l AttributedText hint, @l ImvServicesHintData hintData, @l List<ImvServicesInfoBody> services, @l ImvServicesChart priceRange, @l ImvServicesFeedback feedback2, @l ImvServicesLabel label) {
        return new ImvServices(header, title, hint, hintData, services, priceRange, feedback2, label);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServices)) {
            return false;
        }
        ImvServices imvServices = (ImvServices) other;
        return L.f(this.header, imvServices.header) && L.f(this.title, imvServices.title) && L.f(this.hint, imvServices.hint) && L.f(this.hintData, imvServices.hintData) && L.f(this.services, imvServices.services) && L.f(this.priceRange, imvServices.priceRange) && L.f(this.feedback, imvServices.feedback) && L.f(this.label, imvServices.label);
    }

    @l
    public final ImvServicesFeedback getFeedback() {
        return this.feedback;
    }

    @l
    public final AttributedText getHeader() {
        return this.header;
    }

    @l
    public final AttributedText getHint() {
        return this.hint;
    }

    @l
    public final ImvServicesHintData getHintData() {
        return this.hintData;
    }

    @l
    public final ImvServicesLabel getLabel() {
        return this.label;
    }

    @l
    public final ImvServicesChart getPriceRange() {
        return this.priceRange;
    }

    @l
    public final List<ImvServicesInfoBody> getServices() {
        return this.services;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.header;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.title;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.hint;
        int iHashCode3 = (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        ImvServicesHintData imvServicesHintData = this.hintData;
        int iHashCode4 = (iHashCode3 + (imvServicesHintData == null ? 0 : imvServicesHintData.hashCode())) * 31;
        List<ImvServicesInfoBody> list = this.services;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ImvServicesChart imvServicesChart = this.priceRange;
        int iHashCode6 = (iHashCode5 + (imvServicesChart == null ? 0 : imvServicesChart.hashCode())) * 31;
        ImvServicesFeedback imvServicesFeedback = this.feedback;
        int iHashCode7 = (iHashCode6 + (imvServicesFeedback == null ? 0 : imvServicesFeedback.hashCode())) * 31;
        ImvServicesLabel imvServicesLabel = this.label;
        return iHashCode7 + (imvServicesLabel != null ? imvServicesLabel.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ImvServices(header=" + this.header + ", title=" + this.title + ", hint=" + this.hint + ", hintData=" + this.hintData + ", services=" + this.services + ", priceRange=" + this.priceRange + ", feedback=" + this.feedback + ", label=" + this.label + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.header, flags);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.hint, flags);
        ImvServicesHintData imvServicesHintData = this.hintData;
        if (imvServicesHintData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesHintData.writeToParcel(parcel, flags);
        }
        List<ImvServicesInfoBody> list = this.services;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ImvServicesInfoBody) itA.next()).writeToParcel(parcel, flags);
            }
        }
        ImvServicesChart imvServicesChart = this.priceRange;
        if (imvServicesChart == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesChart.writeToParcel(parcel, flags);
        }
        ImvServicesFeedback imvServicesFeedback = this.feedback;
        if (imvServicesFeedback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesFeedback.writeToParcel(parcel, flags);
        }
        ImvServicesLabel imvServicesLabel = this.label;
        if (imvServicesLabel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesLabel.writeToParcel(parcel, flags);
        }
    }
}
