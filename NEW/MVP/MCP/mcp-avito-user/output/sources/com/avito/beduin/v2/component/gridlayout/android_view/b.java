package com.avito.beduin.v2.component.gridlayout.android_view;

import ET0.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.gridlayout.state.c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GridLayoutComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/b;", "Lcom/avito/beduin/v2/component/common/lazy/d;", "Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "Lcom/avito/beduin/v2/component/gridlayout/android_view/b$b;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.beduin.v2.component.common.lazy.d<c.a, C10396b> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A f335764h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a f335765i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f335766j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap f335767k;

    /* compiled from: GridLayoutComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/b$a;", "Lcom/avito/beduin/v2/component/common/lazy/g;", "Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.beduin.v2.component.common.lazy.g<c.a> {

        /* compiled from: GridLayoutComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/gridlayout/state/c$a;Lcom/avito/beduin/v2/component/gridlayout/state/c$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.gridlayout.android_view.b$a$a, reason: collision with other inner class name */
        public static final class C10394a extends N implements p<c.a, c.a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10394a f335768l = new C10394a();

            public C10394a() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(c.a aVar, c.a aVar2) {
                return Boolean.valueOf(L.f(aVar.f335853a.getF336564a(), aVar2.f335853a.getF336564a()));
            }
        }

        /* compiled from: GridLayoutComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/gridlayout/state/c$a;Lcom/avito/beduin/v2/component/gridlayout/state/c$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.gridlayout.android_view.b$a$b, reason: collision with other inner class name */
        public static final class C10395b extends N implements p<c.a, c.a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10395b f335769l = new C10395b();

            public C10395b() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(c.a aVar, c.a aVar2) {
                return Boolean.valueOf(aVar.equals(aVar2));
            }
        }

        public a() {
            super(C10394a.f335768l, C10395b.f335769l);
        }
    }

    /* compiled from: GridLayoutComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/b$b;", "Lcom/avito/beduin/v2/component/common/lazy/e;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.gridlayout.android_view.b$b, reason: collision with other inner class name */
    public static final class C10396b extends com.avito.beduin.v2.component.common.lazy.e {

        /* renamed from: d, reason: collision with root package name */
        @l
        public c.a f335770d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10396b(View view, InterfaceC36343m interfaceC36343m, c.a aVar, int i12, C42822w c42822w) {
            super(view, interfaceC36343m);
            aVar = (i12 & 4) != 0 ? null : aVar;
            this.f335770d = aVar;
        }

        @Override // com.avito.beduin.v2.component.common.lazy.e
        @l
        public final String B80() {
            InterfaceC36249i interfaceC36249i;
            c.a aVar = this.f335770d;
            if (aVar == null || (interfaceC36249i = aVar.f335853a) == null) {
                return null;
            }
            return interfaceC36249i.getF336564a();
        }
    }

    public b(@k e eVar, @k A a12, @k a aVar) {
        super(eVar, aVar);
        this.f335764h = a12;
        this.f335765i = aVar;
        this.f335767k = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        int iHashCode = ((c.a) getItem(i12)).f335855c.hashCode();
        this.f335767k.put(Integer.valueOf(iHashCode), Integer.valueOf(i12));
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C10396b c10396b = (C10396b) c12;
        c.a aVar = (c.a) getItem(i12);
        com.avito.beduin.v2.theme.k kVar = this.f335766j;
        InterfaceC36249i interfaceC36249i = aVar.f335853a;
        c10396b.f335692c.g(kVar, interfaceC36249i, this.f335764h.f337907c, n(interfaceC36249i.getF336564a()), null, this.f335764h);
        c.a aVar2 = c10396b.f335770d;
        c.a.C10399a c10399a = aVar2 != null ? aVar2.f335854b : null;
        c.a.C10399a c10399a2 = aVar.f335854b;
        boolean zF2 = L.f(c10399a, c10399a2);
        View view = c10396b.f335691b;
        if (!zF2) {
            view.setLayoutParams(ET0.d.a(c10399a2.f335856a, c10399a2.f335857b, c10399a2.f335858c, view.getResources()));
        }
        view.addOnLayoutChangeListener(new j(1));
        c10396b.f335770d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        InterfaceC36249i interfaceC36249i = ((c.a) getItem(((Number) this.f335767k.get(Integer.valueOf(i12))).intValue())).f335853a;
        String f336566c = interfaceC36249i.getF336566c();
        A a12 = this.f335764h;
        InterfaceC36343m interfaceC36343mB = a12.a(f336566c).b(a12);
        View viewF = interfaceC36343mB.f(viewGroup, this.f335766j, interfaceC36249i, a12.f337907c, null, null, a12);
        viewF.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new C10396b(viewF, interfaceC36343mB, null, 4, null);
    }
}
