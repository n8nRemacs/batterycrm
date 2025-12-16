package com.avito.android.phone_confirmation.state;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneConfirmationResolution.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/state/PhoneConfirmationResolution;", "", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneConfirmationResolution {

    /* renamed from: b, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215945b;

    /* renamed from: c, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215946c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215947d;

    /* renamed from: e, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215948e;

    /* renamed from: f, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215949f;

    /* renamed from: g, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215950g;

    /* renamed from: h, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215951h;

    /* renamed from: i, reason: collision with root package name */
    public static final PhoneConfirmationResolution f215952i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ PhoneConfirmationResolution[] f215953j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f215954k;

    static {
        PhoneConfirmationResolution phoneConfirmationResolution = new PhoneConfirmationResolution("EMPTY", 0);
        f215945b = phoneConfirmationResolution;
        PhoneConfirmationResolution phoneConfirmationResolution2 = new PhoneConfirmationResolution("CODE_ENTERED", 1);
        f215946c = phoneConfirmationResolution2;
        PhoneConfirmationResolution phoneConfirmationResolution3 = new PhoneConfirmationResolution("NORMAL", 2);
        f215947d = phoneConfirmationResolution3;
        PhoneConfirmationResolution phoneConfirmationResolution4 = new PhoneConfirmationResolution("DONE", 3);
        f215948e = phoneConfirmationResolution4;
        PhoneConfirmationResolution phoneConfirmationResolution5 = new PhoneConfirmationResolution("TOO_MANY_CODE_REQUESTS", 4);
        f215949f = phoneConfirmationResolution5;
        PhoneConfirmationResolution phoneConfirmationResolution6 = new PhoneConfirmationResolution("VALIDATION_ERROR", 5);
        f215950g = phoneConfirmationResolution6;
        PhoneConfirmationResolution phoneConfirmationResolution7 = new PhoneConfirmationResolution("TOO_MANY_VALIDATION_ERRORS", 6);
        f215951h = phoneConfirmationResolution7;
        PhoneConfirmationResolution phoneConfirmationResolution8 = new PhoneConfirmationResolution("NETWORK_ERROR", 7);
        f215952i = phoneConfirmationResolution8;
        PhoneConfirmationResolution[] phoneConfirmationResolutionArr = {phoneConfirmationResolution, phoneConfirmationResolution2, phoneConfirmationResolution3, phoneConfirmationResolution4, phoneConfirmationResolution5, phoneConfirmationResolution6, phoneConfirmationResolution7, phoneConfirmationResolution8};
        f215953j = phoneConfirmationResolutionArr;
        f215954k = c.a(phoneConfirmationResolutionArr);
    }

    public PhoneConfirmationResolution() {
        throw null;
    }

    public static PhoneConfirmationResolution valueOf(String str) {
        return (PhoneConfirmationResolution) Enum.valueOf(PhoneConfirmationResolution.class, str);
    }

    public static PhoneConfirmationResolution[] values() {
        return (PhoneConfirmationResolution[]) f215953j.clone();
    }
}
