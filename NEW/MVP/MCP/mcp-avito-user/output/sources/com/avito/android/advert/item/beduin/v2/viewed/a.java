package com.avito.android.advert.item.beduin.v2.viewed;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import kotlin.Metadata;

/* compiled from: ViewedTagComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/viewed/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/advert/item/beduin/v2/viewed/g;", "Lcom/avito/android/lib/design/text_view/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC36333c<g, com.avito.android.lib.design.text_view.a> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.d f73378m;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k com.avito.android.advert.viewed.d dVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f73378m = dVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, g gVar) {
        D6.G((com.avito.android.lib.design.text_view.a) view, this.f73378m.a(gVar.f73384a));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        com.avito.android.lib.design.text_view.a aVar = (com.avito.android.lib.design.text_view.a) C0.b(viewGroup, R.layout.viewed_tag, viewGroup, false);
        D6.w(aVar);
        return aVar;
    }
}
