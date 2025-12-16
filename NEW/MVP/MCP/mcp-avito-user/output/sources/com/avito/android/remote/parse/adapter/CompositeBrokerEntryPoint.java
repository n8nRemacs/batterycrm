package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBroker.kt */
@K51.d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;", "Lcom/avito/android/remote/model/credit_broker/AdvertDetailsAutoLoansData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/remote/model/UniversalImage;", "universalIcons", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "renderEventParams", "clickEventParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getUniversalIcons", "()Ljava/util/List;", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getRenderEventParams", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getClickEventParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CompositeBrokerEntryPoint implements AdvertDetailsAutoLoansData, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CompositeBrokerEntryPoint> CREATOR = new a();

    @com.google.gson.annotations.c("clickEventParams")
    @Y61.l
    private final CompositeBrokerEventParams clickEventParams;

    @com.google.gson.annotations.c("renderEventParams")
    @Y61.l
    private final CompositeBrokerEventParams renderEventParams;

    @com.google.gson.annotations.c("attributedSubtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("icons")
    @Y61.l
    private final List<UniversalImage> universalIcons;

    /* compiled from: AdvertCreditCompositeBroker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompositeBrokerEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerEntryPoint createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CompositeBrokerEntryPoint.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(CompositeBrokerEntryPoint.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new CompositeBrokerEntryPoint(string, attributedText, arrayList, parcel.readInt() == 0 ? null : CompositeBrokerEventParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CompositeBrokerEventParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerEntryPoint[] newArray(int i12) {
            return new CompositeBrokerEntryPoint[i12];
        }
    }

    public CompositeBrokerEntryPoint(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l List<UniversalImage> list, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams, @Y61.l CompositeBrokerEventParams compositeBrokerEventParams2) {
        this.title = str;
        this.subtitle = attributedText;
        this.universalIcons = list;
        this.renderEventParams = compositeBrokerEventParams;
        this.clickEventParams = compositeBrokerEventParams2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeBrokerEntryPoint)) {
            return false;
        }
        CompositeBrokerEntryPoint compositeBrokerEntryPoint = (CompositeBrokerEntryPoint) obj;
        return kotlin.jvm.internal.L.f(this.title, compositeBrokerEntryPoint.title) && kotlin.jvm.internal.L.f(this.subtitle, compositeBrokerEntryPoint.subtitle) && kotlin.jvm.internal.L.f(this.universalIcons, compositeBrokerEntryPoint.universalIcons) && kotlin.jvm.internal.L.f(this.renderEventParams, compositeBrokerEntryPoint.renderEventParams) && kotlin.jvm.internal.L.f(this.clickEventParams, compositeBrokerEntryPoint.clickEventParams);
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.l
    public final CompositeBrokerEventParams getClickEventParams() {
        return this.clickEventParams;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.l
    public final List<Image> getFallbackIcons() {
        return null;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.l
    public final CompositeBrokerEventParams getRenderEventParams() {
        return this.renderEventParams;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @Y61.l
    public final List<UniversalImage> getUniversalIcons() {
        return this.universalIcons;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<UniversalImage> list = this.universalIcons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams = this.renderEventParams;
        int iHashCode4 = (iHashCode3 + (compositeBrokerEventParams == null ? 0 : compositeBrokerEventParams.hashCode())) * 31;
        CompositeBrokerEventParams compositeBrokerEventParams2 = this.clickEventParams;
        return iHashCode4 + (compositeBrokerEventParams2 != null ? compositeBrokerEventParams2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CompositeBrokerEntryPoint(title=" + this.title + ", subtitle=" + this.subtitle + ", universalIcons=" + this.universalIcons + ", renderEventParams=" + this.renderEventParams + ", clickEventParams=" + this.clickEventParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, i12);
        List<UniversalImage> list = this.universalIcons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        CompositeBrokerEventParams compositeBrokerEventParams = this.renderEventParams;
        if (compositeBrokerEventParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerEventParams.writeToParcel(parcel, i12);
        }
        CompositeBrokerEventParams compositeBrokerEventParams2 = this.clickEventParams;
        if (compositeBrokerEventParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerEventParams2.writeToParcel(parcel, i12);
        }
    }
}
