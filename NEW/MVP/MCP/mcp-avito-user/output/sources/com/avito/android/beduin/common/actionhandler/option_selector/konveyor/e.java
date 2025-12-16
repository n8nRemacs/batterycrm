package com.avito.android.beduin.common.actionhandler.option_selector.konveyor;

import Y41.l;
import Y61.k;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: OptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/e;", "LTV0/d;", "Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/f;", "Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a, G0> f100333b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super a, G0> lVar) {
        this.f100333b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        ListItemCheckmark listItemCheckmark = fVar.f100334b;
        listItemCheckmark.setTag(aVar2.f100325b);
        listItemCheckmark.setTitle(aVar2.f100327d);
        listItemCheckmark.setChecked(aVar2.f100326c);
        listItemCheckmark.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(17, new d(this, aVar2), fVar));
    }
}
