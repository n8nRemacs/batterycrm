package com.avito.android.remote.model.filters_parameter.slot;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SlotType.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "", "", "strValue", "Lkotlin/reflect/d;", "slotClass", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/reflect/d;)V", "Ljava/lang/String;", "getStrValue", "()Ljava/lang/String;", "Lkotlin/reflect/d;", "getSlotClass", "()Lkotlin/reflect/d;", "Companion", "OTHER", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SlotType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SlotType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    public static final SlotType OTHER = new SlotType("OTHER", 0, "", m0.f406844a.b(Object.class));

    @k
    private static final Map<String, SlotType> valuesMap;

    @k
    private final d<?> slotClass;

    @k
    private final String strValue;

    /* compiled from: SlotType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/slot/SlotType$Companion;", "", "()V", "valuesMap", "", "", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "valueOfStr", "strValue", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final SlotType valueOfStr(@l String strValue) {
            if (strValue == null) {
                return SlotType.OTHER;
            }
            SlotType slotType = (SlotType) SlotType.valuesMap.get(strValue);
            return slotType == null ? SlotType.OTHER : slotType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SlotType[] $values() {
        return new SlotType[]{OTHER};
    }

    static {
        SlotType[] slotTypeArr$values = $values();
        $VALUES = slotTypeArr$values;
        $ENTRIES = c.a(slotTypeArr$values);
        INSTANCE = new Companion(null);
        SlotType[] slotTypeArrValues = values();
        int iF2 = P0.f(slotTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        for (SlotType slotType : slotTypeArrValues) {
            linkedHashMap.put(slotType.strValue, slotType);
        }
        valuesMap = linkedHashMap;
    }

    private SlotType(String str, int i12, String str2, d dVar) {
        this.strValue = str2;
        this.slotClass = dVar;
    }

    @k
    public static a<SlotType> getEntries() {
        return $ENTRIES;
    }

    public static SlotType valueOf(String str) {
        return (SlotType) Enum.valueOf(SlotType.class, str);
    }

    public static SlotType[] values() {
        return (SlotType[]) $VALUES.clone();
    }

    @k
    public final d<?> getSlotClass() {
        return this.slotClass;
    }

    @k
    public final String getStrValue() {
        return this.strValue;
    }
}
