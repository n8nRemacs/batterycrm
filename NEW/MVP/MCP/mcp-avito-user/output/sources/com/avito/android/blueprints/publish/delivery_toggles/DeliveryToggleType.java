package com.avito.android.blueprints.publish.delivery_toggles;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishDeliveryTogglesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/DeliveryToggleType;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryToggleType {

    /* renamed from: b, reason: collision with root package name */
    public static final DeliveryToggleType f106168b;

    /* renamed from: c, reason: collision with root package name */
    public static final DeliveryToggleType f106169c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeliveryToggleType f106170d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DeliveryToggleType[] f106171e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f106172f;

    static {
        DeliveryToggleType deliveryToggleType = new DeliveryToggleType("Pvz", 0);
        f106168b = deliveryToggleType;
        DeliveryToggleType deliveryToggleType2 = new DeliveryToggleType("Courier", 1);
        f106169c = deliveryToggleType2;
        DeliveryToggleType deliveryToggleType3 = new DeliveryToggleType("Postamat", 2);
        f106170d = deliveryToggleType3;
        DeliveryToggleType[] deliveryToggleTypeArr = {deliveryToggleType, deliveryToggleType2, deliveryToggleType3};
        f106171e = deliveryToggleTypeArr;
        f106172f = kotlin.enums.c.a(deliveryToggleTypeArr);
    }

    public DeliveryToggleType() {
        throw null;
    }

    public static DeliveryToggleType valueOf(String str) {
        return (DeliveryToggleType) Enum.valueOf(DeliveryToggleType.class, str);
    }

    public static DeliveryToggleType[] values() {
        return (DeliveryToggleType[]) f106171e.clone();
    }
}
