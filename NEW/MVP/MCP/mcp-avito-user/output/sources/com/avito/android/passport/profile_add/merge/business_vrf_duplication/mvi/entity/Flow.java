package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BusinessVrfDuplicationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/Flow;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Flow {

    /* renamed from: b, reason: collision with root package name */
    public static final Flow f212550b;

    /* renamed from: c, reason: collision with root package name */
    public static final Flow f212551c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Flow[] f212552d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f212553e;

    static {
        Flow flow = new Flow("CREATE", 0);
        f212550b = flow;
        Flow flow2 = new Flow("MERGE", 1);
        f212551c = flow2;
        Flow[] flowArr = {flow, flow2};
        f212552d = flowArr;
        f212553e = c.a(flowArr);
    }

    public Flow() {
        throw null;
    }

    public static Flow valueOf(String str) {
        return (Flow) Enum.valueOf(Flow.class, str);
    }

    public static Flow[] values() {
        return (Flow[]) f212552d.clone();
    }
}
