package com.avito.android.advert.item.leadauto;

import android.view.ContextThemeWrapper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f77293m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, ContextThemeWrapper contextThemeWrapper) {
        super(1);
        this.f77292l = dVar;
        this.f77293m = contextThemeWrapper;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        int i12 = d.f77271f;
        com.avito.android.util.concurrent.b.a(new k(this.f77292l, th2, this.f77293m));
        return G0.f406611a;
    }
}
