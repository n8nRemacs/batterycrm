package com.avito.android.lib.design.input;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FormatterTypeFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/e;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f179396a = new e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179397b = new FormatterType(1, 2, new MaskParameters("", false, "", null, false, "### ### ### ### ### ### ###", true, "0", 0, 0, null, 1818, null));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179398c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179399d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179400e;

    static {
        FormatterType.f179288e.getClass();
        C42822w c42822w = null;
        f179398c = new FormatterType(3, 8194, new MaskParameters("", false, "", null, false, "### ### ### ### ### ### ###", true, "0", DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator(), 0, null, 1562, c42822w));
        boolean z12 = false;
        String str = null;
        boolean z13 = false;
        boolean z14 = false;
        String str2 = null;
        char c12 = 0;
        int i12 = 0;
        String str3 = null;
        f179399d = new FormatterType(4, 2, new MaskParameters("", z12, "", str, z13, "##.##.####", z14, str2, c12, i12, str3, 2010, c42822w));
        f179400e = new FormatterType(9, 8194, new MaskParameters(null, z12, "%", str, z13, null, z14, str2, c12, i12, str3, 2043, null));
    }
}
