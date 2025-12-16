package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: StatDescriptionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/f;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221188b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f221189c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f221190d;

    public a(@k PrintableText printableText, @k PrintableText printableText2, @k String str) {
        this.f221188b = str;
        this.f221189c = printableText;
        this.f221190d = printableText2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF221130b() {
        return this.f221188b;
    }
}
