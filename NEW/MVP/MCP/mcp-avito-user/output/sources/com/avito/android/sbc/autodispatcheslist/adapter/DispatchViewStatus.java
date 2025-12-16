package com.avito.android.sbc.autodispatcheslist.adapter;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SbcAutoDispatchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/DispatchViewStatus;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DispatchViewStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final DispatchViewStatus f259023b;

    /* renamed from: c, reason: collision with root package name */
    public static final DispatchViewStatus f259024c;

    /* renamed from: d, reason: collision with root package name */
    public static final DispatchViewStatus f259025d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DispatchViewStatus[] f259026e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f259027f;

    static {
        DispatchViewStatus dispatchViewStatus = new DispatchViewStatus("Active", 0);
        f259023b = dispatchViewStatus;
        DispatchViewStatus dispatchViewStatus2 = new DispatchViewStatus("Created", 1);
        f259024c = dispatchViewStatus2;
        DispatchViewStatus dispatchViewStatus3 = new DispatchViewStatus("Inactive", 2);
        f259025d = dispatchViewStatus3;
        DispatchViewStatus[] dispatchViewStatusArr = {dispatchViewStatus, dispatchViewStatus2, dispatchViewStatus3};
        f259026e = dispatchViewStatusArr;
        f259027f = kotlin.enums.c.a(dispatchViewStatusArr);
    }

    public DispatchViewStatus() {
        throw null;
    }

    public static DispatchViewStatus valueOf(String str) {
        return (DispatchViewStatus) Enum.valueOf(DispatchViewStatus.class, str);
    }

    public static DispatchViewStatus[] values() {
        return (DispatchViewStatus[]) f259026e.clone();
    }
}
