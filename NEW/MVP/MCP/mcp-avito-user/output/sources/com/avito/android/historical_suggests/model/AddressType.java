package com.avito.android.historical_suggests.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/model/AddressType;", "", "_avito_historical-suggests_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressType {

    /* renamed from: b, reason: collision with root package name */
    public static final AddressType f161963b;

    /* renamed from: c, reason: collision with root package name */
    public static final AddressType f161964c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AddressType[] f161965d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f161966e;

    static {
        AddressType addressType = new AddressType("HistoricalSuggests", 0);
        f161963b = addressType;
        AddressType addressType2 = new AddressType("BuyerAddress", 1);
        f161964c = addressType2;
        AddressType[] addressTypeArr = {addressType, addressType2};
        f161965d = addressTypeArr;
        f161966e = c.a(addressTypeArr);
    }

    public AddressType() {
        throw null;
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) f161965d.clone();
    }
}
