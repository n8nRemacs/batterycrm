package com.avito.android.publish.analytics.events;

import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddAddressEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/events/AddressChoiceType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddressChoiceType {

    /* renamed from: c, reason: collision with root package name */
    public static final AddressChoiceType f232211c;

    /* renamed from: d, reason: collision with root package name */
    public static final AddressChoiceType f232212d;

    /* renamed from: e, reason: collision with root package name */
    public static final AddressChoiceType f232213e;

    /* renamed from: f, reason: collision with root package name */
    public static final AddressChoiceType f232214f;

    /* renamed from: g, reason: collision with root package name */
    public static final AddressChoiceType f232215g;

    /* renamed from: h, reason: collision with root package name */
    public static final AddressChoiceType f232216h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AddressChoiceType[] f232217i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f232218j;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f232219b;

    static {
        AddressChoiceType addressChoiceType = new AddressChoiceType("DEFAULT", 0, "default");
        f232211c = addressChoiceType;
        AddressChoiceType addressChoiceType2 = new AddressChoiceType("SUGGEST", 1, "suggest");
        f232212d = addressChoiceType2;
        AddressChoiceType addressChoiceType3 = new AddressChoiceType("NEW_SA", 2, "new_seller_address");
        f232213e = addressChoiceType3;
        AddressChoiceType addressChoiceType4 = new AddressChoiceType("SUGGEST_SA", 3, "suggest_seller_address");
        f232214f = addressChoiceType4;
        AddressChoiceType addressChoiceType5 = new AddressChoiceType("SUGGEST_BA", 4, "buyer_address");
        f232215g = addressChoiceType5;
        AddressChoiceType addressChoiceType6 = new AddressChoiceType("MAP", 5, null);
        f232216h = addressChoiceType6;
        AddressChoiceType[] addressChoiceTypeArr = {addressChoiceType, addressChoiceType2, addressChoiceType3, addressChoiceType4, addressChoiceType5, addressChoiceType6};
        f232217i = addressChoiceTypeArr;
        f232218j = c.a(addressChoiceTypeArr);
    }

    public AddressChoiceType(String str, int i12, String str2) {
        this.f232219b = str2;
    }

    public static AddressChoiceType valueOf(String str) {
        return (AddressChoiceType) Enum.valueOf(AddressChoiceType.class, str);
    }

    public static AddressChoiceType[] values() {
        return (AddressChoiceType[]) f232217i.clone();
    }
}
