package com.avito.android.remote.model.category_parameters.slot.information;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InformationSlotConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;", "", "(Ljava/lang/String;I)V", "DEFAULT", "BODY", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextStyle[] $VALUES;

    @c("default")
    public static final TextStyle DEFAULT = new TextStyle("DEFAULT", 0);

    @c("body")
    public static final TextStyle BODY = new TextStyle("BODY", 1);

    private static final /* synthetic */ TextStyle[] $values() {
        return new TextStyle[]{DEFAULT, BODY};
    }

    static {
        TextStyle[] textStyleArr$values = $values();
        $VALUES = textStyleArr$values;
        $ENTRIES = kotlin.enums.c.a(textStyleArr$values);
    }

    private TextStyle(String str, int i12) {
    }

    @k
    public static a<TextStyle> getEntries() {
        return $ENTRIES;
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) Enum.valueOf(TextStyle.class, str);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) $VALUES.clone();
    }
}
