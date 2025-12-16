package com.avito.android.remote.model.credit_broker;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditBrokerProduct.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "", "(Ljava/lang/String;I)V", "DEFAULT", "BELOW_REC", "BELOW_LOCATION", "BELOW_ABOUT_BUILDING", "UNDER_SAFE_DEAL_BUTTONS", "UNDER_DESCRIPTION", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CalculatorPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CalculatorPosition[] $VALUES;

    @c("default")
    public static final CalculatorPosition DEFAULT = new CalculatorPosition("DEFAULT", 0);

    @c("belowRec")
    public static final CalculatorPosition BELOW_REC = new CalculatorPosition("BELOW_REC", 1);

    @c("underLocationBlock")
    public static final CalculatorPosition BELOW_LOCATION = new CalculatorPosition("BELOW_LOCATION", 2);

    @c("underAboutBuildingBlock")
    public static final CalculatorPosition BELOW_ABOUT_BUILDING = new CalculatorPosition("BELOW_ABOUT_BUILDING", 3);

    @c("underSafeDealButtons")
    public static final CalculatorPosition UNDER_SAFE_DEAL_BUTTONS = new CalculatorPosition("UNDER_SAFE_DEAL_BUTTONS", 4);

    @c("underDescription")
    public static final CalculatorPosition UNDER_DESCRIPTION = new CalculatorPosition("UNDER_DESCRIPTION", 5);

    private static final /* synthetic */ CalculatorPosition[] $values() {
        return new CalculatorPosition[]{DEFAULT, BELOW_REC, BELOW_LOCATION, BELOW_ABOUT_BUILDING, UNDER_SAFE_DEAL_BUTTONS, UNDER_DESCRIPTION};
    }

    static {
        CalculatorPosition[] calculatorPositionArr$values = $values();
        $VALUES = calculatorPositionArr$values;
        $ENTRIES = kotlin.enums.c.a(calculatorPositionArr$values);
    }

    private CalculatorPosition(String str, int i12) {
    }

    @k
    public static a<CalculatorPosition> getEntries() {
        return $ENTRIES;
    }

    public static CalculatorPosition valueOf(String str) {
        return (CalculatorPosition) Enum.valueOf(CalculatorPosition.class, str);
    }

    public static CalculatorPosition[] values() {
        return (CalculatorPosition[]) $VALUES.clone();
    }
}
