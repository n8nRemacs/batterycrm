package com.avito.android.multi_message_send.ab_test;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultiMessageSendTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multi_message_send/ab_test/MultiMessageSendTestGroup;", "", "Lu3/j;", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MultiMessageSendTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MultiMessageSendTestGroup f206461c;

    /* renamed from: d, reason: collision with root package name */
    public static final MultiMessageSendTestGroup f206462d;

    /* renamed from: e, reason: collision with root package name */
    public static final MultiMessageSendTestGroup f206463e;

    /* renamed from: f, reason: collision with root package name */
    public static final MultiMessageSendTestGroup f206464f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ MultiMessageSendTestGroup[] f206465g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f206466h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206467b;

    static {
        MultiMessageSendTestGroup multiMessageSendTestGroup = new MultiMessageSendTestGroup("NONE", 0, "");
        f206461c = multiMessageSendTestGroup;
        MultiMessageSendTestGroup multiMessageSendTestGroup2 = new MultiMessageSendTestGroup("CONTROL", 1, "control");
        f206462d = multiMessageSendTestGroup2;
        MultiMessageSendTestGroup multiMessageSendTestGroup3 = new MultiMessageSendTestGroup("TEST_1_REC_FAV_IV", 2, "test_1_rec_fav_iv");
        f206463e = multiMessageSendTestGroup3;
        MultiMessageSendTestGroup multiMessageSendTestGroup4 = new MultiMessageSendTestGroup("TEST_2_FAV_REC_IV", 3, "test_2_fav_rec_iv");
        f206464f = multiMessageSendTestGroup4;
        MultiMessageSendTestGroup[] multiMessageSendTestGroupArr = {multiMessageSendTestGroup, multiMessageSendTestGroup2, multiMessageSendTestGroup3, multiMessageSendTestGroup4};
        f206465g = multiMessageSendTestGroupArr;
        f206466h = c.a(multiMessageSendTestGroupArr);
    }

    public MultiMessageSendTestGroup(String str, int i12, String str2) {
        this.f206467b = str2;
    }

    public static MultiMessageSendTestGroup valueOf(String str) {
        return (MultiMessageSendTestGroup) Enum.valueOf(MultiMessageSendTestGroup.class, str);
    }

    public static MultiMessageSendTestGroup[] values() {
        return (MultiMessageSendTestGroup[]) f206465g.clone();
    }

    public final boolean a() {
        return this == f206463e || this == f206464f || this == f206462d;
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF327347b() {
        return this.f206467b;
    }
}
