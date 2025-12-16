package com.avito.android.bxcontent.beduin_v2.viewed;

import Y41.l;
import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import kotlin.Metadata;

/* compiled from: BxViewedTagComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/viewed/d;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/bxcontent/beduin_v2/viewed/h;", "Lcom/avito/android/lib/design/text_view/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC36333c<h, com.avito.android.lib.design.text_view.a> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final l<String, Boolean> f109546m;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super String, Boolean> lVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f109546m = lVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, h hVar) {
        ((com.avito.android.lib.design.text_view.a) view).setAlpha(this.f109546m.invoke(hVar.f109550a).booleanValue() ? 1.0f : 0.0f);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new com.avito.android.lib.design.text_view.a(new ContextThemeWrapper(viewGroup.getContext(), R.style.Design_Widget_SnippetBadge_Viewed_Redesign), null, 0, 0, 14, null);
    }
}
