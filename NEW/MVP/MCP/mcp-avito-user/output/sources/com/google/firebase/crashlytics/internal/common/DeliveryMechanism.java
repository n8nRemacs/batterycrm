package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: b, reason: collision with root package name */
    public final int f360887b;

    DeliveryMechanism(int i12) {
        this.f360887b = i12;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f360887b);
    }
}
