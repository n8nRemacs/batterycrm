package com.avito.android.advert.item.leadauto;

import android.view.ContextThemeWrapper;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f77298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f77299n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, String str, ContextThemeWrapper contextThemeWrapper) {
        super(0);
        this.f77297l = dVar;
        this.f77298m = str;
        this.f77299n = contextThemeWrapper;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f77297l.f77274d.b().requireView(), com.avito.android.printable_text.b.f(this.f77298m), null, null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, null, false, false, null, this.f77299n, 1966);
        return G0.f406611a;
    }
}
