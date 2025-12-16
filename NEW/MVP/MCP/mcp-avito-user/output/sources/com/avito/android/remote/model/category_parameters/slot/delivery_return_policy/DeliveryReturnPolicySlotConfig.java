package com.avito.android.remote.model.category_parameters.slot.delivery_return_policy;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryReturnPolicySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u000e\u0010,R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "badgeText", "disabledDeliveryMessage", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "returnPolicy", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "returnPolicyRadioField", "disabledNoReturnDBSMessage", "", "isDisabledWhenDeliveryServicesOff", "", "availableRadioPolicyIds", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/Set;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Ljava/lang/String;", "getBadgeText", "()Ljava/lang/String;", "getDisabledDeliveryMessage", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getReturnPolicy", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "getReturnPolicyRadioField", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "getDisabledNoReturnDBSMessage", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/Set;", "getAvailableRadioPolicyIds", "()Ljava/util/Set;", "setAvailableRadioPolicyIds", "(Ljava/util/Set;)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryReturnPolicySlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryReturnPolicySlotConfig> CREATOR = new Creator();

    @l
    private Set<String> availableRadioPolicyIds;

    @c("badgeText")
    @l
    private final String badgeText;

    @c("disabledDeliveryMessage")
    @l
    private final AttributedText disabledDeliveryMessage;

    @c("disabledNoReturnDBSMessage")
    @l
    private final AttributedText disabledNoReturnDBSMessage;

    @c("disableWhenDeliveryServicesOff")
    @l
    private final Boolean isDisabledWhenDeliveryServicesOff;

    @c("returnPolicyField")
    @k
    private final BooleanParameter returnPolicy;

    @c("returnPolicyRadioField")
    @l
    private final SelectParameter.Flat returnPolicyRadioField;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DeliveryReturnPolicySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryReturnPolicySlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicySlotConfig createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            String string = parcel.readString();
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            BooleanParameter booleanParameter = (BooleanParameter) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            SelectParameter.Flat flat = (SelectParameter.Flat) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            AttributedText attributedText4 = (AttributedText) parcel.readParcelable(DeliveryReturnPolicySlotConfig.class.getClassLoader());
            LinkedHashSet linkedHashSet = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readString());
                }
            }
            return new DeliveryReturnPolicySlotConfig(attributedText, attributedText2, string, attributedText3, booleanParameter, flat, attributedText4, boolValueOf, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicySlotConfig[] newArray(int i12) {
            return new DeliveryReturnPolicySlotConfig[i12];
        }
    }

    public DeliveryReturnPolicySlotConfig(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l AttributedText attributedText3, @k BooleanParameter booleanParameter, @l SelectParameter.Flat flat, @l AttributedText attributedText4, @l Boolean bool, @l Set<String> set) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.badgeText = str;
        this.disabledDeliveryMessage = attributedText3;
        this.returnPolicy = booleanParameter;
        this.returnPolicyRadioField = flat;
        this.disabledNoReturnDBSMessage = attributedText4;
        this.isDisabledWhenDeliveryServicesOff = bool;
        this.availableRadioPolicyIds = set;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Set<String> getAvailableRadioPolicyIds() {
        return this.availableRadioPolicyIds;
    }

    @l
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    public final AttributedText getDisabledDeliveryMessage() {
        return this.disabledDeliveryMessage;
    }

    @l
    public final AttributedText getDisabledNoReturnDBSMessage() {
        return this.disabledNoReturnDBSMessage;
    }

    @k
    public final BooleanParameter getReturnPolicy() {
        return this.returnPolicy;
    }

    @l
    public final SelectParameter.Flat getReturnPolicyRadioField() {
        return this.returnPolicyRadioField;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isDisabledWhenDeliveryServicesOff, reason: from getter */
    public final Boolean getIsDisabledWhenDeliveryServicesOff() {
        return this.isDisabledWhenDeliveryServicesOff;
    }

    public final void setAvailableRadioPolicyIds(@l Set<String> set) {
        this.availableRadioPolicyIds = set;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeString(this.badgeText);
        parcel.writeParcelable(this.disabledDeliveryMessage, flags);
        parcel.writeParcelable(this.returnPolicy, flags);
        parcel.writeParcelable(this.returnPolicyRadioField, flags);
        parcel.writeParcelable(this.disabledNoReturnDBSMessage, flags);
        Boolean bool = this.isDisabledWhenDeliveryServicesOff;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Set<String> set = this.availableRadioPolicyIds;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    public /* synthetic */ DeliveryReturnPolicySlotConfig(AttributedText attributedText, AttributedText attributedText2, String str, AttributedText attributedText3, BooleanParameter booleanParameter, SelectParameter.Flat flat, AttributedText attributedText4, Boolean bool, Set set, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, str, attributedText3, booleanParameter, flat, attributedText4, bool, (i12 & 256) != 0 ? null : set);
    }
}
