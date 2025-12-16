package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.lazy.e;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LazyComponentAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/d;", "Lcom/avito/beduin/v2/engine/component/d;", "C", "Lcom/avito/beduin/v2/component/common/lazy/e;", "VH", "Landroidx/recyclerview/widget/B;", "a", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d<C extends InterfaceC36244d, VH extends e> extends B<C, VH> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b<?, ?> f335686e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f335687f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public RecyclerView f335688g;

    /* compiled from: LazyComponentAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/d$a;", "", "<init>", "()V", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bundle f335689a = new Bundle();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashSet f335690b = new LinkedHashSet();

        public final void finalize() {
            Bundle bundle = new Bundle();
            Iterator it = this.f335690b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Bundle bundle2 = this.f335689a;
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

    public d(@k b bVar, @k g gVar) {
        super(gVar);
        this.f335686e = bVar;
        this.f335687f = new a();
    }

    @Override // androidx.recyclerview.widget.B
    public final void l(@l List<? extends C> list, @l Runnable runnable) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (list != null) {
            List<? extends C> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC36244d) it.next()).getF335853a().getF336564a());
            }
        } else {
            arrayList = null;
        }
        LinkedHashSet linkedHashSet = this.f335687f.f335690b;
        linkedHashSet.clear();
        RandomAccess randomAccess = arrayList;
        if (arrayList == null) {
            randomAccess = C42784z0.f406748b;
        }
        linkedHashSet.addAll((Collection) randomAccess);
        if (list != null) {
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((InterfaceC36244d) obj).a()) {
                    arrayList2.add(obj);
                }
            }
        }
        super.l(arrayList2, new c(this, 0));
    }

    @Override // androidx.recyclerview.widget.B
    public final void m(@l List<? extends C> list) {
        l(list, null);
    }

    @l
    public final Bundle n(@k String str) {
        Bundle bundle = this.f335687f.f335689a.getBundle(str);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(1);
        bundle2.putBundle(str, bundle);
        return bundle2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@k RecyclerView recyclerView) {
        this.f335688g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        Bundle bundleE;
        e eVar = (e) c12;
        String strB80 = eVar.B80();
        a aVar = this.f335687f;
        if (strB80 == null) {
            aVar.getClass();
        } else {
            if (!aVar.f335690b.contains(strB80) || (bundleE = eVar.f335692c.e()) == null) {
                return;
            }
            aVar.f335689a.putAll(bundleE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        ((e) c12).f335692c.b();
    }
}
