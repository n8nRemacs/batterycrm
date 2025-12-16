package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerApicoGetChannelByIdTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerApicoGetChannelByIdTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerApicoGetChannelByIdTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerApicoGetChannelByIdTestGroup f67835c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerApicoGetChannelByIdTestGroup f67836d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerApicoGetChannelByIdTestGroup f67837e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerApicoGetChannelByIdTestGroup[] f67838f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67839g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67840b;

    static {
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup = new MessengerApicoGetChannelByIdTestGroup("NONE", 0, "");
        f67835c = messengerApicoGetChannelByIdTestGroup;
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup2 = new MessengerApicoGetChannelByIdTestGroup("CONTROL", 1, "control");
        f67836d = messengerApicoGetChannelByIdTestGroup2;
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup3 = new MessengerApicoGetChannelByIdTestGroup("TEST", 2, "test");
        f67837e = messengerApicoGetChannelByIdTestGroup3;
        MessengerApicoGetChannelByIdTestGroup[] messengerApicoGetChannelByIdTestGroupArr = {messengerApicoGetChannelByIdTestGroup, messengerApicoGetChannelByIdTestGroup2, messengerApicoGetChannelByIdTestGroup3};
        f67838f = messengerApicoGetChannelByIdTestGroupArr;
        f67839g = c.a(messengerApicoGetChannelByIdTestGroupArr);
    }

    public MessengerApicoGetChannelByIdTestGroup(String str, int i12, String str2) {
        this.f67840b = str2;
    }

    public static MessengerApicoGetChannelByIdTestGroup valueOf(String str) {
        return (MessengerApicoGetChannelByIdTestGroup) Enum.valueOf(MessengerApicoGetChannelByIdTestGroup.class, str);
    }

    public static MessengerApicoGetChannelByIdTestGroup[] values() {
        return (MessengerApicoGetChannelByIdTestGroup[]) f67838f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67840b() {
        return this.f67840b;
    }
}
