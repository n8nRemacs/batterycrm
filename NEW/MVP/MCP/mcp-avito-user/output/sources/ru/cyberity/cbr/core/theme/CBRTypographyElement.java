package ru.cyberity.cbr.core.theme;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CBRTypographyElement.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRTypographyElement;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BODY", "CAPTION", "HEADLINE1", "HEADLINE2", "SUBTITLE1", "SUBTITLE2", "Companion", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public enum CBRTypographyElement {
    BODY("body"),
    CAPTION("caption"),
    HEADLINE1("headline1"),
    HEADLINE2("headline2"),
    SUBTITLE1("subtitle1"),
    SUBTITLE2("subtitle2");


    @k
    private static final List<String> names;

    @k
    private final String value;

    static {
        CBRTypographyElement[] cBRTypographyElementArrValues = values();
        ArrayList arrayList = new ArrayList(cBRTypographyElementArrValues.length);
        for (CBRTypographyElement cBRTypographyElement : cBRTypographyElementArrValues) {
            arrayList.add(cBRTypographyElement.value);
        }
        names = arrayList;
    }

    CBRTypographyElement(String str) {
        this.value = str;
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
