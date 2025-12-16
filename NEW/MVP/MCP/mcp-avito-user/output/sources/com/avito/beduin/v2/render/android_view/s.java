package com.avito.beduin.v2.render.android_view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContainerHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/s;", "Lcom/avito/beduin/v2/engine/component/d;", "T", "Lcom/avito/beduin/v2/render/android_view/C;", "a", "b", "c", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s<T extends InterfaceC36244d> implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f338003a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36336f f338004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f338005c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c<T> f338006d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338007e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final r<T> f338008f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final B f338009g;

    /* compiled from: ContainerHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/s$a;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.k f338010a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final T f338011b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final x f338012c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k InterfaceC36244d interfaceC36244d, @Y61.k x xVar) {
            this.f338010a = kVar;
            this.f338011b = interfaceC36244d;
            this.f338012c = xVar;
        }
    }

    /* compiled from: ContainerHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/s$b;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        View a(int i12);

        int b();

        void c(int i12, int i13);

        void d(@Y61.k View view, int i12, @Y61.k ViewGroup.LayoutParams layoutParams);

        @Y61.k
        /* renamed from: e */
        ViewGroup getF338001a();

        @Y61.k
        Resources f();

        void g(int i12);
    }

    /* compiled from: ContainerHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/s$c;", "T", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<T> {
        boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2);

        @Y61.k
        ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, @Y61.k Resources resources);

        boolean h(InterfaceC36244d interfaceC36244d);
    }

    public s(@Y61.k A a12, @Y61.k C36336f c36336f, @Y61.k b bVar, @Y61.k c<T> cVar, int i12, @Y61.l r<T> rVar) {
        this.f338003a = a12;
        this.f338004b = c36336f;
        this.f338005c = bVar;
        this.f338006d = cVar;
        this.f338007e = i12;
        this.f338008f = rVar;
        this.f338009g = new B(null, 1, null);
    }

    public static void a(Y41.l lVar, s sVar, com.avito.beduin.v2.theme.k kVar, List list) {
        t tVar = new t(lVar);
        sVar.getClass();
        com.avito.beduin.v2.render.android_view.diff.h hVarA = e.b.a(com.avito.beduin.v2.render.android_view.diff.e.f337969a, new v(tVar, sVar, kVar, list));
        B b12 = sVar.f338009g;
        Bundle bundle = b12.f337911a;
        b12.f337911a = null;
        com.avito.beduin.v2.render.android_view.diff.h.a(hVarA, new u(list, sVar, kVar, lVar, bundle));
    }

    @Override // com.avito.beduin.v2.render.android_view.C
    @Y61.l
    public final Bundle H() {
        Bundle bundle = new Bundle();
        b bVar = this.f338005c;
        int iB2 = bVar.b();
        for (int i12 = 0; i12 < iB2; i12++) {
            Bundle bundleB = ((a) bVar.a(i12).getTag(this.f338007e)).f338012c.b();
            if (bundleB != null) {
                bundle.putAll(bundleB);
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // com.avito.beduin.v2.render.android_view.C
    public final void b(@Y61.k Bundle bundle) {
        this.f338009g.f337911a = bundle;
    }

    public s(@Y61.k A a12, @Y61.k C36336f c36336f, @Y61.k ViewGroup viewGroup, @Y61.k c<T> cVar, int i12, @Y61.l r<T> rVar) {
        this(a12, c36336f, new C36342l(viewGroup), cVar, i12, rVar);
    }
}
