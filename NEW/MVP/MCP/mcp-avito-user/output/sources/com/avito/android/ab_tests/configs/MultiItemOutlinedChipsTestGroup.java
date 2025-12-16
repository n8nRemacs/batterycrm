package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultiItemOutlinedChipsConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/MultiItemOutlinedChipsTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MultiItemOutlinedChipsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final MultiItemOutlinedChipsTestGroup f67882c;

    /* renamed from: d, reason: collision with root package name */
    public static final MultiItemOutlinedChipsTestGroup f67883d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MultiItemOutlinedChipsTestGroup[] f67884e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67885f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67886b;

    static {
        MultiItemOutlinedChipsTestGroup multiItemOutlinedChipsTestGroup = new MultiItemOutlinedChipsTestGroup("CONTROL", 0, "control");
        f67882c = multiItemOutlinedChipsTestGroup;
        MultiItemOutlinedChipsTestGroup multiItemOutlinedChipsTestGroup2 = new MultiItemOutlinedChipsTestGroup("TEST", 1, "test");
        f67883d = multiItemOutlinedChipsTestGroup2;
        MultiItemOutlinedChipsTestGroup[] multiItemOutlinedChipsTestGroupArr = {multiItemOutlinedChipsTestGroup, multiItemOutlinedChipsTestGroup2};
        f67884e = multiItemOutlinedChipsTestGroupArr;
        f67885f = c.a(multiItemOutlinedChipsTestGroupArr);
    }

    public MultiItemOutlinedChipsTestGroup(String str, int i12, String str2) {
        this.f67886b = str2;
    }

    public static MultiItemOutlinedChipsTestGroup valueOf(String str) {
        return (MultiItemOutlinedChipsTestGroup) Enum.valueOf(MultiItemOutlinedChipsTestGroup.class, str);
    }

    public static MultiItemOutlinedChipsTestGroup[] values() {
        return (MultiItemOutlinedChipsTestGroup[]) f67884e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67892b() {
        return this.f67886b;
    }
}
