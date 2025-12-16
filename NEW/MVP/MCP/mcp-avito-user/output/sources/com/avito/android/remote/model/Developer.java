package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Developer.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0080\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b:\u0010\u0019R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\u001eR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010 ¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/Developer;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/remote/model/DeveloperCard;", "trustCard", "foundationCard", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "params", "Lcom/avito/android/remote/model/ButtonAction;", "button", "", "analyticsParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/DeveloperCard;Lcom/avito/android/remote/model/DeveloperCard;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component4", "()Lcom/avito/android/remote/model/DeveloperCard;", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/remote/model/ButtonAction;", "component8", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/DeveloperCard;Lcom/avito/android/remote/model/DeveloperCard;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/Map;)Lcom/avito/android/remote/model/Developer;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/DeveloperCard;", "getTrustCard", "getFoundationCard", "Ljava/util/List;", "getParams", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "Ljava/util/Map;", "getAnalyticsParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Developer implements Parcelable {

    @k
    public static final Parcelable.Creator<Developer> CREATOR = new Creator();

    @c("analytics")
    @l
    private final Map<String, String> analyticsParams;

    @c("button")
    @l
    private final ButtonAction button;

    @c("description")
    @l
    private final AttributedText description;

    @c("foundationCard")
    @l
    private final DeveloperCard foundationCard;

    @c("id")
    @l
    private final String id;

    @com.avito.android.gson.c
    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<AdvertParameters.Parameter> params;

    @c("title")
    @l
    private final AttributedText title;

    @c("trustCard")
    @l
    private final DeveloperCard trustCard;

    /* compiled from: Developer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Developer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Developer createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Developer.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Developer.class.getClassLoader());
            LinkedHashMap linkedHashMap = null;
            DeveloperCard developerCardCreateFromParcel = parcel.readInt() == 0 ? null : DeveloperCard.CREATOR.createFromParcel(parcel);
            DeveloperCard developerCardCreateFromParcel2 = parcel.readInt() == 0 ? null : DeveloperCard.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(AdvertParameters.Parameter.CREATOR, parcel, arrayList, iC2, 1);
            }
            ButtonAction buttonActionCreateFromParcel = parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new Developer(string, attributedText, attributedText2, developerCardCreateFromParcel, developerCardCreateFromParcel2, arrayList, buttonActionCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Developer[] newArray(int i12) {
            return new Developer[i12];
        }
    }

    public Developer() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeveloperCard getTrustCard() {
        return this.trustCard;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeveloperCard getFoundationCard() {
        return this.foundationCard;
    }

    @k
    public final List<AdvertParameters.Parameter> component6() {
        return this.params;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final Map<String, String> component8() {
        return this.analyticsParams;
    }

    @k
    public final Developer copy(@l String id2, @l AttributedText title, @l AttributedText description, @l DeveloperCard trustCard, @l DeveloperCard foundationCard, @k List<AdvertParameters.Parameter> params, @l ButtonAction button, @l Map<String, String> analyticsParams) {
        return new Developer(id2, title, description, trustCard, foundationCard, params, button, analyticsParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Developer)) {
            return false;
        }
        Developer developer = (Developer) other;
        return L.f(this.id, developer.id) && L.f(this.title, developer.title) && L.f(this.description, developer.description) && L.f(this.trustCard, developer.trustCard) && L.f(this.foundationCard, developer.foundationCard) && L.f(this.params, developer.params) && L.f(this.button, developer.button) && L.f(this.analyticsParams, developer.analyticsParams);
    }

    @l
    public final Map<String, String> getAnalyticsParams() {
        return this.analyticsParams;
    }

    @l
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final DeveloperCard getFoundationCard() {
        return this.foundationCard;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @k
    public final List<AdvertParameters.Parameter> getParams() {
        return this.params;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final DeveloperCard getTrustCard() {
        return this.trustCard;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.title;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        DeveloperCard developerCard = this.trustCard;
        int iHashCode4 = (iHashCode3 + (developerCard == null ? 0 : developerCard.hashCode())) * 31;
        DeveloperCard developerCard2 = this.foundationCard;
        int iE2 = H.e((iHashCode4 + (developerCard2 == null ? 0 : developerCard2.hashCode())) * 31, 31, this.params);
        ButtonAction buttonAction = this.button;
        int iHashCode5 = (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Map<String, String> map = this.analyticsParams;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Developer(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", trustCard=");
        sb2.append(this.trustCard);
        sb2.append(", foundationCard=");
        sb2.append(this.foundationCard);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", analyticsParams=");
        return r.w(sb2, this.analyticsParams, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        DeveloperCard developerCard = this.trustCard;
        if (developerCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developerCard.writeToParcel(parcel, flags);
        }
        DeveloperCard developerCard2 = this.foundationCard;
        if (developerCard2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developerCard2.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.params, parcel);
        while (itJ.hasNext()) {
            ((AdvertParameters.Parameter) itJ.next()).writeToParcel(parcel, flags);
        }
        ButtonAction buttonAction = this.button;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.analyticsParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public Developer(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l DeveloperCard developerCard, @l DeveloperCard developerCard2, @k List<AdvertParameters.Parameter> list, @l ButtonAction buttonAction, @l Map<String, String> map) {
        this.id = str;
        this.title = attributedText;
        this.description = attributedText2;
        this.trustCard = developerCard;
        this.foundationCard = developerCard2;
        this.params = list;
        this.button = buttonAction;
        this.analyticsParams = map;
    }

    public Developer(String str, AttributedText attributedText, AttributedText attributedText2, DeveloperCard developerCard, DeveloperCard developerCard2, List list, ButtonAction buttonAction, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : attributedText2, (i12 & 8) != 0 ? null : developerCard, (i12 & 16) != 0 ? null : developerCard2, (i12 & 32) != 0 ? C42784z0.f406748b : list, (i12 & 64) != 0 ? null : buttonAction, (i12 & 128) == 0 ? map : null);
    }
}
