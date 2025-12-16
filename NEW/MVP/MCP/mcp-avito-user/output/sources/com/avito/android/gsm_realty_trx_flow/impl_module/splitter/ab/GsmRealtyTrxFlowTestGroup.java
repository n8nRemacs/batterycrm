package com.avito.android.gsm_realty_trx_flow.impl_module.splitter.ab;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GsmRealtyTrxFlowAbTests.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_realty_trx_flow/impl_module/splitter/ab/GsmRealtyTrxFlowTestGroup;", "", "Lu3/j;", "_avito_gsm-realty-trx-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GsmRealtyTrxFlowTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final GsmRealtyTrxFlowTestGroup f161271c;

    /* renamed from: d, reason: collision with root package name */
    public static final GsmRealtyTrxFlowTestGroup f161272d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ GsmRealtyTrxFlowTestGroup[] f161273e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f161274f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161275b;

    static {
        GsmRealtyTrxFlowTestGroup gsmRealtyTrxFlowTestGroup = new GsmRealtyTrxFlowTestGroup("NONE", 0, "");
        f161271c = gsmRealtyTrxFlowTestGroup;
        GsmRealtyTrxFlowTestGroup gsmRealtyTrxFlowTestGroup2 = new GsmRealtyTrxFlowTestGroup("CONTROL", 1, "control");
        GsmRealtyTrxFlowTestGroup gsmRealtyTrxFlowTestGroup3 = new GsmRealtyTrxFlowTestGroup("TEST", 2, "test");
        f161272d = gsmRealtyTrxFlowTestGroup3;
        GsmRealtyTrxFlowTestGroup[] gsmRealtyTrxFlowTestGroupArr = {gsmRealtyTrxFlowTestGroup, gsmRealtyTrxFlowTestGroup2, gsmRealtyTrxFlowTestGroup3};
        f161273e = gsmRealtyTrxFlowTestGroupArr;
        f161274f = c.a(gsmRealtyTrxFlowTestGroupArr);
    }

    public GsmRealtyTrxFlowTestGroup(String str, int i12, String str2) {
        this.f161275b = str2;
    }

    public static GsmRealtyTrxFlowTestGroup valueOf(String str) {
        return (GsmRealtyTrxFlowTestGroup) Enum.valueOf(GsmRealtyTrxFlowTestGroup.class, str);
    }

    public static GsmRealtyTrxFlowTestGroup[] values() {
        return (GsmRealtyTrxFlowTestGroup[]) f161273e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF161275b() {
        return this.f161275b;
    }
}
