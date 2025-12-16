package com.avito.android.publish.slots.contact_info;

import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlotConfig;
import kotlin.G0;
import kotlin.Metadata;
import l41.o;

/* compiled from: ContactInfoSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "profile", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/Profile;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f243255b;

    public f(d dVar) {
        this.f243255b = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String name;
        Profile profile = (Profile) obj;
        d dVar = this.f243255b;
        dVar.f243225c.b(profile);
        ContactInfoSlotConfig contactInfoSlotConfig = (ContactInfoSlotConfig) dVar.f243224b.getWidget().getConfig();
        String value = contactInfoSlotConfig.getPhoneField().getValue();
        if (value == null && (value = profile.getPhone()) == null) {
            value = "";
        }
        String str = value;
        CharParameter nameField = contactInfoSlotConfig.getNameField();
        if (nameField == null || (name = nameField.getValue()) == null) {
            name = profile.getName();
        }
        String str2 = name;
        String value2 = contactInfoSlotConfig.getManagerField().getValue();
        if (value2 == null) {
            value2 = profile.getManager();
        }
        dVar.f243226d.c(new ContactsData(str, str2, profile.getEmail(), value2, profile.getAvatar(), profile.isShop(), profile.getType().isCompany(), profile.isIncomplete(), profile.getIsPro(), null, false, null, null, 5120, null));
        return G0.f406611a;
    }
}
