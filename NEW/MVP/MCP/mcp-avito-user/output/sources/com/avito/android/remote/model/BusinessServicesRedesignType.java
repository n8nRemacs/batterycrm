package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemCardRedesign.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/BusinessServicesRedesignType;", "", "(Ljava/lang/String;I)V", "GROUP_B", "GROUP_C", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BusinessServicesRedesignType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BusinessServicesRedesignType[] $VALUES;

    @c("group_b")
    public static final BusinessServicesRedesignType GROUP_B = new BusinessServicesRedesignType("GROUP_B", 0);

    @c("group_c")
    public static final BusinessServicesRedesignType GROUP_C = new BusinessServicesRedesignType("GROUP_C", 1);

    private static final /* synthetic */ BusinessServicesRedesignType[] $values() {
        return new BusinessServicesRedesignType[]{GROUP_B, GROUP_C};
    }

    static {
        BusinessServicesRedesignType[] businessServicesRedesignTypeArr$values = $values();
        $VALUES = businessServicesRedesignTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(businessServicesRedesignTypeArr$values);
    }

    private BusinessServicesRedesignType(String str, int i12) {
    }

    @k
    public static a<BusinessServicesRedesignType> getEntries() {
        return $ENTRIES;
    }

    public static BusinessServicesRedesignType valueOf(String str) {
        return (BusinessServicesRedesignType) Enum.valueOf(BusinessServicesRedesignType.class, str);
    }

    public static BusinessServicesRedesignType[] values() {
        return (BusinessServicesRedesignType[]) $VALUES.clone();
    }
}
