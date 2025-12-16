package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.m;
import com.avito.android.beduin.common.component.n;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.common.component.adapter.g;
import com.avito.android.util.D6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinLoadMoreComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/load_more/BeduinLoadMoreModel;", "Lcom/avito/android/beduin/common/component/load_more/d;", "Lcom/avito/android/beduin_shared/common/component/adapter/g;", "Lcom/avito/android/beduin/common/component/n;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinLoadMoreModel, d> implements g, n {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C3049a f101712i = new C3049a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final List<String> f101713j = Collections.singletonList("loadMore");

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final Class<BeduinLoadMoreModel> f101714k = BeduinLoadMoreModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinLoadMoreModel f101715e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f101716f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f101717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f101718h = new m();

    /* compiled from: BeduinLoadMoreComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.load_more.a$a, reason: collision with other inner class name */
    public static final class C3049a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3049a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinLoadMoreModel> S() {
            return a.f101714k;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f101713j;
        }

        public C3049a() {
        }
    }

    /* compiled from: BeduinLoadMoreComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/a$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f101719a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f101720b;

        public b(boolean z12, boolean z13) {
            this.f101719a = z12;
            this.f101720b = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f101719a == bVar.f101719a && this.f101720b == bVar.f101720b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101720b) + (Boolean.hashCode(this.f101719a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadMorePayload(isLoading=");
            sb2.append(this.f101719a);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f101720b, ')');
        }
    }

    public a(@k BeduinLoadMoreModel beduinLoadMoreModel, @k e eVar, @k lj.e eVar2) {
        this.f101715e = beduinLoadMoreModel;
        this.f101716f = eVar;
        this.f101717g = eVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101715e;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void c(@k RecyclerView.C c12) {
        this.f101718h.getClass();
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void d(@k RecyclerView.C c12) {
        this.f101718h.getClass();
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void e(@k RecyclerView.C c12) {
        BeduinLoadMoreModel beduinLoadMoreModel = this.f101715e;
        if (beduinLoadMoreModel.isLoading() || !beduinLoadMoreModel.isEnabled()) {
            return;
        }
        this.f101716f.a(beduinLoadMoreModel.getNextPageRequest());
    }

    @Override // com.avito.android.beduin.common.component.n
    public final void h() {
        BeduinLoadMoreModel beduinLoadMoreModel = this.f101715e;
        if (beduinLoadMoreModel.isLoading() || !beduinLoadMoreModel.isEnabled()) {
            return;
        }
        this.f101716f.a(beduinLoadMoreModel.getNextPageRequest());
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(viewGroup);
        layoutParams.width = -1;
        layoutParams.height = -2;
        ViewGroup viewGroup2 = dVar.f101725d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup2.getLayoutParams());
        layoutParams2.gravity = 17;
        dVar.f101724c.setLayoutParams(layoutParams2);
        viewGroup2.setLayoutParams(layoutParams);
        return dVar;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinLoadMoreModel beduinLoadMoreModel = (BeduinLoadMoreModel) beduinModel;
        if (!beduinLoadMoreModel.isEnabled()) {
            e eVar = this.f101716f;
            if (eVar.f101733h.g() > 0) {
                eVar.b();
            }
        }
        return new b(beduinLoadMoreModel.isLoading(), beduinLoadMoreModel.isEnabled());
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) throws Resources.NotFoundException {
        d dVar = (d) interfaceC40116e;
        ViewGroup viewGroup = dVar.f101725d;
        Context context = viewGroup.getContext();
        BeduinLoadMoreModel beduinLoadMoreModel = this.f101715e;
        dVar.f101724c.setAppearance(com.avito.android.lib.util.f.l(context, beduinLoadMoreModel.getSpinner().getStyle()));
        viewGroup.setPadding(0, beduinLoadMoreModel.getSpinner().getPadding().getTop(), 0, beduinLoadMoreModel.getSpinner().getPadding().getBottom());
        String f103350r = this.f101717g.getF103350r();
        e eVar = this.f101716f;
        eVar.f101731f = f103350r;
        eVar.f101732g = beduinLoadMoreModel;
        D6.G(viewGroup, beduinLoadMoreModel.isEnabled());
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        d dVar = (d) interfaceC40116e;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((b) it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            boolean z12 = bVar.f101719a;
            ViewGroup viewGroup = dVar.f101725d;
            if (!z12 || !bVar.f101720b) {
                viewGroup.setVisibility(8);
            } else if (!D6.y(viewGroup)) {
                viewGroup.setVisibility(0);
                this.f101716f.a(this.f101715e.getNextPageRequest());
            }
        }
    }
}
