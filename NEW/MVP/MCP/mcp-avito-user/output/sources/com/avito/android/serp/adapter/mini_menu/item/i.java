package com.avito.android.serp.adapter.mini_menu.item;

import com.avito.android.serp.adapter.mini_menu.m;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MiniMenuElementPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f270364l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MiniMenuItem f270365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f270366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, MiniMenuItem miniMenuItem, int i12) {
        super(0);
        this.f270364l = jVar;
        this.f270365m = miniMenuItem;
        this.f270366n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.mini_menu.i iVar = this.f270364l.f270368c;
        if (iVar != null) {
            m mVar = iVar.f270339a;
            int i12 = this.f270366n + 1;
            MiniMenuItem miniMenuItem = this.f270365m;
            mVar.f270381e.b(i12, miniMenuItem.f270347c);
            d.a.a(mVar.f270381e, Integer.valueOf(iVar.f270340b), "servicesMenuWidget", null, null, Integer.valueOf(i12), null, null, iVar.f270341c, 108);
            mVar.f270382f.accept(miniMenuItem);
        }
        return G0.f406611a;
    }
}
