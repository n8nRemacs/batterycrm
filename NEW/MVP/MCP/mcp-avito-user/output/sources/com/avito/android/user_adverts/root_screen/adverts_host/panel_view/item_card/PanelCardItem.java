package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: PanelCardItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/a;", "HyphenationFrequency", "Style", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PanelCardItem extends com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PanelCardItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem$HyphenationFrequency;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HyphenationFrequency {

        /* renamed from: b, reason: collision with root package name */
        public static final HyphenationFrequency f313691b;

        /* renamed from: c, reason: collision with root package name */
        public static final HyphenationFrequency f313692c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ HyphenationFrequency[] f313693d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f313694e;

        static {
            HyphenationFrequency hyphenationFrequency = new HyphenationFrequency("NONE", 0);
            f313691b = hyphenationFrequency;
            HyphenationFrequency hyphenationFrequency2 = new HyphenationFrequency("NORMAL", 1);
            f313692c = hyphenationFrequency2;
            HyphenationFrequency[] hyphenationFrequencyArr = {hyphenationFrequency, hyphenationFrequency2};
            f313693d = hyphenationFrequencyArr;
            f313694e = kotlin.enums.c.a(hyphenationFrequencyArr);
        }

        public HyphenationFrequency() {
            throw null;
        }

        public static HyphenationFrequency valueOf(String str) {
            return (HyphenationFrequency) Enum.valueOf(HyphenationFrequency.class, str);
        }

        public static HyphenationFrequency[] values() {
            return (HyphenationFrequency[]) f313693d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PanelCardItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem$Style;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f313695b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f313696c;

        /* renamed from: d, reason: collision with root package name */
        public static final Style f313697d;

        /* renamed from: e, reason: collision with root package name */
        public static final Style f313698e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Style[] f313699f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f313700g;

        static {
            Style style = new Style("BLUE", 0);
            f313695b = style;
            Style style2 = new Style("VIOLET", 1);
            f313696c = style2;
            Style style3 = new Style("RED", 2);
            f313697d = style3;
            Style style4 = new Style("GREEN", 3);
            f313698e = style4;
            Style[] styleArr = {style, style2, style3, style4};
            f313699f = styleArr;
            f313700g = kotlin.enums.c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f313699f.clone();
        }
    }

    /* compiled from: PanelCardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PanelCardItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem$b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        PrintableText getText();
    }

    boolean L1();

    @Y61.k
    Style N0();

    int a1();

    @Y61.k
    HyphenationFrequency b2();

    @Y61.k
    PrintableText getSubtitle();

    @Y61.k
    PrintableText getTitle();

    @Y61.k
    com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a l1();

    @Y61.l
    b p1();

    @Y61.l
    String x0();
}
