package com.avito.android.remote.model;

import Y61.k;
import aW.InterfaceC19823a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VehicleType.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/VehicleType;", "", "(Ljava/lang/String;I)V", "isNewAuto", "", "isUsedAuto", "NEW", "USED", "NO_VALUE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VehicleType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VehicleType[] $VALUES;

    @c("new")
    public static final VehicleType NEW = new VehicleType("NEW", 0);

    @c("used")
    public static final VehicleType USED = new VehicleType("USED", 1);

    @InterfaceC19823a
    public static final VehicleType NO_VALUE = new VehicleType("NO_VALUE", 2);

    private static final /* synthetic */ VehicleType[] $values() {
        return new VehicleType[]{NEW, USED, NO_VALUE};
    }

    static {
        VehicleType[] vehicleTypeArr$values = $values();
        $VALUES = vehicleTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(vehicleTypeArr$values);
    }

    private VehicleType(String str, int i12) {
    }

    @k
    public static a<VehicleType> getEntries() {
        return $ENTRIES;
    }

    public static VehicleType valueOf(String str) {
        return (VehicleType) Enum.valueOf(VehicleType.class, str);
    }

    public static VehicleType[] values() {
        return (VehicleType[]) $VALUES.clone();
    }

    public final boolean isNewAuto() {
        return this == NEW;
    }

    public final boolean isUsedAuto() {
        return this == USED;
    }
}
