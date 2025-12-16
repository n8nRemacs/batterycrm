package com.avito.android.blueprints.withSuggestedOptions;

import Y41.p;
import Y61.k;
import com.avito.android.blueprints.withSuggestedOptions.e;
import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectWithSuggestedOptionsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/withSuggestedOptions/h;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<com.avito.android.lib.design.chips.h, Boolean, G0> f106787a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(p<? super com.avito.android.lib.design.chips.h, ? super Boolean, G0> pVar) {
        this.f106787a = pVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        ((e.a) this.f106787a).invoke(hVar, Boolean.FALSE);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k com.avito.android.lib.design.chips.h hVar) {
        ((e.a) this.f106787a).invoke(hVar, Boolean.TRUE);
    }
}
