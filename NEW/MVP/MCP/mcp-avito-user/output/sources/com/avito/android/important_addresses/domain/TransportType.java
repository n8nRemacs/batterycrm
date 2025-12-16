package com.avito.android.important_addresses.domain;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalculateTravelTimeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/domain/TransportType;", "", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportType {

    /* renamed from: b, reason: collision with root package name */
    public static final TransportType f169574b;

    /* renamed from: c, reason: collision with root package name */
    public static final TransportType f169575c;

    /* renamed from: d, reason: collision with root package name */
    public static final TransportType f169576d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TransportType[] f169577e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f169578f;

    static {
        TransportType transportType = new TransportType("AUTO", 0);
        f169574b = transportType;
        TransportType transportType2 = new TransportType("PEDESTRIAN", 1);
        f169575c = transportType2;
        TransportType transportType3 = new TransportType("MASSTRANSIT", 2);
        f169576d = transportType3;
        TransportType[] transportTypeArr = {transportType, transportType2, transportType3};
        f169577e = transportTypeArr;
        f169578f = c.a(transportTypeArr);
    }

    public TransportType() {
        throw null;
    }

    public static TransportType valueOf(String str) {
        return (TransportType) Enum.valueOf(TransportType.class, str);
    }

    public static TransportType[] values() {
        return (TransportType[]) f169577e.clone();
    }
}
