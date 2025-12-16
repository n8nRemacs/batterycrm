package com.avito.android.geo_common.model.location_picker;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationPickerAddressType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/LocationPickerAddressType;", "", "", "stringValue", "rus", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "HOME", "WORK", "OTHER", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationPickerAddressType {

    @c("home")
    public static final LocationPickerAddressType HOME;

    @c(PluralsKeys.OTHER)
    public static final LocationPickerAddressType OTHER;

    @c("work")
    public static final LocationPickerAddressType WORK;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LocationPickerAddressType[] f159423d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f159424e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f159425b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f159426c;

    static {
        LocationPickerAddressType locationPickerAddressType = new LocationPickerAddressType("HOME", 0, "home", "Дом");
        HOME = locationPickerAddressType;
        LocationPickerAddressType locationPickerAddressType2 = new LocationPickerAddressType("WORK", 1, "work", "Работа");
        WORK = locationPickerAddressType2;
        LocationPickerAddressType locationPickerAddressType3 = new LocationPickerAddressType("OTHER", 2, PluralsKeys.OTHER, null);
        OTHER = locationPickerAddressType3;
        LocationPickerAddressType[] locationPickerAddressTypeArr = {locationPickerAddressType, locationPickerAddressType2, locationPickerAddressType3};
        f159423d = locationPickerAddressTypeArr;
        f159424e = kotlin.enums.c.a(locationPickerAddressTypeArr);
    }

    private LocationPickerAddressType(String str, int i12, String str2, String str3) {
        this.f159425b = str2;
        this.f159426c = str3;
    }

    public static LocationPickerAddressType valueOf(String str) {
        return (LocationPickerAddressType) Enum.valueOf(LocationPickerAddressType.class, str);
    }

    public static LocationPickerAddressType[] values() {
        return (LocationPickerAddressType[]) f159423d.clone();
    }
}
