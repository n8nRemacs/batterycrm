package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.d;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileLazyColumnComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/g;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends AbstractC36333c<l, RecyclerView> {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f151373B = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f151374A;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A f151375m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.konveyor.a> f151376n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final f f151377o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Y41.a<GridLayoutManager> f151378p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f151379q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final H f151380r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public v f151381s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final j f151382t;

    /* renamed from: u, reason: collision with root package name */
    public d f151383u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public List<? extends t> f151384v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public Object f151385w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f151386x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public l f151387y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f151388z;

    /* compiled from: ExtendedProfileLazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/g$a;", "", "<init>", "()V", "", "CHILDREN_STATE_KEY", "Ljava/lang/String;", "SCROLL_STATE_KEY", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k A a12, @Y61.k Y41.a<com.avito.konveyor.a> aVar, @Y61.k f fVar, @Y61.k C23424o.f<TV0.a> fVar2, @Y61.k Y41.a<? extends GridLayoutManager> aVar2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Y41.l<? super RecyclerView, G0> lVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f151375m = a12;
        this.f151376n = aVar;
        this.f151377o = fVar;
        this.f151378p = aVar2;
        this.f151379q = screenPerformanceTracker;
        this.f151380r = (H) lVar;
        this.f151382t = new j(fVar2);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f151384v = c42784z0;
        this.f151385w = c42784z0;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, l lVar) {
        RecyclerView recyclerView = (RecyclerView) view;
        l lVar2 = lVar;
        this.f151387y = lVar2;
        this.f151388z = kVar;
        if (this.f151386x) {
            u(null);
        }
        M.a(recyclerView, lVar2.f151404d);
        recyclerView.setBackgroundColor(t(lVar2.f151402b));
        if (!this.f151374A) {
            this.f151379q.b(recyclerView);
            this.f151374A = true;
        }
        this.f151377o.b();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        this.f151383u = new d(this, this.f151375m, this.f151382t, this.f151376n.invoke());
        GridLayoutManager gridLayoutManagerInvoke = this.f151378p.invoke();
        this.f151381s = new v(new h(gridLayoutManagerInvoke));
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        gridLayoutManagerInvoke.f53667M = this.f151381s;
        recyclerView.setLayoutManager(gridLayoutManagerInvoke);
        d dVar = this.f151383u;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
        ?? r52 = this.f151380r;
        if (r52 != 0) {
            r52.invoke(recyclerView);
        }
        return recyclerView;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void q(View view, Bundle bundle) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = (RecyclerView) view;
        Parcelable parcelable = bundle.getParcelable("scroll_state");
        if (parcelable != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.X0(parcelable);
        }
        Bundle bundle2 = bundle.getBundle("children_state");
        if (bundle2 != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            d dVar = adapter instanceof d ? (d) adapter : null;
            if (dVar != null) {
                dVar.f151361i.f151369a.putAll(bundle2);
            }
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final Bundle r(View view) {
        Parcelable parcelableY0;
        RecyclerView recyclerView = (RecyclerView) view;
        Bundle bundle = new Bundle();
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (parcelableY0 = layoutManager.Y0()) != null) {
            bundle.putParcelable("scroll_state", parcelableY0);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar != null) {
            RecyclerView recyclerView2 = dVar.f151362j;
            d.b bVar = dVar.f151361i;
            if (recyclerView2 != null) {
                int childCount = recyclerView2.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    RecyclerView.C cW2 = recyclerView2.W(recyclerView2.getChildAt(i12));
                    d.a aVar = cW2 instanceof d.a ? (d.a) cW2 : null;
                    if (aVar != null) {
                        Bundle bundleE = aVar.f151367c.e();
                        if (bundleE == null) {
                            bVar.getClass();
                        } else {
                            bVar.f151369a.putAll(bundleE);
                        }
                    }
                }
            }
            bVar.getClass();
            Bundle bundle2 = bVar.f151369a;
            Bundle bundle3 = new Bundle(bundle2.size());
            bundle3.putAll(bundle2);
            bundle.putBundle("children_state", bundle3);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public final void u(Runnable runnable) {
        ?? SingletonList;
        Object next;
        com.avito.beduin.v2.theme.k kVar = this.f151388z;
        l lVar = this.f151387y;
        if (kVar == null || lVar == null) {
            return;
        }
        ArrayList arrayList = lVar.f151401a.f4014b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f151385w = arrayList2;
                d dVar = this.f151383u;
                final d dVar2 = dVar != null ? dVar : null;
                final Me.m mVar = new Me.m((Object) runnable, (Object) this, arrayList2, 18);
                dVar2.f151363k = kVar;
                j jVar = dVar2.f151359g;
                jVar.f151400c = jVar.f151399b;
                jVar.f151399b = kVar;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a) it3.next()).getId());
                }
                LinkedHashSet linkedHashSet = dVar2.f151361i.f151370b;
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList4);
                dVar2.l(arrayList2, new Runnable() { // from class: com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.c
                    @Override // java.lang.Runnable
                    public final void run() throws Resources.NotFoundException {
                        mVar.run();
                        d dVar3 = dVar2;
                        dVar3.f151357e.j();
                        dVar3.f151361i.finalize();
                    }
                });
                return;
            }
            l.a aVar = (l.a) it.next();
            Object state = aVar.f151409a.getState();
            OT0.a aVar2 = state instanceof OT0.a ? (OT0.a) state : null;
            Object state2 = aVar2 != null ? aVar2.f12282c.getState() : null;
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d dVar3 = state2 instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d ? (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d) state2 : null;
            String str = dVar3 != null ? dVar3.f151428a : null;
            if ((dVar3 != null ? dVar3.f151428a : null) != null) {
                Iterator it4 = this.f151384v.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (L.f(((t) next).getF230364a(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                t tVar = (t) next;
                List<QH.a> items = tVar != null ? tVar.getItems() : null;
                if (items == null) {
                    items = C42784z0.f406748b;
                }
                List<QH.a> list = items;
                SingletonList = new ArrayList(C42745f0.q(list, 10));
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    QH.a aVar3 = (QH.a) obj;
                    ET0.b bVar = dVar3.f151429b;
                    Integer numValueOf = bVar != null ? Integer.valueOf(y6.d(bVar.f4019d)) : null;
                    if (i12 != 0) {
                        numValueOf = null;
                    }
                    ET0.b bVar2 = dVar3.f151429b;
                    Integer numValueOf2 = bVar2 != null ? Integer.valueOf(y6.d(bVar2.f4018c)) : null;
                    if (i12 != items.size() - 1) {
                        numValueOf2 = null;
                    }
                    SingletonList.add(new u(aVar3, new u.a(numValueOf, numValueOf2)));
                    i12 = i13;
                }
            } else {
                SingletonList = Collections.singletonList(new com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.a(aVar));
            }
            C42745f0.h((Iterable) SingletonList, arrayList2);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void o() {
    }
}
