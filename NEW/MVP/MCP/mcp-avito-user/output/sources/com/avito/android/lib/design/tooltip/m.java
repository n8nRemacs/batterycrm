package com.avito.android.lib.design.tooltip;

import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m extends N implements Y41.l<ViewTreeObserver, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f181233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(1);
        this.f181233l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnPreDrawListener(this.f181233l.f181226l);
        return G0.f406611a;
    }
}
