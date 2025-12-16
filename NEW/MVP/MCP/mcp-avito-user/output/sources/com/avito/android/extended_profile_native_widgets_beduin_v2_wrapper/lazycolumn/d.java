package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C36336f;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.avito.konveyor.exception.ViewTypeCollisionException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileLazyColumnAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/d;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/k;", "Lcom/avito/konveyor/adapter/b;", "a", "b", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends B<k, com.avito.konveyor.adapter.b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g f151357e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A f151358f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final j f151359g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f151360h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final b f151361i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public RecyclerView f151362j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f151363k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f151364l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f151365m;

    /* compiled from: ExtendedProfileLazyColumnAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/d$a;", "Lcom/avito/konveyor/adapter/b;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.konveyor.adapter.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f151366b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36343m f151367c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public l.a f151368d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, InterfaceC36343m interfaceC36343m, l.a aVar, int i12, C42822w c42822w) {
            super(view);
            aVar = (i12 & 4) != 0 ? null : aVar;
            this.f151366b = view;
            this.f151367c = interfaceC36343m;
            this.f151368d = aVar;
        }
    }

    /* compiled from: ExtendedProfileLazyColumnAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/d$b;", "", "<init>", "()V", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Bundle f151369a = new Bundle();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f151370b = new LinkedHashSet();

        public final void finalize() {
            Bundle bundle = new Bundle();
            Iterator it = this.f151370b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Bundle bundle2 = this.f151369a;
                if (!zHasNext) {
                    bundle2.clear();
                    bundle2.putAll(bundle);
                    return;
                } else {
                    String str = (String) it.next();
                    Bundle bundle3 = bundle2.getBundle(str);
                    if (bundle3 != null) {
                        bundle.putBundle(str, bundle3);
                    }
                }
            }
        }
    }

    public d(@Y61.k g gVar, @Y61.k A a12, @Y61.k j jVar, @Y61.k com.avito.konveyor.a aVar) {
        super(jVar);
        this.f151357e = gVar;
        this.f151358f = a12;
        this.f151359g = jVar;
        this.f151360h = aVar;
        this.f151361i = new b();
        this.f151364l = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) throws ItemNotSupportedException, ViewTypeCollisionException {
        int iO2;
        k item = getItem(i12);
        if (item instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) {
            iO2 = ((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) item).f151353a.f151409a.m().hashCode();
        } else {
            if (!(item instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            iO2 = this.f151360h.O(((u) item).f151421a);
        }
        this.f151364l.put(Integer.valueOf(iO2), item);
        return iO2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        this.f151362j = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) throws ItemNotSupportedException {
        Bundle bundle;
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        k item = getItem(i12);
        if (!(item instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a)) {
            if (item instanceof u) {
                this.f151360h.O5(bVar, ((u) item).f151421a, i12);
                return;
            }
            return;
        }
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            com.avito.beduin.v2.theme.k kVar = this.f151363k;
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a aVar2 = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) item;
            l.a aVar3 = aVar2.f151353a;
            C36336f c36336f = this.f151358f.f337907c;
            InterfaceC36249i interfaceC36249i = aVar3.f151409a;
            String id2 = interfaceC36249i.getId();
            Bundle bundle2 = this.f151361i.f151369a.getBundle(id2);
            if (bundle2 != null) {
                bundle = new Bundle(1);
                bundle.putBundle(id2, bundle2);
            } else {
                bundle = null;
            }
            aVar.f151367c.g(kVar, interfaceC36249i, c36336f, bundle, null, this.f151358f);
            l.a aVar4 = aVar.f151368d;
            l.a.C4426a c4426a = aVar4 != null ? aVar4.f151410b : null;
            l.a aVar5 = aVar2.f151353a;
            l.a.C4426a c4426a2 = aVar5.f151410b;
            if (!L.f(c4426a, c4426a2)) {
                View view = aVar.f151366b;
                view.setLayoutParams(ET0.d.a(c4426a2.f151411a, c4426a2.f151412b, c4426a2.f151413c, view.getResources()));
            }
            aVar.f151368d = aVar5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        k kVar = (k) this.f151364l.get(Integer.valueOf(i12));
        if (!(kVar instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a)) {
            if (!(kVar instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            com.avito.konveyor.adapter.b bVarK = this.f151360h.k(viewGroup, i12, new e(this, viewGroup));
            if (bVarK == null) {
                bVarK = new com.avito.konveyor.adapter.c(viewGroup);
            }
            return bVarK;
        }
        l.a aVar = ((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) kVar).f151353a;
        String strM = aVar.f151409a.m();
        A a12 = this.f151358f;
        InterfaceC36343m interfaceC36343mB = a12.a(strM).b(a12);
        View viewF = interfaceC36343mB.f(viewGroup, this.f151363k, aVar.f151409a, a12.f337907c, null, null, a12);
        viewF.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new a(viewF, interfaceC36343mB, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        Bundle bundleE;
        InterfaceC36249i interfaceC36249i;
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            l.a aVar2 = aVar.f151368d;
            String id2 = (aVar2 == null || (interfaceC36249i = aVar2.f151409a) == null) ? null : interfaceC36249i.getId();
            b bVar2 = this.f151361i;
            if (id2 == null) {
                bVar2.getClass();
            } else {
                if (!bVar2.f151370b.contains(id2) || (bundleE = aVar.f151367c.e()) == null) {
                    return;
                }
                bVar2.f151369a.putAll(bundleE);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        if (bVar instanceof a) {
            ((a) bVar).f151367c.b();
        }
        bVar.j5();
    }
}
