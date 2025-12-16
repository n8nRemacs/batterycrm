package com.avito.android.serp.adapter.search_bar;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.search_bar.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34827f extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34840t f271636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34827f(C34840t c34840t) {
        super(1);
        this.f271636l = c34840t;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C34840t c34840t = this.f271636l;
        h31.e<InterfaceC34825d> eVar = c34840t.f271663d;
        if (iIntValue == R.id.menu_subscription) {
            M m12 = c34840t.f271672m;
            if (m12 != null) {
                m12.H80();
            }
            eVar.get().p(null);
        } else if (iIntValue == R.id.menu_clarify) {
            eVar.get().t();
        }
        return G0.f406611a;
    }
}
