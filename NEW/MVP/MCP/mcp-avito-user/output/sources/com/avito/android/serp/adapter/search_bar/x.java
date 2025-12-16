package com.avito.android.serp.adapter.search_bar;

import com.avito.android.C31100l2;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "str", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34840t f271692b;

    public x(C34840t c34840t) {
        this.f271692b = c34840t;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31100l2 c31100l2;
        String str = (String) obj;
        C34840t c34840t = this.f271692b;
        M m12 = c34840t.f271672m;
        if (m12 != null && (c31100l2 = m12.f271603d) != null) {
            c31100l2.k();
        }
        c34840t.f271663d.get().e(str, c34840t.f271678s);
    }
}
