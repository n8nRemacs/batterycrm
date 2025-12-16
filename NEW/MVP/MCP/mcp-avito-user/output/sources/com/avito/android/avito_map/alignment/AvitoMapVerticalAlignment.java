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
/* compiled from: AvitoMapVerticalAlignment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TOP", "BOTTOM", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapVerticalAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvitoMapVerticalAlignment[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    private final int value;

    @c("top")
    public static final AvitoMapVerticalAlignment TOP = new AvitoMapVerticalAlignment("TOP", 0, 0);

    @c("bottom")
    public static final AvitoMapVerticalAlignment BOTTOM = new AvitoMapVerticalAlignment("BOTTOM", 1, 1);

    /* compiled from: AvitoMapVerticalAlignment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment$Companion;", "", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;", "value", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final AvitoMapVerticalAlignment from(int value) {
            AvitoMapVerticalAlignment next;
            Iterator<AvitoMapVerticalAlignment> it = AvitoMapVerticalAlignment.getEntries().iterator();
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
            AvitoMapVerticalAlignment avitoMapVerticalAlignment = next;
            return avitoMapVerticalAlignment == null ? AvitoMapVerticalAlignment.BOTTOM : avitoMapVerticalAlignment;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AvitoMapVerticalAlignment[] $values() {
        return new AvitoMapVerticalAlignment[]{TOP, BOTTOM};
    }

    static {
        AvitoMapVerticalAlignment[] avitoMapVerticalAlignmentArr$values = $values();
        $VALUES = avitoMapVerticalAlignmentArr$values;
        $ENTRIES = kotlin.enums.c.a(avitoMapVerticalAlignmentArr$values);
        INSTANCE = new Companion(null);
    }

    private AvitoMapVerticalAlignment(String str, int i12, int i13) {
        this.value = i13;
    }

    @k
    public static a<AvitoMapVerticalAlignment> getEntries() {
        return $ENTRIES;
    }

    public static AvitoMapVerticalAlignment valueOf(String str) {
        return (AvitoMapVerticalAlignment) Enum.valueOf(AvitoMapVerticalAlignment.class, str);
    }

    public static AvitoMapVerticalAlignment[] values() {
        return (AvitoMapVerticalAlignment[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
