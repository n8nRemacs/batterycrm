package com.avito.beduin.v2.render.android_view;

import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.diff.e;
import com.avito.beduin.v2.render.android_view.s;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/v;", "Lcom/avito/beduin/v2/render/android_view/diff/e$a;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s<InterfaceC36244d> f338023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC36244d> f338024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC36244d, Object> f338025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.theme.k f338026d;

    public v(Y41.l lVar, s sVar, com.avito.beduin.v2.theme.k kVar, List list) {
        this.f338023a = sVar;
        this.f338024b = list;
        this.f338025c = lVar;
        this.f338026d = kVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean a(int i12, int i13) {
        s<InterfaceC36244d> sVar = this.f338023a;
        s.a aVar = (s.a) sVar.f338005c.a(i12).getTag(sVar.f338007e);
        InterfaceC36244d interfaceC36244d = this.f338024b.get(i13);
        t tVar = (t) this.f338025c;
        return kotlin.jvm.internal.L.f(tVar.invoke(aVar.f338011b), tVar.invoke(interfaceC36244d));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean b(int i12, int i13) {
        s<InterfaceC36244d> sVar = this.f338023a;
        s.a aVar = (s.a) sVar.f338005c.a(i12).getTag(sVar.f338007e);
        return kotlin.jvm.internal.L.f(aVar.f338011b, this.f338024b.get(i13)) && kotlin.jvm.internal.L.f(this.f338026d, aVar.f338010a);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int c() {
        return this.f338023a.f338005c.b();
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int d() {
        return this.f338024b.size();
    }
}
