package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnershipCostResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostAction;", "", "(Ljava/lang/String;I)V", "TO_DISCLAIMER", "TO_INPUTS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OwnershipCostAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OwnershipCostAction[] $VALUES;

    @c("ownershipCostDisclaimer")
    public static final OwnershipCostAction TO_DISCLAIMER = new OwnershipCostAction("TO_DISCLAIMER", 0);

    @c("ownershipCostForm")
    public static final OwnershipCostAction TO_INPUTS = new OwnershipCostAction("TO_INPUTS", 1);

    private static final /* synthetic */ OwnershipCostAction[] $values() {
        return new OwnershipCostAction[]{TO_DISCLAIMER, TO_INPUTS};
    }

    static {
        OwnershipCostAction[] ownershipCostActionArr$values = $values();
        $VALUES = ownershipCostActionArr$values;
        $ENTRIES = kotlin.enums.c.a(ownershipCostActionArr$values);
    }

    private OwnershipCostAction(String str, int i12) {
    }

    @k
    public static a<OwnershipCostAction> getEntries() {
        return $ENTRIES;
    }

    public static OwnershipCostAction valueOf(String str) {
        return (OwnershipCostAction) Enum.valueOf(OwnershipCostAction.class, str);
    }

    public static OwnershipCostAction[] values() {
        return (OwnershipCostAction[]) $VALUES.clone();
    }
}
