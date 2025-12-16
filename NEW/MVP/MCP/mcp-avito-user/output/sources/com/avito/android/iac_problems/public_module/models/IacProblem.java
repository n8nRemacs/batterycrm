package com.avito.android.iac_problems.public_module.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacProblem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_problems/public_module/models/IacProblem;", "", "_avito_iac-problems_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacProblem {

    /* renamed from: b, reason: collision with root package name */
    public static final IacProblem f169089b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacProblem f169090c;

    /* renamed from: d, reason: collision with root package name */
    public static final IacProblem f169091d;

    /* renamed from: e, reason: collision with root package name */
    public static final IacProblem f169092e;

    /* renamed from: f, reason: collision with root package name */
    public static final IacProblem f169093f;

    /* renamed from: g, reason: collision with root package name */
    public static final IacProblem f169094g;

    /* renamed from: h, reason: collision with root package name */
    public static final IacProblem f169095h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ IacProblem[] f169096i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f169097j;

    static {
        IacProblem iacProblem = new IacProblem("USER_IAC_ENABLING", 0);
        f169089b = iacProblem;
        IacProblem iacProblem2 = new IacProblem("NOTIFICATION_ALL", 1);
        f169090c = iacProblem2;
        IacProblem iacProblem3 = new IacProblem("NOTIFICATION_IAC", 2);
        f169091d = iacProblem3;
        IacProblem iacProblem4 = new IacProblem("MIC_ACCESS", 3);
        f169092e = iacProblem4;
        IacProblem iacProblem5 = new IacProblem("BATTERY_OPTIMIZATION", 4);
        f169093f = iacProblem5;
        IacProblem iacProblem6 = new IacProblem("BACKGROUND_RESTRICTION", 5);
        f169094g = iacProblem6;
        IacProblem iacProblem7 = new IacProblem("MIUI_LOCK_SCREEN_PERMISSION", 6);
        f169095h = iacProblem7;
        IacProblem[] iacProblemArr = {iacProblem, iacProblem2, iacProblem3, iacProblem4, iacProblem5, iacProblem6, iacProblem7};
        f169096i = iacProblemArr;
        f169097j = c.a(iacProblemArr);
    }

    public IacProblem() {
        throw null;
    }

    public static IacProblem valueOf(String str) {
        return (IacProblem) Enum.valueOf(IacProblem.class, str);
    }

    public static IacProblem[] values() {
        return (IacProblem[]) f169096i.clone();
    }
}
