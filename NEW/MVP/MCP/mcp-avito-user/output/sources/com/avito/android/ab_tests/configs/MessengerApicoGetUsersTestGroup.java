package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoGetUsersTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoGetUsersTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoGetUsersTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoGetUsersTestGroup f67847c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoGetUsersTestGroup f67848d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoGetUsersTestGroup f67849e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoGetUsersTestGroup[] f67850f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67851g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67852b;

    static {
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup = new MessengerApicoGetUsersTestGroup("NONE", 0, "");
        f67847c = messengerApicoGetUsersTestGroup;
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup2 = new MessengerApicoGetUsersTestGroup("CONTROL", 1, "control");
        f67848d = messengerApicoGetUsersTestGroup2;
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup3 = new MessengerApicoGetUsersTestGroup("TEST", 2, "test");
        f67849e = messengerApicoGetUsersTestGroup3;
        MessengerApicoGetUsersTestGroup[] messengerApicoGetUsersTestGroupArr = {messengerApicoGetUsersTestGroup, messengerApicoGetUsersTestGroup2, messengerApicoGetUsersTestGroup3};
        f67850f = messengerApicoGetUsersTestGroupArr;
        f67851g = c.a(messengerApicoGetUsersTestGroupArr);
    }

    public MessengerApicoGetUsersTestGroup(String str, int i12, String str2) {
        this.f67852b = str2;
    }

    public static MessengerApicoGetUsersTestGroup valueOf(String str) {
        return (MessengerApicoGetUsersTestGroup) Enum.valueOf(MessengerApicoGetUsersTestGroup.class, str);
    }

    public static MessengerApicoGetUsersTestGroup[] values() {
        return (MessengerApicoGetUsersTestGroup[]) f67850f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67864b() {
        return this.f67852b;
    }
}
