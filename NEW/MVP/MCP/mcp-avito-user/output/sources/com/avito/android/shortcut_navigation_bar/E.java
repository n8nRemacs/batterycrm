package com.avito.android.shortcut_navigation_bar;

import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f283093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C34999p c34999p, String str) {
        super(0);
        this.f283092l = c34999p;
        this.f283093m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f283092l.f283480e0.accept(new InlineFiltersGeo(this.f283093m, InlineFiltersGeo.FromPage.f283364b));
        return G0.f406611a;
    }
}
