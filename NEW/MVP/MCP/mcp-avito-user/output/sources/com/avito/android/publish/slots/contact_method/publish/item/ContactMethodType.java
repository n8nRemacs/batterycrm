package com.avito.android.publish.slots.contact_method.publish.item;

import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishContactMethodItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/ContactMethodType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ContactMethodType {

    /* renamed from: c, reason: collision with root package name */
    public static final ContactMethodType f243323c;

    /* renamed from: d, reason: collision with root package name */
    public static final ContactMethodType f243324d;

    /* renamed from: e, reason: collision with root package name */
    public static final ContactMethodType f243325e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ContactMethodType[] f243326f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f243327g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243328b;

    static {
        ContactMethodType contactMethodType = new ContactMethodType("All", 0, "any");
        f243323c = contactMethodType;
        ContactMethodType contactMethodType2 = new ContactMethodType("Messenger", 1, NotificationsSettings.Section.SECTION_MESSENGER);
        f243324d = contactMethodType2;
        ContactMethodType contactMethodType3 = new ContactMethodType("Phone", 2, "phone");
        f243325e = contactMethodType3;
        ContactMethodType[] contactMethodTypeArr = {contactMethodType, contactMethodType2, contactMethodType3};
        f243326f = contactMethodTypeArr;
        f243327g = kotlin.enums.c.a(contactMethodTypeArr);
    }

    public ContactMethodType(String str, int i12, String str2) {
        this.f243328b = str2;
    }

    public static ContactMethodType valueOf(String str) {
        return (ContactMethodType) Enum.valueOf(ContactMethodType.class, str);
    }

    public static ContactMethodType[] values() {
        return (ContactMethodType[]) f243326f.clone();
    }
}
