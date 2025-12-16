package com.avito.android.select.collapsable_chips;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CollapsableChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/collapsable_chips/g;", "", "T", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g<T> implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f265373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, G0> f265374c;

    public g(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        this.f265373b = arrayList;
        this.f265374c = lVar;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return 2110197818;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF266834b() {
        return "collapsable_chips";
    }
}
