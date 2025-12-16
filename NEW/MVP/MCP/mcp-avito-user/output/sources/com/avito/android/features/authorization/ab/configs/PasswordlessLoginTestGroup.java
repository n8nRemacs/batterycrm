package com.avito.android.features.authorization.ab.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PasswordlessLoginTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/authorization/ab/configs/PasswordlessLoginTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_authorization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordlessLoginTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final PasswordlessLoginTestGroup f157634c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PasswordlessLoginTestGroup[] f157635d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f157636e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157637b;

    static {
        PasswordlessLoginTestGroup passwordlessLoginTestGroup = new PasswordlessLoginTestGroup("CONTROL", 0, "control");
        f157634c = passwordlessLoginTestGroup;
        PasswordlessLoginTestGroup[] passwordlessLoginTestGroupArr = {passwordlessLoginTestGroup, new PasswordlessLoginTestGroup("TEST_VOICE_CODE", 1, "test_voicecode"), new PasswordlessLoginTestGroup("TEST_CALL", 2, "test_call")};
        f157635d = passwordlessLoginTestGroupArr;
        f157636e = c.a(passwordlessLoginTestGroupArr);
    }

    public PasswordlessLoginTestGroup(String str, int i12, String str2) {
        this.f157637b = str2;
    }

    public static PasswordlessLoginTestGroup valueOf(String str) {
        return (PasswordlessLoginTestGroup) Enum.valueOf(PasswordlessLoginTestGroup.class, str);
    }

    public static PasswordlessLoginTestGroup[] values() {
        return (PasswordlessLoginTestGroup[]) f157635d.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157637b() {
        return this.f157637b;
    }
}
