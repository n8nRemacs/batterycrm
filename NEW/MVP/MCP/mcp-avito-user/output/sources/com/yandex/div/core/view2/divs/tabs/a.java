package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import com.yandex.div2.K5;
import kotlin.Metadata;

/* compiled from: DivTabsAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/a;", "Lcom/yandex/div/internal/widget/tabs/d$g$a;", "Lcom/yandex/div2/DivTabs$f;", "Lcom/yandex/div2/DivAction;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements d.g.a<DivTabs.f, DivAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivTabs.f f368734a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DisplayMetrics f368735b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.e f368736c;

    public a(@Y61.k DivTabs.f fVar, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        this.f368734a = fVar;
        this.f368735b = displayMetrics;
        this.f368736c = eVar;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.g.b
    public final DivAction a() {
        return this.f368734a.f372128c;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.g.b
    @Y61.l
    public final Integer b() {
        K5 f376750t = this.f368734a.f372126a.a().getF376750t();
        if (f376750t instanceof K5.c) {
            return Integer.valueOf(C37931a.M(f376750t, this.f368735b, this.f368736c, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.g.b
    @Y61.k
    public final String getTitle() {
        return this.f368734a.f372127b.a(this.f368736c);
    }
}
