package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoReadChatsTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoReadChatsTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoReadChatsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoReadChatsTestGroup f67859c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoReadChatsTestGroup f67860d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoReadChatsTestGroup f67861e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoReadChatsTestGroup[] f67862f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67863g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67864b;

    static {
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup = new MessengerApicoReadChatsTestGroup("NONE", 0, "");
        f67859c = messengerApicoReadChatsTestGroup;
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup2 = new MessengerApicoReadChatsTestGroup("CONTROL", 1, "control");
        f67860d = messengerApicoReadChatsTestGroup2;
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup3 = new MessengerApicoReadChatsTestGroup("TEST", 2, "test");
        f67861e = messengerApicoReadChatsTestGroup3;
        MessengerApicoReadChatsTestGroup[] messengerApicoReadChatsTestGroupArr = {messengerApicoReadChatsTestGroup, messengerApicoReadChatsTestGroup2, messengerApicoReadChatsTestGroup3};
        f67862f = messengerApicoReadChatsTestGroupArr;
        f67863g = c.a(messengerApicoReadChatsTestGroupArr);
    }

    public MessengerApicoReadChatsTestGroup(String str, int i12, String str2) {
        this.f67864b = str2;
    }

    public static MessengerApicoReadChatsTestGroup valueOf(String str) {
        return (MessengerApicoReadChatsTestGroup) Enum.valueOf(MessengerApicoReadChatsTestGroup.class, str);
    }

    public static MessengerApicoReadChatsTestGroup[] values() {
        return (MessengerApicoReadChatsTestGroup[]) f67862f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67875b() {
        return this.f67864b;
    }
}
