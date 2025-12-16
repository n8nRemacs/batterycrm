package com.avito.android.remote.model.category_parameters.slot.delivery_cnc;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryCncTogglesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "cncToggle", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncDaysRange;", "daysRange", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncAddress;", AddressParameter.TYPE, "Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;", "cncParameter", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncCheckbox;", "checkbox", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncDaysRange;Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncAddress;Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncCheckbox;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getCncToggle", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncDaysRange;", "getDaysRange", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncDaysRange;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncAddress;", "getAddress", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncAddress;", "Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;", "getCncParameter", "()Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncCheckbox;", "getCheckbox", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/CncCheckbox;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryCncTogglesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryCncTogglesSlotConfig> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final CncAddress address;

    @c("checkbox")
    @l
    private final CncCheckbox checkbox;

    @c("cncParameterField")
    @l
    private final DeliveryCncPropertiesParameter cncParameter;

    @c("cncToggle")
    @k
    private final BooleanParameter cncToggle;

    @c("daysRange")
    @l
    private final CncDaysRange daysRange;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DeliveryCncTogglesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryCncTogglesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCncTogglesSlotConfig createFromParcel(@k Parcel parcel) {
            return new DeliveryCncTogglesSlotConfig((AttributedText) parcel.readParcelable(DeliveryCncTogglesSlotConfig.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeliveryCncTogglesSlotConfig.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(DeliveryCncTogglesSlotConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : CncDaysRange.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CncAddress.CREATOR.createFromParcel(parcel), (DeliveryCncPropertiesParameter) parcel.readParcelable(DeliveryCncTogglesSlotConfig.class.getClassLoader()), parcel.readInt() != 0 ? CncCheckbox.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCncTogglesSlotConfig[] newArray(int i12) {
            return new DeliveryCncTogglesSlotConfig[i12];
        }
    }

    public DeliveryCncTogglesSlotConfig(@l AttributedText attributedText, @l AttributedText attributedText2, @k BooleanParameter booleanParameter, @l CncDaysRange cncDaysRange, @l CncAddress cncAddress, @l DeliveryCncPropertiesParameter deliveryCncPropertiesParameter, @l CncCheckbox cncCheckbox) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.cncToggle = booleanParameter;
        this.daysRange = cncDaysRange;
        this.address = cncAddress;
        this.cncParameter = deliveryCncPropertiesParameter;
        this.checkbox = cncCheckbox;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final CncAddress getAddress() {
        return this.address;
    }

    @l
    public final CncCheckbox getCheckbox() {
        return this.checkbox;
    }

    @l
    public final DeliveryCncPropertiesParameter getCncParameter() {
        return this.cncParameter;
    }

    @k
    public final BooleanParameter getCncToggle() {
        return this.cncToggle;
    }

    @l
    public final CncDaysRange getDaysRange() {
        return this.daysRange;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.cncToggle, flags);
        CncDaysRange cncDaysRange = this.daysRange;
        if (cncDaysRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncDaysRange.writeToParcel(parcel, flags);
        }
        CncAddress cncAddress = this.address;
        if (cncAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncAddress.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.cncParameter, flags);
        CncCheckbox cncCheckbox = this.checkbox;
        if (cncCheckbox == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncCheckbox.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ DeliveryCncTogglesSlotConfig(AttributedText attributedText, AttributedText attributedText2, BooleanParameter booleanParameter, CncDaysRange cncDaysRange, CncAddress cncAddress, DeliveryCncPropertiesParameter deliveryCncPropertiesParameter, CncCheckbox cncCheckbox, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, booleanParameter, cncDaysRange, cncAddress, deliveryCncPropertiesParameter, (i12 & 64) != 0 ? null : cncCheckbox);
    }
}
