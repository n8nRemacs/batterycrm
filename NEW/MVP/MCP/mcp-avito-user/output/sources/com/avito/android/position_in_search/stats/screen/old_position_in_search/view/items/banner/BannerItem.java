package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "Button", "a", "b", "Style", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BannerItem implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f220856c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f220857d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f220858e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Style f220859f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<String, G0> f220860g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f220861h;

    /* compiled from: BannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$Button;", "", "Style", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f220862a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Style f220863b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Y41.l<String, G0> f220864c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BannerItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$Button$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            /* renamed from: b, reason: collision with root package name */
            public static final Style f220865b;

            /* renamed from: c, reason: collision with root package name */
            public static final Style f220866c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Style[] f220867d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f220868e;

            static {
                Style style = new Style("PRIMARY", 0);
                f220865b = style;
                Style style2 = new Style("SECONDARY", 1);
                f220866c = style2;
                Style[] styleArr = {style, style2};
                f220867d = styleArr;
                f220868e = kotlin.enums.c.a(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f220867d.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Button(@k PrintableText printableText, @k Style style, @k Y41.l<? super String, G0> lVar) {
            this.f220862a = printableText;
            this.f220863b = style;
            this.f220864c = lVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f220862a, button.f220862a) && this.f220863b == button.f220863b && L.f(this.f220864c, button.f220864c);
        }

        public final int hashCode() {
            return this.f220864c.hashCode() + ((this.f220863b.hashCode() + (this.f220862a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f220862a);
            sb2.append(", style=");
            sb2.append(this.f220863b);
            sb2.append(", onClick=");
            return H.l(sb2, this.f220864c, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f220869b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f220870c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f220871d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f220872e;

        static {
            Style style = new Style("BLUE", 0);
            f220869b = style;
            Style style2 = new Style("GRAY", 1);
            f220870c = style2;
            Style[] styleArr = {style, style2};
            f220871d = styleArr;
            f220872e = kotlin.enums.c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f220871d.clone();
        }
    }

    /* compiled from: BannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f220873a;

        public a(@k ArrayList arrayList) {
            this.f220873a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f220873a.equals(((a) obj).f220873a);
        }

        public final int hashCode() {
            return this.f220873a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Payload(changes="), this.f220873a, ')');
        }
    }

    /* compiled from: BannerItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$f;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f220874a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -989356715;
            }

            @k
            public final String toString() {
                return "Button";
            }
        }

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6670b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6670b f220875a = new C6670b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6670b);
            }

            public final int hashCode() {
                return 1354209141;
            }

            @k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f220876a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -926716999;
            }

            @k
            public final String toString() {
                return "Description";
            }
        }

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f220877a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1496336730;
            }

            @k
            public final String toString() {
                return "Reloading";
            }
        }

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final e f220878a = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1369233198;
            }

            @k
            public final String toString() {
                return "Style";
            }
        }

        /* compiled from: BannerItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b$f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final f f220879a = new f();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1369824213;
            }

            @k
            public final String toString() {
                return "Title";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerItem(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @l Button button, @k Style style, @l Y41.l<? super String, G0> lVar, boolean z12) {
        this.f220855b = str;
        this.f220856c = printableText;
        this.f220857d = printableText2;
        this.f220858e = button;
        this.f220859f = style;
        this.f220860g = lVar;
        this.f220861h = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) obj;
        return L.f(this.f220855b, bannerItem.f220855b) && this.f220856c.equals(bannerItem.f220856c) && this.f220857d.equals(bannerItem.f220857d) && L.f(this.f220858e, bannerItem.f220858e) && this.f220859f == bannerItem.f220859f && L.f(this.f220860g, bannerItem.f220860g) && this.f220861h == bannerItem.f220861h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78464b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f220855b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f220857d, com.avito.android.actions_sheet.a.f(this.f220856c, this.f220855b.hashCode() * 31, 31), 31);
        Button button = this.f220858e;
        int iHashCode = (this.f220859f.hashCode() + ((iF2 + (button == null ? 0 : button.hashCode())) * 31)) * 31;
        Y41.l<String, G0> lVar = this.f220860g;
        return Boolean.hashCode(this.f220861h) + ((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerItem(stringId=");
        sb2.append(this.f220855b);
        sb2.append(", title=");
        sb2.append(this.f220856c);
        sb2.append(", description=");
        sb2.append(this.f220857d);
        sb2.append(", button=");
        sb2.append(this.f220858e);
        sb2.append(", bannerStyle=");
        sb2.append(this.f220859f);
        sb2.append(", onCloseClick=");
        sb2.append(this.f220860g);
        sb2.append(", isReloading=");
        return r.x(sb2, this.f220861h, ')');
    }
}
