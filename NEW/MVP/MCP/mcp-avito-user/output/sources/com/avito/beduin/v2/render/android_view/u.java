package com.avito.beduin.v2.render.android_view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.diff.g;
import com.avito.beduin.v2.render.android_view.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/u;", "Lcom/avito/beduin/v2/render/android_view/diff/g;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u implements com.avito.beduin.v2.render.android_view.diff.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC36244d> f338014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<InterfaceC36244d> f338015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.theme.k f338016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC36244d, InterfaceC36249i> f338017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f338018e;

    /* compiled from: ContainerHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/render/android_view/u$a", "Lcom/avito/beduin/v2/render/android_view/o;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s<InterfaceC36244d> f338019a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36244d f338020b;

        public a(s<InterfaceC36244d> sVar, InterfaceC36244d interfaceC36244d) {
            this.f338019a = sVar;
            this.f338020b = interfaceC36244d;
        }

        @Override // com.avito.beduin.v2.render.android_view.o
        public final void a(@Y61.k View view) {
            s<InterfaceC36244d> sVar = this.f338019a;
            sVar.f338008f.i(this.f338020b, view, sVar.f338006d);
        }
    }

    /* compiled from: ContainerHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/render/android_view/u$b", "Lcom/avito/beduin/v2/render/android_view/o;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s<InterfaceC36244d> f338021a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36244d f338022b;

        public b(s<InterfaceC36244d> sVar, InterfaceC36244d interfaceC36244d) {
            this.f338021a = sVar;
            this.f338022b = interfaceC36244d;
        }

        @Override // com.avito.beduin.v2.render.android_view.o
        public final void a(@Y61.k View view) {
            s<InterfaceC36244d> sVar = this.f338021a;
            sVar.f338008f.i(this.f338022b, view, sVar.f338006d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(List<InterfaceC36244d> list, s<InterfaceC36244d> sVar, com.avito.beduin.v2.theme.k kVar, Y41.l<InterfaceC36244d, ? extends InterfaceC36249i> lVar, Bundle bundle) {
        this.f338014a = list;
        this.f338015b = sVar;
        this.f338016c = kVar;
        this.f338017d = lVar;
        this.f338018e = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void a(int i12, int i13) {
        s<InterfaceC36244d> sVar = this.f338015b;
        View viewA = sVar.f338005c.a(i12);
        int i14 = sVar.f338007e;
        s.a aVar = (s.a) viewA.getTag(i14);
        InterfaceC36244d interfaceC36244d = this.f338014a.get(i13);
        s.b bVar = sVar.f338005c;
        ViewGroup f338001a = bVar.getF338001a();
        InterfaceC36249i interfaceC36249iInvoke = this.f338017d.invoke(interfaceC36244d);
        r<T> rVar = sVar.f338008f;
        a aVar2 = rVar != 0 ? new a(sVar, interfaceC36244d) : null;
        x xVar = aVar.f338012c;
        View viewA2 = xVar.a(f338001a, this.f338016c, interfaceC36249iInvoke, sVar.f338004b, this.f338018e, aVar2);
        viewA2.setTag(i14, new s.a(this.f338016c, interfaceC36244d, xVar));
        boolean zEquals = viewA.equals(viewA2);
        s.c<T> cVar = sVar.f338006d;
        if (!zEquals) {
            bVar.g(i12);
            bVar.d(viewA2, i12, cVar.d(interfaceC36244d, bVar.f()));
        } else if (!cVar.c(aVar.f338011b, interfaceC36244d)) {
            viewA2.setLayoutParams(cVar.d(interfaceC36244d, bVar.f()));
        }
        if (rVar != 0) {
            rVar.i(interfaceC36244d, viewA2, cVar);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void b(int i12, int i13) {
        this.f338015b.f338005c.c(i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void c(int i12, int i13) {
        InterfaceC36244d interfaceC36244d = this.f338014a.get(i13);
        s<InterfaceC36244d> sVar = this.f338015b;
        x xVar = new x(sVar.f338003a);
        s.b bVar = sVar.f338005c;
        ViewGroup f338001a = bVar.getF338001a();
        InterfaceC36249i interfaceC36249iInvoke = this.f338017d.invoke(interfaceC36244d);
        r<T> rVar = sVar.f338008f;
        View viewA = xVar.a(f338001a, this.f338016c, interfaceC36249iInvoke, sVar.f338004b, this.f338018e, rVar != 0 ? new b(sVar, interfaceC36244d) : null);
        viewA.setTag(sVar.f338007e, new s.a(this.f338016c, interfaceC36244d, xVar));
        Resources resourcesF = bVar.f();
        s.c<T> cVar = sVar.f338006d;
        bVar.d(viewA, i12, cVar.d(interfaceC36244d, resourcesF));
        if (rVar != 0) {
            rVar.i(interfaceC36244d, viewA, cVar);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void d(int i12, int i13) {
        s<InterfaceC36244d> sVar = this.f338015b;
        View viewA = sVar.f338005c.a(i12);
        s.b bVar = sVar.f338005c;
        bVar.g(i12);
        bVar.d(viewA, i13, viewA.getLayoutParams());
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void e(int i12, @Y61.k ArrayList arrayList) {
        g.a.a(this, i12, arrayList);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void f(int i12, @Y61.k ArrayList arrayList) {
        g.a.b(this, i12, arrayList);
    }
}
