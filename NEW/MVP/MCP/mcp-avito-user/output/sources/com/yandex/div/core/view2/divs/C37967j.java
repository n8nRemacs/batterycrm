package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.appcompat.widget.C19960l0;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.widget.menu.c;
import com.yandex.div2.DivAction;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37967j extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C37955g f368514l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C38029k f368515m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f368516n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ DivAction f368517o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.internal.widget.menu.c f368518p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37967j(C37955g c37955g, C38029k c38029k, View view, DivAction divAction, com.yandex.div.internal.widget.menu.c cVar) {
        super(0);
        this.f368514l = c37955g;
        this.f368515m = c38029k;
        this.f368516n = view;
        this.f368517o = divAction;
        this.f368518p = cVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C37955g c37955g = this.f368514l;
        DivAction divAction = this.f368517o;
        c37955g.f368382b.getClass();
        InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
        c37955g.f368383c.a(divAction, this.f368515m.getExpressionResolver());
        com.yandex.div.internal.widget.menu.c cVar = this.f368518p;
        View view = this.f368516n;
        C19960l0 c19960l0 = new C19960l0(view.getContext(), view);
        c.a aVar = cVar.f370322b;
        if (aVar != null) {
            aVar.a(c19960l0);
        }
        androidx.appcompat.view.menu.n nVar = c19960l0.f22566c;
        if (!nVar.b()) {
            if (nVar.f21903e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            nVar.e(0, 0, false, false);
        }
        return kotlin.G0.f406611a;
    }
}
