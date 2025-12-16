package com.avito.android.horizontal_list.items.recentSearchItem;

import Y61.k;
import android.widget.TextView;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.horizontal_list.HorizontalListWidgetListItem;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.I5;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rn0.InterfaceC47690b;

/* compiled from: HorizontalListRecentSearchItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/horizontal_list/items/recentSearchItem/c;", "LTV0/d;", "Lcom/avito/android/horizontal_list/items/recentSearchItem/f;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$RecentSearch;", "a", "b", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.d<f, HorizontalListWidgetListItem.RecentSearch> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f162592d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f162593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f162594c;

    /* compiled from: HorizontalListRecentSearchItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/horizontal_list/items/recentSearchItem/c$a;", "", "<init>", "()V", "", "COMMON_DESCRIPTION_LINES", "I", "LONG_DESCRIPTION_LINES", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HorizontalListRecentSearchItemPresenter.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/horizontal_list/items/recentSearchItem/c$b;", "", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        c a(@k h31.e<InterfaceC47690b> eVar);
    }

    static {
        new a(null);
    }

    @i31.c
    public c(@k g gVar, @InterfaceC41220a @k h31.e<InterfaceC47690b> eVar) {
        this.f162593b = gVar;
        this.f162594c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        HorizontalListWidgetListItem.RecentSearch recentSearch = (HorizontalListWidgetListItem.RecentSearch) aVar;
        TextView textView = fVar.f162600c;
        String str = recentSearch.f162555c;
        I5.a(textView, str, false);
        String str2 = recentSearch.f162556d;
        TextView textView2 = fVar.f162601d;
        textView2.setText(str2);
        I5.a(fVar.f162602e, recentSearch.f162558f, false);
        fVar.f162599b.setOnClickListener(new C(this, recentSearch, i12, 7));
        if (str == null || str.length() == 0) {
            textView2.setLines(2);
        } else {
            textView2.setLines(1);
        }
    }
}
