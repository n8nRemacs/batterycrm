package com.avito.android.vas_planning.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasPlannerItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning/remote/model/VasRadioType;", "", "(Ljava/lang/String;I)V", "Now", "Plan", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasRadioType {

    @c("NOW")
    public static final VasRadioType Now;

    @c("PLAN")
    public static final VasRadioType Plan;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VasRadioType[] f322467b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f322468c;

    static {
        VasRadioType vasRadioType = new VasRadioType("Now", 0);
        Now = vasRadioType;
        VasRadioType vasRadioType2 = new VasRadioType("Plan", 1);
        Plan = vasRadioType2;
        VasRadioType[] vasRadioTypeArr = {vasRadioType, vasRadioType2};
        f322467b = vasRadioTypeArr;
        f322468c = kotlin.enums.c.a(vasRadioTypeArr);
    }

    private VasRadioType(String str, int i12) {
    }

    public static VasRadioType valueOf(String str) {
        return (VasRadioType) Enum.valueOf(VasRadioType.class, str);
    }

    public static VasRadioType[] values() {
        return (VasRadioType[]) f322467b.clone();
    }
}
