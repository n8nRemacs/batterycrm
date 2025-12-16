package com.avito.android.competitor_analytics.domain.model;

import W2.q;
import X2.h;
import Y61.k;
import com.akita.compose.foundation.p;
import com.akita.compose.theme.re23.b;
import com.akita.compose.theme.re23.g;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestsStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/SuggestsStatus;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestsStatus {

    /* renamed from: e, reason: collision with root package name */
    public static final SuggestsStatus f124343e;

    /* renamed from: f, reason: collision with root package name */
    public static final SuggestsStatus f124344f;

    /* renamed from: g, reason: collision with root package name */
    public static final SuggestsStatus f124345g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ SuggestsStatus[] f124346h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f124347i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f124348b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f124349c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f124350d;

    static {
        b.f63983a.getClass();
        com.akita.compose.theme.re23.semantic.b bVar = b.f63987e;
        bVar.getClass();
        q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
        qVar.c().getClass();
        p pVar = X2.b.f18128g;
        bVar.getClass();
        qVar.getText().getClass();
        p pVar2 = h.f18559g;
        g.f65049a.getClass();
        SuggestsStatus suggestsStatus = new SuggestsStatus("SUCCESS", 0, pVar, pVar2, g.f65136m2);
        f124343e = suggestsStatus;
        bVar.getClass();
        qVar.c().getClass();
        p pVar3 = X2.b.f18129h;
        bVar.getClass();
        qVar.getText().getClass();
        p pVar4 = h.f18560h;
        String str = g.f65184t2;
        SuggestsStatus suggestsStatus2 = new SuggestsStatus("WARNING", 1, pVar3, pVar4, str);
        f124344f = suggestsStatus2;
        bVar.getClass();
        qVar.c().getClass();
        p pVar5 = X2.b.f18132k;
        bVar.getClass();
        qVar.getText().getClass();
        SuggestsStatus suggestsStatus3 = new SuggestsStatus("ALERT", 2, pVar5, h.f18558f, str);
        f124345g = suggestsStatus3;
        SuggestsStatus[] suggestsStatusArr = {suggestsStatus, suggestsStatus2, suggestsStatus3};
        f124346h = suggestsStatusArr;
        f124347i = c.a(suggestsStatusArr);
    }

    public SuggestsStatus(String str, int i12, p pVar, p pVar2, String str2) {
        this.f124348b = pVar;
        this.f124349c = pVar2;
        this.f124350d = str2;
    }

    public static SuggestsStatus valueOf(String str) {
        return (SuggestsStatus) Enum.valueOf(SuggestsStatus.class, str);
    }

    public static SuggestsStatus[] values() {
        return (SuggestsStatus[]) f124346h.clone();
    }
}
