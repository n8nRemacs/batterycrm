package com.avito.beduin.v2.component.pager.android_view;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PagerComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f336139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.scroll_container.state.d f336140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f336141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ViewPager2 viewPager2, com.avito.beduin.v2.component.scroll_container.state.d dVar, boolean z12) {
        super(0);
        this.f336139l = viewPager2;
        this.f336140m = dVar;
        this.f336141n = z12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f336139l.g(this.f336140m.f336197e, this.f336141n);
        return G0.f406611a;
    }
}
