package com.avito.android.delivery_common;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: RecyclerViews.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<ViewPropertyAnimator> f135009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f135010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0.h hVar, View view) {
        super(0);
        this.f135009l = hVar;
        this.f135010m = view;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, android.view.ViewPropertyAnimator] */
    @Override // Y41.a
    public final G0 invoke() {
        l0.h<ViewPropertyAnimator> hVar = this.f135009l;
        ViewPropertyAnimator viewPropertyAnimator = hVar.f406842b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        View view = this.f135010m;
        hVar.f406842b = view.animate().setDuration(150L).alpha(0.0f).withEndAction(new U(view, 1)).withEndAction(new c(hVar, 1));
        return G0.f406611a;
    }
}
