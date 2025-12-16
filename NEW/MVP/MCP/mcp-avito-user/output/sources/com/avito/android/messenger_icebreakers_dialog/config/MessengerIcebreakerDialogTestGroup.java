package com.avito.android.messenger_icebreakers_dialog.config;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerIcebreakerDialogTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/config/MessengerIcebreakerDialogTestGroup;", "", "Lu3/j;", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerIcebreakerDialogTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerIcebreakerDialogTestGroup f197542c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerIcebreakerDialogTestGroup f197543d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MessengerIcebreakerDialogTestGroup[] f197544e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f197545f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f197546b;

    static {
        MessengerIcebreakerDialogTestGroup messengerIcebreakerDialogTestGroup = new MessengerIcebreakerDialogTestGroup("CONTROL", 0, "control");
        MessengerIcebreakerDialogTestGroup messengerIcebreakerDialogTestGroup2 = new MessengerIcebreakerDialogTestGroup("TEST", 1, "test");
        f197542c = messengerIcebreakerDialogTestGroup2;
        MessengerIcebreakerDialogTestGroup messengerIcebreakerDialogTestGroup3 = new MessengerIcebreakerDialogTestGroup("NONE", 2, "");
        f197543d = messengerIcebreakerDialogTestGroup3;
        MessengerIcebreakerDialogTestGroup[] messengerIcebreakerDialogTestGroupArr = {messengerIcebreakerDialogTestGroup, messengerIcebreakerDialogTestGroup2, messengerIcebreakerDialogTestGroup3};
        f197544e = messengerIcebreakerDialogTestGroupArr;
        f197545f = c.a(messengerIcebreakerDialogTestGroupArr);
    }

    public MessengerIcebreakerDialogTestGroup(String str, int i12, String str2) {
        this.f197546b = str2;
    }

    public static MessengerIcebreakerDialogTestGroup valueOf(String str) {
        return (MessengerIcebreakerDialogTestGroup) Enum.valueOf(MessengerIcebreakerDialogTestGroup.class, str);
    }

    public static MessengerIcebreakerDialogTestGroup[] values() {
        return (MessengerIcebreakerDialogTestGroup[]) f197544e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF197546b() {
        return this.f197546b;
    }
}
