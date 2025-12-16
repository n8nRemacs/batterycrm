package com.avito.android.remote.model.text;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextAlignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/text/TextAlignment;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextAlignment {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TextAlignment[] $VALUES;

    @c("left")
    public static final TextAlignment LEFT = new TextAlignment("LEFT", 0);

    @c("right")
    public static final TextAlignment RIGHT = new TextAlignment("RIGHT", 1);

    @c("center")
    public static final TextAlignment CENTER = new TextAlignment("CENTER", 2);

    private static final /* synthetic */ TextAlignment[] $values() {
        return new TextAlignment[]{LEFT, RIGHT, CENTER};
    }

    static {
        TextAlignment[] textAlignmentArr$values = $values();
        $VALUES = textAlignmentArr$values;
        $ENTRIES = kotlin.enums.c.a(textAlignmentArr$values);
    }

    private TextAlignment(String str, int i12) {
    }

    @k
    public static kotlin.enums.a<TextAlignment> getEntries() {
        return $ENTRIES;
    }

    public static TextAlignment valueOf(String str) {
        return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
    }

    public static TextAlignment[] values() {
        return (TextAlignment[]) $VALUES.clone();
    }
}
