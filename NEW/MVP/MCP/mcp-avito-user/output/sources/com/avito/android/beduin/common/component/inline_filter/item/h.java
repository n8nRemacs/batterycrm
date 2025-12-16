package com.avito.android.beduin.common.component.inline_filter.item;

import TV0.g;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import kotlin.Metadata;

/* compiled from: InlineFilterItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/h;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/inline_filter/item/k;", "Lcom/avito/android/beduin/common/component/inline_filter/item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements TV0.b<k, a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f101519a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f101520b;

    public h(@Y61.k m mVar, @Y61.l BeduinComponentTheme beduinComponentTheme) {
        this.f101519a = mVar;
        this.f101520b = new g.a<>(beduinComponentTheme == BeduinComponentTheme.AVITO_RE_23 ? R.layout.item_inline_filter_re23 : R.layout.item_inline_filter, g.f101518l);
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<k, a> a() {
        return this.f101519a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f101520b;
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
            if ((widget != null ? widget.getType() : null) != WidgetType.Chips) {
                return true;
            }
        }
        return false;
    }
}
