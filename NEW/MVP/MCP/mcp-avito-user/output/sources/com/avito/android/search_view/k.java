package com.avito.android.search_view;

import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchViewConfigs.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_view/k;", "", "a", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f264557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f264558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f264559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ThemeAppearance f264560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f264561e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f264562f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f264563g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final NavigationBarStyle.DisplayType f264564h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f264565i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ToolbarShareButton f264566j;

    /* compiled from: SearchViewConfigs.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/k$a;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f264567a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f264568b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f264569c;

        public a(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.k UniversalColor universalColor3) {
            this.f264567a = universalColor;
            this.f264568b = universalColor2;
            this.f264569c = universalColor3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f264567a, aVar.f264567a) && L.f(this.f264568b, aVar.f264568b) && L.f(this.f264569c, aVar.f264569c);
        }

        public final int hashCode() {
            return this.f264569c.hashCode() + com.avito.android.actions_sheet.a.i(this.f264568b, this.f264567a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchBarStyle(backgroundColor=");
            sb2.append(this.f264567a);
            sb2.append(", pressedBackgroundColor=");
            sb2.append(this.f264568b);
            sb2.append(", hintColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f264569c, ')');
        }
    }

    public k(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.k UniversalColor universalColor3, @Y61.k ThemeAppearance themeAppearance, @Y61.k a aVar, @Y61.l String str, boolean z12, @Y61.l NavigationBarStyle.DisplayType displayType, boolean z13, @Y61.l ToolbarShareButton toolbarShareButton) {
        this.f264557a = universalColor;
        this.f264558b = universalColor2;
        this.f264559c = universalColor3;
        this.f264560d = themeAppearance;
        this.f264561e = aVar;
        this.f264562f = str;
        this.f264563g = z12;
        this.f264564h = displayType;
        this.f264565i = z13;
        this.f264566j = toolbarShareButton;
    }
}
