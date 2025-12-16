package com.avito.android.widget_filters.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.widget_filters.mvi.entity.a;
import com.avito.android.widget_filters.mvi.entity.b;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: WidgetFiltersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f330093r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final c f330094s;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f330095b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f330096c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f330097d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f330098e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<WidgetFiltersWidget> f330099f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<String, String> f330100g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final d.C10254d f330101h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final d.b f330102i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final d.a f330103j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final d.c f330104k;

    /* renamed from: l, reason: collision with root package name */
    public final int f330105l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final WidgetFiltersWidget.WidgetType f330106m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Map<Integer, WidgetFiltersWidget.WidgetType> f330107n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final WidgetFiltersToolbarViewState f330108o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final WidgetFiltersFooterViewState f330109p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final com.avito.android.widget_filters.mvi.entity.a f330110q;

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/c$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        b.f330087a.getClass();
        b.c cVar = b.a.f330089b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        Map mapC = P0.c();
        Map mapC2 = P0.c();
        WidgetFiltersToolbarViewState.f330066c.getClass();
        WidgetFiltersToolbarViewState widgetFiltersToolbarViewState = WidgetFiltersToolbarViewState.f330067d;
        WidgetFiltersFooterViewState.f329985j.getClass();
        WidgetFiltersFooterViewState widgetFiltersFooterViewState = WidgetFiltersFooterViewState.f329986k;
        com.avito.android.widget_filters.mvi.entity.a.f330076a.getClass();
        f330094s = new c(false, false, false, cVar, c42784z0, mapC, null, null, null, null, -1, null, mapC2, widgetFiltersToolbarViewState, widgetFiltersFooterViewState, a.C10252a.f330078b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, boolean z13, boolean z14, @k b bVar, @k List<? extends WidgetFiltersWidget> list, @k Map<String, String> map, @l d.C10254d c10254d, @l d.b bVar2, @l d.a aVar, @l d.c cVar, int i12, @l WidgetFiltersWidget.WidgetType widgetType, @k Map<Integer, ? extends WidgetFiltersWidget.WidgetType> map2, @k WidgetFiltersToolbarViewState widgetFiltersToolbarViewState, @k WidgetFiltersFooterViewState widgetFiltersFooterViewState, @k com.avito.android.widget_filters.mvi.entity.a aVar2) {
        this.f330095b = z12;
        this.f330096c = z13;
        this.f330097d = z14;
        this.f330098e = bVar;
        this.f330099f = list;
        this.f330100g = map;
        this.f330101h = c10254d;
        this.f330102i = bVar2;
        this.f330103j = aVar;
        this.f330104k = cVar;
        this.f330105l = i12;
        this.f330106m = widgetType;
        this.f330107n = map2;
        this.f330108o = widgetFiltersToolbarViewState;
        this.f330109p = widgetFiltersFooterViewState;
        this.f330110q = aVar2;
    }

    public static c a(c cVar, boolean z12, boolean z13, boolean z14, b bVar, ArrayList arrayList, Map map, d.C10254d c10254d, d.b bVar2, d.a aVar, d.c cVar2, int i12, WidgetFiltersWidget.WidgetType widgetType, LinkedHashMap linkedHashMap, WidgetFiltersToolbarViewState widgetFiltersToolbarViewState, WidgetFiltersFooterViewState widgetFiltersFooterViewState, com.avito.android.widget_filters.mvi.entity.a aVar2, int i13) {
        boolean z15 = (i13 & 1) != 0 ? cVar.f330095b : z12;
        boolean z16 = (i13 & 2) != 0 ? cVar.f330096c : z13;
        boolean z17 = (i13 & 4) != 0 ? cVar.f330097d : z14;
        b bVar3 = (i13 & 8) != 0 ? cVar.f330098e : bVar;
        List<WidgetFiltersWidget> list = (i13 & 16) != 0 ? cVar.f330099f : arrayList;
        Map map2 = (i13 & 32) != 0 ? cVar.f330100g : map;
        d.C10254d c10254d2 = (i13 & 64) != 0 ? cVar.f330101h : c10254d;
        d.b bVar4 = (i13 & 128) != 0 ? cVar.f330102i : bVar2;
        d.a aVar3 = (i13 & 256) != 0 ? cVar.f330103j : aVar;
        d.c cVar3 = (i13 & 512) != 0 ? cVar.f330104k : cVar2;
        int i14 = (i13 & 1024) != 0 ? cVar.f330105l : i12;
        WidgetFiltersWidget.WidgetType widgetType2 = (i13 & 2048) != 0 ? cVar.f330106m : widgetType;
        Map<Integer, WidgetFiltersWidget.WidgetType> map3 = (i13 & 4096) != 0 ? cVar.f330107n : linkedHashMap;
        WidgetFiltersToolbarViewState widgetFiltersToolbarViewState2 = (i13 & 8192) != 0 ? cVar.f330108o : widgetFiltersToolbarViewState;
        WidgetFiltersFooterViewState widgetFiltersFooterViewState2 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f330109p : widgetFiltersFooterViewState;
        com.avito.android.widget_filters.mvi.entity.a aVar4 = (i13 & 32768) != 0 ? cVar.f330110q : aVar2;
        cVar.getClass();
        return new c(z15, z16, z17, bVar3, list, map2, c10254d2, bVar4, aVar3, cVar3, i14, widgetType2, map3, widgetFiltersToolbarViewState2, widgetFiltersFooterViewState2, aVar4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f330095b == cVar.f330095b && this.f330096c == cVar.f330096c && this.f330097d == cVar.f330097d && L.f(this.f330098e, cVar.f330098e) && L.f(this.f330099f, cVar.f330099f) && L.f(this.f330100g, cVar.f330100g) && L.f(this.f330101h, cVar.f330101h) && L.f(this.f330102i, cVar.f330102i) && L.f(this.f330103j, cVar.f330103j) && L.f(this.f330104k, cVar.f330104k) && this.f330105l == cVar.f330105l && this.f330106m == cVar.f330106m && L.f(this.f330107n, cVar.f330107n) && L.f(this.f330108o, cVar.f330108o) && L.f(this.f330109p, cVar.f330109p) && L.f(this.f330110q, cVar.f330110q);
    }

    public final int hashCode() {
        int iC2 = AK.c.c(H.e((this.f330098e.hashCode() + r.i(r.i(Boolean.hashCode(this.f330095b) * 31, 31, this.f330096c), 31, this.f330097d)) * 31, 31, this.f330099f), 31, this.f330100g);
        d.C10254d c10254d = this.f330101h;
        int iHashCode = (iC2 + (c10254d == null ? 0 : c10254d.hashCode())) * 31;
        d.b bVar = this.f330102i;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d.a aVar = this.f330103j;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d.c cVar = this.f330104k;
        int iE2 = r.e(this.f330105l, (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        WidgetFiltersWidget.WidgetType widgetType = this.f330106m;
        return this.f330110q.hashCode() + ((this.f330109p.hashCode() + ((this.f330108o.hashCode() + AK.c.c((iE2 + (widgetType != null ? widgetType.hashCode() : 0)) * 31, 31, this.f330107n)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "WidgetFiltersState(isKeyboardVisible=" + this.f330095b + ", isValidationError=" + this.f330096c + ", isLandscape=" + this.f330097d + ", loadingState=" + this.f330098e + ", widgets=" + this.f330099f + ", parameters=" + this.f330100g + ", locationWidgetState=" + this.f330101h + ", datesWidgetState=" + this.f330102i + ", categoryWidgetState=" + this.f330103j + ", guestsWidgetState=" + this.f330104k + ", currentExpandedWidgetPosition=" + this.f330105l + ", currentExpandedWidgetType=" + this.f330106m + ", currentWidgetPositions=" + this.f330107n + ", toolbarViewState=" + this.f330108o + ", footerViewState=" + this.f330109p + ", coreViewState=" + this.f330110q + ')';
    }
}
