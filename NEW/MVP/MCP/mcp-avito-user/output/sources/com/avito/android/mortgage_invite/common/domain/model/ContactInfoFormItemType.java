package com.avito.android.mortgage_invite.common.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationContactInfoFormItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFormItemType;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactInfoFormItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final ContactInfoFormItemType f205536b;

    /* renamed from: c, reason: collision with root package name */
    public static final ContactInfoFormItemType f205537c;

    /* renamed from: d, reason: collision with root package name */
    public static final ContactInfoFormItemType f205538d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ContactInfoFormItemType[] f205539e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f205540f;

    static {
        ContactInfoFormItemType contactInfoFormItemType = new ContactInfoFormItemType("CLIENT_SEARCH", 0);
        f205536b = contactInfoFormItemType;
        ContactInfoFormItemType contactInfoFormItemType2 = new ContactInfoFormItemType("PLAIN_TEXT", 1);
        f205537c = contactInfoFormItemType2;
        ContactInfoFormItemType contactInfoFormItemType3 = new ContactInfoFormItemType("PHONE", 2);
        f205538d = contactInfoFormItemType3;
        ContactInfoFormItemType[] contactInfoFormItemTypeArr = {contactInfoFormItemType, contactInfoFormItemType2, contactInfoFormItemType3, new ContactInfoFormItemType("EMAIL", 3)};
        f205539e = contactInfoFormItemTypeArr;
        f205540f = c.a(contactInfoFormItemTypeArr);
    }

    public ContactInfoFormItemType() {
        throw null;
    }

    public static ContactInfoFormItemType valueOf(String str) {
        return (ContactInfoFormItemType) Enum.valueOf(ContactInfoFormItemType.class, str);
    }

    public static ContactInfoFormItemType[] values() {
        return (ContactInfoFormItemType[]) f205539e.clone();
    }
}
