package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoSendTextMessageTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoSendTextMessageTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoSendTextMessageTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoSendTextMessageTestGroup f67865c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoSendTextMessageTestGroup f67866d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoSendTextMessageTestGroup f67867e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoSendTextMessageTestGroup[] f67868f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67869g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67870b;

    static {
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup = new MessengerApicoSendTextMessageTestGroup("NONE", 0, "");
        f67865c = messengerApicoSendTextMessageTestGroup;
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup2 = new MessengerApicoSendTextMessageTestGroup("CONTROL", 1, "control");
        f67866d = messengerApicoSendTextMessageTestGroup2;
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup3 = new MessengerApicoSendTextMessageTestGroup("TEST", 2, "test");
        f67867e = messengerApicoSendTextMessageTestGroup3;
        MessengerApicoSendTextMessageTestGroup[] messengerApicoSendTextMessageTestGroupArr = {messengerApicoSendTextMessageTestGroup, messengerApicoSendTextMessageTestGroup2, messengerApicoSendTextMessageTestGroup3};
        f67868f = messengerApicoSendTextMessageTestGroupArr;
        f67869g = c.a(messengerApicoSendTextMessageTestGroupArr);
    }

    public MessengerApicoSendTextMessageTestGroup(String str, int i12, String str2) {
        this.f67870b = str2;
    }

    public static MessengerApicoSendTextMessageTestGroup valueOf(String str) {
        return (MessengerApicoSendTextMessageTestGroup) Enum.valueOf(MessengerApicoSendTextMessageTestGroup.class, str);
    }

    public static MessengerApicoSendTextMessageTestGroup[] values() {
        return (MessengerApicoSendTextMessageTestGroup[]) f67868f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67881b() {
        return this.f67870b;
    }
}
