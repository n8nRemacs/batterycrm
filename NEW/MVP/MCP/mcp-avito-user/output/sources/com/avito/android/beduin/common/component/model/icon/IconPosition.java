package com.avito.android.beduin.common.component.model.icon;

import Y61.k;
import androidx.annotation.Keep;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconPosition.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconPosition[] $VALUES;

    @c("left")
    public static final IconPosition LEFT = new IconPosition("LEFT", 0);

    @c("right")
    public static final IconPosition RIGHT = new IconPosition("RIGHT", 1);

    private static final /* synthetic */ IconPosition[] $values() {
        return new IconPosition[]{LEFT, RIGHT};
    }

    static {
        IconPosition[] iconPositionArr$values = $values();
        $VALUES = iconPositionArr$values;
        $ENTRIES = kotlin.enums.c.a(iconPositionArr$values);
    }

    private IconPosition(String str, int i12) {
    }

    @k
    public static a<IconPosition> getEntries() {
        return $ENTRIES;
    }

    public static IconPosition valueOf(String str) {
        return (IconPosition) Enum.valueOf(IconPosition.class, str);
    }

    public static IconPosition[] values() {
        return (IconPosition[]) $VALUES.clone();
    }
}
