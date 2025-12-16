package com.avito.android.features.soccom.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SoccomTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/soccom/ab_tests/configs/SoccomTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_soccom"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SoccomTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SoccomTestGroup[] f157667c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f157668d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157669b;

    static {
        SoccomTestGroup[] soccomTestGroupArr = {new SoccomTestGroup("CONTROL", 0, "control"), new SoccomTestGroup("FAV", 1, "fav"), new SoccomTestGroup("MAIN", 2, "main")};
        f157667c = soccomTestGroupArr;
        f157668d = c.a(soccomTestGroupArr);
    }

    public SoccomTestGroup(String str, int i12, String str2) {
        this.f157669b = str2;
    }

    public static SoccomTestGroup valueOf(String str) {
        return (SoccomTestGroup) Enum.valueOf(SoccomTestGroup.class, str);
    }

    public static SoccomTestGroup[] values() {
        return (SoccomTestGroup[]) f157667c.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157669b() {
        return this.f157669b;
    }
}
