package com.avito.android.remote.model.installments;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PromoBlockIconType;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InstallmentsSwitcherData.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010%\"\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/remote/model/PromoBlockIconType;", "iconType", "", "isSwitchOn", "refreshUrl", "Lcom/avito/android/remote/model/ParametrizedEvent;", "subtitleClickEvent", "", "Lcom/avito/android/remote/model/installments/InstallmentsSwitcherActionData;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/PromoBlockIconType;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/ParametrizedEvent;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/PromoBlockIconType;", "getIconType", "()Lcom/avito/android/remote/model/PromoBlockIconType;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setSwitchOn", "(Ljava/lang/Boolean;)V", "getRefreshUrl", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getSubtitleClickEvent", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstallmentsSwitcherData implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsSwitcherData> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<InstallmentsSwitcherActionData> actions;

    @c("icon")
    @l
    private final PromoBlockIconType iconType;

    @c("isSwitchOn")
    @l
    private Boolean isSwitchOn;

    @c("refreshUrl")
    @l
    private final String refreshUrl;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("subtitleClickEvent")
    @l
    private final ParametrizedEvent subtitleClickEvent;

    @c("title")
    @l
    private final String title;

    /* compiled from: InstallmentsSwitcherData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsSwitcherData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsSwitcherData createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InstallmentsSwitcherData.class.getClassLoader());
            PromoBlockIconType promoBlockIconTypeValueOf = parcel.readInt() == 0 ? null : PromoBlockIconType.valueOf(parcel.readString());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            ParametrizedEvent parametrizedEventCreateFromParcel = parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(InstallmentsSwitcherData.class, parcel, arrayList, iL2, 1);
                }
            }
            return new InstallmentsSwitcherData(string, attributedText, promoBlockIconTypeValueOf, boolValueOf, string2, parametrizedEventCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsSwitcherData[] newArray(int i12) {
            return new InstallmentsSwitcherData[i12];
        }
    }

    public InstallmentsSwitcherData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<InstallmentsSwitcherActionData> getActions() {
        return this.actions;
    }

    @l
    public final PromoBlockIconType getIconType() {
        return this.iconType;
    }

    @l
    public final String getRefreshUrl() {
        return this.refreshUrl;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final ParametrizedEvent getSubtitleClickEvent() {
        return this.subtitleClickEvent;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isSwitchOn, reason: from getter */
    public final Boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    public final void setSwitchOn(@l Boolean bool) {
        this.isSwitchOn = bool;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        PromoBlockIconType promoBlockIconType = this.iconType;
        if (promoBlockIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(promoBlockIconType.name());
        }
        Boolean bool = this.isSwitchOn;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.refreshUrl);
        ParametrizedEvent parametrizedEvent = this.subtitleClickEvent;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, flags);
        }
        List<InstallmentsSwitcherActionData> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstallmentsSwitcherData(@l String str, @l AttributedText attributedText, @l PromoBlockIconType promoBlockIconType, @l Boolean bool, @l String str2, @l ParametrizedEvent parametrizedEvent, @l List<? extends InstallmentsSwitcherActionData> list) {
        this.title = str;
        this.subtitle = attributedText;
        this.iconType = promoBlockIconType;
        this.isSwitchOn = bool;
        this.refreshUrl = str2;
        this.subtitleClickEvent = parametrizedEvent;
        this.actions = list;
    }

    public /* synthetic */ InstallmentsSwitcherData(String str, AttributedText attributedText, PromoBlockIconType promoBlockIconType, Boolean bool, String str2, ParametrizedEvent parametrizedEvent, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : promoBlockIconType, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : parametrizedEvent, (i12 & 64) != 0 ? null : list);
    }
}
