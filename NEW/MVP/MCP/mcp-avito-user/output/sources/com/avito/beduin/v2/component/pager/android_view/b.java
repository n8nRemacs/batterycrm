package com.avito.beduin.v2.component.pager.android_view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.scroll_container.state.d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PagerAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/pager/android_view/b;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "Lcom/avito/beduin/v2/component/pager/android_view/b$b;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends B<d.a, C10419b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A f336115e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f336116f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f336117g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashMap f336118h;

    /* renamed from: i, reason: collision with root package name */
    public int f336119i;

    /* renamed from: j, reason: collision with root package name */
    public int f336120j;

    /* renamed from: k, reason: collision with root package name */
    public int f336121k;

    /* renamed from: l, reason: collision with root package name */
    public int f336122l;

    /* compiled from: PagerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/pager/android_view/b$a;", "Lcom/avito/beduin/v2/component/common/lazy/g;", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.beduin.v2.component.common.lazy.g<d.a> {

        /* compiled from: PagerAdapter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/scroll_container/state/d$a;Lcom/avito/beduin/v2/component/scroll_container/state/d$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.pager.android_view.b$a$a, reason: collision with other inner class name */
        public static final class C10417a extends N implements p<d.a, d.a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10417a f336123l = new C10417a();

            public C10417a() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(d.a aVar, d.a aVar2) {
                return Boolean.valueOf(L.f(aVar.f336204a.getF336564a(), aVar2.f336204a.getF336564a()));
            }
        }

        /* compiled from: PagerAdapter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "oldItem", "newItem", "", "invoke", "(Lcom/avito/beduin/v2/component/scroll_container/state/d$a;Lcom/avito/beduin/v2/component/scroll_container/state/d$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.pager.android_view.b$a$b, reason: collision with other inner class name */
        public static final class C10418b extends N implements p<d.a, d.a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10418b f336124l = new C10418b();

            public C10418b() {
                super(2);
            }

            @Override // Y41.p
            public final Boolean invoke(d.a aVar, d.a aVar2) {
                return Boolean.valueOf(aVar.equals(aVar2));
            }
        }

        public a() {
            super(C10417a.f336123l, C10418b.f336124l);
        }
    }

    /* compiled from: PagerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/pager/android_view/b$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.pager.android_view.b$b, reason: collision with other inner class name */
    public static final class C10419b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f336125b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC36343m f336126c;

        public C10419b(View view, InterfaceC36343m interfaceC36343m, d.a aVar, int i12, C42822w c42822w) {
            super(view);
            this.f336125b = view;
            this.f336126c = interfaceC36343m;
        }
    }

    public b(@k A a12, @k a aVar) {
        super(aVar);
        this.f336115e = a12;
        this.f336116f = aVar;
        this.f336118h = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        int iHashCode = getItem(i12).f336204a.getF336566c().hashCode();
        this.f336118h.put(Integer.valueOf(iHashCode), Integer.valueOf(i12));
        return iHashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C10419b c10419b = (C10419b) c12;
        d.a item = getItem(i12);
        com.avito.beduin.v2.theme.k kVar = this.f336117g;
        InterfaceC36249i interfaceC36249i = item.f336204a;
        A a12 = this.f336115e;
        c10419b.f336126c.g(kVar, interfaceC36249i, a12.f337907c, null, null, a12);
        View view = c10419b.f336125b;
        Resources resources = view.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        int i13 = this.f336119i;
        ET0.b bVar = item.f336205b.f336208c;
        marginLayoutParams.setMargins(ET0.d.c(resources, bVar != null ? bVar.f4016a : 0) + i13, ET0.d.c(resources, bVar != null ? bVar.f4019d : 0) + this.f336121k, ET0.d.c(resources, bVar != null ? bVar.f4017b : 0) + this.f336120j, ET0.d.c(resources, bVar != null ? bVar.f4018c : 0) + this.f336122l);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null && marginLayoutParams2.width == marginLayoutParams.width && marginLayoutParams2.height == marginLayoutParams.height && marginLayoutParams2.leftMargin == marginLayoutParams.leftMargin && marginLayoutParams2.topMargin == marginLayoutParams.topMargin && marginLayoutParams2.rightMargin == marginLayoutParams.rightMargin && marginLayoutParams2.bottomMargin == marginLayoutParams.bottomMargin) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        InterfaceC36249i interfaceC36249i = getItem(((Number) this.f336118h.get(Integer.valueOf(i12))).intValue()).f336204a;
        String f336566c = interfaceC36249i.getF336566c();
        A a12 = this.f336115e;
        InterfaceC36343m interfaceC36343mB = a12.a(f336566c).b(a12);
        View viewF = interfaceC36343mB.f(viewGroup, this.f336117g, interfaceC36249i, a12.f337907c, null, null, a12);
        viewF.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new C10419b(viewF, interfaceC36343mB, null, 4, null);
    }
}
