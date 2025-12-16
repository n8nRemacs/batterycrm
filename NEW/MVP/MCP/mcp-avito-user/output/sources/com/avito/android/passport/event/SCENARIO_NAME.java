package com.avito.android.passport.event;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VrfDuplicationEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/event/SCENARIO_NAME;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SCENARIO_NAME {

    /* renamed from: c, reason: collision with root package name */
    public static final SCENARIO_NAME f211136c;

    /* renamed from: d, reason: collision with root package name */
    public static final SCENARIO_NAME f211137d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SCENARIO_NAME[] f211138e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f211139f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211140b;

    static {
        SCENARIO_NAME scenario_name = new SCENARIO_NAME("CREATE", 0, "create");
        f211136c = scenario_name;
        SCENARIO_NAME scenario_name2 = new SCENARIO_NAME("MERGE", 1, "merge");
        f211137d = scenario_name2;
        SCENARIO_NAME[] scenario_nameArr = {scenario_name, scenario_name2};
        f211138e = scenario_nameArr;
        f211139f = c.a(scenario_nameArr);
    }

    public SCENARIO_NAME(String str, int i12, String str2) {
        this.f211140b = str2;
    }

    public static SCENARIO_NAME valueOf(String str) {
        return (SCENARIO_NAME) Enum.valueOf(SCENARIO_NAME.class, str);
    }

    public static SCENARIO_NAME[] values() {
        return (SCENARIO_NAME[]) f211138e.clone();
    }
}
