package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoGetChannelsTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoGetChannelsTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoGetChannelsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoGetChannelsTestGroup f67841c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoGetChannelsTestGroup f67842d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoGetChannelsTestGroup f67843e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoGetChannelsTestGroup[] f67844f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67845g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67846b;

    static {
        MessengerApicoGetChannelsTestGroup messengerApicoGetChannelsTestGroup = new MessengerApicoGetChannelsTestGroup("NONE", 0, "");
        f67841c = messengerApicoGetChannelsTestGroup;
        MessengerApicoGetChannelsTestGroup messengerApicoGetChannelsTestGroup2 = new MessengerApicoGetChannelsTestGroup("CONTROL", 1, "control");
        f67842d = messengerApicoGetChannelsTestGroup2;
        MessengerApicoGetChannelsTestGroup messengerApicoGetChannelsTestGroup3 = new MessengerApicoGetChannelsTestGroup("TEST", 2, "test");
        f67843e = messengerApicoGetChannelsTestGroup3;
        MessengerApicoGetChannelsTestGroup[] messengerApicoGetChannelsTestGroupArr = {messengerApicoGetChannelsTestGroup, messengerApicoGetChannelsTestGroup2, messengerApicoGetChannelsTestGroup3};
        f67844f = messengerApicoGetChannelsTestGroupArr;
        f67845g = c.a(messengerApicoGetChannelsTestGroupArr);
    }

    public MessengerApicoGetChannelsTestGroup(String str, int i12, String str2) {
        this.f67846b = str2;
    }

    public static MessengerApicoGetChannelsTestGroup valueOf(String str) {
        return (MessengerApicoGetChannelsTestGroup) Enum.valueOf(MessengerApicoGetChannelsTestGroup.class, str);
    }

    public static MessengerApicoGetChannelsTestGroup[] values() {
        return (MessengerApicoGetChannelsTestGroup[]) f67844f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67858b() {
        return this.f67846b;
    }
}
