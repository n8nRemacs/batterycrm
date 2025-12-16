package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoHistoryTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoHistoryTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoHistoryTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoHistoryTestGroup f67853c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoHistoryTestGroup f67854d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoHistoryTestGroup f67855e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoHistoryTestGroup[] f67856f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67857g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67858b;

    static {
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup = new MessengerApicoHistoryTestGroup("NONE", 0, "");
        f67853c = messengerApicoHistoryTestGroup;
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup2 = new MessengerApicoHistoryTestGroup("CONTROL", 1, "control");
        f67854d = messengerApicoHistoryTestGroup2;
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup3 = new MessengerApicoHistoryTestGroup("TEST", 2, "test");
        f67855e = messengerApicoHistoryTestGroup3;
        MessengerApicoHistoryTestGroup[] messengerApicoHistoryTestGroupArr = {messengerApicoHistoryTestGroup, messengerApicoHistoryTestGroup2, messengerApicoHistoryTestGroup3};
        f67856f = messengerApicoHistoryTestGroupArr;
        f67857g = c.a(messengerApicoHistoryTestGroupArr);
    }

    public MessengerApicoHistoryTestGroup(String str, int i12, String str2) {
        this.f67858b = str2;
    }

    public static MessengerApicoHistoryTestGroup valueOf(String str) {
        return (MessengerApicoHistoryTestGroup) Enum.valueOf(MessengerApicoHistoryTestGroup.class, str);
    }

    public static MessengerApicoHistoryTestGroup[] values() {
        return (MessengerApicoHistoryTestGroup[]) f67856f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67864b() {
        return this.f67858b;
    }
}
