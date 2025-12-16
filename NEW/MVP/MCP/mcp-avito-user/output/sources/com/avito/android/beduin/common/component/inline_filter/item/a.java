package com.avito.android.beduin.common.component.inline_filter.item;

import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterItem.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Filter f101504b;

    public a(@Y61.k Filter filter) {
        this.f101504b = filter;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF314301b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF314301b() {
        String id2 = this.f101504b.getId();
        return id2 == null ? "" : id2;
    }
}
