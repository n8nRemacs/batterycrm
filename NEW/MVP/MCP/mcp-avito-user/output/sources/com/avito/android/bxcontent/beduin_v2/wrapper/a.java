package com.avito.android.bxcontent.beduin_v2.wrapper;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.serp.adapter.l1;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BxWrapperComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/k;", "Landroid/view/ViewGroup;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC36333c<k, ViewGroup> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC29127b, G0> f109551m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f109552n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final h f109553o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, C29126a.b> f109554p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f109555q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public b f109556r;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k Y41.l<? super InterfaceC29127b, G0> lVar, @Y61.k com.avito.konveyor.a aVar, @Y61.k h hVar, @Y61.k Y41.l<? super String, C29126a.b> lVar2) {
        super(null, 1, null);
        this.f109551m = lVar;
        this.f109552n = aVar;
        this.f109553o = hVar;
        this.f109554p = lVar2;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, k kVar2) {
        ViewGroup viewGroup = (ViewGroup) view;
        k kVar3 = kVar2;
        String str = kVar3.f109611a;
        C29126a.b bVar = (C29126a.b) ((e) this.f109554p).invoke(str);
        if (bVar == null) {
            l1 l1VarA = this.f109553o.a(kVar3);
            if (l1VarA == null) {
                return;
            } else {
                bVar = new C29126a.b(str, l1VarA);
            }
        }
        this.f109555q = str;
        b bVar2 = this.f109556r;
        if (bVar2 == null) {
            bVar2 = new b(viewGroup, this.f109552n);
            this.f109556r = bVar2;
        }
        bVar2.b(bVar.f112059b);
        this.f109551m.invoke(new InterfaceC29127b.InterfaceC29141h.a(bVar));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }
}
