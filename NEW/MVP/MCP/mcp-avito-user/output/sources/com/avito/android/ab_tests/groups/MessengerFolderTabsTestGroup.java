package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerFolderTabsTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/MessengerFolderTabsTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerFolderTabsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerFolderTabsTestGroup f67951c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerFolderTabsTestGroup f67952d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MessengerFolderTabsTestGroup[] f67953e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67954f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67955b;

    static {
        MessengerFolderTabsTestGroup messengerFolderTabsTestGroup = new MessengerFolderTabsTestGroup("NONE", 0, "");
        f67951c = messengerFolderTabsTestGroup;
        MessengerFolderTabsTestGroup messengerFolderTabsTestGroup2 = new MessengerFolderTabsTestGroup("CONTROL", 1, "control");
        MessengerFolderTabsTestGroup messengerFolderTabsTestGroup3 = new MessengerFolderTabsTestGroup("TEST", 2, "messenger_folders");
        f67952d = messengerFolderTabsTestGroup3;
        MessengerFolderTabsTestGroup[] messengerFolderTabsTestGroupArr = {messengerFolderTabsTestGroup, messengerFolderTabsTestGroup2, messengerFolderTabsTestGroup3};
        f67953e = messengerFolderTabsTestGroupArr;
        f67954f = c.a(messengerFolderTabsTestGroupArr);
    }

    public MessengerFolderTabsTestGroup(String str, int i12, String str2) {
        this.f67955b = str2;
    }

    public static MessengerFolderTabsTestGroup valueOf(String str) {
        return (MessengerFolderTabsTestGroup) Enum.valueOf(MessengerFolderTabsTestGroup.class, str);
    }

    public static MessengerFolderTabsTestGroup[] values() {
        return (MessengerFolderTabsTestGroup[]) f67953e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67977b() {
        return this.f67955b;
    }
}
