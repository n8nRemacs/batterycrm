package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerQuickRepliesWithTitleTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MessengerQuickRepliesWithTitleTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerQuickRepliesWithTitleTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerQuickRepliesWithTitleTestGroup f67876c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerQuickRepliesWithTitleTestGroup f67877d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerQuickRepliesWithTitleTestGroup f67878e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MessengerQuickRepliesWithTitleTestGroup[] f67879f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f67880g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67881b;

    static {
        MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup = new MessengerQuickRepliesWithTitleTestGroup("NONE", 0, "");
        f67876c = messengerQuickRepliesWithTitleTestGroup;
        MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup2 = new MessengerQuickRepliesWithTitleTestGroup("CONTROL", 1, "control");
        f67877d = messengerQuickRepliesWithTitleTestGroup2;
        MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup3 = new MessengerQuickRepliesWithTitleTestGroup("TEST", 2, "quick_replies_with_title");
        f67878e = messengerQuickRepliesWithTitleTestGroup3;
        MessengerQuickRepliesWithTitleTestGroup[] messengerQuickRepliesWithTitleTestGroupArr = {messengerQuickRepliesWithTitleTestGroup, messengerQuickRepliesWithTitleTestGroup2, messengerQuickRepliesWithTitleTestGroup3};
        f67879f = messengerQuickRepliesWithTitleTestGroupArr;
        f67880g = c.a(messengerQuickRepliesWithTitleTestGroupArr);
    }

    public MessengerQuickRepliesWithTitleTestGroup(String str, int i12, String str2) {
        this.f67881b = str2;
    }

    public static MessengerQuickRepliesWithTitleTestGroup valueOf(String str) {
        return (MessengerQuickRepliesWithTitleTestGroup) Enum.valueOf(MessengerQuickRepliesWithTitleTestGroup.class, str);
    }

    public static MessengerQuickRepliesWithTitleTestGroup[] values() {
        return (MessengerQuickRepliesWithTitleTestGroup[]) f67879f.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67892b() {
        return this.f67881b;
    }
}
