package com.avito.android.serp.adapter.mini_menu;

import android.view.View;
import com.avito.android.remote.model.serp.Onboarding;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MiniMenuBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "preparedView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f270374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Onboarding f270375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Onboarding onboarding) {
        super(1);
        this.f270374l = mVar;
        this.f270375m = onboarding;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f270374l.f270385i.accept(new Q<>(view, this.f270375m));
        return G0.f406611a;
    }
}
