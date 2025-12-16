package com.avito.android.serp.adapter.search_bar;

import com.avito.android.C31100l2;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class F<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34840t f271583b;

    public F(C34840t c34840t) {
        this.f271583b = c34840t;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31100l2 c31100l2;
        C34840t c34840t = this.f271583b;
        M m12 = c34840t.f271672m;
        if (m12 == null || (c31100l2 = m12.f271603d) == null) {
            return;
        }
        String strU = c34840t.f271663d.get().u();
        if (strU == null) {
            strU = "";
        }
        c31100l2.i(strU);
    }
}
