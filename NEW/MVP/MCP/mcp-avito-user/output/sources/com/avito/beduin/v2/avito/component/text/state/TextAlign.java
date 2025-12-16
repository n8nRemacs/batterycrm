package com.avito.beduin.v2.avito.component.text.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoTextState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/TextAlign;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextAlign {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TextAlign[] f335325b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335326c;

    static {
        TextAlign[] textAlignArr = {new TextAlign("Start", 0), new TextAlign("End", 1), new TextAlign("Center", 2), new TextAlign("Justify", 3), new TextAlign("Left", 4), new TextAlign("Right", 5)};
        f335325b = textAlignArr;
        f335326c = kotlin.enums.c.a(textAlignArr);
    }

    public TextAlign() {
        throw null;
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) f335325b.clone();
    }
}
