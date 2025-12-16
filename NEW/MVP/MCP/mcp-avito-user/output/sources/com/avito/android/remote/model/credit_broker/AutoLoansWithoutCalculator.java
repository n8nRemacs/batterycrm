package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditBrokerProduct.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0011R(\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0011R\"\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103R\"\u00105\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u0010.\u001a\u0004\b6\u00103¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/AutoLoansWithoutCalculator;", "Lcom/avito/android/remote/model/credit_broker/AdvertDetailsAutoLoansData;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/remote/model/Image;", "fallbackIcons", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)Lcom/avito/android/remote/model/credit_broker/AutoLoansWithoutCalculator;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Ljava/util/List;", "getFallbackIcons", "Lcom/avito/android/remote/model/UniversalImage;", "universalIcons", "getUniversalIcons", "getUniversalIcons$annotations", "()V", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "renderEventParams", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getRenderEventParams", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getRenderEventParams$annotations", "clickEventParams", "getClickEventParams", "getClickEventParams$annotations", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoLoansWithoutCalculator implements AdvertDetailsAutoLoansData, CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<AutoLoansWithoutCalculator> CREATOR = new Creator();

    @l
    private final CompositeBrokerEventParams clickEventParams;

    @c("images")
    @l
    private final List<Image> fallbackIcons;

    @l
    private final CompositeBrokerEventParams renderEventParams;

    @c("attributedSubtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    @l
    private final List<UniversalImage> universalIcons;

    /* compiled from: CreditBrokerProduct.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoLoansWithoutCalculator> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoLoansWithoutCalculator createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoLoansWithoutCalculator.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(AutoLoansWithoutCalculator.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new AutoLoansWithoutCalculator(string, attributedText, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoLoansWithoutCalculator[] newArray(int i12) {
            return new AutoLoansWithoutCalculator[i12];
        }
    }

    public AutoLoansWithoutCalculator(@l String str, @l AttributedText attributedText, @l List<Image> list) {
        this.title = str;
        this.subtitle = attributedText;
        this.fallbackIcons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoLoansWithoutCalculator copy$default(AutoLoansWithoutCalculator autoLoansWithoutCalculator, String str, AttributedText attributedText, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoLoansWithoutCalculator.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = autoLoansWithoutCalculator.subtitle;
        }
        if ((i12 & 4) != 0) {
            list = autoLoansWithoutCalculator.fallbackIcons;
        }
        return autoLoansWithoutCalculator.copy(str, attributedText, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final List<Image> component3() {
        return this.fallbackIcons;
    }

    @k
    public final AutoLoansWithoutCalculator copy(@l String title, @l AttributedText subtitle, @l List<Image> fallbackIcons) {
        return new AutoLoansWithoutCalculator(title, subtitle, fallbackIcons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoLoansWithoutCalculator)) {
            return false;
        }
        AutoLoansWithoutCalculator autoLoansWithoutCalculator = (AutoLoansWithoutCalculator) other;
        return L.f(this.title, autoLoansWithoutCalculator.title) && L.f(this.subtitle, autoLoansWithoutCalculator.subtitle) && L.f(this.fallbackIcons, autoLoansWithoutCalculator.fallbackIcons);
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public CompositeBrokerEventParams getClickEventParams() {
        return this.clickEventParams;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public List<Image> getFallbackIcons() {
        return this.fallbackIcons;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public CompositeBrokerEventParams getRenderEventParams() {
        return this.renderEventParams;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData
    @l
    public List<UniversalImage> getUniversalIcons() {
        return this.universalIcons;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<Image> list = this.fallbackIcons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoLoansWithoutCalculator(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", fallbackIcons=");
        return H.p(sb2, this.fallbackIcons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        List<Image> list = this.fallbackIcons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public static /* synthetic */ void getClickEventParams$annotations() {
    }

    public static /* synthetic */ void getRenderEventParams$annotations() {
    }

    public static /* synthetic */ void getUniversalIcons$annotations() {
    }
}
