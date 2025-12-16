package com.avito.android.analytics.event;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/ContactSource;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactSource {

    /* renamed from: d, reason: collision with root package name */
    public static final ContactSource f89919d;

    /* renamed from: e, reason: collision with root package name */
    public static final ContactSource f89920e;

    /* renamed from: f, reason: collision with root package name */
    public static final ContactSource f89921f;

    /* renamed from: g, reason: collision with root package name */
    public static final ContactSource f89922g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ContactSource[] f89923h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89924i;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f89925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89926c;

    static {
        ContactSource contactSource = new ContactSource(0, 0, "CONTACT_REGULAR", false);
        f89919d = contactSource;
        ContactSource contactSource2 = new ContactSource(1, 3, "CONTACT_REGULAR_GALLERY", false);
        f89920e = contactSource2;
        ContactSource contactSource3 = new ContactSource(2, 0, "CONTACT_XL", true);
        f89921f = contactSource3;
        ContactSource contactSource4 = new ContactSource(3, 3, "CONTACT_XL_GALLERY", true);
        f89922g = contactSource4;
        ContactSource[] contactSourceArr = {contactSource, contactSource2, contactSource3, contactSource4};
        f89923h = contactSourceArr;
        f89924i = kotlin.enums.c.a(contactSourceArr);
    }

    public ContactSource(int i12, int i13, String str, boolean z12) {
        this.f89925b = z12;
        this.f89926c = i13;
    }

    public static ContactSource valueOf(String str) {
        return (ContactSource) Enum.valueOf(ContactSource.class, str);
    }

    public static ContactSource[] values() {
        return (ContactSource[]) f89923h.clone();
    }
}
