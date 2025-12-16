package com.avito.android.avito_map.alignment;

import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoMapHorizontalAlignment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "RIGHT", "LEFT", "CENTER", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapHorizontalAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvitoMapHorizontalAlignment[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    private final int value;

    @c("right")
    public static final AvitoMapHorizontalAlignment RIGHT = new AvitoMapHorizontalAlignment("RIGHT", 0, 0);

    @c("left")
    public static final AvitoMapHorizontalAlignment LEFT = new AvitoMapHorizontalAlignment("LEFT", 1, 1);

    @c("center")
    public static final AvitoMapHorizontalAlignment CENTER = new AvitoMapHorizontalAlignment("CENTER", 2, 2);

    /* compiled from: AvitoMapHorizontalAlignment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment$Companion;", "", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;", "value", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final AvitoMapHorizontalAlignment from(int value) {
            AvitoMapHorizontalAlignment next;
            Iterator<AvitoMapHorizontalAlignment> it = AvitoMapHorizontalAlignment.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            AvitoMapHorizontalAlignment avitoMapHorizontalAlignment = next;
            return avitoMapHorizontalAlignment == null ? AvitoMapHorizontalAlignment.LEFT : avitoMapHorizontalAlignment;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AvitoMapHorizontalAlignment[] $values() {
        return new AvitoMapHorizontalAlignment[]{RIGHT, LEFT, CENTER};
    }

    static {
        AvitoMapHorizontalAlignment[] avitoMapHorizontalAlignmentArr$values = $values();
        $VALUES = avitoMapHorizontalAlignmentArr$values;
        $ENTRIES = kotlin.enums.c.a(avitoMapHorizontalAlignmentArr$values);
        INSTANCE = new Companion(null);
    }

    private AvitoMapHorizontalAlignment(String str, int i12, int i13) {
        this.value = i13;
    }

    @k
    public static a<AvitoMapHorizontalAlignment> getEntries() {
        return $ENTRIES;
    }

    public static AvitoMapHorizontalAlignment valueOf(String str) {
        return (AvitoMapHorizontalAlignment) Enum.valueOf(AvitoMapHorizontalAlignment.class, str);
    }

    public static AvitoMapHorizontalAlignment[] values() {
        return (AvitoMapHorizontalAlignment[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
