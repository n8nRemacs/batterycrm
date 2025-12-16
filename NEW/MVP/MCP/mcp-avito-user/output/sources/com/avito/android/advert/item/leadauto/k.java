package com.avito.android.advert.item.leadauto;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f77295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f77296n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, Throwable th2, ContextThemeWrapper contextThemeWrapper) {
        super(0);
        this.f77294l = dVar;
        this.f77295m = th2;
        this.f77296n = contextThemeWrapper;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        View viewRequireView = this.f77294l.f77274d.b().requireView();
        Throwable th2 = this.f77295m;
        com.avito.android.component.toast.c.b(cVar, viewRequireView, com.avito.android.printable_text.b.f(String.valueOf(th2.getMessage())), null, null, null, new f.c(th2), 0, ToastBarPosition.f181047e, null, false, false, null, this.f77296n, 1966);
        return G0.f406611a;
    }
}
