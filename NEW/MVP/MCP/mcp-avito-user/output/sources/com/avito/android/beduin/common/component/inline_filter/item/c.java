package com.avito.android.beduin.common.component.inline_filter.item;

import TV0.g;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import kotlin.Metadata;

/* compiled from: InlineFilterChipsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/c;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/inline_filter/item/d;", "Lcom/avito/android/beduin/common/component/inline_filter/item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.b<d, a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f101506a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final BeduinComponentTheme f101507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f101508c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<d> f101509d = new g.a<>(R.layout.item_inline_filter_chips, new b(this));

    public c(@Y61.k f fVar, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l Integer num) {
        this.f101506a = fVar;
        this.f101507b = beduinComponentTheme;
        this.f101508c = num;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<d, a> a() {
        return this.f101506a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<d> b() {
        return this.f101509d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof a) {
            Filter.Widget widget = ((a) aVar).f101504b.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Chips) {
                return true;
            }
        }
        return false;
    }
}
