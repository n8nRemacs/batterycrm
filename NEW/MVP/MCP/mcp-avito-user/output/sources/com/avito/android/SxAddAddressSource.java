package com.avito.android;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SxAddressAddLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SxAddAddressSource;", "", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SxAddAddressSource {

    /* renamed from: b, reason: collision with root package name */
    public static final SxAddAddressSource f67543b;

    /* renamed from: c, reason: collision with root package name */
    public static final SxAddAddressSource f67544c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SxAddAddressSource[] f67545d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f67546e;

    static {
        SxAddAddressSource sxAddAddressSource = new SxAddAddressSource("PROFILE", 0);
        f67543b = sxAddAddressSource;
        SxAddAddressSource sxAddAddressSource2 = new SxAddAddressSource("PUBLISH", 1);
        f67544c = sxAddAddressSource2;
        SxAddAddressSource[] sxAddAddressSourceArr = {sxAddAddressSource, sxAddAddressSource2};
        f67545d = sxAddAddressSourceArr;
        f67546e = kotlin.enums.c.a(sxAddAddressSourceArr);
    }

    public SxAddAddressSource() {
        throw null;
    }

    public static SxAddAddressSource valueOf(String str) {
        return (SxAddAddressSource) Enum.valueOf(SxAddAddressSource.class, str);
    }

    public static SxAddAddressSource[] values() {
        return (SxAddAddressSource[]) f67545d.clone();
    }
}
