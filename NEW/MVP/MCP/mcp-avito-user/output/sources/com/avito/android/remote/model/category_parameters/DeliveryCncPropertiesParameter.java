package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nj0.InterfaceC44435b;

/* compiled from: DeliveryCncPropertiesParameter.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EBg\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0015J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020&HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b6\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010<R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b=\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\bD\u0010\u0015¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "required", "_value", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "visible", "phantom", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;)V", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getVisible", "getPhantom", "getType", "CncProperties", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryCncPropertiesParameter extends EditableParameter<CncProperties> implements Visibility, Phantom {

    @k
    public static final Parcelable.Creator<DeliveryCncPropertiesParameter> CREATOR = new Creator();

    @c("value")
    @l
    private CncProperties _value;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    /* compiled from: DeliveryCncPropertiesParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "Landroid/os/Parcelable;", "", "minDays", "maxDays", "", AddressParameter.TYPE, "", "enableForAllItems", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getMinDays", "getMaxDays", "Ljava/lang/String;", "getAddress", "Ljava/lang/Boolean;", "getEnableForAllItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CncProperties implements Parcelable {

        @k
        public static final Parcelable.Creator<CncProperties> CREATOR = new Creator();

        @c(AddressParameter.TYPE)
        @l
        private final String address;

        @c("enableForAllItems")
        @l
        private final Boolean enableForAllItems;

        @c("maxPreparationDays")
        @l
        private final Long maxDays;

        @c("minPreparationDays")
        @l
        private final Long minDays;

        /* compiled from: DeliveryCncPropertiesParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CncProperties> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CncProperties createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CncProperties(lValueOf, lValueOf2, string, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CncProperties[] newArray(int i12) {
                return new CncProperties[i12];
            }
        }

        public CncProperties(@l Long l12, @l Long l13, @l String str, @l Boolean bool) {
            this.minDays = l12;
            this.maxDays = l13;
            this.address = str;
            this.enableForAllItems = bool;
        }

        public static /* synthetic */ CncProperties copy$default(CncProperties cncProperties, Long l12, Long l13, String str, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = cncProperties.minDays;
            }
            if ((i12 & 2) != 0) {
                l13 = cncProperties.maxDays;
            }
            if ((i12 & 4) != 0) {
                str = cncProperties.address;
            }
            if ((i12 & 8) != 0) {
                bool = cncProperties.enableForAllItems;
            }
            return cncProperties.copy(l12, l13, str, bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getMinDays() {
            return this.minDays;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getMaxDays() {
            return this.maxDays;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getEnableForAllItems() {
            return this.enableForAllItems;
        }

        @k
        public final CncProperties copy(@l Long minDays, @l Long maxDays, @l String address, @l Boolean enableForAllItems) {
            return new CncProperties(minDays, maxDays, address, enableForAllItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CncProperties)) {
                return false;
            }
            CncProperties cncProperties = (CncProperties) other;
            return L.f(this.minDays, cncProperties.minDays) && L.f(this.maxDays, cncProperties.maxDays) && L.f(this.address, cncProperties.address) && L.f(this.enableForAllItems, cncProperties.enableForAllItems);
        }

        @l
        @InterfaceC44435b(name = AddressParameter.TYPE)
        public final String getAddress() {
            return this.address;
        }

        @l
        @InterfaceC44435b(name = "enableForAllItems")
        public final Boolean getEnableForAllItems() {
            return this.enableForAllItems;
        }

        @l
        @InterfaceC44435b(name = "maxPreparationDays")
        public final Long getMaxDays() {
            return this.maxDays;
        }

        @l
        @InterfaceC44435b(name = "minPreparationDays")
        public final Long getMinDays() {
            return this.minDays;
        }

        public int hashCode() {
            Long l12 = this.minDays;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Long l13 = this.maxDays;
            int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str = this.address;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.enableForAllItems;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CncProperties(minDays=");
            sb2.append(this.minDays);
            sb2.append(", maxDays=");
            sb2.append(this.maxDays);
            sb2.append(", address=");
            sb2.append(this.address);
            sb2.append(", enableForAllItems=");
            return C0.g(sb2, this.enableForAllItems, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.minDays;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.maxDays;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.address);
            Boolean bool = this.enableForAllItems;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: DeliveryCncPropertiesParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryCncPropertiesParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCncPropertiesParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            CncProperties cncPropertiesCreateFromParcel = parcel.readInt() == 0 ? null : CncProperties.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DeliveryCncPropertiesParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryCncPropertiesParameter(string, string2, z12, cncPropertiesCreateFromParcel, z13, attributedText, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCncPropertiesParameter[] newArray(int i12) {
            return new DeliveryCncPropertiesParameter[i12];
        }
    }

    public /* synthetic */ DeliveryCncPropertiesParameter(String str, String str2, boolean z12, CncProperties cncProperties, boolean z13, AttributedText attributedText, Boolean bool, Boolean bool2, Boolean bool3, String str3, int i12, C42822w c42822w) {
        this(str, str2, z12, cncProperties, z13, attributedText, bool, (i12 & 128) != 0 ? Boolean.FALSE : bool2, (i12 & 256) != 0 ? Boolean.FALSE : bool3, (i12 & 512) != 0 ? "" : str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final CncProperties get_value() {
        return this._value;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final DeliveryCncPropertiesParameter copy(@k String id2, @k String title, boolean required, @l CncProperties _value, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Boolean visible, @l Boolean phantom, @k String type) {
        return new DeliveryCncPropertiesParameter(id2, title, required, _value, immutable, motivation, updatesForm, visible, phantom, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryCncPropertiesParameter)) {
            return false;
        }
        DeliveryCncPropertiesParameter deliveryCncPropertiesParameter = (DeliveryCncPropertiesParameter) other;
        return L.f(this.id, deliveryCncPropertiesParameter.id) && L.f(this.title, deliveryCncPropertiesParameter.title) && this.required == deliveryCncPropertiesParameter.required && L.f(this._value, deliveryCncPropertiesParameter._value) && this.immutable == deliveryCncPropertiesParameter.immutable && L.f(this.motivation, deliveryCncPropertiesParameter.motivation) && L.f(this.updatesForm, deliveryCncPropertiesParameter.updatesForm) && L.f(this.visible, deliveryCncPropertiesParameter.visible) && L.f(this.phantom, deliveryCncPropertiesParameter.phantom) && L.f(this.type, deliveryCncPropertiesParameter.type);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return this.type;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required);
        CncProperties cncProperties = this._value;
        int i13 = r.i((i12 + (cncProperties == null ? 0 : cncProperties.hashCode())) * 31, 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i13 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return this.type.hashCode() + ((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryCncPropertiesParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        CncProperties cncProperties = this._value;
        if (cncProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncProperties.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.phantom;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.type);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public CncProperties get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l CncProperties cncProperties) {
        this._value = cncProperties;
    }

    public DeliveryCncPropertiesParameter(@k String str, @k String str2, boolean z12, @l CncProperties cncProperties, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @k String str3) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this._value = cncProperties;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.visible = bool2;
        this.phantom = bool3;
        this.type = str3;
    }
}
