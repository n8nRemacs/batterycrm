package com.avito.android.beduin.common.shared.tabs;

import Y61.l;
import com.avito.android.R;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinTabStyle.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "", "", "forceThemeResId", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "TABS", "AVITO_TABS", "AVITO_TABS_LARGE", "AVITO_TABS_MEDIUM", "AVITO_TABS_SMALL", "AVITO_BLACK", "AVITO_NON_TRANSPARENT_TABS", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinTabStyle {

    @com.google.gson.annotations.c("avitoBlack")
    public static final BeduinTabStyle AVITO_BLACK;

    @com.google.gson.annotations.c("nonTransparentTabs")
    public static final BeduinTabStyle AVITO_NON_TRANSPARENT_TABS;

    @com.google.gson.annotations.c("avitoTabs")
    public static final BeduinTabStyle AVITO_TABS;

    @com.google.gson.annotations.c("avitoTabsLarge")
    public static final BeduinTabStyle AVITO_TABS_LARGE;

    @com.google.gson.annotations.c("avitoTabsMedium")
    public static final BeduinTabStyle AVITO_TABS_MEDIUM;

    @com.google.gson.annotations.c("avitoTabsSmall")
    public static final BeduinTabStyle AVITO_TABS_SMALL;

    @com.google.gson.annotations.c("tabs")
    public static final BeduinTabStyle TABS;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BeduinTabStyle[] f103462c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103463d;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f103464b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        BeduinTabStyle beduinTabStyle = new BeduinTabStyle("TABS", 0, null, 1, null);
        TABS = beduinTabStyle;
        int i12 = 1;
        Integer num = null;
        BeduinTabStyle beduinTabStyle2 = new BeduinTabStyle("AVITO_TABS", 1, num, i12, null);
        AVITO_TABS = beduinTabStyle2;
        int i13 = 1;
        C42822w c42822w = null;
        Integer num2 = null;
        BeduinTabStyle beduinTabStyle3 = new BeduinTabStyle("AVITO_TABS_LARGE", 2, num2, i13, c42822w);
        AVITO_TABS_LARGE = beduinTabStyle3;
        BeduinTabStyle beduinTabStyle4 = new BeduinTabStyle("AVITO_TABS_MEDIUM", 3, num, i12, 0 == true ? 1 : 0);
        AVITO_TABS_MEDIUM = beduinTabStyle4;
        BeduinTabStyle beduinTabStyle5 = new BeduinTabStyle("AVITO_TABS_SMALL", 4, num2, i13, c42822w);
        AVITO_TABS_SMALL = beduinTabStyle5;
        BeduinTabStyle beduinTabStyle6 = new BeduinTabStyle("AVITO_BLACK", 5, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        AVITO_BLACK = beduinTabStyle6;
        BeduinTabStyle beduinTabStyle7 = new BeduinTabStyle("AVITO_NON_TRANSPARENT_TABS", 6, 0 == true ? 1 : 0, 1, null);
        AVITO_NON_TRANSPARENT_TABS = beduinTabStyle7;
        BeduinTabStyle[] beduinTabStyleArr = {beduinTabStyle, beduinTabStyle2, beduinTabStyle3, beduinTabStyle4, beduinTabStyle5, beduinTabStyle6, beduinTabStyle7};
        f103462c = beduinTabStyleArr;
        f103463d = kotlin.enums.c.a(beduinTabStyleArr);
    }

    private BeduinTabStyle(@f0 String str, int i12, Integer num) {
        this.f103464b = num;
    }

    public static BeduinTabStyle valueOf(String str) {
        return (BeduinTabStyle) Enum.valueOf(BeduinTabStyle.class, str);
    }

    public static BeduinTabStyle[] values() {
        return (BeduinTabStyle[]) f103462c.clone();
    }

    public /* synthetic */ BeduinTabStyle(String str, int i12, Integer num, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? null : num);
    }
}
