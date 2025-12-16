package com.avito.beduin.v2.component.lazy_column.android_view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.lazy.g;
import com.avito.beduin.v2.component.lazy_column.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: LazyColumnComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/android_view/a;", "Lcom/avito/beduin/v2/component/common/lazy/d;", "Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "Lcom/avito/beduin/v2/component/lazy_column/android_view/a$b;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends com.avito.beduin.v2.component.common.lazy.d<a.C10406a, b> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A f335886h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C10400a f335887i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f335888j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap f335889k;

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/android_view/a$a;", "Lcom/avito/beduin/v2/component/common/lazy/g;", "Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.a$a, reason: collision with other inner class name */
    public static final class C10400a extends g<a.C10406a> {

        /* compiled from: LazyColumnComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/lazy_column/state/a$a;Lcom/avito/beduin/v2/component/lazy_column/state/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.a$a$a, reason: collision with other inner class name */
        public static final class C10401a extends N implements p<a.C10406a, a.C10406a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10401a f335890l = new C10401a();

            public C10401a() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(a.C10406a c10406a, a.C10406a c10406a2) {
                return Boolean.valueOf(L.f(c10406a.f335999a.getF336564a(), c10406a2.f335999a.getF336564a()));
            }
        }

        /* compiled from: LazyColumnComponent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/lazy_column/state/a$a;Lcom/avito/beduin/v2/component/lazy_column/state/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.a$a$b */
        public static final class b extends N implements p<a.C10406a, a.C10406a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f335891l = new b();

            public b() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(a.C10406a c10406a, a.C10406a c10406a2) {
                return Boolean.valueOf(c10406a.equals(c10406a2));
            }
        }

        public C10400a() {
            super(C10401a.f335890l, b.f335891l);
        }
    }

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/android_view/a$b;", "Lcom/avito/beduin/v2/component/common/lazy/e;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.beduin.v2.component.common.lazy.e {

        /* renamed from: d, reason: collision with root package name */
        @l
        public a.C10406a f335892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, InterfaceC36343m interfaceC36343m, a.C10406a c10406a, int i12, C42822w c42822w) {
            super(view, interfaceC36343m);
            c10406a = (i12 & 4) != 0 ? null : c10406a;
            this.f335892d = c10406a;
        }

        @Override // com.avito.beduin.v2.component.common.lazy.e
        @l
        public final String B80() {
            InterfaceC36249i interfaceC36249i;
            a.C10406a c10406a = this.f335892d;
            if (c10406a == null || (interfaceC36249i = c10406a.f335999a) == null) {
                return null;
            }
            return interfaceC36249i.getF336564a();
        }
    }

    public a(@k com.avito.beduin.v2.component.lazy_column.android_view.b bVar, @k A a12, @k C10400a c10400a) {
        super(bVar, c10400a);
        this.f335886h = a12;
        this.f335887i = c10400a;
        this.f335889k = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        int iHashCode = ((a.C10406a) getItem(i12)).f336001c.hashCode();
        this.f335889k.put(Integer.valueOf(iHashCode), Integer.valueOf(i12));
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        a.C10406a c10406a = (a.C10406a) getItem(i12);
        com.avito.beduin.v2.theme.k kVar = this.f335888j;
        InterfaceC36249i interfaceC36249i = c10406a.f335999a;
        bVar.f335692c.g(kVar, interfaceC36249i, this.f335886h.f337907c, n(interfaceC36249i.getF336564a()), null, this.f335886h);
        a.C10406a c10406a2 = bVar.f335892d;
        a.C10406a.C10407a c10407a = c10406a2 != null ? c10406a2.f336000b : null;
        a.C10406a.C10407a c10407a2 = c10406a.f336000b;
        if (!L.f(c10407a, c10407a2)) {
            View view = bVar.f335691b;
            view.setLayoutParams(ET0.d.a(c10407a2.f336002a, c10407a2.f336003b, c10407a2.f336004c, view.getResources()));
        }
        bVar.f335892d = c10406a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        InterfaceC36249i interfaceC36249i = ((a.C10406a) getItem(((Number) this.f335889k.get(Integer.valueOf(i12))).intValue())).f335999a;
        String f336566c = interfaceC36249i.getF336566c();
        A a12 = this.f335886h;
        InterfaceC36343m interfaceC36343mB = a12.a(f336566c).b(a12);
        View viewF = interfaceC36343mB.f(viewGroup, this.f335888j, interfaceC36249i, a12.f337907c, null, null, a12);
        viewF.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new b(viewF, interfaceC36343mB, null, 4, null);
    }
}
