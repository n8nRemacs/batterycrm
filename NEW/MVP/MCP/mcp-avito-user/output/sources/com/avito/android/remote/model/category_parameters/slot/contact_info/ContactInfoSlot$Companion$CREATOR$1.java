package com.avito.android.remote.model.category_parameters.slot.contact_info;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactInfoSlot.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlot;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContactInfoSlot$Companion$CREATOR$1 extends N implements l<Parcel, ContactInfoSlot> {
    public static final ContactInfoSlot$Companion$CREATOR$1 INSTANCE = new ContactInfoSlot$Companion$CREATOR$1();

    public ContactInfoSlot$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final ContactInfoSlot invoke(@k Parcel parcel) {
        return new ContactInfoSlot(parcel.readString(), parcel.readString(), (SlotWidget) parcel.readParcelable(SlotWidget.class.getClassLoader()), (ContactInfoSlotValue) parcel.readParcelable(ContactInfoSlotValue.class.getClassLoader()), (AttributedText) parcel.readParcelable(AttributedText.class.getClassLoader()));
    }
}
