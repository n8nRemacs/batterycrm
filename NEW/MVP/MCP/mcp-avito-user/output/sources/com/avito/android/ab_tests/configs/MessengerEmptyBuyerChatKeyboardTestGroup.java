package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerEmptyBuyerChatKeyboardTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerEmptyBuyerChatKeyboardTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerEmptyBuyerChatKeyboardTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerEmptyBuyerChatKeyboardTestGroup f67871c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerEmptyBuyerChatKeyboardTestGroup f67872d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MessengerEmptyBuyerChatKeyboardTestGroup[] f67873e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67874f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67875b;

    static {
        MessengerEmptyBuyerChatKeyboardTestGroup messengerEmptyBuyerChatKeyboardTestGroup = new MessengerEmptyBuyerChatKeyboardTestGroup("NONE", 0, "");
        f67871c = messengerEmptyBuyerChatKeyboardTestGroup;
        MessengerEmptyBuyerChatKeyboardTestGroup messengerEmptyBuyerChatKeyboardTestGroup2 = new MessengerEmptyBuyerChatKeyboardTestGroup("CONTROL", 1, "control");
        MessengerEmptyBuyerChatKeyboardTestGroup messengerEmptyBuyerChatKeyboardTestGroup3 = new MessengerEmptyBuyerChatKeyboardTestGroup("TEST", 2, "test");
        f67872d = messengerEmptyBuyerChatKeyboardTestGroup3;
        MessengerEmptyBuyerChatKeyboardTestGroup[] messengerEmptyBuyerChatKeyboardTestGroupArr = {messengerEmptyBuyerChatKeyboardTestGroup, messengerEmptyBuyerChatKeyboardTestGroup2, messengerEmptyBuyerChatKeyboardTestGroup3};
        f67873e = messengerEmptyBuyerChatKeyboardTestGroupArr;
        f67874f = c.a(messengerEmptyBuyerChatKeyboardTestGroupArr);
    }

    public MessengerEmptyBuyerChatKeyboardTestGroup(String str, int i12, String str2) {
        this.f67875b = str2;
    }

    public static MessengerEmptyBuyerChatKeyboardTestGroup valueOf(String str) {
        return (MessengerEmptyBuyerChatKeyboardTestGroup) Enum.valueOf(MessengerEmptyBuyerChatKeyboardTestGroup.class, str);
    }

    public static MessengerEmptyBuyerChatKeyboardTestGroup[] values() {
        return (MessengerEmptyBuyerChatKeyboardTestGroup[]) f67873e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67881b() {
        return this.f67875b;
    }
}
