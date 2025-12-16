package com.avito.android.mortgage_invite.common.domain.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactInfoFieldId.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId;", "", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactInfoFieldId {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f205524b;

    /* renamed from: c, reason: collision with root package name */
    public static final ContactInfoFieldId f205525c;

    /* renamed from: d, reason: collision with root package name */
    public static final ContactInfoFieldId f205526d;

    /* renamed from: e, reason: collision with root package name */
    public static final ContactInfoFieldId f205527e;

    /* renamed from: f, reason: collision with root package name */
    public static final ContactInfoFieldId f205528f;

    /* renamed from: g, reason: collision with root package name */
    public static final ContactInfoFieldId f205529g;

    /* renamed from: h, reason: collision with root package name */
    public static final ContactInfoFieldId f205530h;

    /* renamed from: i, reason: collision with root package name */
    public static final ContactInfoFieldId f205531i;

    /* renamed from: j, reason: collision with root package name */
    public static final ContactInfoFieldId f205532j;

    /* renamed from: k, reason: collision with root package name */
    public static final ContactInfoFieldId f205533k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ContactInfoFieldId[] f205534l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f205535m;

    /* compiled from: ContactInfoFieldId.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ContactInfoFieldId contactInfoFieldId = new ContactInfoFieldId("CLIENT_SEARCH", 0);
        f205525c = contactInfoFieldId;
        ContactInfoFieldId contactInfoFieldId2 = new ContactInfoFieldId("CLIENT_IMMUTABLE_PHONE", 1);
        f205526d = contactInfoFieldId2;
        ContactInfoFieldId contactInfoFieldId3 = new ContactInfoFieldId("CLIENT_FIRST_NAME", 2);
        f205527e = contactInfoFieldId3;
        ContactInfoFieldId contactInfoFieldId4 = new ContactInfoFieldId("CLIENT_MIDDLE_NAME", 3);
        f205528f = contactInfoFieldId4;
        ContactInfoFieldId contactInfoFieldId5 = new ContactInfoFieldId("CLIENT_LAST_NAME", 4);
        f205529g = contactInfoFieldId5;
        ContactInfoFieldId contactInfoFieldId6 = new ContactInfoFieldId("CLIENT_PHONE", 5);
        f205530h = contactInfoFieldId6;
        ContactInfoFieldId contactInfoFieldId7 = new ContactInfoFieldId("CLIENT_EMAIL", 6);
        f205531i = contactInfoFieldId7;
        ContactInfoFieldId contactInfoFieldId8 = new ContactInfoFieldId("AGENT_FULL_NAME", 7);
        f205532j = contactInfoFieldId8;
        ContactInfoFieldId contactInfoFieldId9 = new ContactInfoFieldId("AGENT_PHONE", 8);
        f205533k = contactInfoFieldId9;
        ContactInfoFieldId[] contactInfoFieldIdArr = {contactInfoFieldId, contactInfoFieldId2, contactInfoFieldId3, contactInfoFieldId4, contactInfoFieldId5, contactInfoFieldId6, contactInfoFieldId7, contactInfoFieldId8, contactInfoFieldId9};
        f205534l = contactInfoFieldIdArr;
        f205535m = c.a(contactInfoFieldIdArr);
        f205524b = new a(null);
    }

    public ContactInfoFieldId() {
        throw null;
    }

    public static ContactInfoFieldId valueOf(String str) {
        return (ContactInfoFieldId) Enum.valueOf(ContactInfoFieldId.class, str);
    }

    public static ContactInfoFieldId[] values() {
        return (ContactInfoFieldId[]) f205534l.clone();
    }
}
