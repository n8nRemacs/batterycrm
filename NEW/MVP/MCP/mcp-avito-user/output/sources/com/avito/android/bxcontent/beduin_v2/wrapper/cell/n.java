package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import com.avito.android.bxcontent.beduin_v2.wrapper.cell.m;
import com.avito.android.serp.adapter.l1;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxComponentContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/n;", "Lcom/avito/beduin/v2/render/android_view/diff/e$a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f109593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<l1> f109594b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(m mVar, List<? extends l1> list) {
        this.f109593a = mVar;
        this.f109594b = list;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean a(int i12, int i13) {
        m.a aVar = (m.a) this.f109593a.f109588a.getChildAt(i12).getTag();
        l1 l1Var = this.f109594b.get(i13);
        l1 l1Var2 = aVar.f109591a;
        return l1Var2.getClass() == l1Var.getClass() && L.f(l1Var2.getF84655c(), l1Var.getF84655c());
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean b(int i12, int i13) {
        m.a aVar = (m.a) this.f109593a.f109588a.getChildAt(i12).getTag();
        return L.f(aVar.f109591a, this.f109594b.get(i13));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int c() {
        return this.f109593a.f109588a.getChildCount();
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int d() {
        return this.f109594b.size();
    }
}
