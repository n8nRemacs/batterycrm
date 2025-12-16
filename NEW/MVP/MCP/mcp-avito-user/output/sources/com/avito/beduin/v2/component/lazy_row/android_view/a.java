package com.avito.beduin.v2.component.lazy_row.android_view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.lazy.d;
import com.avito.beduin.v2.component.common.lazy.e;
import com.avito.beduin.v2.component.common.lazy.g;
import com.avito.beduin.v2.component.lazy_row.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: LazyRowComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/android_view/a;", "Lcom/avito/beduin/v2/component/common/lazy/d;", "Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "Lcom/avito/beduin/v2/component/lazy_row/android_view/a$b;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends d<a.C10413a, b> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A f336025h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C10409a f336026i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f336027j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap f336028k;

    /* compiled from: LazyRowComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/android_view/a$a;", "Lcom/avito/beduin/v2/component/common/lazy/g;", "Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.lazy_row.android_view.a$a, reason: collision with other inner class name */
    public static final class C10409a extends g<a.C10413a> {

        /* compiled from: LazyRowComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/lazy_row/state/a$a;Lcom/avito/beduin/v2/component/lazy_row/state/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.lazy_row.android_view.a$a$a, reason: collision with other inner class name */
        public static final class C10410a extends N implements p<a.C10413a, a.C10413a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10410a f336029l = new C10410a();

            public C10410a() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(a.C10413a c10413a, a.C10413a c10413a2) {
                return Boolean.valueOf(L.f(c10413a.f336078a.getF336564a(), c10413a2.f336078a.getF336564a()));
            }
        }

        /* compiled from: LazyRowComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/lazy_row/state/a$a;Lcom/avito/beduin/v2/component/lazy_row/state/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.lazy_row.android_view.a$a$b */
        public static final class b extends N implements p<a.C10413a, a.C10413a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f336030l = new b();

            public b() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(a.C10413a c10413a, a.C10413a c10413a2) {
                return Boolean.valueOf(c10413a.equals(c10413a2));
            }
        }

        public C10409a() {
            super(C10410a.f336029l, b.f336030l);
        }
    }

    /* compiled from: LazyRowComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/android_view/a$b;", "Lcom/avito/beduin/v2/component/common/lazy/e;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends e {

        /* renamed from: d, reason: collision with root package name */
        @l
        public a.C10413a f336031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, InterfaceC36343m interfaceC36343m, a.C10413a c10413a, int i12, C42822w c42822w) {
            super(view, interfaceC36343m);
            c10413a = (i12 & 4) != 0 ? null : c10413a;
            this.f336031d = c10413a;
        }

        @Override // com.avito.beduin.v2.component.common.lazy.e
        @l
        public final String B80() {
            InterfaceC36249i interfaceC36249i;
            a.C10413a c10413a = this.f336031d;
            if (c10413a == null || (interfaceC36249i = c10413a.f336078a) == null) {
                return null;
            }
            return interfaceC36249i.getF336564a();
        }
    }

    public a(@k LazyRowComponent lazyRowComponent, @k A a12, @k C10409a c10409a) {
        super(lazyRowComponent, c10409a);
        this.f336025h = a12;
        this.f336026i = c10409a;
        this.f336028k = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        int iHashCode = ((a.C10413a) getItem(i12)).f336080c.hashCode();
        this.f336028k.put(Integer.valueOf(iHashCode), Integer.valueOf(i12));
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        a.C10413a c10413a = (a.C10413a) getItem(i12);
        com.avito.beduin.v2.theme.k kVar = this.f336027j;
        InterfaceC36249i interfaceC36249i = c10413a.f336078a;
        bVar.f335692c.g(kVar, interfaceC36249i, this.f336025h.f337907c, n(interfaceC36249i.getF336564a()), null, this.f336025h);
        a.C10413a c10413a2 = bVar.f336031d;
        a.C10413a.C10414a c10414a = c10413a2 != null ? c10413a2.f336079b : null;
        a.C10413a.C10414a c10414a2 = c10413a.f336079b;
        if (!L.f(c10414a, c10414a2)) {
            View view = bVar.f335691b;
            view.setLayoutParams(ET0.d.a(c10414a2.f336081a, c10414a2.f336082b, c10414a2.f336083c, view.getResources()));
        }
        bVar.f336031d = c10413a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        InterfaceC36249i interfaceC36249i = ((a.C10413a) getItem(((Number) this.f336028k.get(Integer.valueOf(i12))).intValue())).f336078a;
        String f336566c = interfaceC36249i.getF336566c();
        A a12 = this.f336025h;
        InterfaceC36343m interfaceC36343mB = a12.a(f336566c).b(a12);
        View viewF = interfaceC36343mB.f(viewGroup, this.f336027j, interfaceC36249i, a12.f337907c, null, null, a12);
        viewF.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new b(viewF, interfaceC36343mB, null, 4, null);
    }
}
