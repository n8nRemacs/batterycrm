package com.avito.android.paranja;

import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParanjaManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.l<ViewTreeObserver, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f210863l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnPreDrawListener(e.f210870g);
        return G0.f406611a;
    }
}
